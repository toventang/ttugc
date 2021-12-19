package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b */
public abstract class AbstractC72299b extends FrameLayout {

    /* renamed from: a */
    final RectF f162085a = new RectF();

    /* renamed from: b */
    final Path f162086b = new Path();

    /* renamed from: c */
    final RectF f162087c = new RectF();

    /* renamed from: d */
    boolean f162088d = false;

    /* renamed from: e */
    boolean f162089e = false;

    /* renamed from: f */
    boolean f162090f = false;

    /* renamed from: g */
    Rect f162091g;

    /* renamed from: h */
    Rect f162092h;

    /* renamed from: i */
    float f162093i;

    /* renamed from: j */
    final Rect f162094j = new Rect();

    /* renamed from: k */
    final C72321h f162095k = new C72321h(new Rect());

    /* renamed from: l */
    final C72321h f162096l = new C72321h(new Rect());

    static {
        Covode.recordClassIndex(84966);
    }

    public AbstractC72299b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public boolean mo114511a(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public AbstractC72299b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean a;
        if (this.f162090f) {
            canvas.save();
            canvas.clipRect(this.f162087c);
            if (this.f162089e) {
                canvas.save();
                canvas.clipPath(this.f162086b);
                a = mo114511a(canvas, view, j);
                canvas.restore();
            } else if (this.f162088d) {
                canvas.save();
                canvas.clipRect(this.f162085a);
                a = mo114511a(canvas, view, j);
                canvas.restore();
            } else {
                a = mo114511a(canvas, view, j);
            }
            canvas.restore();
            return a;
        } else if (this.f162089e) {
            canvas.save();
            canvas.clipPath(this.f162086b);
            boolean a2 = mo114511a(canvas, view, j);
            canvas.restore();
            return a2;
        } else if (!this.f162088d) {
            return mo114511a(canvas, view, j);
        } else {
            canvas.save();
            canvas.clipRect(this.f162085a);
            boolean a3 = mo114511a(canvas, view, j);
            canvas.restore();
            return a3;
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f162094j.set(0, 0, getWidth(), getHeight());
    }

    /* renamed from: a */
    public final Animator mo114567a(Rect rect, Rect rect2, float f, final boolean z) {
        this.f162091g = new Rect(rect);
        this.f162092h = new Rect(rect2);
        this.f162093i = f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.AbstractC72299b.C723001 */

            static {
                Covode.recordClassIndex(84967);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                AbstractC72299b bVar = AbstractC72299b.this;
                if (z) {
                    floatValue = 1.0f - floatValue;
                }
                if (bVar.f162091g != null && bVar.f162092h != null && !bVar.f162094j.isEmpty()) {
                    Rect a = bVar.f162095k.evaluate(floatValue, bVar.f162091g, bVar.f162094j);
                    Rect a2 = bVar.f162096l.evaluate(floatValue, bVar.f162092h, bVar.f162094j);
                    float f = bVar.f162093i * (1.0f - floatValue);
                    if (!a.equals(bVar.f162094j) || !a2.equals(bVar.f162094j) || f != 0.0f) {
                        bVar.f162085a.set(a);
                        int i = Build.VERSION.SDK_INT;
                        if (f > 0.0f) {
                            bVar.f162086b.rewind();
                            bVar.f162086b.addRoundRect(bVar.f162085a, f, f, Path.Direction.CCW);
                            bVar.f162089e = true;
                        } else {
                            bVar.f162088d = true;
                        }
                        bVar.f162087c.set(a2);
                        bVar.f162090f = !bVar.f162087c.equals(bVar.f162085a);
                        bVar.invalidate();
                        return;
                    }
                    bVar.f162088d = false;
                    bVar.f162089e = false;
                    bVar.f162090f = false;
                }
            }
        });
        return ofFloat;
    }
}
