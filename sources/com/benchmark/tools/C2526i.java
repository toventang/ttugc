package com.benchmark.tools;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import com.bytedance.covode.number.Covode;

/* renamed from: com.benchmark.tools.i */
public class C2526i {

    /* renamed from: a */
    public static int f7641a = 8;

    /* renamed from: b */
    public static int f7642b = 8;

    /* renamed from: c */
    public static int f7643c = 8;

    /* renamed from: d */
    public static int f7644d = 8;

    /* renamed from: i */
    private static final String f7645i = C2526i.class.getSimpleName();

    /* renamed from: e */
    public EGLContext f7646e;

    /* renamed from: f */
    public EGLConfig f7647f;

    /* renamed from: g */
    public EGLDisplay f7648g;

    /* renamed from: h */
    public EGLSurface f7649h;

    /* renamed from: c */
    public static void m7402c() {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError != 12288) {
            Integer.toHexString(eglGetError);
        }
    }

    static {
        Covode.recordClassIndex(2897);
    }

    /* renamed from: b */
    public final boolean mo6982b() {
        EGLDisplay eGLDisplay = this.f7648g;
        EGLSurface eGLSurface = this.f7649h;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f7646e)) {
            return true;
        }
        m7402c();
        return false;
    }

    /* renamed from: a */
    public final void mo6981a() {
        if (this.f7648g != EGL14.EGL_NO_DISPLAY) {
            EGLDisplay eGLDisplay = this.f7648g;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(this.f7648g, this.f7646e);
            EGL14.eglDestroySurface(this.f7648g, this.f7649h);
            EGL14.eglTerminate(this.f7648g);
        }
        this.f7648g = EGL14.EGL_NO_DISPLAY;
        this.f7649h = EGL14.EGL_NO_SURFACE;
        this.f7646e = EGL14.EGL_NO_CONTEXT;
    }
}
