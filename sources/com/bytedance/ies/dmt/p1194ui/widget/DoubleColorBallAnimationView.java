package com.bytedance.ies.dmt.p1194ui.widget;

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

/* renamed from: com.bytedance.ies.dmt.ui.widget.DoubleColorBallAnimationView */
public class DoubleColorBallAnimationView extends View {

    /* renamed from: a */
    public boolean f41306a;

    /* renamed from: b */
    private final float f41307b;

    /* renamed from: c */
    private final float f41308c;

    /* renamed from: d */
    private final float f41309d;

    /* renamed from: e */
    private final float f41310e;

    /* renamed from: f */
    private final float f41311f;

    /* renamed from: g */
    private final long f41312g;

    /* renamed from: h */
    private int f41313h;

    /* renamed from: i */
    private int f41314i;

    /* renamed from: j */
    private Paint f41315j;

    /* renamed from: k */
    private final PorterDuffXfermode f41316k;

    /* renamed from: l */
    private float f41317l;

    /* renamed from: m */
    private boolean f41318m;

    /* renamed from: n */
    private boolean f41319n;

    /* renamed from: o */
    private int f41320o;

    /* renamed from: p */
    private long f41321p;

    /* renamed from: q */
    private int f41322q;

    /* renamed from: r */
    private float f41323r;

    /* renamed from: s */
    private float f41324s;

    /* renamed from: t */
    private float f41325t;

    /* renamed from: u */
    private float f41326u;

    static {
        Covode.recordClassIndex(19745);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo27420b();
    }

    /* renamed from: a */
    public final void mo27419a() {
        m31923d();
        this.f41306a = true;
        this.f41318m = true;
        postInvalidate();
    }

    /* renamed from: b */
    public final void mo27420b() {
        this.f41306a = false;
        this.f41319n = false;
        this.f41317l = 0.0f;
    }

    /* renamed from: c */
    private static Paint m31922c() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStyle(Paint.Style.FILL);
        return paint;
    }

    /* renamed from: d */
    private void m31923d() {
        this.f41321p = -1;
        if (this.f41322q <= 0) {
            setProgressBarInfo(getContext().getResources().getDimensionPixelSize(R.dimen.h1));
        }
        int min = Math.min(getMeasuredHeight(), getMeasuredWidth());
        if (this.f41322q > min && min > 0) {
            setProgressBarInfo(min);
        }
        if (this.f41315j == null) {
            this.f41315j = m31922c();
        }
        this.f41319n = true;
    }

    public void setCycleBias(int i) {
        this.f41320o = i;
    }

    public DoubleColorBallAnimationView(Context context) {
        this(context, null);
        m31921a(context);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            mo27419a();
        } else {
            mo27420b();
        }
    }

    /* renamed from: a */
    private void m31921a(Context context) {
        this.f41313h = C0643b.m2378c(context, R.color.bh);
        this.f41314i = C0643b.m2378c(context, R.color.a28);
    }

    public void setProgress(float f) {
        if (!this.f41319n) {
            m31923d();
        }
        this.f41317l = f;
        this.f41306a = false;
        this.f41318m = false;
        postInvalidate();
    }

    public void setProgressBarInfo(int i) {
        if (i > 0) {
            this.f41322q = i;
            this.f41323r = ((float) i) / 2.0f;
            float f = ((float) (i >> 1)) * 0.32f;
            this.f41324s = f;
            float f2 = (((float) i) * 0.16f) + f;
            this.f41325t = f2;
            this.f41326u = ((float) i) - (f2 * 2.0f);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        float f2;
        int i;
        int i2;
        MethodCollector.m26663i(10478);
        super.onDraw(canvas);
        if ((this.f41306a || !this.f41318m) && this.f41319n) {
            boolean z = false;
            if (this.f41318m) {
                long nanoTime = System.nanoTime() / 1000000;
                if (this.f41321p < 0) {
                    this.f41321p = nanoTime;
                }
                float f3 = ((float) (nanoTime - this.f41321p)) / 400.0f;
                this.f41317l = f3;
                int i3 = (int) f3;
                if (((this.f41320o + i3) & 1) == 1) {
                    z = true;
                }
                this.f41317l = f3 - ((float) i3);
            } else {
                z = false;
            }
            float f4 = this.f41317l;
            if (((double) f4) < 0.5d) {
                f = f4 * 2.0f * f4;
            } else {
                f = ((f4 * 2.0f) * (2.0f - f4)) - 1.0f;
            }
            int i4 = this.f41322q;
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, (float) i4, (float) i4, this.f41315j, 31);
            float f5 = (this.f41326u * f) + this.f41325t;
            if (((double) f) < 0.5d) {
                f2 = f * 2.0f;
            } else {
                f2 = 2.0f - (f * 2.0f);
            }
            float f6 = this.f41324s;
            float f7 = (0.25f * f2 * f6) + f6;
            Paint paint = this.f41315j;
            if (z) {
                i = this.f41314i;
            } else {
                i = this.f41313h;
            }
            paint.setColor(i);
            canvas.drawCircle(f5, this.f41323r, f7, this.f41315j);
            float f8 = ((float) this.f41322q) - f5;
            float f9 = this.f41324s;
            float f10 = f9 - ((f2 * 0.375f) * f9);
            Paint paint2 = this.f41315j;
            if (z) {
                i2 = this.f41313h;
            } else {
                i2 = this.f41314i;
            }
            paint2.setColor(i2);
            this.f41315j.setXfermode(this.f41316k);
            canvas.drawCircle(f8, this.f41323r, f10, this.f41315j);
            this.f41315j.setXfermode(null);
            canvas.restoreToCount(saveLayer);
            postInvalidateDelayed(17);
            MethodCollector.m26664o(10478);
            return;
        }
        MethodCollector.m26664o(10478);
    }

    public DoubleColorBallAnimationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        m31921a(context);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        MethodCollector.m26663i(10167);
        super.onMeasure(i, i2);
        int min = Math.min(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        if (this.f41322q > min && min > 0) {
            setProgressBarInfo(min);
        }
        MethodCollector.m26664o(10167);
    }

    public DoubleColorBallAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(9717);
        this.f41307b = 0.25f;
        this.f41308c = 0.375f;
        this.f41309d = 0.16f;
        this.f41310e = 0.32f;
        this.f41311f = 400.0f;
        this.f41312g = 17;
        this.f41316k = new PorterDuffXfermode(PorterDuff.Mode.DARKEN);
        this.f41318m = false;
        this.f41319n = false;
        this.f41320o = 0;
        this.f41306a = false;
        this.f41321p = -1;
        this.f41322q = -1;
        m31921a(context);
        MethodCollector.m26664o(9717);
    }
}
