package com.p2082ss.android.ugc.aweme.shortvideo.duet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.C1764a;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.adaptation.C33398a;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.f */
public final class C70670f implements Animator.AnimatorListener {

    /* renamed from: a */
    final LottieAnimationView f158182a;

    /* renamed from: b */
    public ValueAnimator f158183b;

    /* renamed from: c */
    final long f158184c;

    /* renamed from: d */
    final float f158185d;

    /* renamed from: e */
    final long f158186e;

    /* renamed from: f */
    final long f158187f;

    /* renamed from: g */
    public float f158188g;

    /* renamed from: h */
    public AbstractC89183m<? super Float, ? super Float, C89391z> f158189h;

    /* renamed from: i */
    public AbstractC89171a<C89391z> f158190i;

    /* renamed from: j */
    final ViewGroup f158191j;

    /* renamed from: k */
    final EnumC70671a f158192k;

    /* renamed from: l */
    private final long f158193l;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.f$a */
    public enum EnumC70671a {
        UP_DOWN,
        THREE_SCREEN,
        NONE;

        static {
            Covode.recordClassIndex(83142);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.f$f */
    final /* synthetic */ class RunnableC70676f implements Runnable {

        /* renamed from: a */
        private final /* synthetic */ AbstractC89171a f158198a;

        static {
            Covode.recordClassIndex(83147);
        }

        RunnableC70676f(AbstractC89171a aVar) {
            this.f158198a = aVar;
        }

        public final /* synthetic */ void run() {
            C89219l.m154716b(this.f158198a.invoke(), "");
        }
    }

    static {
        Covode.recordClassIndex(83141);
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.f$e */
    static final class RunnableC70675e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C70670f f158197a;

        static {
            Covode.recordClassIndex(83146);
        }

        RunnableC70675e(C70670f fVar) {
            this.f158197a = fVar;
        }

        public final void run() {
            ValueAnimator valueAnimator = this.f158197a.f158183b;
            if (valueAnimator != null) {
                valueAnimator.start();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.f$g */
    static final class RunnableC70677g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C70670f f158199a;

        static {
            Covode.recordClassIndex(83148);
        }

        RunnableC70677g(C70670f fVar) {
            this.f158199a = fVar;
        }

        public final void run() {
            ValueAnimator valueAnimator = this.f158199a.f158183b;
            if (valueAnimator != null) {
                valueAnimator.start();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.f$h */
    static final /* synthetic */ class C70678h extends C89217j implements AbstractC89171a<C89391z> {
        static {
            Covode.recordClassIndex(83149);
        }

        C70678h(C70670f fVar) {
            super(0, fVar, C70670f.class, "startAnimation", "startAnimation()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C70670f fVar = (C70670f) this.receiver;
            fVar.f158182a.mo5826a();
            fVar.f158182a.setVisibility(0);
            fVar.f158182a.postDelayed(new RunnableC70677g(fVar), fVar.f158186e);
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    private final void m124906b() {
        int i = C70680g.f158202b[this.f158192k.ordinal()];
        if (i == 1) {
            C70683j.m124919a();
        } else if (i == 2) {
            C70683j.m124921b();
        }
    }

    /* renamed from: a */
    public final void mo111497a() {
        ValueAnimator valueAnimator = this.f158183b;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
        }
        this.f158182a.mo5835c();
        this.f158182a.mo5836d();
        this.f158182a.setVisibility(8);
        m124906b();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.f$d */
    static final /* synthetic */ class C70674d extends C89217j implements AbstractC89171a<C89391z> {
        static {
            Covode.recordClassIndex(83145);
        }

        C70674d(C70670f fVar) {
            super(0, fVar, C70670f.class, "restartAnimation", "restartAnimation()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C70670f fVar = (C70670f) this.receiver;
            fVar.f158182a.mo5831b();
            fVar.f158182a.setTranslationY(fVar.f158188g);
            AbstractC89183m<? super Float, ? super Float, C89391z> mVar = fVar.f158189h;
            if (mVar != null) {
                mVar.invoke(Float.valueOf(fVar.f158188g), Float.valueOf(0.0f));
            }
            fVar.f158182a.postDelayed(new RunnableC70675e(fVar), fVar.f158186e);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.f$c */
    public static final class C70673c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C70670f f158196a;

        static {
            Covode.recordClassIndex(83144);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C70673c(C70670f fVar) {
            this.f158196a = fVar;
        }

        public final void onAnimationEnd(Animator animator) {
            AbstractC89171a<C89391z> aVar = this.f158196a.f158190i;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.f$b */
    static final class C70672b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C70670f f158195a;

        static {
            Covode.recordClassIndex(83143);
        }

        C70672b(C70670f fVar) {
            this.f158195a = fVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (valueAnimator != null) {
                C70670f fVar = this.f158195a;
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                fVar.f158182a.setAlpha(((Float) animatedValue).floatValue());
            }
        }
    }

    public final void onAnimationRepeat(Animator animator) {
        this.f158182a.mo5837e();
        this.f158182a.postDelayed(new RunnableC70676f(new C70674d(this)), this.f158187f);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.f$i */
    static final class C70679i implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C70670f f158200a;

        static {
            Covode.recordClassIndex(83150);
        }

        C70679i(C70670f fVar) {
            this.f158200a = fVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (valueAnimator != null) {
                AbstractC89183m<? super Float, ? super Float, C89391z> mVar = this.f158200a.f158189h;
                if (mVar != null) {
                    Float valueOf = Float.valueOf(this.f158200a.f158188g);
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                    mVar.invoke(valueOf, animatedValue);
                }
                C70670f fVar = this.f158200a;
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                fVar.f158182a.setTranslationY(((Float) animatedValue2).floatValue() + this.f158200a.f158188g);
            }
        }
    }

    public final void onAnimationEnd(Animator animator) {
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(this.f158193l);
        duration.removeAllUpdateListeners();
        duration.addUpdateListener(new C70672b(this));
        duration.addListener(new C70673c(this));
        duration.start();
        m124906b();
    }

    public C70670f(ViewGroup viewGroup, EnumC70671a aVar) {
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(aVar, "");
        MethodCollector.m26663i(9172);
        this.f158191j = viewGroup;
        this.f158192k = aVar;
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.b3h, viewGroup, false);
        if (a != null) {
            LottieAnimationView lottieAnimationView = (LottieAnimationView) a;
            this.f158182a = lottieAnimationView;
            this.f158184c = 880;
            this.f158186e = 680;
            this.f158193l = 520;
            this.f158187f = 300;
            viewGroup.addView(lottieAnimationView);
            this.f158185d = (float) C33398a.f79357a.mo59452b(C33398a.m68487c());
            MethodCollector.m26664o(9172);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.airbnb.lottie.LottieAnimationView");
        MethodCollector.m26664o(9172);
        throw nullPointerException;
    }
}
