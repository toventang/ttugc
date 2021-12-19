package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.view.p4364c.C84951b;
import com.p2082ss.android.ugc.tools.view.p4364c.C84952c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.a */
public final class C71989a {

    /* renamed from: a */
    public static final C71989a f161317a = new C71989a();

    private C71989a() {
    }

    static {
        Covode.recordClassIndex(84629);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.a$a */
    public static final class C71990a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f161318a;

        /* renamed from: b */
        final /* synthetic */ View f161319b;

        static {
            Covode.recordClassIndex(84630);
        }

        public final void onAnimationStart(Animator animator) {
            if (this.f161318a) {
                this.f161319b.setVisibility(0);
            }
        }

        C71990a(boolean z, View view) {
            this.f161318a = z;
            this.f161319b = view;
        }

        public final void onAnimationEnd(Animator animator, boolean z) {
            if (!this.f161318a) {
                this.f161319b.setVisibility(4);
            }
        }
    }

    /* renamed from: a */
    public static void m127080a(View view, boolean z) {
        TimeInterpolator cVar;
        float f;
        C89219l.m154721d(view, "");
        ViewPropertyAnimator duration = view.animate().setDuration(300);
        if (z) {
            cVar = new C84951b();
        } else {
            cVar = new C84952c();
        }
        ViewPropertyAnimator interpolator = duration.setInterpolator(cVar);
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        interpolator.alpha(f).setListener(new C71990a(z, view)).start();
    }
}
