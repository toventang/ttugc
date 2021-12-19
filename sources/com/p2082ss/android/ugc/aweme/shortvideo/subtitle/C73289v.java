package com.p2082ss.android.ugc.aweme.shortvideo.subtitle;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.p1197c.C17168c;
import com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40904c;
import com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40905d;
import com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40906e;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.v */
public final class C73289v implements AbstractC40905d {

    /* renamed from: a */
    public AbstractC40906e f164587a = new AbstractC40906e.C40907a();

    /* renamed from: b */
    private ViewGroup f164588b;

    /* renamed from: c */
    private View f164589c;

    /* renamed from: d */
    private View f164590d;

    /* renamed from: e */
    private ValueAnimator f164591e;

    /* renamed from: f */
    private ValueAnimator f164592f;

    static {
        Covode.recordClassIndex(86007);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40904c
    /* renamed from: b */
    public final void mo70106b() {
    }

    @Override // com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40904c
    /* renamed from: c */
    public final void mo70108c() {
        this.f164590d.setVisibility(0);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40904c
    /* renamed from: a */
    public final void mo70104a() {
        this.f164590d.setVisibility(4);
        this.f164589c.setVisibility(0);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40904c
    /* renamed from: d */
    public final void mo70109d() {
        MethodCollector.m26663i(11597);
        ValueAnimator valueAnimator = this.f164591e;
        if (valueAnimator != null && valueAnimator.isStarted()) {
            this.f164588b.removeView(this.f164589c);
        }
        MethodCollector.m26664o(11597);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40905d
    /* renamed from: a */
    public final void mo70110a(AbstractC40904c cVar) {
        mo115798c(cVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40905d
    /* renamed from: a */
    public final void mo70111a(AbstractC40906e eVar) {
        this.f164587a = eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40905d
    /* renamed from: b */
    public final void mo70112b(final AbstractC40904c cVar) {
        ValueAnimator valueAnimator = this.f164591e;
        if (valueAnimator != null && valueAnimator.isStarted()) {
            this.f164591e.cancel();
        }
        this.f164587a.mo70108c();
        mo70108c();
        cVar.mo70108c();
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        this.f164592f = duration;
        duration.setInterpolator(new C17168c());
        final int measuredHeight = this.f164589c.getMeasuredHeight();
        this.f164592f.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.subtitle.C73289v.C732923 */

            static {
                Covode.recordClassIndex(86010);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C73289v.this.f164587a.mo70107b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                C73289v.this.mo70107b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                cVar.mo70107b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
            }
        });
        this.f164592f.addListener(new AnimatorListenerAdapter() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.subtitle.C73289v.C732934 */

            static {
                Covode.recordClassIndex(86011);
            }

            public final void onAnimationEnd(Animator animator) {
                C73289v.this.f164587a.mo70109d();
                C73289v.this.mo70109d();
                cVar.mo70109d();
            }
        });
        this.f164592f.start();
    }

    /* renamed from: c */
    public final void mo115798c(final AbstractC40904c cVar) {
        MethodCollector.m26663i(11428);
        ValueAnimator valueAnimator = this.f164592f;
        if (valueAnimator != null && valueAnimator.isStarted()) {
            this.f164592f.cancel();
        }
        this.f164589c.setAlpha(0.0f);
        if (this.f164589c.getParent() != null) {
            ((ViewGroup) this.f164589c.getParent()).removeView(this.f164589c);
        }
        this.f164588b.addView(this.f164589c);
        this.f164587a.mo70104a();
        mo70104a();
        cVar.mo70104a();
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        this.f164591e = duration;
        duration.setInterpolator(new C17168c());
        final int measuredHeight = this.f164589c.getMeasuredHeight();
        this.f164591e.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.subtitle.C73289v.C732901 */

            static {
                Covode.recordClassIndex(86008);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C73289v.this.f164587a.mo70105a(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                C73289v.this.mo70105a(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                cVar.mo70105a(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
            }
        });
        this.f164591e.addListener(new AnimatorListenerAdapter() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.subtitle.C73289v.C732912 */

            static {
                Covode.recordClassIndex(86009);
            }

            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                C73289v.this.f164587a.mo70106b();
                cVar.mo70106b();
            }
        });
        this.f164591e.start();
        MethodCollector.m26664o(11428);
    }

    public C73289v(ViewGroup viewGroup, View view, View view2) {
        this.f164588b = viewGroup;
        this.f164590d = view;
        this.f164589c = view2;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40904c
    /* renamed from: a */
    public final void mo70105a(float f, int i, int i2) {
        this.f164589c.setTranslationY(((float) i2) + (((float) (i - i2)) * f));
        this.f164589c.setAlpha(f);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40904c
    /* renamed from: b */
    public final void mo70107b(float f, int i, int i2) {
        this.f164589c.setTranslationY(((float) (i2 - i)) * f);
        this.f164589c.setAlpha(1.0f - f);
    }
}
