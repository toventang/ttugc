package com.bytedance.bae.base;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;

class NativeLibrary {
    public static String TAG = "NativeLibrary";
    private static boolean libraryLoaded;
    private static NativeLibraryLoadListener loadListener;
    public static Object lock = new Object();

    static class DefaultLoader implements NativeLibraryLoader {
        static {
            Covode.recordClassIndex(15012);
        }

        DefaultLoader() {
        }

        /* renamed from: com_bytedance_bae_base_NativeLibrary$DefaultLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary */
        public static void m23639xeeb8618e(String str) {
            long uptimeMillis = SystemClock.uptimeMillis();
            Librarian.m38964a(str, false, (Context) null);
            C58032m.m104852a(uptimeMillis, str);
        }

        @Override // com.bytedance.bae.base.NativeLibraryLoader
        public boolean load(String str) {
            MethodCollector.m26663i(1389);
            Logging.m23635i(NativeLibrary.TAG, "Loading library: ".concat(String.valueOf(str)));
            try {
                synchronized (NativeLibrary.lock) {
                    try {
                        m23639xeeb8618e(str);
                    } catch (Throwable th) {
                        MethodCollector.m26664o(1389);
                        throw th;
                    }
                }
                MethodCollector.m26664o(1389);
                return true;
            } catch (UnsatisfiedLinkError e) {
                Logging.m23634e(NativeLibrary.TAG, "Failed to load native library: ".concat(String.valueOf(str)), e);
                MethodCollector.m26664o(1389);
                return false;
            }
        }
    }

    NativeLibrary() {
    }

    static void disposeListener() {
        if (loadListener != null) {
            loadListener = null;
        }
    }

    static {
        Covode.recordClassIndex(15011);
    }

    static boolean isLoaded() {
        boolean z;
        MethodCollector.m26663i(354);
        synchronized (lock) {
            try {
                z = libraryLoaded;
            } finally {
                MethodCollector.m26664o(354);
            }
        }
        return z;
    }

    static void setLoadListener(NativeLibraryLoadListener nativeLibraryLoadListener) {
        loadListener = nativeLibraryLoadListener;
    }

    static void initialize(NativeLibraryLoader nativeLibraryLoader, String str) {
        MethodCollector.m26663i(350);
        synchronized (lock) {
            try {
                if (libraryLoaded) {
                    Logging.m23635i(TAG, "Native library has already been loaded.");
                    NativeLibraryLoadListener nativeLibraryLoadListener = loadListener;
                    if (nativeLibraryLoadListener != null) {
                        nativeLibraryLoadListener.onLoadAlready(str);
                    }
                    return;
                }
                Logging.m23635i(TAG, "Loading native library: ".concat(String.valueOf(str)));
                boolean load = nativeLibraryLoader.load(str);
                libraryLoaded = load;
                NativeLibraryLoadListener nativeLibraryLoadListener2 = loadListener;
                if (nativeLibraryLoadListener2 != null) {
                    if (load) {
                        nativeLibraryLoadListener2.onLoadSuccess(str);
                    } else {
                        nativeLibraryLoadListener2.onLoadError(str);
                    }
                }
                MethodCollector.m26664o(350);
            } finally {
                MethodCollector.m26664o(350);
            }
        }
    }
}
