package com.p2082ss.avframework.livestreamv2.core.interact.video;

import com.bytedance.covode.number.Covode;
import javax.microedition.khronos.egl.EGLContext;

/* renamed from: com.ss.avframework.livestreamv2.core.interact.video.VideoCallback */
public interface VideoCallback {
    static {
        Covode.recordClassIndex(100452);
    }

    void onVideoWarning(String str);

    boolean updateVideoFrame(EGLContext eGLContext, android.opengl.EGLContext eGLContext2, int i, boolean z, float[] fArr, int i2, int i3, long j, Object... objArr);
}
