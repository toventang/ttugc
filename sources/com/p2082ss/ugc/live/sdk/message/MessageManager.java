package com.p2082ss.ugc.live.sdk.message;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.live.sdk.message.data.Configuration;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import com.p2082ss.ugc.live.sdk.message.data.JsonApiResult;
import com.p2082ss.ugc.live.sdk.message.data.ProtoApiResult;
import com.p2082ss.ugc.live.sdk.message.interceptor.DeduplicateInterceptor;
import com.p2082ss.ugc.live.sdk.message.interfaces.IInterceptor;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageClient;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageConverter;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p2082ss.ugc.live.sdk.message.interfaces.OnInterceptListener;
import com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.ugc.live.sdk.message.MessageManager */
public class MessageManager extends HandlerThread implements IMessageManager {
    private final DeduplicateInterceptor deduplicateInterceptor;
    public volatile boolean isFetching;
    private final long[] mApiCallDelayTimeList;
    private int mApiCallDelayTimeListIndex;
    private long mApiCallStartTime;
    public volatile long mApiCallTimeStamp;
    public volatile String mCursor;
    private volatile boolean mEnablePriority;
    private volatile boolean mEnableSmoothlyDispatch;
    public int mFetchFailedCount;
    public volatile long mFetchInterval;
    private final List<OnInterceptListener> mInterceptListeners;
    private final List<IInterceptor> mInterceptors;
    public volatile boolean mIsAnchor;
    public volatile Handler mMainThreadHandler;
    private IMessageClient mMessageClient;
    private IMessageClient.Callback mMessageClientCallback;
    public IMessageConverter mMessageConverter;
    private final SparseArray<Set<OnMessageListener>> mMessageListenerMap;
    private final List<IMessage> mMessageQueue = new ArrayList();
    public final List<Long> mMonitorMessageIds;
    private volatile boolean mNeedEnqueueMessage;
    private volatile int mNextTimeDispatchSize;
    public volatile Handler mSelfThreadHandler;
    public volatile int mState;

    static {
        Covode.recordClassIndex(102842);
    }

