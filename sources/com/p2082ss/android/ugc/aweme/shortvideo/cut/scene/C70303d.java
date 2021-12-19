package com.p2082ss.android.ugc.aweme.shortvideo.cut.scene;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.d */
public final class C70303d {

    /* renamed from: a */
    public static final C70303d f157153a = new C70303d();

    private C70303d() {
    }

    static {
        Covode.recordClassIndex(82746);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.d$b */
    public static final class C70305b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f157156a;

        static {
            Covode.recordClassIndex(82748);
        }

        C70305b(AbstractC89172b bVar) {
            this.f157156a = bVar;
        }

        public final void onAnimationEnd(Animator animator) {
            C89219l.m154721d(animator, "");
            super.onAnimationEnd(animator);
            this.f157156a.invoke(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.d$a */
    public static final class C70304a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ View f157154a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f157155b;

        static {
            Covode.recordClassIndex(82747);
        }

        public final void onAnimationEnd(Animator animator) {
            C89219l.m154721d(animator, "");
            super.onAnimationEnd(animator);
            this.f157154a.setVisibility(8);
            this.f157155b.invoke(false);
        }

        C70304a(View view, AbstractC89172b bVar) {
            this.f157154a = view;
            this.f157155b = bVar;
        }
    }

    /* renamed from: a */
    public static void m124100a(View view, boolean z, AbstractC89172b<? super Boolean, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        if (view != null) {
            float b = C13628n.m24520b(view.getContext(), 16.0f);
            view.setVisibility(0);
            if (z) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "translationY", b, 0.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ofFloat, ofFloat2);
                animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
                animatorSet.setDuration(200L);
                animatorSet.addListener(new C70305b(bVar));
                animatorSet.start();
            }
        }
    }

    /* renamed from: b */
    public static void m124101b(View view, boolean z, AbstractC89172b<? super Boolean, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        if (view != null) {
            float b = C13628n.m24520b(view.getContext(), 16.0f);
            if (z) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "translationY", 0.0f, b);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ofFloat, ofFloat2);
                animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
                animatorSet.setDuration(200L);
                animatorSet.addListener(new C70304a(view, bVar));
                animatorSet.start();
                return;
            }
            view.setVisibility(8);
        }
    }
}
