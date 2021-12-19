package com.p2082ss.android.ttve.common;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ttve.common.c */
public class C30642c {

    /* renamed from: a */
    public EGLContext f73248a = EGL14.EGL_NO_CONTEXT;

    /* renamed from: b */
    public EGLSurface f73249b = EGL14.EGL_NO_SURFACE;

    /* renamed from: c */
    public EGLSurface f73250c = EGL14.EGL_NO_SURFACE;

    /* renamed from: d */
    public EGLDisplay f73251d = EGL14.EGL_NO_DISPLAY;

    static {
        Covode.recordClassIndex(37184);
    }

    /* renamed from: a */
    public final void mo54932a() {
        EGLContext eglGetCurrentContext = EGL14.eglGetCurrentContext();
        this.f73248a = eglGetCurrentContext;
        eglGetCurrentContext.equals(EGL14.EGL_NO_CONTEXT);
        EGLSurface eglGetCurrentSurface = EGL14.eglGetCurrentSurface(12378);
        this.f73249b = eglGetCurrentSurface;
        eglGetCurrentSurface.equals(EGL14.EGL_NO_SURFACE);
        EGLSurface eglGetCurrentSurface2 = EGL14.eglGetCurrentSurface(12377);
        this.f73250c = eglGetCurrentSurface2;
        eglGetCurrentSurface2.equals(EGL14.EGL_NO_SURFACE);
        EGLDisplay eglGetCurrentDisplay = EGL14.eglGetCurrentDisplay();
        this.f73251d = eglGetCurrentDisplay;
        eglGetCurrentDisplay.equals(EGL14.EGL_NO_DISPLAY);
    }
}
