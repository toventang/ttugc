package com.p2082ss.android.ugc.aweme.aabplugin.core.base.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sysoptimizer.java.ResourcesProtector;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.aabplugin.core.base.view.DFCircularProgressView */
public class DFCircularProgressView extends View {

    /* renamed from: a */
    public boolean f75097a;

    /* renamed from: b */
    public float f75098b;

    /* renamed from: c */
    public float f75099c;

    /* renamed from: d */
    public float f75100d;

    /* renamed from: e */
    private Paint f75101e;

    /* renamed from: f */
    private int f75102f;

    /* renamed from: g */
    private RectF f75103g;

    /* renamed from: h */
    private boolean f75104h;

    /* renamed from: i */
    private float f75105i;

    /* renamed from: j */
    private float f75106j;

    /* renamed from: k */
    private int f75107k;

    /* renamed from: l */
    private int f75108l;

    /* renamed from: m */
    private int f75109m;

    /* renamed from: n */
    private int f75110n;

    /* renamed from: o */
    private int f75111o;

    /* renamed from: p */
    private int f75112p;

    /* renamed from: q */
    private ValueAnimator f75113q;

    /* renamed from: r */
    private ValueAnimator f75114r;

    /* renamed from: s */
    private AnimatorSet f75115s;

    /* renamed from: t */
    private float f75116t;

    static {
        Covode.recordClassIndex(38049);
    }

    public int getColor() {
        return this.f75108l;
    }

    public float getMaxProgress() {
        return this.f75106j;
    }

    public float getProgress() {
        return this.f75105i;
    }

