package com.p2082ss.android.ugc.aweme.common.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.common.widget.CloseView */
public class CloseView extends View {

    /* renamed from: a */
    private Paint f92397a;

    /* renamed from: b */
    private Path f92398b;

    /* renamed from: c */
    private int f92399c;

    /* renamed from: d */
    private int f92400d;

    /* renamed from: e */
    private int f92401e;

    /* renamed from: f */
    private int f92402f;

    /* renamed from: g */
    private int f92403g;

    /* renamed from: h */
    private int f92404h;

    /* renamed from: i */
    private int f92405i;

    /* renamed from: j */
    private int f92406j;

    static {
        Covode.recordClassIndex(46798);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        this.f92398b.reset();
        if (this.f92401e == 0 || this.f92402f == 0) {
            this.f92401e = getWidth();
            this.f92402f = getHeight();
        }
        this.f92403g = getPaddingLeft();
        this.f92404h = getPaddingRight();
        this.f92405i = getPaddingTop();
        this.f92406j = getPaddingBottom();
        this.f92398b.moveTo((float) this.f92403g, (float) this.f92405i);
        this.f92398b.lineTo((float) (this.f92401e - this.f92404h), (float) (this.f92402f - this.f92406j));
        this.f92398b.moveTo((float) this.f92403g, (float) (this.f92402f - this.f92406j));
        this.f92398b.lineTo((float) (this.f92401e - this.f92404h), (float) this.f92405i);
        canvas.save();
        canvas.drawPath(this.f92398b, this.f92397a);
        canvas.restore();
    }

    public CloseView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private CloseView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(13569);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.a2d, R.attr.a2i});
        this.f92399c = obtainStyledAttributes.getColor(0, -16777216);
        this.f92400d = obtainStyledAttributes.getDimensionPixelSize(1, C34728n.m70946a(1.0d));
        obtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f92397a = paint;
        paint.setColor(this.f92399c);
        this.f92397a.setStrokeWidth((float) this.f92400d);
        this.f92397a.setAntiAlias(true);
        this.f92397a.setStyle(Paint.Style.STROKE);
        this.f92397a.setStrokeJoin(Paint.Join.ROUND);
        this.f92397a.setStrokeCap(Paint.Cap.ROUND);
        this.f92398b = new Path();
        MethodCollector.m26664o(13569);
    }
}
