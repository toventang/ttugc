package com.p2082ss.avframework.engine;

import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.buffer.VideoFrame;
import com.p2082ss.avframework.utils.TEBundle;
import java.nio.ByteBuffer;

/* renamed from: com.ss.avframework.engine.VideoEncoder */
public abstract class VideoEncoder extends NativeObject {
    static {
        Covode.recordClassIndex(99986);
    }

    public abstract int Encode(VideoFrame videoFrame);

    public abstract boolean InitEncoder(TEBundle tEBundle);

    public abstract void RequestIDRFrame();

    public abstract void SetBitrate(int i);

    /* access modifiers changed from: protected */
    public native void nativeEncoded(ByteBuffer byteBuffer, int i, int i2, int i3, long j, long j2);

    @Override // com.p2082ss.avframework.engine.NativeObject
    public void release() {
    }
}
