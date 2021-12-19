package com.p2082ss.mediakit.net;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.mediakit.medialoader.AVMDLDataLoader;
import com.p2082ss.mediakit.medialoader.AVMDLLog;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;

/* renamed from: com.ss.mediakit.net.AVMDLDNSParser */
public class AVMDLDNSParser {
    public static AVMDLCustomHTTPDNSParser mCustomHttpDNSParser;
    public static int mGlobalBackType = 2;
    public static int mGlobalBackUpDelayedTime;
    public static int mGlobalDefaultExpiredTime = 60;
    public static int mGlobalEnableBackUpIp;
    public static int mGlobalEnableDNSLog;
    public static int mGlobalEnableParallel;
    public static int mGlobalEnableRefresh;
    public static int mGlobalForceExpiredTime;
    public static String mGlobalGoogleDNSParseHost = "";
    public static int mGlobalMainType;
    public static String mGlobalOwnDNSParseHost = "";
    private static AVMDLDNSParser mInstance;
    public static AVMDLNetClientMaker mNetClientMaker;
    private Handler mHandler;
    private Lock mLock = new ReentrantLock();
    private Map<String, AVMDLHostProcessor> mProcessors = new HashMap();
    private int mRefCount;
    private int mState;
    private HandlerThread mThread;
    private int mTimeOut = 5;
    private int mType;

    public void release() {
    }

    static {
        Covode.recordClassIndex(101222);
    }

    public AVMDLDNSParser() {
        HandlerThread handlerThread = new HandlerThread("AVMDLDNSParser");
        this.mThread = handlerThread;
        handlerThread.start();
        this.mHandler = new Handler(this.mThread.getLooper()) {
            /* class com.p2082ss.mediakit.net.AVMDLDNSParser.HandlerC861101 */

            static {
                Covode.recordClassIndex(101223);
            }

            public void handleMessage(Message message) {
                AVMDLDNSInfo aVMDLDNSInfo;
                if (message.obj != null) {
                    aVMDLDNSInfo = (AVMDLDNSInfo) message.obj;
                } else {
                    aVMDLDNSInfo = null;
                }
                AVMDLLog.m147905d("AVMDLDNSParser", C1764a.m5928a("----receive msg what:%d info:%s", new Object[]{Integer.valueOf(message.what), aVMDLDNSInfo}));
                int i = message.what;
                if (i == 2) {
                    AVMDLDNSParser.this.proccessFailMsg(message.what, aVMDLDNSInfo);
                } else if (i == 3) {
                    AVMDLDNSParser.this.proccessSucMsg(message.what, aVMDLDNSInfo);
                } else if (i == 4) {
                    AVMDLDNSParser.this.proccessPreParseMsg(message.what, aVMDLDNSInfo);
                } else if (i == 6) {
                    AVMDLDNSParser.this.processParseMsg(message.what, aVMDLDNSInfo);
                } else if (i == 7) {
                    AVMDLDNSParser.this.processBatchParseMsg(message.what, aVMDLDNSInfo);
                }
                AVMDLLog.m147905d("AVMDLDNSParser", C1764a.m5928a("****end proc msg what:%d info:%s", new Object[]{Integer.valueOf(message.what), aVMDLDNSInfo}));
            }
        };
    }

