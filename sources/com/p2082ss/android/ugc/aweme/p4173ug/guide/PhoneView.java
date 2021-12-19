package com.p2082ss.android.ugc.aweme.p4173ug.guide;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.ugc.aweme.ug.guide.PhoneView */
public class PhoneView extends View {

    /* renamed from: a */
    Paint f178687a;

    /* renamed from: b */
    int f178688b;

    /* renamed from: c */
    int f178689c;

    /* renamed from: d */
    int f178690d;

    /* renamed from: e */
    Path f178691e;

    /* renamed from: f */
    float f178692f;

    /* renamed from: g */
    float f178693g;

    /* renamed from: h */
    float f178694h;

    /* renamed from: i */
    float f178695i;

    /* renamed from: j */
    RectF f178696j;

    static {
        Covode.recordClassIndex(92851);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        MethodCollector.m26663i(5277);
        super.onDraw(canvas);
        this.f178687a.setColor(this.f178690d);
        this.f178696j.set(0.0f, 0.0f, this.f178692f, this.f178693g);
        RectF rectF = this.f178696j;
        float f = this.f178695i;
        canvas.drawRoundRect(rectF, f, f, this.f178687a);
        this.f178687a.setColor(this.f178688b);
        RectF rectF2 = this.f178696j;
        float f2 = this.f178694h;
        rectF2.set(f2 * 4.0f, 14.0f * f2, this.f178692f - (4.0f * f2), this.f178693g - (f2 * 20.0f));
        RectF rectF3 = this.f178696j;
        float f3 = this.f178695i;
        canvas.drawRoundRect(rectF3, f3, f3, this.f178687a);
        this.f178687a.setColor(this.f178689c);
        float f4 = this.f178694h;
        float f5 = 27.0f * f4;
        float f6 = 9.0f * f4;
        RectF rectF4 = this.f178696j;
        float f7 = this.f178692f;
        float f8 = this.f178693g;
        rectF4.set((f7 - f5) / 2.0f, f8 - (((f4 * 20.0f) + f6) / 2.0f), (f7 + f5) / 2.0f, f8 - (((f4 * 20.0f) - f6) / 2.0f));
        float f9 = f6 / 2.0f;
        canvas.drawRoundRect(this.f178696j, f9, f9, this.f178687a);
        MethodCollector.m26664o(5277);
    }

    public PhoneView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private PhoneView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(5218);
        this.f178687a = new Paint();
        this.f178690d = Color.argb(191, 255, 255, 255);
        this.f178688b = Color.argb(51, 0, 0, 0);
        this.f178689c = Color.argb(38, 0, 0, 0);
        this.f178691e = new Path();
        float applyDimension = TypedValue.applyDimension(1, 1.0f, context.getResources().getDisplayMetrics());
        this.f178694h = applyDimension;
        this.f178695i = applyDimension * 3.0f;
        this.f178696j = new RectF();
        MethodCollector.m26664o(5218);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f178692f = (float) i;
        this.f178693g = (float) i2;
    }
}
