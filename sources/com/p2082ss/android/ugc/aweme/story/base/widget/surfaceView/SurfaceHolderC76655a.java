package com.p2082ss.android.ugc.aweme.story.base.widget.surfaceView;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.base.widget.surfaceView.a */
public final class SurfaceHolderC76655a implements SurfaceHolder {

    /* renamed from: a */
    public boolean f172045a;

    /* renamed from: b */
    public int f172046b = -1;

    /* renamed from: c */
    public int f172047c = -1;

    /* renamed from: d */
    public int f172048d = -1;

    /* renamed from: e */
    public final List<SurfaceHolder.Callback> f172049e = new ArrayList();

    /* renamed from: f */
    private final SurfaceHolder.Callback f172050f;

    /* renamed from: g */
    private final SurfaceHolder f172051g;

    static {
        Covode.recordClassIndex(89650);
    }

    public final void setType(int i) {
    }

    public final boolean isCreating() {
        return this.f172051g.isCreating();
    }

    public final void setSizeFromLayout() {
        this.f172051g.setSizeFromLayout();
    }

    public final Surface getSurface() {
        Surface surface = this.f172051g.getSurface();
        C89219l.m154716b(surface, "");
        return surface;
    }

    public final Rect getSurfaceFrame() {
        Rect surfaceFrame = this.f172051g.getSurfaceFrame();
        C89219l.m154716b(surfaceFrame, "");
        return surfaceFrame;
    }

    public final Canvas lockCanvas() {
        Canvas lockCanvas = this.f172051g.lockCanvas();
        C89219l.m154716b(lockCanvas, "");
        return lockCanvas;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.base.widget.surfaceView.a$a */
    public static final class SurfaceHolder$CallbackC76656a implements SurfaceHolder.Callback {

        /* renamed from: a */
        final /* synthetic */ SurfaceHolderC76655a f172052a;

        static {
            Covode.recordClassIndex(89651);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        SurfaceHolder$CallbackC76656a(SurfaceHolderC76655a aVar) {
            this.f172052a = aVar;
        }

        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            C89219l.m154721d(surfaceHolder, "");
            this.f172052a.f172045a = true;
            for (SurfaceHolder.Callback callback : new ArrayList(this.f172052a.f172049e)) {
                callback.surfaceCreated(surfaceHolder);
            }
        }

        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            C89219l.m154721d(surfaceHolder, "");
            this.f172052a.f172045a = false;
            for (SurfaceHolder.Callback callback : new ArrayList(this.f172052a.f172049e)) {
                callback.surfaceDestroyed(surfaceHolder);
            }
        }

        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            C89219l.m154721d(surfaceHolder, "");
            this.f172052a.f172046b = i;
            this.f172052a.f172047c = i2;
            this.f172052a.f172048d = i3;
            for (SurfaceHolder.Callback callback : new ArrayList(this.f172052a.f172049e)) {
                callback.surfaceChanged(surfaceHolder, i, i2, i3);
            }
        }
    }

    public final void setFormat(int i) {
        this.f172051g.setFormat(i);
    }

    public final void setKeepScreenOn(boolean z) {
        this.f172051g.setKeepScreenOn(z);
    }

    public final void removeCallback(SurfaceHolder.Callback callback) {
        C89219l.m154721d(callback, "");
        this.f172049e.remove(callback);
    }

    public final void unlockCanvasAndPost(Canvas canvas) {
        C89219l.m154721d(canvas, "");
        this.f172051g.unlockCanvasAndPost(canvas);
    }

    public final Canvas lockCanvas(Rect rect) {
        C89219l.m154721d(rect, "");
        Canvas lockCanvas = this.f172051g.lockCanvas(rect);
        C89219l.m154716b(lockCanvas, "");
        return lockCanvas;
    }

    public SurfaceHolderC76655a(SurfaceHolder surfaceHolder) {
        C89219l.m154721d(surfaceHolder, "");
        this.f172051g = surfaceHolder;
        SurfaceHolder$CallbackC76656a aVar = new SurfaceHolder$CallbackC76656a(this);
        this.f172050f = aVar;
        surfaceHolder.addCallback(aVar);
    }

    public final void addCallback(SurfaceHolder.Callback callback) {
        int i;
        int i2;
        C89219l.m154721d(callback, "");
        if (!this.f172049e.contains(callback)) {
            this.f172049e.add(callback);
        }
        if (this.f172045a) {
            callback.surfaceCreated(this);
            int i3 = this.f172046b;
            if (i3 != -1 && (i = this.f172047c) != -1 && (i2 = this.f172048d) != -1) {
                callback.surfaceChanged(this, i3, i, i2);
            }
        }
    }

    public final void setFixedSize(int i, int i2) {
        this.f172051g.setFixedSize(i, i2);
    }
}
