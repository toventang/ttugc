package com.p2082ss.android.ugc.aweme.shortvideo.preview.p3851a;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.preview.a.b */
final class SurfaceHolderC72513b implements SurfaceHolder {

    /* renamed from: a */
    public boolean f162522a;

    /* renamed from: b */
    public int f162523b = -1;

    /* renamed from: c */
    public int f162524c = -1;

    /* renamed from: d */
    public int f162525d = -1;

    /* renamed from: e */
    public List<SurfaceHolder.Callback> f162526e = new ArrayList();

    /* renamed from: f */
    private final SurfaceHolder f162527f;

    /* renamed from: g */
    private SurfaceHolder.Callback f162528g;

    static {
        Covode.recordClassIndex(85192);
    }

    public final void setType(int i) {
    }

    public final Surface getSurface() {
        return this.f162527f.getSurface();
    }

    public final Rect getSurfaceFrame() {
        return this.f162527f.getSurfaceFrame();
    }

    public final boolean isCreating() {
        return this.f162527f.isCreating();
    }

    public final Canvas lockCanvas() {
        return this.f162527f.lockCanvas();
    }

    public final void setSizeFromLayout() {
        this.f162527f.setSizeFromLayout();
    }

    public final void removeCallback(SurfaceHolder.Callback callback) {
        this.f162526e.remove(callback);
    }

    public final void setFormat(int i) {
        this.f162527f.setFormat(i);
    }

    public final void setKeepScreenOn(boolean z) {
        this.f162527f.setKeepScreenOn(z);
    }

    public final void unlockCanvasAndPost(Canvas canvas) {
        this.f162527f.unlockCanvasAndPost(canvas);
    }

    public final Canvas lockCanvas(Rect rect) {
        return this.f162527f.lockCanvas(rect);
    }

    public SurfaceHolderC72513b(SurfaceHolder surfaceHolder) {
        SurfaceHolder$CallbackC725141 r0 = new SurfaceHolder.Callback() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.preview.p3851a.SurfaceHolderC72513b.SurfaceHolder$CallbackC725141 */

            static {
                Covode.recordClassIndex(85193);
            }

            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                SurfaceHolderC72513b.this.f162522a = true;
                for (SurfaceHolder.Callback callback : SurfaceHolderC72513b.this.f162526e) {
                    callback.surfaceCreated(surfaceHolder);
                }
            }

            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                SurfaceHolderC72513b.this.f162522a = false;
                for (SurfaceHolder.Callback callback : SurfaceHolderC72513b.this.f162526e) {
                    callback.surfaceDestroyed(surfaceHolder);
                }
            }

            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                SurfaceHolderC72513b.this.f162523b = i;
                SurfaceHolderC72513b.this.f162524c = i2;
                SurfaceHolderC72513b.this.f162525d = i3;
                for (SurfaceHolder.Callback callback : SurfaceHolderC72513b.this.f162526e) {
                    callback.surfaceChanged(surfaceHolder, i, i2, i3);
                }
            }
        };
        this.f162528g = r0;
        this.f162527f = surfaceHolder;
        surfaceHolder.addCallback(r0);
    }

    public final void addCallback(SurfaceHolder.Callback callback) {
        int i;
        int i2;
        if (!this.f162526e.contains(callback)) {
            this.f162526e.add(callback);
        }
        if (this.f162522a) {
            callback.surfaceCreated(this);
            int i3 = this.f162523b;
            if (i3 != -1 && (i = this.f162524c) != -1 && (i2 = this.f162525d) != -1) {
                callback.surfaceChanged(this, i3, i, i2);
            }
        }
    }

    public final void setFixedSize(int i, int i2) {
        this.f162527f.setFixedSize(i, i2);
    }
}