    public static AVMDLDNSParser getInstance() {
        MethodCollector.m26663i(12333);
        if (mInstance == null) {
            synchronized (AVMDLDNSParser.class) {
                try {
                    if (mInstance == null) {
                        mInstance = new AVMDLDNSParser();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(12333);
                    throw th;
                }
            }
        }
        AVMDLDNSParser aVMDLDNSParser = mInstance;
        MethodCollector.m26664o(12333);
        return aVMDLDNSParser;
    }

    public static AVMDLNetClient getNetClient() {
        AVMDLNetClient aVMDLNetClient;
        MethodCollector.m26663i(11613);
        synchronized (AVMDLDNSParser.class) {
            try {
                AVMDLNetClientMaker aVMDLNetClientMaker = mNetClientMaker;
                if (aVMDLNetClientMaker != null) {
                    aVMDLNetClient = aVMDLNetClientMaker.getNetClient();
                } else {
                    aVMDLNetClient = null;
                }
            } finally {
                MethodCollector.m26664o(11613);
            }
        }
        if (aVMDLNetClient == null) {
            aVMDLNetClient = new AVMDLHTTPNetwork();
        }
        return aVMDLNetClient;
    }

    public static void processHijack() {
        AVMDLLog.m147905d("AVMDLDNSParser", C1764a.m5928a("----process hijack old dnsmain:%d back:%d", new Object[]{Integer.valueOf(mGlobalMainType), Integer.valueOf(mGlobalBackType)}));
        int i = mGlobalMainType;
        if (i == 0) {
            mGlobalMainType = mGlobalBackType;
            mGlobalBackType = i;
        }
        AVMDLLog.m147905d("AVMDLDNSParser", C1764a.m5928a("****process hijack new dnsmain:%d back:%d", new Object[]{Integer.valueOf(mGlobalMainType), Integer.valueOf(mGlobalBackType)}));
    }

    public static void setClientMaker(AVMDLNetClientMaker aVMDLNetClientMaker) {
        MethodCollector.m26663i(12565);
        synchronized (AVMDLDNSParser.class) {
            if (aVMDLNetClientMaker != null) {
                try {
                    mNetClientMaker = aVMDLNetClientMaker;
                } catch (Throwable th) {
                    MethodCollector.m26664o(12565);
                    throw th;
                }
            }
        }
        MethodCollector.m26664o(12565);
    }

    private void reportLog(AVMDLDNSInfo aVMDLDNSInfo) {
        if (aVMDLDNSInfo != null && !TextUtils.isEmpty(aVMDLDNSInfo.mIpList) && mGlobalEnableDNSLog > 0) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("log_type", "mdl_dns_log");
                jSONObject.put("dns_type", aVMDLDNSInfo.mType);
                jSONObject.put("ip_list", aVMDLDNSInfo.mIpList);
                AVMDLDataLoader.getInstance().onLogInfo(15, 0, jSONObject.toString());
            } catch (Exception unused) {
            }
        }
    }

    private void sendBatchParseMsg(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            AVMDLLog.m147905d("AVMDLDNSParser", "hosts null not need do batch parse");
            return;
        }
        AVMDLDNSInfo aVMDLDNSInfo = new AVMDLDNSInfo(mGlobalMainType, strArr, (String) null, 0, (String) null);
        Message message = new Message();
        message.what = 7;
        message.obj = aVMDLDNSInfo;
        AVMDLLog.m147905d("AVMDLDNSParser", C1764a.m5928a("send msg for batch parse", new Object[0]));
        this.mHandler.sendMessage(message);
    }

    public static void setCustomHttpDNSParser(AVMDLCustomHTTPDNSParser aVMDLCustomHTTPDNSParser) {
        MethodCollector.m26663i(12567);
        synchronized (AVMDLDNSParser.class) {
            int i = 1;
            try {
                Object[] objArr = new Object[1];
                if (aVMDLCustomHTTPDNSParser == null) {
                    i = 0;
                }
                objArr[0] = Integer.valueOf(i);
                AVMDLLog.m147905d("AVMDLDNSParser", C1764a.m5928a("set custom http dns parser:%d", objArr));
                if (aVMDLCustomHTTPDNSParser != null) {
                    mCustomHttpDNSParser = aVMDLCustomHTTPDNSParser;
                }
            } finally {
                MethodCollector.m26664o(12567);
            }
        }
    }

    public static int getIntValue(int i) {
        int i2;
        MethodCollector.m26663i(12449);
        AVMDLLog.m147905d("AVMDLDNSParser", C1764a.m5928a("----get value for key:%d", new Object[]{Integer.valueOf(i)}));
        synchronized (AVMDLDNSParser.class) {
            if (i != 10) {
                switch (i) {
                    case 0:
                        i2 = mGlobalMainType;
                        break;
                    case 1:
                        i2 = mGlobalBackType;
                        break;
                    case 2:
                        i2 = mGlobalDefaultExpiredTime;
                        break;
                    case 3:
                        i2 = mGlobalBackUpDelayedTime;
                        break;
                    case 4:
                        i2 = mGlobalEnableParallel;
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        i2 = mGlobalEnableBackUpIp;
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                        i2 = mGlobalEnableRefresh;
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                        try {
                            i2 = mGlobalEnableDNSLog;
                            break;
                        } catch (Throwable th) {
                            MethodCollector.m26664o(12449);
                            throw th;
                        }
                    default:
                        i2 = Integer.MIN_VALUE;
                        break;
                }
            } else {
                i2 = mGlobalForceExpiredTime;
            }
        }
        AVMDLLog.m147905d("AVMDLDNSParser", C1764a.m5928a("****get value:%d for key:%d", new Object[]{Integer.valueOf(i2), Integer.valueOf(i)}));
        MethodCollector.m26664o(12449);
        return i2;
    }

    public void doParseHosts(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            AVMDLLog.m147905d("AVMDLDNSParser", "hosts is null, not need do batch host parse");
            return;
        }
        int length = strArr.length;
        for (int i = 0; i < strArr.length; i++) {
            if (!TextUtils.isEmpty(strArr[i])) {
                if (IPCache.getInstance().get(strArr[i]) != null) {
                    AVMDLLog.m147905d("AVMDLDNSParser", C1764a.m5928a("for host:%s has dns info not need do batch parse", new Object[]{strArr[i]}));
                    strArr[i] = null;
                    length--;
                } else {
                    this.mLock.lock();
                    try {
                        if (this.mProcessors.get(strArr[i]) != null) {
                            AVMDLLog.m147905d("AVMDLDNSParser", C1764a.m5928a("for host:%s has processor not need do batch parse", new Object[]{strArr[i]}));
                            strArr[i] = null;
                            length--;
                        }
                    } finally {
                        this.mLock.unlock();
                    }
                }
            }
        }
        if (length == 0) {
            AVMDLLog.m147905d("AVMDLDNSParser", "has no hosts need do batch parse");
        } else {
            sendBatchParseMsg(strArr);
        }
    }

    public void addHost(String str, AVMDLDNSParserListener aVMDLDNSParserListener) {
        addListenerInternal(str, aVMDLDNSParserListener);
    }

    public void removeHost(String str, AVMDLDNSParserListener aVMDLDNSParserListener) {
        removeListenerInternal(str, aVMDLDNSParserListener);
    }

    public void postParseHostMsg(String str, int i) {
        AVMDLDNSInfo aVMDLDNSInfo = new AVMDLDNSInfo(i, str, (String) null, 0, (String) null);
        Message message = new Message();
        message.what = 5;
        message.obj = aVMDLDNSInfo;
        this.mHandler.sendMessage(message);
    }

    public void setBackUpIP(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            IPCache.getInstance().putBackUpIp(str, new AVMDLDNSInfo(11, str, str2, 0, (String) null));
        }
    }

    /* JADX INFO: finally extract failed */
    private void removeListenerInternal(String str, AVMDLDNSParserListener aVMDLDNSParserListener) {
        if (!TextUtils.isEmpty(str) && aVMDLDNSParserListener != null) {
            AVMDLLog.m147905d("AVMDLDNSParser", C1764a.m5928a("---remove listener:%s for host:%s", new Object[]{aVMDLDNSParserListener, str}));
            this.mLock.lock();
            try {
                AVMDLHostProcessor aVMDLHostProcessor = this.mProcessors.get(str);
                AVMDLLog.m147905d("AVMDLDNSParser", C1764a.m5928a("get processor:%s", new Object[]{aVMDLHostProcessor}));
                if (aVMDLHostProcessor != null) {
                    AVMDLLog.m147905d("AVMDLDNSParser", C1764a.m5928a("remove listener", new Object[0]));
                    aVMDLHostProcessor.mListeners.remove(aVMDLDNSParserListener);
                    if (aVMDLHostProcessor.mListeners.size() == 0) {
                        AVMDLLog.m147905d("AVMDLDNSParser", C1764a.m5928a("listeners empty for processors", new Object[0]));
                    }
                }
                this.mLock.unlock();
                AVMDLLog.m147905d("AVMDLDNSParser", C1764a.m5928a("****end remove listener", new Object[0]));
            } catch (Throwable th) {
                this.mLock.unlock();
                throw th;
            }
        }
    }

    private void sendPreParseMsg(String str, long j) {
        if (TextUtils.isEmpty(str) || j <= 0) {
            AVMDLLog.m147905d("AVMDLDNSParser", "host is null or delayTimeMs invalid,not support preparse");
        } else if (mGlobalEnableRefresh > 0) {
            AVMDLDNSInfo aVMDLDNSInfo = new AVMDLDNSInfo(mGlobalMainType, str, (String) null, 0, (String) null);
            Message message = new Message();
            message.obj = aVMDLDNSInfo;
            message.what = 4;
            message.obj = aVMDLDNSInfo;
            long j2 = j + 3000;
            AVMDLLog.m147905d("AVMDLDNSParser", C1764a.m5928a("send preparse for host:%s delayTime:%d", new Object[]{aVMDLDNSInfo.mHost, Long.valueOf(j2)}));
            this.mHandler.sendMessageDelayed(message, j2);
        }
    }

    public static void setIntValue(int i, int i2) {
        MethodCollector.m26663i(12447);
        AVMDLLog.m147905d("AVMDLDNSParser", C1764a.m5928a("****set value:%d for key:%d", new Object[]{Integer.valueOf(i2), Integer.valueOf(i)}));
        synchronized (AVMDLDNSParser.class) {
            if (i != 10) {
                switch (i) {
                    case 0:
                        mGlobalMainType = i2;
                        break;
                    case 1:
                        mGlobalBackType = i2;
                        break;
                    case 2:
                        mGlobalDefaultExpiredTime = i2;
                        break;
                    case 3:
                        mGlobalBackUpDelayedTime = i2;
                        break;
                    case 4:
                        mGlobalEnableParallel = i2;
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        mGlobalEnableBackUpIp = i2;
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                        mGlobalEnableRefresh = i2;
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                        try {
                            mGlobalEnableDNSLog = i2;
                            break;
                        } catch (Throwable th) {
                            MethodCollector.m26664o(12447);
                            throw th;
                        }
                }
            } else {
                mGlobalForceExpiredTime = i2;
            }
        }
        MethodCollector.m26664o(12447);
    }

    public static void setStringValue(int i, String str) {
        MethodCollector.m26663i(12562);
        AVMDLLog.m147905d("AVMDLDNSParser", C1764a.m5928a("****set value:%s for key:%d", new Object[]{str, Integer.valueOf(i)}));
        synchronized (AVMDLDNSParser.class) {
            if (i != 8) {
                if (i == 9) {
                    try {
                        if (!TextUtils.isEmpty(str)) {
                            mGlobalGoogleDNSParseHost = str;
                        }
                    } catch (Throwable th) {
                        MethodCollector.m26664o(12562);
                        throw th;
                    }
                }
            } else if (!TextUtils.isEmpty(str)) {
                mGlobalOwnDNSParseHost = str;
            }
        }
        MethodCollector.m26664o(12562);
    }

    public void proccessPreParseMsg(int i, AVMDLDNSInfo aVMDLDNSInfo) {
        long j;
        if (mGlobalEnableRefresh <= 0) {
            AVMDLLog.m147905d("AVMDLDNSParser", "not support preparse");
        } else if (aVMDLDNSInfo == null || aVMDLDNSInfo.mHost == null) {
            AVMDLLog.m147905d("AVMDLDNSParser", C1764a.m5928a("proc pre msg  fail, info or host is null", new Object[0]));
        } else {
            AVMDLLog.m147905d("AVMDLDNSParser", C1764a.m5928a("----proc pre parse msg what:%d host:%s", new Object[]{Integer.valueOf(i), aVMDLDNSInfo.mHost}));
            AVMDLDNSInfo aVMDLDNSInfo2 = IPCache.getInstance().get(aVMDLDNSInfo.mHost);
            long currentTimeMillis = System.currentTimeMillis();
            Object[] objArr = new Object[2];
            objArr[0] = aVMDLDNSInfo2;
            if (aVMDLDNSInfo2 == null) {
                j = -1;
            } else {
                j = aVMDLDNSInfo2.mExpiredTime;
            }
            objArr[1] = Long.valueOf(j);
            AVMDLLog.m147905d("AVMDLDNSParser", C1764a.m5928a("cache:%s expiredT:%d", objArr));
            if (aVMDLDNSInfo2 == null || aVMDLDNSInfo2.mExpiredTime < currentTimeMillis) {
                AVMDLLog.m147905d("AVMDLDNSParser", "add host for preparse");
                addListenerInternal(aVMDLDNSInfo.mHost, null);
            }
            AVMDLLog.m147905d("AVMDLDNSParser", "****proc pre parse msg what:%d host:%s");
        }
    }

    public void processBatchParseMsg(int i, AVMDLDNSInfo aVMDLDNSInfo) {
        if (aVMDLDNSInfo == null || aVMDLDNSInfo.mHosts == null || aVMDLDNSInfo.mHosts.length == 0) {
            AVMDLLog.m147905d("AVMDLDNSParser", C1764a.m5928a("proc parser msg  fail, info or host is null", new Object[0]));
            return;
        }
        AVMDLLog.m147905d("AVMDLDNSParser", C1764a.m5928a("----proc batch parse msg what:%d", new Object[]{Integer.valueOf(i)}));
        if (mGlobalEnableParallel > 0 || mGlobalMainType == 2) {
            try {
                new HTTPDNSHosts(aVMDLDNSInfo.mHosts, null, 2, this.mHandler).start();
            } catch (Exception e) {
                AVMDLLog.m147905d("AVMDLDNSParser", C1764a.m5928a("parse end create httpdnshosts fail".concat(String.valueOf(e)), new Object[0]));
            }
        } else {
            new LocalDNSHosts(aVMDLDNSInfo.mHosts, this.mHandler).start();
            AVMDLLog.m147905d("AVMDLDNSParser", C1764a.m5928a("****end proc batch parser msg", new Object[0]));
        }
    }

    /* JADX INFO: finally extract failed */
    public void processParseMsg(int i, AVMDLDNSInfo aVMDLDNSInfo) {
        if (aVMDLDNSInfo == null || aVMDLDNSInfo.mHost == null) {
            AVMDLLog.m147905d("AVMDLDNSParser", C1764a.m5928a("proc parser msg  fail, info or host is null", new Object[0]));
            return;
        }
        AVMDLLog.m147905d("AVMDLDNSParser", C1764a.m5928a("----proc parser msg what:%d host:%s", new Object[]{Integer.valueOf(i), aVMDLDNSInfo.mHost}));
        this.mLock.lock();
        try {
            AVMDLHostProcessor aVMDLHostProcessor = this.mProcessors.get(aVMDLDNSInfo.mHost);
            if (aVMDLHostProcessor != null) {
                AVMDLLog.m147905d("AVMDLDNSParser", C1764a.m5928a("----get processor:%s host:%s", new Object[]{aVMDLHostProcessor, aVMDLDNSInfo.mHost}));
                aVMDLHostProcessor.processMsg(i, aVMDLDNSInfo);
            } else {
                AVMDLLog.m147905d("AVMDLDNSParser", C1764a.m5928a("****get processor null for host:%s", new Object[]{aVMDLDNSInfo.mHost}));
            }
            this.mLock.unlock();
            AVMDLLog.m147905d("AVMDLDNSParser", C1764a.m5928a("****end proc parser msg", new Object[0]));
        } catch (Throwable th) {
            this.mLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    private void addListenerInternal(String str, AVMDLDNSParserListener aVMDLDNSParserListener) {
        boolean z;
        if (!TextUtils.isEmpty(str)) {
            AVMDLLog.m147905d("AVMDLDNSParser", C1764a.m5928a("---add listener:%s for host:%s", new Object[]{aVMDLDNSParserListener, str}));
            this.mLock.lock();
            try {
                AVMDLHostProcessor aVMDLHostProcessor = this.mProcessors.get(str);
                AVMDLLog.m147905d("AVMDLDNSParser", C1764a.m5928a("get processor:%s", new Object[]{aVMDLHostProcessor}));
                if (aVMDLHostProcessor == null) {
                    aVMDLHostProcessor = new AVMDLHostProcessor(str, this.mHandler, mGlobalMainType, mGlobalBackType, mGlobalBackUpDelayedTime, mGlobalEnableParallel);
                    AVMDLLog.m147905d("AVMDLDNSParser", C1764a.m5928a("create processor:%s", new Object[]{aVMDLHostProcessor}));
                    z = true;
                } else {
                    z = false;
                }
                if (aVMDLDNSParserListener != null && !aVMDLHostProcessor.mListeners.containsKey(aVMDLDNSParserListener)) {
                    AVMDLLog.m147905d("AVMDLDNSParser", C1764a.m5928a("add listener", new Object[0]));
                    aVMDLHostProcessor.mListeners.put(aVMDLDNSParserListener, 1);
                }
                this.mProcessors.put(str, aVMDLHostProcessor);
                if (z) {
                    AVMDLLog.m147905d("AVMDLDNSParser", C1764a.m5928a("new processor implement parse", new Object[0]));
                    aVMDLHostProcessor.processMsg(5, new AVMDLDNSInfo(mGlobalMainType, str, (String) null, 0, (String) null));
                }
                this.mLock.unlock();
                AVMDLLog.m147905d("AVMDLDNSParser", C1764a.m5928a("****end add listener", new Object[0]));
            } catch (Throwable th) {
                this.mLock.unlock();
                throw th;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public void proccessFailMsg(int i, AVMDLDNSInfo aVMDLDNSInfo) {
        if (aVMDLDNSInfo == null || aVMDLDNSInfo.mHost == null) {
            AVMDLLog.m147905d("AVMDLDNSParser", C1764a.m5928a("proc fail msg  fail, info or host is null", new Object[0]));
            return;
        }
        AVMDLLog.m147905d("AVMDLDNSParser", C1764a.m5928a("----proc fail msg what:%d host:%s", new Object[]{Integer.valueOf(i), aVMDLDNSInfo.mHost}));
        this.mLock.lock();
        try {
            AVMDLHostProcessor aVMDLHostProcessor = this.mProcessors.get(aVMDLDNSInfo.mHost);
            AVMDLLog.m147905d("AVMDLDNSParser", C1764a.m5928a("get processor:%s host:%s", new Object[]{aVMDLHostProcessor, aVMDLDNSInfo.mHost}));
            if (aVMDLHostProcessor != null && aVMDLHostProcessor.isValidSourceId(aVMDLDNSInfo.mId)) {
                aVMDLHostProcessor.processResult(i, aVMDLDNSInfo);
                if (aVMDLHostProcessor.isEnd()) {
                    AVMDLLog.m147905d("AVMDLDNSParser", C1764a.m5928a("processor end, notify result", new Object[0]));
                    for (AVMDLDNSParserListener aVMDLDNSParserListener : aVMDLHostProcessor.mListeners.keySet()) {
                        if (aVMDLDNSParserListener != null) {
                            AVMDLLog.m147905d("AVMDLDNSParser", C1764a.m5928a("listener:%s oncompletion fail", new Object[]{aVMDLDNSParserListener}));
                            aVMDLDNSParserListener.onCompletion(0, aVMDLDNSInfo.mHost, null, 0, null, aVMDLDNSInfo.mType);
                        }
                    }
                    aVMDLHostProcessor.mListeners.clear();
                    this.mProcessors.remove(aVMDLDNSInfo.mHost);
                } else {
                    AVMDLLog.m147905d("AVMDLDNSParser", C1764a.m5928a("processor is not end", new Object[0]));
                }
            }
            this.mLock.unlock();
            AVMDLLog.m147905d("AVMDLDNSParser", C1764a.m5928a("****end proc fail msg what", new Object[0]));
        } catch (Throwable th) {
            this.mLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public void proccessSucMsg(int i, AVMDLDNSInfo aVMDLDNSInfo) {
        if (aVMDLDNSInfo == null || aVMDLDNSInfo.mHost == null) {
            AVMDLLog.m147905d("AVMDLDNSParser", C1764a.m5928a("proc suc msg  fail, info or host is null", new Object[0]));
            return;
        }
        AVMDLLog.m147905d("AVMDLDNSParser", C1764a.m5928a("----proc suc msg what:%d host:%s", new Object[]{Integer.valueOf(i), aVMDLDNSInfo.mHost}));
        this.mLock.lock();
        try {
            AVMDLHostProcessor aVMDLHostProcessor = this.mProcessors.get(aVMDLDNSInfo.mHost);
            AVMDLLog.m147905d("AVMDLDNSParser", C1764a.m5928a("get processor:%s host:%s", new Object[]{aVMDLHostProcessor, aVMDLDNSInfo.mHost}));
            if (!(aVMDLHostProcessor == null || aVMDLHostProcessor.mListeners == null)) {
                for (AVMDLDNSParserListener aVMDLDNSParserListener : aVMDLHostProcessor.mListeners.keySet()) {
                    if (aVMDLDNSParserListener != null) {
                        AVMDLLog.m147905d("AVMDLDNSParser", C1764a.m5928a("listener:%s oncompletion suc", new Object[]{aVMDLDNSParserListener}));
                        aVMDLDNSParserListener.onCompletion(0, aVMDLDNSInfo.mHost, aVMDLDNSInfo.mIpList, aVMDLDNSInfo.mExpiredTime, null, aVMDLDNSInfo.mType);
                    }
                }
                aVMDLHostProcessor.mListeners.clear();
                this.mProcessors.remove(aVMDLDNSInfo.mHost);
                AVMDLLog.m147905d("AVMDLDNSParser", C1764a.m5928a("remove all listeners and remove host", new Object[0]));
            }
            sendPreParseMsg(aVMDLDNSInfo.mHost, aVMDLDNSInfo.mExpiredTime - System.currentTimeMillis());
            reportLog(aVMDLDNSInfo);
            this.mLock.unlock();
            AVMDLLog.m147905d("AVMDLDNSParser", C1764a.m5928a("****end proc suc msg", new Object[0]));
        } catch (Throwable th) {
            this.mLock.unlock();
            throw th;
        }
    }

    public static void updateDNSInfo(String str, String str2, long j) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            AVMDLLog.m147905d("AVMDLDNSParser", "ip direct info invalid");
            return;
        }
        AVMDLDNSInfo aVMDLDNSInfo = new AVMDLDNSInfo(10, str, str2, (j + ((long) mGlobalDefaultExpiredTime)) * 1000, (String) null);
        AVMDLLog.m147905d("AVMDLDNSParser", "server iplist, host = " + str + " type = 10 iplist = " + str2);
        IPCache.getInstance().put(str, aVMDLDNSInfo);
    }
}
