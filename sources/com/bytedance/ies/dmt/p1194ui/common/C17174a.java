package com.bytedance.ies.dmt.p1194ui.common;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.ies.dmt.ui.common.a */
public class C17174a extends ImageSpan {

    /* renamed from: a */
    public int f40918a;

    /* renamed from: b */
    private Integer f40919b;

    /* renamed from: c */
    private boolean f40920c;

    static {
        Covode.recordClassIndex(19632);
    }

    public C17174a(Drawable drawable) {
        this(drawable, (byte) 0);
    }

    public C17174a(Context context, int i) {
        super(context, i);
    }

    private C17174a(Drawable drawable, byte b) {
        super(drawable);
        this.f40919b = null;
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Drawable drawable;
        Integer num = this.f40919b;
        if ((num != null && num.intValue() != i2 - i && this.f40920c) || (drawable = getDrawable()) == null) {
            return 0;
        }
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
        return bounds.right + this.f40918a;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Integer num = this.f40919b;
        if (num == null || num.intValue() == i2 - i || !this.f40920c) {
            Drawable drawable = getDrawable();
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            int i6 = ((((fontMetricsInt.descent + i4) + i4) + fontMetricsInt.ascent) / 2) - (drawable.getBounds().bottom / 2);
            canvas.save();
            canvas.translate(f + ((float) this.f40918a), (float) i6);
            drawable.draw(canvas);
            canvas.restore();
            Integer num2 = this.f40919b;
            if (num2 != null && num2.intValue() != i2 - i) {
                this.f40920c = true;
                return;
            }
            return;
        }
        this.f40920c = false;
    }
}
