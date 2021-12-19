package com.p2082ss.android.ugc.aweme.base.widget;

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
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sysoptimizer.java.ResourcesProtector;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.base.widget.CircularProgressView */
public class CircularProgressView extends View {

    /* renamed from: a */
    public boolean f82028a;

    /* renamed from: b */
    public float f82029b;

    /* renamed from: c */
    public float f82030c;

    /* renamed from: d */
    public float f82031d;

    /* renamed from: e */
    private Paint f82032e;

    /* renamed from: f */
    private int f82033f;

    /* renamed from: g */
    private RectF f82034g;

    /* renamed from: h */
    private boolean f82035h;

    /* renamed from: i */
    private boolean f82036i;

    /* renamed from: j */
    private boolean f82037j;

    /* renamed from: k */
    private float f82038k;

    /* renamed from: l */
    private float f82039l;

    /* renamed from: m */
    private int f82040m;

    /* renamed from: n */
    private int f82041n;

    /* renamed from: o */
    private int f82042o;

    /* renamed from: p */
    private int f82043p;

    /* renamed from: q */
    private int f82044q;

    /* renamed from: r */
    private int f82045r;

    /* renamed from: s */
    private ValueAnimator f82046s;

    /* renamed from: t */
    private ValueAnimator f82047t;

    /* renamed from: u */
    private AnimatorSet f82048u;

    /* renamed from: v */
    private float f82049v;

    static {
        Covode.recordClassIndex(41732);
    }

    public int getColor() {
        return this.f82041n;
    }

    public float getMaxProgress() {
        return this.f82039l;
    }

    public float getProgress() {
        return this.f82038k;
    }

    public int getThickness() {
        return this.f82040m;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f82037j = false;
        mo61409b();
    }

    /* renamed from: c */
    private void m70969c() {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        RectF rectF = this.f82034g;
        int i = this.f82040m;
        int i2 = this.f82033f;
        rectF.set((float) (paddingLeft + i), (float) (paddingTop + i), (float) ((i2 - paddingLeft) - i), (float) ((i2 - paddingTop) - i));
    }

    /* renamed from: d */
    private void m70970d() {
        this.f82032e.setColor(this.f82041n);
        this.f82032e.setStyle(Paint.Style.STROKE);
        this.f82032e.setStrokeWidth((float) this.f82040m);
        this.f82032e.setStrokeCap(Paint.Cap.ROUND);
    }

