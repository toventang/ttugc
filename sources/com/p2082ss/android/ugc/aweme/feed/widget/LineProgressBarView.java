package com.p2082ss.android.ugc.aweme.feed.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.ugc.aweme.feed.widget.LineProgressBarView */
public class LineProgressBarView extends View {

    /* renamed from: a */
    private int f116632a;

    /* renamed from: b */
    private int f116633b = 100;

    /* renamed from: c */
    private int f116634c;

    /* renamed from: d */
    private Paint f116635d;

    /* renamed from: e */
    private Rect f116636e;

    static {
        Covode.recordClassIndex(59631);
    }

    public int getProgress() {
        return this.f116632a;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f116635d = new Paint(1);
        this.f116636e = new Rect();
    }

    public void setMaxProgress(int i) {
        this.f116633b = i;
        postInvalidate();
    }

    public void setProgress(int i) {
        this.f116632a = i;
        postInvalidate();
    }

    public void setColor(int i) {
        this.f116634c = i;
        this.f116635d.setColor(i);
        postInvalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        MethodCollector.m26663i(5272);
        super.onDraw(canvas);
        this.f116636e.set(0, 0, (getMeasuredWidth() * this.f116632a) / this.f116633b, getMeasuredHeight());
        canvas.drawRect(this.f116636e, this.f116635d);
        MethodCollector.m26664o(5272);
    }

    public LineProgressBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(5231);
        MethodCollector.m26664o(5231);
    }
}
