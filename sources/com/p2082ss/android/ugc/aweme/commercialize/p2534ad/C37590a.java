package com.p2082ss.android.ugc.aweme.commercialize.p2534ad;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.ad.a */
public final class C37590a extends ImageSpan {
    static {
        Covode.recordClassIndex(45007);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37590a(Context context, int i) {
        super(context, i);
        C89219l.m154721d(context, "");
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        C89219l.m154721d(paint, "");
        C89219l.m154721d(charSequence, "");
        Drawable drawable = getDrawable();
        C89219l.m154716b(drawable, "");
        Rect bounds = drawable.getBounds();
        C89219l.m154716b(bounds, "");
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
        C89219l.m154721d(canvas, "");
        C89219l.m154721d(charSequence, "");
        C89219l.m154721d(paint, "");
        Drawable drawable = getDrawable();
        canvas.save();
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        C89219l.m154716b(drawable, "");
        canvas.translate(f, (float) (i4 + (((fontMetricsInt.descent + fontMetricsInt.ascent) - drawable.getBounds().bottom) / 2)));
        drawable.draw(canvas);
        canvas.restore();
    }
}
