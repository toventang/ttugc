package com.p2082ss.android.ugc.aweme.commercialize.playfun.p2606a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38229ao;
import com.p2082ss.android.ugc.aweme.commercialize.playfun.C38274a;
import com.p2082ss.android.ugc.aweme.commercialize.playfun.C38291b;
import com.p2082ss.android.ugc.aweme.commercialize.playfun.C38296c;
import com.p2082ss.android.ugc.aweme.commercialize.playfun.C38298e;
import com.p2082ss.android.ugc.aweme.commercialize.playfun.C38300f;
import com.p2082ss.android.ugc.aweme.feed.model.AwemePlayFunModel;
import com.p2082ss.android.ugc.aweme.p2385bd.C34791a;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.a.d */
public final class C38286d extends C38276a {

    /* renamed from: d */
    public Animator f90479d;

    static {
        Covode.recordClassIndex(45773);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.playfun.p2606a.C38276a, com.p2082ss.android.ugc.aweme.commercialize.playfun.AbstractC38297d
    /* renamed from: e */
    public final void mo66873e() {
        super.mo66873e();
        Animator animator = this.f90479d;
        if (animator != null) {
            animator.cancel();
        }
        this.f90479d = null;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.playfun.p2606a.C38276a, com.p2082ss.android.ugc.aweme.commercialize.playfun.AbstractC38297d
    /* renamed from: a */
    public final void mo66869a() {
        m77676a("ExpandState---handle");
        super.mo66869a();
        this.f90510b.mo66893b("popupbadge");
        mo66887a(new RunnableC38287a(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.a.d$a */
    static final class RunnableC38287a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C38286d f90480a;

        static {
            Covode.recordClassIndex(45774);
        }

        RunnableC38287a(C38286d dVar) {
            this.f90480a = dVar;
        }

        public final void run() {
            float f;
            int i;
            int i2;
            int i3;
            int i4;
            PointF pointF;
            int i5;
            long j;
            AwemePlayFunModel awemePlayFunModel = this.f90480a.f90510b.f90513c;
            if (awemePlayFunModel != null) {
                f = awemePlayFunModel.getStartDuration();
            } else {
                f = 0.0f;
            }
            float f2 = f * 1000.0f;
            C38291b.C38292a aVar = new C38291b.C38292a();
            aVar.f90490a = f2;
            C38286d dVar = this.f90480a;
            if (awemePlayFunModel == null) {
                pointF = new PointF(0.0f, 0.0f);
            } else {
                ViewParent parent = dVar.f90510b.f90524n.getParent();
                Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ViewGroup viewGroup = (ViewGroup) parent;
                C38229ao aoVar = dVar.f90510b.f90521k;
                if (aoVar != null) {
                    i = aoVar.f90317a;
                } else {
                    i = 0;
                }
                C38229ao aoVar2 = dVar.f90510b.f90521k;
                if (aoVar2 != null) {
                    i2 = aoVar2.f90318b;
                } else {
                    i2 = 0;
                }
                if (i > viewGroup.getWidth()) {
                    i3 = (i - viewGroup.getWidth()) / 2;
                } else {
                    i3 = 0;
                }
                if (i2 > viewGroup.getHeight()) {
                    i4 = (i2 - viewGroup.getHeight()) / 2;
                } else {
                    i4 = 0;
                }
                int i6 = dVar.f90510b.f90511a.f90505a;
                float positionX = (((float) i) * awemePlayFunModel.getPositionX()) - ((float) i3);
                float f3 = (float) (i6 / 2);
                float f4 = positionX - f3;
                if (C80471gb.m139482a()) {
                    f4 = -(((float) (viewGroup.getWidth() - i6)) - f4);
                }
                pointF = new PointF(f4, ((((float) i2) * awemePlayFunModel.getPositionY()) - ((float) i4)) - f3);
            }
            C38291b.C38292a a = aVar.mo66883a(pointF);
            C38286d dVar2 = this.f90480a;
            float f5 = dVar2.f90510b.f90511a.f90507c;
            if (C80471gb.m139482a()) {
                f5 = -f5;
            }
            C38291b.C38292a b = a.mo66885b(new PointF(f5, dVar2.f90510b.f90511a.f90506b - ((float) C38300f.m77693a(dVar2.f90510b.f90524n))));
            if (awemePlayFunModel != null) {
                i5 = awemePlayFunModel.getAngle();
            } else {
                i5 = 0;
            }
            b.f90492c = i5;
            b.f90491b = 0.0f;
            C38291b a2 = b.mo66884a();
            C38286d dVar3 = this.f90480a;
            View view = dVar3.f90510b.f90515e;
            C38296c cVar = this.f90480a.f90510b.f90511a;
            C89219l.m154721d(view, "");
            C89219l.m154721d(cVar, "");
            C89219l.m154721d(a2, "");
            view.setPivotX(((float) cVar.f90505a) / 2.0f);
            view.setPivotY(((float) cVar.f90505a) / 2.0f);
            view.setTranslationX(a2.f90484b);
            view.setTranslationY(a2.f90485c);
            view.setScaleX(a2.f90486d);
            view.setScaleY(a2.f90486d);
            view.setRotation((float) a2.f90487e);
            Path path = new Path();
            path.moveTo(a2.f90484b, a2.f90485c);
            path.lineTo(a2.f90488f, a2.f90489g);
            Animator a3 = C38274a.m77639a(view, path);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", a2.f90486d, 1.0f);
            C89219l.m154716b(ofFloat, "");
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "ScaleY", a2.f90486d, 1.0f);
            C89219l.m154716b(ofFloat2, "");
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "rotation", (float) a2.f90487e, 0.0f);
            C89219l.m154716b(ofFloat3, "");
            AnimatorSet animatorSet = new AnimatorSet();
            float f6 = a2.f90483a;
            if (f6 > 0.0f) {
                j = (long) f6;
            } else {
                j = 500;
            }
            animatorSet.setDuration(j);
            animatorSet.setInterpolator(new C34791a());
            animatorSet.play(a3).with(ofFloat).with(ofFloat2).with(ofFloat3);
            dVar3.mo66870a(animatorSet);
            this.f90480a.f90510b.f90515e.setAlpha(1.0f);
            Animator animator = this.f90480a.f90471c;
            if (animator != null) {
                animator.start();
            }
            long j2 = ((long) f2) / 2;
            this.f90480a.f90510b.f90514d.setAlpha(0.0f);
            C38286d dVar4 = this.f90480a;
            View view2 = dVar4.f90510b.f90514d;
            C89219l.m154721d(view2, "");
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view2, "alpha", 0.0f, 1.0f);
            C89219l.m154716b(ofFloat4, "");
            ofFloat4.setDuration(j2);
            dVar4.f90479d = ofFloat4;
            Animator animator2 = this.f90480a.f90479d;
            if (animator2 != null) {
                animator2.setStartDelay(j2);
            }
            Animator animator3 = this.f90480a.f90479d;
            if (animator3 != null) {
                animator3.start();
            }
            this.f90480a.f90510b.mo66892a("start_expand", new Point((int) a2.f90484b, (int) a2.f90485c), null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38286d(C38298e eVar) {
        super(eVar);
        C89219l.m154721d(eVar, "");
    }
}
