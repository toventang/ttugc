package com.p2082ss.bduploader;

import android.content.Context;
import android.os.SystemClock;
import com.C1764a;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.bytedance.p967e.p968a.C14485a;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;
import com.p2082ss.bduploader.logupload.VideoEventEngineUploader;
import com.p2082ss.mediakit.vcnlib.VcnlibloadWrapper;
import java.io.File;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;

/* renamed from: com.ss.bduploader.BDUploadUtil */
public class BDUploadUtil {
    public static String DiskResumeConfigDir = "DiskResumeConfigDir";
    public static String SpeedTestcontextDir = "SpeedTestcontextDir";
    public static VideoEventEngineUploader eventEngineUploader = null;
    private static volatile boolean mIsLibraryLoaded;
    private static final ReentrantLock mLock = new ReentrantLock();
    private static volatile BDLibraryLoaderProxy mProxy;
    public static volatile String mServerIP;
    public static volatile long mServerIPTime;
    public static String sdkConfigDir;

    /* renamed from: com_ss_bduploader_BDUploadUtil_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m147843x45d24b67(String str, String str2) {
        return 0;
    }

    /* renamed from: com_ss_bduploader_BDUploadUtil_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m147844x45d24b68(String str, String str2) {
        return 0;
    }

    /* renamed from: com_ss_bduploader_BDUploadUtil_com_ss_android_ugc_aweme_lancet_LogLancet_v */
    public static int m147845x45d24b79(String str, String str2) {
        return 0;
    }

    public static String getDNSServerIP() {
        updateDNSServerIP();
        return mServerIP;
    }

    static {
        Covode.recordClassIndex(100802);
    }

    private static boolean loadVcn() {
        if (!VcnlibloadWrapper.tryLoadVcnlib()) {
            m147844x45d24b68("ttmn", "Can't load vcn");
        }
        if (VcnlibloadWrapper.tryLoadVcnverifylib()) {
            return true;
        }
        m147844x45d24b68("ttmn", "Can't load vcn verify");
        return true;
    }

    public static synchronized void updateDNSServerIP() {
        synchronized (BDUploadUtil.class) {
            MethodCollector.m26663i(6824);
            if (SystemClock.elapsedRealtime() - mServerIPTime < 300000) {
                MethodCollector.m26664o(6824);
                return;
            }
            new Thread(new Runnable() {
                /* class com.p2082ss.bduploader.BDUploadUtil.RunnableC860621 */

                static {
                    Covode.recordClassIndex(100803);
                }

                public final void run() {
                    try {
                        InetAddress byName = InetAddress.getByName("whoami.akamai.net");
                        if (byName != null) {
                            BDUploadUtil.mServerIP = byName.getHostAddress();
                            BDUploadUtil.mServerIPTime = SystemClock.elapsedRealtime();
                        }
                    } catch (UnknownHostException unused) {
                    }
                }
            }).start();
            MethodCollector.m26664o(6824);
        }
    }

    public static synchronized boolean initInternal() {
        boolean z;
        synchronized (BDUploadUtil.class) {
            MethodCollector.m26663i(6820);
            if (!loadLibrary()) {
                m147844x45d24b68("ttmn", C1764a.m5928a("proxy library load fail", new Object[0]));
                MethodCollector.m26664o(6820);
                return false;
            }
            m147843x45d24b67("ttmn", "use defaullt loadLibrary()");
            if (mProxy != null) {
                z = true;
            } else {
                z = false;
            }
            if (systemLoadInit(z) != 1) {
                m147844x45d24b68("ttmn", C1764a.m5928a("library has not been loaded", new Object[0]));
                MethodCollector.m26664o(6820);
                return false;
            }
            m147843x45d24b67("ttmn", "init()");
            MethodCollector.m26664o(6820);
            return true;
        }
    }

