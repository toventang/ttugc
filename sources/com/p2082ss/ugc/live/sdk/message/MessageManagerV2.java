package com.p2082ss.ugc.live.sdk.message;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.live.sdk.message.MessageApiConstant;
import com.p2082ss.ugc.live.sdk.message.data.Configuration;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import com.p2082ss.ugc.live.sdk.message.data.JsonApiResult;
import com.p2082ss.ugc.live.sdk.message.data.PayloadItem;
import com.p2082ss.ugc.live.sdk.message.data.ProtoApiResult;
import com.p2082ss.ugc.live.sdk.message.interceptor.DeduplicateInterceptor;
import com.p2082ss.ugc.live.sdk.message.interfaces.IInterceptor;
import com.p2082ss.ugc.live.sdk.message.interfaces.ILogger;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageConverter;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManagerV2;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageWsClient;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMonitor;
import com.p2082ss.ugc.live.sdk.message.interfaces.OnInterceptListener;
import com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.p2082ss.ugc.live.sdk.msg.C87075a;
import com.p2082ss.ugc.live.sdk.msg.p4471b.AbstractC87079c;
import com.p2082ss.ugc.live.sdk.msg.p4471b.C87081e;
import com.p2082ss.ugc.live.sdk.msg.p4472c.C87087a;
import com.p2082ss.ugc.live.sdk.msg.p4472c.C87098d;
import com.p2082ss.ugc.live.sdk.msg.p4473d.C87104a;
import com.p2082ss.ugc.live.sdk.msg.p4473d.HandlerC87115h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.ugc.live.sdk.message.MessageManagerV2 */
public class MessageManagerV2 extends HandlerThread implements IMessageManagerV2 {
    private final DeduplicateInterceptor deduplicateInterceptor;
    public volatile boolean isFetching;
    private final long[] mApiCallDelayTimeList;
    private int mApiCallDelayTimeListIndex;
    public long mApiCallStartTime;
    public volatile long mApiCallTimeStamp;
    public volatile String mCursor;
    public volatile boolean mEnableAlongsideHttp;
    private volatile boolean mEnablePriority;
    private volatile boolean mEnableSmoothlyDispatch;
    public int mFetchFailedCount;
    public volatile long mFetchInterval;
    public volatile long mHeartbeatDurationInS;
    private long mHeartbeatPacketSendTime;
    private AtomicInteger mHeartbeatPacketSeqIdGenerator;
    private String mHeartbeatSendPacketSeqId;
    public ArrayList<String> mHostWsMessageAckList;
    private final List<OnInterceptListener> mInterceptListeners;
    private final List<IInterceptor> mInterceptors;
    public volatile boolean mIsAnchor;
    public boolean mIsEnhanceWS;
    private ILogger mLogger;
    public volatile Handler mMainThreadHandler;
    public IMessageWsClient mMessageClient;
    private IMessageWsClient.Callback mMessageClientCallback;
    private C87075a mMessageContext;
    public IMessageConverter mMessageConverter;
    private final SparseArray<Set<OnMessageListener>> mMessageListenerMap;
    private final List<IMessage> mMessageQueue = new ArrayList();
    public volatile MessageStrategy mMessageStrategy;
    private IMonitor mMonitor;
    public final List<Long> mMonitorMessageIds;
    private volatile boolean mNeedEnqueueMessage;
    private volatile int mNextTimeDispatchSize;
    public volatile Handler mSelfThreadHandler;
    public volatile int mState;
    public C87087a mUplinkClient;
    private volatile long mWaitWsConnectDuration;
    public int mWsConnectFailedCount;

    static {
        Covode.recordClassIndex(102847);
    }

    /* renamed from: com_ss_ugc_live_sdk_message_MessageManagerV2_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m150810xef0004b7(String str, String str2) {
        return 0;
    }

    private void clearMessageQueueInMain() {
        this.mMainThreadHandler.sendEmptyMessage(206);
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManagerV2
    public boolean isWsConnected() {
        IMessageWsClient iMessageWsClient = this.mMessageClient;
        if (iMessageWsClient == null || !iMessageWsClient.isWsConnected()) {
            return false;
        }
        return true;
    }

    public void cancelAlongsideHttp() {
        this.mEnableAlongsideHttp = false;
        if (this.mSelfThreadHandler != null && this.mSelfThreadHandler.hasMessages(113)) {
            this.mSelfThreadHandler.removeMessages(106);
        }
    }

    public void cancelFallbackTimer() {
        if (this.mSelfThreadHandler != null && this.mSelfThreadHandler.hasMessages(106)) {
            this.mSelfThreadHandler.removeMessages(106);
        }
    }

    public void cancelHeartbeatTimer() {
        if (this.mSelfThreadHandler != null && this.mSelfThreadHandler.hasMessages(110)) {
            this.mSelfThreadHandler.removeMessages(110);
        }
    }

    /* access modifiers changed from: protected */
    public void onLooperPrepared() {
        this.mSelfThreadHandler = new Handler(getLooper()) {
            /* class com.p2082ss.ugc.live.sdk.message.MessageManagerV2.HandlerC870743 */

            static {
                Covode.recordClassIndex(102850);
            }

            public void handleMessage(Message message) {
                MessageManagerV2.this.handleSelfThreadMessage(message);
            }
        };
        this.mSelfThreadHandler.sendEmptyMessage(101);
    }

