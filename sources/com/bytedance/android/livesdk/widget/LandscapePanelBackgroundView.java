package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class LandscapePanelBackgroundView extends View {

    /* renamed from: a */
    private final Paint f27186a;

    /* renamed from: b */
    private final int[] f27187b;

    /* renamed from: c */
    private final float[] f27188c;

    static {
        Covode.recordClassIndex(12997);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public float[] mo14651b() {
        return new float[]{0.0f, 0.13f, 0.22f, 0.31f, 0.55f};
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int[] mo14650a() {
        return new int[]{Color.parseColor("#00000000"), Color.parseColor("#80000000"), Color.parseColor("#b3000000"), Color.parseColor("#cc000000"), Color.parseColor("#e6000000")};
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        MethodCollector.m26663i(10773);
        super.onDraw(canvas);
        this.f27186a.setShader(new LinearGradient(0.0f, 0.0f, (float) getMeasuredWidth(), 0.0f, this.f27187b, this.f27188c, Shader.TileMode.CLAMP));
        canvas.drawPaint(this.f27186a);
        MethodCollector.m26664o(10773);
    }

    public LandscapePanelBackgroundView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LandscapePanelBackgroundView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(10467);
        Paint paint = new Paint();
        this.f27186a = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.f27187b = mo14650a();
        this.f27188c = mo14651b();
        MethodCollector.m26664o(10467);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        MethodCollector.m26663i(10770);
        super.onLayout(z, i, i2, i3, i4);
        MethodCollector.m26664o(10770);
    }
}
