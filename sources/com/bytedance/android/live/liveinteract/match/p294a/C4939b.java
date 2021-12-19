package com.bytedance.android.live.liveinteract.match.p294a;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.match.a.b */
public final class C4939b {

    /* renamed from: a */
    public static final C4939b f12900a = new C4939b();

    private C4939b() {
    }

    static {
        Covode.recordClassIndex(5522);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.a.b$a  reason: invalid class name */
    public static final class animationAnimation$AnimationListenerC4940a implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ View f12901a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f12902b;

        static {
            Covode.recordClassIndex(5523);
        }

        public final void onAnimationRepeat(Animation animation) {
        }

        public final void onAnimationStart(Animation animation) {
        }

        public final void onAnimationEnd(Animation animation) {
            this.f12901a.setVisibility(8);
            this.f12902b.invoke();
        }

        animationAnimation$AnimationListenerC4940a(View view, AbstractC89171a aVar) {
            this.f12901a = view;
            this.f12902b = aVar;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.a.b$b  reason: invalid class name */
    public static final class animationAnimation$AnimationListenerC4941b implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ View f12903a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f12904b;

        static {
            Covode.recordClassIndex(5524);
        }

        public final void onAnimationRepeat(Animation animation) {
        }

        public final void onAnimationStart(Animation animation) {
        }

        public final void onAnimationEnd(Animation animation) {
            this.f12903a.setVisibility(8);
            this.f12904b.invoke();
        }

        animationAnimation$AnimationListenerC4941b(View view, AbstractC89171a aVar) {
            this.f12903a = view;
            this.f12904b = aVar;
        }
    }

    /* renamed from: a */
    public static void m11141a(View view, View view2, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(view2, "");
        C89219l.m154721d(aVar, "");
        view.setVisibility(0);
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -1.0f);
        translateAnimation.setAnimationListener(new animationAnimation$AnimationListenerC4941b(view, aVar));
        translateAnimation.setInterpolator(new animationInterpolatorC4937a());
        translateAnimation.setDuration(300);
        view.startAnimation(translateAnimation);
        TranslateAnimation translateAnimation2 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        translateAnimation2.setDuration(300);
        translateAnimation2.setInterpolator(new animationInterpolatorC4937a());
        view2.startAnimation(translateAnimation2);
    }

    /* renamed from: b */
    public static void m11142b(View view, View view2, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(view2, "");
        C89219l.m154721d(aVar, "");
        view.setVisibility(0);
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
        translateAnimation.setAnimationListener(new animationAnimation$AnimationListenerC4940a(view, aVar));
        translateAnimation.setInterpolator(new animationInterpolatorC4937a());
        translateAnimation.setDuration(300);
        view.startAnimation(translateAnimation);
        TranslateAnimation translateAnimation2 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, -1.0f, 1, 0.0f);
        translateAnimation2.setDuration(300);
        translateAnimation2.setInterpolator(new animationInterpolatorC4937a());
        view2.startAnimation(translateAnimation2);
    }
}
