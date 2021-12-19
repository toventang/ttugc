package com.bytedance.ies.xelement.text.p1397a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xelement.text.a.d */
public final class C19420d extends ImageSpan {

    /* renamed from: a */
    public int f46012a;

    /* renamed from: b */
    public CharSequence f46013b;

    /* renamed from: c */
    private Integer f46014c;

    /* renamed from: d */
    private boolean f46015d;

    static {
        Covode.recordClassIndex(22230);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19420d(Drawable drawable, Integer num, CharSequence charSequence) {
        super(drawable);
        C89219l.m154719c(drawable, "");
        this.f46014c = num;
        this.f46013b = charSequence;
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        C89219l.m154719c(paint, "");
        Integer num = this.f46014c;
        if (num != null && num.intValue() != i2 - i && this.f46015d) {
            return 0;
        }
        Drawable drawable = getDrawable();
        C89219l.m154709a((Object) drawable, "");
        Rect bounds = drawable.getBounds();
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            int i3 = fontMetricsInt2.bottom - fontMetricsInt2.top;
            int i4 = (bounds.bottom - bounds.top) / 2;
            int i5 = i3 / 4;
            int i6 = i4 - i5;
            int i7 = -(i4 + i5);
            fontMetricsInt.ascent = i7;
            fontMetricsInt.top = i7;
            fontMetricsInt.bottom = i6;
            fontMetricsInt.descent = i6;
        }
        return bounds.right;
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        C89219l.m154719c(canvas, "");
        C89219l.m154719c(paint, "");
        Integer num = this.f46014c;
        if (num == null || num.intValue() == i2 - i || !this.f46015d) {
            Drawable drawable = getDrawable();
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            C89219l.m154709a((Object) drawable, "");
            int i6 = ((((fontMetricsInt.descent + i4) + i4) + fontMetricsInt.ascent) / 2) - (drawable.getBounds().bottom / 2);
            canvas.save();
            canvas.translate(f + ((float) this.f46012a), (float) i6);
            drawable.draw(canvas);
            canvas.restore();
            Integer num2 = this.f46014c;
            if (num2 != null && num2.intValue() != i2 - i) {
                this.f46015d = true;
                return;
            }
            return;
        }
        this.f46015d = false;
    }
}
