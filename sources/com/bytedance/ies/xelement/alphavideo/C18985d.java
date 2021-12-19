package com.bytedance.ies.xelement.alphavideo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1205n;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.p2052ui.view.C28698a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xelement.alphavideo.d */
public final class C18985d extends C28698a implements AbstractC1204m {

    /* renamed from: a */
    Bitmap f44927a;

    /* renamed from: b */
    Bitmap f44928b;

    /* renamed from: c */
    private boolean f44929c;

    /* renamed from: d */
    private C1205n f44930d = new C1205n(this);

    /* renamed from: e */
    private boolean f44931e;

    /* renamed from: f */
    private boolean f44932f;

    /* renamed from: g */
    private Paint f44933g = new Paint();

    /* renamed from: h */
    private RectF f44934h = new RectF(0.0f, 0.0f, (float) getWidth(), (float) getHeight());

    static {
        Covode.recordClassIndex(21734);
    }

    @Override // androidx.lifecycle.AbstractC1204m
    public final AbstractC1196i getLifecycle() {
        return this.f44930d;
    }

    public final boolean getMAutoPlay() {
        return this.f44929c;
    }

    public final boolean getMIsShowLastFrame() {
        return this.f44931e;
    }

    public final boolean getMIsShowPoster() {
        return this.f44932f;
    }

    public final Bitmap getMLastFrame() {
        return this.f44928b;
    }

    public final C1205n getMLifecycleRegistry() {
        return this.f44930d;
    }

    public final Paint getMPaint() {
        return this.f44933g;
    }

    public final Bitmap getMPoster() {
        return this.f44927a;
    }

    public final RectF getMRectF() {
        return this.f44934h;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.view.C28698a
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f44929c) {
            this.f44930d.mo4016a(AbstractC1196i.EnumC1198a.ON_RESUME);
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.view.C28698a
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f44930d.mo4016a(AbstractC1196i.EnumC1198a.ON_PAUSE);
    }

    public final void setMAutoPlay(boolean z) {
        this.f44929c = z;
    }

    public final void setMIsShowLastFrame(boolean z) {
        this.f44931e = z;
    }

    public final void setMIsShowPoster(boolean z) {
        this.f44932f = z;
    }

    public final void setMLastFrame(Bitmap bitmap) {
        this.f44928b = bitmap;
    }

    public final void setMPoster(Bitmap bitmap) {
        this.f44927a = bitmap;
    }

    public final void setMLifecycleRegistry(C1205n nVar) {
        C89219l.m154719c(nVar, "");
        this.f44930d = nVar;
    }

    public final void setMPaint(Paint paint) {
        C89219l.m154719c(paint, "");
        this.f44933g = paint;
    }

    public final void setMRectF(RectF rectF) {
        C89219l.m154719c(rectF, "");
        this.f44934h = rectF;
    }

    public C18985d(Context context) {
        super(context);
        setWillNotDraw(false);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        Bitmap bitmap = this.f44927a;
        if (bitmap != null && this.f44932f) {
            this.f44934h.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            if (canvas == null) {
                C89219l.m154707a();
            }
            canvas.drawBitmap(this.f44927a, (Rect) null, this.f44934h, this.f44933g);
        } else if (this.f44928b != null && this.f44931e) {
            this.f44934h.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            if (canvas == null) {
                C89219l.m154707a();
            }
            canvas.drawBitmap(this.f44928b, (Rect) null, this.f44934h, this.f44933g);
        } else if (bitmap == null) {
            boolean z = this.f44931e;
        }
    }
}
