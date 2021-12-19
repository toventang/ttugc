package com.bytedance.android.live.design.view.sheet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.live.design.C4079b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;

public class LiveSheetHandleView extends View {

    /* renamed from: a */
    private float f11455a;

    /* renamed from: b */
    private float f11456b = (this.f11458d.getStrokeWidth() / 2.0f);

    /* renamed from: c */
    private int f11457c;

    /* renamed from: d */
    private Paint f11458d;

    /* renamed from: e */
    private Path f11459e;

    static {
        Covode.recordClassIndex(4664);
    }

    /* renamed from: a */
    private void m9989a() {
        this.f11459e.reset();
        if (getWidth() > 0 && getHeight() > 0) {
            this.f11459e.moveTo(this.f11456b, ((float) getHeight()) / 2.0f);
            this.f11459e.lineTo(((float) getWidth()) / 2.0f, (((float) getHeight()) / 2.0f) + (((float) this.f11457c) * this.f11455a));
            this.f11459e.lineTo(((float) getWidth()) - this.f11456b, ((float) getHeight()) / 2.0f);
        }
    }

    public void setOffset(float f) {
        this.f11455a = f;
        m9989a();
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        MethodCollector.m26663i(8407);
        super.onDraw(canvas);
        canvas.drawPath(this.f11459e, this.f11458d);
        MethodCollector.m26664o(8407);
    }

    public LiveSheetHandleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(11401);
        Paint paint = new Paint(1);
        this.f11458d = paint;
        paint.setColor(C4079b.m9889a(this, (int) R.attr.alx));
        this.f11458d.setStyle(Paint.Style.STROKE);
        this.f11458d.setStrokeWidth((float) getContext().getResources().getDimensionPixelSize(R.dimen.nw));
        this.f11458d.setStrokeCap(Paint.Cap.ROUND);
        this.f11458d.setStrokeJoin(Paint.Join.ROUND);
        this.f11459e = new Path();
        this.f11457c = getContext().getResources().getDimensionPixelSize(R.dimen.nv);
        MethodCollector.m26664o(11401);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m9989a();
    }
}
