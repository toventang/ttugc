package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.LiveCircleView */
public class LiveCircleView extends View {

    /* renamed from: a */
    private Paint f115366a;

    /* renamed from: b */
    private float f115367b;

    /* renamed from: c */
    private int f115368c;

    /* renamed from: d */
    private int f115369d;

    /* renamed from: e */
    private float f115370e;

    /* renamed from: f */
    private float f115371f;

    /* renamed from: g */
    private int f115372g;

    /* renamed from: h */
    private Paint f115373h;

    static {
        Covode.recordClassIndex(59127);
    }

    public void setStrokeWidth(int i) {
        this.f115367b = (float) i;
    }

    public LiveCircleView(Context context) {
        this(context, null);
    }

    public void setFraction(float f) {
        this.f115371f = this.f115370e + (((float) this.f115372g) * f);
        this.f115373h.setStrokeWidth(this.f115367b * (1.0f - f));
        postInvalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        MethodCollector.m26663i(1626);
        super.onDraw(canvas);
        canvas.drawCircle((float) this.f115368c, (float) this.f115369d, this.f115370e, this.f115366a);
        canvas.drawCircle((float) this.f115368c, (float) this.f115369d, this.f115371f, this.f115373h);
        MethodCollector.m26664o(1626);
    }

    public LiveCircleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        MethodCollector.m26663i(1615);
        super.onMeasure(i, i2);
        this.f115368c = getMeasuredWidth() / 2;
        this.f115369d = getMeasuredHeight() / 2;
        float measuredHeight = (float) ((getMeasuredHeight() / 2) - getPaddingBottom());
        this.f115370e = measuredHeight;
        this.f115371f = measuredHeight;
        this.f115372g = getPaddingBottom();
        MethodCollector.m26664o(1615);
    }

    private LiveCircleView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(1530);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a3f});
        this.f115367b = (float) ((int) obtainStyledAttributes.getDimension(0, C13628n.m24520b(context, 1.5f)));
        obtainStyledAttributes.recycle();
        this.f115366a = new Paint();
        this.f115366a.setShader(new LinearGradient(0.0f, 0.0f, 100.0f, 100.0f, Color.parseColor("#FF1764"), Color.parseColor("#ED3495"), Shader.TileMode.MIRROR));
        this.f115366a.setAntiAlias(true);
        this.f115366a.setDither(true);
        this.f115366a.setStyle(Paint.Style.STROKE);
        this.f115366a.setStrokeWidth(C13628n.m24520b(context, 1.0f));
        this.f115373h = new Paint(this.f115366a);
        MethodCollector.m26664o(1530);
    }
}
