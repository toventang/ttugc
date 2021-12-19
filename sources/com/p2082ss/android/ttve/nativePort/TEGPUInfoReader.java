package com.p2082ss.android.ttve.nativePort;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ttve.nativePort.TEGPUInfoReader */
public class TEGPUInfoReader {
    public static native String nativeGetGLVersion();

    public static native String nativeGetGPURenderer();

    static {
        Covode.recordClassIndex(37296);
        C30731d.m63117b();
    }
}
