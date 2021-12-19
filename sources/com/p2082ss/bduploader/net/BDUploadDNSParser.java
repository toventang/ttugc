package com.p2082ss.bduploader.net;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.bduploader.BDUploadLog;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.ss.bduploader.net.BDUploadDNSParser */
public class BDUploadDNSParser {
    public static int mGlobalBackType = 2;
    public static int mGlobalBackUpDelayedTime;
    public static int mGlobalDefaultExpiredTime = 60;
    public static int mGlobalMainType;
    private static BDUploadDNSParser mInstance;
    private Handler mHandler;
    private Lock mLock = new ReentrantLock();
    private Map<String, BDUploadHostProcessor> mProcessors = new HashMap();
    private int mRefCount;
    private int mState;
    private HandlerThread mThread;
    private int mTimeOut = 5;
    private int mType;

    public void release() {
    }

    static {
        Covode.recordClassIndex(100819);
    }

    public BDUploadDNSParser() {
        HandlerThread handlerThread = new HandlerThread("BDUploadDNSParser");
        this.mThread = handlerThread;
        handlerThread.start();
        this.mHandler = new Handler(this.mThread.getLooper()) {
            /* class com.p2082ss.bduploader.net.BDUploadDNSParser.HandlerC860661 */

            static {
                Covode.recordClassIndex(100820);
            }

            public void handleMessage(Message message) {
                BDUploadDNSInfo bDUploadDNSInfo;
                if (message.obj != null) {
                    bDUploadDNSInfo = (BDUploadDNSInfo) message.obj;
                } else {
                    bDUploadDNSInfo = null;
                }
                BDUploadLog.m147836d("BDUploadDNSParser", C1764a.m5928a("----receive msg what:%d info:%s", new Object[]{Integer.valueOf(message.what), bDUploadDNSInfo}));
                int i = message.what;
                if (i == 1) {
                    BDUploadDNSParser.this.processParseMsg(message.what, bDUploadDNSInfo);
                } else if (i == 2) {
                    BDUploadDNSParser.this.proccessFailMsg(message.what, bDUploadDNSInfo);
                } else if (i == 3) {
                    BDUploadDNSParser.this.proccessSucMsg(message.what, bDUploadDNSInfo);
                }
                BDUploadLog.m147836d("BDUploadDNSParser", C1764a.m5928a("****end proc msg what:%d info:%s", new Object[]{Integer.valueOf(message.what), bDUploadDNSInfo}));
            }
        };
    }

    public static BDUploadDNSParser getInstance() {
        MethodCollector.m26663i(6660);
        if (mInstance == null) {
            synchronized (BDUploadDNSParser.class) {
                try {
                    if (mInstance == null) {
                        mInstance = new BDUploadDNSParser();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6660);
                    throw th;
                }
            }
        }
        BDUploadDNSParser bDUploadDNSParser = mInstance;
        MethodCollector.m26664o(6660);
        return bDUploadDNSParser;
    }

    public void addHost(String str, BDUploadDNSParserListener bDUploadDNSParserListener) {
        addListenerInternal(str, bDUploadDNSParserListener);
    }

    public void removeHost(String str, BDUploadDNSParserListener bDUploadDNSParserListener) {
        removeListenerInternal(str, bDUploadDNSParserListener);
    }

    public void postParseHostMsg(String str, int i) {
        BDUploadDNSInfo bDUploadDNSInfo = new BDUploadDNSInfo(i, str, null, 0, null);
        Message message = new Message();
        message.what = 0;
        message.obj = bDUploadDNSInfo;
        this.mHandler.sendMessage(message);
    }

