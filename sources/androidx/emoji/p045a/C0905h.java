package androidx.emoji.p045a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.emoji.a.h */
public final class C0905h extends AbstractC0891d {

    /* renamed from: e */
    private static Paint f3257e;

    static {
        Covode.recordClassIndex(991);
    }

    public C0905h(C0887b bVar) {
        super(bVar);
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        float f2 = f;
        if (C0877a.m3052a().f3187f) {
            float f3 = (float) i3;
            float f4 = f2 + ((float) this.f3229b);
            float f5 = (float) i5;
            if (f3257e == null) {
                TextPaint textPaint = new TextPaint();
                f3257e = textPaint;
                textPaint.setColor(C0877a.m3052a().f3188g);
                f3257e.setStyle(Paint.Style.FILL);
            }
            f2 = f2;
            canvas.drawRect(f2, f3, f4, f5, f3257e);
        }
        C0887b bVar = this.f3228a;
        Typeface typeface = bVar.f3211b.f3254d;
        Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        int i6 = bVar.f3210a * 2;
        canvas.drawText(bVar.f3211b.f3252b, i6, 2, f2, (float) i4, paint);
        paint.setTypeface(typeface2);
    }
}
