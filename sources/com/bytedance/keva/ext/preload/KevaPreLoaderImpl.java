package com.bytedance.keva.ext.preload;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.IKevaPreLoader;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;

/* access modifiers changed from: package-private */
public final class KevaPreLoaderImpl implements IKevaPreLoader {
    private final FixedSizeCache<String, Integer> mCache;
    private final boolean mEnableRecord;
    private final Executor mExecutor;
    private volatile boolean mIsPreloading;
    private final long mLastModifiedTime;
    private final String mName;
    private final long mPreloadConfigExpiredInMills;
    private final Object mPreloadEndLock = new Object();
    private final File mPreloadFile;
    private final long mPreloadTimeInMills;
    private boolean mRecordEnd;
    private final long mStartTickMills;
    private final File mWorkDir;

    static {
        Covode.recordClassIndex(24255);
    }

    /* renamed from: com_bytedance_keva_ext_preload_KevaPreLoaderImpl_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m38935x809523c9(String str, String str2) {
        return 0;
    }

    /* renamed from: com_bytedance_keva_ext_preload_KevaPreLoaderImpl_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m38936x809523ca(String str, String str2, Throwable th) {
        return 0;
    }

    /* renamed from: com_bytedance_keva_ext_preload_KevaPreLoaderImpl_com_ss_android_ugc_aweme_lancet_LogLancet_w */
    public static int m38937x809523dc(String str, String str2) {
        return 0;
    }

    @Override // com.bytedance.keva.IKevaPreLoader
    public final void preload() {
        this.mExecutor.execute(new KevaPreLoaderImpl$$Lambda$1(this));
    }

    private String getCurrentProcessPreloadFileName() {
        return getCurrentProcessName() + ":keva-preload-list";
    }

    /* access modifiers changed from: private */
    /* renamed from: recordEnd */
    public void bridge$lambda$0$KevaPreLoaderImpl() {
        MethodCollector.m26663i(13897);
        synchronized (this) {
            try {
                this.mRecordEnd = true;
                writeCache2File();
            } finally {
                MethodCollector.m26664o(13897);
            }
        }
    }

    private String checkParentDirs() {
        String absolutePath = this.mWorkDir.getAbsolutePath();
        if (!new File(absolutePath).exists()) {
            return null;
        }
        String str = absolutePath + "/repo";
        if (new File(str).exists()) {
            return str;
        }
        return null;
    }

    private String getCurrentProcessName() {
        String[] split = getCurrentProcessNameSuffix().split(":");
        if (split.length < 2) {
            return "main";
        }
        String str = split[split.length - 1];
        int indexOf = str.indexOf(10);
        if (indexOf <= 0) {
            return str;
        }
        return str.substring(0, indexOf);
    }