    public static void setIntValue(int i, int i2) {
        BDUploadLog.m147836d("BDUploadDNSParser", C1764a.m5928a("****set value:%d for key:%d", new Object[]{Integer.valueOf(i2), Integer.valueOf(i)}));
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
    private void removeListenerInternal(String str, BDUploadDNSParserListener bDUploadDNSParserListener) {
        if (!TextUtils.isEmpty(str) && bDUploadDNSParserListener != null) {
            BDUploadLog.m147836d("BDUploadDNSParser", C1764a.m5928a("---remove listener:%s for host:%s", new Object[]{bDUploadDNSParserListener, str}));
            this.mLock.lock();
            try {
                BDUploadHostProcessor bDUploadHostProcessor = this.mProcessors.get(str);
                BDUploadLog.m147836d("BDUploadDNSParser", C1764a.m5928a("get processor:%s", new Object[]{bDUploadHostProcessor}));
                if (bDUploadHostProcessor != null) {
                    BDUploadLog.m147836d("BDUploadDNSParser", C1764a.m5928a("remove listener", new Object[0]));
                    bDUploadHostProcessor.mListeners.remove(bDUploadDNSParserListener);
                    if (bDUploadHostProcessor.mListeners.size() == 0) {
                        BDUploadLog.m147836d("BDUploadDNSParser", C1764a.m5928a("listeners empty remove host from processors", new Object[0]));
                        this.mProcessors.remove(str);
                    }
                }
                this.mLock.unlock();
                BDUploadLog.m147836d("BDUploadDNSParser", C1764a.m5928a("****end remove listener", new Object[0]));
            } catch (Throwable th) {
                this.mLock.unlock();
                throw th;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public void processParseMsg(int i, BDUploadDNSInfo bDUploadDNSInfo) {
        if (bDUploadDNSInfo == null || bDUploadDNSInfo.mHost == null) {
            BDUploadLog.m147836d("BDUploadDNSParser", C1764a.m5928a("proc parser msg  fail, info or host is null", new Object[0]));
            return;
        }
        BDUploadLog.m147836d("BDUploadDNSParser", C1764a.m5928a("----proc parser msg what:%d host:%s", new Object[]{Integer.valueOf(i), bDUploadDNSInfo.mHost}));
        this.mLock.lock();
        try {
            BDUploadHostProcessor bDUploadHostProcessor = this.mProcessors.get(bDUploadDNSInfo.mHost);
            if (bDUploadHostProcessor != null) {
                BDUploadLog.m147836d("BDUploadDNSParser", C1764a.m5928a("----get processor:%s host:%s", new Object[]{bDUploadHostProcessor, bDUploadDNSInfo.mHost}));
                bDUploadHostProcessor.processMsg(i, bDUploadDNSInfo);
            } else {
                BDUploadLog.m147836d("BDUploadDNSParser", C1764a.m5928a("****get processor null for host:%s", new Object[]{bDUploadDNSInfo.mHost}));
            }
            this.mLock.unlock();
            BDUploadLog.m147836d("BDUploadDNSParser", C1764a.m5928a("****end proc parser msg", new Object[0]));
        } catch (Throwable th) {
            this.mLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    private void addListenerInternal(String str, BDUploadDNSParserListener bDUploadDNSParserListener) {
        boolean z;
        if (!TextUtils.isEmpty(str)) {
            BDUploadLog.m147836d("BDUploadDNSParser", C1764a.m5928a("---add listener:%s for host:%s", new Object[]{bDUploadDNSParserListener, str}));
            this.mLock.lock();
            try {
                BDUploadHostProcessor bDUploadHostProcessor = this.mProcessors.get(str);
                BDUploadLog.m147836d("BDUploadDNSParser", C1764a.m5928a("get processor:%s", new Object[]{bDUploadHostProcessor}));
                if (bDUploadHostProcessor == null) {
                    bDUploadHostProcessor = new BDUploadHostProcessor(str, this.mHandler, mGlobalMainType, mGlobalBackType, mGlobalBackUpDelayedTime);
                    BDUploadLog.m147836d("BDUploadDNSParser", C1764a.m5928a("create processor:%s", new Object[]{bDUploadHostProcessor}));
                    z = true;
                } else {
                    z = false;
                }
                if (bDUploadDNSParserListener != null && !bDUploadHostProcessor.mListeners.containsKey(bDUploadDNSParserListener)) {
                    BDUploadLog.m147836d("BDUploadDNSParser", C1764a.m5928a("add listener", new Object[0]));
                    bDUploadHostProcessor.mListeners.put(bDUploadDNSParserListener, 1);
                }
                this.mProcessors.put(str, bDUploadHostProcessor);
                if (z) {
                    BDUploadLog.m147836d("BDUploadDNSParser", C1764a.m5928a("new processor implement parse", new Object[0]));
                    bDUploadHostProcessor.processMsg(0, new BDUploadDNSInfo(mGlobalMainType, str, null, 0, null));
                }
                this.mLock.unlock();
                BDUploadLog.m147836d("BDUploadDNSParser", C1764a.m5928a("****end add listener", new Object[0]));
            } catch (Throwable th) {
                this.mLock.unlock();
                throw th;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public void proccessFailMsg(int i, BDUploadDNSInfo bDUploadDNSInfo) {
        if (bDUploadDNSInfo == null || bDUploadDNSInfo.mHost == null) {
            BDUploadLog.m147836d("BDUploadDNSParser", C1764a.m5928a("proc fail msg  fail, info or host is null", new Object[0]));
            return;
        }
        BDUploadLog.m147836d("BDUploadDNSParser", C1764a.m5928a("----proc fail msg what:%d host:%s", new Object[]{Integer.valueOf(i), bDUploadDNSInfo.mHost}));
        this.mLock.lock();
        try {
            BDUploadHostProcessor bDUploadHostProcessor = this.mProcessors.get(bDUploadDNSInfo.mHost);
            BDUploadLog.m147836d("BDUploadDNSParser", C1764a.m5928a("get processor:%s host:%s", new Object[]{bDUploadHostProcessor, bDUploadDNSInfo.mHost}));
            if (bDUploadHostProcessor != null && bDUploadHostProcessor.isValidSourceId(bDUploadDNSInfo.mId)) {
                bDUploadHostProcessor.processResult(i, bDUploadDNSInfo);
                if (bDUploadHostProcessor.isEnd()) {
                    BDUploadLog.m147836d("BDUploadDNSParser", C1764a.m5928a("processor end, notify result", new Object[0]));
                    for (BDUploadDNSParserListener bDUploadDNSParserListener : bDUploadHostProcessor.mListeners.keySet()) {
                        if (bDUploadDNSParserListener != null) {
                            BDUploadLog.m147836d("BDUploadDNSParser", C1764a.m5928a("listener:%s oncompletion fail", new Object[]{bDUploadDNSParserListener}));
                            bDUploadDNSParserListener.onCompletion(0, bDUploadDNSInfo.mHost, null, 0, null);
                        }
                    }
                    bDUploadHostProcessor.mListeners.clear();
                    this.mProcessors.remove(bDUploadDNSInfo.mHost);
                } else {
                    BDUploadLog.m147836d("BDUploadDNSParser", C1764a.m5928a("processor is not end", new Object[0]));
                }
            }
            this.mLock.unlock();
            BDUploadLog.m147836d("BDUploadDNSParser", C1764a.m5928a("****end proc fail msg what", new Object[0]));
        } catch (Throwable th) {
            this.mLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public void proccessSucMsg(int i, BDUploadDNSInfo bDUploadDNSInfo) {
        if (bDUploadDNSInfo == null || bDUploadDNSInfo.mHost == null) {
            BDUploadLog.m147836d("BDUploadDNSParser", C1764a.m5928a("proc suc msg  fail, info or host is null", new Object[0]));
            return;
        }
        BDUploadLog.m147836d("BDUploadDNSParser", C1764a.m5928a("----proc suc msg what:%d host:%s", new Object[]{Integer.valueOf(i), bDUploadDNSInfo.mHost}));
        this.mLock.lock();
        try {
            BDUploadHostProcessor bDUploadHostProcessor = this.mProcessors.get(bDUploadDNSInfo.mHost);
            BDUploadLog.m147836d("BDUploadDNSParser", C1764a.m5928a("get processor:%s host:%s", new Object[]{bDUploadHostProcessor, bDUploadDNSInfo.mHost}));
            if (!(bDUploadHostProcessor == null || bDUploadHostProcessor.mListeners == null)) {
                for (BDUploadDNSParserListener bDUploadDNSParserListener : bDUploadHostProcessor.mListeners.keySet()) {
                    if (bDUploadDNSParserListener != null) {
                        BDUploadLog.m147836d("BDUploadDNSParser", C1764a.m5928a("listener:%s oncompletion suc", new Object[]{bDUploadDNSParserListener}));
                        bDUploadDNSParserListener.onCompletion(0, bDUploadDNSInfo.mHost, bDUploadDNSInfo.mIpList, bDUploadDNSInfo.mExpiredTime, null);
                    }
                }
                bDUploadHostProcessor.mListeners.clear();
                this.mProcessors.remove(bDUploadDNSInfo.mHost);
                BDUploadLog.m147836d("BDUploadDNSParser", C1764a.m5928a("remove all listeners and remove host", new Object[0]));
            }
            this.mLock.unlock();
            BDUploadLog.m147836d("BDUploadDNSParser", C1764a.m5928a("****end proc suc msg", new Object[0]));
        } catch (Throwable th) {
            this.mLock.unlock();
            throw th;
        }
    }
}
