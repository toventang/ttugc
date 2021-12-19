package com.p2082ss.android.ugc.aweme.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import android.util.TypedValue;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;

/* renamed from: com.ss.android.ugc.aweme.views.b */
public final class C81430b extends ReplacementSpan {

    /* renamed from: a */
    private Context f181996a;

    /* renamed from: b */
    private String f181997b;

    /* renamed from: c */
    private float f181998c;

    /* renamed from: d */
    private float f181999d;

    /* renamed from: e */
    private float f182000e;

    /* renamed from: f */
    private float f182001f;

    /* renamed from: g */
    private float f182002g;

    /* renamed from: h */
    private float f182003h;

    /* renamed from: i */
    private int f182004i;

    /* renamed from: j */
    private int f182005j;

    static {
        Covode.recordClassIndex(94799);
    }

    public C81430b(Context context, int i, String str, int i2) {
        float f;
        if (!TextUtils.isEmpty(str)) {
            Context applicationContext = context.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            this.f181996a = applicationContext;
            this.f182004i = i;
            this.f181997b = str;
            float applyDimension = TypedValue.applyDimension(1, 1.0f, applicationContext.getResources().getDisplayMetrics());
            this.f182003h = applyDimension;
            this.f181998c = 16.0f * applyDimension;
            this.f182000e = applyDimension * 4.0f;
            this.f182002g = 10.0f * applyDimension;
            this.f182005j = i2;
            this.f182001f = applyDimension * 3.0f;
            if (str.length() > 1) {
                Rect rect = new Rect();
                Paint paint = new Paint();
                paint.setTextSize(this.f182002g);
                paint.getTextBounds(str, 0, str.length(), rect);
                f = ((float) rect.width()) + (this.f182003h * 4.0f * 2.0f);
            } else {
                f = this.f181998c;
            }
            this.f181999d = f;
        }
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return (int) (this.f181999d + this.f182001f);
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        float f2;
        Paint paint2 = new Paint();
        paint2.setColor(this.f182004i);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float f3 = ((float) i4) + (((fontMetrics.descent - fontMetrics.ascent) - this.f181998c) / 2.0f) + fontMetrics.ascent;
        if (f != 0.0f) {
            f2 = this.f182001f + f;
        } else {
            f2 = f;
        }
        RectF rectF = new RectF(f2, f3, this.f181999d + f2, this.f181998c + f3);
        float f4 = this.f182000e;
        canvas.drawRoundRect(rectF, f4, f4, paint2);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(this.f182002g);
        textPaint.setColor(this.f182005j);
        textPaint.setFakeBoldText(true);
        textPaint.setAntiAlias(true);
        Paint.FontMetricsInt fontMetricsInt = textPaint.getFontMetricsInt();
        if (f != 0.0f) {
            f += this.f182001f;
        }
        RectF rectF2 = new RectF(f, f3, this.f181999d + f, this.f181998c + f3);
        String str = this.f181997b;
        float f5 = this.f182003h;
        canvas.drawText(str, (f + (4.0f * f5)) - (f5 * 0.5f), ((float) ((int) ((((rectF2.bottom + rectF2.top) - ((float) fontMetricsInt.bottom)) - ((float) fontMetricsInt.top)) / 2.0f))) - (f5 * 0.5f), textPaint);
    }
}
