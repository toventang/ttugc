package com.p2082ss.android.ugc.aweme.feed.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.common.utility.C13628n;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.feed.widget.LineProgressBar */
public class LineProgressBar extends FrameLayout {

    /* renamed from: a */
    public View f116621a;

    /* renamed from: b */
    public ValueAnimator f116622b;

    /* renamed from: c */
    public ValueAnimator.AnimatorUpdateListener f116623c;

    /* renamed from: d */
    private View f116624d;

    /* renamed from: e */
    private View f116625e;

    /* renamed from: f */
    private float f116626f;

    /* renamed from: g */
    private ObjectAnimator f116627g;

    /* renamed from: h */
    private ObjectAnimator f116628h;

    static {
        Covode.recordClassIndex(59627);
    }

    /* renamed from: d */
    private void m94656d() {
        this.f116623c = new ValueAnimator.AnimatorUpdateListener() {
            /* class com.p2082ss.android.ugc.aweme.feed.widget.LineProgressBar.C504881 */

            static {
                Covode.recordClassIndex(59628);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float intValue = (float) ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (intValue > 0.0f && intValue <= 100.0f) {
                    float f = intValue / 100.0f;
                    LineProgressBar.this.f116621a.setAlpha(f);
                    LineProgressBar.this.f116621a.setScaleX(f * 0.8f);
                } else if (intValue > 100.0f && intValue <= 200.0f) {
                    float f2 = (intValue - 100.0f) / 100.0f;
                    LineProgressBar.this.f116621a.setAlpha(1.0f - f2);
                    LineProgressBar.this.f116621a.setScaleX((f2 * 0.2f) + 0.8f);
                }
            }
        };
    }

    /* renamed from: f */
    private void m94658f() {
        m94657e();
        this.f116627g.start();
    }

    /* renamed from: e */
    private void m94657e() {
        if (C13603b.m24435a((Collection) this.f116627g.getListeners())) {
            this.f116627g.addListener(new AnimatorListenerAdapter() {
                /* class com.p2082ss.android.ugc.aweme.feed.widget.LineProgressBar.C504892 */

                static {
                    Covode.recordClassIndex(59629);
                }

                public final void onAnimationEnd(Animator animator) {
                    if (C13603b.m24435a((Collection) LineProgressBar.this.f116622b.getListeners())) {
                        LineProgressBar.this.f116622b.addUpdateListener(LineProgressBar.this.f116623c);
                    }
                    LineProgressBar.this.f116622b.start();
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo85737b() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
        this.f116628h = ofFloat;
        ofFloat.setDuration(300L);
        this.f116628h.addListener(new AnimatorListenerAdapter() {
            /* class com.p2082ss.android.ugc.aweme.feed.widget.LineProgressBar.C504903 */

            static {
                Covode.recordClassIndex(59630);
            }

            public final void onAnimationEnd(Animator animator) {
                if (LineProgressBar.this.f116622b != null) {
                    LineProgressBar.this.f116622b.cancel();
                }
                LineProgressBar.this.setAlpha(1.0f);
                LineProgressBar.this.setVisibility(4);
            }
        });
        this.f116628h.start();
    }

    /* renamed from: c */
    public final void mo85738c() {
        ValueAnimator valueAnimator = this.f116622b;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            this.f116622b.cancel();
        }
        ObjectAnimator objectAnimator = this.f116627g;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.f116627g.cancel();
        }
        ObjectAnimator objectAnimator2 = this.f116628h;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllListeners();
            this.f116628h.cancel();
        }
    }

    /* renamed from: a */
    public final void mo85736a() {
        if (getVisibility() != 0) {
            setVisibility(0);
        }
        if (this.f116622b == null) {
            ValueAnimator ofInt = ValueAnimator.ofInt(0, 200);
            this.f116622b = ofInt;
            ofInt.setDuration(600L);
            this.f116622b.setRepeatCount(-1);
            this.f116622b.addUpdateListener(this.f116623c);
        }
        if (this.f116627g == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f116624d, "alpha", 0.0f, 1.0f);
            this.f116627g = ofFloat;
            ofFloat.setDuration(300L);
            m94657e();
        }
        ObjectAnimator objectAnimator = this.f116628h;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.f116628h.cancel();
            m94658f();
        } else if (!this.f116627g.isRunning() && !this.f116622b.isRunning()) {
            m94658f();
        }
    }

    public LineProgressBar(Context context) {
        super(context);
        MethodCollector.m26663i(12118);
        m94655a(context);
        MethodCollector.m26664o(12118);
    }

    /* renamed from: a */
    private void m94655a(Context context) {
        MethodCollector.m26663i(12258);
        View inflate = LayoutInflater.from(context).inflate(R.layout.bin, this);
        this.f116625e = inflate;
        this.f116621a = inflate.findViewById(R.id.c9h);
        this.f116624d = this.f116625e.findViewById(R.id.c9_);
        this.f116621a.setAlpha(0.0f);
        this.f116624d.setAlpha(0.0f);
        this.f116626f = ((float) C13628n.m24504a(getContext())) - C13628n.m24520b(getContext(), 30.0f);
        m94656d();
        MethodCollector.m26664o(12258);
    }

    public LineProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(12119);
        m94655a(context);
        MethodCollector.m26664o(12119);
    }
}