    private static boolean loadLibrary() {
        boolean z;
        boolean z2 = true;
        if (mProxy == null) {
            return true;
        }
        if (mProxy != null && !mIsLibraryLoaded) {
            boolean a = C14485a.m26491a();
            boolean loadLibrary = mProxy.loadLibrary("ttopenssl");
            if (a || loadLibrary) {
                z = true;
            } else {
                z = false;
            }
            mProxy.loadLibrary("vcn");
            mProxy.loadLibrary("vcnverify");
            boolean loadLibrary2 = mProxy.loadLibrary("bdvideouploader");
            if (!z || !loadLibrary2) {
                z2 = false;
            }
            mIsLibraryLoaded = z2;
        }
        return mIsLibraryLoaded;
    }

    public static void setVideoEventUpload(VideoEventEngineUploader videoEventEngineUploader) {
        eventEngineUploader = videoEventEngineUploader;
    }

    /* renamed from: com_ss_bduploader_BDUploadUtil_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary */
    public static void m147842x3181912c(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.m38964a(str, false, (Context) null);
        C58032m.m104852a(uptimeMillis, str);
    }

    public static void setSDKConfigDir(String str) {
        String str2 = sdkConfigDir;
        if (str2 == null || str2.length() <= 0) {
            sdkConfigDir = str;
        }
    }

    public static Map<String, String> jsonToHashMap(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String valueOf = String.valueOf(keys.next());
            hashMap.put(valueOf, jSONObject.optString(valueOf));
        }
        return hashMap;
    }

    public static void setLoadProxy(BDLibraryLoaderProxy bDLibraryLoaderProxy) {
        ReentrantLock reentrantLock = mLock;
        reentrantLock.lock();
        if (bDLibraryLoaderProxy != null) {
            try {
                mProxy = bDLibraryLoaderProxy;
            } catch (Throwable th) {
                mLock.unlock();
                throw th;
            }
        }
        reentrantLock.unlock();
    }

    public static JSONObject mapToJSON(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                Object obj = map.get(str);
                if (!C13627m.m24498a(str)) {
                    jSONObject.put(str, obj);
                }
            }
            return jSONObject;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String mapToString(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                Object obj = map.get(str);
                if (!C13627m.m24498a(str)) {
                    jSONObject.put(str, obj);
                }
            }
            return jSONObject.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public static int createDir(String str) {
        File file = new File(str);
        if (file.exists()) {
            m147845x45d24b79("ttmn", str + " has already exists");
            return 1;
        }
        if (!str.endsWith(File.separator)) {
            str = str + File.separator;
        }
        if (file.mkdirs()) {
            m147843x45d24b67("ttmn", str + "create success");
            return 1;
        }
        m147844x45d24b68("ttmn", str + " failed");
        return -1;
    }

    private static int systemLoadInit(boolean z) {
        if (mIsLibraryLoaded) {
            return 1;
        }
        mIsLibraryLoaded = z;
        if (!z) {
            if (!C14485a.m26491a()) {
                m147844x45d24b68("ttmn", "load boringssl fail!");
            }
            if (!VcnlibloadWrapper.tryLoadVcnlib()) {
                m147844x45d24b68("ttmn", "Can't load vcn");
            }
            if (!VcnlibloadWrapper.tryLoadVcnverifylib()) {
                m147844x45d24b68("ttmn", "Can't load vcn verify");
            }
            try {
                m147844x45d24b68("ttmn", "load openssl");
                m147842x3181912c("ttopenssl");
            } catch (UnsatisfiedLinkError e) {
                m147844x45d24b68("ttmn", "Can't load openssl library: ".concat(String.valueOf(e)));
            } catch (Throwable th) {
                m147844x45d24b68("ttmn", "other exception when loading openssl library: ".concat(String.valueOf(th)));
            }
            try {
                m147842x3181912c("bdvideouploader");
                mIsLibraryLoaded = true;
            } catch (UnsatisfiedLinkError e2) {
                m147844x45d24b68("ttmn", "Can't load avmdl library: ".concat(String.valueOf(e2)));
            } catch (Throwable th2) {
                m147844x45d24b68("ttmn", "other exception when loading avmdl library: ".concat(String.valueOf(th2)));
            }
        }
        if (!mIsLibraryLoaded) {
            return -1;
        }
        return 1;
    }
}
