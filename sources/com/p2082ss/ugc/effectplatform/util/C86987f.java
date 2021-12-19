package com.p2082ss.ugc.effectplatform.util;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;
import p4519d.p4520a.p4532e.C88060b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.util.f */
public final class C86987f {

    /* renamed from: i */
    public static final C86988a f196136i = new C86988a((byte) 0);

    /* renamed from: a */
    EGL10 f196137a;

    /* renamed from: b */
    EGLDisplay f196138b;

    /* renamed from: c */
    EGLConfig f196139c;

    /* renamed from: d */
    EGLSurface f196140d;

    /* renamed from: e */
    EGLContext f196141e;

    /* renamed from: f */
    public GL10 f196142f;

    /* renamed from: g */
    final EGLContext f196143g = EGL10.EGL_NO_CONTEXT;

    /* renamed from: h */
    final boolean f196144h;

    static {
        Covode.recordClassIndex(102753);
    }

    /* renamed from: com.ss.ugc.effectplatform.util.f$a */
    public static final class C86988a {
        static {
            Covode.recordClassIndex(102754);
        }

        private C86988a() {
        }

        public /* synthetic */ C86988a(byte b) {
            this();
        }
    }

    public C86987f() {
        String str;
        String str2 = Build.MODEL;
        if (str2 != null) {
            str = str2.toLowerCase();
            C89219l.m154709a((Object) str, "");
        } else {
            str = null;
        }
        this.f196144h = C89219l.m154714a((Object) "mi play", (Object) str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo140617a(String str) {
        if (!this.f196144h) {
            C88060b.m153136a("EGLUtils", "get gpu info error:".concat(String.valueOf(str)), null);
            return;
        }
        throw new RuntimeException(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo140618a(EGL10 egl10) {
        int eglGetError;
        if (egl10 != null && (eglGetError = egl10.eglGetError()) != 12288) {
            mo140617a("EGL error: 0x" + Integer.toHexString(eglGetError));
        }
    }
}
