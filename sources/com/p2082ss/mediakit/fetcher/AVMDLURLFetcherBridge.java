package com.p2082ss.mediakit.fetcher;

import android.text.TextUtils;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.mediakit.medialoader.AVMDLLog;
import java.util.Locale;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.ss.mediakit.fetcher.AVMDLURLFetcherBridge */
public class AVMDLURLFetcherBridge implements AVMDLURLFetcherListener {
    private static AVMDLFetcherMakerInterface fetcherMaker;
    private static AVMDLNewFetcherMakerInterface newFetcherMaker;
    private static int sJniVersion = 2;
    public String engineId;
    private AVMDLURLFetcherInterface fetcherInstance;
    public String fileKey;
    private long handle = 0;
    boolean isFinish;
    private Lock lock = new ReentrantLock();
    String newURL;
    public String oldURL;
    public String rawKey;

    private static native void _notifyFetcherResult(long j, String str, String str2, String str3);

    private static native void _notifyFetcherResult(long j, String str, String str2, String str3, int i);

    /* access modifiers changed from: package-private */
    public boolean isFinish() {
        return this.isFinish;
    }

    static {
        Covode.recordClassIndex(101199);
    }

    /* JADX INFO: finally extract failed */
    public String getResult() {
        this.lock.lock();
        try {
            String str = this.newURL;
            this.lock.unlock();
            AVMDLLog.m147905d("AVMDLURLFetcherBridge", "****get result:".concat(String.valueOf(str)));
            return str;
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public void release() {
        AVMDLLog.m147905d("AVMDLURLFetcherBridge", C1764a.m5928a("----start release fetcher:%s", new Object[]{this}));
        this.lock.lock();
        try {
            this.handle = 0;
            this.lock.unlock();
            AVMDLLog.m147905d("AVMDLURLFetcherBridge", C1764a.m5928a("remove fetcher rawkey:%s, fileKey:%s", new Object[]{this.rawKey, this.fileKey}));
            AVMDLLog.m147905d("AVMDLURLFetcherBridge", C1764a.m5928a("****end call release:%s", new Object[]{this}));
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }

    public static void setFetcherMaker(AVMDLFetcherMakerInterface aVMDLFetcherMakerInterface) {
        if (aVMDLFetcherMakerInterface != null) {
            fetcherMaker = aVMDLFetcherMakerInterface;
        }
    }

    public static void setNewFetcherMaker(AVMDLNewFetcherMakerInterface aVMDLNewFetcherMakerInterface) {
        if (aVMDLNewFetcherMakerInterface != null) {
            newFetcherMaker = aVMDLNewFetcherMakerInterface;
        }
    }

    /* access modifiers changed from: package-private */
    public int getNewUrl(AVMDLURLFetcherInterface aVMDLURLFetcherInterface, String str, String str2, String str3) {
        MethodCollector.m26663i(9542);
        this.rawKey = str;
        this.fileKey = str2;
        this.oldURL = str3;
        int start = aVMDLURLFetcherInterface.start(str, str2, str3, this);
        int i = 1;
        if (start > 0) {
            String[] uRLs = aVMDLURLFetcherInterface.getURLs();
            if (uRLs == null || uRLs.length == 0) {
                AVMDLLog.m147905d("AVMDLURLFetcherBridge", C1764a.m5929a(Locale.ENGLISH, "****end fail start ret:%d, but getURLs null", new Object[]{Integer.valueOf(start)}));
                MethodCollector.m26664o(9542);
                return -2;
            } else if (this.handle != 0) {
                this.newURL = uRLs[0];
                AVMDLLog.m147905d("AVMDLURLFetcherBridge", "start notify result");
                if (sJniVersion == 2) {
                    try {
                        _notifyFetcherResult(this.handle, str, str2, uRLs[0], 1);
                    } catch (UnsatisfiedLinkError unused) {
                        sJniVersion = 1;
                    }
                }
                if (sJniVersion == 1) {
                    _notifyFetcherResult(this.handle, str, str2, uRLs[0]);
                }
                AVMDLLog.m147905d("AVMDLURLFetcherBridge", "end notify result");
                MethodCollector.m26664o(9542);
                return i;
            }
        }
        i = 0;
        MethodCollector.m26664o(9542);
        return i;
    }

    @Override // com.p2082ss.mediakit.fetcher.AVMDLURLFetcherListener
    public void onCompletion(int i, String str, String str2, String[] strArr) {
        MethodCollector.m26663i(9694);
        this.lock.lock();
        try {
            if (!this.isFinish) {
                if (strArr != null && strArr.length > 0) {
                    this.newURL = strArr[0];
                }
                AVMDLLog.m147905d("AVMDLURLFetcherBridge", C1764a.m5929a(Locale.ENGLISH, "receive completion code:%d result:%s", new Object[]{Integer.valueOf(i), this.newURL}));
                this.isFinish = true;
                if (this.handle != 0) {
                    AVMDLLog.m147905d("AVMDLURLFetcherBridge", "start notify result");
                    if (sJniVersion == 2) {
                        try {
                            _notifyFetcherResult(this.handle, str, str2, this.newURL, i);
                        } catch (UnsatisfiedLinkError unused) {
                            sJniVersion = 1;
                        }
                    }
                    if (sJniVersion == 1) {
                        _notifyFetcherResult(this.handle, str, str2, this.newURL);
                    }
                    AVMDLLog.m147905d("AVMDLURLFetcherBridge", "end notify result");
                }
            } else {
                AVMDLLog.m147905d("AVMDLURLFetcherBridge", C1764a.m5929a(Locale.ENGLISH, "has fetch finished not need cur completion code:%d result:%s", new Object[]{Integer.valueOf(i), this.newURL}));
            }
        } finally {
            this.lock.unlock();
            MethodCollector.m26664o(9694);
        }
    }

    public int start(long j, String str, String str2, String str3) {
        int i;
        AVMDLLog.m147905d("AVMDLURLFetcherBridge", "----old api fallback retry Jni");
        AVMDLLog.m147905d("AVMDLURLFetcherBridge", "----start fetch rawkey:".concat(String.valueOf(str)));
        if (fetcherMaker == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            AVMDLLog.m147905d("AVMDLURLFetcherBridge", "****end fetch fail,fetcherMaker is null or rawky or filekey or originurl is null");
            return -1;
        }
        AVMDLLog.m147905d("AVMDLURLFetcherBridge", "----old api fallback retry engine");
        this.lock.lock();
        this.handle = j;
        try {
            AVMDLURLFetcherInterface fetcher = fetcherMaker.getFetcher(str, str2, str3);
            this.fetcherInstance = fetcher;
            if (fetcher == null) {
                AVMDLLog.m147905d("AVMDLURLFetcherBridge", "****fail, get fetcher is null");
                this.lock.unlock();
                return -1;
            }
            i = getNewUrl(fetcher, str, str2, str3);
            this.lock.unlock();
            AVMDLLog.m147905d("AVMDLURLFetcherBridge", C1764a.m5929a(Locale.ENGLISH, "****call start end, result:%d", new Object[]{Integer.valueOf(i)}));
            return i;
        } catch (Exception e) {
            AVMDLLog.m147905d("AVMDLURLFetcherBridge", C1764a.m5929a(Locale.ENGLISH, "****call start failed, get exception: %s", new Object[]{e.toString()}));
            i = -999;
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }

    public int start(long j, String str, String str2, String str3, String str4) {
        int i;
        AVMDLLog.m147905d("AVMDLURLFetcherBridge", "----new api fallback retry Jni");
        AVMDLLog.m147905d("AVMDLURLFetcherBridge", "----start fetch rawkey:".concat(String.valueOf(str)));
        AVMDLLog.m147905d("AVMDLURLFetcherBridge", "----start fetch engineID is:".concat(String.valueOf(str4)));
        if (newFetcherMaker != null) {
            AVMDLLog.m147905d("AVMDLURLFetcherBridge", "----new api fallback retry engine");
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
                AVMDLLog.m147905d("AVMDLURLFetcherBridge", "****end fetch fail,fetcherMaker is null or rawky or filekey or originurl or engineId is null");
                return -1;
            }
            this.lock.lock();
            this.handle = j;
            try {
                this.engineId = str4;
                AVMDLURLFetcherInterface fetcher = newFetcherMaker.getFetcher(str, str2, str3, str4);
                this.fetcherInstance = fetcher;
                if (fetcher == null) {
                    AVMDLLog.m147905d("AVMDLURLFetcherBridge", "****fail, get fetcher is null");
                    this.lock.unlock();
                    return -1;
                }
                i = getNewUrl(fetcher, str, str2, str3);
                this.lock.unlock();
                AVMDLLog.m147905d("AVMDLURLFetcherBridge", C1764a.m5929a(Locale.ENGLISH, "****call start end, result:%d", new Object[]{Integer.valueOf(i)}));
                return i;
            } catch (Exception e) {
                AVMDLLog.m147905d("AVMDLURLFetcherBridge", C1764a.m5929a(Locale.ENGLISH, "****call start failed, get exception: %s", new Object[]{e.toString()}));
                i = -999;
            } catch (Throwable th) {
                this.lock.unlock();
                throw th;
            }
        } else {
            AVMDLLog.m147905d("AVMDLURLFetcherBridge", "----old api fallback retry engine");
            return start(j, str, str2, str3);
        }
    }
}
