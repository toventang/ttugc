package com.p2082ss.android.ugc.tools.view.widget;

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

/* renamed from: com.ss.android.ugc.tools.view.widget.CircularProgressView */
public class CircularProgressView extends View {

    /* renamed from: a */
    public boolean f190088a;

    /* renamed from: b */
    public float f190089b;

    /* renamed from: c */
    public float f190090c;

    /* renamed from: d */
    public float f190091d;

    /* renamed from: e */
    public float f190092e;

    /* renamed from: f */
    private Paint f190093f;

    /* renamed from: g */
    private int f190094g;

    /* renamed from: h */
    private RectF f190095h;

    /* renamed from: i */
    private boolean f190096i;

    /* renamed from: j */
    private boolean f190097j;

    /* renamed from: k */
    private boolean f190098k;

    /* renamed from: l */
    private float f190099l;

    /* renamed from: m */
    private int f190100m;

    /* renamed from: n */
    private int f190101n;

    /* renamed from: o */
    private int f190102o;

    /* renamed from: p */
    private int f190103p;

    /* renamed from: q */
    private int f190104q;

    /* renamed from: r */
    private int f190105r;

    /* renamed from: s */
    private ValueAnimator f190106s;

    /* renamed from: t */
    private ValueAnimator f190107t;

    /* renamed from: u */
    private AnimatorSet f190108u;

    /* renamed from: v */
    private float f190109v;

    static {
        Covode.recordClassIndex(99009);
    }

    public int getColor() {
        return this.f190101n;
    }

    public float getMaxProgress() {
        return this.f190099l;
    }

    public float getProgress() {
        return this.f190089b;
    }

    public int getThickness() {
        return this.f190100m;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f190098k = false;
        mo129887b();
    }

    /* renamed from: c */
    private void m146087c() {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        RectF rectF = this.f190095h;
        int i = this.f190100m;
        int i2 = this.f190094g;
        rectF.set((float) (paddingLeft + i), (float) (paddingTop + i), (float) ((i2 - paddingLeft) - i), (float) ((i2 - paddingTop) - i));
    }

    /* renamed from: d */
    private void m146088d() {
        this.f190093f.setColor(this.f190101n);
        this.f190093f.setStyle(Paint.Style.STROKE);
        this.f190093f.setStrokeWidth((float) this.f190100m);
        this.f190093f.setStrokeCap(Paint.Cap.ROUND);
    }

