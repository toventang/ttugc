package com.p2082ss.android.ugc.aweme.sticker.panel.guide;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0550b;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.C1764a;
import com.airbnb.lottie.AbstractC2186i;
import com.airbnb.lottie.C2044e;
import com.airbnb.lottie.C2108f;
import com.airbnb.lottie.C2208m;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.effectplatform.C46402a;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75457a;
import com.p2082ss.android.ugc.aweme.sticker.panel.guide.AbstractC75547h;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.guide.k */
public final class C75551k implements AbstractC75544f {

    /* renamed from: k */
    public static final C75553b f169791k = new C75553b((byte) 0);

    /* renamed from: a */
    public final Effect f169792a;

    /* renamed from: b */
    public final AbstractC75547h f169793b;

    /* renamed from: c */
    public FrameLayout f169794c;

    /* renamed from: d */
    public View f169795d;

    /* renamed from: e */
    public LottieAnimationView f169796e;

    /* renamed from: f */
    public FrameLayout f169797f;

    /* renamed from: g */
    public boolean f169798g;

    /* renamed from: h */
    public View f169799h;

    /* renamed from: i */
    public final Runnable f169800i = new RunnableC75555d(this);

    /* renamed from: j */
    public final Animation f169801j;

    /* renamed from: l */
    private final ExtraParams f169802l;

    /* renamed from: m */
    private C2208m<C2044e> f169803m;

    /* renamed from: n */
    private boolean f169804n;

    /* renamed from: o */
    private final AbstractC2186i<C2044e> f169805o;

    /* renamed from: p */
    private final AbstractC2186i<Throwable> f169806p;

