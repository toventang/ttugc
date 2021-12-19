package com.p2082ss.android.ugc.tools.view.base;

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

/* renamed from: com.ss.android.ugc.tools.view.base.f */
public final class C84943f extends AbstractC40906e.C40907a implements AbstractC40905d {

    /* renamed from: d */
    public static final C84944a f189806d = new C84944a((byte) 0);

    /* renamed from: a */
    public AbstractC40906e f189807a;

    /* renamed from: b */
    public final View f189808b;

    /* renamed from: c */
    public final long f189809c = 490;

    /* renamed from: e */
    private final long f189810e = 250;

    static {
        Covode.recordClassIndex(98938);
    }

    /* renamed from: com.ss.android.ugc.tools.view.base.f$a */
    public static final class C84944a {
        static {
            Covode.recordClassIndex(98939);
        }

        private C84944a() {
        }

        public /* synthetic */ C84944a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.tools.view.base.f$d */
    static final class RunnableC84947d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C84943f f189816a;

        /* renamed from: b */
        final /* synthetic */ AbstractC40904c f189817b;

        static {
            Covode.recordClassIndex(98942);
        }

        RunnableC84947d(C84943f fVar, AbstractC40904c cVar) {
            this.f189816a = fVar;
            this.f189817b = cVar;
        }

        public final void run() {
            AbstractC40904c cVar = this.f189817b;
            if (cVar != null) {
                cVar.mo70104a();
            }
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(this.f189816a.f189809c);
            C89219l.m154716b(duration, "");
            duration.setInterpolator(new C84952c());
            final int measuredHeight = this.f189816a.f189808b.getMeasuredHeight();
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                /* class com.p2082ss.android.ugc.tools.view.base.C84943f.RunnableC84947d.C849481 */

                /* renamed from: a */
                final /* synthetic */ RunnableC84947d f189818a;

                static {
                    Covode.recordClassIndex(98943);
                }

                {
                    this.f189818a = r1;
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C89219l.m154716b(valueAnimator, "");
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    int i = measuredHeight;
                    AbstractC40906e eVar = this.f189818a.f189816a.f189807a;
                    if (eVar != null) {
                        eVar.mo70105a(animatedFraction, 0, i);
                    }
                    this.f189818a.f189816a.f189808b.setTranslationY(((float) i) + (((float) (0 - i)) * animatedFraction));
                    this.f189818a.f189816a.f189808b.setAlpha(animatedFraction);
                    AbstractC40904c cVar = this.f189818a.f189817b;
                    if (cVar != null) {
                        cVar.mo70105a(animatedFraction, 0, i);
                    }
                }
            });
            duration.addListener(new AnimatorListenerAdapter(this) {
                /* class com.p2082ss.android.ugc.tools.view.base.C84943f.RunnableC84947d.C849492 */

                /* renamed from: a */
                final /* synthetic */ RunnableC84947d f189820a;

                static {
                    Covode.recordClassIndex(98944);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f189820a = r1;
                }

                public final void onAnimationEnd(Animator animator) {
                    AbstractC40906e eVar = this.f189820a.f189816a.f189807a;
                    if (eVar != null) {
                        eVar.mo70106b();
                    }
                    AbstractC40904c cVar = this.f189820a.f189817b;
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
        this.f189807a = eVar;
    }

    /* renamed from: com.ss.android.ugc.tools.view.base.f$c */
    public static final class C84946c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C84943f f189814a;

        /* renamed from: b */
        final /* synthetic */ AbstractC40904c f189815b;

        static {
            Covode.recordClassIndex(98941);
        }

        public final void onAnimationEnd(Animator animator) {
            AbstractC40906e eVar = this.f189814a.f189807a;
            if (eVar != null) {
                eVar.mo70109d();
            }
            AbstractC40904c cVar = this.f189815b;
            if (cVar != null) {
                cVar.mo70109d();
            }
        }

        C84946c(C84943f fVar, AbstractC40904c cVar) {
            this.f189814a = fVar;
            this.f189815b = cVar;
        }
    }

    public C84943f(View view) {
        C89219l.m154721d(view, "");
        this.f189808b = view;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40905d
    /* renamed from: a */
    public final void mo70110a(AbstractC40904c cVar) {
        AbstractC40906e eVar = this.f189807a;
        if (eVar != null) {
            eVar.mo70104a();
        }
        this.f189808b.setAlpha(0.0f);
        this.f189808b.post(new RunnableC84947d(this, cVar));
    }

    /* renamed from: com.ss.android.ugc.tools.view.base.f$b */
    static final class C84945b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C84943f f189811a;

        /* renamed from: b */
        final /* synthetic */ int f189812b;

        /* renamed from: c */
        final /* synthetic */ AbstractC40904c f189813c;

        static {
            Covode.recordClassIndex(98940);
        }

        C84945b(C84943f fVar, int i, AbstractC40904c cVar) {
            this.f189811a = fVar;
            this.f189812b = i;
            this.f189813c = cVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154716b(valueAnimator, "");
            float animatedFraction = valueAnimator.getAnimatedFraction();
            int i = this.f189812b;
            AbstractC40906e eVar = this.f189811a.f189807a;
            if (eVar != null) {
                eVar.mo70107b(animatedFraction, 0, i);
            }
            this.f189811a.f189808b.setTranslationY(((float) (i + 0)) * animatedFraction);
            this.f189811a.f189808b.setAlpha(1.0f - animatedFraction);
            AbstractC40904c cVar = this.f189813c;
            if (cVar != null) {
                cVar.mo70107b(animatedFraction, 0, i);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40905d
    /* renamed from: b */
    public final void mo70112b(AbstractC40904c cVar) {
        AbstractC40906e eVar = this.f189807a;
        if (eVar != null) {
            eVar.mo70108c();
        }
        cVar.mo70108c();
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(this.f189810e);
        duration.addUpdateListener(new C84945b(this, this.f189808b.getMeasuredHeight(), cVar));
        duration.addListener(new C84946c(this, cVar));
        duration.start();
    }
}
