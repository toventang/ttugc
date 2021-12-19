package com.p2082ss.android.ugc.aweme.tools.beauty.views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40904c;
import com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40905d;
import com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40906e;
import com.p2082ss.android.ugc.aweme.p3043g.animationInterpolatorC52819a;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.views.c */
public final class C78092c implements AbstractC40905d {

    /* renamed from: a */
    public AbstractC40906e f175354a = new AbstractC40906e.C40907a();

    /* renamed from: b */
    public View f175355b;

    /* renamed from: c */
    public boolean f175356c = true;

    /* renamed from: d */
    private ViewGroup f175357d;

    /* renamed from: e */
    private View f175358e;

    static {
        Covode.recordClassIndex(91190);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40904c
    /* renamed from: c */
    public final void mo70108c() {
    }

    @Override // com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40904c
    /* renamed from: b */
    public final void mo70106b() {
        this.f175355b.setTranslationY(0.0f);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40904c
    /* renamed from: a */
    public final void mo70104a() {
        this.f175358e.setVisibility(0);
        this.f175355b.setVisibility(0);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40904c
    /* renamed from: d */
    public final void mo70109d() {
        MethodCollector.m26663i(12431);
        this.f175357d.removeView(this.f175358e);
        MethodCollector.m26664o(12431);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40905d
    /* renamed from: a */
    public final void mo70111a(AbstractC40906e eVar) {
        this.f175354a = eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40905d
    /* renamed from: a */
    public final void mo70110a(final AbstractC40904c cVar) {
        MethodCollector.m26663i(12315);
        this.f175357d.removeAllViews();
        ViewGroup viewGroup = (ViewGroup) this.f175358e.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this.f175358e);
        }
        this.f175357d.addView(this.f175358e);
        if (this.f175356c) {
            this.f175357d.post(new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.tools.beauty.views.C78092c.RunnableC780931 */

                static {
                    Covode.recordClassIndex(91191);
                }

                public final void run() {
                    C78092c.this.f175354a.mo70104a();
                    C78092c.this.mo70104a();
                    cVar.mo70104a();
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(490L);
                    duration.setInterpolator(new animationInterpolatorC52819a());
                    final int measuredHeight = C78092c.this.f175355b.getMeasuredHeight();
                    duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        /* class com.p2082ss.android.ugc.aweme.tools.beauty.views.C78092c.RunnableC780931.C780941 */

                        static {
                            Covode.recordClassIndex(91192);
                        }

                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            C78092c.this.f175354a.mo70105a(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                            C78092c.this.mo70105a(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                            cVar.mo70105a(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                        }
                    });
                    duration.addListener(new AnimatorListenerAdapter() {
                        /* class com.p2082ss.android.ugc.aweme.tools.beauty.views.C78092c.RunnableC780931.C780952 */

                        static {
                            Covode.recordClassIndex(91193);
                        }

                        public final void onAnimationEnd(Animator animator) {
                            super.onAnimationEnd(animator);
                            C78092c.this.f175354a.mo70106b();
                            C78092c.this.mo70106b();
                            cVar.mo70106b();
                        }
                    });
                    duration.start();
                }
            });
            MethodCollector.m26664o(12315);
            return;
        }
        this.f175354a.mo70106b();
        mo70106b();
        cVar.mo70106b();
        MethodCollector.m26664o(12315);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40905d
    /* renamed from: b */
    public final void mo70112b(final AbstractC40904c cVar) {
        this.f175354a.mo70108c();
        cVar.mo70108c();
        if (this.f175356c) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
            final int measuredHeight = this.f175355b.getMeasuredHeight();
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.p2082ss.android.ugc.aweme.tools.beauty.views.C78092c.C780962 */

                static {
                    Covode.recordClassIndex(91194);
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C78092c.this.f175354a.mo70107b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                    C78092c.this.mo70107b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                    cVar.mo70107b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                }
            });
            duration.addListener(new AnimatorListenerAdapter() {
                /* class com.p2082ss.android.ugc.aweme.tools.beauty.views.C78092c.C780973 */

                static {
                    Covode.recordClassIndex(91195);
                }

                public final void onAnimationEnd(Animator animator) {
                    C78092c.this.f175354a.mo70109d();
                    C78092c.this.mo70109d();
                    cVar.mo70109d();
                }
            });
            duration.start();
            return;
        }
        this.f175354a.mo70109d();
        mo70109d();
        cVar.mo70109d();
    }

    @Override // com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40904c
    /* renamed from: b */
    public final void mo70107b(float f, int i, int i2) {
        this.f175355b.setTranslationY(((float) (i2 - i)) * f);
    }

    public C78092c(ViewGroup viewGroup, View view, View view2) {
        this.f175357d = viewGroup;
        this.f175358e = view;
        this.f175355b = view2;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40904c
    /* renamed from: a */
    public final void mo70105a(float f, int i, int i2) {
        float f2 = ((float) i2) + (((float) (i - i2)) * f);
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        this.f175355b.setTranslationY(f2);
    }
}
