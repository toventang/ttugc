package com.p2082ss.android.ugc.tools.view.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.view.widget.CircleProgressView */
public final class CircleProgressView extends View {

    /* renamed from: a */
    private Paint f190078a;

    /* renamed from: b */
    private Paint f190079b;

    /* renamed from: c */
    private int f190080c;

    /* renamed from: d */
    private int f190081d;

    /* renamed from: e */
    private int f190082e;

    /* renamed from: f */
    private int f190083f = 100;

    /* renamed from: g */
    private int f190084g;

    /* renamed from: h */
    private int f190085h;

    /* renamed from: i */
    private float f190086i;

    /* renamed from: j */
    private final RectF f190087j;

    static {
        Covode.recordClassIndex(99008);
    }

    public final int getHeight$lib_runtime_release() {
        return this.f190081d;
    }

    public final int getWidth$lib_runtime_release() {
        return this.f190080c;
    }

    public final void setHeight$lib_runtime_release(int i) {
        this.f190081d = i;
    }

    public final void setMaxProgress(int i) {
        this.f190083f = i;
    }

    public final void setStartAngle(int i) {
        this.f190084g = i;
    }

    public final void setWidth$lib_runtime_release(int i) {
        this.f190080c = i;
    }

    public final void setProgress(int i) {
        this.f190082e = i;
        invalidate();
    }

    public final void setBgCircleColor(int i) {
        Paint paint = this.f190078a;
        if (paint == null) {
            C89219l.m154710a("bgPaint");
        }
        paint.setColor(i);
    }

    public final void setCircleWidth(int i) {
        Paint paint = this.f190079b;
        if (paint == null) {
            C89219l.m154710a("progressPaint");
        }
        paint.setStrokeWidth((float) i);
    }

    public final void setProgressColor(int i) {
        Paint paint = this.f190079b;
        if (paint == null) {
            C89219l.m154710a("progressPaint");
        }
        paint.setColor(i);
    }

    public final void setBgCircleWidth(int i) {
        this.f190085h = i / 2;
        Paint paint = this.f190078a;
        if (paint == null) {
            C89219l.m154710a("bgPaint");
        }
        paint.setStrokeWidth((float) i);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        MethodCollector.m26663i(9674);
        C89219l.m154721d(canvas, "");
        super.onDraw(canvas);
        float f = this.f190086i;
        if (f > 0.0f) {
            RectF rectF = this.f190087j;
            int i = this.f190080c;
            rectF.set(((float) (i / 2)) - f, ((float) (this.f190081d / 2)) - f, ((float) (i / 2)) + f, ((float) (i / 2)) + f);
        } else {
            RectF rectF2 = this.f190087j;
            int i2 = this.f190085h;
            rectF2.set((float) i2, (float) i2, (float) (this.f190080c - i2), (float) (this.f190081d - i2));
        }
        RectF rectF3 = this.f190087j;
        float f2 = (float) (this.f190084g - 90);
        float f3 = ((((float) this.f190082e) * 1.0f) / ((float) this.f190083f)) * 360.0f;
        Paint paint = this.f190079b;
        if (paint == null) {
            C89219l.m154710a("progressPaint");
        }
        canvas.drawArc(rectF3, f2, f3, false, paint);
        MethodCollector.m26664o(9674);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        MethodCollector.m26663i(9524);
        super.onMeasure(i, i2);
        this.f190080c = View.MeasureSpec.getSize(i);
        this.f190081d = View.MeasureSpec.getSize(i2);
        MethodCollector.m26664o(9524);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CircleProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(9971);
        Paint paint = new Paint();
        this.f190078a = paint;
        paint.setAntiAlias(true);
        Paint paint2 = this.f190078a;
        if (paint2 == null) {
            C89219l.m154710a("bgPaint");
        }
        paint2.setStyle(Paint.Style.STROKE);
        Paint paint3 = this.f190078a;
        if (paint3 == null) {
            C89219l.m154710a("bgPaint");
        }
        Paint paint4 = new Paint(paint3);
        this.f190079b = paint4;
        paint4.setStrokeCap(Paint.Cap.ROUND);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ak7, R.attr.ak8, R.attr.ak9, R.attr.ak_, R.attr.aka, R.attr.akb, R.attr.akc, R.attr.akd, R.attr.ake, R.attr.akf, R.attr.akg, R.attr.akh, R.attr.aki, R.attr.akj, R.attr.akk, R.attr.akl, R.attr.akm, R.attr.akn, R.attr.ako, R.attr.akp, R.attr.akq, R.attr.akr, R.attr.aks, R.attr.akt, R.attr.aku, R.attr.akv});
            C89219l.m154716b(obtainStyledAttributes, "");
            this.f190086i = obtainStyledAttributes.getDimension(13, 0.0f);
            obtainStyledAttributes.recycle();
        }
        this.f190087j = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        MethodCollector.m26664o(9971);
    }
}