    private long getApiCallMaxTime() {
        long[] jArr = this.mApiCallDelayTimeList;
        long j = 0;
        for (long j2 : jArr) {
            if (j2 > j) {
                j = j2;
            }
        }
        m150810xef0004b7("LiveMessageManager_WS", "maxTime: ".concat(String.valueOf(j)));
        if (j > 0) {
            return j;
        }
        return 200;
    }

    public void resetAndTriggerHeartbeatTimer() {
        if (this.mState == 2) {
            IMessageWsClient iMessageWsClient = this.mMessageClient;
            if ((iMessageWsClient == null || iMessageWsClient.isWsConnected()) && this.mSelfThreadHandler != null) {
                m150810xef0004b7("LiveMessageManager_WS", "trigger heartbeat timer");
                cancelHeartbeatTimer();
                this.mSelfThreadHandler.sendMessageDelayed(this.mSelfThreadHandler.obtainMessage(110), this.mHeartbeatDurationInS * 1000);
            }
        }
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager
    public void startMessage() {
        if (this.mState != 2 && this.mState != 1) {
            if (getLooper() == null) {
                this.mState = 1;
                start();
            } else if (this.mSelfThreadHandler != null) {
                this.mSelfThreadHandler.sendEmptyMessage(101);
            }
        }
    }

    public void wsAlongWithHttpFetch() {
        if (this.mState == 2) {
            IMessageWsClient iMessageWsClient = this.mMessageClient;
            if ((iMessageWsClient == null || !iMessageWsClient.isWsConnected()) && this.mSelfThreadHandler != null) {
                m150810xef0004b7("LiveMessageManager_WS", "trigger ws along with http");
                this.mSelfThreadHandler.sendMessage(this.mSelfThreadHandler.obtainMessage(113));
            }
        }
    }

    private void calculateNextTimeDispatchCount() {
        if (this.mEnableSmoothlyDispatch) {
            int size = this.mMessageQueue.size();
            m150810xef0004b7("LiveMessageManager_WS", "message queue size is: " + this.mMessageQueue.size());
            long apiCallMaxTime = this.mFetchInterval + getApiCallMaxTime();
            if (apiCallMaxTime < 200) {
                apiCallMaxTime = 200;
            }
            int i = (int) ((apiCallMaxTime + 100) / 200);
            m150810xef0004b7("LiveMessageManager_WS", "expect dispatch count: ".concat(String.valueOf(i)));
            if (size / i > 0) {
                this.mNextTimeDispatchSize = (size + (i / 2)) / i;
            } else {
                this.mNextTimeDispatchSize = 1;
            }
            m150810xef0004b7("LiveMessageManager_WS", "next time dispatch size: " + this.mNextTimeDispatchSize);
            return;
        }
        this.mNextTimeDispatchSize = 1;
    }

    private void determineMessageStrategy() {
        if (this.mMessageClient != null && !this.isFetching) {
            HashMap hashMap = new HashMap();
            hashMap.put("cursor", this.mCursor);
            hashMap.put("user_id", String.valueOf(this.mMessageClient.getUserId()));
            if (!this.mHostWsMessageAckList.isEmpty()) {
                hashMap.put("frontier_ack", TextUtils.join(",", this.mHostWsMessageAckList));
                this.mHostWsMessageAckList.clear();
            }
            m150810xef0004b7("LiveMessageManager_WS", "first call api, to determine message strategy");
            this.mApiCallStartTime = System.currentTimeMillis();
            this.isFetching = true;
            this.mMessageClient.determineMessageStrategy(hashMap);
        }
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager
    public void release() {
        HandlerC87115h hVar;
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
        IMessageWsClient iMessageWsClient = this.mMessageClient;
        if (iMessageWsClient != null) {
            iMessageWsClient.disconnectFromWebSocket("release");
            this.mMessageClient.onRelease();
            this.mMessageClient.setCallback(null);
        }
        this.mMonitorMessageIds.clear();
        this.mMessageQueue.clear();
        this.mInterceptListeners.clear();
        this.mInterceptors.clear();
        this.mMessageListenerMap.clear();
        C87087a aVar = this.mUplinkClient;
        C87104a.m150852a(aVar.f196332g, "uplink release");
        HandlerC87115h hVar2 = aVar.f196327b;
        if (hVar2 != null) {
            hVar2.removeCallbacksAndMessages(null);
        }
        HandlerC87115h hVar3 = aVar.f196328c;
        if (hVar3 != null) {
            hVar3.removeCallbacksAndMessages(null);
        }
        HandlerC87115h hVar4 = aVar.f196329d;
        if (hVar4 != null) {
            hVar4.removeCallbacksAndMessages(null);
        }
        HandlerThread handlerThread = aVar.f196326a;
        if (handlerThread != null && handlerThread.getLooper() != null && (hVar = aVar.f196329d) != null) {
            hVar.sendEmptyMessage(C87087a.f196323n);
        }
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager
    public void reset() {
        if (this.mSelfThreadHandler != null) {
            this.mSelfThreadHandler.removeCallbacksAndMessages(null);
        }
        if (this.mMainThreadHandler != null) {
            this.mMainThreadHandler.removeCallbacksAndMessages(null);
        }
        IMessageWsClient iMessageWsClient = this.mMessageClient;
        if (iMessageWsClient != null) {
            iMessageWsClient.setCallback(null);
        }
        this.isFetching = false;
        this.mCursor = "0";
        this.mWsConnectFailedCount = 0;
        this.mHeartbeatPacketSeqIdGenerator = new AtomicInteger(0);
        this.mHeartbeatPacketSendTime = 0;
        this.mMessageStrategy = MessageStrategy.HTTP;
        this.deduplicateInterceptor.clear();
        this.mMonitorMessageIds.clear();
        this.mMessageQueue.clear();
        this.mInterceptListeners.clear();
        this.mInterceptors.clear();
        this.mMessageListenerMap.clear();
        this.mState = 0;
        refresh(new Configuration());
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

    public void switchToHttp(String str) {
        if (this.mMessageClient != null) {
            m150810xef0004b7("LiveMessageManager_WS", "switchToHttp");
            cancelFallbackTimer();
            cancelAlongsideHttp();
            this.mMessageStrategy = MessageStrategy.HTTP;
            this.mMessageClient.disconnectFromWebSocket(str);
            this.mSelfThreadHandler.sendEmptyMessage(103);
        }
    }

    public void processServerHeartbeatPacket(PayloadItem payloadItem) {
        try {
            String str = new String(payloadItem.getPayload());
            long j = this.mHeartbeatPacketSendTime;
            long serverTime = payloadItem.getServerTime();
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = currentTimeMillis - j;
            m150810xef0004b7("LiveMessageManager_WS", "sendPacketTime = " + j + ", serverTime = " + serverTime + ", receivePacketTime = " + currentTimeMillis + ", serverTimeGap = " + (((j2 / 2) + serverTime) - currentTimeMillis));
            if (TextUtils.equals(str, this.mHeartbeatSendPacketSeqId) && currentTimeMillis > j && j > 0 && serverTime > 0 && serverTime >= currentTimeMillis && j2 <= 1000) {
                long j3 = (serverTime + (j2 / 2)) - currentTimeMillis;
                IMessageWsClient iMessageWsClient = this.mMessageClient;
                if (iMessageWsClient != null) {
                    iMessageWsClient.setWebSocketServerTimeGap(j3);
                }
            }
        } catch (Throwable unused) {
        }
    }

    private void fetchMessage(boolean z) {
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
            if (!this.mHostWsMessageAckList.isEmpty()) {
                hashMap.put("frontier_ext", TextUtils.join(",", this.mHostWsMessageAckList));
                this.mHostWsMessageAckList.clear();
            }
            m150810xef0004b7("LiveMessageManager_WS", "call api");
            this.mApiCallStartTime = System.currentTimeMillis();
            this.isFetching = true;
            this.mMessageClient.apiCall(hashMap, z);
        }
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager
    public void refresh(Configuration configuration) {
        boolean z;
        this.mMessageConverter = configuration.getMessageConverter();
        this.mInterceptors.clear();
        this.mInterceptors.add(this.deduplicateInterceptor);
        this.mInterceptors.addAll(configuration.getInterceptors());
        this.mInterceptListeners.clear();
        this.mInterceptListeners.addAll(configuration.getInterceptListeners());
        IMessageWsClient httpClientWS = configuration.getHttpClientWS();
        this.mMessageClient = httpClientWS;
        if (httpClientWS != null) {
            httpClientWS.setCallback(this.mMessageClientCallback);
        }
        this.mEnableSmoothlyDispatch = configuration.isEnableSmoothlyDispatch();
        this.mEnablePriority = configuration.isEnablePriority();
        this.mIsAnchor = configuration.isAnchor();
        m150810xef0004b7("LiveMessageManager_WS", "mEnableSmoothlyDispatch: " + this.mEnableSmoothlyDispatch);
        m150810xef0004b7("LiveMessageManager_WS", "mEnablePriority: " + this.mEnablePriority);
        if (this.mEnableSmoothlyDispatch || this.mEnablePriority) {
            z = true;
        } else {
            z = false;
        }
        this.mNeedEnqueueMessage = z;
        this.mLogger = configuration.getLogger();
        this.mMonitor = configuration.getMonitor();
        this.mWaitWsConnectDuration = configuration.getWaitWsConnectDuration();
        if (!(this.mLogger == null || this.mMonitor == null)) {
            this.mMessageContext = new C87075a(this.mLogger, this.mMonitor);
        }
        if (this.mMessageContext != null && this.mMessageClient != null) {
            this.mUplinkClient = new C87087a(this.mMessageContext, this.mMessageClient, configuration.getHttpClient(), configuration.getUplinkConfig());
        }
    }

    MessageManagerV2(Configuration configuration) {
        super("LiveMessageManager_WS");
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.mInterceptors = copyOnWriteArrayList;
        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
        this.mInterceptListeners = copyOnWriteArrayList2;
        this.mMonitorMessageIds = new ArrayList();
        this.mMessageListenerMap = new SparseArray<>();
        this.mApiCallDelayTimeList = new long[5];
        boolean z = false;
        this.mApiCallDelayTimeListIndex = 0;
        this.mNextTimeDispatchSize = 1;
        this.mApiCallTimeStamp = 0;
        this.mCursor = "0";
        this.mHeartbeatDurationInS = 10;
        this.mMessageStrategy = MessageStrategy.HTTP;
        this.mWsConnectFailedCount = 0;
        this.mHeartbeatPacketSeqIdGenerator = new AtomicInteger(0);
        this.mHeartbeatPacketSendTime = 0;
        this.mHostWsMessageAckList = new ArrayList<>();
        this.mIsEnhanceWS = false;
        this.mEnableAlongsideHttp = false;
        this.mMessageClientCallback = new IMessageWsClient.Callback() {
            /* class com.p2082ss.ugc.live.sdk.message.MessageManagerV2.C870721 */

            static {
                Covode.recordClassIndex(102848);
            }

            /* renamed from: com_ss_ugc_live_sdk_message_MessageManagerV2$1_com_ss_android_ugc_aweme_lancet_LogLancet_d */
            public static int m150811xf732ad04(String str, String str2) {
                return 0;
            }

            /* renamed from: com_ss_ugc_live_sdk_message_MessageManagerV2$1_com_ss_android_ugc_aweme_lancet_LogLancet_e */
            public static int m150812xf732ad05(String str, String str2) {
                return 0;
            }

            @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IMessageWsClient.Callback
            public void onWebSocketConnected() {
                m150811xf732ad04("LiveMessageManager_WS", "onWebSocketConnected");
                MessageManagerV2.this.cancelAlongsideHttp();
                MessageManagerV2.this.cancelFallbackTimer();
                MessageManagerV2.this.resetAndTriggerHeartbeatTimer();
            }

            private void scheduleNextFetch() {
                long j;
                if (MessageManagerV2.this.mSelfThreadHandler != null) {
                    if (MessageManagerV2.this.mFetchInterval > 0) {
                        j = MessageManagerV2.this.mFetchInterval;
                    } else {
                        j = 1000;
                    }
                    m150811xf732ad04("LiveMessageManager_WS", "call api after ".concat(String.valueOf(j)));
                    MessageManagerV2.this.mSelfThreadHandler.sendEmptyMessageDelayed(103, j);
                }
            }

            private void scheduleNextWsAlongWithHttpFetch() {
                long j;
                if (MessageManagerV2.this.mSelfThreadHandler != null) {
                    if (MessageManagerV2.this.mFetchInterval > 0) {
                        j = MessageManagerV2.this.mFetchInterval;
                    } else {
                        j = 1000;
                    }
                    m150811xf732ad04("LiveMessageManager_WS", "call api after ".concat(String.valueOf(j)));
                    MessageManagerV2.this.mSelfThreadHandler.sendEmptyMessageDelayed(113, j);
                }
            }

            private void startReDetermineMessageStrategyWhenWSLost() {
                long j;
                if (MessageManagerV2.this.mSelfThreadHandler != null) {
                    if (MessageManagerV2.this.mMessageClient != null) {
                        MessageManagerV2.this.mMessageClient.disconnectFromWebSocket("ws_disconnect_re_determine");
                    }
                    if (!MessageManagerV2.this.mSelfThreadHandler.hasMessages(109)) {
                        MessageManagerV2.this.mMessageStrategy = MessageStrategy.HTTP;
                        if (MessageManagerV2.this.mFetchInterval > 0) {
                            j = MessageManagerV2.this.mFetchInterval;
                        } else {
                            j = 1000;
                        }
                        m150811xf732ad04("LiveMessageManager_WS", "re determine message strategy ".concat(String.valueOf(j)));
                        MessageManagerV2.this.mSelfThreadHandler.sendEmptyMessageDelayed(109, j);
                    }
                }
            }

            @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IMessageWsClient.Callback
            public void onWebSocketDisconnected() {
                MessageManagerV2.this.mWsConnectFailedCount++;
                m150811xf732ad04("LiveMessageManager_WS", "onWebSocketDisconnected, ws connect failed count is " + MessageManagerV2.this.mWsConnectFailedCount);
                MessageManagerV2.this.cancelHeartbeatTimer();
                MessageManagerV2.this.cancelFallbackTimer();
                MessageManagerV2.this.cancelAlongsideHttp();
                if (MessageManagerV2.this.mWsConnectFailedCount >= 3) {
                    MessageManagerV2.this.switchToHttp("retry_count_over");
                } else {
                    startReDetermineMessageStrategyWhenWSLost();
                }
            }

            @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IMessageWsClient.Callback
            public void onHostWebSocketMessage(PayloadItem payloadItem) {
                if (2 == MessageManagerV2.this.mState && MessageManagerV2.this.mSelfThreadHandler != null && payloadItem != null) {
                    m150811xf732ad04("LiveMessageManager_WS", "onHostWebSocketMessage");
                    MessageManagerV2.this.mSelfThreadHandler.obtainMessage(111, payloadItem).sendToTarget();
                }
            }

            @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IMessageWsClient.Callback
            public void onHostWebSocketPayloadDecoded(ProtoApiResult protoApiResult) {
                if (2 == MessageManagerV2.this.mState && MessageManagerV2.this.mSelfThreadHandler != null && protoApiResult != null) {
                    m150811xf732ad04("LiveMessageManager_WS", "onHostWebSocketPayloadDecoded");
                    dispatchWsMessage(protoApiResult.messages, protoApiResult.delayTimeBeforeDispatch);
                    if (MessageManagerV2.this.mMessageClient != null && protoApiResult.needAck) {
                        if (MessageManagerV2.this.mMessageClient.isWsConnected()) {
                            MessageManagerV2.this.mSelfThreadHandler.obtainMessage(112, protoApiResult);
                        } else if (!TextUtils.isEmpty(protoApiResult.internalExt)) {
                            MessageManagerV2.this.mHostWsMessageAckList.add(protoApiResult.internalExt);
                        }
                    }
                }
            }

            @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IMessageWsClient.Callback
            public void onApiSuccess(JsonApiResult jsonApiResult) {
                MessageManagerV2.this.isFetching = false;
                MessageManagerV2.this.mFetchFailedCount = 0;
                if (MessageManagerV2.this.mState == 2 && MessageManagerV2.this.mMainThreadHandler != null) {
                    JSONObject jSONObject = jsonApiResult.extra;
                    MessageManagerV2.this.mCursor = jSONObject.optString("cursor");
                    MessageManagerV2.this.mFetchInterval = jSONObject.optLong("fetch_interval");
                    MessageManagerV2.this.mApiCallTimeStamp = jSONObject.optLong("now");
                    JSONArray jSONArray = jsonApiResult.data;
                    int length = jSONArray.length();
                    ArrayList arrayList = new ArrayList(length);
                    for (int i = 0; i < length; i++) {
                        try {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                            JSONObject optJSONObject = jSONObject2.optJSONObject("common");
                            if (optJSONObject != null) {
                                IMessage convert = MessageManagerV2.this.mMessageConverter.convert(optJSONObject.optString("method"), jSONObject2.toString(), MessageManagerV2.this.mApiCallTimeStamp);
                                if (convert != null) {
                                    arrayList.add(convert);
                                }
                            }
                        } catch (JSONException e) {
                            m150812xf732ad05("LiveMessageManager_WS", e.toString());
                        }
                    }
                    m150811xf732ad04("LiveMessageManager_WS", "onApiSuccess, cursor: " + MessageManagerV2.this.mCursor + ", fetch_interval: " + MessageManagerV2.this.mFetchInterval + ", timestamp: " + MessageManagerV2.this.mApiCallTimeStamp + ", size: " + arrayList.size());
                    dispatchMessage(arrayList, jsonApiResult.delayTimeBeforeDispatch);
                    scheduleNextFetch();
                }
            }

            @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IMessageWsClient.Callback
            public void onDetermineMessageStrategy(ProtoApiResult protoApiResult) {
                long size;
                MessageManagerV2.this.isFetching = false;
                MessageManagerV2.this.mFetchFailedCount = 0;
                if (2 == MessageManagerV2.this.mState && MessageManagerV2.this.mMainThreadHandler != null) {
                    MessageManagerV2.this.mCursor = protoApiResult.cursor;
                    MessageManagerV2.this.mFetchInterval = protoApiResult.fetchInterval;
                    MessageManagerV2.this.mApiCallTimeStamp = protoApiResult.now;
                    MessageManagerV2.this.mHeartbeatDurationInS = Math.max(10L, protoApiResult.heartbeatDuration);
                    if (protoApiResult.messages == null) {
                        size = 0;
                    } else {
                        size = (long) protoApiResult.messages.size();
                    }
                    m150811xf732ad04("LiveMessageManager_WS", "onDetermineMessageStrategy, cursor: " + MessageManagerV2.this.mCursor + ", fetch_interval: " + MessageManagerV2.this.mFetchInterval + ", timestamp: " + MessageManagerV2.this.mApiCallTimeStamp + ", size: " + size + ", heartbeat duration: " + MessageManagerV2.this.mHeartbeatDurationInS);
                    if (MessageApiConstant.FetchType.WEBSOCKET != protoApiResult.fetchType || TextUtils.isEmpty(protoApiResult.pushServer) || MessageManagerV2.this.mSelfThreadHandler == null) {
                        MessageManagerV2.this.mMessageStrategy = MessageStrategy.HTTP;
                        dispatchMessage(protoApiResult.messages, protoApiResult.delayTimeBeforeDispatch);
                        scheduleNextFetch();
                        return;
                    }
                    MessageManagerV2.this.mMessageStrategy = MessageStrategy.WS;
                    dispatchMessage(protoApiResult.messages, protoApiResult.delayTimeBeforeDispatch);
                    MessageManagerV2.this.mSelfThreadHandler.obtainMessage(105, protoApiResult.routeParams).sendToTarget();
                }
            }

            @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IMessageWsClient.Callback
            public void onWebSocketMessage(PayloadItem payloadItem) {
                Message obtainMessage;
                if (2 == MessageManagerV2.this.mState && MessageManagerV2.this.mSelfThreadHandler != null && payloadItem != null) {
                    m150811xf732ad04("LiveMessageManager_WS", "onWebSocketMessage: payload type is " + payloadItem.getPayloadType());
                    if (TextUtils.equals(payloadItem.getPayloadType(), "msg")) {
                        MessageManagerV2.this.mApiCallStartTime = System.currentTimeMillis();
                        MessageManagerV2.this.mSelfThreadHandler.obtainMessage(107, payloadItem).sendToTarget();
                    } else if (TextUtils.equals(payloadItem.getPayloadType(), "close")) {
                        m150811xf732ad04("LiveMessageManager_WS", "onWebSocketMessage: payload type is close, fallback to http");
                        MessageManagerV2.this.switchToHttp("service_close_cmd");
                    } else if (TextUtils.equals(payloadItem.getPayloadType(), "hb")) {
                        MessageManagerV2.this.processServerHeartbeatPacket(payloadItem);
                    } else if (TextUtils.equals(payloadItem.getPayloadType(), "uplink_im_gateway")) {
                        C87087a aVar = MessageManagerV2.this.mUplinkClient;
                        C89219l.m154719c(payloadItem, "");
                        HandlerC87115h hVar = aVar.f196328c;
                        if (hVar != null && (obtainMessage = hVar.obtainMessage(C87087a.f196320k, payloadItem)) != null) {
                            obtainMessage.sendToTarget();
                        }
                    }
                }
            }

            @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IMessageWsClient.Callback
            public void onWebSocketPayloadDecoded(ProtoApiResult protoApiResult) {
                if (2 == MessageManagerV2.this.mState && MessageManagerV2.this.mSelfThreadHandler != null && protoApiResult != null) {
                    m150811xf732ad04("LiveMessageManager_WS", "onWebSocketPayloadDecoded");
                    MessageManagerV2.this.mCursor = protoApiResult.cursor;
                    MessageManagerV2.this.mFetchInterval = protoApiResult.fetchInterval;
                    MessageManagerV2.this.mApiCallTimeStamp = protoApiResult.now;
                    MessageManagerV2.this.mHeartbeatDurationInS = Math.max(10L, protoApiResult.heartbeatDuration);
                    m150811xf732ad04("LiveMessageManager_WS", "onWebSocketPayloadDecoded, cursor: " + MessageManagerV2.this.mCursor + ", fetch_interval: " + MessageManagerV2.this.mFetchInterval + ", timestamp: " + MessageManagerV2.this.mApiCallTimeStamp + ", size: " + protoApiResult.messages.size() + ", heartbeat duration is " + MessageManagerV2.this.mHeartbeatDurationInS);
                    dispatchWsMessage(protoApiResult.messages, protoApiResult.delayTimeBeforeDispatch);
                    if (TextUtils.equals(protoApiResult.payloadType, "msg") && protoApiResult.needAck) {
                        m150811xf732ad04("LiveMessageManager_WS", "onWebSocketPayloadDecoded, need send ack: " + protoApiResult.getFormatAckInfo());
                        MessageManagerV2.this.mSelfThreadHandler.obtainMessage(108, protoApiResult).sendToTarget();
                    }
                }
            }

            private void dispatchWsMessage(List<IMessage> list, long j) {
                if (list != null && !list.isEmpty()) {
                    MessageManagerV2.this.mMainThreadHandler.sendMessageDelayed(MessageManagerV2.this.mMainThreadHandler.obtainMessage(201, list), j);
                }
            }

            private void dispatchMessage(List<IMessage> list, long j) {
                if (!(list == null || list.isEmpty())) {
                    if (MessageManagerV2.this.mIsAnchor) {
                        ArrayList arrayList = new ArrayList();
                        for (IMessage iMessage : list) {
                            if (iMessage.needMonitor()) {
                                MessageManagerV2.this.mMonitorMessageIds.add(Long.valueOf(iMessage.getMessageId()));
                            }
                        }
                        MessageManagerV2.this.mMainThreadHandler.obtainMessage(203, arrayList).sendToTarget();
                    }
                    MessageManagerV2.this.mMainThreadHandler.sendMessageDelayed(MessageManagerV2.this.mMainThreadHandler.obtainMessage(201, list), j);
                }
            }

            @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IMessageWsClient.Callback
            public void onApiError(Exception exc, int i) {
                long j;
                MessageManagerV2.this.isFetching = false;
                if (MessageManagerV2.this.mState == 2 && MessageManagerV2.this.mSelfThreadHandler != null) {
                    MessageManagerV2.this.mFetchFailedCount++;
                    if (MessageManagerV2.this.mFetchFailedCount > 3) {
                        j = 5000;
                    } else {
                        j = (long) (MessageManagerV2.this.mFetchFailedCount * 1000);
                    }
                    m150812xf732ad05("LiveMessageManager_WS", "onApiError: " + exc.toString() + ". failed count: " + MessageManagerV2.this.mFetchFailedCount + ", retry after " + j);
                    if (i != MessageApiConstant.FetchRule.FETCH_DATA_FOR_WS_ALONGSIDE) {
                        MessageManagerV2.this.mSelfThreadHandler.sendEmptyMessageDelayed(103, j);
                    } else if (MessageManagerV2.this.mIsEnhanceWS && MessageManagerV2.this.mEnableAlongsideHttp) {
                        MessageManagerV2.this.mSelfThreadHandler.sendEmptyMessageDelayed(113, j);
                    }
                }
            }

            @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IMessageWsClient.Callback
            public void onApiSuccess(ProtoApiResult protoApiResult, int i) {
                long size;
                MessageManagerV2.this.isFetching = false;
                MessageManagerV2.this.mFetchFailedCount = 0;
                if (MessageManagerV2.this.mState == 2 && MessageManagerV2.this.mMainThreadHandler != null) {
                    MessageManagerV2.this.mCursor = protoApiResult.cursor;
                    MessageManagerV2.this.mFetchInterval = protoApiResult.fetchInterval;
                    MessageManagerV2.this.mApiCallTimeStamp = protoApiResult.now;
                    if (protoApiResult.messages == null) {
                        size = 0;
                    } else {
                        size = (long) protoApiResult.messages.size();
                    }
                    m150811xf732ad04("LiveMessageManager_WS", "onApiSuccess, cursor: " + MessageManagerV2.this.mCursor + ", fetch_interval: " + MessageManagerV2.this.mFetchInterval + ", timestamp: " + MessageManagerV2.this.mApiCallTimeStamp + ", size: " + size);
                    dispatchMessage(protoApiResult.messages, protoApiResult.delayTimeBeforeDispatch);
                    if (i != MessageApiConstant.FetchRule.FETCH_DATA_FOR_WS_ALONGSIDE) {
                        scheduleNextFetch();
                    } else if (MessageManagerV2.this.mIsEnhanceWS && MessageManagerV2.this.mEnableAlongsideHttp) {
                        scheduleNextWsAlongWithHttpFetch();
                    }
                }
            }
        };
        this.mMainThreadHandler = new Handler(Looper.getMainLooper()) {
            /* class com.p2082ss.ugc.live.sdk.message.MessageManagerV2.HandlerC870732 */

            static {
                Covode.recordClassIndex(102849);
            }

            public void handleMessage(Message message) {
                MessageManagerV2.this.handleMainThreadMessage(message);
            }
        };
        this.mIsEnhanceWS = configuration.isEnhanceWS();
        this.mMessageConverter = configuration.getMessageConverter();
        DeduplicateInterceptor deduplicateInterceptor2 = new DeduplicateInterceptor(configuration.getDuplicateSize());
        this.deduplicateInterceptor = deduplicateInterceptor2;
        copyOnWriteArrayList.add(deduplicateInterceptor2);
        copyOnWriteArrayList.addAll(configuration.getInterceptors());
        copyOnWriteArrayList2.addAll(configuration.getInterceptListeners());
        IMessageWsClient httpClientWS = configuration.getHttpClientWS();
        this.mMessageClient = httpClientWS;
        if (httpClientWS != null) {
            httpClientWS.setCallback(this.mMessageClientCallback);
        }
        this.mEnableSmoothlyDispatch = configuration.isEnableSmoothlyDispatch();
        this.mEnablePriority = configuration.isEnablePriority();
        this.mIsAnchor = configuration.isAnchor();
        this.mLogger = configuration.getLogger();
        this.mMonitor = configuration.getMonitor();
        this.mWaitWsConnectDuration = configuration.getWaitWsConnectDuration();
        this.mMessageContext = new C87075a(this.mLogger, this.mMonitor);
        this.mUplinkClient = new C87087a(this.mMessageContext, this.mMessageClient, configuration.getHttpClient(), configuration.getUplinkConfig());
        m150810xef0004b7("LiveMessageManager_WS", "mEnableSmoothlyDispatch: " + this.mEnableSmoothlyDispatch);
        m150810xef0004b7("LiveMessageManager_WS", "mEnablePriority: " + this.mEnablePriority);
        this.mNeedEnqueueMessage = (this.mEnableSmoothlyDispatch || this.mEnablePriority) ? true : z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: java.util.List<java.lang.Long> */
    /* JADX WARN: Multi-variable type inference failed */
    public void handleMainThreadMessage(Message message) {
        switch (message.what) {
            case 201:
                if (this.mState == 2) {
                    List<IMessage> list = (List) message.obj;
                    m150810xef0004b7("LiveMessageManager_WS", "main thread receive message list, size is " + list.size());
                    if (!this.mNeedEnqueueMessage) {
                        m150810xef0004b7("LiveMessageManager_WS", "don't need enqueue message, directly dispatch messages");
                        for (IMessage iMessage : list) {
                            onMessage(iMessage);
                        }
                        return;
                    }
                    m150810xef0004b7("LiveMessageManager_WS", "add message list to message queue, size is " + list.size());
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
                    m150810xef0004b7("LiveMessageManager_WS", "main thread receive single message");
                    if (!this.mNeedEnqueueMessage) {
                        m150810xef0004b7("LiveMessageManager_WS", "don't need enqueue message, directly dispatch message");
                        onMessage(iMessage3);
                        return;
                    }
                    m150810xef0004b7("LiveMessageManager_WS", "add single message to message queue");
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
                    m150810xef0004b7("LiveMessageManager_WS", "before dispatch, message queue size is " + this.mMessageQueue.size());
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
                    m150810xef0004b7("LiveMessageManager_WS", "after dispatch, message queue size is " + this.mMessageQueue.size());
                    if (this.mMessageQueue.size() > 0) {
                        scheduleNextDispatch(true);
                        return;
                    }
                    return;
                }
                return;
            case 206:
                this.mMessageQueue.clear();
                return;
            default:
                return;
        }
    }

    public void handleSelfThreadMessage(Message message) {
        IMessageWsClient iMessageWsClient;
        switch (message.what) {
            case 101:
                if (this.mState != 2) {
                    m150810xef0004b7("LiveMessageManager_WS", "start message manager");
                    this.mState = 2;
                    IMessageWsClient iMessageWsClient2 = this.mMessageClient;
                    if (iMessageWsClient2 != null) {
                        iMessageWsClient2.onStartMessage();
                    }
                    C87087a aVar = this.mUplinkClient;
                    C87104a.m150852a(aVar.f196332g, "uplink client start");
                    C87087a.HandlerThreadC87095h hVar = new C87087a.HandlerThreadC87095h(aVar, "UplinkClient");
                    hVar.start();
                    aVar.f196326a = hVar;
                    determineMessageStrategy();
                    return;
                }
                return;
            case 102:
            case 104:
                m150810xef0004b7("LiveMessageManager_WS", "stop message manager");
                cancelAlongsideHttp();
                this.mSelfThreadHandler.removeMessages(103);
                this.mMainThreadHandler.removeCallbacksAndMessages(null);
                if (this.mState == 2 && (iMessageWsClient = this.mMessageClient) != null) {
                    iMessageWsClient.onStopMessage();
                    this.mMessageClient.disconnectFromWebSocket("stop_message");
                }
                if (message.what == 104) {
                    this.mCursor = "0";
                    this.deduplicateInterceptor.clear();
                    clearMessageQueueInMain();
                }
                this.mState = 3;
                return;
            case 103:
                if (this.mState == 2) {
                    fetchMessage(false);
                    return;
                }
                return;
            case 105:
                if (this.mState == 2 && this.mMessageClient != null) {
                    this.mMessageClient.connectToWebSocket((Map) message.obj, this.mCursor);
                    resetAndTriggerFallbackTimer(this.mWaitWsConnectDuration, "ws_connect_timeout");
                    if (this.mIsEnhanceWS) {
                        this.mEnableAlongsideHttp = true;
                        wsAlongWithHttpFetch();
                        return;
                    }
                    return;
                }
                return;
            case 106:
                if (this.mState == 2) {
                    switchToHttp((String) message.obj);
                    return;
                }
                return;
            case 107:
                if (this.mState == 2 && this.mMessageClient != null) {
                    this.mMessageClient.decodeWebSocketPayload((PayloadItem) message.obj);
                    return;
                }
                return;
            case 108:
                if (this.mState == 2 && this.mMessageClient != null) {
                    ProtoApiResult protoApiResult = (ProtoApiResult) message.obj;
                    if (protoApiResult.internalExt != null) {
                        this.mMessageClient.sendWebSocketMessage("none", "ack", protoApiResult.internalExt.getBytes(), protoApiResult.logId, protoApiResult.logId);
                        return;
                    }
                    return;
                }
                return;
            case 109:
                if (this.mState == 2 && this.mMessageClient != null) {
                    determineMessageStrategy();
                    return;
                }
                return;
            case 110:
                if (this.mState == 2 && this.mMessageClient != null) {
                    int incrementAndGet = this.mHeartbeatPacketSeqIdGenerator.incrementAndGet();
                    this.mHeartbeatSendPacketSeqId = String.valueOf(incrementAndGet);
                    this.mHeartbeatPacketSendTime = System.currentTimeMillis();
                    m150810xef0004b7("LiveMessageManager_WS", "send heartbeat packet: seqId is " + this.mHeartbeatSendPacketSeqId);
                    long j = (long) incrementAndGet;
                    this.mMessageClient.sendWebSocketMessage("none", "hb", this.mHeartbeatSendPacketSeqId.getBytes(), j, j);
                    resetAndTriggerHeartbeatTimer();
                    return;
                }
                return;
            case 111:
                if (this.mState == 2 && this.mMessageClient != null) {
                    this.mMessageClient.decodeHostWebSocketPayload((PayloadItem) message.obj);
                    return;
                }
                return;
            case 112:
                if (this.mState == 2 && this.mMessageClient != null) {
                    ProtoApiResult protoApiResult2 = (ProtoApiResult) message.obj;
                    if (protoApiResult2.internalExt != null) {
                        this.mMessageClient.sendWebSocketMessage("none", "frontier_ack", protoApiResult2.internalExt.getBytes(), protoApiResult2.logId, protoApiResult2.logId);
                        return;
                    }
                    return;
                }
                return;
            case 113:
                if (this.mState == 2) {
                    fetchMessage(true);
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

    public void resetAndTriggerFallbackTimer(long j, String str) {
        if (this.mState == 2) {
            IMessageWsClient iMessageWsClient = this.mMessageClient;
            if ((iMessageWsClient == null || !iMessageWsClient.isWsConnected()) && this.mSelfThreadHandler != null) {
                m150810xef0004b7("LiveMessageManager_WS", "trigger fallback timer");
                cancelFallbackTimer();
                this.mSelfThreadHandler.sendMessageDelayed(this.mSelfThreadHandler.obtainMessage(106, str), j);
            }
        }
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManagerV2
    public void sendRequest(long j, C87081e eVar, AbstractC87079c cVar) {
        long d;
        Message obtainMessage;
        C87087a aVar = this.mUplinkClient;
        C89219l.m154719c(eVar, "");
        C89219l.m154719c(cVar, "");
        long incrementAndGet = aVar.f196331f.f196339a.incrementAndGet();
        if (eVar.f196309i > 0) {
            d = eVar.f196309i;
        } else {
            d = aVar.f196334i.mo13093d();
        }
        C87098d dVar = new C87098d(incrementAndGet, j, d, eVar, cVar);
        HandlerC87115h hVar = aVar.f196327b;
        if (hVar != null && (obtainMessage = hVar.obtainMessage(C87087a.f196319j, dVar)) != null) {
            obtainMessage.sendToTarget();
        }
    }
}
