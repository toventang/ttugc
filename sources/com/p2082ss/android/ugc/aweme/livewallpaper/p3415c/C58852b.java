package com.p2082ss.android.ugc.aweme.livewallpaper.p3415c;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.os.Build;
import android.view.Surface;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.c.b */
public final class C58852b implements AbstractC58853c {

    /* renamed from: a */
    private EGLDisplay f133963a = EGL14.EGL_NO_DISPLAY;

    /* renamed from: b */
    private EGLContext f133964b = EGL14.EGL_NO_CONTEXT;

    /* renamed from: c */
    private EGLConfig f133965c;

    static {
        Covode.recordClassIndex(69166);
    }

    @Override // com.p2082ss.android.ugc.aweme.livewallpaper.p3415c.AbstractC58853c
    public final void finalize() {
        if (this.f133963a != EGL14.EGL_NO_DISPLAY) {
            mo96258a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.livewallpaper.p3415c.AbstractC58853c
    /* renamed from: a */
    public final void mo96258a() {
        if (this.f133963a != EGL14.EGL_NO_DISPLAY) {
            EGLDisplay eGLDisplay = this.f133963a;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(this.f133963a, this.f133964b);
            int i = Build.VERSION.SDK_INT;
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f133963a);
        }
        this.f133963a = EGL14.EGL_NO_DISPLAY;
        this.f133964b = EGL14.EGL_NO_CONTEXT;
        this.f133965c = null;
    }

    @Override // com.p2082ss.android.ugc.aweme.livewallpaper.p3415c.AbstractC58853c
    /* renamed from: a */
    public final void mo96259a(Object obj) {
        EGL14.eglDestroySurface(this.f133963a, (EGLSurface) obj);
    }

    @Override // com.p2082ss.android.ugc.aweme.livewallpaper.p3415c.AbstractC58853c
    /* renamed from: d */
    public final boolean mo96263d(Object obj) {
        return EGL14.eglSwapBuffers(this.f133963a, (EGLSurface) obj);
    }

    @Override // com.p2082ss.android.ugc.aweme.livewallpaper.p3415c.AbstractC58853c
    /* renamed from: c */
    public final void mo96262c(Object obj) {
        EGLSurface eGLSurface = (EGLSurface) obj;
        if (!EGL14.eglMakeCurrent(this.f133963a, eGLSurface, eGLSurface, this.f133964b)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    /* renamed from: a */
    private static void m108085a(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError != 12288) {
            throw new RuntimeException(str + ": EGL error: 0x" + Integer.toHexString(eglGetError));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.livewallpaper.p3415c.AbstractC58853c
    /* renamed from: b */
    public final Object mo96261b(Object obj) {
        if ((obj instanceof Surface) || (obj instanceof SurfaceTexture)) {
            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.f133963a, this.f133965c, obj, new int[]{12344}, 0);
            m108085a("eglCreateWindowSurface");
            if (eglCreateWindowSurface != null) {
                return eglCreateWindowSurface;
            }
            throw new RuntimeException("surface was null");
        }
        throw new RuntimeException("invalid surface: ".concat(String.valueOf(obj)));
    }

    public C58852b(Object obj) {
        EGLConfig eGLConfig;
        if (this.f133963a == EGL14.EGL_NO_DISPLAY) {
            obj = obj == null ? EGL14.EGL_NO_CONTEXT : obj;
            EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            this.f133963a = eglGetDisplay;
            if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                int[] iArr = {0, 1};
                if (!EGL14.eglInitialize(this.f133963a, iArr, 0, iArr, 1)) {
                    this.f133963a = null;
                    throw new RuntimeException("unable to initialize EGL14");
                } else if (this.f133964b == EGL14.EGL_NO_CONTEXT) {
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    if (EGL14.eglChooseConfig(this.f133963a, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344, 0, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0) && (eGLConfig = eGLConfigArr[0]) != null) {
                        EGLContext eglCreateContext = EGL14.eglCreateContext(this.f133963a, eGLConfig, (EGLContext) obj, new int[]{12440, 2, 12344}, 0);
                        m108085a("eglCreateContext");
                        this.f133965c = eGLConfig;
                        this.f133964b = eglCreateContext;
                        return;
                    }
                    throw new RuntimeException("Unable to find a suitable EGLConfig");
                }
            } else {
                throw new RuntimeException("unable to get EGL14 display");
            }
        } else {
            throw new RuntimeException("EGL already set up");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.livewallpaper.p3415c.AbstractC58853c
    /* renamed from: a */
    public final int mo96256a(Object obj, int i) {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.f133963a, (EGLSurface) obj, i, iArr, 0);
        return iArr[0];
    }

    @Override // com.p2082ss.android.ugc.aweme.livewallpaper.p3415c.AbstractC58853c
    /* renamed from: a */
    public final void mo96260a(Object obj, long j) {
        int i = Build.VERSION.SDK_INT;
        try {
            EGLExt.eglPresentationTimeANDROID(this.f133963a, (EGLSurface) obj, j);
        } catch (NoClassDefFoundError unused) {
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.livewallpaper.p3415c.AbstractC58853c
    /* renamed from: a */
    public final Object mo96257a(int i, int i2) {
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.f133963a, this.f133965c, new int[]{12375, 1, 12374, 1, 12344}, 0);
        m108085a("eglCreatePbufferSurface");
        if (eglCreatePbufferSurface != null) {
            return eglCreatePbufferSurface;
        }
        throw new RuntimeException("surface was null");
    }
}
