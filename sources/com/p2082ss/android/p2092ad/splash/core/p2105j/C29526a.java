package com.p2082ss.android.p2092ad.splash.core.p2105j;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.ad.splash.core.j.a */
public final class C29526a extends TextView {

    /* renamed from: a */
    public long f70335a = 0;

    /* renamed from: b */
    public double f70336b = 1.0d;

    /* renamed from: c */
    private final int f70337c;

    /* renamed from: d */
    private Paint f70338d;

    /* renamed from: e */
    private int f70339e;

    /* renamed from: f */
    private int f70340f = -1;

    /* renamed from: g */
    private RectF f70341g;

    /* renamed from: h */
    private final float f70342h = 1.0f;

    /* renamed from: i */
    private ValueAnimator f70343i;

    static {
        Covode.recordClassIndex(35920);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ValueAnimator valueAnimator = this.f70343i;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f70343i;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            this.f70343i = null;
        }
    }

    public final void setBorderColor(int i) {
        this.f70340f = i;
        this.f70338d.setColor(i);
    }

    public final void setBorderSize(int i) {
        int max = Math.max(i, 0);
        this.f70339e = max;
        this.f70338d.setStrokeWidth((float) max);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        MethodCollector.m26663i(13104);
        super.onDraw(canvas);
        RectF rectF = this.f70341g;
        if (rectF != null) {
            canvas.drawArc(rectF, -90.0f, (float) (this.f70336b * 360.0d), false, this.f70338d);
        }
        MethodCollector.m26664o(13104);
    }

    public final void setDuration(long j) {
        long max = Math.max(0L, j);
        this.f70335a = max;
        if (max != 0) {
            ValueAnimator duration = ValueAnimator.ofFloat((float) max, 0.0f).setDuration(this.f70335a);
            this.f70343i = duration;
            duration.setInterpolator(new LinearInterpolator());
            this.f70343i.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.p2082ss.android.p2092ad.splash.core.p2105j.C29526a.C295271 */

                static {
                    Covode.recordClassIndex(35921);
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    C29526a aVar = C29526a.this;
                    double d = (double) floatValue;
                    double d2 = (double) aVar.f70335a;
                    Double.isNaN(d);
                    Double.isNaN(d2);
                    aVar.f70336b = d / d2;
                    C29526a.this.invalidate();
                }
            });
        }
    }

    public C29526a(Context context) {
        super(context);
        MethodCollector.m26663i(12929);
        int parseColor = Color.parseColor("#979797");
        this.f70337c = parseColor;
        if (this.f70339e == 0) {
            this.f70339e = (int) ((getResources().getDisplayMetrics().density * 1.0f) + 0.5f);
        }
        Paint paint = new Paint();
        this.f70338d = paint;
        paint.setColor(this.f70340f);
        this.f70338d.setStyle(Paint.Style.STROKE);
        this.f70338d.setStrokeWidth((float) this.f70339e);
        this.f70338d.setAntiAlias(true);
        this.f70338d.setDither(true);
        setTextColor(-1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(parseColor);
        gradientDrawable.setShape(1);
        int i = Build.VERSION.SDK_INT;
        setBackground(gradientDrawable);
        MethodCollector.m26664o(12929);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        MethodCollector.m26663i(13017);
        super.onMeasure(i, i2);
        if (getMeasuredHeight() > 0 && getMeasuredWidth() > 0) {
            int i3 = this.f70339e;
            this.f70341g = new RectF((float) (i3 / 2), (float) (i3 / 2), (float) (getMeasuredWidth() - (this.f70339e / 2)), (float) (getMeasuredHeight() - (this.f70339e / 2)));
        }
        MethodCollector.m26664o(13017);
    }
}
