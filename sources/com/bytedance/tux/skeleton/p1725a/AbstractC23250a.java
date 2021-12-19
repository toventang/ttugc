package com.bytedance.tux.skeleton.p1725a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.skeleton.a.a */
public abstract class AbstractC23250a extends Drawable {

    /* renamed from: a */
    public float f55097a;

    /* renamed from: b */
    public final Paint f55098b;

    /* renamed from: c */
    private final RectF f55099c = new RectF();

    static {
        Covode.recordClassIndex(27193);
    }

    public int getOpacity() {
        return -1;
    }

    public void setAlpha(int i) {
    }

    public ColorFilter getColorFilter() {
        return this.f55098b.getColorFilter();
    }

    /* renamed from: a */
    public final RectF mo37856a() {
        this.f55099c.set(getBounds());
        return this.f55099c;
    }

    public AbstractC23250a() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        this.f55098b = paint;
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f55098b.setColorFilter(colorFilter);
    }

    public void draw(Canvas canvas) {
        C89219l.m154719c(canvas, "");
        RectF a = mo37856a();
        float f = this.f55097a;
        canvas.drawRoundRect(a, f, f, this.f55098b);
    }
}
