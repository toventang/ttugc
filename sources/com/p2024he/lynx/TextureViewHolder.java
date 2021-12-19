package com.p2024he.lynx;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.bytedance.covode.number.Covode;

/* renamed from: com.he.lynx.TextureViewHolder */
public final class TextureViewHolder implements SurfaceHolder, TextureView.SurfaceTextureListener {
    private SurfaceHolder.Callback callback;
    private SurfaceTexture saved;
    private Surface surface;

    /* renamed from: tv */
    private final TextureView f65820tv;

    static {
        Covode.recordClassIndex(33785);
    }

    public final Rect getSurfaceFrame() {
        return null;
    }

    public final boolean isCreating() {
        return false;
    }

    public final Canvas lockCanvas() {
        return null;
    }

    public final Canvas lockCanvas(Rect rect) {
        return null;
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public final void setFixedSize(int i, int i2) {
    }

    public final void setFormat(int i) {
    }

    public final void setKeepScreenOn(boolean z) {
    }

    public final void setSizeFromLayout() {
    }

    public final void setType(int i) {
    }

    public final void unlockCanvasAndPost(Canvas canvas) {
    }

    public final Surface getSurface() {
        return this.surface;
    }

    public final void addCallback(SurfaceHolder.Callback callback2) {
        this.callback = callback2;
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.saved = surfaceTexture;
        return false;
    }

    public final void removeCallback(SurfaceHolder.Callback callback2) {
        this.callback = null;
    }

    public TextureViewHolder(TextureView textureView) {
        this.f65820tv = textureView;
        textureView.setSurfaceTextureListener(this);
        SurfaceTexture surfaceTexture = textureView.getSurfaceTexture();
        if (surfaceTexture != null) {
            this.surface = new Surface(surfaceTexture);
        }
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        SurfaceHolder.Callback callback2 = this.callback;
        if (callback2 != null) {
            callback2.surfaceChanged(this, 0, i, i2);
        }
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        SurfaceTexture surfaceTexture2 = this.saved;
        if (surfaceTexture2 != null) {
            this.f65820tv.setSurfaceTexture(surfaceTexture2);
            this.saved = null;
            return;
        }
        this.surface = new Surface(surfaceTexture);
        SurfaceHolder.Callback callback2 = this.callback;
        if (callback2 != null) {
            callback2.surfaceCreated(this);
        }
    }
}
