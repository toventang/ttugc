package com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c */
public final class C70433c {

    /* renamed from: a */
    public static final C70433c f157390a = new C70433c();

    private C70433c() {
    }

    static {
        Covode.recordClassIndex(82876);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c$a */
    public static final class C70434a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ View f157391a;

        /* renamed from: b */
        final /* synthetic */ boolean f157392b = true;

        static {
            Covode.recordClassIndex(82877);
        }

        public final void onAnimationEnd(Animator animator) {
            int i;
            C89219l.m154721d(animator, "");
            super.onAnimationEnd(animator);
            View view = this.f157391a;
            if (this.f157392b) {
                i = 8;
            } else {
                i = 0;
            }
            view.setVisibility(i);
        }

        C70434a(View view, boolean z) {
            this.f157391a = view;
        }
    }

    /* renamed from: a */
    public static void m124216a(View view) {
        if (view != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            ofFloat.addListener(new C70434a(view, true));
            ofFloat.start();
        }
    }

    /* renamed from: b */
    public static void m124217b(View view) {
        if (view != null) {
            view.setVisibility(0);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            ofFloat.start();
        }
    }
}
