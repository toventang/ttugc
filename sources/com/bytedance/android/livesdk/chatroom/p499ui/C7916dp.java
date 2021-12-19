package com.bytedance.android.livesdk.chatroom.p499ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.dp */
public final class C7916dp extends ReplacementSpan {

    /* renamed from: a */
    private int f19694a;

    /* renamed from: b */
    private int f19695b;

    /* renamed from: c */
    private int f19696c;

    /* renamed from: d */
    private int f19697d;

    /* renamed from: e */
    private String f19698e;

    /* renamed from: f */
    private int f19699f = C3966y.m9653a(0.0f);

    /* renamed from: g */
    private int f19700g = C3966y.m9653a(0.0f);

    /* renamed from: h */
    private int f19701h = C3966y.m9653a(6.0f);

    /* renamed from: i */
    private int f19702i = C3966y.m9653a(6.0f);

    /* renamed from: j */
    private int f19703j = C3966y.m9653a(0.0f);

    /* renamed from: k */
    private int f19704k = C3966y.m9653a(0.0f);

    static {
        Covode.recordClassIndex(8711);
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        paint.setTextSize((float) this.f19694a);
        return ((int) paint.measureText(this.f19698e)) + this.f19699f + this.f19700g + this.f19701h + this.f19702i;
    }

    public C7916dp(String str, int i, int i2, int i3, int i4) {
        this.f19698e = str;
        this.f19695b = i;
        this.f19694a = i2;
        this.f19697d = i3;
        this.f19696c = i4;
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int a = C3966y.m9653a(1.0f);
        paint.setTextSize((float) this.f19694a);
        paint.setAntiAlias(true);
        RectF rectF = new RectF();
        rectF.left = (float) (((int) f) + this.f19699f);
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        int i6 = (((i5 - i3) - fontMetricsInt.descent) + fontMetricsInt.top) / 2;
        rectF.top = (float) ((i3 + i6) - this.f19703j);
        rectF.bottom = (float) ((i5 - i6) + this.f19704k);
        rectF.right = rectF.left + ((float) ((int) paint.measureText(this.f19698e))) + ((float) this.f19701h) + ((float) this.f19702i);
        paint.setColor(this.f19697d);
        int i7 = this.f19696c;
        canvas.drawRoundRect(rectF, (float) i7, (float) i7, paint);
        paint.setColor(this.f19695b);
        canvas.drawText(this.f19698e, f + ((float) this.f19699f) + ((float) this.f19701h), ((float) i4) + ((float) (((((fontMetricsInt.descent - fontMetricsInt.ascent) / 2) + fontMetricsInt.ascent) / 2) + a)), paint);
    }
}
