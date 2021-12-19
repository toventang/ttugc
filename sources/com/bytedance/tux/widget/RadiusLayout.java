package com.bytedance.tux.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.p1722h.C23163i;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

public final class RadiusLayout extends FrameLayout {

    /* renamed from: a */
    public boolean f55488a;

    /* renamed from: b */
    private Paint f55489b;

    /* renamed from: c */
    private boolean f55490c;

    /* renamed from: d */
    private float[] f55491d;

    /* renamed from: e */
    private final RectF f55492e;

    /* renamed from: f */
    private final Path f55493f;

    static {
        Covode.recordClassIndex(27364);
    }

    public RadiusLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final void draw(Canvas canvas) {
        C89219l.m154719c(canvas, "");
        m44056a(canvas);
        super.draw(canvas);
    }

    /* renamed from: a */
    private final void m44056a(Canvas canvas) {
        this.f55492e.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
        int i = Build.VERSION.SDK_INT;
        this.f55493f.reset();
        Path path = this.f55493f;
        RectF rectF = this.f55492e;
        float[] fArr = this.f55491d;
        if (fArr == null) {
            C89219l.m154710a("radiusArray");
        }
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.clipPath(this.f55493f);
    }

    public final void setRadius(float f) {
        this.f55491d = new float[]{f, f, f, f, f, f, f, f};
        invalidate();
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        C89219l.m154719c(canvas, "");
        m44056a(canvas);
        super.dispatchDraw(canvas);
        if (this.f55490c && this.f55488a && (paint = this.f55489b) != null) {
            this.f55492e.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            int i = Build.VERSION.SDK_INT;
            this.f55493f.reset();
            Path path = this.f55493f;
            RectF rectF = this.f55492e;
            float[] fArr = this.f55491d;
            if (fArr == null) {
                C89219l.m154710a("radiusArray");
            }
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.drawPath(this.f55493f, paint);
        }
    }

    private /* synthetic */ RadiusLayout(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private RadiusLayout(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154719c(context, "");
        boolean z = false;
        MethodCollector.m26663i(11111);
        this.f55488a = true;
        this.f55492e = new RectF();
        this.f55493f = new Path();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.pz, R.attr.q0, R.attr.q1, R.attr.q2, R.attr.q3, R.attr.a0q, R.attr.a0r, R.attr.a0s, R.attr.a0t, R.attr.a0u, R.attr.a8o, R.attr.a8p, R.attr.a8q, R.attr.a8r, R.attr.a8s, R.attr.a8t, R.attr.a8u, R.attr.a8v}, 0, 0);
        C89219l.m154709a((Object) obtainStyledAttributes, "");
        float dimension = obtainStyledAttributes.getDimension(0, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(2, dimension);
        float dimension3 = obtainStyledAttributes.getDimension(4, dimension);
        float dimension4 = obtainStyledAttributes.getDimension(1, dimension);
        float dimension5 = obtainStyledAttributes.getDimension(3, dimension);
        int color = obtainStyledAttributes.getColor(10, -16777216);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(13, 0);
        int dimensionPixelOffset2 = obtainStyledAttributes.getDimensionPixelOffset(12, 0);
        int dimensionPixelOffset3 = obtainStyledAttributes.getDimensionPixelOffset(11, 0);
        mo38108a(dimension2, dimension3, dimension4, dimension5);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(color);
        paint.setStyle(Paint.Style.STROKE);
        if (!(dimensionPixelOffset2 == 0 || dimensionPixelOffset3 == 0)) {
            paint.setPathEffect(new DashPathEffect(new float[]{(float) dimensionPixelOffset2, (float) dimensionPixelOffset3}, 0.0f));
        }
        paint.setStrokeWidth((float) dimensionPixelOffset);
        this.f55489b = paint;
        if (!((color & -16777216) == 0 || dimensionPixelOffset == 0)) {
            z = true;
        }
        this.f55490c = z;
        invalidate();
        obtainStyledAttributes.recycle();
        MethodCollector.m26664o(11111);
    }

    /* renamed from: a */
    public final void mo38108a(float f, float f2, float f3, float f4) {
        Context context = getContext();
        C89219l.m154709a((Object) context, "");
        this.f55491d = C23163i.m43663a(context) ? new float[]{f2, f2, f, f, f3, f3, f4, f4} : new float[]{f, f, f2, f2, f4, f4, f3, f3};
        invalidate();
    }
}
