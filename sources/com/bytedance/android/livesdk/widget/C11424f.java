package com.bytedance.android.livesdk.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.widget.f */
public class C11424f extends ImageSpan {
    static {
        Covode.recordClassIndex(13080);
    }

    public C11424f(Drawable drawable) {
        super(drawable);
    }

    /* renamed from: a */
    protected static int m20240a(int i, Paint.FontMetricsInt fontMetricsInt, Drawable drawable) {
        return ((((fontMetricsInt.descent + i) + i) + fontMetricsInt.ascent) / 2) - (drawable.getBounds().bottom / 2);
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
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
        Drawable drawable = getDrawable();
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null && !bitmapDrawable.getBitmap().isRecycled()) {
                int a = m20240a(i4, paint.getFontMetricsInt(), drawable);
                canvas.save();
                canvas.translate(f, (float) a);
                drawable.draw(canvas);
                canvas.restore();
                return;
            }
            return;
        }
        int a2 = m20240a(i4, paint.getFontMetricsInt(), drawable);
        canvas.save();
        canvas.translate(f, (float) a2);
        drawable.draw(canvas);
        canvas.restore();
    }
}
