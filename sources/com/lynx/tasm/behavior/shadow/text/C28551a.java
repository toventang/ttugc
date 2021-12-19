package com.lynx.tasm.behavior.shadow.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import com.bytedance.covode.number.Covode;

/* renamed from: com.lynx.tasm.behavior.shadow.text.a */
public final class C28551a extends ReplacementSpan {

    /* renamed from: a */
    int f67178a;

    /* renamed from: b */
    private final int f67179b;

    static {
        Covode.recordClassIndex(34567);
    }

    public C28551a(int i) {
        this.f67179b = i;
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt();
        int round = Math.round(paint.measureText(charSequence, i, i2));
        this.f67178a = round;
        return round;
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int i6;
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        int i7 = this.f67179b;
        if (i7 == 0) {
            i6 = -Math.round(fontMetrics.top);
        } else if (i7 == 2) {
            i6 = i5 - Math.round(fontMetrics.leading);
        } else if (i7 == 1) {
            i6 = (int) (((float) (Math.round(Math.abs(fontMetrics.ascent)) + i3)) + ((((float) (i5 - i3)) - (fontMetrics.descent - fontMetrics.ascent)) / 2.0f));
            if (fontMetrics.leading == 0.0f) {
                i6 = (int) (((float) i6) + ((fontMetrics.descent / 2.0f) - paint.getStrokeMiter()));
            }
        } else {
            i6 = i4;
        }
        canvas.drawText(charSequence, i, i2, f, (float) i6, paint);
    }
}
