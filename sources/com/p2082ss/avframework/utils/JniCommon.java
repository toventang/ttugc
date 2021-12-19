package com.p2082ss.avframework.utils;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;

/* renamed from: com.ss.avframework.utils.JniCommon */
public class JniCommon {
    static {
        Covode.recordClassIndex(100730);
    }

    public static native void nativeAddRef(long j);

    public static native ByteBuffer nativeAllocateByteBuffer(int i);

    public static native void nativeFreeByteBuffer(ByteBuffer byteBuffer);

    public static native void nativeReleaseRef(long j);
}
