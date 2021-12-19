package com.p2082ss.avframework.engine;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.avframework.engine.VideoEncoderFactory */
public abstract class VideoEncoderFactory extends NativeObject {
    static {
        Covode.recordClassIndex(99987);
    }

    public abstract VideoEncoder CreateVideoEncoder(String str, boolean z);

    public abstract String GetSupportedFormats();

    @Override // com.p2082ss.avframework.engine.NativeObject
    public synchronized void release() {
        super.release();
    }
}
