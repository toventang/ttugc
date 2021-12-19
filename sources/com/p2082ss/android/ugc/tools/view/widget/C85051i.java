package com.p2082ss.android.ugc.tools.view.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.tools.view.widget.i */
public class C85051i extends ImageSpan {

    /* renamed from: a */
    private Integer f190331a = null;

    /* renamed from: b */
    public int f190332b;

    /* renamed from: c */
    private boolean f190333c;

    static {
        Covode.recordClassIndex(99072);
    }

    public C85051i(Drawable drawable) {
        super(drawable);
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Integer num = this.f190331a;
        if (num != null && num.intValue() != i2 - i && this.f190333c) {
            return 0;
        }
        Rect bounds = getDrawable().getBounds();
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
        return bounds.right + this.f190332b;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Integer num = this.f190331a;
        if (num == null || num.intValue() == i2 - i || !this.f190333c) {
            Drawable drawable = getDrawable();
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            int i6 = ((((fontMetricsInt.descent + i4) + i4) + fontMetricsInt.ascent) / 2) - (drawable.getBounds().bottom / 2);
            canvas.save();
            canvas.translate(f + ((float) this.f190332b), (float) i6);
            drawable.draw(canvas);
            canvas.restore();
            Integer num2 = this.f190331a;
            if (num2 != null && num2.intValue() != i2 - i) {
                this.f190333c = true;
                return;
            }
            return;
        }
        this.f190333c = false;
    }
}
