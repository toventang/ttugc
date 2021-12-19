package com.p2082ss.bytertc.engine.loader;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;

/* renamed from: com.ss.bytertc.engine.loader.RTCNativeLibraryLoaderImpl */
public class RTCNativeLibraryLoaderImpl implements RTCNativeLibraryLoader {
    static {
        Covode.recordClassIndex(101107);
    }

    /* renamed from: com_ss_bytertc_engine_loader_RTCNativeLibraryLoaderImpl_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m147878xc954b601(String str, String str2, Throwable th) {
        return 0;
    }

    /* renamed from: com_ss_bytertc_engine_loader_RTCNativeLibraryLoaderImpl_com_ss_android_ugc_aweme_lancet_LogLancet_i */
    public static int m147879xc954b605(String str, String str2) {
        return 0;
    }

    /* renamed from: com_ss_bytertc_engine_loader_RTCNativeLibraryLoaderImpl_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary */
    public static void m147877xc448e733(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.m38964a(str, false, (Context) null);
        C58032m.m104852a(uptimeMillis, str);
    }

    @Override // com.p2082ss.bytertc.engine.loader.RTCNativeLibraryLoader, org.webrtc.NativeLibraryLoader
    public boolean load(String str) {
        m147879xc954b605("RtcNativeLibraryLoaderImpl", "Loading library: ".concat(String.valueOf(str)));
        try {
            m147877xc448e733(str);
            return true;
        } catch (UnsatisfiedLinkError e) {
            m147878xc954b601("RtcNativeLibraryLoaderImpl", "Failed to load native library: ".concat(String.valueOf(str)), e);
            return false;
        }
    }
}
