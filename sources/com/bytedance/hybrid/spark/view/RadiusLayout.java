package com.bytedance.hybrid.spark.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import p4600h.p4611f.p4613b.C89219l;

public final class RadiusLayout extends FrameLayout {

    /* renamed from: a */
    public boolean f38049a;

    /* renamed from: b */
    public float[] f38050b;

    /* renamed from: c */
    private Paint f38051c;

    /* renamed from: d */
    private boolean f38052d;

    /* renamed from: e */
    private final RectF f38053e;

    /* renamed from: f */
    private final Path f38054f;

    static {
        Covode.recordClassIndex(17864);
    }

    public RadiusLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final void draw(Canvas canvas) {
        C89219l.m154719c(canvas, "");
        m28729a(canvas);
        super.draw(canvas);
    }

    /* renamed from: a */
    private final void m28729a(Canvas canvas) {
        this.f38053e.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
        int i = Build.VERSION.SDK_INT;
        this.f38054f.reset();
        Path path = this.f38054f;
        RectF rectF = this.f38053e;
        float[] fArr = this.f38050b;
        if (fArr == null) {
            C89219l.m154710a("radiusArray");
        }
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.clipPath(this.f38054f);
    }

    public final void setRadius(float f) {
        this.f38050b = new float[]{f, f, f, f, f, f, f, f};
        invalidate();
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        C89219l.m154719c(canvas, "");
        m28729a(canvas);
        super.dispatchDraw(canvas);
        if (this.f38052d && this.f38049a && (paint = this.f38051c) != null) {
            this.f38053e.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            int i = Build.VERSION.SDK_INT;
            this.f38054f.reset();
            Path path = this.f38054f;
            RectF rectF = this.f38053e;
            float[] fArr = this.f38050b;
            if (fArr == null) {
                C89219l.m154710a("radiusArray");
            }
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.drawPath(this.f38054f, paint);
        }
    }

    private /* synthetic */ RadiusLayout(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private RadiusLayout(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154719c(context, "");
        MethodCollector.m26663i(10667);
        this.f38049a = true;
        this.f38053e = new RectF();
        this.f38054f = new Path();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(0);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(0.0f);
        this.f38051c = paint;
        this.f38052d = false;
        invalidate();
        MethodCollector.m26664o(10667);
    }
}
