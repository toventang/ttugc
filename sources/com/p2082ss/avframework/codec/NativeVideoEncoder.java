package com.p2082ss.avframework.codec;

import android.util.AndroidRuntimeException;
import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.buffer.VideoFrame;
import com.p2082ss.avframework.engine.VideoEncoder;
import com.p2082ss.avframework.utils.TEBundle;

/* renamed from: com.ss.avframework.codec.NativeVideoEncoder */
public class NativeVideoEncoder extends VideoEncoder {
    static {
        Covode.recordClassIndex(99918);
    }

    @Override // com.p2082ss.avframework.engine.VideoEncoder
    public void RequestIDRFrame() {
        throw new AndroidRuntimeException("RequestIDRFrame");
    }

    private static boolean isNativeVideoEncoderInstence(Object obj) {
        return obj instanceof NativeVideoEncoder;
    }

    private NativeVideoEncoder(long j) {
        this.mNativeObj = j;
    }

    @Override // com.p2082ss.avframework.engine.VideoEncoder
    public int Encode(VideoFrame videoFrame) {
        throw new AndroidRuntimeException("Native direct mode");
    }

    @Override // com.p2082ss.avframework.engine.VideoEncoder
    public boolean InitEncoder(TEBundle tEBundle) {
        throw new AndroidRuntimeException("Native direct mode");
    }

    @Override // com.p2082ss.avframework.engine.VideoEncoder
    public void SetBitrate(int i) {
        throw new AndroidRuntimeException("SetBitrate");
    }
}
