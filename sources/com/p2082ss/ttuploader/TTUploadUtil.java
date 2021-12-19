package com.p2082ss.ttuploader;

import android.content.Context;
import android.os.SystemClock;
import com.C1764a;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.bytedance.p967e.p968a.C14485a;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;
import com.p2082ss.mediakit.vcnlib.VcnlibloadWrapper;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;

/* renamed from: com.ss.ttuploader.TTUploadUtil */
public class TTUploadUtil {
    private static volatile boolean mIsLibraryLoaded;
    private static final ReentrantLock mLock = new ReentrantLock();
    private static volatile TTLibraryLoaderProxy mProxy;
    public static volatile String mServerIP;
    public static volatile long mServerIPTime;

    /* renamed from: com_ss_ttuploader_TTUploadUtil_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m148575x77ca8a7(String str, String str2) {
        return 0;
    }

    /* renamed from: com_ss_ttuploader_TTUploadUtil_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m148576x77ca8a8(String str, String str2) {
        return 0;
    }

    public static String getDNSServerIP() {
        updateDNSServerIP();
        return mServerIP;
    }

    static {
        Covode.recordClassIndex(101492);
    }

    private static boolean loadVcn() {
        if (!VcnlibloadWrapper.tryLoadVcnlib()) {
            m148576x77ca8a8("ttmn", "Can't load vcn");
        }
        if (VcnlibloadWrapper.tryLoadVcnverifylib()) {
            return true;
        }
        m148576x77ca8a8("ttmn", "Can't load vcn verify");
        return true;
    }

    public static synchronized void updateDNSServerIP() {
        synchronized (TTUploadUtil.class) {
            MethodCollector.m26663i(12579);
            if (SystemClock.elapsedRealtime() - mServerIPTime < 300000) {
                MethodCollector.m26664o(12579);
                return;
            }
            new Thread(new Runnable() {
                /* class com.p2082ss.ttuploader.TTUploadUtil.RunnableC862901 */

                static {
                    Covode.recordClassIndex(101493);
                }

                public final void run() {
                    try {
                        InetAddress byName = InetAddress.getByName("whoami.akamai.net");
                        if (byName != null) {
                            TTUploadUtil.mServerIP = byName.getHostAddress();
                            TTUploadUtil.mServerIPTime = SystemClock.elapsedRealtime();
                        }
                    } catch (UnknownHostException unused) {
                    }
                }
            }).start();
            MethodCollector.m26664o(12579);
        }
    }

    public static synchronized boolean initInternal() {
        boolean z;
        synchronized (TTUploadUtil.class) {
            MethodCollector.m26663i(12467);
            if (!loadLibrary()) {
                m148576x77ca8a8("ttmn", C1764a.m5928a("proxy library load fail", new Object[0]));
                MethodCollector.m26664o(12467);
                return false;
            }
            m148575x77ca8a7("ttmn", "use defaullt loadLibrary()");
            if (mProxy != null) {
                z = true;
            } else {
                z = false;
            }
            if (systemLoadInit(z) != 1) {
                m148576x77ca8a8("ttmn", C1764a.m5928a("library has not been loaded", new Object[0]));
                MethodCollector.m26664o(12467);
                return false;
            }
            m148575x77ca8a7("ttmn", "init()");
            MethodCollector.m26664o(12467);
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
            boolean loadLibrary2 = mProxy.loadLibrary("ttvideouploader");
            if (!z || !loadLibrary2) {
                z2 = false;
            }
            mIsLibraryLoaded = z2;
        }
        return mIsLibraryLoaded;
    }

    /* renamed from: com_ss_ttuploader_TTUploadUtil_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary */
    public static void m148574xfdc8bbec(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.m38964a(str, false, (Context) null);
        C58032m.m104852a(uptimeMillis, str);
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

    public static void setLoadProxy(TTLibraryLoaderProxy tTLibraryLoaderProxy) {
        ReentrantLock reentrantLock = mLock;
        reentrantLock.lock();
        if (tTLibraryLoaderProxy != null) {
            try {
                mProxy = tTLibraryLoaderProxy;
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

    private static int systemLoadInit(boolean z) {
        if (mIsLibraryLoaded) {
            return 1;
        }
        mIsLibraryLoaded = z;
        if (!z) {
            if (!C14485a.m26491a()) {
                m148576x77ca8a8("ttmn", "load boringssl fail!");
            }
            if (!VcnlibloadWrapper.tryLoadVcnlib()) {
                m148576x77ca8a8("ttmn", "Can't load vcn");
            }
            if (!VcnlibloadWrapper.tryLoadVcnverifylib()) {
                m148576x77ca8a8("ttmn", "Can't load vcn verify");
            }
            try {
                m148576x77ca8a8("ttmn", "load openssl");
                m148574xfdc8bbec("ttopenssl");
            } catch (UnsatisfiedLinkError e) {
                m148576x77ca8a8("ttmn", "Can't load openssl library: ".concat(String.valueOf(e)));
            } catch (Throwable th) {
                m148576x77ca8a8("ttmn", "other exception when loading openssl library: ".concat(String.valueOf(th)));
            }
            try {
                m148574xfdc8bbec("ttvideouploader");
                mIsLibraryLoaded = true;
            } catch (UnsatisfiedLinkError e2) {
                m148576x77ca8a8("ttmn", "Can't load avmdl library: ".concat(String.valueOf(e2)));
            } catch (Throwable th2) {
                m148576x77ca8a8("ttmn", "other exception when loading avmdl library: ".concat(String.valueOf(th2)));
            }
        }
        if (!mIsLibraryLoaded) {
            return -1;
        }
        return 1;
    }
}
