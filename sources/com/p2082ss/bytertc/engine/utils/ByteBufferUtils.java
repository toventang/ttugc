package com.p2082ss.bytertc.engine.utils;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;

/* renamed from: com.ss.bytertc.engine.utils.ByteBufferUtils */
public class ByteBufferUtils {
    static {
        Covode.recordClassIndex(101143);
    }

    public static native ByteBuffer nativeAllocateBuffer(int i);

    public static native void nativeReleaseBuffer(ByteBuffer byteBuffer);
}
