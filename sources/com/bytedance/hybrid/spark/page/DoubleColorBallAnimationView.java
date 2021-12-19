package com.bytedance.hybrid.spark.page;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

public final class DoubleColorBallAnimationView extends View {

    /* renamed from: a */
    public boolean f37959a;

    /* renamed from: b */
    private final float f37960b;

    /* renamed from: c */
    private final float f37961c;

    /* renamed from: d */
    private final float f37962d;

    /* renamed from: e */
    private final float f37963e;

    /* renamed from: f */
    private final float f37964f;

    /* renamed from: g */
    private final long f37965g;

    /* renamed from: h */
    private int f37966h;

    /* renamed from: i */
    private int f37967i;

    /* renamed from: j */
    private Paint f37968j;

    /* renamed from: k */
    private final PorterDuffXfermode f37969k;

    /* renamed from: l */
    private float f37970l;

    /* renamed from: m */
    private boolean f37971m;

    /* renamed from: n */
    private boolean f37972n;

    /* renamed from: o */
    private int f37973o;

    /* renamed from: p */
    private long f37974p;

    /* renamed from: q */
    private int f37975q;

    /* renamed from: r */
    private float f37976r;

    /* renamed from: s */
    private float f37977s;

    /* renamed from: t */
    private float f37978t;

    /* renamed from: u */
    private float f37979u;

    static {
        Covode.recordClassIndex(17839);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m28694a();
    }

    /* renamed from: a */
    private void m28694a() {
        this.f37959a = false;
        this.f37972n = false;
        this.f37970l = 0.0f;
    }

    /* renamed from: b */
    private static Paint m28696b() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStyle(Paint.Style.FILL);
        return paint;
    }

    /* renamed from: c */
    private final void m28697c() {
        this.f37974p = -1;
        if (this.f37975q <= 0) {
            Context context = getContext();
            C89219l.m154709a((Object) context, "");
            setProgressBarInfo(context.getResources().getDimensionPixelSize(R.dimen.n8));
        }
        int min = Math.min(getMeasuredHeight(), getMeasuredWidth());
        if (this.f37975q > min && min > 0) {
            setProgressBarInfo(min);
        }
        if (this.f37968j == null) {
            this.f37968j = m28696b();
        }
        this.f37972n = true;
    }

    public final void setCycleBias(int i) {
        this.f37973o = i;
    }

    /* renamed from: a */
    private final void m28695a(Context context) {
        this.f37966h = C0643b.m2378c(context, R.color.jt);
        this.f37967i = C0643b.m2378c(context, R.color.ju);
    }

    public final void setProgress(float f) {
        if (!this.f37972n) {
            m28697c();
        }
        this.f37970l = f;
        this.f37959a = false;
        this.f37971m = false;
        postInvalidate();
    }

    public final void setProgressBarInfo(int i) {
        if (i > 0) {
            this.f37975q = i;
            this.f37976r = ((float) i) / 2.0f;
            float f = ((float) (i >> 1)) * this.f37963e;
            this.f37977s = f;
            float f2 = (this.f37962d * ((float) i)) + f;
            this.f37978t = f2;
            this.f37979u = ((float) i) - (f2 * 2.0f);
        }
    }

    public final void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            m28697c();
            this.f37959a = true;
            this.f37971m = true;
            postInvalidate();
            return;
        }
        m28694a();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        int i;
        int i2;
        MethodCollector.m26663i(12598);
        C89219l.m154719c(canvas, "");
        super.onDraw(canvas);
        if ((this.f37959a || !this.f37971m) && this.f37972n) {
            boolean z = false;
            if (this.f37971m) {
                long nanoTime = System.nanoTime() / 1000000;
                if (this.f37974p < 0) {
                    this.f37974p = nanoTime;
                }
                float f3 = ((float) (nanoTime - this.f37974p)) / this.f37964f;
                this.f37970l = f3;
                int i3 = (int) f3;
                if (((this.f37973o + i3) & 1) == 1) {
                    z = true;
                }
                this.f37970l = f3 - ((float) i3);
            } else {
                z = false;
            }
            float f4 = this.f37970l;
            if (((double) f4) < 0.5d) {
                f = f4 * 2.0f * f4;
            } else {
                f = ((f4 * 2.0f) * (2.0f - f4)) - 1.0f;
            }
            int i4 = this.f37975q;
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, (float) i4, (float) i4, this.f37968j, 31);
            float f5 = (this.f37979u * f) + this.f37978t;
            if (((double) f) < 0.5d) {
                f2 = f * 2.0f;
            } else {
                f2 = 2.0f - (f * 2.0f);
            }
            float f6 = this.f37977s;
            float f7 = (this.f37960b * f2 * f6) + f6;
            Paint paint = this.f37968j;
            if (paint == null) {
                C89219l.m154707a();
            }
            if (z) {
                i = this.f37967i;
            } else {
                i = this.f37966h;
            }
            paint.setColor(i);
            float f8 = this.f37976r;
            Paint paint2 = this.f37968j;
            if (paint2 == null) {
                C89219l.m154707a();
            }
            canvas.drawCircle(f5, f8, f7, paint2);
            float f9 = ((float) this.f37975q) - f5;
            float f10 = this.f37977s;
            float f11 = f10 - ((f2 * this.f37961c) * f10);
            Paint paint3 = this.f37968j;
            if (paint3 == null) {
                C89219l.m154707a();
            }
            if (z) {
                i2 = this.f37966h;
            } else {
                i2 = this.f37967i;
            }
            paint3.setColor(i2);
            Paint paint4 = this.f37968j;
            if (paint4 == null) {
                C89219l.m154707a();
            }
            paint4.setXfermode(this.f37969k);
            float f12 = this.f37976r;
            Paint paint5 = this.f37968j;
            if (paint5 == null) {
                C89219l.m154707a();
            }
            canvas.drawCircle(f9, f12, f11, paint5);
            Paint paint6 = this.f37968j;
            if (paint6 == null) {
                C89219l.m154707a();
            }
            paint6.setXfermode(null);
            canvas.restoreToCount(saveLayer);
            postInvalidateDelayed(this.f37965g);
            MethodCollector.m26664o(12598);
            return;
        }
        MethodCollector.m26664o(12598);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DoubleColorBallAnimationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
        C89219l.m154719c(context, "");
        m28695a(context);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        MethodCollector.m26663i(12490);
        super.onMeasure(i, i2);
        int min = Math.min(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        if (this.f37975q > min && min > 0) {
            setProgressBarInfo(min);
        }
        MethodCollector.m26664o(12490);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private DoubleColorBallAnimationView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        C89219l.m154719c(context, "");
        MethodCollector.m26663i(12715);
        this.f37960b = 0.25f;
        this.f37961c = 0.375f;
        this.f37962d = 0.16f;
        this.f37963e = 0.32f;
        this.f37964f = 400.0f;
        this.f37965g = 17;
        this.f37969k = new PorterDuffXfermode(PorterDuff.Mode.XOR);
        this.f37974p = -1;
        this.f37975q = -1;
        m28695a(context);
        MethodCollector.m26664o(12715);
    }
}
