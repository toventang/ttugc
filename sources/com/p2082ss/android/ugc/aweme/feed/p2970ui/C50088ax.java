package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.ax */
public final class C50088ax extends ImageSpan {
    static {
        Covode.recordClassIndex(59214);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C50088ax(Context context) {
        super(context, 2131231740);
        C89219l.m154721d(context, "");
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        C89219l.m154721d(canvas, "");
        C89219l.m154721d(charSequence, "");
        C89219l.m154721d(paint, "");
        Drawable drawable = getDrawable();
        canvas.save();
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        C89219l.m154716b(drawable, "");
        canvas.translate(f, (float) (((((fontMetricsInt.descent + i4) + i4) + fontMetricsInt.ascent) / 2) - (drawable.getBounds().bottom / 2)));
        drawable.draw(canvas);
        canvas.restore();
    }
}
