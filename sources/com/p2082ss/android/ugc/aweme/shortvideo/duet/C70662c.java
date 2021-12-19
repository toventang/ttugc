package com.p2082ss.android.ugc.aweme.shortvideo.duet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40904c;
import com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40905d;
import com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40906e;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.c */
public final class C70662c implements AbstractC40905d {

    /* renamed from: a */
    public AbstractC40906e f158165a = new AbstractC40906e.C40907a();

    /* renamed from: b */
    public View f158166b;

    /* renamed from: c */
    private View f158167c;

    static {
        Covode.recordClassIndex(83133);
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
        this.f158167c.setVisibility(0);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40904c
    /* renamed from: d */
    public final void mo70109d() {
        this.f158167c.setVisibility(4);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40905d
    /* renamed from: a */
    public final void mo70111a(AbstractC40906e eVar) {
        this.f158165a = eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40905d
    /* renamed from: a */
    public final void mo70110a(final AbstractC40904c cVar) {
        this.f158166b.post(new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.duet.C70662c.RunnableC706631 */

            static {
                Covode.recordClassIndex(83134);
            }

            public final void run() {
                C70662c.this.f158165a.mo70104a();
                C70662c.this.mo70104a();
                cVar.mo70104a();
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
                final int measuredHeight = C70662c.this.f158166b.getMeasuredHeight();
                duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    /* class com.p2082ss.android.ugc.aweme.shortvideo.duet.C70662c.RunnableC706631.C706641 */

                    static {
                        Covode.recordClassIndex(83135);
                    }

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        C70662c.this.f158165a.mo70105a(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                        C70662c.this.mo70105a(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                        cVar.mo70105a(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                    }
                });
                duration.addListener(new AnimatorListenerAdapter() {
                    /* class com.p2082ss.android.ugc.aweme.shortvideo.duet.C70662c.RunnableC706631.C706652 */

                    static {
                        Covode.recordClassIndex(83136);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        C70662c.this.f158165a.mo70106b();
                        cVar.mo70106b();
                    }
                });
                duration.start();
            }
        });
    }

    @Override // com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40905d
    /* renamed from: b */
    public final void mo70112b(final AbstractC40904c cVar) {
        this.f158165a.mo70108c();
        cVar.mo70108c();
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        final int measuredHeight = this.f158166b.getMeasuredHeight();
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.duet.C70662c.C706662 */

            static {
                Covode.recordClassIndex(83137);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C70662c.this.f158165a.mo70107b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                C70662c.this.mo70107b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                cVar.mo70107b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
            }
        });
        duration.addListener(new AnimatorListenerAdapter() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.duet.C70662c.C706673 */

            static {
                Covode.recordClassIndex(83138);
            }

            public final void onAnimationEnd(Animator animator) {
                C70662c.this.f158165a.mo70109d();
                C70662c.this.mo70109d();
                cVar.mo70109d();
            }
        });
        duration.start();
    }

    C70662c(View view, View view2) {
        this.f158166b = view;
        this.f158167c = view2;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40904c
    /* renamed from: a */
    public final void mo70105a(float f, int i, int i2) {
        this.f158166b.setTranslationY(((float) i2) + (((float) (i - i2)) * f));
    }

    @Override // com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40904c
    /* renamed from: b */
    public final void mo70107b(float f, int i, int i2) {
        this.f158166b.setTranslationY(((float) (i2 - i)) * f);
    }
}
