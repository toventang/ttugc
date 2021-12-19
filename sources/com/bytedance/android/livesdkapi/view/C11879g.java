package com.bytedance.android.livesdkapi.view;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.livesdk.chatroom.p492g.C7572d;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdkapi.view.g */
public final class C11879g extends TextureRenderView {

    /* renamed from: a */
    public SurfaceTexture f28415a;

    /* renamed from: b */
    public Surface f28416b;

    /* renamed from: c */
    public boolean f28417c;

    /* renamed from: d */
    public TextureView.SurfaceTextureListener f28418d;

    static {
        Covode.recordClassIndex(13600);
    }

    public final Surface getSurface() {
        return this.f28416b;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo19021b() {
        SurfaceTexture surfaceTexture = this.f28415a;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.f28415a = null;
        }
        Surface surface = this.f28416b;
        if (surface != null) {
            surface.release();
            this.f28416b = null;
        }
    }

    public final void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.f28418d = surfaceTextureListener;
    }

    public C11879g(Context context) {
        this(context, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i) {
        Surface surface;
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            C3854a.m9453a(4, "KeepSurfaceTextureRenderView", "resume");
            if (this.f28415a == null || (surface = this.f28416b) == null || !surface.isValid()) {
                mo19021b();
            } else if (this.f28417c) {
            } else {
                if (this.f28415a != getSurfaceTexture()) {
                    try {
                        int i2 = Build.VERSION.SDK_INT;
                        setSurfaceTexture(this.f28415a);
                    } catch (Exception unused) {
                    }
                    this.f28417c = true;
                    TextureView.SurfaceTextureListener surfaceTextureListener = this.f28418d;
                    if (surfaceTextureListener != null) {
                        surfaceTextureListener.onSurfaceTextureAvailable(this.f28415a, getWidth(), getHeight());
                        return;
                    }
                    return;
                }
                mo19021b();
            }
        }
    }

    private C11879g(Context context, byte b) {
        this(context, (char) 0);
    }

    private C11879g(Context context, char c) {
        super(context, null, (byte) 0);
        super.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() {
            /* class com.bytedance.android.livesdkapi.view.C11879g.TextureView$SurfaceTextureListenerC118801 */

            static {
                Covode.recordClassIndex(13601);
            }

            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                if (C11879g.this.f28418d != null) {
                    C11879g.this.f28418d.onSurfaceTextureUpdated(surfaceTexture);
                }
            }

            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                C7572d.m15561a("KeepSurfaceTextureRenderView", "onSurfaceTextureDestroyed");
                C11879g.this.f28417c = false;
                if (C11879g.this.f28418d != null && !C11879g.this.f28418d.onSurfaceTextureDestroyed(surfaceTexture)) {
                    return false;
                }
                C11879g.this.mo19021b();
                return true;
            }

            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                C7572d.m15561a("KeepSurfaceTextureRenderView", "onSurfaceTextureSizeChanged");
                if (C11879g.this.f28418d != null) {
                    C11879g.this.f28418d.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
                }
            }

            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                C7572d.m15561a("KeepSurfaceTextureRenderView", "onSurfaceTextureAvailable");
                C11879g.this.mo19021b();
                if (C11879g.this.f28415a == null) {
                    C11879g.this.f28415a = surfaceTexture;
                    C11879g.this.f28416b = new Surface(C11879g.this.f28415a);
                }
                C11879g.this.f28417c = true;
                if (C11879g.this.f28418d != null) {
                    C11879g.this.f28418d.onSurfaceTextureAvailable(C11879g.this.f28415a, i, i2);
                }
            }
        });
    }
}
