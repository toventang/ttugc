package com.p2082ss.android.ugc.aweme.filter.view.internal.main;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40904c;
import com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40905d;
import com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40906e;
import com.p2082ss.android.ugc.tools.view.p4364c.C84952c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.q */
public final class C50928q extends AbstractC40906e.C40907a implements AbstractC40905d {

    /* renamed from: d */
    public static final C50929a f117517d = new C50929a((byte) 0);

    /* renamed from: a */
    public AbstractC40906e f117518a;

    /* renamed from: b */
    public final View f117519b;

    /* renamed from: c */
    public final long f117520c;

    static {
        Covode.recordClassIndex(60103);
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.q$a */
    public static final class C50929a {
        static {
            Covode.recordClassIndex(60104);
        }

        private C50929a() {
        }

        public /* synthetic */ C50929a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.q$d */
    public static final class RunnableC50932d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C50928q f117526a;

        /* renamed from: b */
        final /* synthetic */ AbstractC40904c f117527b;

        static {
            Covode.recordClassIndex(60107);
        }

        RunnableC50932d(C50928q qVar, AbstractC40904c cVar) {
            this.f117526a = qVar;
            this.f117527b = cVar;
        }

        public final void run() {
            AbstractC40906e eVar = this.f117526a.f117518a;
            if (eVar != null) {
                eVar.mo70104a();
            }
            AbstractC40904c cVar = this.f117527b;
            if (cVar != null) {
                cVar.mo70104a();
            }
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(this.f117526a.f117520c);
            C89219l.m154716b(duration, "");
            duration.setInterpolator(new C84952c());
            final int measuredHeight = this.f117526a.f117519b.getMeasuredHeight();
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                /* class com.p2082ss.android.ugc.aweme.filter.view.internal.main.C50928q.RunnableC50932d.C509331 */

                /* renamed from: a */
                final /* synthetic */ RunnableC50932d f117528a;

                static {
                    Covode.recordClassIndex(60108);
                }

                {
                    this.f117528a = r1;
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C89219l.m154716b(valueAnimator, "");
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    int i = measuredHeight;
                    AbstractC40906e eVar = this.f117528a.f117526a.f117518a;
                    if (eVar != null) {
                        eVar.mo70105a(animatedFraction, 0, i);
                    }
                    this.f117528a.f117526a.f117519b.setTranslationY(((float) i) + (((float) (0 - i)) * animatedFraction));
                    this.f117528a.f117526a.f117519b.setAlpha(animatedFraction);
                    AbstractC40904c cVar = this.f117528a.f117527b;
                    if (cVar != null) {
                        cVar.mo70105a(animatedFraction, 0, i);
                    }
                }
            });
            duration.addListener(new AnimatorListenerAdapter(this) {
                /* class com.p2082ss.android.ugc.aweme.filter.view.internal.main.C50928q.RunnableC50932d.C509342 */

                /* renamed from: a */
                final /* synthetic */ RunnableC50932d f117530a;

                static {
                    Covode.recordClassIndex(60109);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f117530a = r1;
                }

                public final void onAnimationEnd(Animator animator) {
                    AbstractC40906e eVar = this.f117530a.f117526a.f117518a;
                    if (eVar != null) {
                        eVar.mo70106b();
                    }
                    AbstractC40904c cVar = this.f117530a.f117527b;
                    if (cVar != null) {
                        cVar.mo70106b();
                    }
                }
            });
            duration.start();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40905d
    /* renamed from: a */
    public final void mo70111a(AbstractC40906e eVar) {
        C89219l.m154721d(eVar, "");
        this.f117518a = eVar;
    }

    private C50928q(View view) {
        C89219l.m154721d(view, "");
        this.f117519b = view;
        this.f117520c = 200;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40905d
    /* renamed from: a */
    public final void mo70110a(AbstractC40904c cVar) {
        this.f117519b.post(new RunnableC50932d(this, cVar));
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.q$c */
    public static final class C50931c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C50928q f117524a;

        /* renamed from: b */
        final /* synthetic */ AbstractC40904c f117525b;

        static {
            Covode.recordClassIndex(60106);
        }

        public final void onAnimationEnd(Animator animator) {
            AbstractC40906e eVar = this.f117524a.f117518a;
            if (eVar != null) {
                eVar.mo70109d();
            }
            AbstractC40904c cVar = this.f117525b;
            if (cVar != null) {
                cVar.mo70109d();
            }
        }

        C50931c(C50928q qVar, AbstractC40904c cVar) {
            this.f117524a = qVar;
            this.f117525b = cVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.q$b */
    public static final class C50930b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C50928q f117521a;

        /* renamed from: b */
        final /* synthetic */ int f117522b;

        /* renamed from: c */
        final /* synthetic */ AbstractC40904c f117523c;

        static {
            Covode.recordClassIndex(60105);
        }

        C50930b(C50928q qVar, int i, AbstractC40904c cVar) {
            this.f117521a = qVar;
            this.f117522b = i;
            this.f117523c = cVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154716b(valueAnimator, "");
            float animatedFraction = valueAnimator.getAnimatedFraction();
            int i = this.f117522b;
            AbstractC40906e eVar = this.f117521a.f117518a;
            if (eVar != null) {
                eVar.mo70107b(animatedFraction, 0, i);
            }
            this.f117521a.f117519b.setTranslationY(((float) (i + 0)) * animatedFraction);
            this.f117521a.f117519b.setAlpha(1.0f - animatedFraction);
            AbstractC40904c cVar = this.f117523c;
            if (cVar != null) {
                cVar.mo70107b(animatedFraction, 0, i);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40905d
    /* renamed from: b */
    public final void mo70112b(AbstractC40904c cVar) {
        AbstractC40906e eVar = this.f117518a;
        if (eVar != null) {
            eVar.mo70108c();
        }
        cVar.mo70108c();
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(this.f117520c);
        duration.addUpdateListener(new C50930b(this, this.f117519b.getMeasuredHeight(), cVar));
        duration.addListener(new C50931c(this, cVar));
        duration.start();
    }

    public /* synthetic */ C50928q(View view, byte b) {
        this(view);
    }
}
