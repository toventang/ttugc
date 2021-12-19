package com.p2082ss.android.ugc.aweme.editSticker.p2877a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.editSticker.AbstractC45891h;
import com.p2082ss.android.ugc.aweme.editSticker.C45866d;
import com.p2082ss.android.ugc.aweme.editSticker.p2877a.AbstractC45835i;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.a.a */
public final class C45822a implements AbstractC45835i {

    /* renamed from: a */
    public final Context f106764a;

    /* renamed from: b */
    public final AbstractC45834h f106765b = null;

    /* renamed from: c */
    private AnimatorSet f106766c;

    /* renamed from: d */
    private ObjectAnimator f106767d;

    /* renamed from: e */
    private ObjectAnimator f106768e;

    /* renamed from: f */
    private float f106769f;

    /* renamed from: g */
    private final long f106770g = 200;

    /* renamed from: h */
    private final long f106771h = 200;

    static {
        Covode.recordClassIndex(54345);
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.a.a$a */
    public static final class C45823a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C45822a f106772a;

        /* renamed from: b */
        final /* synthetic */ boolean f106773b = true;

        /* renamed from: c */
        final /* synthetic */ View f106774c;

        /* renamed from: d */
        final /* synthetic */ AbstractC45835i.AbstractC45836a f106775d;

        static {
            Covode.recordClassIndex(54346);
        }

        public final void onAnimationStart(Animator animator) {
            C89219l.m154721d(animator, "");
            super.onAnimationStart(animator);
            if (this.f106773b) {
                this.f106774c.setVisibility(0);
            }
            AbstractC45835i.AbstractC45836a aVar = this.f106775d;
            if (aVar != null) {
                aVar.mo77187a();
            }
        }

        public final void onAnimationEnd(Animator animator) {
            AbstractC45834h hVar;
            C89219l.m154721d(animator, "");
            if (!this.f106773b) {
                this.f106774c.setVisibility(8);
                try {
                    if (!(this.f106772a.f106764a instanceof ActivityC0945e)) {
                        AbstractC45834h hVar2 = this.f106772a.f106765b;
                        if (hVar2 != null) {
                            hVar2.dismiss();
                        }
                    } else if (!((ActivityC0945e) this.f106772a.f106764a).isFinishing() && (hVar = this.f106772a.f106765b) != null) {
                        hVar.dismiss();
                    }
                } catch (IllegalArgumentException e) {
                    AbstractC45891h d = C45866d.m88491d();
                    if (d != null) {
                        d.mo77251a("AlphaPopAnimManager: dismiss pop failed :" + e.getMessage());
                    }
                } catch (Exception unused) {
                }
            }
            AbstractC45835i.AbstractC45836a aVar = this.f106775d;
            if (aVar != null) {
                aVar.mo77188b();
            }
        }

        C45823a(C45822a aVar, View view, AbstractC45835i.AbstractC45836a aVar2) {
            this.f106772a = aVar;
            this.f106774c = view;
            this.f106775d = aVar2;
        }
    }

    public C45822a(Context context) {
        C89219l.m154721d(context, "");
        this.f106764a = context;
        this.f106769f = C84912r.m145930a(context, 15.0f);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.p2877a.AbstractC45835i
    /* renamed from: a */
    public final void mo77168a(View view, AbstractC45835i.AbstractC45836a aVar) {
        AnimatorSet.Builder play;
        C89219l.m154721d(view, "");
        AnimatorSet animatorSet = this.f106766c;
        if (animatorSet == null) {
            this.f106766c = new AnimatorSet();
        } else {
            animatorSet.removeAllListeners();
            AnimatorSet animatorSet2 = this.f106766c;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
        }
        this.f106767d = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        float a = C84912r.m145930a(this.f106764a, 15.0f);
        this.f106769f = a;
        this.f106768e = ObjectAnimator.ofFloat(view, "translationY", a, 0.0f);
        AnimatorSet animatorSet3 = this.f106766c;
        if (!(animatorSet3 == null || (play = animatorSet3.play(this.f106767d)) == null)) {
            play.with(this.f106768e);
        }
        AnimatorSet animatorSet4 = this.f106766c;
        if (animatorSet4 != null) {
            animatorSet4.setDuration(this.f106770g);
        }
        AnimatorSet animatorSet5 = this.f106766c;
        if (animatorSet5 != null) {
            animatorSet5.addListener(new C45823a(this, view, aVar));
        }
        AnimatorSet animatorSet6 = this.f106766c;
        if (animatorSet6 != null) {
            animatorSet6.start();
        }
    }
}
