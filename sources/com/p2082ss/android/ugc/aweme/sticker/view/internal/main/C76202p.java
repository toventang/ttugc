package com.p2082ss.android.ugc.aweme.sticker.view.internal.main;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40904c;
import com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40905d;
import com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40906e;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.main.p */
public final class C76202p extends AbstractC40906e.C40907a implements AbstractC40905d {

    /* renamed from: a */
    public AbstractC40906e f171187a;

    /* renamed from: b */
    public final ViewGroup f171188b;

    /* renamed from: c */
    public final View f171189c;

    /* renamed from: d */
    public final View f171190d;

    /* renamed from: e */
    public final long f171191e;

    /* renamed from: f */
    public final Interpolator f171192f;

    /* renamed from: g */
    private final long f171193g = 250;

    static {
        Covode.recordClassIndex(89152);
    }

    /* renamed from: e */
    public final boolean mo119938e() {
        if (!C0792v.m2791y(this.f171189c)) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.main.p$b */
    public static final class C76204b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C76202p f171198a;

        /* renamed from: b */
        final /* synthetic */ AbstractC40904c f171199b;

        static {
            Covode.recordClassIndex(89154);
        }

        /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.main.p$b$a */
        static final class RunnableC76205a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C76204b f171200a;

            static {
                Covode.recordClassIndex(89155);
            }

            RunnableC76205a(C76204b bVar) {
                this.f171200a = bVar;
            }

            public final void run() {
                MethodCollector.m26663i(5878);
                this.f171200a.f171198a.f171188b.removeView(this.f171200a.f171198a.f171189c);
                MethodCollector.m26664o(5878);
            }
        }

        public final void onAnimationEnd(Animator animator) {
            C89219l.m154721d(animator, "");
            if (!this.f171198a.mo119938e()) {
                AbstractC40906e eVar = this.f171198a.f171187a;
                if (eVar != null) {
                    eVar.mo70109d();
                }
                this.f171198a.f171188b.post(new RunnableC76205a(this));
                AbstractC40904c cVar = this.f171199b;
                if (cVar != null) {
                    cVar.mo70109d();
                }
            }
        }

        C76204b(C76202p pVar, AbstractC40904c cVar) {
            this.f171198a = pVar;
            this.f171199b = cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.main.p$c */
    static final class RunnableC76206c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C76202p f171201a;

        /* renamed from: b */
        final /* synthetic */ AbstractC40904c f171202b;

        static {
            Covode.recordClassIndex(89156);
        }

        RunnableC76206c(C76202p pVar, AbstractC40904c cVar) {
            this.f171201a = pVar;
            this.f171202b = cVar;
        }

        public final void run() {
            if (this.f171201a.f171188b.indexOfChild(this.f171201a.f171189c) != -1 && !this.f171201a.mo119938e()) {
                AbstractC40906e eVar = this.f171201a.f171187a;
                if (eVar != null) {
                    eVar.mo70104a();
                }
                this.f171201a.f171190d.setVisibility(0);
                AbstractC40904c cVar = this.f171202b;
                if (cVar != null) {
                    cVar.mo70104a();
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(this.f171201a.f171191e);
                C89219l.m154716b(duration, "");
                duration.setInterpolator(this.f171201a.f171192f);
                final int measuredHeight = this.f171201a.f171190d.getMeasuredHeight();
                duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    /* class com.p2082ss.android.ugc.aweme.sticker.view.internal.main.C76202p.RunnableC76206c.C762071 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC76206c f171203a;

                    /* renamed from: b */
                    final /* synthetic */ int f171204b = 0;

                    static {
                        Covode.recordClassIndex(89157);
                    }

                    {
                        this.f171203a = r2;
                    }

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        C89219l.m154716b(valueAnimator, "");
                        float animatedFraction = valueAnimator.getAnimatedFraction();
                        AbstractC40906e eVar = this.f171203a.f171201a.f171187a;
                        if (eVar != null) {
                            eVar.mo70105a(animatedFraction, this.f171204b, measuredHeight);
                        }
                        int i = measuredHeight;
                        this.f171203a.f171201a.f171190d.setTranslationY(((float) i) + (((float) (this.f171204b - i)) * animatedFraction));
                        AbstractC40904c cVar = this.f171203a.f171202b;
                        if (cVar != null) {
                            cVar.mo70105a(animatedFraction, this.f171204b, measuredHeight);
                        }
                    }
                });
                duration.addListener(new AnimatorListenerAdapter(this) {
                    /* class com.p2082ss.android.ugc.aweme.sticker.view.internal.main.C76202p.RunnableC76206c.C762082 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC76206c f171206a;

                    static {
                        Covode.recordClassIndex(89158);
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f171206a = r1;
                    }

                    public final void onAnimationEnd(Animator animator) {
                        C89219l.m154721d(animator, "");
                        super.onAnimationEnd(animator);
                        if (!this.f171206a.f171201a.mo119938e()) {
                            AbstractC40906e eVar = this.f171206a.f171201a.f171187a;
                            if (eVar != null) {
                                eVar.mo70106b();
                            }
                            AbstractC40904c cVar = this.f171206a.f171202b;
                            if (cVar != null) {
                                cVar.mo70106b();
                            }
                        }
                    }
                });
                duration.start();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40905d
    /* renamed from: a */
    public final void mo70111a(AbstractC40906e eVar) {
        C89219l.m154721d(eVar, "");
        this.f171187a = eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40905d
    /* renamed from: a */
    public final void mo70110a(AbstractC40904c cVar) {
        MethodCollector.m26663i(6873);
        this.f171188b.removeAllViews();
        this.f171188b.addView(this.f171189c);
        this.f171188b.post(new RunnableC76206c(this, cVar));
        MethodCollector.m26664o(6873);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.main.p$a */
    static final class C76203a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C76202p f171194a;

        /* renamed from: b */
        final /* synthetic */ int f171195b = 0;

        /* renamed from: c */
        final /* synthetic */ int f171196c;

        /* renamed from: d */
        final /* synthetic */ AbstractC40904c f171197d;

        static {
            Covode.recordClassIndex(89153);
        }

        C76203a(C76202p pVar, int i, AbstractC40904c cVar) {
            this.f171194a = pVar;
            this.f171196c = i;
            this.f171197d = cVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154716b(valueAnimator, "");
            float animatedFraction = valueAnimator.getAnimatedFraction();
            AbstractC40906e eVar = this.f171194a.f171187a;
            if (eVar != null) {
                eVar.mo70107b(animatedFraction, this.f171195b, this.f171196c);
            }
            this.f171194a.f171190d.setTranslationY(((float) (this.f171196c - this.f171195b)) * animatedFraction);
            AbstractC40904c cVar = this.f171197d;
            if (cVar != null) {
                cVar.mo70107b(animatedFraction, this.f171195b, this.f171196c);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40905d
    /* renamed from: b */
    public final void mo70112b(AbstractC40904c cVar) {
        AbstractC40906e eVar = this.f171187a;
        if (eVar != null) {
            eVar.mo70108c();
        }
        cVar.mo70108c();
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(this.f171193g);
        duration.addUpdateListener(new C76203a(this, this.f171190d.getMeasuredHeight(), cVar));
        duration.addListener(new C76204b(this, cVar));
        duration.start();
    }

    public C76202p(ViewGroup viewGroup, View view, View view2, long j, long j2, Interpolator interpolator) {
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(view2, "");
        C89219l.m154721d(interpolator, "");
        this.f171188b = viewGroup;
        this.f171189c = view;
        this.f171190d = view2;
        this.f171191e = j;
        this.f171192f = interpolator;
    }
}
