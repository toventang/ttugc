package com.p2082ss.bytertc.base.media;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.bytertc.base.media.RTCNativeFunctions */
public final class RTCNativeFunctions {
    static {
        Covode.recordClassIndex(100851);
    }

    public static native void nativeNotifySurfaceAvailable(long j, Object obj, boolean z);

    public static native void nativeNotifySurfaceDestroyed(long j, Object obj, boolean z);

    public static native void nativeNotifySurfaceSizeChanged(long j);
}