    private String getCurrentProcessNameSuffix() {
        Throwable th;
        MethodCollector.m26663i(13895);
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream("/proc/" + ((long) Process.myPid()) + "/comm");
            try {
                byte[] bArr = new byte[64];
                int read = fileInputStream2.read(bArr);
                if (read <= 0) {
                    m38941w("read comm failed = ".concat(String.valueOf(read)));
                    close(fileInputStream2);
                    MethodCollector.m26664o(13895);
                    return "";
                }
                String str = new String(bArr);
                close(fileInputStream2);
                MethodCollector.m26664o(13895);
                return str;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                try {
                    m38940e("getProcessName:", th);
                    return "";
                } finally {
                    close(fileInputStream);
                    MethodCollector.m26664o(13895);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            m38940e("getProcessName:", th);
            return "";
        }
    }

    private void writeCache2File() {
        if (checkParentDirs() != null && this.mCache.size() != 0) {
            File file = this.mPreloadFile;
            if (file.exists()) {
                long currentTimeMillis = System.currentTimeMillis() - this.mLastModifiedTime;
                m38939d("exist preload file, duration = ".concat(String.valueOf(currentTimeMillis)));
                if (currentTimeMillis > this.mPreloadConfigExpiredInMills) {
                    if (this.mIsPreloading) {
                        this.mExecutor.execute(new KevaPreLoaderImpl$$Lambda$3(this, file));
                        return;
                    }
                    m38939d("remove reload file = " + m38938x121e7504(file));
                }
            }
            m38939d("preload file name = " + file.getName());
            doRealWrite(file);
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01b2 A[SYNTHETIC, Splitter:B:80:0x01b2] */
    /* renamed from: doPreload */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void bridge$lambda$1$KevaPreLoaderImpl() {
        /*
        // Method dump skipped, instructions count: 505
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.keva.ext.preload.KevaPreLoaderImpl.bridge$lambda$1$KevaPreLoaderImpl():void");
    }

    private static void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: d */
    private void m38939d(String str) {
        m38935x809523c9("PreloadMgr", str);
    }

    /* renamed from: w */
    private void m38941w(String str) {
        m38937x809523dc("PreloadMgr", str);
    }

    private void doRealWrite(File file) {
        this.mExecutor.execute(new KevaPreLoaderImpl$$Lambda$4(this, file, this.mCache.snapshot()));
    }

    /* renamed from: com_bytedance_keva_ext_preload_KevaPreLoaderImpl_com_ss_android_ugc_aweme_storage_FileLancet_delete */
    public static boolean m38938x121e7504(File file) {
        MethodCollector.m26663i(13980);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(13980);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(13980);
        return delete;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$writeCache2File$1$KevaPreLoaderImpl(File file) {
        MethodCollector.m26663i(14013);
        m38939d("wait preload end...");
        while (this.mIsPreloading) {
            synchronized (this.mPreloadEndLock) {
                try {
                    this.mPreloadEndLock.wait();
                    m38939d("preload end");
                } catch (Throwable th) {
                    MethodCollector.m26664o(14013);
                    throw th;
                }
            }
        }
        m38939d("remove preload file = " + m38938x121e7504(file));
        doRealWrite(file);
        MethodCollector.m26664o(14013);
    }

    /* renamed from: e */
    private void m38940e(String str, Throwable th) {
        m38936x809523ca("PreloadMgr", str, th);
    }

    @Override // com.bytedance.keva.IKevaPreLoader
    public final synchronized void access(String str, int i) {
        MethodCollector.m26663i(13928);
        if (i == 1 || str == null || str.equals("")) {
            MethodCollector.m26664o(13928);
        } else if (this.mRecordEnd || !this.mEnableRecord) {
            MethodCollector.m26664o(13928);
        } else {
            if (System.currentTimeMillis() - this.mStartTickMills < this.mPreloadTimeInMills) {
                Integer num = this.mCache.get(str);
                if (num == null) {
                    this.mCache.put(str, 1);
                    MethodCollector.m26664o(13928);
                    return;
                }
                this.mCache.put(str, Integer.valueOf(num.intValue() + 1));
            }
            MethodCollector.m26664o(13928);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$doRealWrite$2$KevaPreLoaderImpl(File file, Map map) {
        Throwable th;
        MethodCollector.m26663i(14012);
        BufferedOutputStream bufferedOutputStream = null;
        try {
            m38939d("write to file = " + file.getAbsolutePath());
            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file));
            try {
                bufferedOutputStream2.write((file.getName() + "\n").getBytes());
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    bufferedOutputStream2.write((((String) ((Map.Entry) it.next()).getKey()) + "\n").getBytes());
                }
                m38939d("write preload done");
                close(bufferedOutputStream2);
            } catch (Throwable th2) {
                th = th2;
                bufferedOutputStream = bufferedOutputStream2;
                try {
                    m38940e("write file:", th);
                    close(bufferedOutputStream);
                    MethodCollector.m26664o(14012);
                } catch (Throwable th3) {
                    close(bufferedOutputStream);
                    MethodCollector.m26664o(14012);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            m38940e("write file:", th);
            close(bufferedOutputStream);
            MethodCollector.m26664o(14012);
        }
        MethodCollector.m26664o(14012);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$doPreload$0$KevaPreLoaderImpl(String str, AtomicLong atomicLong, long j) {
        Keva.getRepoSync(str, 0);
        atomicLong.decrementAndGet();
        if (atomicLong.get() == 0) {
            m38939d("preload file duration = ".concat(String.valueOf(System.currentTimeMillis() - j)));
        }
    }

    KevaPreLoaderImpl(File file, Executor executor, long j, int i, long j2) {
        boolean z;
        long j3 = 0;
        if (j <= 0) {
            throw new IllegalArgumentException("preloadTimeInMills <= 0");
        } else if (i <= 0) {
            throw new IllegalArgumentException("maxRepos <= 0");
        } else if (executor != null) {
            this.mPreloadConfigExpiredInMills = j2;
            this.mWorkDir = file;
            this.mPreloadTimeInMills = j;
            this.mStartTickMills = System.currentTimeMillis();
            this.mCache = new FixedSizeCache<>(i);
            String currentProcessPreloadFileName = getCurrentProcessPreloadFileName();
            this.mName = currentProcessPreloadFileName;
            File file2 = new File(file, currentProcessPreloadFileName);
            this.mPreloadFile = file2;
            j3 = file2.exists() ? file2.lastModified() : j3;
            this.mLastModifiedTime = j3;
            this.mExecutor = executor;
            if (System.currentTimeMillis() - j3 > j2) {
                z = true;
            } else {
                z = false;
            }
            this.mEnableRecord = z;
            if (z) {
                new Handler(Looper.getMainLooper()).postDelayed(new KevaPreLoaderImpl$$Lambda$0(this), j);
            }
        } else {
            throw new IllegalArgumentException("executor = null");
        }
    }
}
