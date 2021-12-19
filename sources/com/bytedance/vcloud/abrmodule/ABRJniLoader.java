package com.bytedance.vcloud.abrmodule;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;

public class ABRJniLoader {
    public static volatile String exception = "";
    public static volatile boolean isLibraryLoaded;
    private static LibraryLoaderProxy mLibraryLoader;

    /* renamed from: com.bytedance.vcloud.abrmodule.ABRJniLoader$1 */
    static /* synthetic */ class C235401 {
        static {
            Covode.recordClassIndex(27580);
        }
    }

    static class DefaultLoader implements LibraryLoaderProxy {
        static {
            Covode.recordClassIndex(27581);
        }

        private DefaultLoader() {
        }

        /* synthetic */ DefaultLoader(C235401 r1) {
            this();
        }

        @Override // com.bytedance.vcloud.abrmodule.LibraryLoaderProxy
        public boolean loadLibrary(String str) {
            try {
                m44249x9edbcb38(str);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }

        /* renamed from: com_bytedance_vcloud_abrmodule_ABRJniLoader$DefaultLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary */
        public static void m44249x9edbcb38(String str) {
            long uptimeMillis = SystemClock.uptimeMillis();
            Librarian.m38964a(str, false, (Context) null);
            C58032m.m104852a(uptimeMillis, str);
        }
    }

    static {
        Covode.recordClassIndex(27579);
    }

    public static synchronized boolean loadLibrary() {
        boolean z;
        synchronized (ABRJniLoader.class) {
            MethodCollector.m26663i(5657);
            try {
                if (!isLibraryLoaded) {
                    LibraryLoaderProxy libraryLoaderProxy = mLibraryLoader;
                    if (libraryLoaderProxy == null) {
                        libraryLoaderProxy = new DefaultLoader(null);
                    }
                    isLibraryLoaded = libraryLoaderProxy.loadLibrary("abrmodule");
                }
            } catch (Throwable th) {
                exception = th.toString();
                isLibraryLoaded = false;
            }
            z = isLibraryLoaded;
            MethodCollector.m26664o(5657);
        }
        return z;
    }

    public static void setLoadProxy(LibraryLoaderProxy libraryLoaderProxy) {
        mLibraryLoader = libraryLoaderProxy;
    }
}
