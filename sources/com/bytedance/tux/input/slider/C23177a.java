package com.bytedance.tux.input.slider;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.input.slider.a */
public final class C23177a extends Drawable {

    /* renamed from: a */
    public int f54889a = -16777216;

    /* renamed from: b */
    public int f54890b = -16777216;

    /* renamed from: c */
    public int f54891c = -16777216;

    /* renamed from: d */
    public float f54892d;

    /* renamed from: e */
    float f54893e;

    /* renamed from: f */
    float f54894f;

    /* renamed from: g */
    private final Paint f54895g;

    /* renamed from: h */
    private final RectF f54896h;

    static {
        Covode.recordClassIndex(27114);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public C23177a() {
        Paint paint = new Paint();
        this.f54895g = paint;
        this.f54896h = new RectF();
        paint.setAntiAlias(true);
    }

    /* access modifiers changed from: protected */
    public final boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        invalidateSelf();
        return onLevelChange;
    }

    public final void draw(Canvas canvas) {
        C89219l.m154719c(canvas, "");
        float width = (float) getBounds().width();
        float f = this.f54892d / 2.0f;
        float centerY = ((float) getBounds().centerY()) - f;
        float centerY2 = ((float) getBounds().centerY()) + f;
        this.f54895g.setColor(this.f54891c);
        this.f54896h.set(0.0f, centerY, width, centerY2);
        canvas.drawRoundRect(this.f54896h, f, f, this.f54895g);
        if (this.f54894f > this.f54893e) {
            this.f54895g.setColor(this.f54890b);
            this.f54896h.set(this.f54893e * width, centerY, this.f54894f * width, centerY2);
            canvas.drawRoundRect(this.f54896h, f, f, this.f54895g);
        }
        this.f54895g.setColor(this.f54889a);
        this.f54896h.set(0.0f, centerY, width * this.f54893e, centerY2);
        canvas.drawRoundRect(this.f54896h, f, f, this.f54895g);
    }
}
