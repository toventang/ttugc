package com.p2082ss.android.ugc.aweme.commercialize.egg.impl.p2558b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.airbnb.lottie.C2044e;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AnimationImageView;
import com.p2082ss.android.ugc.aweme.commercialize.egg.p2552a.AbstractC37781a;
import com.p2082ss.android.ugc.aweme.commercialize.egg.p2555d.C37787a;
import com.p2082ss.android.ugc.aweme.commercialize.egg.p2555d.C37791c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.b.d */
public final class C37815d extends AbstractC37801a {

    /* renamed from: f */
    public static final C37816a f89293f = new C37816a((byte) 0);

    /* renamed from: g */
    private AnimationImageView f89294g;

    /* renamed from: h */
    private AnimationImageView f89295h;

    /* renamed from: i */
    private long f89296i;

    static {
        Covode.recordClassIndex(45262);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.b.d$a */
    public static final class C37816a {
        static {
            Covode.recordClassIndex(45263);
        }

        private C37816a() {
        }

        public /* synthetic */ C37816a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.egg.impl.p2558b.AbstractC37801a
    /* renamed from: c */
    public final void mo65818c() {
        MethodCollector.m26663i(8734);
        AnimationImageView animationImageView = this.f89294g;
        if (animationImageView != null) {
            animationImageView.setVisibility(8);
        }
        AnimationImageView animationImageView2 = this.f89295h;
        if (animationImageView2 != null) {
            animationImageView2.setVisibility(8);
        }
        AnimationImageView animationImageView3 = this.f89294g;
        if (animationImageView3 != null) {
            this.f89269e.removeView(animationImageView3);
            animationImageView3.mo5836d();
        }
        AnimationImageView animationImageView4 = this.f89295h;
        if (animationImageView4 != null) {
            this.f89269e.removeView(animationImageView4);
            animationImageView4.mo5836d();
        }
        this.f89267c = null;
        this.f89294g = null;
        this.f89295h = null;
        MethodCollector.m26664o(8734);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.egg.impl.p2558b.AbstractC37801a
    /* renamed from: b */
    public final void mo65817b() {
        C2044e eVar;
        C37791c cVar;
        MethodCollector.m26663i(8405);
        C37787a aVar = this.f89266b;
        if (aVar == null || (cVar = aVar.f89221k) == null) {
            eVar = null;
        } else {
            eVar = cVar.f89241a;
        }
        if (eVar != null) {
            Context context = this.f89265a;
            if (this.f89294g == null) {
                this.f89294g = m76469a(context);
                this.f89269e.addView(this.f89294g);
            }
            if (this.f89295h == null) {
                this.f89295h = m76469a(context);
                this.f89269e.addView(this.f89295h);
            }
            if (this.f89296i == 0 || System.currentTimeMillis() - this.f89296i > 800) {
                AnimationImageView animationImageView = this.f89294g;
                if (animationImageView == null || this.f89295h == null) {
                    MethodCollector.m26664o(8405);
                    return;
                } else if (!((LottieAnimationView) animationImageView).f5900b.mo6025g()) {
                    AnimationImageView animationImageView2 = this.f89294g;
                    if (animationImageView2 != null) {
                        animationImageView2.setVisibility(0);
                    }
                    AnimationImageView animationImageView3 = this.f89294g;
                    if (animationImageView3 != null) {
                        animationImageView3.setComposition(eVar);
                    }
                    AnimationImageView animationImageView4 = this.f89294g;
                    if (animationImageView4 != null) {
                        animationImageView4.mo5826a();
                    }
                    AbstractC37781a aVar2 = this.f89267c;
                    if (aVar2 != null) {
                        aVar2.mo65779a();
                    }
                    this.f89296i = System.currentTimeMillis();
                    mo65819d();
                    MethodCollector.m26664o(8405);
                    return;
                } else {
                    AnimationImageView animationImageView5 = this.f89295h;
                    if (animationImageView5 == null) {
                        C89219l.m154715b();
                    }
                    if (!((LottieAnimationView) animationImageView5).f5900b.mo6025g()) {
                        AnimationImageView animationImageView6 = this.f89295h;
                        if (animationImageView6 != null) {
                            animationImageView6.setVisibility(0);
                        }
                        AnimationImageView animationImageView7 = this.f89295h;
                        if (animationImageView7 != null) {
                            animationImageView7.setComposition(eVar);
                        }
                        AnimationImageView animationImageView8 = this.f89295h;
                        if (animationImageView8 != null) {
                            animationImageView8.mo5826a();
                        }
                        AbstractC37781a aVar3 = this.f89267c;
                        if (aVar3 != null) {
                            aVar3.mo65779a();
                        }
                        this.f89296i = System.currentTimeMillis();
                        mo65819d();
                    }
                    MethodCollector.m26664o(8405);
                    return;
                }
            }
        } else {
            AbstractC37781a aVar4 = this.f89267c;
            if (aVar4 != null) {
                aVar4.mo65782b();
            }
            mo65815a(false, null);
        }
        MethodCollector.m26664o(8405);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.b.d$b */
    public static final class C37817b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ AnimationImageView f89297a;

        static {
            Covode.recordClassIndex(45264);
        }

        C37817b(AnimationImageView animationImageView) {
            this.f89297a = animationImageView;
        }

        public final void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            this.f89297a.setLayerType(0, null);
            this.f89297a.setVisibility(8);
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f89297a.setLayerType(0, null);
            this.f89297a.setVisibility(8);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37815d(FrameLayout frameLayout) {
        super(frameLayout);
        C89219l.m154721d(frameLayout, "");
    }

    /* renamed from: a */
    private static AnimationImageView m76469a(Context context) {
        AnimationImageView animationImageView = new AnimationImageView(context);
        animationImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        animationImageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        animationImageView.mo5828a(new C37817b(animationImageView));
        return animationImageView;
    }
}
