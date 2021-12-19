package com.p2082ss.android.ugc.aweme.ecommerce.pdp.view;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.ReplacementSpan;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.view.a */
public final class C44995a extends ReplacementSpan {

    /* renamed from: a */
    float f104967a;

    /* renamed from: b */
    int f104968b = -16777216;

    /* renamed from: c */
    RectF f104969c = new RectF();

    /* renamed from: d */
    RectF f104970d = new RectF();

    /* renamed from: e */
    float f104971e;

    /* renamed from: f */
    float f104972f;

    /* renamed from: g */
    private boolean f104973g = true;

    /* renamed from: h */
    private RectF f104974h = new RectF();

    /* renamed from: i */
    private float f104975i;

    /* renamed from: j */
    private float f104976j;

    /* renamed from: k */
    private float f104977k;

    static {
        Covode.recordClassIndex(53418);
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        String str;
        C89219l.m154721d(paint, "");
        if (charSequence != null) {
            str = charSequence.subSequence(i, i2).toString();
        } else {
            str = null;
        }
        float measureText = paint.measureText(str);
        this.f104977k = measureText;
        float f = measureText + this.f104969c.left + this.f104969c.right;
        this.f104976j = f;
        float f2 = this.f104967a;
        if (f < f2) {
            this.f104976j = f2;
        }
        float f3 = this.f104976j + this.f104970d.left + this.f104970d.right;
        this.f104975i = f3;
        return C89241a.m154730a(f3);
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        float max;
        C89219l.m154721d(canvas, "");
        C89219l.m154721d(paint, "");
        float f2 = this.f104972f;
        float f3 = 0.0f;
        if (f2 == 0.0f) {
            max = 0.0f;
        } else {
            max = Math.max(0.0f, ((((float) (i5 - i3)) - f2) - this.f104969c.top) - this.f104969c.bottom);
        }
        float f4 = max / 2.0f;
        this.f104974h.set(f + this.f104970d.left, ((float) i3) + f4, (f + this.f104975i) - this.f104970d.right, ((float) i5) - f4);
        if (Build.VERSION.SDK_INT >= 21) {
            canvas.saveLayer(this.f104974h, null);
        } else {
            canvas.saveLayer(this.f104974h, null, 31);
        }
        int color = paint.getColor();
        paint.setColor(this.f104968b);
        RectF rectF = this.f104974h;
        float f5 = this.f104971e;
        canvas.drawRoundRect(rectF, f5, f5, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.XOR));
        float max2 = Math.max(0.0f, ((this.f104976j - this.f104977k) - this.f104969c.left) - this.f104969c.right);
        SpannableString valueOf = SpannableString.valueOf(charSequence);
        float f6 = f + this.f104969c.left + this.f104970d.left;
        if (this.f104973g) {
            f3 = max2 / 2.0f;
        }
        canvas.drawText(valueOf, i, i2, f6 + f3, (float) i4, paint);
        paint.setXfermode(null);
        paint.setColor(color);
        canvas.restore();
    }
}
