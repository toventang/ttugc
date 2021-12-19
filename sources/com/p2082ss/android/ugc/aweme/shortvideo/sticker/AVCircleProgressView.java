package com.p2082ss.android.ugc.aweme.shortvideo.sticker;

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

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.AVCircleProgressView */
public final class AVCircleProgressView extends View {

    /* renamed from: a */
    private Paint f163421a;

    /* renamed from: b */
    private Paint f163422b;

    /* renamed from: c */
    private int f163423c;

    /* renamed from: d */
    private int f163424d;

    /* renamed from: e */
    private int f163425e;

    /* renamed from: f */
    private int f163426f = 100;

    /* renamed from: g */
    private int f163427g;

    /* renamed from: h */
    private int f163428h;

    /* renamed from: i */
    private float f163429i;

    static {
        Covode.recordClassIndex(85517);
    }

    public final int getHeight$tools_avdmtview_release() {
        return this.f163424d;
    }

    public final int getWidth$tools_avdmtview_release() {
        return this.f163423c;
    }

    public final void setHeight$tools_avdmtview_release(int i) {
        this.f163424d = i;
    }

    public final void setMaxProgress(int i) {
        this.f163426f = i;
    }

    public final void setStartAngle(int i) {
        this.f163427g = i;
    }

    public final void setWidth$tools_avdmtview_release(int i) {
        this.f163423c = i;
    }

    public final void setProgress(int i) {
        this.f163425e = i;
        invalidate();
    }

    public final void setBgCircleColor(int i) {
        Paint paint = this.f163421a;
        if (paint == null) {
            C89219l.m154710a("bgPaint");
        }
        paint.setColor(i);
    }

    public final void setCircleWidth(int i) {
        Paint paint = this.f163422b;
        if (paint == null) {
            C89219l.m154710a("progressPaint");
        }
        paint.setStrokeWidth((float) i);
    }

    public final void setProgressColor(int i) {
        Paint paint = this.f163422b;
        if (paint == null) {
            C89219l.m154710a("progressPaint");
        }
        paint.setColor(i);
    }

    public final void setBgCircleWidth(int i) {
        this.f163428h = i / 2;
        Paint paint = this.f163421a;
        if (paint == null) {
            C89219l.m154710a("bgPaint");
        }
        paint.setStrokeWidth((float) i);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        MethodCollector.m26663i(9950);
        C89219l.m154721d(canvas, "");
        super.onDraw(canvas);
        int i = this.f163428h;
        RectF rectF = new RectF((float) i, (float) i, (float) (this.f163423c - i), (float) (this.f163424d - i));
        if (this.f163429i > 0.0f) {
            int i2 = this.f163423c;
            float f = this.f163429i;
            rectF = new RectF(((float) (i2 / 2)) - f, ((float) (this.f163424d / 2)) - f, ((float) (i2 / 2)) + f, ((float) (i2 / 2)) + f);
        }
        float f2 = (float) (this.f163427g - 90);
        float f3 = ((((float) this.f163425e) * 1.0f) / ((float) this.f163426f)) * 360.0f;
        Paint paint = this.f163422b;
        if (paint == null) {
            C89219l.m154710a("progressPaint");
        }
        canvas.drawArc(rectF, f2, f3, false, paint);
        MethodCollector.m26664o(9950);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        MethodCollector.m26663i(9810);
        super.onMeasure(i, i2);
        this.f163423c = View.MeasureSpec.getSize(i);
        this.f163424d = View.MeasureSpec.getSize(i2);
        MethodCollector.m26664o(9810);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AVCircleProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(9952);
        Paint paint = new Paint();
        this.f163421a = paint;
        paint.setAntiAlias(true);
        Paint paint2 = this.f163421a;
        if (paint2 == null) {
            C89219l.m154710a("bgPaint");
        }
        paint2.setStyle(Paint.Style.STROKE);
        Paint paint3 = this.f163421a;
        if (paint3 == null) {
            C89219l.m154710a("bgPaint");
        }
        Paint paint4 = new Paint(paint3);
        this.f163422b = paint4;
        paint4.setStrokeCap(Paint.Cap.ROUND);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a3n});
            C89219l.m154716b(obtainStyledAttributes, "");
            this.f163429i = obtainStyledAttributes.getDimension(0, 0.0f);
            obtainStyledAttributes.recycle();
        }
        MethodCollector.m26664o(9952);
    }
}
