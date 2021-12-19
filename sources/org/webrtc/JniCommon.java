package org.webrtc;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;

public class JniCommon {
    static {
        Covode.recordClassIndex(106657);
    }

    public static native void nativeAddRef(long j);

    public static native ByteBuffer nativeAllocateByteBuffer(int i);

    public static native void nativeFreeByteBuffer(ByteBuffer byteBuffer);

    public static native void nativeReleaseRef(long j);
}
