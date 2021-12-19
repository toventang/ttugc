package com.p2082ss.android.ugc.aweme.emoji.views;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.emoji.views.a */
public class C46669a extends ImageSpan {

    /* renamed from: a */
    public int f108809a;

    /* renamed from: b */
    private Integer f108810b;

    /* renamed from: c */
    private CharSequence f108811c;

    /* renamed from: d */
    private boolean f108812d;

    static {
        Covode.recordClassIndex(55263);
    }

    /* renamed from: a */
    public final CharSequence mo79288a() {
        CharSequence charSequence = this.f108811c;
        if (charSequence != null) {
            return charSequence;
        }
        return "";
    }

    public C46669a(Drawable drawable, Integer num, CharSequence charSequence) {
        super(drawable);
        this.f108810b = num;
        this.f108811c = charSequence;
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Integer num = this.f108810b;
        if (num != null && num.intValue() != i2 - i && this.f108812d) {
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
        return bounds.right;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Integer num = this.f108810b;
        if (num == null || num.intValue() == i2 - i || !this.f108812d) {
            Drawable drawable = getDrawable();
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            int i6 = ((((fontMetricsInt.descent + i4) + i4) + fontMetricsInt.ascent) / 2) - (drawable.getBounds().bottom / 2);
            canvas.save();
            canvas.translate(f + ((float) this.f108809a), (float) i6);
            drawable.draw(canvas);
            canvas.restore();
            Integer num2 = this.f108810b;
            if (num2 != null && num2.intValue() != i2 - i) {
                this.f108812d = true;
                return;
            }
            return;
        }
        this.f108812d = false;
    }
}