    static {
        Covode.recordClassIndex(88475);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.guide.k$b */
    public static final class C75553b {
        static {
            Covode.recordClassIndex(88477);
        }

        private C75553b() {
        }

        public /* synthetic */ C75553b(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.guide.AbstractC75544f
    /* renamed from: b */
    public final boolean mo112005b() {
        return this.f169804n;
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.guide.k$d */
    static final class RunnableC75555d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C75551k f169809a;

        static {
            Covode.recordClassIndex(88479);
        }

        RunnableC75555d(C75551k kVar) {
            this.f169809a = kVar;
        }

        public final void run() {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.setDuration(300L);
            ofFloat.addUpdateListener(new C75556a(this));
            ofFloat.addListener(new C75557b(this));
            ofFloat.start();
        }

        /* renamed from: com.ss.android.ugc.aweme.sticker.panel.guide.k$d$b */
        public static final class C75557b extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ RunnableC75555d f169811a;

            static {
                Covode.recordClassIndex(88481);
            }

            C75557b(RunnableC75555d dVar) {
                this.f169811a = dVar;
            }

            public final void onAnimationEnd(Animator animator) {
                this.f169811a.f169809a.mo112003a();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.sticker.panel.guide.k$d$a */
        static final class C75556a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ RunnableC75555d f169810a;

            static {
                Covode.recordClassIndex(88480);
            }

            C75556a(RunnableC75555d dVar) {
                this.f169810a = dVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                View view = this.f169810a.f169809a.f169795d;
                if (view != null) {
                    C89219l.m154716b(valueAnimator, "");
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                    view.setAlpha(((Float) animatedValue).floatValue());
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.guide.AbstractC75544f
    /* renamed from: a */
    public final void mo112003a() {
        FrameLayout frameLayout;
        MethodCollector.m26663i(4967);
        C2208m<C2044e> mVar = this.f169803m;
        if (mVar != null) {
            mVar.mo6135b(this.f169805o);
            AbstractC2186i<Throwable> iVar = this.f169806p;
            if (iVar != null) {
                mVar.mo6137d(iVar);
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.airbnb.lottie.LottieListener<com.airbnb.lottie.LottieComposition>");
                MethodCollector.m26664o(4967);
                throw nullPointerException;
            }
        }
        LottieAnimationView lottieAnimationView = this.f169796e;
        if (lottieAnimationView != null) {
            lottieAnimationView.mo5836d();
        }
        FrameLayout frameLayout2 = this.f169794c;
        if (frameLayout2 != null) {
            frameLayout2.removeCallbacks(this.f169800i);
        }
        View view = this.f169795d;
        if (!(view == null || (frameLayout = this.f169794c) == null)) {
            frameLayout.removeView(view);
        }
        this.f169804n = false;
        MethodCollector.m26664o(4967);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.guide.k$a  reason: invalid class name */
    public static final class animationAnimation$AnimationListenerC75552a implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ C75551k f169807a;

        static {
            Covode.recordClassIndex(88476);
        }

        public final void onAnimationRepeat(Animation animation) {
        }

        public final void onAnimationStart(Animation animation) {
        }

        animationAnimation$AnimationListenerC75552a(C75551k kVar) {
            this.f169807a = kVar;
        }

        public final void onAnimationEnd(Animation animation) {
            FrameLayout frameLayout = this.f169807a.f169797f;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.guide.k$f */
    public static final class C75559f extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C75551k f169813a;

        static {
            Covode.recordClassIndex(88483);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C75559f(C75551k kVar) {
            this.f169813a = kVar;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f169813a.f169800i.run();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.guide.k$e */
    static final class View$OnClickListenerC75558e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C75551k f169812a;

        static {
            Covode.recordClassIndex(88482);
        }

        View$OnClickListenerC75558e(C75551k kVar) {
            this.f169812a = kVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f169812a.f169800i.run();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.guide.k$c */
    static final class C75554c<T> implements AbstractC2186i<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C75551k f169808a;

        static {
            Covode.recordClassIndex(88478);
        }

        C75554c(C75551k kVar) {
            this.f169808a = kVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.airbnb.lottie.AbstractC2186i
        /* renamed from: a */
        public final /* synthetic */ void mo5889a(Throwable th) {
            FrameLayout frameLayout = this.f169808a.f169794c;
            if (frameLayout != null) {
                frameLayout.postDelayed(this.f169808a.f169800i, 5000);
            }
            AbstractC75547h hVar = this.f169808a.f169793b;
            if (hVar != null) {
                hVar.mo119249a(false, this.f169808a.f169792a, AbstractC75547h.EnumC75548a.LOTTIE);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.guide.k$g */
    static final class C75560g<T> implements AbstractC2186i<C2044e> {

        /* renamed from: a */
        final /* synthetic */ C75551k f169814a;

        static {
            Covode.recordClassIndex(88484);
        }

        C75560g(C75551k kVar) {
            this.f169814a = kVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.airbnb.lottie.AbstractC2186i
        /* renamed from: a */
        public final /* synthetic */ void mo5889a(C2044e eVar) {
            C2044e eVar2 = eVar;
            LottieAnimationView lottieAnimationView = this.f169814a.f169796e;
            if (lottieAnimationView != null) {
                lottieAnimationView.setComposition(eVar2);
            }
            FrameLayout frameLayout = this.f169814a.f169797f;
            if (frameLayout != null) {
                frameLayout.startAnimation(this.f169814a.f169801j);
            }
            FrameLayout frameLayout2 = this.f169814a.f169797f;
            if (frameLayout2 != null) {
                frameLayout2.postDelayed(new Runnable(this) {
                    /* class com.p2082ss.android.ugc.aweme.sticker.panel.guide.C75551k.C75560g.RunnableC755611 */

                    /* renamed from: a */
                    final /* synthetic */ C75560g f169815a;

                    static {
                        Covode.recordClassIndex(88485);
                    }

                    {
                        this.f169815a = r1;
                    }

                    public final void run() {
                        int i;
                        View view = this.f169815a.f169814a.f169799h;
                        if (view != null) {
                            if (this.f169815a.f169814a.f169798g) {
                                i = 0;
                            } else {
                                i = 4;
                            }
                            view.setVisibility(i);
                        }
                        LottieAnimationView lottieAnimationView = this.f169815a.f169814a.f169796e;
                        if (lottieAnimationView != null) {
                            lottieAnimationView.mo5826a();
                        }
                    }
                }, 300);
            }
            AbstractC75547h hVar = this.f169814a.f169793b;
            if (hVar != null) {
                hVar.mo119249a(true, this.f169814a.f169792a, AbstractC75547h.EnumC75548a.LOTTIE);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.guide.AbstractC75544f
    /* renamed from: a */
    public final void mo112004a(FrameLayout frameLayout) {
        ConstraintLayout constraintLayout;
        boolean z;
        String str;
        TextView textView;
        MethodCollector.m26663i(4963);
        if (frameLayout == null) {
            MethodCollector.m26664o(4963);
            return;
        }
        ExtraParams extraParams = this.f169802l;
        if (extraParams == null || !extraParams.isLottieValid()) {
            MethodCollector.m26664o(4963);
            return;
        }
        this.f169794c = frameLayout;
        View a = C1764a.m5927a(LayoutInflater.from(frameLayout.getContext()), R.layout.aht, frameLayout, false);
        this.f169795d = a;
        frameLayout.addView(a, 0);
        View view = this.f169795d;
        if (view == null) {
            C89219l.m154715b();
        }
        this.f169796e = (LottieAnimationView) view.findViewById(R.id.e8u);
        View view2 = this.f169795d;
        if (view2 == null) {
            C89219l.m154715b();
        }
        this.f169797f = (FrameLayout) view2.findViewById(R.id.bcp);
        View view3 = this.f169795d;
        if (view3 == null) {
            C89219l.m154715b();
        }
        View findViewById = view3.findViewById(R.id.e8v);
        this.f169799h = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(new View$OnClickListenerC75558e(this));
        }
        LottieAnimationView lottieAnimationView = this.f169796e;
        if (lottieAnimationView != null) {
            lottieAnimationView.setRepeatCount(1);
        }
        LottieAnimationView lottieAnimationView2 = this.f169796e;
        if (lottieAnimationView2 != null) {
            lottieAnimationView2.mo5828a(new C75559f(this));
        }
        View view4 = this.f169795d;
        if (!(view4 == null || (textView = (TextView) view4.findViewById(R.id.e97)) == null)) {
            String hint = this.f169792a.getHint();
            if (hint == null || hint.length() <= 0) {
                textView.setText("");
            } else {
                textView.startAnimation(C75457a.m132326a(0.0f, 1.0f, 300));
                textView.setText(this.f169792a.getHint());
            }
        }
        View view5 = this.f169795d;
        ViewGroup.LayoutParams layoutParams = null;
        if (view5 != null) {
            constraintLayout = (ConstraintLayout) view5.findViewById(R.id.ad6);
        } else {
            constraintLayout = null;
        }
        if (1 == this.f169802l.lottieType) {
            C0550b bVar = new C0550b();
            bVar.mo2451a(constraintLayout);
            Context context = frameLayout.getContext();
            C89219l.m154716b(context, "");
            bVar.mo2453b(R.id.bcp, (int) C84912r.m145930a(context, 240.0f));
            bVar.mo2450a(R.id.bcp, "4:3");
            bVar.mo2454b(constraintLayout);
        }
        if (this.f169802l.manualClose == 1) {
            z = true;
        } else {
            z = false;
        }
        this.f169798g = z;
        Context context2 = frameLayout.getContext();
        C89219l.m154716b(context2, "");
        int a2 = (int) C84912r.m145930a(context2, 264.0f);
        View view6 = this.f169795d;
        if (!(view6 == null || (layoutParams = view6.getLayoutParams()) == null)) {
            layoutParams.height = C70636dh.m124836e(frameLayout.getContext()) - a2;
        }
        View view7 = this.f169795d;
        if (view7 != null) {
            view7.setLayoutParams(layoutParams);
        }
        if (constraintLayout != null) {
            ViewGroup.LayoutParams layoutParams2 = constraintLayout.getLayoutParams();
            if (layoutParams2 != null) {
                int e = C70636dh.m124836e(frameLayout.getContext()) - a2;
                Context context3 = frameLayout.getContext();
                C89219l.m154716b(context3, "");
                layoutParams2.height = e - ((int) C84912r.m145930a(context3, 112.0f));
            }
            if (constraintLayout != null) {
                constraintLayout.setLayoutParams(layoutParams2);
            }
        }
        UrlModel a3 = C46402a.m89551a(this.f169792a.getHintFile());
        C89219l.m154716b(a3, "");
        List<String> urlList = a3.getUrlList();
        if (urlList == null || (str = urlList.get(0)) == null) {
            FrameLayout frameLayout2 = this.f169794c;
            if (frameLayout2 != null) {
                frameLayout2.postDelayed(this.f169800i, 5000);
            }
        } else {
            this.f169803m = C2108f.m6591a(frameLayout.getContext(), str).mo6130a(this.f169805o).mo6136c(this.f169806p);
        }
        this.f169804n = true;
        MethodCollector.m26664o(4963);
    }

    public C75551k(Effect effect, ExtraParams extraParams, AbstractC75547h hVar) {
        C89219l.m154721d(effect, "");
        C89219l.m154721d(extraParams, "");
        this.f169792a = effect;
        this.f169802l = extraParams;
        this.f169793b = hVar;
        Animation a = C75457a.m132326a(0.0f, 1.0f, 300);
        a.setFillAfter(true);
        a.setAnimationListener(new animationAnimation$AnimationListenerC75552a(this));
        this.f169801j = a;
        this.f169805o = new C75560g(this);
        this.f169806p = new C75554c(this);
    }
}
