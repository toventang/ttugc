package com.p2082ss.ttuploader.net;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.ttuploader.TTUploadLog;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.ss.ttuploader.net.TTUploadDNSParser */
public class TTUploadDNSParser {
    public static int mGlobalBackType = 2;
    public static int mGlobalBackUpDelayedTime;
    public static int mGlobalDefaultExpiredTime = 60;
    public static int mGlobalMainType;
    private static TTUploadDNSParser mInstance;
    private Handler mHandler;
    private Lock mLock = new ReentrantLock();
    private Map<String, TTUploadHostProcessor> mProcessors = new HashMap();
    private int mRefCount;
    private int mState;
    private HandlerThread mThread;
    private int mTimeOut = 5;
    private int mType;

    public void release() {
    }

    static {
        Covode.recordClassIndex(101517);
    }

    public TTUploadDNSParser() {
        HandlerThread handlerThread = new HandlerThread("TTUploadDNSParser");
        this.mThread = handlerThread;
        handlerThread.start();
        this.mHandler = new Handler(this.mThread.getLooper()) {
            /* class com.p2082ss.ttuploader.net.TTUploadDNSParser.HandlerC862971 */

            static {
                Covode.recordClassIndex(101518);
            }

            public void handleMessage(Message message) {
                TTUploadDNSInfo tTUploadDNSInfo;
                if (message.obj != null) {
                    tTUploadDNSInfo = (TTUploadDNSInfo) message.obj;
                } else {
                    tTUploadDNSInfo = null;
                }
                TTUploadLog.m148564d("TTUploadDNSParser", C1764a.m5928a("----receive msg what:%d info:%s", new Object[]{Integer.valueOf(message.what), tTUploadDNSInfo}));
                int i = message.what;
                if (i == 1) {
                    TTUploadDNSParser.this.processParseMsg(message.what, tTUploadDNSInfo);
                } else if (i == 2) {
                    TTUploadDNSParser.this.proccessFailMsg(message.what, tTUploadDNSInfo);
                } else if (i == 3) {
                    TTUploadDNSParser.this.proccessSucMsg(message.what, tTUploadDNSInfo);
                }
                TTUploadLog.m148564d("TTUploadDNSParser", C1764a.m5928a("****end proc msg what:%d info:%s", new Object[]{Integer.valueOf(message.what), tTUploadDNSInfo}));
            }
        };
    }

