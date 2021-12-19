package com.p2082ss.android.ugc.aweme.notification.view;

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

/* renamed from: com.ss.android.ugc.aweme.notification.view.LiveCircleView */
public class LiveCircleView extends View {

    /* renamed from: a */
    private Paint f141355a;

    /* renamed from: b */
    private float f141356b;

    /* renamed from: c */
    private Context f141357c;

    /* renamed from: d */
    private int f141358d;

    /* renamed from: e */
    private int f141359e;

    /* renamed from: f */
    private float f141360f;

    /* renamed from: g */
    private float f141361g;

    /* renamed from: h */
    private int f141362h;

    /* renamed from: i */
    private Paint f141363i;

    static {
        Covode.recordClassIndex(73059);
    }

    public void setStrokeWidth(int i) {
        this.f141356b = (float) i;
    }

    public void setFraction(float f) {
        this.f141361g = this.f141360f + (((float) this.f141362h) * f);
        this.f141363i.setStrokeWidth(this.f141356b * (1.0f - f));
        postInvalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        MethodCollector.m26663i(2305);
        super.onDraw(canvas);
        canvas.drawCircle((float) this.f141358d, (float) this.f141359e, this.f141360f, this.f141355a);
        canvas.drawCircle((float) this.f141358d, (float) this.f141359e, this.f141361g, this.f141363i);
        MethodCollector.m26664o(2305);
    }

    public LiveCircleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        MethodCollector.m26663i(2303);
        super.onMeasure(i, i2);
        this.f141358d = getMeasuredWidth() / 2;
        this.f141359e = getMeasuredHeight() / 2;
        float measuredHeight = (float) ((getMeasuredHeight() / 2) - getPaddingBottom());
        this.f141360f = measuredHeight;
        this.f141361g = measuredHeight;
        this.f141362h = getPaddingBottom();
        MethodCollector.m26664o(2303);
    }

    private LiveCircleView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(2300);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a3f});
        this.f141356b = (float) ((int) obtainStyledAttributes.getDimension(0, C13628n.m24520b(context, 1.5f)));
        obtainStyledAttributes.recycle();
        this.f141357c = context;
        this.f141355a = new Paint();
        this.f141355a.setShader(new LinearGradient(0.0f, 0.0f, 100.0f, 100.0f, Color.parseColor("#FF1764"), Color.parseColor("#ED3495"), Shader.TileMode.MIRROR));
        this.f141355a.setAntiAlias(true);
        this.f141355a.setDither(true);
        this.f141355a.setStyle(Paint.Style.STROKE);
        this.f141355a.setStrokeWidth(C13628n.m24520b(context, 1.0f));
        this.f141363i = new Paint(this.f141355a);
        MethodCollector.m26664o(2300);
    }
}
