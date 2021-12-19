package com.p2082ss.android.ugc.aweme.filter;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40904c;
import com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40905d;
import com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40906e;
import com.p2082ss.android.ugc.aweme.p3043g.animationInterpolatorC52819a;
import com.p2082ss.android.ugc.tools.view.p4364c.C84952c;

/* renamed from: com.ss.android.ugc.aweme.filter.a */
public final class C50634a implements AbstractC40905d {

    /* renamed from: a */
    public AbstractC40906e f116956a = new AbstractC40906e.C40907a();

    /* renamed from: b */
    public View f116957b;

    /* renamed from: c */
    private FrameLayout f116958c;

    /* renamed from: d */
    private View f116959d;

    static {
        Covode.recordClassIndex(59796);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40904c
    /* renamed from: b */
    public final void mo70106b() {
    }

    @Override // com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40904c
    /* renamed from: c */
    public final void mo70108c() {
    }

    @Override // com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40904c
    /* renamed from: a */
    public final void mo70104a() {
        this.f116957b.setVisibility(0);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40904c
    /* renamed from: d */
    public final void mo70109d() {
        MethodCollector.m26663i(6147);
        this.f116958c.removeView(this.f116959d);
        MethodCollector.m26664o(6147);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40905d
    /* renamed from: a */
    public final void mo70111a(AbstractC40906e eVar) {
        this.f116956a = eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40905d
    /* renamed from: a */
    public final void mo70110a(final AbstractC40904c cVar) {
        MethodCollector.m26663i(5416);
        this.f116958c.removeAllViews();
        this.f116958c.addView(this.f116959d);
        this.f116958c.post(new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.filter.C50634a.RunnableC506351 */

            static {
                Covode.recordClassIndex(59797);
            }

            public final void run() {
                C50634a.this.f116956a.mo70104a();
                C50634a.this.mo70104a();
                cVar.mo70104a();
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(490L);
                duration.setInterpolator(new animationInterpolatorC52819a());
                final int measuredHeight = C50634a.this.f116957b.getMeasuredHeight();
                duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    /* class com.p2082ss.android.ugc.aweme.filter.C50634a.RunnableC506351.C506361 */

                    static {
                        Covode.recordClassIndex(59798);
                    }

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        C50634a.this.f116956a.mo70105a(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                        C50634a.this.mo70105a(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                        cVar.mo70105a(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                    }
                });
                duration.addListener(new AnimatorListenerAdapter() {
                    /* class com.p2082ss.android.ugc.aweme.filter.C50634a.RunnableC506351.C506372 */

                    static {
                        Covode.recordClassIndex(59799);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        C50634a.this.f116956a.mo70106b();
                        cVar.mo70106b();
                    }
                });
                duration.start();
            }
        });
        MethodCollector.m26664o(5416);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40905d
    /* renamed from: b */
    public final void mo70112b(final AbstractC40904c cVar) {
        this.f116956a.mo70108c();
        cVar.mo70108c();
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
        duration.setInterpolator(new C84952c());
        final int measuredHeight = this.f116957b.getMeasuredHeight();
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.p2082ss.android.ugc.aweme.filter.C50634a.C506382 */

            static {
                Covode.recordClassIndex(59800);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C50634a.this.f116956a.mo70107b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                C50634a.this.mo70107b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                cVar.mo70107b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
            }
        });
        duration.addListener(new AnimatorListenerAdapter() {
            /* class com.p2082ss.android.ugc.aweme.filter.C50634a.C506393 */

            static {
                Covode.recordClassIndex(59801);
            }

            public final void onAnimationEnd(Animator animator) {
                C50634a.this.f116956a.mo70109d();
                C50634a.this.mo70109d();
                cVar.mo70109d();
            }
        });
        duration.start();
    }

    @Override // com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40904c
    /* renamed from: a */
    public final void mo70105a(float f, int i, int i2) {
        this.f116957b.setTranslationY(((float) i2) + (((float) (i - i2)) * f));
        this.f116957b.setAlpha(f);
    }

    public C50634a(FrameLayout frameLayout, View view, View view2) {
        this.f116958c = frameLayout;
        this.f116959d = view;
        this.f116957b = view2;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40904c
    /* renamed from: b */
    public final void mo70107b(float f, int i, int i2) {
        this.f116957b.setTranslationY(((float) (i2 - i)) * f);
        this.f116957b.setAlpha(1.0f - f);
    }
}
