package com.p2082ss.videoarch.strategy.utils;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;

/* renamed from: com.ss.videoarch.strategy.utils.JniCommon */
public class JniCommon {
    static {
        Covode.recordClassIndex(103033);
    }

    public static native void nativeAddRef(long j);

    public static native ByteBuffer nativeAllocateByteBuffer(int i);

    public static native void nativeFreeByteBuffer(ByteBuffer byteBuffer);

    public static native void nativeReleaseRef(long j);
}