    /* renamed from: com_ss_ugc_live_sdk_message_MessageManager_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m150807x3e27a9db(String str, String str2) {
        return 0;
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager
    public void refresh(Configuration configuration) {
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager
    public void reset() {
    }

    /* access modifiers changed from: protected */
    public void onLooperPrepared() {
        this.mSelfThreadHandler = new Handler(getLooper()) {
            /* class com.p2082ss.ugc.live.sdk.message.MessageManager.HandlerC870713 */

            static {
                Covode.recordClassIndex(102845);
            }

            public void handleMessage(Message message) {
                MessageManager.this.handleSelfThreadMessage(message);
            }
        };
        this.mSelfThreadHandler.sendEmptyMessage(101);
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager
    public void startMessage() {
        if (getLooper() == null) {
            this.mState = 1;
            start();
        } else if (this.mSelfThreadHandler != null) {
            this.mSelfThreadHandler.sendEmptyMessage(101);
        }
    }

    private long getApiCallMaxTime() {
        long[] jArr = this.mApiCallDelayTimeList;
        long j = 0;
        for (long j2 : jArr) {
            if (j2 > j) {
                j = j2;
            }
        }
        m150807x3e27a9db("LiveMessageManager", "maxTime: ".concat(String.valueOf(j)));
        if (j > 0) {
            return j;
        }
        return 200;
    }

    private void calculateNextTimeDispatchCount() {
        if (this.mEnableSmoothlyDispatch) {
            int size = this.mMessageQueue.size();
            m150807x3e27a9db("LiveMessageManager", "message queue size is: " + this.mMessageQueue.size());
            long apiCallMaxTime = this.mFetchInterval + getApiCallMaxTime();
            if (apiCallMaxTime < 200) {
                apiCallMaxTime = 200;
            }
            int i = (int) ((apiCallMaxTime + 100) / 200);
            m150807x3e27a9db("LiveMessageManager", "expect dispatch count: ".concat(String.valueOf(i)));
            if (size / i > 0) {
                this.mNextTimeDispatchSize = (size + (i / 2)) / i;
            } else {
                this.mNextTimeDispatchSize = 1;
            }
            m150807x3e27a9db("LiveMessageManager", "next time dispatch size: " + this.mNextTimeDispatchSize);
            return;
        }
        this.mNextTimeDispatchSize = 1;
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager
    public void release() {
        this.mState = 4;
        if (getLooper() != null) {
            if (this.mSelfThreadHandler != null) {
                this.mSelfThreadHandler.removeCallbacksAndMessages(null);
            }
            if (this.mMainThreadHandler != null) {
                this.mMainThreadHandler.removeCallbacksAndMessages(null);
            }
            quit();
        }
        IMessageClient iMessageClient = this.mMessageClient;
        if (iMessageClient != null) {
            iMessageClient.disconnectFromWebSocket();
            this.mMessageClient.onRelease();
            this.mMessageClient.setCallback(null);
        }
        this.mMonitorMessageIds.clear();
        this.mMessageQueue.clear();
        this.mInterceptListeners.clear();
        this.mInterceptors.clear();
        this.mMessageListenerMap.clear();
    }

    private void fetchMessage() {
        if (!(this.mMessageClient == null || this.isFetching)) {
            HashMap hashMap = new HashMap();
            hashMap.put("cursor", this.mCursor);
            hashMap.put("user_id", String.valueOf(this.mMessageClient.getUserId()));
            if (this.mIsAnchor) {
                if (this.mApiCallTimeStamp > 0) {
                    hashMap.put("fetch_time", String.valueOf(this.mApiCallTimeStamp));
                }
                if (this.mMonitorMessageIds.size() > 0) {
                    int size = this.mMonitorMessageIds.size();
                    StringBuilder sb = new StringBuilder(size * 20);
                    sb.append(this.mMonitorMessageIds.get(0));
                    for (int i = 1; i < size; i++) {
                        sb.append(",");
                        sb.append(this.mMonitorMessageIds.get(i));
                    }
                    hashMap.put("ack_ids", sb.toString());
                    this.mMonitorMessageIds.clear();
                }
            }
            m150807x3e27a9db("LiveMessageManager", "call api");
            this.mApiCallStartTime = System.currentTimeMillis();
            this.isFetching = true;
            this.mMessageClient.apiCall(hashMap);
        }
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager
    public void addInterceptor(IInterceptor iInterceptor) {
        this.mInterceptors.add(iInterceptor);
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager
    public void addOnInterceptListener(OnInterceptListener onInterceptListener) {
        this.mInterceptListeners.add(onInterceptListener);
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager
    public void insertMessage(IMessage iMessage) {
        insertMessage(iMessage, false);
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager
    public void removeInterceptor(IInterceptor iInterceptor) {
        this.mInterceptors.remove(iInterceptor);
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager
    public void removeOnInterceptListener(OnInterceptListener onInterceptListener) {
        this.mInterceptListeners.remove(onInterceptListener);
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager
    public void stopMessage(boolean z) {
        int i;
        if (getLooper() != null && this.mSelfThreadHandler != null) {
            Handler handler = this.mSelfThreadHandler;
            if (z) {
                i = 104;
            } else {
                i = 102;
            }
            handler.sendEmptyMessage(i);
        }
    }

    private void dispatchMessage(IMessage iMessage) {
        Set<OnMessageListener> set = this.mMessageListenerMap.get(iMessage.getIntType());
        if (!(set == null || set.isEmpty())) {
            for (OnMessageListener onMessageListener : set) {
                onMessageListener.onMessage(iMessage);
            }
        }
    }

    private void enqueueMessage(IMessage iMessage) {
        if (this.mEnablePriority) {
            int size = this.mMessageQueue.size();
            for (int i = 0; i < size; i++) {
                if (iMessage.getPriority() >= this.mMessageQueue.get(i).getPriority()) {
                    this.mMessageQueue.add(i, iMessage);
                    return;
                }
            }
            this.mMessageQueue.add(iMessage);
            return;
        }
        this.mMessageQueue.add(iMessage);
    }

    private void onMessage(IMessage iMessage) {
        for (IInterceptor iInterceptor : this.mInterceptors) {
            if (iInterceptor.onMessage(iMessage)) {
                for (OnInterceptListener onInterceptListener : this.mInterceptListeners) {
                    onInterceptListener.onIntercept(iMessage);
                }
                return;
            }
        }
        dispatchMessage(iMessage);
    }

    private void scheduleNextDispatch(boolean z) {
        if (this.mState == 2 && this.mMainThreadHandler != null && !this.mMainThreadHandler.hasMessages(205)) {
            if (!this.mEnableSmoothlyDispatch || !z) {
                this.mMainThreadHandler.sendEmptyMessage(205);
            } else {
                this.mMainThreadHandler.sendEmptyMessageDelayed(205, 200);
            }
        }
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager
    public void removeMessageListener(OnMessageListener onMessageListener) {
        if (onMessageListener != null) {
            int size = this.mMessageListenerMap.size();
            for (int i = 0; i < size; i++) {
                Set<OnMessageListener> valueAt = this.mMessageListenerMap.valueAt(i);
                if (valueAt != null) {
                    valueAt.remove(onMessageListener);
                }
            }
        }
    }

    public void handleSelfThreadMessage(Message message) {
        IMessageClient iMessageClient;
        switch (message.what) {
            case 101:
                if (this.mState != 2) {
                    m150807x3e27a9db("LiveMessageManager", "start message manager");
                    IMessageClient iMessageClient2 = this.mMessageClient;
                    if (iMessageClient2 != null) {
                        iMessageClient2.connectToWebSocket();
                    }
                    this.mState = 2;
                    fetchMessage();
                    return;
                }
                return;
            case 102:
            case 104:
                m150807x3e27a9db("LiveMessageManager", "stop message manager");
                this.mSelfThreadHandler.removeMessages(103);
                this.mMainThreadHandler.removeCallbacksAndMessages(null);
                if (this.mState == 2 && (iMessageClient = this.mMessageClient) != null) {
                    iMessageClient.disconnectFromWebSocket();
                }
                if (message.what == 104) {
                    this.mCursor = "0";
                    this.deduplicateInterceptor.clear();
                }
                this.mState = 3;
                return;
            case 103:
                if (this.mState == 2) {
                    fetchMessage();
                    return;
                }
                return;
            default:
                return;
        }
    }

    MessageManager(Configuration configuration) {
        super("LiveMessageManager");
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.mInterceptors = copyOnWriteArrayList;
        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
        this.mInterceptListeners = copyOnWriteArrayList2;
        this.mMonitorMessageIds = new ArrayList();
        this.mMessageListenerMap = new SparseArray<>();
        DeduplicateInterceptor deduplicateInterceptor2 = new DeduplicateInterceptor(512);
        this.deduplicateInterceptor = deduplicateInterceptor2;
        this.mApiCallDelayTimeList = new long[5];
        boolean z = false;
        this.mApiCallDelayTimeListIndex = 0;
        this.mNextTimeDispatchSize = 1;
        this.mApiCallTimeStamp = 0;
        this.mCursor = "0";
        this.mMessageClientCallback = new IMessageClient.Callback() {
            /* class com.p2082ss.ugc.live.sdk.message.MessageManager.C870691 */

            static {
                Covode.recordClassIndex(102843);
            }

            /* renamed from: com_ss_ugc_live_sdk_message_MessageManager$1_com_ss_android_ugc_aweme_lancet_LogLancet_d */
            public static int m150808x1b059928(String str, String str2) {
                return 0;
            }

            /* renamed from: com_ss_ugc_live_sdk_message_MessageManager$1_com_ss_android_ugc_aweme_lancet_LogLancet_e */
            public static int m150809x1b059929(String str, String str2) {
                return 0;
            }

            @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IMessageClient.Callback
            public void onApiError(Exception exc) {
                long j;
                MessageManager.this.isFetching = false;
                if (MessageManager.this.mState == 2 && MessageManager.this.mSelfThreadHandler != null) {
                    MessageManager.this.mFetchFailedCount++;
                    if (MessageManager.this.mFetchFailedCount > 3) {
                        j = 5000;
                    } else {
                        j = (long) (MessageManager.this.mFetchFailedCount * 1000);
                    }
                    m150809x1b059929("LiveMessageManager", "onApiError: " + exc.toString() + ". failed count: " + MessageManager.this.mFetchFailedCount + ", retry after " + j);
                    MessageManager.this.mSelfThreadHandler.sendEmptyMessageDelayed(103, j);
                }
            }

            @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IMessageClient.Callback
            public void onApiSuccess(ProtoApiResult protoApiResult) {
                long size;
                MessageManager.this.isFetching = false;
                MessageManager.this.mFetchFailedCount = 0;
                if (MessageManager.this.mState == 2 && MessageManager.this.mMainThreadHandler != null) {
                    MessageManager.this.mCursor = protoApiResult.cursor;
                    MessageManager.this.mFetchInterval = protoApiResult.fetchInterval;
                    MessageManager.this.mApiCallTimeStamp = protoApiResult.now;
                    if (protoApiResult.messages == null) {
                        size = 0;
                    } else {
                        size = (long) protoApiResult.messages.size();
                    }
                    m150808x1b059928("LiveMessageManager", "onApiSuccess, cursor: " + MessageManager.this.mCursor + ", fetch_interval: " + MessageManager.this.mFetchInterval + ", timestamp: " + MessageManager.this.mApiCallTimeStamp + ", size: " + size);
                    dispatchMessage(protoApiResult.messages, protoApiResult.delayTimeBeforeDispatch);
                }
            }

            @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IMessageClient.Callback
            public void onWebSocketMessage(IMessage iMessage) {
                m150808x1b059928("LiveMessageManager", "receive web socket message");
                if (MessageManager.this.mState == 2 && iMessage != null && MessageManager.this.mMainThreadHandler != null) {
                    if (MessageManager.this.mIsAnchor && iMessage.needMonitor()) {
                        MessageManager.this.mMainThreadHandler.obtainMessage(204, Long.valueOf(iMessage.getMessageId())).sendToTarget();
                    }
                    MessageManager.this.mMainThreadHandler.obtainMessage(202, iMessage).sendToTarget();
                }
            }

            @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IMessageClient.Callback
            public void onApiSuccess(JsonApiResult jsonApiResult) {
                MessageManager.this.isFetching = false;
                MessageManager.this.mFetchFailedCount = 0;
                if (MessageManager.this.mState == 2 && MessageManager.this.mMainThreadHandler != null) {
                    JSONObject jSONObject = jsonApiResult.extra;
                    MessageManager.this.mCursor = jSONObject.optString("cursor");
                    MessageManager.this.mFetchInterval = jSONObject.optLong("fetch_interval");
                    MessageManager.this.mApiCallTimeStamp = jSONObject.optLong("now");
                    JSONArray jSONArray = jsonApiResult.data;
                    int length = jSONArray.length();
                    ArrayList arrayList = new ArrayList(length);
                    for (int i = 0; i < length; i++) {
                        try {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                            JSONObject optJSONObject = jSONObject2.optJSONObject("common");
                            if (optJSONObject != null) {
                                IMessage convert = MessageManager.this.mMessageConverter.convert(optJSONObject.optString("method"), jSONObject2.toString(), MessageManager.this.mApiCallTimeStamp);
                                if (convert != null) {
                                    arrayList.add(convert);
                                }
                            }
                        } catch (JSONException e) {
                            m150809x1b059929("LiveMessageManager", e.toString());
                        }
                    }
                    m150808x1b059928("LiveMessageManager", "onApiSuccess, cursor: " + MessageManager.this.mCursor + ", fetch_interval: " + MessageManager.this.mFetchInterval + ", timestamp: " + MessageManager.this.mApiCallTimeStamp + ", size: " + arrayList.size());
                    dispatchMessage(arrayList, jsonApiResult.delayTimeBeforeDispatch);
                }
            }

            private void dispatchMessage(List<IMessage> list, long j) {
                long j2;
                if (list != null && !list.isEmpty()) {
                    if (MessageManager.this.mIsAnchor) {
                        ArrayList arrayList = new ArrayList();
                        for (IMessage iMessage : list) {
                            if (iMessage.needMonitor()) {
                                MessageManager.this.mMonitorMessageIds.add(Long.valueOf(iMessage.getMessageId()));
                            }
                        }
                        MessageManager.this.mMainThreadHandler.obtainMessage(203, arrayList).sendToTarget();
                    }
                    MessageManager.this.mMainThreadHandler.sendMessageDelayed(MessageManager.this.mMainThreadHandler.obtainMessage(201, list), j);
                }
                if (MessageManager.this.mSelfThreadHandler != null) {
                    if (MessageManager.this.mFetchInterval > 0) {
                        j2 = MessageManager.this.mFetchInterval;
                    } else {
                        j2 = 1000;
                    }
                    m150808x1b059928("LiveMessageManager", "call api after ".concat(String.valueOf(j2)));
                    MessageManager.this.mSelfThreadHandler.sendEmptyMessageDelayed(103, j2);
                }
            }
        };
        this.mMainThreadHandler = new Handler(Looper.getMainLooper()) {
            /* class com.p2082ss.ugc.live.sdk.message.MessageManager.HandlerC870702 */

            static {
                Covode.recordClassIndex(102844);
            }

            public void handleMessage(Message message) {
                MessageManager.this.handleMainThreadMessage(message);
            }
        };
        this.mMessageConverter = configuration.getMessageConverter();
        copyOnWriteArrayList.add(deduplicateInterceptor2);
        copyOnWriteArrayList.addAll(configuration.getInterceptors());
        copyOnWriteArrayList2.addAll(configuration.getInterceptListeners());
        IMessageClient httpClient = configuration.getHttpClient();
        this.mMessageClient = httpClient;
        if (httpClient != null) {
            httpClient.setCallback(this.mMessageClientCallback);
        }
        this.mEnableSmoothlyDispatch = configuration.isEnableSmoothlyDispatch();
        this.mEnablePriority = configuration.isEnablePriority();
        this.mIsAnchor = configuration.isAnchor();
        m150807x3e27a9db("LiveMessageManager", "mEnableSmoothlyDispatch: " + this.mEnableSmoothlyDispatch);
        m150807x3e27a9db("LiveMessageManager", "mEnablePriority: " + this.mEnablePriority);
        this.mNeedEnqueueMessage = (this.mEnableSmoothlyDispatch || this.mEnablePriority) ? true : z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: java.util.List<java.lang.Long> */
    /* JADX WARN: Multi-variable type inference failed */
    public void handleMainThreadMessage(Message message) {
        switch (message.what) {
            case 201:
                if (this.mState == 2) {
                    List<IMessage> list = (List) message.obj;
                    m150807x3e27a9db("LiveMessageManager", "main thread receive message list, size is " + list.size());
                    if (!this.mNeedEnqueueMessage) {
                        m150807x3e27a9db("LiveMessageManager", "don't need enqueue message, directly dispatch messages");
                        for (IMessage iMessage : list) {
                            onMessage(iMessage);
                        }
                        return;
                    }
                    m150807x3e27a9db("LiveMessageManager", "add message list to message queue, size is " + list.size());
                    for (IMessage iMessage2 : list) {
                        enqueueMessage(iMessage2);
                    }
                    long currentTimeMillis = System.currentTimeMillis() - this.mApiCallStartTime;
                    if (currentTimeMillis > 0) {
                        long[] jArr = this.mApiCallDelayTimeList;
                        int i = this.mApiCallDelayTimeListIndex;
                        jArr[i] = currentTimeMillis;
                        int i2 = i + 1;
                        this.mApiCallDelayTimeListIndex = i2;
                        if (i2 > 4) {
                            this.mApiCallDelayTimeListIndex = 0;
                        }
                    }
                    calculateNextTimeDispatchCount();
                    scheduleNextDispatch(false);
                    return;
                }
                return;
            case 202:
                if (this.mState == 2) {
                    IMessage iMessage3 = (IMessage) message.obj;
                    m150807x3e27a9db("LiveMessageManager", "main thread receive single message");
                    if (!this.mNeedEnqueueMessage) {
                        m150807x3e27a9db("LiveMessageManager", "don't need enqueue message, directly dispatch message");
                        onMessage(iMessage3);
                        return;
                    }
                    m150807x3e27a9db("LiveMessageManager", "add single message to message queue");
                    enqueueMessage(iMessage3);
                    scheduleNextDispatch(false);
                    return;
                }
                return;
            case 203:
                this.mMonitorMessageIds.addAll((Collection) message.obj);
                return;
            case 204:
                this.mMonitorMessageIds.add(message.obj);
                return;
            case 205:
                if (this.mState == 2) {
                    int size = this.mMessageQueue.size();
                    m150807x3e27a9db("LiveMessageManager", "before dispatch, message queue size is " + this.mMessageQueue.size());
                    if (this.mEnableSmoothlyDispatch && size > this.mNextTimeDispatchSize) {
                        size = this.mNextTimeDispatchSize;
                    }
                    List<IMessage> subList = this.mMessageQueue.subList(0, size);
                    for (IMessage iMessage4 : subList) {
                        if (iMessage4 != null) {
                            onMessage(iMessage4);
                        }
                    }
                    subList.clear();
                    m150807x3e27a9db("LiveMessageManager", "after dispatch, message queue size is " + this.mMessageQueue.size());
                    if (this.mMessageQueue.size() > 0) {
                        scheduleNextDispatch(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager
    public void insertMessage(IMessage iMessage, boolean z) {
        if (iMessage != null) {
            if (z) {
                dispatchMessage(iMessage);
            } else {
                onMessage(iMessage);
            }
        }
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager
    public void addMessageListener(int i, OnMessageListener onMessageListener) {
        if (onMessageListener != null) {
            Set<OnMessageListener> set = this.mMessageListenerMap.get(i);
            if (set == null) {
                set = new CopyOnWriteArraySet<>();
                this.mMessageListenerMap.put(i, set);
            }
            set.add(onMessageListener);
        }
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager
    public void removeMessageListener(int i, OnMessageListener onMessageListener) {
        Set<OnMessageListener> set;
        if (onMessageListener != null && (set = this.mMessageListenerMap.get(i)) != null && !set.isEmpty()) {
            set.remove(onMessageListener);
        }
    }
}
