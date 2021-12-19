package com.bytedance.ies.dmt.p1194ui.common.views;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.ies.dmt.ui.common.views.c */
public final class C17190c extends ReplacementSpan {

    /* renamed from: a */
    private String f40970a;

    static {
        Covode.recordClassIndex(19650);
    }

    public C17190c(String str) {
        this.f40970a = str;
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return (int) paint.measureText(this.f40970a);
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        canvas.drawText(this.f40970a, f, (float) (i4 - 10), paint);
    }
}
