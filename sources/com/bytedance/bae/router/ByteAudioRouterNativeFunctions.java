package com.bytedance.bae.router;

import com.bytedance.covode.number.Covode;

public final class ByteAudioRouterNativeFunctions {
    static {
        Covode.recordClassIndex(15040);
    }

    public static native void nativeOnAudioRoutingChanged(long j, int i, int i2, String str);
}
