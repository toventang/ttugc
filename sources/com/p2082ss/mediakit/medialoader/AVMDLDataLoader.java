package com.p2082ss.mediakit.medialoader;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.librarian.Librarian;
import com.bytedance.p967e.p968a.C14485a;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.mediakit.net.AVMDLDNSInfo;
import com.p2082ss.mediakit.net.AVMDLDNSParser;
import com.p2082ss.mediakit.net.AVMDLMultiNetwork;
import com.p2082ss.mediakit.net.IPCache;
import com.p2082ss.mediakit.vcnlib.VcnlibloadWrapper;
import java.io.File;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.ss.mediakit.medialoader.AVMDLDataLoader */
public class AVMDLDataLoader implements Handler.Callback {
    private static boolean isSupportQueryEncode = true;
    private static Context mGlobalApplicationContext;
    private static AVMDLDataLoader mInstance;
    private static volatile boolean mIsLibraryLoaded;
    private static volatile boolean mIsMdlTtnetPluginLoaded;
    private boolean isSupportGetAuth;
    private AVMDLDataLoaderConfigure mConfigure;
    private long mEndTime;
    private LoaderListener mEventListener;
    private long mHandle;
    private Handler mHandler;
    private AVMDLDataLoaderListener mLiveListener;
    public Handler mLogHandler;
    private Thread mMsgThread;
    private final ReentrantReadWriteLock.ReadLock mReadLock;
    private final ReentrantReadWriteLock mReadWritedLock;
    private long mSartTime;
    private AVMDLStartCompleteListener mStartCompleteListener;
    private volatile int mState = -1;
    private AVMDLDataLoaderListener mVodListener;
    private Map<String, AVMDLCopyOperation> mWaitingCopyItem;
    private final ReentrantReadWriteLock.WriteLock mWriteLock;

    private static native void _addDataSource(long j, int i, String str);

    private static native void _cancel(long j, String str);

    private static native void _cancelAll(long j);

    private static native void _cancelAllPreloadWaitReqs(long j);

    private static native void _clearAllCaches(long j);

    private static native void _clearCachesByUsedTime(long j, long j2);

    private static native void _clearNetinfoCache(long j);

    private static native void _close(long j);

    private static native int _copyFile(long j, String str, String str2);

    private final native long _create();

    private static native void _downloadResource(long j, String str);

    private static native String _encodeUrl(String str, int i);

    private static native void _forceRemoveCacheFile(long j, String str);

    private static native String _getAuth(long j, String str);

    private static native String _getCDNLog(long j, String str);

    private static native int _getIsFileCacheComplete(long j, String str);

    private static native long _getLongValue(long j, int i);

    private static native long _getLongValueByStr(long j, String str, int i);

    private static native long _getLongValueByStrStr(long j, String str, String str2, int i);

    private static native String _getStringValue(long j, int i);

    private static native String _getStringValueByStr(long j, String str, int i);

    private static native String _getStringValueByStrStr(long j, String str, String str2, int i);

    private static native void _makeFileAutoDeleteFlag(long j, String str, int i);

    private static native String _makeTsFileKey(String str, String str2);

    private static native int _onCellularAlwaysUp(long j, long j2, int i);

    private static native int _onInitMultiNetworkEnv(long j, int i);

    private static native void _p2pPredown(long j, String str);

    private static native void _preConnectByHost(long j, String str, int i);

    private static native void _preloadGroupResource(long j, String str, String str2, int i, int i2);

    private static native void _preloadResource(long j, String str, int i);

    private static native void _preloadResourceWithOffset(long j, String str, int i, int i2);

    private static native void _removeCacheFile(long j, String str);

    private static native void _resumeFileWriteIO(long j);

    private static native void _setInt64Value(long j, int i, long j2);

    private static native void _setInt64ValueByStrKey(long j, int i, String str, long j2);

    private static native void _setIntValue(long j, int i, int i2);

    private static native void _setStringValue(long j, int i, String str);

    private static native int _start(long j);

    private static native void _stop(long j);

    private static native void _suspendedDownload(long j, String str);

    private static native int _tryDownloadPlayReqByKey(long j, String str);

    private static native void _updateDNSInfo(long j, String str, String str2, long j2, String str3, int i);

    /* renamed from: com_ss_mediakit_medialoader_AVMDLDataLoader_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m147899x73ef00fe(String str, String str2) {
        return 0;
    }

    private boolean isNotifyInfo(int i) {
        return i == 4 || i == 20 || i == 50 || i == 8 || i == 3 || i == 21 || i == 51 || i == 7 || i == 22 || i == 52 || i == 901 || i == 24;
    }

    public boolean isRunning() {
        if (this.mState == 1) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(101205);
    }

    public static Context getApplicationContext() {
        Context context;
        MethodCollector.m26663i(13158);
        synchronized (AVMDLDataLoader.class) {
            try {
                context = mGlobalApplicationContext;
            } finally {
                MethodCollector.m26664o(13158);
            }
        }
        return context;
    }

    private void hijack() {
        AVMDLLog.m147905d("ttmn", "----hijack start");
        AVMDLDNSParser.processHijack();
        AVMDLLog.m147905d("ttmn", "hijack clear net cache: ");
        clearNetinfoCache();
        AVMDLLog.m147905d("ttmn", "****hijack end");
    }

    public static boolean tryLoadVcnverifylib() {
        if (!VcnlibloadWrapper.tryLoadVcnlib()) {
            m147899x73ef00fe("ttmn", "Can't load vcn ");
            AVMDLLog.m147905d("vcn", "load vcnverify fail");
            return false;
        }
        AVMDLLog.m147905d("vcn", "load vcnverify suc");
        return true;
    }

    public int start() {
        if (this.mState == 1) {
            return 0;
        }
        initNativeHandle();
        new Thread(new Runnable() {
            /* class com.p2082ss.mediakit.medialoader.AVMDLDataLoader.RunnableC861092 */

            static {
                Covode.recordClassIndex(101207);
            }

