package com.p2082ss.android.ugc.aweme.views;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.views.j */
public final class C81440j implements LineHeightSpan {

    /* renamed from: a */
    public final int f182027a;

    static {
        Covode.recordClassIndex(94809);
    }

    public C81440j(int i) {
        this.f182027a = i;
    }

    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        C89219l.m154721d(charSequence, "");
        C89219l.m154721d(fontMetricsInt, "");
        int i5 = fontMetricsInt.descent;
        int i6 = this.f182027a;
        if (i5 > i6) {
            fontMetricsInt.descent = Math.min(i6, fontMetricsInt.descent);
            fontMetricsInt.bottom = fontMetricsInt.descent;
            fontMetricsInt.ascent = 0;
            fontMetricsInt.top = 0;
        } else if ((-fontMetricsInt.ascent) + fontMetricsInt.descent > this.f182027a) {
            fontMetricsInt.bottom = fontMetricsInt.descent;
            fontMetricsInt.ascent = (-this.f182027a) + fontMetricsInt.descent;
            fontMetricsInt.top = fontMetricsInt.ascent;
        } else if ((-fontMetricsInt.ascent) + fontMetricsInt.bottom > this.f182027a) {
            fontMetricsInt.top = fontMetricsInt.ascent;
            fontMetricsInt.bottom = fontMetricsInt.ascent + this.f182027a;
        } else {
            int i7 = (-fontMetricsInt.top) + fontMetricsInt.bottom;
            int i8 = this.f182027a;
            if (i7 > i8) {
                fontMetricsInt.top = fontMetricsInt.bottom - this.f182027a;
                return;
            }
            double d = (double) (((float) (i8 - ((-fontMetricsInt.top) + fontMetricsInt.bottom))) / 2.0f);
            fontMetricsInt.top -= (int) ((float) Math.ceil(d));
            fontMetricsInt.bottom += (int) ((float) Math.floor(d));
            fontMetricsInt.ascent = fontMetricsInt.top;
            fontMetricsInt.descent = fontMetricsInt.bottom;
        }
    }
}