    public int getThickness() {
        return this.f75107k;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m65565d();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f75104h) {
            mo57353a();
        }
    }

    /* renamed from: b */
    private void m65563b() {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        RectF rectF = this.f75103g;
        int i = this.f75107k;
        int i2 = this.f75102f;
        rectF.set((float) (paddingLeft + i), (float) (paddingTop + i), (float) ((i2 - paddingLeft) - i), (float) ((i2 - paddingTop) - i));
    }

    /* renamed from: c */
    private void m65564c() {
        this.f75101e.setColor(this.f75108l);
        this.f75101e.setStyle(Paint.Style.STROKE);
        this.f75101e.setStrokeWidth((float) this.f75107k);
        this.f75101e.setStrokeCap(Paint.Cap.ROUND);
    }

    /* renamed from: d */
    private void m65565d() {
        ValueAnimator valueAnimator = this.f75113q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f75113q = null;
        }
        ValueAnimator valueAnimator2 = this.f75114r;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.f75114r = null;
        }
        AnimatorSet animatorSet = this.f75115s;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f75115s = null;
        }
    }

    /* renamed from: a */
    public final void mo57353a() {
        ValueAnimator valueAnimator = this.f75113q;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f75113q.cancel();
        }
        ValueAnimator valueAnimator2 = this.f75114r;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.f75114r.cancel();
        }
        AnimatorSet animatorSet = this.f75115s;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f75115s.cancel();
        }
        int i = 0;
        if (!this.f75097a) {
            float f = this.f75116t;
            this.f75100d = f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f + 360.0f);
            this.f75113q = ofFloat;
            ofFloat.setDuration((long) this.f75110n);
            this.f75113q.setInterpolator(new DecelerateInterpolator(2.0f));
            this.f75113q.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.p2082ss.android.ugc.aweme.aabplugin.core.base.view.DFCircularProgressView.C313491 */

                static {
                    Covode.recordClassIndex(38050);
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    DFCircularProgressView.this.f75100d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    DFCircularProgressView.this.invalidate();
                }
            });
            this.f75113q.start();
            return;
        }
        this.f75098b = 15.0f;
        this.f75115s = new AnimatorSet();
        AnimatorSet animatorSet2 = null;
        while (i < this.f75112p) {
            AnimatorSet a = m65562a((float) i);
            AnimatorSet.Builder play = this.f75115s.play(a);
            if (animatorSet2 != null) {
                play.after(animatorSet2);
            }
            i++;
            animatorSet2 = a;
        }
        this.f75115s.addListener(new AnimatorListenerAdapter() {
            /* class com.p2082ss.android.ugc.aweme.aabplugin.core.base.view.DFCircularProgressView.C313502 */

            /* renamed from: a */
            boolean f75118a;

            static {
                Covode.recordClassIndex(38051);
            }

            public final void onAnimationCancel(Animator animator) {
                this.f75118a = true;
            }

            public final void onAnimationEnd(Animator animator) {
                if (!this.f75118a) {
                    DFCircularProgressView.this.mo57353a();
                }
            }
        });
        this.f75115s.start();
    }

    public void setMaxProgress(float f) {
        this.f75106j = f;
        invalidate();
    }

    public void setProgress(float f) {
        this.f75105i = f;
        invalidate();
    }

    public void setColor(int i) {
        this.f75108l = i;
        m65564c();
        invalidate();
    }

    public void setIndeterminate(boolean z) {
        if (this.f75097a != z) {
            this.f75097a = z;
            mo57353a();
        }
    }

    public void setThickness(int i) {
        this.f75107k = i;
        m65564c();
        m65563b();
        invalidate();
    }

    public void setVisibility(int i) {
        int visibility = getVisibility();
        super.setVisibility(i);
        if (i == visibility) {
            return;
        }
        if (i == 0) {
            mo57353a();
        } else if (i == 8 || i == 4) {
            m65565d();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        MethodCollector.m26663i(7645);
        super.onDraw(canvas);
        isInEditMode();
        float f = (this.f75105i / this.f75106j) * 360.0f;
        if (!this.f75097a) {
            canvas.drawArc(this.f75103g, this.f75100d, f, false, this.f75101e);
            MethodCollector.m26664o(7645);
            return;
        }
        canvas.drawArc(this.f75103g, this.f75100d + this.f75099c, this.f75098b, false, this.f75101e);
        MethodCollector.m26664o(7645);
    }

    /* renamed from: a */
    private AnimatorSet m65562a(float f) {
        int i = this.f75112p;
        final float f2 = ((((float) (i - 1)) * 360.0f) / ((float) i)) + 15.0f;
        final float f3 = ((f2 - 15.0f) * f) - 0.049804688f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(15.0f, f2);
        ofFloat.setDuration((long) ((this.f75109m / this.f75112p) / 2));
        ofFloat.setInterpolator(new DecelerateInterpolator(1.0f));
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.p2082ss.android.ugc.aweme.aabplugin.core.base.view.DFCircularProgressView.C313513 */

            static {
                Covode.recordClassIndex(38052);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                DFCircularProgressView.this.f75098b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                DFCircularProgressView.this.invalidate();
            }
        });
        int i2 = this.f75112p;
        float f4 = (0.5f + f) * 720.0f;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat((f * 720.0f) / ((float) i2), f4 / ((float) i2));
        ofFloat2.setDuration((long) ((this.f75109m / this.f75112p) / 2));
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.p2082ss.android.ugc.aweme.aabplugin.core.base.view.DFCircularProgressView.C313524 */

            static {
                Covode.recordClassIndex(38053);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                DFCircularProgressView.this.f75099c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            }
        });
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(f3, (f3 + f2) - 15.0f);
        ofFloat3.setDuration((long) ((this.f75109m / this.f75112p) / 2));
        ofFloat3.setInterpolator(new DecelerateInterpolator(1.0f));
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.p2082ss.android.ugc.aweme.aabplugin.core.base.view.DFCircularProgressView.C313535 */

            static {
                Covode.recordClassIndex(38054);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                DFCircularProgressView.this.f75100d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                DFCircularProgressView dFCircularProgressView = DFCircularProgressView.this;
                dFCircularProgressView.f75098b = (f2 - dFCircularProgressView.f75100d) + f3;
                DFCircularProgressView.this.invalidate();
            }
        });
        int i3 = this.f75112p;
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f4 / ((float) i3), ((f + 1.0f) * 720.0f) / ((float) i3));
        ofFloat4.setDuration((long) ((this.f75109m / this.f75112p) / 2));
        ofFloat4.setInterpolator(new LinearInterpolator());
        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.p2082ss.android.ugc.aweme.aabplugin.core.base.view.DFCircularProgressView.C313546 */

            static {
                Covode.recordClassIndex(38055);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                DFCircularProgressView.this.f75099c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.play(ofFloat3).with(ofFloat4).after(ofFloat2);
        return animatorSet;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        MethodCollector.m26663i(7643);
        super.onMeasure(i, i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int measuredWidth = getMeasuredWidth() - paddingLeft;
        int measuredHeight = getMeasuredHeight() - paddingTop;
        if (measuredWidth >= measuredHeight) {
            measuredWidth = measuredHeight;
        }
        this.f75102f = measuredWidth;
        setMeasuredDimension(paddingLeft + measuredWidth, measuredWidth + paddingTop);
        MethodCollector.m26664o(7643);
    }

    /* renamed from: a */
    private static int m65561a(Resources resources, int i) {
        ResourcesProtector.Config matchConfig = ResourcesProtector.getMatchConfig(i);
        if (matchConfig == null) {
            return resources.getInteger(i);
        }
        try {
            if (!matchConfig.mockCrash) {
                return resources.getInteger(i);
            }
            throw new Resources.NotFoundException("unknown resource from mocked");
        } catch (Throwable th) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int min = Math.min(stackTrace.length, matchConfig.mMaxStep);
            for (int i2 = 0; i2 < min; i2++) {
                StackTraceElement stackTraceElement = stackTrace[i2];
                if (stackTraceElement != null) {
                    if (matchConfig.mProtectClassName.equals(stackTraceElement.getClassName())) {
                        if (matchConfig.mProtectMethodName.equals(stackTraceElement.getMethodName())) {
                            return matchConfig.mReturnIdWhenException;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return resources.getInteger(i);
        }
    }

    public DFCircularProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(7641);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.q_, R.attr.qa, R.attr.qb, R.attr.qc, R.attr.qd, R.attr.qe, R.attr.qf, R.attr.qg, R.attr.qh, R.attr.qi, R.attr.qj}, 0, 0);
        Resources resources = getResources();
        this.f75105i = obtainStyledAttributes.getFloat(8, (float) m65561a(resources, R.integer.b1));
        this.f75106j = obtainStyledAttributes.getFloat(7, (float) m65561a(resources, R.integer.b0));
        this.f75107k = obtainStyledAttributes.getDimensionPixelSize(10, resources.getDimensionPixelSize(R.dimen.go));
        this.f75097a = obtainStyledAttributes.getBoolean(6, resources.getBoolean(R.bool.h));
        this.f75104h = obtainStyledAttributes.getBoolean(0, resources.getBoolean(R.bool.g));
        float f = obtainStyledAttributes.getFloat(9, (float) m65561a(resources, R.integer.b2));
        this.f75116t = f;
        this.f75100d = f;
        int identifier = getContext().getResources().getIdentifier("colorAccent", "attr", getContext().getPackageName());
        if (obtainStyledAttributes.hasValue(5)) {
            this.f75108l = obtainStyledAttributes.getColor(5, resources.getColor(R.color.gu));
        } else if (identifier != 0) {
            TypedValue typedValue = new TypedValue();
            getContext().getTheme().resolveAttribute(identifier, typedValue, true);
            this.f75108l = typedValue.data;
        } else if (Build.VERSION.SDK_INT >= 21) {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(new int[]{16843829});
            this.f75108l = obtainStyledAttributes2.getColor(0, resources.getColor(R.color.gu));
            obtainStyledAttributes2.recycle();
        } else {
            this.f75108l = resources.getColor(R.color.gu);
        }
        this.f75109m = obtainStyledAttributes.getInteger(1, m65561a(resources, R.integer.aw));
        this.f75110n = obtainStyledAttributes.getInteger(3, m65561a(resources, R.integer.ay));
        this.f75111o = obtainStyledAttributes.getInteger(4, m65561a(resources, R.integer.az));
        this.f75112p = obtainStyledAttributes.getInteger(2, m65561a(resources, R.integer.ax));
        obtainStyledAttributes.recycle();
        this.f75101e = new Paint(1);
        m65564c();
        this.f75103g = new RectF();
        MethodCollector.m26664o(7641);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i >= i2) {
            i = i2;
        }
        this.f75102f = i;
        m65563b();
    }
}
