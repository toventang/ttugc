package com.p2082ss.android.ugc.aweme.livewallpaper.p3415c;

import android.opengl.EGL14;
import com.bytedance.covode.number.Covode;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.c.d */
public final class C58854d {

    /* renamed from: a */
    AbstractC58853c f133966a;

    static {
        Covode.recordClassIndex(69168);
    }

    /* renamed from: a */
    public final void mo96266a() {
        this.f133966a.mo96258a();
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        try {
            AbstractC58853c cVar = this.f133966a;
            if (cVar != null) {
                cVar.finalize();
            }
        } finally {
            super.finalize();
        }
    }

    /* renamed from: b */
    public static Object m108102b() {
        if (C58859i.f133973a) {
            return EGL14.eglGetCurrentContext();
        }
        return ((EGL10) EGLContext.getEGL()).eglGetCurrentContext();
    }

    public C58854d(Object obj) {
        if (C58859i.f133973a) {
            this.f133966a = new C58852b(obj);
        } else {
            this.f133966a = new C58851a(obj);
        }
    }

    /* renamed from: a */
    public final int mo96265a(Object obj, int i) {
        return this.f133966a.mo96256a(obj, i);
    }
}
