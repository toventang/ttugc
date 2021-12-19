package com.bytedance.tux.input.slider;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.input.slider.b */
public final class C23178b extends Drawable {

    /* renamed from: a */
    public float f54897a = 1.0f;

    /* renamed from: b */
    public float f54898b = 20.0f;

    /* renamed from: c */
    public int f54899c = -1;

    /* renamed from: d */
    public float f54900d;

    /* renamed from: e */
    public float f54901e;

    /* renamed from: f */
    public float f54902f;

    /* renamed from: g */
    public int f54903g = -16777216;

    /* renamed from: h */
    public boolean f54904h;

    /* renamed from: i */
    private final Paint f54905i;

    static {
        Covode.recordClassIndex(27115);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final int getIntrinsicHeight() {
        return (int) (this.f54897a * this.f54898b);
    }

    public final int getIntrinsicWidth() {
        return (int) (this.f54897a * this.f54898b);
    }

    public C23178b() {
        Paint paint = new Paint();
        this.f54905i = paint;
        paint.setAntiAlias(true);
    }

    public final void draw(Canvas canvas) {
        float f;
        C89219l.m154719c(canvas, "");
        this.f54905i.setColor(this.f54899c);
        this.f54905i.setShadowLayer(this.f54902f, this.f54900d, this.f54901e, this.f54903g);
        float centerX = (float) getBounds().centerX();
        float centerY = (float) getBounds().centerY();
        if (this.f54904h) {
            f = this.f54898b * this.f54897a;
        } else {
            f = this.f54898b;
        }
        canvas.drawCircle(centerX, centerY, f / 2.0f, this.f54905i);
    }
}
