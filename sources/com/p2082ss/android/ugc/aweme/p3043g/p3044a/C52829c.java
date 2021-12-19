package com.p2082ss.android.ugc.aweme.p3043g.p3044a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.g.a.c */
public final class C52829c implements AbstractC52855f {

    /* renamed from: a */
    public final View f121545a;

    /* renamed from: b */
    public final Context f121546b;

    /* renamed from: c */
    public final ViewGroup f121547c;

    static {
        Covode.recordClassIndex(62229);
    }

    /* renamed from: com.ss.android.ugc.aweme.g.a.c$b  reason: invalid class name */
    public static final class animationAnimation$AnimationListenerC52831b implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f121550a;

        static {
            Covode.recordClassIndex(62231);
        }

        public final void onAnimationRepeat(Animation animation) {
        }

        public final void onAnimationStart(Animation animation) {
        }

        animationAnimation$AnimationListenerC52831b(AbstractC89171a aVar) {
            this.f121550a = aVar;
        }

        public final void onAnimationEnd(Animation animation) {
            this.f121550a.invoke();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.g.a.c$a  reason: invalid class name */
    public static final class animationAnimation$AnimationListenerC52830a implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ C52829c f121548a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f121549b;

        static {
            Covode.recordClassIndex(62230);
        }

        public final void onAnimationRepeat(Animation animation) {
        }

        public final void onAnimationStart(Animation animation) {
        }

        public final void onAnimationEnd(Animation animation) {
            this.f121548a.f121545a.setVisibility(8);
            this.f121549b.invoke();
        }

        animationAnimation$AnimationListenerC52830a(C52829c cVar, AbstractC89171a aVar) {
            this.f121548a = cVar;
            this.f121549b = aVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3043g.p3044a.AbstractC52851e
    /* renamed from: b */
    public final void mo88483b(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        this.f121545a.clearAnimation();
        this.f121545a.setVisibility(8);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3043g.p3044a.AbstractC52851e
    /* renamed from: a */
    public final void mo88482a(AbstractC89171a<C89391z> aVar) {
        MethodCollector.m26663i(13197);
        C89219l.m154721d(aVar, "");
        if (this.f121545a.getAnimation() != null) {
            this.f121545a.clearAnimation();
        }
        this.f121545a.setVisibility(0);
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f121546b, R.anim.b5);
        loadAnimation.setAnimationListener(new animationAnimation$AnimationListenerC52831b(aVar));
        this.f121545a.startAnimation(loadAnimation);
        MethodCollector.m26664o(13197);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3043g.p3044a.AbstractC52855f
    /* renamed from: c */
    public final void mo88484c(AbstractC89171a<C89391z> aVar) {
        MethodCollector.m26663i(13321);
        C89219l.m154721d(aVar, "");
        if (this.f121545a.getAnimation() != null) {
            this.f121545a.clearAnimation();
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f121546b, R.anim.b6);
        loadAnimation.setAnimationListener(new animationAnimation$AnimationListenerC52830a(this, aVar));
        this.f121545a.startAnimation(loadAnimation);
        MethodCollector.m26664o(13321);
    }

    public C52829c(Context context, ViewGroup viewGroup) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(viewGroup, "");
        this.f121546b = context;
        this.f121547c = viewGroup;
        View findViewById = viewGroup.findViewById(R.id.e6v);
        C89219l.m154716b(findViewById, "");
        this.f121545a = findViewById;
    }
}
