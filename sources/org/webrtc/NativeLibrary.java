package org.webrtc;

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
    private static Object lock = new Object();

    /* access modifiers changed from: package-private */
    public static class DefaultLoader implements NativeLibraryLoader {
        static {
            Covode.recordClassIndex(106677);
        }

        DefaultLoader() {
        }

        /* renamed from: org_webrtc_NativeLibrary$DefaultLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary */
        public static void m157048x7ce875c2(String str) {
            long uptimeMillis = SystemClock.uptimeMillis();
            Librarian.m38964a(str, false, (Context) null);
            C58032m.m104852a(uptimeMillis, str);
        }

        @Override // org.webrtc.NativeLibraryLoader
        public boolean load(String str) {
            Logging.m157044i(NativeLibrary.TAG, "Loading library: ".concat(String.valueOf(str)));
            try {
                m157048x7ce875c2(str);
                return true;
            } catch (UnsatisfiedLinkError e) {
                Logging.m157043e(NativeLibrary.TAG, "Failed to load native library: ".concat(String.valueOf(str)), e);
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
        Covode.recordClassIndex(106676);
    }

    static boolean isLoaded() {
        boolean z;
        MethodCollector.m26663i(1842);
        synchronized (lock) {
            try {
                z = libraryLoaded;
            } finally {
                MethodCollector.m26664o(1842);
            }
        }
        return z;
    }

    static void setLoadListener(NativeLibraryLoadListener nativeLibraryLoadListener) {
        loadListener = nativeLibraryLoadListener;
    }

    static void initialize(NativeLibraryLoader nativeLibraryLoader, String str) {
        MethodCollector.m26663i(1841);
        synchronized (lock) {
            try {
                if (libraryLoaded) {
                    Logging.m157044i(TAG, "Native library has already been loaded.");
                    NativeLibraryLoadListener nativeLibraryLoadListener = loadListener;
                    if (nativeLibraryLoadListener != null) {
                        nativeLibraryLoadListener.onLoadAlready(str);
                    }
                    return;
                }
                Logging.m157044i(TAG, "Loading native library: ".concat(String.valueOf(str)));
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
                MethodCollector.m26664o(1841);
            } finally {
                MethodCollector.m26664o(1841);
            }
        }
    }
}
