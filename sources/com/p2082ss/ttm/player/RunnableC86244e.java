package com.p2082ss.ttm.player;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.ttm.player.e */
public final class RunnableC86244e implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: a */
    static final int[] f192681a = {12352, 4, 12339, 1, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12344};

    /* renamed from: b */
    final Handler f192682b;

    /* renamed from: c */
    final int[] f192683c = new int[1];

    /* renamed from: d */
    EGLDisplay f192684d;

    /* renamed from: e */
    EGLContext f192685e;

    /* renamed from: f */
    EGLSurface f192686f;

    /* renamed from: g */
    SurfaceTexture f192687g;

    public final void run() {
        SurfaceTexture surfaceTexture = this.f192687g;
        if (surfaceTexture != null) {
            surfaceTexture.updateTexImage();
        }
    }

    static {
        Covode.recordClassIndex(101421);
    }

    /* renamed from: com.ss.ttm.player.e$a */
    public static final class C86245a extends RuntimeException {
        static {
            Covode.recordClassIndex(101422);
        }

        private C86245a(String str) {
            super(str);
        }

        /* synthetic */ C86245a(String str, byte b) {
            this(str);
        }
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f192682b.post(this);
    }

    public RunnableC86244e(Handler handler) {
        this.f192682b = handler;
    }
}
