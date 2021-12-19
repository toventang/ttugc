package com.p2082ss.android.ttve.common;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ttve.common.e */
public class C30645e {

    /* renamed from: a */
    public static int f73257a = 8;

    /* renamed from: b */
    public static int f73258b = 8;

    /* renamed from: c */
    public static int f73259c = 8;

    /* renamed from: d */
    public static int f73260d = 8;

    /* renamed from: i */
    private static final String f73261i = C30645e.class.getSimpleName();

    /* renamed from: e */
    public EGLContext f73262e;

    /* renamed from: f */
    public EGLConfig f73263f;

    /* renamed from: g */
    public EGLDisplay f73264g;

    /* renamed from: h */
    public EGLSurface f73265h;

    /* renamed from: d */
    public static void m62983d() {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError != 12288) {
            Integer.toHexString(eglGetError);
        }
    }

    /* renamed from: c */
    public final boolean mo54942c() {
        return EGL14.eglSwapBuffers(this.f73264g, this.f73265h);
    }

    static {
        Covode.recordClassIndex(37187);
    }

    /* renamed from: b */
    public final boolean mo54941b() {
        EGLDisplay eGLDisplay = this.f73264g;
        EGLSurface eGLSurface = this.f73265h;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f73262e)) {
            return true;
        }
        m62983d();
        return false;
    }

    /* renamed from: a */
    public final void mo54938a() {
        if (this.f73264g != EGL14.EGL_NO_DISPLAY) {
            EGLDisplay eGLDisplay = this.f73264g;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(this.f73264g, this.f73262e);
            EGL14.eglDestroySurface(this.f73264g, this.f73265h);
            EGL14.eglTerminate(this.f73264g);
        }
        this.f73264g = EGL14.EGL_NO_DISPLAY;
        this.f73265h = EGL14.EGL_NO_SURFACE;
        this.f73262e = EGL14.EGL_NO_CONTEXT;
    }

    /* renamed from: a */
    public final void mo54939a(long j) {
        EGLExt.eglPresentationTimeANDROID(this.f73264g, this.f73265h, j);
        m62983d();
    }

    /* renamed from: a */
    public final boolean mo54940a(Object obj) {
        EGLSurface eGLSurface;
        EGLDisplay eGLDisplay = this.f73264g;
        if (!(eGLDisplay == null || (eGLSurface = this.f73265h) == null)) {
            EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
        }
        int[] iArr = {12375, 0, 12374, 0, 12344};
        iArr[0] = 12344;
        iArr[2] = 12344;
        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.f73264g, this.f73263f, obj, iArr, 0);
        this.f73265h = eglCreateWindowSurface;
        if (eglCreateWindowSurface != EGL14.EGL_NO_SURFACE) {
            return mo54941b();
        }
        m62983d();
        return false;
    }
}