    /* renamed from: b */
    public final void mo129887b() {
        this.f190097j = false;
        ValueAnimator valueAnimator = this.f190106s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f190106s = null;
        }
        ValueAnimator valueAnimator2 = this.f190107t;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.f190107t = null;
        }
        AnimatorSet animatorSet = this.f190108u;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f190108u = null;
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f190098k = true;
        if (this.f190096i || this.f190097j) {
            mo129886a();
        }
    }

    /* renamed from: a */
    public final void mo129886a() {
        if (!this.f190098k) {
            this.f190097j = true;
            return;
        }
        int i = 0;
        this.f190097j = false;
        ValueAnimator valueAnimator = this.f190106s;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f190106s.cancel();
        }
        ValueAnimator valueAnimator2 = this.f190107t;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.f190107t.cancel();
        }
        AnimatorSet animatorSet = this.f190108u;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f190108u.cancel();
        }
        if (!this.f190088a) {
            float f = this.f190109v;
            this.f190092e = f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f + 360.0f);
            this.f190106s = ofFloat;
            ofFloat.setDuration((long) this.f190103p);
            this.f190106s.setInterpolator(new DecelerateInterpolator(2.0f));
            this.f190106s.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.p2082ss.android.ugc.tools.view.widget.CircularProgressView.C849941 */

                static {
                    Covode.recordClassIndex(99010);
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (CircularProgressView.this.f190089b != 0.0f) {
                        CircularProgressView.this.f190092e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CircularProgressView.this.invalidate();
                    }
                }
            });
            this.f190106s.start();
            return;
        }
        this.f190090c = 15.0f;
        this.f190108u = new AnimatorSet();
        AnimatorSet animatorSet2 = null;
        while (i < this.f190105r) {
            AnimatorSet a = m146086a((float) i);
            AnimatorSet.Builder play = this.f190108u.play(a);
            if (animatorSet2 != null) {
                play.after(animatorSet2);
            }
            i++;
            animatorSet2 = a;
        }
        this.f190108u.addListener(new AnimatorListenerAdapter() {
            /* class com.p2082ss.android.ugc.tools.view.widget.CircularProgressView.C849952 */

            /* renamed from: a */
            boolean f190111a;

            static {
                Covode.recordClassIndex(99011);
            }

            public final void onAnimationCancel(Animator animator) {
                this.f190111a = true;
            }

            public final void onAnimationEnd(Animator animator) {
                if (!this.f190111a) {
                    CircularProgressView.this.mo129886a();
                }
            }
        });
        this.f190108u.start();
    }

    public void setMaxProgress(float f) {
        this.f190099l = f;
        invalidate();
    }

    public void setColor(int i) {
        this.f190101n = i;
        m146088d();
        invalidate();
    }

    public void setIndeterminate(boolean z) {
        if (this.f190088a != z) {
            this.f190088a = z;
            mo129886a();
        }
    }

    public void setProgress(float f) {
        if (this.f190089b != f) {
            this.f190089b = f;
            invalidate();
        }
    }

    public void setThickness(int i) {
        this.f190100m = i;
        m146088d();
        m146087c();
        invalidate();
    }

    public void setVisibility(int i) {
        int visibility = getVisibility();
        super.setVisibility(i);
        if (i == visibility) {
            return;
        }
        if (i == 0) {
            mo129886a();
        } else if (i == 8 || i == 4) {
            mo129887b();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        MethodCollector.m26663i(11205);
        super.onDraw(canvas);
        isInEditMode();
        float f = (this.f190089b / this.f190099l) * 360.0f;
        if (!this.f190088a) {
            canvas.drawArc(this.f190095h, this.f190092e, f, false, this.f190093f);
            MethodCollector.m26664o(11205);
            return;
        }
        canvas.drawArc(this.f190095h, this.f190092e + this.f190091d, this.f190090c, false, this.f190093f);
        MethodCollector.m26664o(11205);
    }

    /* renamed from: a */
    private AnimatorSet m146086a(float f) {
        int i = this.f190105r;
        final float f2 = ((((float) (i - 1)) * 360.0f) / ((float) i)) + 15.0f;
        final float f3 = ((f2 - 15.0f) * f) - 0.049804688f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(15.0f, f2);
        ofFloat.setDuration((long) ((this.f190102o / this.f190105r) / 2));
        ofFloat.setInterpolator(new DecelerateInterpolator(1.0f));
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.p2082ss.android.ugc.tools.view.widget.CircularProgressView.C849963 */

            static {
                Covode.recordClassIndex(99012);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CircularProgressView.this.f190090c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CircularProgressView.this.invalidate();
            }
        });
        int i2 = this.f190105r;
        float f4 = (0.5f + f) * 720.0f;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat((f * 720.0f) / ((float) i2), f4 / ((float) i2));
        ofFloat2.setDuration((long) ((this.f190102o / this.f190105r) / 2));
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.p2082ss.android.ugc.tools.view.widget.CircularProgressView.C849974 */

            static {
                Covode.recordClassIndex(99013);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CircularProgressView.this.f190091d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            }
        });
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(f3, (f3 + f2) - 15.0f);
        ofFloat3.setDuration((long) ((this.f190102o / this.f190105r) / 2));
        ofFloat3.setInterpolator(new DecelerateInterpolator(1.0f));
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.p2082ss.android.ugc.tools.view.widget.CircularProgressView.C849985 */

            static {
                Covode.recordClassIndex(99014);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CircularProgressView.this.f190092e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CircularProgressView circularProgressView = CircularProgressView.this;
                circularProgressView.f190090c = (f2 - circularProgressView.f190092e) + f3;
                CircularProgressView.this.invalidate();
            }
        });
        int i3 = this.f190105r;
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f4 / ((float) i3), ((f + 1.0f) * 720.0f) / ((float) i3));
        ofFloat4.setDuration((long) ((this.f190102o / this.f190105r) / 2));
        ofFloat4.setInterpolator(new LinearInterpolator());
        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.p2082ss.android.ugc.tools.view.widget.CircularProgressView.C849996 */

            static {
                Covode.recordClassIndex(99015);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CircularProgressView.this.f190091d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.play(ofFloat3).with(ofFloat4).after(ofFloat2);
        return animatorSet;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        MethodCollector.m26663i(11055);
        super.onMeasure(i, i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int measuredWidth = getMeasuredWidth() - paddingLeft;
        int measuredHeight = getMeasuredHeight() - paddingTop;
        if (measuredWidth >= measuredHeight) {
            measuredWidth = measuredHeight;
        }
        this.f190094g = measuredWidth;
        setMeasuredDimension(paddingLeft + measuredWidth, measuredWidth + paddingTop);
        MethodCollector.m26664o(11055);
    }

    /* renamed from: a */
    private static int m146085a(Resources resources, int i) {
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

    public CircularProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(11051);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.q_, R.attr.qa, R.attr.qb, R.attr.qc, R.attr.qd, R.attr.qe, R.attr.qf, R.attr.qg, R.attr.qh, R.attr.qi, R.attr.qj}, 0, 0);
        Resources resources = getResources();
        this.f190089b = obtainStyledAttributes.getFloat(8, (float) m146085a(resources, R.integer.b1));
        this.f190099l = obtainStyledAttributes.getFloat(7, (float) m146085a(resources, R.integer.b0));
        this.f190100m = obtainStyledAttributes.getDimensionPixelSize(10, resources.getDimensionPixelSize(R.dimen.go));
        this.f190088a = obtainStyledAttributes.getBoolean(6, resources.getBoolean(R.bool.h));
        this.f190096i = obtainStyledAttributes.getBoolean(0, resources.getBoolean(R.bool.g));
        float f = obtainStyledAttributes.getFloat(9, (float) m146085a(resources, R.integer.b2));
        this.f190109v = f;
        this.f190092e = f;
        int identifier = getContext().getResources().getIdentifier("colorAccent", "attr", getContext().getPackageName());
        if (obtainStyledAttributes.hasValue(5)) {
            this.f190101n = obtainStyledAttributes.getColor(5, resources.getColor(R.color.gu));
        } else if (identifier != 0) {
            TypedValue typedValue = new TypedValue();
            getContext().getTheme().resolveAttribute(identifier, typedValue, true);
            this.f190101n = typedValue.data;
        } else if (Build.VERSION.SDK_INT >= 21) {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(new int[]{16843829});
            this.f190101n = obtainStyledAttributes2.getColor(0, resources.getColor(R.color.gu));
            obtainStyledAttributes2.recycle();
        } else {
            this.f190101n = resources.getColor(R.color.gu);
        }
        this.f190102o = obtainStyledAttributes.getInteger(1, m146085a(resources, R.integer.aw));
        this.f190103p = obtainStyledAttributes.getInteger(3, m146085a(resources, R.integer.ay));
        this.f190104q = obtainStyledAttributes.getInteger(4, m146085a(resources, R.integer.az));
        this.f190105r = obtainStyledAttributes.getInteger(2, m146085a(resources, R.integer.ax));
        obtainStyledAttributes.recycle();
        this.f190093f = new Paint(1);
        m146088d();
        this.f190095h = new RectF();
        MethodCollector.m26664o(11051);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i >= i2) {
            i = i2;
        }
        this.f190094g = i;
        m146087c();
    }
}
