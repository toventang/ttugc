package com.p2082ss.android.ugc.aweme.p4173ug.guide;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.ugc.aweme.ug.guide.PlayView */
public class PlayView extends View {

    /* renamed from: a */
    Paint f178697a;

    /* renamed from: b */
    int f178698b;

    /* renamed from: c */
    int f178699c;

    /* renamed from: d */
    Path f178700d;

    /* renamed from: e */
    float f178701e;

    /* renamed from: f */
    float f178702f;

    /* renamed from: g */
    float f178703g;

    /* renamed from: h */
    float f178704h;

    /* renamed from: i */
    float f178705i;

    /* renamed from: j */
    float f178706j;

    /* renamed from: k */
    float f178707k;

    /* renamed from: l */
    float f178708l;

    /* renamed from: m */
    ValueAnimator f178709m;

    /* renamed from: n */
    float f178710n;

    static {
        Covode.recordClassIndex(92852);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        MethodCollector.m26663i(5476);
        super.onDraw(canvas);
        this.f178697a.setColor(this.f178698b);
        canvas.translate(this.f178706j, 0.0f);
        m138451a(canvas);
        canvas.translate(0.0f, this.f178702f);
        m138451a(canvas);
        canvas.translate(-this.f178706j, -this.f178702f);
        this.f178697a.setColor(this.f178699c);
        this.f178697a.setStrokeWidth(this.f178707k);
        float f = this.f178710n;
        float f2 = this.f178702f;
        if (f > (-f2)) {
            float f3 = this.f178708l;
            if (f > (-f2) + f3) {
                canvas.drawLine(0.0f, f2 + f, this.f178701e, f2 + f, this.f178697a);
                MethodCollector.m26664o(5476);
                return;
            }
            canvas.drawLine(f3, f2 + f, this.f178701e - f3, f2 + f, this.f178697a);
        }
        MethodCollector.m26664o(5476);
    }

    /* renamed from: a */
    private void m138451a(Canvas canvas) {
        this.f178700d.reset();
        Path path = this.f178700d;
        float f = this.f178704h;
        path.moveTo((this.f178701e / 2.0f) - ((this.f178705i * f) / 2.0f), (((this.f178702f / 2.0f) + f) - this.f178703g) + this.f178710n);
        Path path2 = this.f178700d;
        float f2 = this.f178701e;
        float f3 = this.f178704h;
        float f4 = this.f178705i;
        float f5 = this.f178702f;
        float f6 = this.f178710n;
        float f7 = this.f178703g;
        path2.quadTo((f2 / 2.0f) - ((f3 * f4) / 2.0f), (f5 / 2.0f) + f3 + f6, ((f2 / 2.0f) - ((f3 * f4) / 2.0f)) + (f4 * f7), (((f5 / 2.0f) + f3) - f7) + f6);
        Path path3 = this.f178700d;
        float f8 = this.f178704h;
        float f9 = this.f178705i;
        float f10 = (this.f178701e / 2.0f) + ((f8 * f9) / 2.0f);
        float f11 = this.f178703g;
        path3.lineTo(f10 - ((f9 * f11) / 2.0f), (this.f178702f / 2.0f) + (f11 / 2.0f) + this.f178710n);
        Path path4 = this.f178700d;
        float f12 = this.f178701e;
        float f13 = this.f178704h;
        float f14 = this.f178705i;
        float f15 = this.f178702f;
        float f16 = this.f178710n;
        float f17 = this.f178703g;
        path4.quadTo((f12 / 2.0f) + ((f13 * f14) / 2.0f), (f15 / 2.0f) + f16, ((f12 / 2.0f) + ((f13 * f14) / 2.0f)) - ((f14 * f17) / 2.0f), ((f15 / 2.0f) - (f17 / 2.0f)) + f16);
        Path path5 = this.f178700d;
        float f18 = this.f178704h;
        float f19 = this.f178705i;
        float f20 = (this.f178701e / 2.0f) - ((f18 * f19) / 2.0f);
        float f21 = this.f178703g;
        path5.lineTo(f20 + (f19 * f21), ((this.f178702f / 2.0f) - f18) + f21 + this.f178710n);
        Path path6 = this.f178700d;
        float f22 = this.f178701e;
        float f23 = this.f178704h;
        float f24 = this.f178705i;
        float f25 = this.f178702f;
        float f26 = this.f178710n;
        path6.quadTo((f22 / 2.0f) - ((f23 * f24) / 2.0f), ((f25 / 2.0f) - f23) + f26, (f22 / 2.0f) - ((f24 * f23) / 2.0f), ((f25 / 2.0f) - f23) + this.f178703g + f26);
        canvas.drawPath(this.f178700d, this.f178697a);
    }

    public PlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: a */
    private static int m138450a(Context context, float f) {
        return (int) TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    private PlayView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(5359);
        this.f178705i = 1.5f;
        this.f178697a = new Paint();
        this.f178698b = Color.argb(191, 255, 255, 255);
        this.f178699c = Color.argb(30, 100, 100, 100);
        this.f178700d = new Path();
        this.f178707k = (float) m138450a(context, 1.0f);
        this.f178704h = (float) m138450a(context, 25.0f);
        float f = this.f178707k;
        this.f178708l = 3.0f * f;
        this.f178703g = 10.0f * f;
        this.f178706j = f * 8.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f178709m = ofFloat;
        ofFloat.setDuration(1000L);
        this.f178709m.setInterpolator(new DecelerateInterpolator(1.5f));
        this.f178709m.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.p2082ss.android.ugc.aweme.p4173ug.guide.PlayView.C796381 */

            static {
                Covode.recordClassIndex(92853);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                PlayView playView = PlayView.this;
                playView.f178710n = (-playView.f178702f) * floatValue;
                PlayView.this.invalidate();
            }
        });
        MethodCollector.m26664o(5359);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f178701e = (float) i;
        this.f178702f = (float) i2;
    }
}
