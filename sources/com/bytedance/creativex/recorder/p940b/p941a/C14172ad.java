package com.bytedance.creativex.recorder.p940b.p941a;

import android.view.animation.Animation;
import com.bytedance.als.C2563k;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.creativex.recorder.b.a.ad */
public final class C14172ad {
    static {
        Covode.recordClassIndex(16241);
    }

    /* renamed from: com.bytedance.creativex.recorder.b.a.ad$a  reason: invalid class name */
    public static final class animationAnimation$AnimationListenerC14173a implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ C2563k f34446a;

        /* renamed from: b */
        final /* synthetic */ boolean f34447b;

        static {
            Covode.recordClassIndex(16242);
        }

        public final void onAnimationRepeat(Animation animation) {
            C89219l.m154721d(animation, "");
        }

        public final void onAnimationStart(Animation animation) {
            C89219l.m154721d(animation, "");
        }

        public final void onAnimationEnd(Animation animation) {
            C89219l.m154721d(animation, "");
            this.f34446a.mo6999a(new C14192l(this.f34447b, false));
        }

        public animationAnimation$AnimationListenerC14173a(C2563k kVar, boolean z) {
            this.f34446a = kVar;
            this.f34447b = z;
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.b.a.ad$b  reason: invalid class name */
    public static final class animationAnimation$AnimationListenerC14174b implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ C2563k f34448a;

        /* renamed from: b */
        final /* synthetic */ boolean f34449b;

        static {
            Covode.recordClassIndex(16243);
        }

        public final void onAnimationRepeat(Animation animation) {
            C89219l.m154721d(animation, "");
        }

        public final void onAnimationStart(Animation animation) {
            C89219l.m154721d(animation, "");
        }

        public final void onAnimationEnd(Animation animation) {
            C89219l.m154721d(animation, "");
            this.f34448a.mo6999a(new C14192l(this.f34449b, true));
        }

        public animationAnimation$AnimationListenerC14174b(C2563k kVar, boolean z) {
            this.f34448a = kVar;
            this.f34449b = z;
        }
    }
}