    public static TTUploadDNSParser getInstance() {
        MethodCollector.m26663i(12825);
        if (mInstance == null) {
            synchronized (TTUploadDNSParser.class) {
                try {
                    if (mInstance == null) {
                        mInstance = new TTUploadDNSParser();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(12825);
                    throw th;
                }
            }
        }
        TTUploadDNSParser tTUploadDNSParser = mInstance;
        MethodCollector.m26664o(12825);
        return tTUploadDNSParser;
    }

    public void addHost(String str, TTUploadDNSParserListener tTUploadDNSParserListener) {
        addListenerInternal(str, tTUploadDNSParserListener);
    }

    public void removeHost(String str, TTUploadDNSParserListener tTUploadDNSParserListener) {
        removeListenerInternal(str, tTUploadDNSParserListener);
    }

    public void postParseHostMsg(String str, int i) {
        TTUploadDNSInfo tTUploadDNSInfo = new TTUploadDNSInfo(i, str, null, 0, null);
        Message message = new Message();
        message.what = 0;
        message.obj = tTUploadDNSInfo;
        this.mHandler.sendMessage(message);
    }

    public static void setIntValue(int i, int i2) {
        TTUploadLog.m148564d("TTUploadDNSParser", C1764a.m5928a("****set value:%d for key:%d", new Object[]{Integer.valueOf(i2), Integer.valueOf(i)}));
        if (i == 0) {
            mGlobalMainType = i2;
        } else if (i == 1) {
            mGlobalBackType = i2;
        } else if (i == 2) {
            mGlobalDefaultExpiredTime = i2;
        } else if (i == 3) {
            mGlobalBackUpDelayedTime = i2;
        }
    }

    /* JADX INFO: finally extract failed */
    private void removeListenerInternal(String str, TTUploadDNSParserListener tTUploadDNSParserListener) {
        if (!TextUtils.isEmpty(str) && tTUploadDNSParserListener != null) {
            TTUploadLog.m148564d("TTUploadDNSParser", C1764a.m5928a("---remove listener:%s for host:%s", new Object[]{tTUploadDNSParserListener, str}));
            this.mLock.lock();
            try {
                TTUploadHostProcessor tTUploadHostProcessor = this.mProcessors.get(str);
                TTUploadLog.m148564d("TTUploadDNSParser", C1764a.m5928a("get processor:%s", new Object[]{tTUploadHostProcessor}));
                if (tTUploadHostProcessor != null) {
                    TTUploadLog.m148564d("TTUploadDNSParser", C1764a.m5928a("remove listener", new Object[0]));
                    tTUploadHostProcessor.mListeners.remove(tTUploadDNSParserListener);
                    if (tTUploadHostProcessor.mListeners.size() == 0) {
                        TTUploadLog.m148564d("TTUploadDNSParser", C1764a.m5928a("listeners empty remove host from processors", new Object[0]));
                        this.mProcessors.remove(str);
                    }
                }
                this.mLock.unlock();
                TTUploadLog.m148564d("TTUploadDNSParser", C1764a.m5928a("****end remove listener", new Object[0]));
            } catch (Throwable th) {
                this.mLock.unlock();
                throw th;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public void processParseMsg(int i, TTUploadDNSInfo tTUploadDNSInfo) {
        if (tTUploadDNSInfo == null || tTUploadDNSInfo.mHost == null) {
            TTUploadLog.m148564d("TTUploadDNSParser", C1764a.m5928a("proc parser msg  fail, info or host is null", new Object[0]));
            return;
        }
        TTUploadLog.m148564d("TTUploadDNSParser", C1764a.m5928a("----proc parser msg what:%d host:%s", new Object[]{Integer.valueOf(i), tTUploadDNSInfo.mHost}));
        this.mLock.lock();
        try {
            TTUploadHostProcessor tTUploadHostProcessor = this.mProcessors.get(tTUploadDNSInfo.mHost);
            if (tTUploadHostProcessor != null) {
                TTUploadLog.m148564d("TTUploadDNSParser", C1764a.m5928a("----get processor:%s host:%s", new Object[]{tTUploadHostProcessor, tTUploadDNSInfo.mHost}));
                tTUploadHostProcessor.processMsg(i, tTUploadDNSInfo);
            } else {
                TTUploadLog.m148564d("TTUploadDNSParser", C1764a.m5928a("****get processor null for host:%s", new Object[]{tTUploadDNSInfo.mHost}));
            }
            this.mLock.unlock();
            TTUploadLog.m148564d("TTUploadDNSParser", C1764a.m5928a("****end proc parser msg", new Object[0]));
        } catch (Throwable th) {
            this.mLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    private void addListenerInternal(String str, TTUploadDNSParserListener tTUploadDNSParserListener) {
        boolean z;
        if (!TextUtils.isEmpty(str)) {
            TTUploadLog.m148564d("TTUploadDNSParser", C1764a.m5928a("---add listener:%s for host:%s", new Object[]{tTUploadDNSParserListener, str}));
            this.mLock.lock();
            try {
                TTUploadHostProcessor tTUploadHostProcessor = this.mProcessors.get(str);
                TTUploadLog.m148564d("TTUploadDNSParser", C1764a.m5928a("get processor:%s", new Object[]{tTUploadHostProcessor}));
                if (tTUploadHostProcessor == null) {
                    tTUploadHostProcessor = new TTUploadHostProcessor(str, this.mHandler, mGlobalMainType, mGlobalBackType, mGlobalBackUpDelayedTime);
                    TTUploadLog.m148564d("TTUploadDNSParser", C1764a.m5928a("create processor:%s", new Object[]{tTUploadHostProcessor}));
                    z = true;
                } else {
                    z = false;
                }
                if (tTUploadDNSParserListener != null && !tTUploadHostProcessor.mListeners.containsKey(tTUploadDNSParserListener)) {
                    TTUploadLog.m148564d("TTUploadDNSParser", C1764a.m5928a("add listener", new Object[0]));
                    tTUploadHostProcessor.mListeners.put(tTUploadDNSParserListener, 1);
                }
                this.mProcessors.put(str, tTUploadHostProcessor);
                if (z) {
                    TTUploadLog.m148564d("TTUploadDNSParser", C1764a.m5928a("new processor implement parse", new Object[0]));
                    tTUploadHostProcessor.processMsg(0, new TTUploadDNSInfo(mGlobalMainType, str, null, 0, null));
                }
                this.mLock.unlock();
                TTUploadLog.m148564d("TTUploadDNSParser", C1764a.m5928a("****end add listener", new Object[0]));
            } catch (Throwable th) {
                this.mLock.unlock();
                throw th;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public void proccessFailMsg(int i, TTUploadDNSInfo tTUploadDNSInfo) {
        if (tTUploadDNSInfo == null || tTUploadDNSInfo.mHost == null) {
            TTUploadLog.m148564d("TTUploadDNSParser", C1764a.m5928a("proc fail msg  fail, info or host is null", new Object[0]));
            return;
        }
        TTUploadLog.m148564d("TTUploadDNSParser", C1764a.m5928a("----proc fail msg what:%d host:%s", new Object[]{Integer.valueOf(i), tTUploadDNSInfo.mHost}));
        this.mLock.lock();
        try {
            TTUploadHostProcessor tTUploadHostProcessor = this.mProcessors.get(tTUploadDNSInfo.mHost);
            TTUploadLog.m148564d("TTUploadDNSParser", C1764a.m5928a("get processor:%s host:%s", new Object[]{tTUploadHostProcessor, tTUploadDNSInfo.mHost}));
            if (tTUploadHostProcessor != null && tTUploadHostProcessor.isValidSourceId(tTUploadDNSInfo.mId)) {
                tTUploadHostProcessor.processResult(i, tTUploadDNSInfo);
                if (tTUploadHostProcessor.isEnd()) {
                    TTUploadLog.m148564d("TTUploadDNSParser", C1764a.m5928a("processor end, notify result", new Object[0]));
                    for (TTUploadDNSParserListener tTUploadDNSParserListener : tTUploadHostProcessor.mListeners.keySet()) {
                        if (tTUploadDNSParserListener != null) {
                            TTUploadLog.m148564d("TTUploadDNSParser", C1764a.m5928a("listener:%s oncompletion fail", new Object[]{tTUploadDNSParserListener}));
                            tTUploadDNSParserListener.onCompletion(0, tTUploadDNSInfo.mHost, null, 0, null);
                        }
                    }
                    tTUploadHostProcessor.mListeners.clear();
                    this.mProcessors.remove(tTUploadDNSInfo.mHost);
                } else {
                    TTUploadLog.m148564d("TTUploadDNSParser", C1764a.m5928a("processor is not end", new Object[0]));
                }
            }
            this.mLock.unlock();
            TTUploadLog.m148564d("TTUploadDNSParser", C1764a.m5928a("****end proc fail msg what", new Object[0]));
        } catch (Throwable th) {
            this.mLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public void proccessSucMsg(int i, TTUploadDNSInfo tTUploadDNSInfo) {
        if (tTUploadDNSInfo == null || tTUploadDNSInfo.mHost == null) {
            TTUploadLog.m148564d("TTUploadDNSParser", C1764a.m5928a("proc suc msg  fail, info or host is null", new Object[0]));
            return;
        }
        TTUploadLog.m148564d("TTUploadDNSParser", C1764a.m5928a("----proc suc msg what:%d host:%s", new Object[]{Integer.valueOf(i), tTUploadDNSInfo.mHost}));
        this.mLock.lock();
        try {
            TTUploadHostProcessor tTUploadHostProcessor = this.mProcessors.get(tTUploadDNSInfo.mHost);
            TTUploadLog.m148564d("TTUploadDNSParser", C1764a.m5928a("get processor:%s host:%s", new Object[]{tTUploadHostProcessor, tTUploadDNSInfo.mHost}));
            if (!(tTUploadHostProcessor == null || tTUploadHostProcessor.mListeners == null)) {
                for (TTUploadDNSParserListener tTUploadDNSParserListener : tTUploadHostProcessor.mListeners.keySet()) {
                    if (tTUploadDNSParserListener != null) {
                        TTUploadLog.m148564d("TTUploadDNSParser", C1764a.m5928a("listener:%s oncompletion suc", new Object[]{tTUploadDNSParserListener}));
                        tTUploadDNSParserListener.onCompletion(0, tTUploadDNSInfo.mHost, tTUploadDNSInfo.mIpList, tTUploadDNSInfo.mExpiredTime, null);
                    }
                }
                tTUploadHostProcessor.mListeners.clear();
                this.mProcessors.remove(tTUploadDNSInfo.mHost);
                TTUploadLog.m148564d("TTUploadDNSParser", C1764a.m5928a("remove all listeners and remove host", new Object[0]));
            }
            this.mLock.unlock();
            TTUploadLog.m148564d("TTUploadDNSParser", C1764a.m5928a("****end proc suc msg", new Object[0]));
        } catch (Throwable th) {
            this.mLock.unlock();
            throw th;
        }
    }
}
