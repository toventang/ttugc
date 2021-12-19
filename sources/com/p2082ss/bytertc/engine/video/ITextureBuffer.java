package com.p2082ss.bytertc.engine.video;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.bytertc.engine.video.ITextureBuffer */
public interface ITextureBuffer {
    static {
        Covode.recordClassIndex(101180);
    }

    int getTextureId();

    int getTypeGlTarget();

    float[] nativeGetTransFormMatrix();

    void release();

    void retain();
}