    /* renamed from: b */
    public final void mo61409b() {
        this.f82036i = false;
        ValueAnimator valueAnimator = this.f82046s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f82046s = null;
        }
        ValueAnimator valueAnimator2 = this.f82047t;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.f82047t = null;
        }
        AnimatorSet animatorSet = this.f82048u;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f82048u = null;
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f82037j = true;
        if (this.f82035h || this.f82036i) {
            mo61408a();
        }
    }

    /* renamed from: a */
    public final void mo61408a() {
        if (!this.f82037j) {
            this.f82036i = true;
            return;
        }
        int i = 0;
        this.f82036i = false;
        ValueAnimator valueAnimator = this.f82046s;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f82046s.cancel();
        }
        ValueAnimator valueAnimator2 = this.f82047t;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.f82047t.cancel();
        }
        AnimatorSet animatorSet = this.f82048u;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f82048u.cancel();
        }
        if (!this.f82028a) {
            float f = this.f82049v;
            this.f82031d = f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f + 360.0f);
            this.f82046s = ofFloat;
            ofFloat.setDuration((long) this.f82043p);
            this.f82046s.setInterpolator(new DecelerateInterpolator(2.0f));
            this.f82046s.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.p2082ss.android.ugc.aweme.base.widget.CircularProgressView.C347381 */

                static {
                    Covode.recordClassIndex(41733);
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    CircularProgressView.this.f82031d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    CircularProgressView.this.invalidate();
                }
            });
            this.f82046s.start();
            return;
        }
        this.f82029b = 15.0f;
        this.f82048u = new AnimatorSet();
        AnimatorSet animatorSet2 = null;
        while (i < this.f82045r) {
            AnimatorSet a = m70968a((float) i);
            AnimatorSet.Builder play = this.f82048u.play(a);
            if (animatorSet2 != null) {
                play.after(animatorSet2);
            }
            i++;
            animatorSet2 = a;
        }
        this.f82048u.addListener(new AnimatorListenerAdapter() {
            /* class com.p2082ss.android.ugc.aweme.base.widget.CircularProgressView.C347392 */

            /* renamed from: a */
            boolean f82051a;

            static {
                Covode.recordClassIndex(41734);
            }

            public final void onAnimationCancel(Animator animator) {
                this.f82051a = true;
            }

            public final void onAnimationEnd(Animator animator) {
                if (!this.f82051a) {
                    CircularProgressView.this.mo61408a();
                }
            }
        });
        this.f82048u.start();
    }

    public void setMaxProgress(float f) {
        this.f82039l = f;
        invalidate();
    }

    public void setProgress(float f) {
        this.f82038k = f;
        invalidate();
    }

    public void setColor(int i) {
        this.f82041n = i;
        m70970d();
        invalidate();
    }

    public void setIndeterminate(boolean z) {
        if (this.f82028a != z) {
            this.f82028a = z;
            mo61408a();
        }
    }

    public void setThickness(int i) {
        this.f82040m = i;
        m70970d();
        m70969c();
        invalidate();
    }

    public void setVisibility(int i) {
        int visibility = getVisibility();
        super.setVisibility(i);
        if (i == visibility) {
            return;
        }
        if (i == 0) {
            mo61408a();
        } else if (i == 8 || i == 4) {
            mo61409b();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        MethodCollector.m26663i(12730);
        super.onDraw(canvas);
        isInEditMode();
        float f = (this.f82038k / this.f82039l) * 360.0f;
        if (!this.f82028a) {
            canvas.drawArc(this.f82034g, this.f82031d, f, false, this.f82032e);
            MethodCollector.m26664o(12730);
            return;
        }
        canvas.drawArc(this.f82034g, this.f82031d + this.f82030c, this.f82029b, false, this.f82032e);
        MethodCollector.m26664o(12730);
    }

    /* renamed from: a */
    private AnimatorSet m70968a(float f) {
        int i = this.f82045r;
        final float f2 = ((((float) (i - 1)) * 360.0f) / ((float) i)) + 15.0f;
        final float f3 = ((f2 - 15.0f) * f) - 0.049804688f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(15.0f, f2);
        ofFloat.setDuration((long) ((this.f82042o / this.f82045r) / 2));
        ofFloat.setInterpolator(new DecelerateInterpolator(1.0f));
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.p2082ss.android.ugc.aweme.base.widget.CircularProgressView.C347403 */

            static {
                Covode.recordClassIndex(41735);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CircularProgressView.this.f82029b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CircularProgressView.this.invalidate();
            }
        });
        int i2 = this.f82045r;
        float f4 = (0.5f + f) * 720.0f;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat((f * 720.0f) / ((float) i2), f4 / ((float) i2));
        ofFloat2.setDuration((long) ((this.f82042o / this.f82045r) / 2));
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.p2082ss.android.ugc.aweme.base.widget.CircularProgressView.C347414 */

            static {
                Covode.recordClassIndex(41736);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CircularProgressView.this.f82030c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            }
        });
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(f3, (f3 + f2) - 15.0f);
        ofFloat3.setDuration((long) ((this.f82042o / this.f82045r) / 2));
        ofFloat3.setInterpolator(new DecelerateInterpolator(1.0f));
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.p2082ss.android.ugc.aweme.base.widget.CircularProgressView.C347425 */

            static {
                Covode.recordClassIndex(41737);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CircularProgressView.this.f82031d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CircularProgressView circularProgressView = CircularProgressView.this;
                circularProgressView.f82029b = (f2 - circularProgressView.f82031d) + f3;
                CircularProgressView.this.invalidate();
            }
        });
        int i3 = this.f82045r;
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f4 / ((float) i3), ((f + 1.0f) * 720.0f) / ((float) i3));
        ofFloat4.setDuration((long) ((this.f82042o / this.f82045r) / 2));
        ofFloat4.setInterpolator(new LinearInterpolator());
        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.p2082ss.android.ugc.aweme.base.widget.CircularProgressView.C347436 */

            static {
                Covode.recordClassIndex(41738);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CircularProgressView.this.f82030c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.play(ofFloat3).with(ofFloat4).after(ofFloat2);
        return animatorSet;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        MethodCollector.m26663i(12613);
        super.onMeasure(i, i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int measuredWidth = getMeasuredWidth() - paddingLeft;
        int measuredHeight = getMeasuredHeight() - paddingTop;
        if (measuredWidth >= measuredHeight) {
            measuredWidth = measuredHeight;
        }
        this.f82033f = measuredWidth;
        setMeasuredDimension(paddingLeft + measuredWidth, measuredWidth + paddingTop);
        MethodCollector.m26664o(12613);
    }

    /* renamed from: a */
    private static int m70967a(Resources resources, int i) {
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
        MethodCollector.m26663i(12508);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.q_, R.attr.qa, R.attr.qb, R.attr.qc, R.attr.qd, R.attr.qe, R.attr.qf, R.attr.qg, R.attr.qh, R.attr.qi, R.attr.qj}, 0, 0);
        Resources resources = getResources();
        this.f82038k = obtainStyledAttributes.getFloat(8, (float) m70967a(resources, R.integer.b1));
        this.f82039l = obtainStyledAttributes.getFloat(7, (float) m70967a(resources, R.integer.b0));
        this.f82040m = obtainStyledAttributes.getDimensionPixelSize(10, resources.getDimensionPixelSize(R.dimen.go));
        this.f82028a = obtainStyledAttributes.getBoolean(6, resources.getBoolean(R.bool.h));
        this.f82035h = obtainStyledAttributes.getBoolean(0, resources.getBoolean(R.bool.g));
        float f = obtainStyledAttributes.getFloat(9, (float) m70967a(resources, R.integer.b2));
        this.f82049v = f;
        this.f82031d = f;
        int identifier = getContext().getResources().getIdentifier("colorAccent", "attr", getContext().getPackageName());
        if (obtainStyledAttributes.hasValue(5)) {
            this.f82041n = obtainStyledAttributes.getColor(5, C0643b.m2378c(getContext(), R.color.gu));
        } else if (identifier != 0) {
            TypedValue typedValue = new TypedValue();
            getContext().getTheme().resolveAttribute(identifier, typedValue, true);
            this.f82041n = typedValue.data;
        } else if (Build.VERSION.SDK_INT >= 21) {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(new int[]{16843829});
            this.f82041n = obtainStyledAttributes2.getColor(0, C0643b.m2378c(getContext(), R.color.gu));
            obtainStyledAttributes2.recycle();
        } else {
            this.f82041n = C0643b.m2378c(getContext(), R.color.gu);
        }
        this.f82042o = obtainStyledAttributes.getInteger(1, m70967a(resources, R.integer.aw));
        this.f82043p = obtainStyledAttributes.getInteger(3, m70967a(resources, R.integer.ay));
        this.f82044q = obtainStyledAttributes.getInteger(4, m70967a(resources, R.integer.az));
        this.f82045r = obtainStyledAttributes.getInteger(2, m70967a(resources, R.integer.ax));
        obtainStyledAttributes.recycle();
        this.f82032e = new Paint(1);
        m70970d();
        this.f82034g = new RectF();
        MethodCollector.m26664o(12508);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i >= i2) {
            i = i2;
        }
        this.f82033f = i;
        m70969c();
    }
}
