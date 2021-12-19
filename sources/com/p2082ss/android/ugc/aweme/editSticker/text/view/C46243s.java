package com.p2082ss.android.ugc.aweme.editSticker.text.view;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.view.widget.C85051i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.view.s */
public final class C46243s extends C85051i {

    /* renamed from: a */
    public final float f107770a;

    static {
        Covode.recordClassIndex(54805);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46243s(Drawable drawable, float f) {
        super(drawable);
        C89219l.m154721d(drawable, "");
        this.f107770a = f;
    }

    @Override // com.p2082ss.android.ugc.tools.view.widget.C85051i
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        C89219l.m154721d(paint, "");
        return (int) (((float) super.getSize(paint, charSequence, i, i2, fontMetricsInt)) + this.f107770a);
    }
}
