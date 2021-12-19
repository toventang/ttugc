package com.p2082ss.android.ugc.aweme.commercialize.playfun.p2606a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Point;
import android.view.View;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.commercialize.playfun.C38274a;
import com.p2082ss.android.ugc.aweme.commercialize.playfun.C38296c;
import com.p2082ss.android.ugc.aweme.commercialize.playfun.C38298e;
import com.p2082ss.android.ugc.aweme.commercialize.playfun.C38300f;
import com.p2082ss.android.ugc.aweme.feed.model.AwemePlayFunModel;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.a.c */
public final class C38283c extends C38276a {

    /* renamed from: d */
    public Animator f90474d;

    /* renamed from: e */
    private Animator f90475e;

    /* renamed from: f */
    private Animator f90476f;

    static {
        Covode.recordClassIndex(45770);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.playfun.p2606a.C38276a, com.p2082ss.android.ugc.aweme.commercialize.playfun.AbstractC38297d
    /* renamed from: a */
    public final void mo66869a() {
        m77676a("EggShowState---handle");
        super.mo66869a();
        mo66887a(new RunnableC38284a(this));
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.playfun.AbstractC38297d
    /* renamed from: d */
    public final void mo66877d() {
        super.mo66877d();
        Animator animator = this.f90471c;
        if (animator != null) {
            animator.end();
        }
        Animator animator2 = this.f90474d;
        if (animator2 != null) {
            animator2.end();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.playfun.p2606a.C38276a, com.p2082ss.android.ugc.aweme.commercialize.playfun.AbstractC38297d
    /* renamed from: e */
    public final void mo66873e() {
        super.mo66873e();
        Animator animator = this.f90474d;
        if (animator != null) {
            animator.cancel();
        }
        this.f90474d = null;
        Animator animator2 = this.f90475e;
        if (animator2 != null) {
            animator2.cancel();
        }
        this.f90475e = null;
        Animator animator3 = this.f90476f;
        if (animator3 != null) {
            animator3.cancel();
        }
        this.f90476f = null;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.playfun.AbstractC38297d
    /* renamed from: f */
    public final boolean mo66878f() {
        m77676a("isEggClickable" + this.f90510b.f90524n.f90451h);
        if (!this.f90510b.f90524n.f90451h) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final void mo66879h() {
        C38296c a = this.f90510b.f90524n.mo66854a();
        int i = a.f90505a;
        float f = a.f90506b;
        int i2 = this.f90510b.f90511a.f90505a;
        if (i != i2 || f != this.f90510b.f90511a.f90506b) {
            float f2 = ((float) (i2 - i)) / 2.0f;
            float a2 = f - ((float) C38300f.m77693a(this.f90510b.f90524n));
            Animator animator = this.f90475e;
            if (animator != null) {
                animator.cancel();
            }
            float f3 = (float) i;
            Animator a3 = C38274a.m77638a(this.f90510b.f90515e, a2 - f2, f3 / ((float) i2), i2);
            this.f90475e = a3;
            if (a3 != null) {
                a3.start();
            }
            float f4 = f3 + a2;
            Animator animator2 = this.f90476f;
            if (animator2 != null) {
                animator2.cancel();
            }
            Animator a4 = C38274a.m77637a(this.f90510b.f90516f, f4);
            this.f90476f = a4;
            if (a4 != null) {
                a4.start();
            }
            m77676a("EggShowState.checkPosition, newSize:" + i + ", newTop:" + f + ", rawEggImageSize:" + i2 + ", eggTransY:" + a2 + ", titleTransY:" + f4);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.a.c$a */
    static final class RunnableC38284a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C38283c f90477a;

        static {
            Covode.recordClassIndex(45771);
        }

        RunnableC38284a(C38283c cVar) {
            this.f90477a = cVar;
        }

        public final void run() {
            float f;
            long j;
            float translationX;
            AwemePlayFunModel awemePlayFunModel = this.f90477a.f90510b.f90513c;
            if (awemePlayFunModel != null) {
                f = awemePlayFunModel.getShowDuration();
            } else {
                f = 0.0f;
            }
            float f2 = f * 1000.0f;
            C38283c cVar = this.f90477a;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            C89219l.m154716b(ofFloat, "");
            if (f2 > 0.0f) {
                j = (long) f2;
            } else {
                j = 3000;
            }
            ofFloat.setDuration(j);
            cVar.mo66870a(ofFloat);
            Animator animator = this.f90477a.f90471c;
            if (animator != null) {
                animator.start();
            }
            this.f90477a.f90510b.f90520j = System.currentTimeMillis();
            View view = this.f90477a.f90510b.f90516f;
            View view2 = this.f90477a.f90510b.f90515e;
            view.setAlpha(0.0f);
            view.setVisibility(0);
            view.measure(0, 0);
            int measuredWidth = view.getMeasuredWidth();
            C89219l.m154721d("eggTitleViewWidth: ".concat(String.valueOf(measuredWidth)), "");
            if (C80471gb.m139482a()) {
                translationX = (view2.getTranslationX() - (((float) view2.getWidth()) / 2.0f)) + (((float) measuredWidth) / 2.0f);
            } else {
                translationX = (view2.getTranslationX() + (((float) view2.getWidth()) / 2.0f)) - (((float) measuredWidth) / 2.0f);
            }
            view.setTranslationX(translationX);
            float translationY = view2.getTranslationY() + ((float) this.f90477a.f90510b.f90511a.f90505a);
            C38283c cVar2 = this.f90477a;
            C89219l.m154721d(view, "");
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "translationY", C13628n.m24520b(C17867d.m33078a(), 25.0f) + translationY, translationY);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(200L);
            animatorSet.play(ofFloat2).with(ofFloat3);
            cVar2.f90474d = animatorSet;
            Animator animator2 = this.f90477a.f90474d;
            if (animator2 != null) {
                animator2.addListener(new AnimatorListenerAdapter(this) {
                    /* class com.p2082ss.android.ugc.aweme.commercialize.playfun.p2606a.C38283c.RunnableC38284a.C382851 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC38284a f90478a;

                    static {
                        Covode.recordClassIndex(45772);
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f90478a = r1;
                    }

                    public final void onAnimationEnd(Animator animator) {
                        this.f90478a.f90477a.mo66879h();
                    }
                });
            }
            Animator animator3 = this.f90477a.f90474d;
            if (animator3 != null) {
                animator3.start();
            }
            this.f90477a.f90510b.mo66892a("show_in_center", new Point((int) view2.getTranslationX(), (int) view2.getTranslationY()), new Point((int) view.getTranslationX(), (int) translationY));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38283c(C38298e eVar) {
        super(eVar);
        C89219l.m154721d(eVar, "");
    }
}