            public void run() {
                AVMDLDataLoader.this.startInternal();
            }
        }).start();
        return 0;
    }

    public static AVMDLDataLoader getInstance() {
        MethodCollector.m26663i(13160);
        if (mInstance == null) {
            synchronized (AVMDLDataLoader.class) {
                try {
                    if (mInstance == null) {
                        try {
                            mInstance = new AVMDLDataLoader(null);
                        } catch (Exception e) {
                            e.printStackTrace();
                            m147899x73ef00fe("ttmdl", "create native exception".concat(String.valueOf(e)));
                            mInstance = null;
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(13160);
                    throw th;
                }
            }
        }
        AVMDLDataLoader aVMDLDataLoader = mInstance;
        MethodCollector.m26664o(13160);
        return aVMDLDataLoader;
    }

    public static synchronized void loadAVMDLBaseLibrary() {
        synchronized (AVMDLDataLoader.class) {
            MethodCollector.m26663i(13343);
            try {
                m147898xf8671f56("avmdlbase");
                MethodCollector.m26664o(13343);
            } catch (UnsatisfiedLinkError e) {
                m147899x73ef00fe("ttmn", "Can't load avmdlbase library: ".concat(String.valueOf(e)));
                MethodCollector.m26664o(13343);
            } catch (Throwable th) {
                m147899x73ef00fe("ttmn", "other exception when loading avmdlbase library: ".concat(String.valueOf(th)));
                MethodCollector.m26664o(13343);
            }
        }
    }

    public static synchronized boolean tryLoadTTNetLoaderPlugin() {
        boolean z;
        synchronized (AVMDLDataLoader.class) {
            MethodCollector.m26663i(13344);
            if (!mIsMdlTtnetPluginLoaded) {
                try {
                    m147898xf8671f56("avmdlttnet");
                    mIsMdlTtnetPluginLoaded = true;
                } catch (UnsatisfiedLinkError e) {
                    m147899x73ef00fe("ttmn", "Can't load avmdl ttnet plugin library: ".concat(String.valueOf(e)));
                } catch (Throwable th) {
                    m147899x73ef00fe("ttmn", "other exception when loading avmdl ttnet plugin library: ".concat(String.valueOf(th)));
                }
            }
            z = mIsMdlTtnetPluginLoaded;
            MethodCollector.m26664o(13344);
        }
        return z;
    }

    public void cancelAll() {
        MethodCollector.m26663i(13591);
        if (this.mState != 1) {
            MethodCollector.m26664o(13591);
            return;
        }
        this.mWriteLock.lock();
        try {
            long j = this.mHandle;
            if (j != 0) {
                _cancelAll(j);
            }
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            MethodCollector.m26664o(13591);
            throw th;
        }
        this.mWriteLock.unlock();
        MethodCollector.m26664o(13591);
    }

    public void cancelAllPreloadWaitReqs() {
        MethodCollector.m26663i(13592);
        if (this.mState != 1) {
            MethodCollector.m26664o(13592);
            return;
        }
        this.mReadLock.lock();
        try {
            long j = this.mHandle;
            if (j != 0) {
                _cancelAllPreloadWaitReqs(j);
            }
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        } catch (Throwable th) {
            this.mReadLock.unlock();
            MethodCollector.m26664o(13592);
            throw th;
        }
        this.mReadLock.unlock();
        MethodCollector.m26664o(13592);
    }

    public void clearAllCaches() {
        MethodCollector.m26663i(13594);
        if (this.mState != 1) {
            MethodCollector.m26664o(13594);
            return;
        }
        this.mWriteLock.lock();
        try {
            long j = this.mHandle;
            if (j != 0) {
                _clearAllCaches(j);
            }
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            MethodCollector.m26664o(13594);
            throw th;
        }
        this.mWriteLock.unlock();
        MethodCollector.m26664o(13594);
    }

    public void clearNetinfoCache() {
        MethodCollector.m26663i(14082);
        if (this.mState != 1) {
            MethodCollector.m26664o(14082);
            return;
        }
        IPCache.getInstance().clear();
        this.mWriteLock.lock();
        try {
            _clearNetinfoCache(this.mHandle);
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            MethodCollector.m26664o(14082);
            throw th;
        }
        this.mWriteLock.unlock();
        MethodCollector.m26664o(14082);
    }

    public long getAllCacheSize() {
        MethodCollector.m26663i(14046);
        long j = -1;
        if (this.mState != 1) {
            MethodCollector.m26664o(14046);
            return -1;
        }
        this.mReadLock.lock();
        try {
            long j2 = this.mHandle;
            if (j2 != 0) {
                j = _getLongValue(j2, 100);
            }
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        } catch (Throwable th) {
            this.mReadLock.unlock();
            MethodCollector.m26664o(14046);
            throw th;
        }
        this.mReadLock.unlock();
        MethodCollector.m26664o(14046);
        return j;
    }

    public String getLocalAddr() {
        MethodCollector.m26663i(14031);
        String str = null;
        if (this.mState != 1) {
            MethodCollector.m26664o(14031);
            return null;
        }
        this.mReadLock.lock();
        try {
            long j = this.mHandle;
            if (j != 0) {
                str = _getStringValue(j, 4);
            }
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        } catch (Throwable th) {
            this.mReadLock.unlock();
            MethodCollector.m26664o(14031);
            throw th;
        }
        this.mReadLock.unlock();
        MethodCollector.m26664o(14031);
        return str;
    }

    public int onInitMultiNetworkEnv() {
        MethodCollector.m26663i(14172);
        AVMDLLog.m147905d("AVMDLDataLoader", "start on init multinetwork env");
        this.mWriteLock.lock();
        int i = -1;
        try {
            long j = this.mHandle;
            if (j != 0) {
                i = _onInitMultiNetworkEnv(j, Build.VERSION.SDK_INT);
            }
        } catch (Exception | UnsatisfiedLinkError unused) {
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            MethodCollector.m26664o(14172);
            throw th;
        }
        this.mWriteLock.unlock();
        AVMDLLog.m147905d("AVMDLDataLoader", "end on init multinetwork env");
        MethodCollector.m26664o(14172);
        return i;
    }

    public void resumeFileWriteIO() {
        MethodCollector.m26663i(14170);
        if (this.mState != 1) {
            MethodCollector.m26664o(14170);
            return;
        }
        AVMDLLog.m147905d("AVMDLDataLoader", "resume file write io: ");
        this.mWriteLock.lock();
        try {
            if (this.mConfigure.mMaxFileMemCacheSize > 0) {
                _resumeFileWriteIO(this.mHandle);
                this.mConfigure.mMaxFileMemCacheSize = 0;
            }
        } catch (Exception | UnsatisfiedLinkError unused) {
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            MethodCollector.m26664o(14170);
            throw th;
        }
        this.mWriteLock.unlock();
        MethodCollector.m26664o(14170);
    }

    public void stop() {
        MethodCollector.m26663i(13589);
        if (this.mState != 1) {
            MethodCollector.m26664o(13589);
            return;
        }
        this.mWriteLock.lock();
        try {
            long j = this.mHandle;
            if (j != 0) {
                _stop(j);
            }
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            MethodCollector.m26664o(13589);
            throw th;
        }
        this.mWriteLock.unlock();
        MethodCollector.m26664o(13589);
    }

    private void initNativeHandle() {
        MethodCollector.m26663i(13161);
        if (this.mHandle != 0) {
            MethodCollector.m26664o(13161);
            return;
        }
        try {
            this.mHandle = _create();
        } catch (Throwable unused) {
            this.mHandle = 0;
        }
        if (this.mHandle != 0 && this.mHandler == null) {
            if (Looper.myLooper() != null) {
                this.mHandler = new Handler(this);
                MethodCollector.m26664o(13161);
                return;
            }
            this.mHandler = new Handler(Looper.getMainLooper(), this);
        }
        MethodCollector.m26664o(13161);
    }

    public void close() {
        MethodCollector.m26663i(13590);
        if (this.mState != 1) {
            MethodCollector.m26664o(13590);
            return;
        }
        this.mWriteLock.lock();
        try {
            long j = this.mHandle;
            if (j != 0) {
                _close(j);
                this.mHandle = 0;
                this.mState = 5;
                Handler handler = this.mHandler;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                    this.mHandler = null;
                }
                Handler handler2 = this.mLogHandler;
                if (handler2 != null) {
                    handler2.removeCallbacksAndMessages(null);
                    this.mLogHandler.getLooper().quit();
                    this.mLogHandler = null;
                    this.mMsgThread = null;
                }
            }
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            MethodCollector.m26664o(13590);
            throw th;
        }
        this.mWriteLock.unlock();
        MethodCollector.m26664o(13590);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008f, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0090, code lost:
        r12 = 0.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        com.p2082ss.mediakit.medialoader.AVMDLLog.m147905d("BENCHMARKIO", "test fileio exception:".concat(java.lang.String.valueOf(r2)));
        r2.printStackTrace();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b6 A[Catch:{ Exception -> 0x00bd, all -> 0x00c7 }, LOOP:0: B:15:0x0070->B:33:0x00b6, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b7 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int testFileIOSpeed() {
        /*
        // Method dump skipped, instructions count: 216
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.mediakit.medialoader.AVMDLDataLoader.testFileIOSpeed():int");
    }

    public void startInternal() {
        MethodCollector.m26663i(13540);
        this.mWriteLock.lock();
        try {
            if (this.mState != 1) {
                initLogThread(this);
                if (this.mHandle != 0) {
                    setConfigureInternal(this.mConfigure);
                    if (_start(this.mHandle) >= 0) {
                        this.mState = 1;
                    }
                }
            }
            this.mWriteLock.unlock();
            if (this.mConfigure.mEnableBenchMarkIOSpeed > 0) {
                int testFileIOSpeed = testFileIOSpeed();
                AVMDLLog.m147905d("BENCHMARKIO", C1764a.m5928a("test io average speed:%d", new Object[]{Integer.valueOf(testFileIOSpeed)}));
                if (testFileIOSpeed > 0) {
                    setIntValue(1508, testFileIOSpeed);
                }
            }
            AVMDLStartCompleteListener aVMDLStartCompleteListener = this.mStartCompleteListener;
            if (aVMDLStartCompleteListener != null) {
                aVMDLStartCompleteListener.onStartComplete();
            }
            if (this.mState == 1 && this.mConfigure.mEnableCellularUp > 0) {
                AVMDLLog.m147905d("AVMDLDataLoader", "start try up cellular");
                AVMDLMultiNetwork.alwayUpCellular(getApplicationContext());
                AVMDLLog.m147905d("AVMDLDataLoader", "end try up cellular");
            }
            MethodCollector.m26664o(13540);
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            MethodCollector.m26664o(13540);
            throw th;
        }
    }

    public void setStartCompleteListener(AVMDLStartCompleteListener aVMDLStartCompleteListener) {
        this.mStartCompleteListener = aVMDLStartCompleteListener;
    }

    public void doParseHosts(String[] strArr) {
        AVMDLDNSParser.getInstance().doParseHosts(strArr);
    }

    /* renamed from: com_ss_mediakit_medialoader_AVMDLDataLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary */
    public static void m147898xf8671f56(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.m38964a(str, false, (Context) null);
        C58032m.m104852a(uptimeMillis, str);
    }

    private String encodeUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static void initApplicationContext(Context context) {
        MethodCollector.m26663i(13157);
        synchronized (AVMDLDataLoader.class) {
            try {
                if (mGlobalApplicationContext == null) {
                    mGlobalApplicationContext = context;
                }
            } finally {
                MethodCollector.m26664o(13157);
            }
        }
    }

    private void initLogThread(final Handler.Callback callback) {
        if (this.mMsgThread == null) {
            C861081 r1 = new Thread() {
                /* class com.p2082ss.mediakit.medialoader.AVMDLDataLoader.C861081 */

                static {
                    Covode.recordClassIndex(101206);
                }

                public void run() {
                    if (Looper.myLooper() == null) {
                        Looper.prepare();
                    }
                    AVMDLDataLoader.this.mLogHandler = new Handler(callback);
                    Looper.loop();
                }
            };
            this.mMsgThread = r1;
            r1.setName("mdl_log_handler");
            this.mMsgThread.start();
        }
    }

    public int asyncCopyOperation(AVMDLCopyOperation aVMDLCopyOperation) {
        Handler handler;
        if (this.mState != 1 || (handler = this.mLogHandler) == null) {
            return -1;
        }
        Message obtainMessage = handler.obtainMessage();
        obtainMessage.what = 23;
        obtainMessage.obj = aVMDLCopyOperation;
        obtainMessage.sendToTarget();
        return 0;
    }

    public void setConfigure(AVMDLDataLoaderConfigure aVMDLDataLoaderConfigure) {
        this.mWriteLock.lock();
        try {
            if (this.mState != 1) {
                this.mConfigure = aVMDLDataLoaderConfigure;
                aVMDLDataLoaderConfigure.ParseJsonConfig();
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public void setEventListener(LoaderListener loaderListener) {
        this.mWriteLock.lock();
        try {
            this.mEventListener = loaderListener;
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public void cancel(String str) {
        MethodCollector.m26663i(13593);
        if (this.mState != 1) {
            MethodCollector.m26664o(13593);
            return;
        }
        this.mWriteLock.lock();
        try {
            long j = this.mHandle;
            if (j != 0) {
                _cancel(j, str);
            }
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            MethodCollector.m26664o(13593);
            throw th;
        }
        this.mWriteLock.unlock();
        MethodCollector.m26664o(13593);
    }

    public void downloadResource(String str) {
        MethodCollector.m26663i(14119);
        if (this.mState != 1) {
            MethodCollector.m26664o(14119);
        } else if (TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(14119);
        } else {
            this.mWriteLock.lock();
            try {
                long j = this.mHandle;
                if (j != 0) {
                    _downloadResource(j, str);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            } catch (Throwable th) {
                this.mWriteLock.unlock();
                MethodCollector.m26664o(14119);
                throw th;
            }
            this.mWriteLock.unlock();
            MethodCollector.m26664o(14119);
        }
    }

    public void forceRemoveFileCache(String str) {
        MethodCollector.m26663i(13645);
        if (this.mState != 1) {
            MethodCollector.m26664o(13645);
        } else if (TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(13645);
        } else {
            this.mWriteLock.lock();
            try {
                long j = this.mHandle;
                if (j != 0) {
                    _forceRemoveCacheFile(j, str);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            } catch (Throwable th) {
                this.mWriteLock.unlock();
                MethodCollector.m26664o(13645);
                throw th;
            }
            this.mWriteLock.unlock();
            MethodCollector.m26664o(13645);
        }
    }

    public String getAuth(String str) {
        MethodCollector.m26663i(14150);
        String str2 = null;
        if (this.mState != 1 || !this.isSupportGetAuth) {
            MethodCollector.m26664o(14150);
            return null;
        }
        this.mReadLock.lock();
        try {
            str2 = _getAuth(this.mHandle, str);
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
            this.isSupportGetAuth = false;
        } catch (Throwable th) {
            this.mReadLock.unlock();
            MethodCollector.m26664o(14150);
            throw th;
        }
        this.mReadLock.unlock();
        MethodCollector.m26664o(14150);
        return str2;
    }

    public String getStringValue(int i) {
        MethodCollector.m26663i(13815);
        String str = null;
        if (this.mState != 1) {
            MethodCollector.m26664o(13815);
            return null;
        }
        this.mReadLock.lock();
        try {
            long j = this.mHandle;
            if (j != 0) {
                str = _getStringValue(j, i);
            }
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        } catch (Throwable th) {
            this.mReadLock.unlock();
            MethodCollector.m26664o(13815);
            throw th;
        }
        this.mReadLock.unlock();
        MethodCollector.m26664o(13815);
        return str;
    }

    public void removeFileCache(String str) {
        MethodCollector.m26663i(13596);
        if (this.mState != 1) {
            MethodCollector.m26664o(13596);
        } else if (TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(13596);
        } else {
            this.mWriteLock.lock();
            try {
                long j = this.mHandle;
                if (j != 0) {
                    _removeCacheFile(j, str);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            } catch (Throwable th) {
                this.mWriteLock.unlock();
                MethodCollector.m26664o(13596);
                throw th;
            }
            this.mWriteLock.unlock();
            MethodCollector.m26664o(13596);
        }
    }

    public void setListener(AVMDLDataLoaderListener aVMDLDataLoaderListener) {
        this.mWriteLock.lock();
        try {
            this.mVodListener = aVMDLDataLoaderListener;
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public void suspendDownload(String str) {
        MethodCollector.m26663i(14118);
        if (this.mState != 1) {
            MethodCollector.m26664o(14118);
            return;
        }
        this.mWriteLock.lock();
        try {
            long j = this.mHandle;
            if (j != 0) {
                _suspendedDownload(j, str);
            }
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            MethodCollector.m26664o(14118);
            throw th;
        }
        this.mWriteLock.unlock();
        MethodCollector.m26664o(14118);
    }

    public void tryToClearCachesByUsedTime(long j) {
        MethodCollector.m26663i(13595);
        if (this.mState != 1) {
            MethodCollector.m26664o(13595);
            return;
        }
        this.mWriteLock.lock();
        try {
            long j2 = this.mHandle;
            if (j2 != 0) {
                _clearCachesByUsedTime(j2, j);
            }
        } catch (UnsatisfiedLinkError unused) {
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            MethodCollector.m26664o(13595);
            throw th;
        }
        this.mWriteLock.unlock();
        MethodCollector.m26664o(13595);
    }

    private AVMDLDataLoader(AVMDLDataLoaderConfigure aVMDLDataLoaderConfigure) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.mReadWritedLock = reentrantReadWriteLock;
        this.mMsgThread = null;
        this.isSupportGetAuth = true;
        this.mStartCompleteListener = null;
        this.mWaitingCopyItem = new HashMap();
        initNativeHandle();
        this.mReadLock = reentrantReadWriteLock.readLock();
        this.mWriteLock = reentrantReadWriteLock.writeLock();
        if (this.mHandle != 0) {
            initLogThread(this);
            this.mConfigure = aVMDLDataLoaderConfigure;
            this.mState = 0;
            this.isSupportGetAuth = true;
            return;
        }
        throw new Exception("create native mdl fail");
    }

    /* renamed from: com_ss_mediakit_medialoader_AVMDLDataLoader_com_ss_android_ugc_aweme_storage_FileLancet_delete */
    public static boolean m147900xd61f1550(File file) {
        MethodCollector.m26663i(13587);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(13587);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(13587);
        return delete;
    }

    public static synchronized int init(boolean z) {
        synchronized (AVMDLDataLoader.class) {
            MethodCollector.m26663i(13219);
            if (mIsLibraryLoaded) {
                MethodCollector.m26664o(13219);
                return 0;
            }
            mIsLibraryLoaded = z;
            if (!z) {
                if (!C14485a.m26491a()) {
                    m147899x73ef00fe("ttmn", "load boringssl fail!");
                }
                if (!VcnlibloadWrapper.tryLoadVcnlib()) {
                    m147899x73ef00fe("ttmn", "Can't load vcn ");
                }
                loadAVMDLBaseLibrary();
                try {
                    m147898xf8671f56("avmdl");
                    mIsLibraryLoaded = true;
                } catch (UnsatisfiedLinkError e) {
                    m147899x73ef00fe("ttmn", "Can't load avmdl library: ".concat(String.valueOf(e)));
                } catch (Throwable th) {
                    m147899x73ef00fe("ttmn", "other exception when loading avmdl library: ".concat(String.valueOf(th)));
                }
                if (!VcnlibloadWrapper.tryLoadVcnverifylib()) {
                    m147899x73ef00fe("ttmn", "Can't load vcnverify lib ");
                }
                tryLoadTTNetLoaderPlugin();
            }
            if (!mIsLibraryLoaded) {
                MethodCollector.m26664o(13219);
                return -1;
            }
            MethodCollector.m26664o(13219);
            return 0;
        }
    }

    public String getCDNLog(String str) {
        MethodCollector.m26663i(14151);
        String str2 = null;
        if (this.mState != 1) {
            MethodCollector.m26664o(14151);
            return null;
        }
        this.mReadLock.lock();
        try {
            str2 = _getCDNLog(this.mHandle, str);
        } catch (UnsatisfiedLinkError e) {
            AVMDLLog.m147905d("AVMDLDataLoader", "not support get cdnlog," + e.toString());
        } catch (Throwable th) {
            this.mReadLock.unlock();
            MethodCollector.m26664o(14151);
            throw th;
        }
        this.mReadLock.unlock();
        MethodCollector.m26664o(14151);
        return str2;
    }

    public long getCacheSize(String str) {
        MethodCollector.m26663i(13892);
        long j = -1;
        if (this.mState != 1) {
            MethodCollector.m26664o(13892);
            return -1;
        } else if (TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(13892);
            return -1;
        } else {
            this.mReadLock.lock();
            try {
                long j2 = this.mHandle;
                if (j2 != 0) {
                    j = _getLongValueByStr(j2, str, 103);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            } catch (Throwable th) {
                this.mReadLock.unlock();
                MethodCollector.m26664o(13892);
                throw th;
            }
            this.mReadLock.unlock();
            MethodCollector.m26664o(13892);
            return j;
        }
    }

    public String getStringCacheInfo(String str) {
        MethodCollector.m26663i(13977);
        String str2 = null;
        if (this.mState != 1) {
            MethodCollector.m26664o(13977);
            return null;
        } else if (TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(13977);
            return null;
        } else {
            this.mReadLock.lock();
            try {
                long j = this.mHandle;
                if (j != 0) {
                    str2 = _getStringValueByStr(j, str, 101);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            } catch (Throwable th) {
                this.mReadLock.unlock();
                MethodCollector.m26664o(13977);
                throw th;
            }
            this.mReadLock.unlock();
            MethodCollector.m26664o(13977);
            return str2;
        }
    }

    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 23) {
            AVMDLCopyOperation aVMDLCopyOperation = (AVMDLCopyOperation) message.obj;
            if (aVMDLCopyOperation == null) {
                return true;
            }
            copyInternal(aVMDLCopyOperation);
            return true;
        }
        if (i == 3 || i == 51) {
            AVMDLDataLoaderNotifyInfo aVMDLDataLoaderNotifyInfo = (AVMDLDataLoaderNotifyInfo) message.obj;
            if (this.mWaitingCopyItem.size() > 0 && aVMDLDataLoaderNotifyInfo != null) {
                handleCopyMsg(aVMDLDataLoaderNotifyInfo);
            }
        }
        if (i == 12 || i == 9) {
            return postMessage(this.mLiveListener, message);
        }
        if (i == 71 || i == 72 || i == 73 || i == 74) {
            return postMessage(this.mEventListener, message);
        }
        return postMessage(this.mVodListener, message);
    }

    public int onCellularAlwaysUp(long j) {
        MethodCollector.m26663i(14171);
        AVMDLLog.m147905d("AVMDLDataLoader", "start on cellular netId: ".concat(String.valueOf(j)));
        this.mWriteLock.lock();
        int i = -1;
        try {
            long j2 = this.mHandle;
            if (j2 != 0) {
                i = _onCellularAlwaysUp(j2, j, Build.VERSION.SDK_INT);
            }
        } catch (Exception | UnsatisfiedLinkError unused) {
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            MethodCollector.m26664o(14171);
            throw th;
        }
        this.mWriteLock.unlock();
        AVMDLLog.m147905d("AVMDLDataLoader", "end on cellular netId: " + j + " ret: " + i);
        MethodCollector.m26664o(14171);
        return i;
    }

    public long tryQuickGetCacheSize(String str) {
        MethodCollector.m26663i(13893);
        long j = -1;
        if (this.mState != 1) {
            MethodCollector.m26664o(13893);
            return -1;
        } else if (TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(13893);
            return -1;
        } else {
            this.mReadLock.lock();
            try {
                long j2 = this.mHandle;
                if (j2 != 0) {
                    j = _getLongValueByStr(j2, str, 106);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            } catch (Throwable th) {
                this.mReadLock.unlock();
                MethodCollector.m26664o(13893);
                throw th;
            }
            this.mReadLock.unlock();
            MethodCollector.m26664o(13893);
            return j;
        }
    }

    private void copyInternal(AVMDLCopyOperation aVMDLCopyOperation) {
        MethodCollector.m26663i(13484);
        if (aVMDLCopyOperation == null || TextUtils.isEmpty(aVMDLCopyOperation.mFileKey) || TextUtils.isEmpty(aVMDLCopyOperation.mDestPath)) {
            AVMDLLog.m147905d("AVMDLDataLoader", "copy file invalid filekey or destpath is null");
            if (!(aVMDLCopyOperation == null || aVMDLCopyOperation.mListener == null)) {
                aVMDLCopyOperation.mListener.onCopyComplete(false, -1, "invalid parameter");
            }
            MethodCollector.m26664o(13484);
            return;
        }
        this.mWriteLock.lock();
        try {
            long j = this.mHandle;
            if (j != 0) {
                int _getIsFileCacheComplete = _getIsFileCacheComplete(j, aVMDLCopyOperation.mFileKey);
                if (_getIsFileCacheComplete == 1) {
                    int copyFile = copyFile(aVMDLCopyOperation.mFileKey, aVMDLCopyOperation.mDestPath);
                    AVMDLLog.m147905d("AVMDLDataLoader", "copy file result: ".concat(String.valueOf(copyFile)));
                    if (aVMDLCopyOperation.mListener != null) {
                        if (copyFile == 0) {
                            aVMDLCopyOperation.mListener.onCopyComplete(true, 0, "copy success.");
                        } else {
                            aVMDLCopyOperation.mListener.onCopyComplete(false, -5, "copy failed.copy error code ".concat(String.valueOf(copyFile)));
                        }
                    }
                } else if (_getIsFileCacheComplete == -1) {
                    if (aVMDLCopyOperation.mListener != null) {
                        aVMDLCopyOperation.mListener.onCopyComplete(false, -6, "cache file have empty hole.");
                    }
                } else if (aVMDLCopyOperation.mWaitIfCaching) {
                    int _tryDownloadPlayReqByKey = _tryDownloadPlayReqByKey(this.mHandle, aVMDLCopyOperation.mFileKey);
                    AVMDLLog.m147905d("AVMDLDataLoader", "try download play " + aVMDLCopyOperation.mFileKey + " result: " + _tryDownloadPlayReqByKey);
                    if (_tryDownloadPlayReqByKey == 0) {
                        this.mWaitingCopyItem.put(aVMDLCopyOperation.mFileKey, aVMDLCopyOperation);
                    } else if (aVMDLCopyOperation.mListener != null) {
                        aVMDLCopyOperation.mListener.onCopyComplete(false, -4, "file key not playing.");
                    }
                } else if (aVMDLCopyOperation.mListener != null) {
                    aVMDLCopyOperation.mListener.onCopyComplete(false, -3, "cache not finish.");
                }
            }
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
            if (aVMDLCopyOperation.mListener != null) {
                aVMDLCopyOperation.mListener.onCopyComplete(false, -2, "medialoader not running");
            }
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            MethodCollector.m26664o(13484);
            throw th;
        }
        this.mWriteLock.unlock();
        MethodCollector.m26664o(13484);
    }

    private void handleCopyMsg(AVMDLDataLoaderNotifyInfo aVMDLDataLoaderNotifyInfo) {
        if (aVMDLDataLoaderNotifyInfo != null) {
            if (aVMDLDataLoaderNotifyInfo.what == 3 || aVMDLDataLoaderNotifyInfo.what == 51) {
                String[] split = aVMDLDataLoaderNotifyInfo.logInfo.split(",");
                if (split.length >= 4) {
                    long longValue = Long.valueOf(split[0]).longValue();
                    long longValue2 = Long.valueOf(split[1]).longValue();
                    if (longValue2 > 0 || aVMDLDataLoaderNotifyInfo.what == 4) {
                        String str = split[2];
                        if (this.mWaitingCopyItem.containsKey(str)) {
                            AVMDLCopyOperation aVMDLCopyOperation = this.mWaitingCopyItem.get(str);
                            if (longValue == longValue2) {
                                if (aVMDLCopyOperation != null) {
                                    int copyFile = copyFile(aVMDLCopyOperation.mFileKey, aVMDLCopyOperation.mDestPath);
                                    if (aVMDLCopyOperation.mListener == null) {
                                        return;
                                    }
                                    if (copyFile == 0) {
                                        aVMDLCopyOperation.mListener.onCopyComplete(true, 0, "copy success.");
                                    } else {
                                        aVMDLCopyOperation.mListener.onCopyComplete(false, -5, "copy failed.");
                                    }
                                }
                            } else if (aVMDLDataLoaderNotifyInfo.what == 51 && aVMDLCopyOperation.mListener != null) {
                                aVMDLCopyOperation.mListener.onCopyComplete(false, -3, "copy failed.");
                            }
                        }
                    }
                }
            }
        }
    }

    public static String queryComponentEncode(String str) {
        MethodCollector.m26663i(14188);
        if (!isSupportQueryEncode || TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(14188);
            return null;
        }
        AVMDLLog.m147905d("AVMDLDataLoader", "before encode, src: ".concat(String.valueOf(str)));
        try {
            String _encodeUrl = _encodeUrl(str, 4);
            MethodCollector.m26664o(14188);
            return _encodeUrl;
        } catch (UnsatisfiedLinkError e) {
            isSupportQueryEncode = false;
            AVMDLLog.m147905d("AVMDLDataLoader", "query ComponentEncode:err " + e.getMessage());
            AVMDLLog.m147905d("AVMDLDataLoader", "query ComponentEncode:stacktrace " + e.getStackTrace());
            MethodCollector.m26664o(14188);
            return null;
        } catch (Exception e2) {
            AVMDLLog.m147905d("AVMDLDataLoader", "query ComponentEncode:err " + e2.getMessage());
            AVMDLLog.m147905d("AVMDLDataLoader", "query ComponentEncode:stacktrace " + e2.getStackTrace());
            MethodCollector.m26664o(14188);
            return null;
        }
    }

    public AVMDLFileInfo getCacheInfo(String str) {
        UnsatisfiedLinkError e;
        MethodCollector.m26663i(14030);
        AVMDLFileInfo aVMDLFileInfo = null;
        if (this.mState != 1) {
            MethodCollector.m26664o(14030);
            return null;
        } else if (TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(14030);
            return null;
        } else {
            this.mReadLock.lock();
            try {
                long j = this.mHandle;
                if (j != 0) {
                    String[] split = _getStringValueByStr(j, str, 101).split(",");
                    if (split.length >= 3) {
                        AVMDLFileInfo aVMDLFileInfo2 = new AVMDLFileInfo();
                        try {
                            aVMDLFileInfo2.mFilePath = split[2];
                            if (!TextUtils.isEmpty(split[0])) {
                                aVMDLFileInfo2.mCacheSize = Long.valueOf(split[0]).longValue();
                            }
                            if (!TextUtils.isEmpty(split[1])) {
                                aVMDLFileInfo2.mContentLenght = Long.valueOf(split[1]).longValue();
                            }
                            aVMDLFileInfo = aVMDLFileInfo2;
                        } catch (UnsatisfiedLinkError e2) {
                            e = e2;
                            aVMDLFileInfo = aVMDLFileInfo2;
                            try {
                                e.printStackTrace();
                                this.mReadLock.unlock();
                                MethodCollector.m26664o(14030);
                                return aVMDLFileInfo;
                            } catch (Throwable th) {
                                this.mReadLock.unlock();
                                MethodCollector.m26664o(14030);
                                throw th;
                            }
                        }
                    }
                }
            } catch (UnsatisfiedLinkError e3) {
                e = e3;
                e.printStackTrace();
                this.mReadLock.unlock();
                MethodCollector.m26664o(14030);
                return aVMDLFileInfo;
            }
            this.mReadLock.unlock();
            MethodCollector.m26664o(14030);
            return aVMDLFileInfo;
        }
    }

    public long getLongValue(int i) {
        int i2;
        MethodCollector.m26663i(13814);
        long j = -1;
        if (i == 7218 || i == 7390 || i == 9407 || i == 7402) {
            long j2 = this.mHandle;
            if (j2 != 0) {
                j = _getLongValue(j2, i);
            }
            MethodCollector.m26664o(13814);
            return j;
        } else if (this.mState != 1) {
            AVMDLLog.m147905d("ttmn", "getLongValue key: " + i + " result: -1");
            MethodCollector.m26664o(13814);
            return -1;
        } else if (this.mConfigure == null) {
            AVMDLLog.m147905d("ttmn", "getLongValue key: " + i + " result: -998");
            MethodCollector.m26664o(13814);
            return -998;
        } else {
            this.mReadLock.lock();
            switch (i) {
                case 8100:
                    i2 = this.mConfigure.mLiveLoaderEnable;
                    j = (long) i2;
                    break;
                case 8101:
                    i2 = this.mConfigure.mLiveP2pAllow;
                    j = (long) i2;
                    break;
                case 8102:
                    i2 = this.mConfigure.mLiveEnableMdlProto;
                    j = (long) i2;
                    break;
                case 8103:
                    i2 = this.mConfigure.mLiveLoaderType;
                    j = (long) i2;
                    break;
                default:
                    try {
                        long j3 = this.mHandle;
                        if (j3 != 0) {
                            j = _getLongValue(j3, i);
                            break;
                        }
                    } catch (UnsatisfiedLinkError e) {
                        e.printStackTrace();
                        break;
                    } catch (Throwable th) {
                        this.mReadLock.unlock();
                        MethodCollector.m26664o(13814);
                        throw th;
                    }
                    break;
            }
            this.mReadLock.unlock();
            AVMDLLog.m147905d("ttmn", "getLongValue key: " + i + " result: " + j);
            MethodCollector.m26664o(13814);
            return j;
        }
    }

    public void p2pPredown(String str) {
        MethodCollector.m26663i(14152);
        if (this.mState != 1) {
            MethodCollector.m26664o(14152);
        } else if (this.mConfigure.mLoaderType <= 0) {
            AVMDLLog.m147905d("AVMDLDataLoader", "not enable p2p,not need p2ppredown, configure loader type" + this.mConfigure.mLoaderType);
            MethodCollector.m26664o(14152);
        } else {
            String encodeUrl = encodeUrl(str);
            if (TextUtils.isEmpty(encodeUrl)) {
                AVMDLLog.m147905d("AVMDLDataLoader", "encode url null, not need p2p predown");
                MethodCollector.m26664o(14152);
                return;
            }
            AVMDLLog.m147905d("AVMDLDataLoader", "p2p predown start");
            this.mReadLock.lock();
            try {
                _p2pPredown(this.mHandle, encodeUrl);
            } catch (UnsatisfiedLinkError e) {
                AVMDLLog.m147905d("AVMDLDataLoader", "p2p predown exception" + e.toString());
            } catch (Throwable th) {
                this.mReadLock.unlock();
                MethodCollector.m26664o(14152);
                throw th;
            }
            this.mReadLock.unlock();
            AVMDLLog.m147905d("AVMDLDataLoader", "p2p predown end");
            MethodCollector.m26664o(14152);
        }
    }

    public void onEventInfo(Object obj) {
        String str;
        if (this.mState == 1 && this.mLogHandler != null) {
            LoaderEventInfo loaderEventInfo = new LoaderEventInfo();
            loaderEventInfo.what = 74;
            try {
                HashMap hashMap = (HashMap) obj;
                if (hashMap.containsKey("what")) {
                    loaderEventInfo.what = ((Integer) hashMap.get("what")).intValue();
                    AVMDLLog.m147905d("AVMDLDataLoader", "[debugUI] eventMap contains What" + loaderEventInfo.what);
                }
                if (hashMap.containsKey("taskType")) {
                    loaderEventInfo.taskType = ((Integer) hashMap.get("taskType")).intValue();
                    AVMDLLog.m147905d("AVMDLDataLoader", "[debugUI] eventMap contains taskType" + loaderEventInfo.taskType);
                }
                if (hashMap.containsKey("off")) {
                    loaderEventInfo.off = ((Long) hashMap.get("off")).longValue();
                    AVMDLLog.m147905d("AVMDLDataLoader", "[debugUI] eventMap contains off" + loaderEventInfo.off);
                }
                if (hashMap.containsKey("endOff")) {
                    loaderEventInfo.endOff = ((Long) hashMap.get("endOff")).longValue();
                    AVMDLLog.m147905d("AVMDLDataLoader", "[debugUI] eventMap contains endOff" + loaderEventInfo.endOff);
                }
                if (hashMap.containsKey("fileHash")) {
                    loaderEventInfo.fileHash = String.valueOf(hashMap.get("fileHash"));
                    AVMDLLog.m147905d("AVMDLDataLoader", "[debugUI] eventMap contains fileHash" + loaderEventInfo.fileHash);
                }
                if (hashMap.containsKey("bytesLoaded")) {
                    loaderEventInfo.bytesLoaded = ((Long) hashMap.get("bytesLoaded")).longValue();
                    AVMDLLog.m147905d("AVMDLDataLoader", "[debugUI] eventMap contains bytesLoaded" + loaderEventInfo.bytesLoaded);
                }
                if (hashMap.containsKey("headers")) {
                    str = String.valueOf(hashMap.get("headers"));
                    AVMDLLog.m147905d("AVMDLDataLoader", "[debugUI] eventMap contains headers".concat(String.valueOf(str)));
                } else {
                    str = "";
                }
                if (str != "") {
                    String[] split = str.split("\r\n");
                    for (String str2 : split) {
                        String[] split2 = str2.split(":");
                        loaderEventInfo.mHeaders.put(split2[0], split2[1]);
                    }
                } else {
                    AVMDLLog.m147905d("AVMDLDataLoader", "[debugUI] what" + loaderEventInfo.what);
                    AVMDLLog.m147905d("AVMDLDataLoader", "[debugUI]no headers");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            Message obtainMessage = this.mLogHandler.obtainMessage();
            obtainMessage.what = loaderEventInfo.what;
            obtainMessage.obj = loaderEventInfo;
            obtainMessage.sendToTarget();
        }
    }

    private void setConfigureInternal(AVMDLDataLoaderConfigure aVMDLDataLoaderConfigure) {
        MethodCollector.m26663i(13217);
        if (this.mHandle == 0 || aVMDLDataLoaderConfigure == null) {
            MethodCollector.m26664o(13217);
            return;
        }
        if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mCacheDir)) {
            String createFilePathBaseDir = createFilePathBaseDir(aVMDLDataLoaderConfigure.mCacheDir, "loaderFactory");
            if (!TextUtils.isEmpty(createFilePathBaseDir)) {
                _setStringValue(this.mHandle, 9, createFilePathBaseDir);
            }
            if (TextUtils.isEmpty(this.mConfigure.mNetCacheDir)) {
                aVMDLDataLoaderConfigure.mNetCacheDir = createFilePathBaseDir(aVMDLDataLoaderConfigure.mCacheDir, "netCache");
            }
            _setStringValue(this.mHandle, 0, aVMDLDataLoaderConfigure.mCacheDir);
        }
        if (!TextUtils.isEmpty(this.mConfigure.mNetCacheDir)) {
            _setStringValue(this.mHandle, 5510, aVMDLDataLoaderConfigure.mNetCacheDir);
        }
        if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mAppInfo)) {
            _setStringValue(this.mHandle, 10, aVMDLDataLoaderConfigure.mAppInfo);
        }
        if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mDownloadDir)) {
            _setStringValue(this.mHandle, 7300, aVMDLDataLoaderConfigure.mDownloadDir);
        }
        if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mMdlExtensionOptsStr)) {
            _setStringValue(this.mHandle, 7500, aVMDLDataLoaderConfigure.mMdlExtensionOptsStr);
        }
        _setIntValue(this.mHandle, 8001, aVMDLDataLoaderConfigure.mLiveP2pAllow);
        _setIntValue(this.mHandle, 8000, aVMDLDataLoaderConfigure.mLiveLoaderType);
        _setIntValue(this.mHandle, 8005, aVMDLDataLoaderConfigure.mLiveWatchDurationThreshold);
        _setIntValue(this.mHandle, 8006, aVMDLDataLoaderConfigure.mLiveCacheThresholdHttpToP2p);
        _setIntValue(this.mHandle, 8007, aVMDLDataLoaderConfigure.mLiveCacheThresholdP2pToHttp);
        _setIntValue(this.mHandle, 8008, aVMDLDataLoaderConfigure.mLiveMaxTrySwitchP2pTimes);
        _setIntValue(this.mHandle, 8009, aVMDLDataLoaderConfigure.mLiveWaitP2pReadyThreshold);
        _setIntValue(this.mHandle, 8010, aVMDLDataLoaderConfigure.mLiveMobileUploadAllow);
        _setIntValue(this.mHandle, 8011, aVMDLDataLoaderConfigure.mLiveMobileDownloadAllow);
        _setIntValue(this.mHandle, 8012, aVMDLDataLoaderConfigure.mLiveRecvDataTimeout);
        _setStringValue(this.mHandle, 8021, aVMDLDataLoaderConfigure.mLiveContainerString);
        _setIntValue(this.mHandle, 1, aVMDLDataLoaderConfigure.mMaxCacheSize);
        _setIntValue(this.mHandle, 2, aVMDLDataLoaderConfigure.mRWTimeOut);
        _setIntValue(this.mHandle, 3, aVMDLDataLoaderConfigure.mOpenTimeOut);
        _setIntValue(this.mHandle, 5, aVMDLDataLoaderConfigure.mTryCount);
        _setIntValue(this.mHandle, 7, aVMDLDataLoaderConfigure.mMaxCacheSize);
        _setIntValue(this.mHandle, 8, aVMDLDataLoaderConfigure.mLoaderFactoryMaxMemorySize);
        _setIntValue(this.mHandle, 6, aVMDLDataLoaderConfigure.mLoaderType);
        _setIntValue(this.mHandle, 102, aVMDLDataLoaderConfigure.mPreloadParallelNum);
        _setIntValue(this.mHandle, 800, aVMDLDataLoaderConfigure.mIsCloseFileCache);
        if (aVMDLDataLoaderConfigure.mMaxCacheAge > 0) {
            _setIntValue(this.mHandle, 104, aVMDLDataLoaderConfigure.mMaxCacheAge);
        }
        _setIntValue(this.mHandle, 111, aVMDLDataLoaderConfigure.mEnableMaxCacheAgeForAllDir);
        _setIntValue(this.mHandle, 1030, aVMDLDataLoaderConfigure.mPreloadStrategy);
        _setIntValue(this.mHandle, 1040, aVMDLDataLoaderConfigure.mPreloadWaitListType);
        _setIntValue(this.mHandle, 105, aVMDLDataLoaderConfigure.mEnablePreloadReUse);
        _setIntValue(this.mHandle, 700, aVMDLDataLoaderConfigure.mEnableExternDNS);
        _setIntValue(this.mHandle, 701, aVMDLDataLoaderConfigure.mEnableSocketReuse);
        _setIntValue(this.mHandle, 703, aVMDLDataLoaderConfigure.mControlCDNRangeType);
        _setIntValue(this.mHandle, 702, aVMDLDataLoaderConfigure.mSocketIdleTimeOut);
        _setIntValue(this.mHandle, 800, aVMDLDataLoaderConfigure.mIsCloseFileCache);
        _setIntValue(this.mHandle, 8216, aVMDLDataLoaderConfigure.mLoaderFactoryP2PLevel);
        _setIntValue(this.mHandle, 1502, aVMDLDataLoaderConfigure.mTestSpeedTypeVersion);
        _setIntValue(this.mHandle, 1504, aVMDLDataLoaderConfigure.mCheckSumLevel);
        _setIntValue(this.mHandle, 1505, aVMDLDataLoaderConfigure.mEncryptVersion);
        _setIntValue(this.mHandle, 1507, aVMDLDataLoaderConfigure.mSpeedCoefficientValue);
        _setIntValue(this.mHandle, 900, aVMDLDataLoaderConfigure.mMaxIpCountEachDomain);
        _setIntValue(this.mHandle, 901, aVMDLDataLoaderConfigure.mEnableIpBucket);
        _setIntValue(this.mHandle, 902, aVMDLDataLoaderConfigure.mErrorStateTrustTime);
        _setIntValue(this.mHandle, 2508, aVMDLDataLoaderConfigure.mEnablePreconnect);
        _setIntValue(this.mHandle, 2509, aVMDLDataLoaderConfigure.mPreconnectNum);
        _setIntValue(this.mHandle, 2510, aVMDLDataLoaderConfigure.mEnableLoaderPreempt);
        _setIntValue(this.mHandle, 2511, aVMDLDataLoaderConfigure.mNextDownloadThreshold);
        _setIntValue(this.mHandle, 7216, aVMDLDataLoaderConfigure.mOnlyUseCdn);
        _setIntValue(this.mHandle, 3511, aVMDLDataLoaderConfigure.mAccessCheckLevel);
        _setIntValue(this.mHandle, 5511, aVMDLDataLoaderConfigure.mEnableSessionReuse);
        _setIntValue(this.mHandle, 5512, aVMDLDataLoaderConfigure.mMaxTlsVersion);
        _setIntValue(this.mHandle, 6512, aVMDLDataLoaderConfigure.mCheckPreloadLevel);
        _setIntValue(this.mHandle, 8217, aVMDLDataLoaderConfigure.mXYLibValue);
        _setIntValue(this.mHandle, 7340, aVMDLDataLoaderConfigure.mEnableP2PPreDown);
        _setIntValue(this.mHandle, 7341, aVMDLDataLoaderConfigure.mEnablePlayLog);
        _setIntValue(this.mHandle, 7342, aVMDLDataLoaderConfigure.mEnableNetScheduler);
        _setIntValue(this.mHandle, 7358, aVMDLDataLoaderConfigure.mEnableCacheReqRange);
        _setIntValue(this.mHandle, 7343, aVMDLDataLoaderConfigure.mNetSchedulerBlockAllNetErr);
        _setIntValue(this.mHandle, 7344, aVMDLDataLoaderConfigure.mNetSchedulerBlockErrCount);
        _setIntValue(this.mHandle, 7345, aVMDLDataLoaderConfigure.mNetSChedulerBlockDurationMs);
        _setIntValue(this.mHandle, 7346, aVMDLDataLoaderConfigure.mFirstRangeLeftThreshold);
        _setIntValue(this.mHandle, 7394, aVMDLDataLoaderConfigure.mNetSchedulerBlockHostIpErrCount);
        _setIntValue(this.mHandle, 5513, aVMDLDataLoaderConfigure.mMaxFileMemCacheSize);
        _setIntValue(this.mHandle, 5515, aVMDLDataLoaderConfigure.mMaxFileMemCacheNum);
        _setIntValue(this.mHandle, 110, aVMDLDataLoaderConfigure.mWriteFileNotifyIntervalMS);
        _setIntValue(this.mHandle, 7359, aVMDLDataLoaderConfigure.mP2PPreDownPeerCount);
        _setIntValue(this.mHandle, 7372, aVMDLDataLoaderConfigure.mP2PFirstRangeLoaderType);
        if (aVMDLDataLoaderConfigure.mSocketSendBufferKB > 0) {
            _setIntValue(this.mHandle, 7220, aVMDLDataLoaderConfigure.mSocketSendBufferKB);
        }
        if (aVMDLDataLoaderConfigure.mRingBufferSizeKB > 0) {
            _setIntValue(this.mHandle, 7221, aVMDLDataLoaderConfigure.mRingBufferSizeKB);
        }
        _setIntValue(this.mHandle, 7222, aVMDLDataLoaderConfigure.mEnableFileCacheV2);
        if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mVdpABTestId)) {
            _setStringValue(this.mHandle, 7223, aVMDLDataLoaderConfigure.mVdpABTestId);
        }
        if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mVdpGroupId)) {
            _setStringValue(this.mHandle, 7224, aVMDLDataLoaderConfigure.mVdpGroupId);
        }
        if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mNetSchedulerConfigStr)) {
            _setStringValue(this.mHandle, 7403, aVMDLDataLoaderConfigure.mNetSchedulerConfigStr);
        }
        _setIntValue(this.mHandle, 7225, aVMDLDataLoaderConfigure.mAlogEnable);
        _setIntValue(this.mHandle, 7226, aVMDLDataLoaderConfigure.mEnableSyncDnsForPcdn);
        _setIntValue(this.mHandle, 7228, aVMDLDataLoaderConfigure.mEnableFileRingBuffer);
        _setIntValue(this.mHandle, 7332, aVMDLDataLoaderConfigure.mEnableLazyBufferpool);
        _setIntValue(this.mHandle, 7334, aVMDLDataLoaderConfigure.mEnableNewBufferpool);
        _setIntValue(this.mHandle, 7335, aVMDLDataLoaderConfigure.mNewBufferPoolBlockSize);
        _setIntValue(this.mHandle, 7336, aVMDLDataLoaderConfigure.mNewBufferPoolResidentSize);
        _setIntValue(this.mHandle, 7337, aVMDLDataLoaderConfigure.mNewBufferPoolGrowBlockCount);
        _setIntValue(this.mHandle, 7229, aVMDLDataLoaderConfigure.mEnableUseFileExtendLoaderBuffer);
        _setIntValue(this.mHandle, 7330, aVMDLDataLoaderConfigure.mMaxIPV6Num);
        _setIntValue(this.mHandle, 7331, aVMDLDataLoaderConfigure.mMaxIPV4Num);
        _setIntValue(this.mHandle, 1510, aVMDLDataLoaderConfigure.mForbidByPassCookie);
        _setIntValue(this.mHandle, 7333, aVMDLDataLoaderConfigure.mSessionTimeout);
        _setIntValue(this.mHandle, 7339, aVMDLDataLoaderConfigure.mEnablePlayInfoCache);
        _setIntValue(this.mHandle, 7347, aVMDLDataLoaderConfigure.mEnableDownloaderLog);
        _setIntValue(this.mHandle, 7348, aVMDLDataLoaderConfigure.mEnableTTNetLoader);
        _setIntValue(this.mHandle, 7349, aVMDLDataLoaderConfigure.mTTNetLoaderCronetBufSizeKB);
        _setIntValue(this.mHandle, 7357, aVMDLDataLoaderConfigure.mIsAllowTryTheLastUrl);
        _setIntValue(this.mHandle, 7368, aVMDLDataLoaderConfigure.mSpeedSampleInterval);
        _setIntValue(this.mHandle, 7400, aVMDLDataLoaderConfigure.mUseNewSpeedTestForSingle);
        _setIntValue(this.mHandle, 7391, aVMDLDataLoaderConfigure.mEnableIOManager);
        _setIntValue(this.mHandle, 7369, aVMDLDataLoaderConfigure.mEnableLoaderSeek);
        _setIntValue(this.mHandle, 7370, aVMDLDataLoaderConfigure.mGlobalSpeedSampleInterval);
        _setIntValue(this.mHandle, 7362, aVMDLDataLoaderConfigure.mEnableDynamicTimeout);
        _setIntValue(this.mHandle, 7360, aVMDLDataLoaderConfigure.mSocketInitialTimeout);
        _setIntValue(this.mHandle, 7361, aVMDLDataLoaderConfigure.mMaxSocketReuseCount);
        _setIntValue(this.mHandle, 7371, aVMDLDataLoaderConfigure.mEnableReportTaskLog);
        _setInt64Value(this.mHandle, 8218, aVMDLDataLoaderConfigure.mP2PStragetyLevel);
        _setInt64Value(this.mHandle, 7363, aVMDLDataLoaderConfigure.mConnectPoolStragetyValue);
        _setIntValue(this.mHandle, 7364, aVMDLDataLoaderConfigure.mMaxAliveHostNum);
        _setIntValue(this.mHandle, 7392, aVMDLDataLoaderConfigure.mFileExtendSizeKB);
        _setIntValue(this.mHandle, 7393, aVMDLDataLoaderConfigure.mMinAllowSpeed);
        _setIntValue(this.mHandle, 7395, aVMDLDataLoaderConfigure.mEnableOwnVDPPreloadNotify);
        _setIntValue(this.mHandle, 8219, aVMDLDataLoaderConfigure.mEnableEarlyData);
        _setIntValue(this.mHandle, 8220, aVMDLDataLoaderConfigure.mEnableSpeedPredict);
        _setIntValue(this.mHandle, 7404, aVMDLDataLoaderConfigure.mEnableUseOriginalUrl);
        _setIntValue(this.mHandle, 7405, aVMDLDataLoaderConfigure.mEnableLoaderLogExtractUrls);
        _setIntValue(this.mHandle, 7406, aVMDLDataLoaderConfigure.mMaxLoaderLogNum);
        _setIntValue(this.mHandle, 7407, aVMDLDataLoaderConfigure.mCheckContentTypeMethod);
        _setInt64Value(this.mHandle, 7397, aVMDLDataLoaderConfigure.mMonitorMinAllowLoadSize);
        _setInt64Value(this.mHandle, 7396, aVMDLDataLoaderConfigure.mMonitorTimeInternal);
        _setStringValue(this.mHandle, 7398, aVMDLDataLoaderConfigure.mSocketTraingCenterConfigStr);
        _setStringValue(this.mHandle, 7399, aVMDLDataLoaderConfigure.mCacheDirListsStr);
        _setStringValue(this.mHandle, 8221, aVMDLDataLoaderConfigure.mP2PConfigStr);
        _setIntValue(this.mHandle, 7401, aVMDLDataLoaderConfigure.mSocketRecvBufferSize);
        _setIntValue(this.mHandle, 8215, aVMDLDataLoaderConfigure.mEnableCellularUp);
        _setIntValue(this.mHandle, 7408, aVMDLDataLoaderConfigure.mCloseThreadPool);
        if (aVMDLDataLoaderConfigure.mEnableEventInfo > 0) {
            _setIntValue(this.mHandle, 9999, aVMDLDataLoaderConfigure.mEnableEventInfo);
        }
        if (aVMDLDataLoaderConfigure.mEnableStorageModule > 0) {
            _setIntValue(this.mHandle, 10000, aVMDLDataLoaderConfigure.mEnableStorageModule);
            if (aVMDLDataLoaderConfigure.mStoPlayDldWinSizeKBNM > 0) {
                _setIntValue(this.mHandle, 10001, aVMDLDataLoaderConfigure.mStoPlayDldWinSizeKBNM);
            }
            if (aVMDLDataLoaderConfigure.mStoPlayDldWinSizeKBLS > 0) {
                _setIntValue(this.mHandle, 10002, aVMDLDataLoaderConfigure.mStoPlayDldWinSizeKBLS);
            }
            if (aVMDLDataLoaderConfigure.mStoRingBufferSizeKB > 0) {
                _setIntValue(this.mHandle, 10003, aVMDLDataLoaderConfigure.mStoRingBufferSizeKB);
            }
            if (aVMDLDataLoaderConfigure.mStoIoWriteLimitKBTh1 > 0) {
                _setIntValue(this.mHandle, 10004, aVMDLDataLoaderConfigure.mStoIoWriteLimitKBTh1);
            }
            if (aVMDLDataLoaderConfigure.mStoMaxIdleTimeSec > 0) {
                _setIntValue(this.mHandle, 10006, aVMDLDataLoaderConfigure.mStoMaxIdleTimeSec);
            }
        }
        if (aVMDLDataLoaderConfigure.mStoIoWriteLimitKBTh2 > 0) {
            _setIntValue(this.mHandle, 10005, aVMDLDataLoaderConfigure.mStoIoWriteLimitKBTh2);
        }
        _setIntValue(this.mHandle, 9400, aVMDLDataLoaderConfigure.mIgnorePlayInfo);
        if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mSettingsDomain)) {
            _setStringValue(this.mHandle, 9401, aVMDLDataLoaderConfigure.mSettingsDomain);
        }
        if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mDmDomain)) {
            _setStringValue(this.mHandle, 9402, aVMDLDataLoaderConfigure.mDmDomain);
        }
        if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mForesightDomain)) {
            _setStringValue(this.mHandle, 9403, aVMDLDataLoaderConfigure.mForesightDomain);
        }
        if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mDomains)) {
            _setStringValue(this.mHandle, 9404, aVMDLDataLoaderConfigure.mDomains);
        }
        if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mKeyDomain)) {
            _setStringValue(this.mHandle, 9405, aVMDLDataLoaderConfigure.mKeyDomain);
        }
        if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mKeyToken)) {
            _setStringValue(this.mHandle, 9406, aVMDLDataLoaderConfigure.mKeyToken);
        }
        if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mDynamicPreconnectConfigStr)) {
            _setStringValue(this.mHandle, 7501, aVMDLDataLoaderConfigure.mDynamicPreconnectConfigStr);
        }
        _setIntValue(this.mHandle, 11000, aVMDLDataLoaderConfigure.mEnableP2pUpload);
        _setIntValue(this.mHandle, 11002, aVMDLDataLoaderConfigure.mDevDiskSizeMB);
        _setIntValue(this.mHandle, 11004, aVMDLDataLoaderConfigure.mDevMemorySizeMB);
        if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mVdpExtGlobalInfo)) {
            _setStringValue(this.mHandle, 11001, aVMDLDataLoaderConfigure.mVdpExtGlobalInfo);
        }
        AVMDLDNSParser.setIntValue(0, this.mConfigure.mDNSMainType);
        AVMDLDNSParser.setIntValue(1, this.mConfigure.mDNSBackType);
        AVMDLDNSParser.setIntValue(2, this.mConfigure.mDefaultExpiredTime);
        AVMDLDNSParser.setIntValue(3, this.mConfigure.mMainToBackUpDelayedTime);
        MethodCollector.m26664o(13217);
    }

    public void setListener(int i, AVMDLDataLoaderListener aVMDLDataLoaderListener) {
        this.mWriteLock.lock();
        if (i == 107) {
            try {
                this.mLiveListener = aVMDLDataLoaderListener;
            } catch (Throwable th) {
                this.mWriteLock.unlock();
                throw th;
            }
        }
        this.mWriteLock.unlock();
    }

    private boolean postMessage(AVMDLDataLoaderListener aVMDLDataLoaderListener, Message message) {
        AVMDLDataLoaderNotifyInfo aVMDLDataLoaderNotifyInfo;
        if (message.what == 701) {
            AVMDLLog.m147905d("ttmn", "receive hijack err: ");
            hijack();
            return true;
        }
        if (!(aVMDLDataLoaderListener == null || message.obj == null || (aVMDLDataLoaderNotifyInfo = (AVMDLDataLoaderNotifyInfo) message.obj) == null)) {
            aVMDLDataLoaderListener.onNotify(aVMDLDataLoaderNotifyInfo);
        }
        return true;
    }

    public int copyFile(String str, String str2) {
        MethodCollector.m26663i(13421);
        int i = -1;
        if (this.mState != 1) {
            MethodCollector.m26664o(13421);
            return -1;
        }
        this.mWriteLock.lock();
        try {
            long j = this.mHandle;
            if (j != 0) {
                i = _copyFile(j, str, str2);
            }
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            MethodCollector.m26664o(13421);
            throw th;
        }
        this.mWriteLock.unlock();
        MethodCollector.m26664o(13421);
        return i;
    }

    public long getInt64Value(int i, long j) {
        if (i == 8003 || i == 8004) {
            AVMDLDataLoaderListener aVMDLDataLoaderListener = this.mLiveListener;
            if (aVMDLDataLoaderListener != null) {
                return aVMDLDataLoaderListener.getInt64Value(i, j);
            }
            AVMDLLog.m147906e("ttmn", "getInt64Value mLiveListener is nullptr, code: ".concat(String.valueOf(i)));
        }
        AVMDLLog.m147905d("ttmn", "getInt64Value code: " + i + " defaultValue: " + j);
        return j;
    }

    public String getStringValueByStr(String str, int i) {
        MethodCollector.m26663i(13927);
        String str2 = null;
        if (this.mState != 1) {
            MethodCollector.m26664o(13927);
            return null;
        }
        this.mReadLock.lock();
        try {
            long j = this.mHandle;
            if (j != 0) {
                str2 = _getStringValueByStr(j, str, i);
            }
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        } catch (Throwable th) {
            this.mReadLock.unlock();
            MethodCollector.m26664o(13927);
            throw th;
        }
        this.mReadLock.unlock();
        MethodCollector.m26664o(13927);
        return str2;
    }

    public void makeFileAutoDeleteFlag(String str, int i) {
        MethodCollector.m26663i(13646);
        if (this.mState != 1) {
            MethodCollector.m26664o(13646);
        } else if (TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(13646);
        } else {
            this.mWriteLock.lock();
            try {
                long j = this.mHandle;
                if (j != 0) {
                    _makeFileAutoDeleteFlag(j, str, i);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            } catch (Throwable th) {
                this.mWriteLock.unlock();
                MethodCollector.m26664o(13646);
                throw th;
            }
            this.mWriteLock.unlock();
            MethodCollector.m26664o(13646);
        }
    }

    public void preConnectByHost(String str, int i) {
        MethodCollector.m26663i(14083);
        if (this.mState != 1) {
            MethodCollector.m26664o(14083);
            return;
        }
        this.mWriteLock.lock();
        try {
            _preConnectByHost(this.mHandle, str, i);
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            MethodCollector.m26664o(14083);
            throw th;
        }
        this.mWriteLock.unlock();
        MethodCollector.m26664o(14083);
    }

    public void setBackUpIp(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            IPCache.getInstance().putBackUpIp(str, new AVMDLDNSInfo(11, str, str2, 0, (String) null));
        }
    }

    public void setIntValue(int i, int i2) {
        MethodCollector.m26663i(14047);
        if (this.mState != 1) {
            MethodCollector.m26664o(14047);
            return;
        }
        this.mWriteLock.lock();
        try {
            long j = this.mHandle;
            if (j != 0) {
                _setIntValue(j, i, i2);
            }
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            MethodCollector.m26664o(14047);
            throw th;
        }
        this.mWriteLock.unlock();
        MethodCollector.m26664o(14047);
    }

    public void setLongValue(int i, long j) {
        MethodCollector.m26663i(13778);
        if (this.mState != 1) {
            MethodCollector.m26664o(13778);
            return;
        }
        this.mWriteLock.lock();
        try {
            long j2 = this.mHandle;
            if (j2 != 0) {
                _setInt64Value(j2, i, j);
            }
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            MethodCollector.m26664o(13778);
            throw th;
        }
        this.mWriteLock.unlock();
        MethodCollector.m26664o(13778);
    }

    public void setStringValue(int i, String str) {
        MethodCollector.m26663i(13715);
        if (TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(13715);
        } else if (this.mState != 1) {
            MethodCollector.m26664o(13715);
        } else {
            this.mWriteLock.lock();
            try {
                long j = this.mHandle;
                if (j != 0) {
                    _setStringValue(j, i, str);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            } catch (Throwable th) {
                this.mWriteLock.unlock();
                MethodCollector.m26664o(13715);
                throw th;
            }
            this.mWriteLock.unlock();
            MethodCollector.m26664o(13715);
        }
    }

    private String createFilePathBaseDir(String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        if (str.charAt(str.length() - 1) == '/') {
            str3 = str + str2;
        } else {
            str3 = str + "/" + str2;
        }
        if (!TextUtils.isEmpty(str3)) {
            File file = new File(str3);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return str3;
    }

    public static String makeTsFileKey(String str, String str2) {
        MethodCollector.m26663i(14203);
        try {
            String _makeTsFileKey = _makeTsFileKey(str, str2);
            MethodCollector.m26664o(14203);
            return _makeTsFileKey;
        } catch (UnsatisfiedLinkError e) {
            AVMDLLog.m147906e("AVMDLDataLoader", "makeTsFileKey failed, native not support: " + e.getMessage());
            MethodCollector.m26664o(14203);
            return null;
        } catch (Exception e2) {
            AVMDLLog.m147906e("AVMDLDataLoader", "makeTsFileKey failed, other reason:  " + e2.getMessage());
            MethodCollector.m26664o(14203);
            return null;
        }
    }

    private boolean postMessage(LoaderListener loaderListener, Message message) {
        LoaderEventInfo loaderEventInfo;
        if (!(loaderListener == null || message.obj == null || (loaderEventInfo = (LoaderEventInfo) message.obj) == null)) {
            if (message.what == 71) {
                loaderListener.onLoaderTaskStart(loaderEventInfo);
                AVMDLLog.m147905d("ttmn", "receive eventLog KeyIsLoaderEventStart");
            } else if (message.what == 72) {
                loaderListener.onLoaderTaskCancel(loaderEventInfo);
                AVMDLLog.m147905d("ttmn", "receive eventLog KeyIsLoaderEventCancel");
            } else if (message.what == 73) {
                loaderListener.onLoaderTaskCompleted(loaderEventInfo);
                AVMDLLog.m147905d("ttmn", "receive eventLog KeyIsLoaderEventCompleted");
            } else {
                AVMDLLog.m147905d("ttmn", "receive eventLog fail");
            }
        }
        return true;
    }

    public void addDataSource(int i, String str) {
        MethodCollector.m26663i(14153);
        if (TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(14153);
            return;
        }
        AVMDLLog.m147905d("AVMDLDataLoader", "addDataSource: id: " + i + ", queyr: " + str);
        this.mWriteLock.lock();
        try {
            _addDataSource(this.mHandle, i, str);
        } catch (Exception | UnsatisfiedLinkError unused) {
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            MethodCollector.m26664o(14153);
            throw th;
        }
        this.mWriteLock.unlock();
        MethodCollector.m26664o(14153);
    }

    public long getLongValueByStr(String str, int i) {
        MethodCollector.m26663i(13894);
        long j = -1;
        if (this.mState != 1) {
            MethodCollector.m26664o(13894);
            return -1;
        } else if (TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(13894);
            return -1;
        } else {
            this.mWriteLock.lock();
            try {
                long j2 = this.mHandle;
                if (j2 != 0) {
                    j = _getLongValueByStr(j2, str, i);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            } catch (Throwable th) {
                this.mWriteLock.unlock();
                MethodCollector.m26664o(13894);
                throw th;
            }
            this.mWriteLock.unlock();
            MethodCollector.m26664o(13894);
            return j;
        }
    }

    public void preloadResource(String str, int i) {
        MethodCollector.m26663i(13647);
        if (this.mState != 1) {
            MethodCollector.m26664o(13647);
        } else if (TextUtils.isEmpty(str) || i == 0) {
            MethodCollector.m26664o(13647);
        } else {
            this.mWriteLock.lock();
            try {
                long j = this.mHandle;
                if (j != 0) {
                    _preloadResource(j, str, i);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            } catch (Throwable th) {
                this.mWriteLock.unlock();
                MethodCollector.m26664o(13647);
                throw th;
            }
            this.mWriteLock.unlock();
            MethodCollector.m26664o(13647);
        }
    }

    public static synchronized int init(boolean z, boolean z2) {
        synchronized (AVMDLDataLoader.class) {
            MethodCollector.m26663i(13291);
            if (mIsLibraryLoaded) {
                MethodCollector.m26664o(13291);
                return 0;
            }
            mIsLibraryLoaded = z;
            if (!z) {
                if (!C14485a.m26491a()) {
                    m147899x73ef00fe("ttmn", "load boringssl fail!");
                }
                if (!VcnlibloadWrapper.tryLoadVcnlib()) {
                    m147899x73ef00fe("ttmn", "Can't load vcn ");
                }
                loadAVMDLBaseLibrary();
                try {
                    m147898xf8671f56("avmdl");
                    mIsLibraryLoaded = true;
                } catch (UnsatisfiedLinkError e) {
                    m147899x73ef00fe("ttmn", "Can't load avmdl library: ".concat(String.valueOf(e)));
                } catch (Throwable th) {
                    m147899x73ef00fe("ttmn", "other exception when loading avmdl library: ".concat(String.valueOf(th)));
                }
                if (!VcnlibloadWrapper.tryLoadVcnverifylib()) {
                    m147899x73ef00fe("ttmn", "Can't load vcnverify lib ");
                }
                if (z2) {
                    m147899x73ef00fe("ttmn", "try to load pcdn lib");
                    try {
                        m147898xf8671f56("avmdlp2p");
                    } catch (UnsatisfiedLinkError e2) {
                        m147899x73ef00fe("ttmn", "Can't load avmdlp2p library: ".concat(String.valueOf(e2)));
                    } catch (Throwable th2) {
                        m147899x73ef00fe("ttmn", "other exception when loading avmdl library: ".concat(String.valueOf(th2)));
                    }
                }
                tryLoadTTNetLoaderPlugin();
            }
            if (!mIsLibraryLoaded) {
                MethodCollector.m26664o(13291);
                return -1;
            }
            MethodCollector.m26664o(13291);
            return 0;
        }
    }

    public long getCacheSize(String str, String str2) {
        MethodCollector.m26663i(13859);
        long j = -1;
        if (this.mState != 1) {
            MethodCollector.m26664o(13859);
            return -1;
        } else if (TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(13859);
            return -1;
        } else if (TextUtils.isEmpty(str2)) {
            MethodCollector.m26664o(13859);
            return -1;
        } else {
            this.mReadLock.lock();
            try {
                long j2 = this.mHandle;
                if (j2 != 0) {
                    j = _getLongValueByStrStr(j2, str, str2, 103);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            } catch (Throwable th) {
                this.mReadLock.unlock();
                MethodCollector.m26664o(13859);
                throw th;
            }
            this.mReadLock.unlock();
            MethodCollector.m26664o(13859);
            return j;
        }
    }

    public String getStringCacheInfo(String str, String str2) {
        MethodCollector.m26663i(14007);
        String str3 = null;
        if (this.mState != 1) {
            MethodCollector.m26664o(14007);
            return null;
        } else if (TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(14007);
            return null;
        } else if (TextUtils.isEmpty(str2)) {
            MethodCollector.m26664o(14007);
            return null;
        } else {
            this.mReadLock.lock();
            try {
                long j = this.mHandle;
                if (j != 0) {
                    str3 = _getStringValueByStrStr(j, str, str2, 101);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            } catch (Throwable th) {
                this.mReadLock.unlock();
                MethodCollector.m26664o(14007);
                throw th;
            }
            this.mReadLock.unlock();
            MethodCollector.m26664o(14007);
            return str3;
        }
    }

    public void onLogInfo(int i, int i2, String str) {
        onLogInfo(i, i2, -1, str);
    }

    public String getStringValueByStrkey(int i, long j, String str) {
        if (this.mState != 1) {
            return null;
        }
        if (i != 1503) {
            if ((i == 1506 || i == 1509) && this.mVodListener != null && !TextUtils.isEmpty(str)) {
                return this.mVodListener.getStringValue(i, j, str);
            }
            return null;
        } else if (this.mVodListener == null || TextUtils.isEmpty(str)) {
            return null;
        } else {
            return this.mVodListener.getCheckSumInfo(str);
        }
    }

    public void onNotify(int i, long j, int i2) {
        if (this.mState == 1 && this.mHandler != null) {
            AVMDLDataLoaderNotifyInfo aVMDLDataLoaderNotifyInfo = new AVMDLDataLoaderNotifyInfo();
            aVMDLDataLoaderNotifyInfo.what = i;
            aVMDLDataLoaderNotifyInfo.parameter = j;
            aVMDLDataLoaderNotifyInfo.code = (long) i2;
            Message obtainMessage = this.mHandler.obtainMessage();
            obtainMessage.obj = aVMDLDataLoaderNotifyInfo;
            obtainMessage.what = i;
            obtainMessage.sendToTarget();
        }
    }

    public void setInt64ValueByStrKey(int i, String str, long j) {
        MethodCollector.m26663i(13716);
        if (this.mState != 1) {
            MethodCollector.m26664o(13716);
            return;
        }
        this.mWriteLock.lock();
        try {
            long j2 = this.mHandle;
            if (j2 != 0) {
                _setInt64ValueByStrKey(j2, i, str, j);
            }
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            MethodCollector.m26664o(13716);
            throw th;
        }
        this.mWriteLock.unlock();
        MethodCollector.m26664o(13716);
    }

    private double testFileIO(String str, int i, RandomAccessFile randomAccessFile) {
        MethodCollector.m26663i(13588);
        if (TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(13588);
            return -1.0d;
        }
        long currentTimeMillis = System.currentTimeMillis();
        randomAccessFile.seek((long) i);
        byte[] bArr = new byte[4096];
        int i2 = 0;
        do {
            Thread.sleep(5);
            randomAccessFile.write(bArr, 0, 1024);
            i2++;
        } while (i2 < 200);
        long currentTimeMillis2 = ((System.currentTimeMillis() - currentTimeMillis) - 1000) + 0;
        if (currentTimeMillis2 > 0) {
            AVMDLLog.m147905d("BENCHMARKIO", C1764a.m5928a("size:%d costtime:%d", new Object[]{819200, Long.valueOf(currentTimeMillis2)}));
            double d = (double) (819200 / currentTimeMillis2);
            MethodCollector.m26664o(13588);
            return d;
        }
        MethodCollector.m26664o(13588);
        return -1.0d;
    }

    public void preloadResource(String str, int i, int i2) {
        MethodCollector.m26663i(13713);
        if (this.mState != 1) {
            MethodCollector.m26664o(13713);
        } else if (TextUtils.isEmpty(str) || i2 == 0) {
            MethodCollector.m26664o(13713);
        } else {
            this.mWriteLock.lock();
            try {
                long j = this.mHandle;
                if (j != 0) {
                    _preloadResourceWithOffset(j, str, i, i2);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            } catch (Throwable th) {
                this.mWriteLock.unlock();
                MethodCollector.m26664o(13713);
                throw th;
            }
            this.mWriteLock.unlock();
            MethodCollector.m26664o(13713);
        }
    }

    public static synchronized int init(boolean z, boolean z2, boolean z3) {
        synchronized (AVMDLDataLoader.class) {
            MethodCollector.m26663i(13342);
            if (mIsLibraryLoaded) {
                MethodCollector.m26664o(13342);
                return 0;
            }
            mIsLibraryLoaded = z;
            if (!z) {
                if (!C14485a.m26491a()) {
                    m147899x73ef00fe("ttmn", "load boringssl fail!");
                }
                if (!VcnlibloadWrapper.tryLoadVcnlib()) {
                    m147899x73ef00fe("ttmn", "Can't load vcn ");
                }
                if (z3) {
                    try {
                        m147898xf8671f56("avmdlv2");
                        mIsLibraryLoaded = true;
                    } catch (UnsatisfiedLinkError e) {
                        m147899x73ef00fe("ttmn", "load avmdlv2 failed: ".concat(String.valueOf(e)));
                    }
                }
                if (!mIsLibraryLoaded) {
                    try {
                        m147898xf8671f56("avmdl");
                        mIsLibraryLoaded = true;
                    } catch (UnsatisfiedLinkError e2) {
                        m147899x73ef00fe("ttmn", "Can't load avmdl library: ".concat(String.valueOf(e2)));
                    } catch (Throwable th) {
                        m147899x73ef00fe("ttmn", "other exception when loading avmdl library: ".concat(String.valueOf(th)));
                    }
                    if (!VcnlibloadWrapper.tryLoadVcnverifylib()) {
                        m147899x73ef00fe("ttmn", "Can't load vcnverify lib ");
                    }
                    if (z2) {
                        m147899x73ef00fe("ttmn", "try to load pcdn lib");
                        try {
                            m147898xf8671f56("avmdlp2p");
                        } catch (UnsatisfiedLinkError e3) {
                            m147899x73ef00fe("ttmn", "Can't load avmdlp2p library: ".concat(String.valueOf(e3)));
                        } catch (Throwable th2) {
                            m147899x73ef00fe("ttmn", "other exception when loading avmdl library: ".concat(String.valueOf(th2)));
                        }
                    }
                    tryLoadTTNetLoaderPlugin();
                }
            }
            if (!mIsLibraryLoaded) {
                MethodCollector.m26664o(13342);
                return -1;
            }
            MethodCollector.m26664o(13342);
            return 0;
        }
    }

    public void preloadGroupResource(String str, String str2, int i, int i2) {
        MethodCollector.m26663i(13714);
        if (this.mState != 1) {
            MethodCollector.m26664o(13714);
        } else if (TextUtils.isEmpty(str2) || i2 == 0) {
            MethodCollector.m26664o(13714);
        } else {
            this.mWriteLock.lock();
            try {
                long j = this.mHandle;
                if (j != 0) {
                    _preloadGroupResource(j, str, str2, i, i2);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            } catch (Throwable th) {
                this.mWriteLock.unlock();
                MethodCollector.m26664o(13714);
                throw th;
            }
            this.mWriteLock.unlock();
            MethodCollector.m26664o(13714);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(25:44|(1:46)(2:48|(1:50))|47|51|(2:52|53)|54|56|57|58|59|60|(1:63)(1:62)|64|(1:66)(1:86)|67|(1:69)|70|(1:72)(1:85)|73|(1:75)(1:84)|76|(1:78)(1:83)|79|(1:81)|82) */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01a1, code lost:
        if (0 != 1) goto L_0x0088;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:58:0x010e */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01a7 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLogInfo(int r15, int r16, int r17, java.lang.String r18) {
        /*
        // Method dump skipped, instructions count: 448
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.mediakit.medialoader.AVMDLDataLoader.onLogInfo(int, int, int, java.lang.String):void");
    }

    public void updateDNSInfo(String str, String str2, long j, String str3, int i) {
        MethodCollector.m26663i(14123);
        if (this.mState != 1) {
            MethodCollector.m26664o(14123);
            return;
        }
        this.mWriteLock.lock();
        try {
            _updateDNSInfo(this.mHandle, str, str2, j, str3, i);
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            MethodCollector.m26664o(14123);
            throw th;
        }
        this.mWriteLock.unlock();
        MethodCollector.m26664o(14123);
    }
}
