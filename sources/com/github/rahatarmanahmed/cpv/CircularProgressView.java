package com.github.rahatarmanahmed.cpv;

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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CircularProgressView extends View {

    /* renamed from: a */
    public boolean f59404a;

    /* renamed from: b */
    public float f59405b;

    /* renamed from: c */
    public float f59406c;

    /* renamed from: d */
    public List<Object> f59407d = new ArrayList();

    /* renamed from: e */
    public float f59408e;

    /* renamed from: f */
    public float f59409f;

    /* renamed from: g */
    private Paint f59410g;

    /* renamed from: h */
    private int f59411h;

    /* renamed from: i */
    private RectF f59412i;

    /* renamed from: j */
    private boolean f59413j;

    /* renamed from: k */
    private float f59414k;

    /* renamed from: l */
    private float f59415l;

    /* renamed from: m */
    private int f59416m;

    /* renamed from: n */
    private int f59417n;

    /* renamed from: o */
    private int f59418o;

    /* renamed from: p */
    private int f59419p;

    /* renamed from: q */
    private int f59420q;

    /* renamed from: r */
    private int f59421r;

    /* renamed from: s */
    private ValueAnimator f59422s;

    /* renamed from: t */
    private ValueAnimator f59423t;

    /* renamed from: u */
    private AnimatorSet f59424u;

    /* renamed from: v */
    private float f59425v;

    static {
        Covode.recordClassIndex(30408);
    }

    public int getColor() {
        return this.f59417n;
    }

    public float getMaxProgress() {
        return this.f59415l;
    }

    public float getProgress() {
        return this.f59414k;
    }

    public int getThickness() {
        return this.f59416m;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m48019d();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f59413j) {
            mo40939a();
        }
    }

    /* renamed from: b */
    private void m48017b() {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        RectF rectF = this.f59412i;
        int i = this.f59416m;
        int i2 = this.f59411h;
        rectF.set((float) (paddingLeft + i), (float) (paddingTop + i), (float) ((i2 - paddingLeft) - i), (float) ((i2 - paddingTop) - i));
    }

    /* renamed from: c */
    private void m48018c() {
        this.f59410g.setColor(this.f59417n);
        this.f59410g.setStyle(Paint.Style.STROKE);
        this.f59410g.setStrokeWidth((float) this.f59416m);
        this.f59410g.setStrokeCap(Paint.Cap.BUTT);
    }

    /* renamed from: d */
    private void m48019d() {
        ValueAnimator valueAnimator = this.f59422s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f59422s = null;
        }
        ValueAnimator valueAnimator2 = this.f59423t;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.f59423t = null;
        }
        AnimatorSet animatorSet = this.f59424u;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f59424u = null;
        }
    }

    /* renamed from: a */
    public final void mo40939a() {
        ValueAnimator valueAnimator = this.f59422s;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f59422s.cancel();
        }
        ValueAnimator valueAnimator2 = this.f59423t;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.f59423t.cancel();
        }
        AnimatorSet animatorSet = this.f59424u;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f59424u.cancel();
        }
        int i = 0;
        if (!this.f59404a) {
            float f = this.f59425v;
            this.f59408e = f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f + 360.0f);
            this.f59422s = ofFloat;
            ofFloat.setDuration((long) this.f59419p);
            this.f59422s.setInterpolator(new DecelerateInterpolator(2.0f));
            this.f59422s.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.github.rahatarmanahmed.cpv.CircularProgressView.C250473 */

                static {
                    Covode.recordClassIndex(30411);
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    CircularProgressView.this.f59408e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    CircularProgressView.this.invalidate();
                }
            });
            this.f59422s.start();
            this.f59409f = 0.0f;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, this.f59414k);
            this.f59423t = ofFloat2;
            ofFloat2.setDuration((long) this.f59420q);
            this.f59423t.setInterpolator(new LinearInterpolator());
            this.f59423t.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.github.rahatarmanahmed.cpv.CircularProgressView.C250484 */

                static {
                    Covode.recordClassIndex(30412);
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    CircularProgressView.this.f59409f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    CircularProgressView.this.invalidate();
                }
            });
            this.f59423t.start();
            return;
        }
        this.f59405b = 15.0f;
        this.f59424u = new AnimatorSet();
        AnimatorSet animatorSet2 = null;
        while (i < this.f59421r) {
            AnimatorSet a = m48016a((float) i);
            AnimatorSet.Builder play = this.f59424u.play(a);
            if (animatorSet2 != null) {
                play.after(animatorSet2);
            }
            i++;
            animatorSet2 = a;
        }
        this.f59424u.addListener(new AnimatorListenerAdapter() {
            /* class com.github.rahatarmanahmed.cpv.CircularProgressView.C250495 */

            /* renamed from: a */
            boolean f59431a;

            static {
                Covode.recordClassIndex(30413);
            }

            public final void onAnimationCancel(Animator animator) {
                this.f59431a = true;
            }

            public final void onAnimationEnd(Animator animator) {
                if (!this.f59431a) {
                    CircularProgressView.this.mo40939a();
                }
            }
        });
        this.f59424u.start();
        Iterator<Object> it = this.f59407d.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public void setMaxProgress(float f) {
        this.f59415l = f;
        invalidate();
    }

    public void setColor(int i) {
        this.f59417n = i;
        m48018c();
        invalidate();
    }

    public void setThickness(int i) {
        this.f59416m = i;
        m48018c();
        m48017b();
        invalidate();
    }

    public void setVisibility(int i) {
        int visibility = getVisibility();
        super.setVisibility(i);
        if (i == visibility) {
            return;
        }
        if (i == 0) {
            mo40939a();
        } else if (i == 8 || i == 4) {
            m48019d();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        MethodCollector.m26663i(11114);
        super.onDraw(canvas);
        if (isInEditMode()) {
            f = this.f59414k;
        } else {
            f = this.f59409f;
        }
        float f2 = (f / this.f59415l) * 360.0f;
        if (!this.f59404a) {
            canvas.drawArc(this.f59412i, this.f59408e, f2, false, this.f59410g);
            MethodCollector.m26664o(11114);
            return;
        }
        canvas.drawArc(this.f59412i, this.f59408e + this.f59406c, this.f59405b, false, this.f59410g);
        MethodCollector.m26664o(11114);
    }

    public void setIndeterminate(boolean z) {
        boolean z2;
        boolean z3 = this.f59404a;
        if (z3 == z) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f59404a = z;
        if (z2) {
            mo40939a();
        }
        if (z3 != z) {
            Iterator<Object> it = this.f59407d.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public void setProgress(final float f) {
        this.f59414k = f;
        if (!this.f59404a) {
            ValueAnimator valueAnimator = this.f59423t;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f59423t.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f59409f, f);
            this.f59423t = ofFloat;
            ofFloat.setDuration((long) this.f59420q);
            this.f59423t.setInterpolator(new LinearInterpolator());
            this.f59423t.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.github.rahatarmanahmed.cpv.CircularProgressView.C250451 */

                static {
                    Covode.recordClassIndex(30409);
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    CircularProgressView.this.f59409f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    CircularProgressView.this.invalidate();
                }
            });
            this.f59423t.addListener(new AnimatorListenerAdapter() {
                /* class com.github.rahatarmanahmed.cpv.CircularProgressView.C250462 */

                static {
                    Covode.recordClassIndex(30410);
                }

                public final void onAnimationEnd(Animator animator) {
                    Iterator<Object> it = CircularProgressView.this.f59407d.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                }
            });
            this.f59423t.start();
        }
        invalidate();
        Iterator<Object> it = this.f59407d.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: a */
    private AnimatorSet m48016a(float f) {
        int i = this.f59421r;
        final float f2 = ((((float) (i - 1)) * 360.0f) / ((float) i)) + 15.0f;
        final float f3 = ((f2 - 15.0f) * f) - 0.049804688f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(15.0f, f2);
        ofFloat.setDuration((long) ((this.f59418o / this.f59421r) / 2));
        ofFloat.setInterpolator(new DecelerateInterpolator(1.0f));
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.github.rahatarmanahmed.cpv.CircularProgressView.C250506 */

            static {
                Covode.recordClassIndex(30414);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CircularProgressView.this.f59405b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CircularProgressView.this.invalidate();
            }
        });
        int i2 = this.f59421r;
        float f4 = (0.5f + f) * 720.0f;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat((f * 720.0f) / ((float) i2), f4 / ((float) i2));
        ofFloat2.setDuration((long) ((this.f59418o / this.f59421r) / 2));
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.github.rahatarmanahmed.cpv.CircularProgressView.C250517 */

            static {
                Covode.recordClassIndex(30415);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CircularProgressView.this.f59406c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            }
        });
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(f3, (f3 + f2) - 15.0f);
        ofFloat3.setDuration((long) ((this.f59418o / this.f59421r) / 2));
        ofFloat3.setInterpolator(new DecelerateInterpolator(1.0f));
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.github.rahatarmanahmed.cpv.CircularProgressView.C250528 */

            static {
                Covode.recordClassIndex(30416);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CircularProgressView.this.f59408e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CircularProgressView circularProgressView = CircularProgressView.this;
                circularProgressView.f59405b = (f2 - circularProgressView.f59408e) + f3;
                CircularProgressView.this.invalidate();
            }
        });
        int i3 = this.f59421r;
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f4 / ((float) i3), ((f + 1.0f) * 720.0f) / ((float) i3));
        ofFloat4.setDuration((long) ((this.f59418o / this.f59421r) / 2));
        ofFloat4.setInterpolator(new LinearInterpolator());
        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.github.rahatarmanahmed.cpv.CircularProgressView.C250539 */

            static {
                Covode.recordClassIndex(30417);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CircularProgressView.this.f59406c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.play(ofFloat3).with(ofFloat4).after(ofFloat2);
        return animatorSet;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        MethodCollector.m26663i(11112);
        super.onMeasure(i, i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int measuredWidth = getMeasuredWidth() - paddingLeft;
        int measuredHeight = getMeasuredHeight() - paddingTop;
        if (measuredWidth >= measuredHeight) {
            measuredWidth = measuredHeight;
        }
        this.f59411h = measuredWidth;
        setMeasuredDimension(paddingLeft + measuredWidth, measuredWidth + paddingTop);
        MethodCollector.m26664o(11112);
    }

    /* renamed from: a */
    private static int m48015a(Resources resources, int i) {
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
        MethodCollector.m26663i(10971);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.q_, R.attr.qa, R.attr.qb, R.attr.qc, R.attr.qd, R.attr.qe, R.attr.qf, R.attr.qg, R.attr.qh, R.attr.qi, R.attr.qj}, 0, 0);
        Resources resources = getResources();
        this.f59414k = obtainStyledAttributes.getFloat(8, (float) m48015a(resources, R.integer.b1));
        this.f59415l = obtainStyledAttributes.getFloat(7, (float) m48015a(resources, R.integer.b0));
        this.f59416m = obtainStyledAttributes.getDimensionPixelSize(10, resources.getDimensionPixelSize(R.dimen.go));
        this.f59404a = obtainStyledAttributes.getBoolean(6, resources.getBoolean(R.bool.h));
        this.f59413j = obtainStyledAttributes.getBoolean(0, resources.getBoolean(R.bool.g));
        float f = obtainStyledAttributes.getFloat(9, (float) m48015a(resources, R.integer.b2));
        this.f59425v = f;
        this.f59408e = f;
        int identifier = getContext().getResources().getIdentifier("colorAccent", "attr", getContext().getPackageName());
        if (obtainStyledAttributes.hasValue(5)) {
            this.f59417n = obtainStyledAttributes.getColor(5, resources.getColor(R.color.gu));
        } else if (identifier != 0) {
            TypedValue typedValue = new TypedValue();
            getContext().getTheme().resolveAttribute(identifier, typedValue, true);
            this.f59417n = typedValue.data;
        } else if (Build.VERSION.SDK_INT >= 21) {
            this.f59417n = getContext().obtainStyledAttributes(new int[]{16843829}).getColor(0, resources.getColor(R.color.gu));
        } else {
            this.f59417n = resources.getColor(R.color.gu);
        }
        this.f59418o = obtainStyledAttributes.getInteger(1, m48015a(resources, R.integer.aw));
        this.f59419p = obtainStyledAttributes.getInteger(3, m48015a(resources, R.integer.ay));
        this.f59420q = obtainStyledAttributes.getInteger(4, m48015a(resources, R.integer.az));
        this.f59421r = obtainStyledAttributes.getInteger(2, m48015a(resources, R.integer.ax));
        obtainStyledAttributes.recycle();
        this.f59410g = new Paint(1);
        m48018c();
        this.f59412i = new RectF();
        MethodCollector.m26664o(10971);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i >= i2) {
            i = i2;
        }
        this.f59411h = i;
        m48017b();
    }
}
