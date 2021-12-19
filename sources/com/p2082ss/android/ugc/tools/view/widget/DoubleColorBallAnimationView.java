package com.p2082ss.android.ugc.tools.view.widget;

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

/* renamed from: com.ss.android.ugc.tools.view.widget.DoubleColorBallAnimationView */
public class DoubleColorBallAnimationView extends View {

    /* renamed from: a */
    public boolean f190120a;

    /* renamed from: b */
    private int f190121b;

    /* renamed from: c */
    private int f190122c;

    /* renamed from: d */
    private Paint f190123d;

    /* renamed from: e */
    private final PorterDuffXfermode f190124e;

    /* renamed from: f */
    private long f190125f;

    /* renamed from: g */
    private int f190126g;

    /* renamed from: h */
    private float f190127h;

    /* renamed from: i */
    private float f190128i;

    /* renamed from: j */
    private float f190129j;

    /* renamed from: k */
    private float f190130k;

    static {
        Covode.recordClassIndex(99017);
    }

    /* renamed from: b */
    public final void mo129912b() {
        setLayerType(0, null);
        this.f190120a = false;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo129912b();
    }

    /* renamed from: a */
    public final void mo129911a() {
        setLayerType(1, null);
        m146093d();
        this.f190120a = true;
        postInvalidate();
    }

    /* renamed from: c */
    private static Paint m146092c() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStyle(Paint.Style.FILL);
        return paint;
    }

    /* renamed from: d */
    private void m146093d() {
        this.f190125f = -1;
        if (this.f190126g <= 0) {
            setProgressBarInfo(getContext().getResources().getDimensionPixelSize(R.dimen.tr));
        }
        int min = Math.min(getMeasuredHeight(), getMeasuredWidth());
        if (this.f190126g > min && min > 0) {
            setProgressBarInfo(min);
        }
        if (this.f190123d == null) {
            this.f190123d = m146092c();
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            mo129911a();
        } else {
            mo129912b();
        }
    }

    /* renamed from: a */
    private void m146091a(Context context) {
        this.f190121b = C0643b.m2378c(context, R.color.qz);
        this.f190122c = C0643b.m2378c(context, R.color.r0);
    }

    public void setProgressBarInfo(int i) {
        if (i > 0) {
            this.f190126g = i;
            this.f190127h = ((float) i) / 2.0f;
            float f = ((float) (i >> 1)) * 0.32f;
            this.f190128i = f;
            float f2 = (((float) i) * 0.16f) + f;
            this.f190129j = f2;
            this.f190130k = ((float) i) - (f2 * 2.0f);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        boolean z;
        float f;
        float f2;
        int i;
        int i2;
        MethodCollector.m26663i(11464);
        super.onDraw(canvas);
        if (!this.f190120a) {
            MethodCollector.m26664o(11464);
            return;
        }
        long nanoTime = System.nanoTime() / 1000000;
        if (this.f190125f < 0) {
            this.f190125f = nanoTime;
        }
        float f3 = ((float) (nanoTime - this.f190125f)) / 400.0f;
        int i3 = (int) f3;
        if ((i3 & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        float f4 = f3 - ((float) i3);
        if (((double) f4) < 0.5d) {
            f = f4 * 2.0f * f4;
        } else {
            f = ((f4 * 2.0f) * (2.0f - f4)) - 1.0f;
        }
        int i4 = this.f190126g;
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, (float) i4, (float) i4, this.f190123d, 31);
        float f5 = (this.f190130k * f) + this.f190129j;
        if (((double) f) < 0.5d) {
            f2 = f * 2.0f;
        } else {
            f2 = 2.0f - (f * 2.0f);
        }
        float f6 = this.f190128i;
        float f7 = (0.25f * f2 * f6) + f6;
        Paint paint = this.f190123d;
        if (z) {
            i = this.f190122c;
        } else {
            i = this.f190121b;
        }
        paint.setColor(i);
        canvas.drawCircle(f5, this.f190127h, f7, this.f190123d);
        float f8 = ((float) this.f190126g) - f5;
        float f9 = this.f190128i;
        float f10 = f9 - ((f2 * 0.375f) * f9);
        Paint paint2 = this.f190123d;
        if (z) {
            i2 = this.f190121b;
        } else {
            i2 = this.f190122c;
        }
        paint2.setColor(i2);
        this.f190123d.setXfermode(this.f190124e);
        canvas.drawCircle(f8, this.f190127h, f10, this.f190123d);
        this.f190123d.setXfermode(null);
        canvas.restoreToCount(saveLayer);
        postInvalidateDelayed(17);
        MethodCollector.m26664o(11464);
    }

    public DoubleColorBallAnimationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
        m146091a(context);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        MethodCollector.m26663i(11308);
        super.onMeasure(i, i2);
        int min = Math.min(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        if (this.f190126g > min && min > 0) {
            setProgressBarInfo(min);
        }
        MethodCollector.m26664o(11308);
    }

    private DoubleColorBallAnimationView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(11306);
        this.f190124e = new PorterDuffXfermode(PorterDuff.Mode.DARKEN);
        this.f190120a = false;
        this.f190125f = -1;
        this.f190126g = -1;
        m146091a(context);
        MethodCollector.m26664o(11306);
    }
}
