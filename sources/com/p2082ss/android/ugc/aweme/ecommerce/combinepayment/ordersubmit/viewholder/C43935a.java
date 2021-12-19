package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.a */
public final class C43935a extends ImageSpan {
    static {
        Covode.recordClassIndex(52224);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43935a(Drawable drawable) {
        super(drawable);
        C89219l.m154721d(drawable, "");
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        C89219l.m154721d(canvas, "");
        C89219l.m154721d(paint, "");
        canvas.save();
        Drawable drawable = getDrawable();
        C89219l.m154716b(drawable, "");
        canvas.translate(f, (float) (((i5 - i3) / 2) - (drawable.getBounds().height() / 2)));
        getDrawable().draw(canvas);
        canvas.restore();
    }
}
