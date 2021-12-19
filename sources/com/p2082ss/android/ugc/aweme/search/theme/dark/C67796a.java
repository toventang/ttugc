package com.p2082ss.android.ugc.aweme.search.theme.dark;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.search.theme.C67782c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.theme.dark.a */
public final class C67796a extends ValueAnimator implements Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private C67782c f151942a;

    /* renamed from: b */
    private final ThemeViewModel f151943b;

    static {
        Covode.recordClassIndex(79449);
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public C67796a(ThemeViewModel themeViewModel) {
        C89219l.m154721d(themeViewModel, "");
        this.f151943b = themeViewModel;
    }

    public final void onAnimationEnd(Animator animator) {
        C67782c.C67783a aVar = new C67782c.C67783a(3);
        C67782c cVar = this.f151942a;
        if (cVar != null) {
            C67782c a = C67782c.m119955a(cVar, aVar);
            this.f151943b.mo106888b(a);
            this.f151943b.mo106890c(a);
        }
    }

    public final void onAnimationStart(Animator animator) {
        C67782c.C67783a aVar = new C67782c.C67783a(1);
        C67782c cVar = this.f151942a;
        if (cVar != null) {
            this.f151943b.mo106888b(C67782c.m119955a(cVar, aVar));
        }
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (valueAnimator != null) {
            C67782c.C67783a aVar = new C67782c.C67783a(2, Float.valueOf(valueAnimator.getAnimatedFraction()));
            C67782c cVar = this.f151942a;
            if (cVar != null) {
                this.f151943b.mo106888b(C67782c.m119955a(cVar, aVar));
            }
        }
    }

    /* renamed from: a */
    public final void mo106892a(C67782c cVar) {
        C89219l.m154721d(cVar, "");
        Looper mainLooper = Looper.getMainLooper();
        C89219l.m154716b(mainLooper, "");
        if (!(!C89219l.m154714a(mainLooper.getThread(), Thread.currentThread())) && !C89219l.m154714a(this.f151942a, cVar)) {
            removeAllUpdateListeners();
            removeAllListeners();
            this.f151942a = cVar;
            addListener(this);
            addUpdateListener(this);
            start();
        }
    }
}
