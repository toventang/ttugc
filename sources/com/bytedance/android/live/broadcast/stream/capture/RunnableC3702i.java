package com.bytedance.android.live.broadcast.stream.capture;

import com.bytedance.covode.number.Covode;
import javax.microedition.khronos.egl.EGL;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;

/* renamed from: com.bytedance.android.live.broadcast.stream.capture.i */
final /* synthetic */ class RunnableC3702i implements Runnable {

    /* renamed from: a */
    private final EGLContext[] f10186a;

    static {
        Covode.recordClassIndex(4215);
    }

    RunnableC3702i(EGLContext[] eGLContextArr) {
        this.f10186a = eGLContextArr;
    }

    public final void run() {
        EGLContext[] eGLContextArr = this.f10186a;
        EGL egl = EGLContext.getEGL();
        if (egl instanceof EGL10) {
            eGLContextArr[0] = ((EGL10) egl).eglGetCurrentContext();
        }
    }
}
