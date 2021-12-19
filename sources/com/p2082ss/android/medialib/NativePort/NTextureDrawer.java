package com.p2082ss.android.medialib.NativePort;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ttve.nativePort.C30731d;

/* renamed from: com.ss.android.medialib.NativePort.NTextureDrawer */
public class NTextureDrawer {

    /* renamed from: a */
    private static final String f71478a = NTextureDrawer.class.getSimpleName();

    private native long nativeCreateHandler();

    private native void nativeDrawTexture(long j, int i);

    private native void nativeRelease(long j);

    private native void nativeSetDebug(long j, boolean z);

    private native void nativeSetFlipScale(long j, float f, float f2);

    private native void nativeSetRotation(long j, float f);

    private native void nativeSetWidthHeight(long j, int i, int i2);

    static {
        Covode.recordClassIndex(36400);
        C30731d.m63118c();
    }
}
