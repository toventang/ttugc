package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget;

import android.content.Context;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.ui.widget.KeepSurfaceTextureView */
public class KeepSurfaceTextureView extends TextureView {

    /* renamed from: a */
    public SurfaceTexture f126461a;

    /* renamed from: b */
    public Surface f126462b;

    /* renamed from: c */
    public boolean f126463c;

    /* renamed from: d */
    public TextureView.SurfaceTextureListener f126464d;

    static {
        Covode.recordClassIndex(65071);
    }

    public Surface getSurface() {
        return this.f126462b;
    }

    /* renamed from: a */
    public final void mo92354a() {
        SurfaceTexture surfaceTexture = this.f126461a;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.f126461a = null;
        }
        Surface surface = this.f126462b;
        if (surface != null) {
            surface.release();
            this.f126462b = null;
        }
    }

    public void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.f126464d = surfaceTextureListener;
    }

    public void setClipBorder(final float f) {
        if (Build.VERSION.SDK_INT > 20) {
            setOutlineProvider(new ViewOutlineProvider() {
                /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.KeepSurfaceTextureView.C553112 */

                static {
                    Covode.recordClassIndex(65073);
                }

                public final void getOutline(View view, Outline outline) {
                    Rect rect = new Rect();
                    view.getGlobalVisibleRect(rect);
                    outline.setRoundRect(new Rect(0, 0, rect.right - rect.left, rect.bottom - rect.top), f);
                }
            });
            setClipToOutline(true);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        Surface surface;
        super.onWindowVisibilityChanged(i);
        if (i != 0) {
            return;
        }
        if (this.f126461a == null || (surface = this.f126462b) == null || !surface.isValid()) {
            mo92354a();
        } else if (this.f126463c) {
        } else {
            if (this.f126461a != getSurfaceTexture()) {
                setSurfaceTexture(this.f126461a);
                this.f126463c = true;
                TextureView.SurfaceTextureListener surfaceTextureListener = this.f126464d;
                if (surfaceTextureListener != null) {
                    surfaceTextureListener.onSurfaceTextureAvailable(this.f126461a, getWidth(), getHeight());
                    return;
                }
                return;
            }
            mo92354a();
        }
    }

    public KeepSurfaceTextureView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private KeepSurfaceTextureView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(3499);
        super.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() {
            /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.KeepSurfaceTextureView.TextureView$SurfaceTextureListenerC553101 */

            static {
                Covode.recordClassIndex(65072);
            }

            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                if (KeepSurfaceTextureView.this.f126464d != null) {
                    KeepSurfaceTextureView.this.f126464d.onSurfaceTextureUpdated(surfaceTexture);
                }
            }

            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                KeepSurfaceTextureView.this.f126463c = false;
                if (KeepSurfaceTextureView.this.f126464d == null || !KeepSurfaceTextureView.this.f126464d.onSurfaceTextureDestroyed(surfaceTexture)) {
                    return false;
                }
                KeepSurfaceTextureView.this.mo92354a();
                return true;
            }

            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                if (KeepSurfaceTextureView.this.f126464d != null) {
                    KeepSurfaceTextureView.this.f126464d.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
                }
            }

            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                KeepSurfaceTextureView.this.mo92354a();
                if (KeepSurfaceTextureView.this.f126461a == null) {
                    KeepSurfaceTextureView.this.f126461a = surfaceTexture;
                    KeepSurfaceTextureView.this.f126462b = new Surface(KeepSurfaceTextureView.this.f126461a);
                }
                KeepSurfaceTextureView.this.f126463c = true;
                if (KeepSurfaceTextureView.this.f126464d != null) {
                    KeepSurfaceTextureView.this.f126464d.onSurfaceTextureAvailable(KeepSurfaceTextureView.this.f126461a, i, i2);
                }
            }
        });
        MethodCollector.m26664o(3499);
    }
}
