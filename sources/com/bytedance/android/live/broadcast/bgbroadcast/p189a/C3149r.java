package com.bytedance.android.live.broadcast.bgbroadcast.p189a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.p605r.AbstractC10311a;
import com.bytedance.android.livesdk.p605r.C10318g;
import com.bytedance.covode.number.Covode;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;
import p4623i.p4624a.p4625a.p4626a.p4627a.C89393b;

/* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.a.r */
public final class C3149r extends C10318g {

    /* renamed from: a */
    final int f9115a;

    /* renamed from: b */
    public int f9116b;

    /* renamed from: c */
    public int f9117c = ((int) C89393b.m154948a(2.0f));

    /* renamed from: d */
    public boolean f9118d;

    /* renamed from: i */
    private final int f9119i;

    /* renamed from: j */
    private final int f9120j;

    /* renamed from: k */
    private final int f9121k;

    /* renamed from: l */
    private Animator f9122l;

    /* renamed from: m */
    private Boolean f9123m;

    static {
        Covode.recordClassIndex(3630);
    }

    /* renamed from: a */
    public final int mo8479a() {
        return this.f9117c - this.f9116b;
    }

    /* renamed from: b */
    public final void mo8480b() {
        if (this.f24927g >= (-this.f9119i) - this.f9116b) {
            C3854a.m9453a(3, "TrayView", "slideOut, current x = " + this.f24927g);
            m8554a(this, this.f24927g, (-this.f9119i) - this.f9116b, false);
            return;
        }
        C3854a.m9453a(3, "TrayView", "slideOut failed, current x = " + this.f24927g + ',' + " -width - safeInsetTop = " + ((-this.f9119i) - this.f9116b));
    }

    /* renamed from: c */
    public final void mo8481c() {
        if (this.f24927g < 0 - this.f9116b) {
            C3854a.m9453a(3, "TrayView", "slideIn, current x = " + this.f24927g);
            m8554a(this, this.f24927g, 0 - this.f9116b, true);
            return;
        }
        C3854a.m9453a(3, "TrayView", "slideIn failed, current x = " + this.f24927g + ',' + " ORIGIN_X - safeInsetTop = " + (0 - this.f9116b));
    }

    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.a.r$b */
    public static final class C3151b implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C3149r f9125a;

        static {
            Covode.recordClassIndex(3632);
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C3151b(C3149r rVar) {
            this.f9125a = rVar;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f9125a.f9118d = false;
        }

        public final void onAnimationStart(Animator animator) {
            this.f9125a.f9118d = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.a.r$a */
    public static final class C3150a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC10311a f9124a;

        static {
            Covode.recordClassIndex(3631);
        }

        C3150a(AbstractC10311a aVar) {
            this.f9124a = aVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154721d(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            this.f9124a.mo17078a(((Integer) animatedValue).intValue());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.a.r$c */
    public static final class C3152c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC10311a f9126a;

        static {
            Covode.recordClassIndex(3633);
        }

        C3152c(AbstractC10311a aVar) {
            this.f9126a = aVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154721d(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            View d = this.f9126a.mo17081d();
            C89219l.m154716b(d, "");
            d.setAlpha(floatValue);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3149r(Context context, View view) {
        super(context);
        C89219l.m154721d(context, "");
        C89219l.m154721d(view, "");
        int a = C3966y.m9653a(40.0f);
        this.f9119i = a;
        this.f9115a = a;
        int i = -a;
        this.f9120j = i;
        this.f9121k = a;
        this.f24926f = view;
        mo17094b(a, a);
        mo17093a(8388659, i, a);
        mo17096e();
    }

    /* renamed from: a */
    private final void m8554a(AbstractC10311a aVar, int i, int i2, boolean z) {
        ValueAnimator ofFloat;
        if (this.f9118d) {
            if (C89219l.m154714a(this.f9123m, Boolean.valueOf(z))) {
                C3854a.m9453a(3, "TrayView", "Same isSlidingIn = " + z + ", returning...");
                return;
            }
            Animator animator = this.f9122l;
            if (animator != null) {
                animator.cancel();
            }
            C3854a.m9453a(3, "TrayView", "isSlidingIn changed, animator are canceled.");
        }
        this.f9123m = Boolean.valueOf(z);
        C3854a.m9453a(3, "TrayView", "New isSlidingIn = " + z + ", animator are created.");
        ValueAnimator ofInt = ObjectAnimator.ofInt(i, i2);
        C89219l.m154716b(ofInt, "");
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.addUpdateListener(new C3150a(aVar));
        ofInt.addListener(new C3151b(this));
        if (z) {
            ofFloat = ObjectAnimator.ofFloat(0.0f, 1.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(1.0f, 0.0f);
        }
        C89219l.m154716b(ofFloat, "");
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new C3152c(aVar));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(200L);
        animatorSet.playTogether(ofInt, ofFloat);
        animatorSet.start();
        this.f9122l = animatorSet;
    }
}
