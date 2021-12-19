package com.bytedance.vcloud.networkpredictor;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;

public class SpeedPredictorJniLoader {
    public static volatile String exception = "";
    public static volatile boolean isLibraryLoaded;
    private static LibraryLoaderProxy mLibraryLoader;

    /* renamed from: com.bytedance.vcloud.networkpredictor.SpeedPredictorJniLoader$1 */
    static /* synthetic */ class C235431 {
        static {
            Covode.recordClassIndex(27624);
        }
    }

    static class DefaultLoader implements LibraryLoaderProxy {
        static {
            Covode.recordClassIndex(27625);
        }

        private DefaultLoader() {
        }

        /* synthetic */ DefaultLoader(C235431 r1) {
            this();
        }

        @Override // com.bytedance.vcloud.networkpredictor.LibraryLoaderProxy
        public boolean loadLibrary(String str) {
            try {
                m44264x3ed77bef(str);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }

        /* renamed from: com_bytedance_vcloud_networkpredictor_SpeedPredictorJniLoader$DefaultLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary */
        public static void m44264x3ed77bef(String str) {
            long uptimeMillis = SystemClock.uptimeMillis();
            Librarian.m38964a(str, false, (Context) null);
            C58032m.m104852a(uptimeMillis, str);
        }
    }

    static {
        Covode.recordClassIndex(27623);
    }

    public static synchronized boolean loadLibrary() {
        boolean z;
        synchronized (SpeedPredictorJniLoader.class) {
            MethodCollector.m26663i(6898);
            try {
                if (!isLibraryLoaded) {
                    LibraryLoaderProxy libraryLoaderProxy = mLibraryLoader;
                    if (libraryLoaderProxy == null) {
                        libraryLoaderProxy = new DefaultLoader(null);
                    }
                    isLibraryLoaded = libraryLoaderProxy.loadLibrary("networkpredictor");
                }
            } catch (Throwable th) {
                exception = th.toString();
                isLibraryLoaded = false;
            }
            z = isLibraryLoaded;
            MethodCollector.m26664o(6898);
        }
        return z;
    }

    public static void setLoadProxy(LibraryLoaderProxy libraryLoaderProxy) {
        mLibraryLoader = libraryLoaderProxy;
    }
}
