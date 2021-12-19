package com.p2082ss.android.ugc.aweme.shortvideo.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.C58030k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.q */
public class C74302q extends AppCompatImageView {

    /* renamed from: a */
    private int f167088a;

    /* renamed from: b */
    private int f167089b;

    /* renamed from: c */
    private Paint f167090c;

    /* renamed from: d */
    private float f167091d;

    /* renamed from: e */
    private RectF f167092e;

    static {
        Covode.recordClassIndex(87074);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C58030k.m104850a(this);
    }

    public C74302q(Context context) {
        this(context, (byte) 0);
    }

    public void setColor(int i) {
        this.f167090c.setColor(i);
    }

    public void setStrokeWidth(int i) {
        this.f167090c.setStrokeWidth((float) i);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.f167092e;
        float f = this.f167091d;
        canvas.drawRoundRect(rectF, f, f, this.f167090c);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(this.f167088a, this.f167089b);
    }

    /* renamed from: a */
    public final void mo116907a(int i, int i2) {
        this.f167088a = i;
        this.f167089b = i2;
        float f = this.f167091d;
        this.f167092e = new RectF(f / 2.0f, f / 2.0f, ((float) i) - (f / 2.0f), ((float) i2) - (f / 2.0f));
        invalidate();
    }

    private C74302q(Context context, byte b) {
        super(context);
        this.f167088a = 0;
        this.f167089b = 0;
        Paint paint = new Paint();
        this.f167090c = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f167090c.setColor(-1);
        float b2 = C13628n.m24520b(getContext(), 2.0f);
        this.f167091d = b2;
        this.f167090c.setStrokeWidth(b2);
    }
}
