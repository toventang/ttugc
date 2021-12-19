package com.ttnet.org.chromium.base.library_loader;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.ttnet.org.chromium.base.metrics.C87469a;

public class LibraryLoader {

    /* renamed from: a */
    public static final boolean f198371a;

    /* renamed from: b */
    public static LibraryLoader f198372b = new LibraryLoader();

    /* renamed from: d */
    static final /* synthetic */ boolean f198373d = true;

    /* renamed from: e */
    private static final C87469a.C87472c f198374e = new C87469a.C87472c("ChromiumAndroidLinker.RelinkerFallbackCount");

    /* renamed from: c */
    public volatile boolean f198375c;

    /* renamed from: f */
    private final Object f198376f = new Object();

    /* renamed from: g */
    private int f198377g = -1;

    private native String nativeGetVersionNumber();

    private native boolean nativeLibraryLoaded(int i);

    private native void nativeRecordChromiumAndroidLinkerBrowserHistogram(long j);

    private native void nativeRecordLibraryPreloaderBrowserHistogram(int i);

    private native void nativeRegisterChromiumAndroidLinkerRendererHistogram(long j);

    private native void nativeRegisterLibraryPreloaderRendererHistogram(int i);

    private LibraryLoader() {
    }

    static {
        Covode.recordClassIndex(103401);
        boolean z = true;
        if (Build.VERSION.SDK_INT > 19) {
            z = false;
        }
        f198371a = z;
    }
}
