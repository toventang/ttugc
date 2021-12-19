package com.p2082ss.android.ugc.aweme.commercialize.playfun.p2606a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.playfun.C38274a;
import com.p2082ss.android.ugc.aweme.commercialize.playfun.C38291b;
import com.p2082ss.android.ugc.aweme.commercialize.playfun.C38296c;
import com.p2082ss.android.ugc.aweme.commercialize.playfun.C38298e;
import com.p2082ss.android.ugc.aweme.feed.model.AwemePlayFunModel;
import com.p2082ss.android.ugc.aweme.p2385bd.C34791a;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.a.b */
public final class C38278b extends C38276a {

    /* renamed from: d */
    private List<? extends Animator> f90473d;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.a.b$a */
    public interface AbstractC38279a {
        static {
            Covode.recordClassIndex(45766);
        }

        /* renamed from: a */
        void mo66876a(Animator animator);
    }

    static {
        Covode.recordClassIndex(45765);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.a.b$b */
    public static final class C38280b implements AbstractC38279a {
        static {
            Covode.recordClassIndex(45767);
        }

        C38280b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.playfun.p2606a.C38278b.AbstractC38279a
        /* renamed from: a */
        public final void mo66876a(Animator animator) {
            C89219l.m154721d(animator, "");
            int i = Build.VERSION.SDK_INT;
            animator.pause();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.a.b$c */
    public static final class C38281c implements AbstractC38279a {
        static {
            Covode.recordClassIndex(45768);
        }

        C38281c() {
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.playfun.p2606a.C38278b.AbstractC38279a
        /* renamed from: a */
        public final void mo66876a(Animator animator) {
            C89219l.m154721d(animator, "");
            animator.cancel();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.a.b$d */
    public static final class C38282d implements AbstractC38279a {
        static {
            Covode.recordClassIndex(45769);
        }

        C38282d() {
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.playfun.p2606a.C38278b.AbstractC38279a
        /* renamed from: a */
        public final void mo66876a(Animator animator) {
            C89219l.m154721d(animator, "");
            int i = Build.VERSION.SDK_INT;
            animator.resume();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.playfun.p2606a.C38276a, com.p2082ss.android.ugc.aweme.commercialize.playfun.AbstractC38297d
    /* renamed from: b */
    public final void mo66871b() {
        super.mo66871b();
        m77645a(new C38280b());
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.playfun.p2606a.C38276a, com.p2082ss.android.ugc.aweme.commercialize.playfun.AbstractC38297d
    /* renamed from: c */
    public final void mo66872c() {
        super.mo66872c();
        m77645a(new C38282d());
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.playfun.p2606a.C38276a, com.p2082ss.android.ugc.aweme.commercialize.playfun.AbstractC38297d
    /* renamed from: e */
    public final void mo66873e() {
        super.mo66873e();
        m77645a(new C38281c());
        this.f90473d = null;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.playfun.p2606a.C38276a, com.p2082ss.android.ugc.aweme.commercialize.playfun.AbstractC38297d
    /* renamed from: a */
    public final void mo66869a() {
        float f;
        long j;
        m77676a("CollapseState---handle");
        super.mo66869a();
        AwemePlayFunModel awemePlayFunModel = this.f90510b.f90513c;
        if (awemePlayFunModel != null) {
            f = awemePlayFunModel.getEndDuration();
        } else {
            f = 0.0f;
        }
        float f2 = f * 1000.0f;
        PointF c = this.f90510b.mo66895c();
        C38291b.C38292a aVar = new C38291b.C38292a();
        aVar.f90490a = f2;
        C38291b a = aVar.mo66883a(new PointF(this.f90510b.f90515e.getTranslationX(), this.f90510b.f90515e.getTranslationY())).mo66885b(new PointF(c.x, c.y)).mo66884a();
        View view = this.f90510b.f90515e;
        C38296c cVar = this.f90510b.f90511a;
        C89219l.m154721d(view, "");
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(a, "");
        view.setPivotX(((float) cVar.f90505a) / 2.0f);
        view.setPivotY(((float) cVar.f90505a) / 2.0f);
        Path path = new Path();
        path.moveTo(a.f90484b, a.f90485c);
        path.cubicTo((a.f90484b + a.f90488f) / 2.0f, a.f90485c, a.f90488f, (a.f90485c + a.f90489g) / 2.0f, a.f90488f, a.f90489g);
        Animator a2 = C38274a.m77639a(view, path);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", view.getScaleX(), cVar.f90508d);
        C89219l.m154716b(ofFloat, "");
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "ScaleY", view.getScaleY(), cVar.f90508d);
        C89219l.m154716b(ofFloat2, "");
        AnimatorSet animatorSet = new AnimatorSet();
        float f3 = a.f90483a;
        if (f3 > 0.0f) {
            j = (long) f3;
        } else {
            j = 400;
        }
        animatorSet.setDuration(j);
        animatorSet.setInterpolator(new C34791a());
        animatorSet.play(a2).with(ofFloat).with(ofFloat2);
        mo66870a(animatorSet);
        Animator animator = this.f90471c;
        if (animator != null) {
            animator.start();
        }
        View view2 = this.f90510b.f90514d;
        C89219l.m154721d(view2, "");
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view2, "alpha", 1.0f, 0.0f);
        C89219l.m154716b(ofFloat3, "");
        ofFloat3.setDuration(((long) f2) / 2);
        ofFloat3.start();
        View view3 = this.f90510b.f90516f;
        C89219l.m154721d(view3, "");
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view3, "alpha", 1.0f, 0.0f);
        C89219l.m154716b(ofFloat4, "");
        ofFloat4.setDuration(200L);
        ofFloat4.start();
        List<? extends Animator> b = C89070n.m154522b(ofFloat3, ofFloat4);
        if (b == null) {
            C89219l.m154715b();
        }
        this.f90473d = b;
        m77676a(String.valueOf(this.f90510b.f90517g));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38278b(C38298e eVar) {
        super(eVar);
        C89219l.m154721d(eVar, "");
    }

    /* renamed from: a */
    private void m77645a(AbstractC38279a aVar) {
        C89219l.m154721d(aVar, "");
        List<? extends Animator> list = this.f90473d;
        if (list != null) {
            for (T t : list) {
                if (t != null) {
                    aVar.mo66876a(t);
                }
            }
        }
    }
}
