package com.p2082ss.android.ugc.aweme.livewallpaper.p3415c;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.c.a */
public final class C58851a implements AbstractC58853c {

    /* renamed from: a */
    private EGLDisplay f133959a = EGL10.EGL_NO_DISPLAY;

    /* renamed from: b */
    private EGLContext f133960b = EGL10.EGL_NO_CONTEXT;

    /* renamed from: c */
    private EGLConfig f133961c;

    /* renamed from: d */
    private EGL10 f133962d = ((EGL10) EGLContext.getEGL());

    static {
        Covode.recordClassIndex(69165);
    }

    @Override // com.p2082ss.android.ugc.aweme.livewallpaper.p3415c.AbstractC58853c
    /* renamed from: a */
    public final void mo96260a(Object obj, long j) {
    }

    @Override // com.p2082ss.android.ugc.aweme.livewallpaper.p3415c.AbstractC58853c
    public final void finalize() {
        if (this.f133959a != EGL10.EGL_NO_DISPLAY) {
            mo96258a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.livewallpaper.p3415c.AbstractC58853c
    /* renamed from: a */
    public final void mo96258a() {
        if (this.f133959a != EGL10.EGL_NO_DISPLAY) {
            EGL10 egl10 = this.f133962d;
            EGLDisplay eGLDisplay = this.f133959a;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f133962d.eglDestroyContext(this.f133959a, this.f133960b);
            this.f133962d.eglTerminate(this.f133959a);
        }
        this.f133959a = EGL10.EGL_NO_DISPLAY;
        this.f133960b = EGL10.EGL_NO_CONTEXT;
        this.f133961c = null;
    }

    @Override // com.p2082ss.android.ugc.aweme.livewallpaper.p3415c.AbstractC58853c
    /* renamed from: d */
    public final boolean mo96263d(Object obj) {
        return this.f133962d.eglSwapBuffers(this.f133959a, (EGLSurface) obj);
    }

    @Override // com.p2082ss.android.ugc.aweme.livewallpaper.p3415c.AbstractC58853c
    /* renamed from: a */
    public final void mo96259a(Object obj) {
        this.f133962d.eglDestroySurface(this.f133959a, (EGLSurface) obj);
    }

    @Override // com.p2082ss.android.ugc.aweme.livewallpaper.p3415c.AbstractC58853c
    /* renamed from: c */
    public final void mo96262c(Object obj) {
        EGLSurface eGLSurface = (EGLSurface) obj;
        if (!this.f133962d.eglMakeCurrent(this.f133959a, eGLSurface, eGLSurface, this.f133960b)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    /* renamed from: a */
    private void m108076a(String str) {
        int eglGetError = this.f133962d.eglGetError();
        if (eglGetError != 12288) {
            throw new RuntimeException(str + ": EGL error: 0x" + Integer.toHexString(eglGetError));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.livewallpaper.p3415c.AbstractC58853c
    /* renamed from: b */
    public final Object mo96261b(Object obj) {
        if ((obj instanceof Surface) || (obj instanceof SurfaceTexture)) {
            EGLSurface eglCreateWindowSurface = this.f133962d.eglCreateWindowSurface(this.f133959a, this.f133961c, obj, new int[]{12344});
            m108076a("eglCreateWindowSurface");
            if (eglCreateWindowSurface != null) {
                return eglCreateWindowSurface;
            }
            throw new RuntimeException("surface was null");
        }
        throw new RuntimeException("invalid surface: ".concat(String.valueOf(obj)));
    }

    public C58851a(Object obj) {
        EGLConfig eGLConfig;
        if (this.f133959a == EGL10.EGL_NO_DISPLAY) {
            obj = obj == null ? EGL10.EGL_NO_CONTEXT : obj;
            EGLDisplay eglGetDisplay = this.f133962d.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f133959a = eglGetDisplay;
            if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                throw new RuntimeException("unable to get EGL10 display");
            } else if (!this.f133962d.eglInitialize(this.f133959a, new int[2])) {
                this.f133959a = null;
                throw new RuntimeException("unable to initialize EGL10");
            } else if (this.f133960b == EGL10.EGL_NO_CONTEXT) {
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (this.f133962d.eglChooseConfig(this.f133959a, new int[]{12324, 8, 12323, 8, 12322, 8, 12352, 4, 12344, 0, 12344}, eGLConfigArr, 1, new int[1]) && (eGLConfig = eGLConfigArr[0]) != null) {
                    EGLContext eglCreateContext = this.f133962d.eglCreateContext(this.f133959a, eGLConfig, (EGLContext) obj, new int[]{12440, 2, 12344});
                    m108076a("eglCreateContext");
                    this.f133961c = eGLConfig;
                    this.f133960b = eglCreateContext;
                    return;
                }
                throw new RuntimeException("Unable to find a suitable EGLConfig");
            }
        } else {
            throw new RuntimeException("EGL already set up");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.livewallpaper.p3415c.AbstractC58853c
    /* renamed from: a */
    public final int mo96256a(Object obj, int i) {
        int[] iArr = new int[1];
        this.f133962d.eglQuerySurface(this.f133959a, (EGLSurface) obj, i, iArr);
        return iArr[0];
    }

    @Override // com.p2082ss.android.ugc.aweme.livewallpaper.p3415c.AbstractC58853c
    /* renamed from: a */
    public final Object mo96257a(int i, int i2) {
        EGLSurface eglCreatePbufferSurface = this.f133962d.eglCreatePbufferSurface(this.f133959a, this.f133961c, new int[]{12375, 1, 12374, 1, 12344});
        m108076a("eglCreatePbufferSurface");
        if (eglCreatePbufferSurface != null) {
            return eglCreatePbufferSurface;
        }
        throw new RuntimeException("surface was null");
    }
}
