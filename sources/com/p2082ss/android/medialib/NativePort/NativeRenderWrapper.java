package com.p2082ss.android.medialib.NativePort;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ttve.nativePort.C30731d;

/* renamed from: com.ss.android.medialib.NativePort.NativeRenderWrapper */
public class NativeRenderWrapper {
    private native long nativeCreate();

    private native void nativeDestroy(long j);

    private native float nativeGetFilterIntensity(long j, String str);

    private native int nativeInit(long j, int i, int i2, String str);

    private native int nativeProcessTexture(long j, int i, int i2, double d);

    private native int nativeSetDoubleFilterNew(long j, String str, String str2, float f, float f2, float f3);

    private native int nativeSetFilter(long j, String str, float f);

    private native int nativeSetFilter2(long j, String str, String str2, float f, float f2);

    private native int nativeSetFilterNew(long j, String str, float f);

    static {
        Covode.recordClassIndex(36401);
        C30731d.m63118c();
    }
}
