package com.p2082ss.bytertc.engine.mediaio;

import android.opengl.EGLContext;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.bytertc.engine.mediaio.IVideoSink */
public interface IVideoSink extends IVideoFrameConsumer {
    static {
        Covode.recordClassIndex(101113);
    }

    int getBufferType();

    EGLContext getEGLContextHandle();

    int getPixelFormat();

    void onDispose();

    boolean onInitialize();

    boolean onStart();

    void onStop();
}
