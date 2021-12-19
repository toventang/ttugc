package com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.p3935e;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.C74962a;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.C74990d;
import com.p2082ss.android.ugc.aweme.specact.pendant.views.C75098b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specact.pendant.c.e.b */
public final class C75003b {

    /* renamed from: j */
    public static final C75004a f168606j = new C75004a((byte) 0);

    /* renamed from: a */
    boolean f168607a = true;

    /* renamed from: b */
    boolean f168608b = true;

    /* renamed from: c */
    public boolean f168609c;

    /* renamed from: d */
    final C74962a f168610d = new C74962a(this.f168614h);

    /* renamed from: e */
    public C75098b f168611e;

    /* renamed from: f */
    public View f168612f;

    /* renamed from: g */
    public View f168613g;

    /* renamed from: h */
    View f168614h;

    /* renamed from: i */
    View f168615i;

    static {
        Covode.recordClassIndex(87875);
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.c.e.b$a */
    public static final class C75004a {
        static {
            Covode.recordClassIndex(87876);
        }

        private C75004a() {
        }

        public /* synthetic */ C75004a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.c.e.b$d */
    public static final class RunnableC75007d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C75003b f168618a;

        static {
            Covode.recordClassIndex(87879);
        }

        public RunnableC75007d(C75003b bVar) {
            this.f168618a = bVar;
        }

        public final void run() {
            C75003b bVar = this.f168618a;
            bVar.f168611e.setCanDrag(false);
            ViewGroup.LayoutParams layoutParams = bVar.f168614h.getLayoutParams();
            layoutParams.width = bVar.f168615i.getWidth();
            layoutParams.height = bVar.f168615i.getHeight();
            bVar.f168614h.setLayoutParams(layoutParams);
            bVar.f168613g.setVisibility(0);
            bVar.f168607a = false;
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(bVar.f168610d, "width", 0.0f, (float) bVar.f168615i.getWidth()), ObjectAnimator.ofFloat(bVar.f168615i, "alpha", 0.0f, 1.0f));
            animatorSet.setDuration(466L);
            animatorSet.addListener(new C75008e(bVar));
            animatorSet.start();
        }
    }

    /* renamed from: a */
    public final void mo118114a() {
        if (!this.f168607a) {
            this.f168607a = true;
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.f168610d, "width", (float) this.f168615i.getWidth(), 0.0f), ObjectAnimator.ofFloat(this.f168615i, "alpha", 1.0f, 0.0f));
            animatorSet.setDuration(466L);
            animatorSet.addListener(new C75005b(this));
            animatorSet.start();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.c.e.b$b */
    public static final class C75005b extends C74990d {

        /* renamed from: a */
        final /* synthetic */ C75003b f168616a;

        static {
            Covode.recordClassIndex(87877);
        }

        C75005b(C75003b bVar) {
            this.f168616a = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.C74990d
        public final void onAnimationEnd(Animator animator) {
            this.f168616a.f168613g.setVisibility(8);
            C75003b bVar = this.f168616a;
            bVar.f168612f.setPivotX(C75003b.m131662a(bVar.f168612f.getContext(), 20.0f));
            bVar.f168612f.setPivotY(C75003b.m131662a(bVar.f168612f.getContext(), 25.0f));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(bVar.f168612f, "scaleX", 1.3f, 1.0f), ObjectAnimator.ofFloat(bVar.f168612f, "scaleY", 1.3f, 1.0f));
            animatorSet.setDuration(297L);
            animatorSet.addListener(new C75010f(bVar));
            animatorSet.setTarget(bVar.f168612f);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(ObjectAnimator.ofFloat(bVar.f168612f, "scaleX", 0.0f, 1.3f), ObjectAnimator.ofFloat(bVar.f168612f, "scaleY", 0.0f, 1.3f));
            animatorSet2.setDuration(528L);
            animatorSet2.addListener(new C75012g(bVar, animatorSet));
            animatorSet2.setTarget(bVar.f168612f);
            bVar.f168612f.setVisibility(0);
            animatorSet2.start();
            bVar.f168608b = false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.c.e.b$c */
    public static final class C75006c extends C74990d {

        /* renamed from: a */
        final /* synthetic */ C75003b f168617a;

        static {
            Covode.recordClassIndex(87878);
        }

        C75006c(C75003b bVar) {
            this.f168617a = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.C74990d
        public final void onAnimationEnd(Animator animator) {
            this.f168617a.f168612f.setVisibility(8);
            this.f168617a.f168611e.setCanDrag(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.c.e.b$e */
    public static final class C75008e extends C74990d {

        /* renamed from: a */
        final /* synthetic */ C75003b f168619a;

        static {
            Covode.recordClassIndex(87880);
        }

        C75008e(C75003b bVar) {
            this.f168619a = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.C74990d
        public final void onAnimationEnd(Animator animator) {
            this.f168619a.f168613g.postDelayed(new Runnable(this) {
                /* class com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.p3935e.C75003b.C75008e.RunnableC750091 */

                /* renamed from: a */
                final /* synthetic */ C75008e f168620a;

                static {
                    Covode.recordClassIndex(87881);
                }

                {
                    this.f168620a = r1;
                }

                public final void run() {
                    this.f168620a.f168619a.mo118114a();
                }
            }, 5000);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.c.e.b$f */
    public static final class C75010f extends C74990d {

        /* renamed from: a */
        final /* synthetic */ C75003b f168621a;

        static {
            Covode.recordClassIndex(87882);
        }

        C75010f(C75003b bVar) {
            this.f168621a = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.C74990d
        public final void onAnimationEnd(Animator animator) {
            this.f168621a.f168612f.postDelayed(new Runnable(this) {
                /* class com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.p3935e.C75003b.C75010f.RunnableC750111 */

                /* renamed from: a */
                final /* synthetic */ C75010f f168622a;

                static {
                    Covode.recordClassIndex(87883);
                }

                {
                    this.f168622a = r1;
                }

                public final void run() {
                    C75003b bVar = this.f168622a.f168621a;
                    if (!bVar.f168608b) {
                        bVar.f168608b = true;
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(ObjectAnimator.ofFloat(bVar.f168612f, "scaleX", 1.0f, 0.0f), ObjectAnimator.ofFloat(bVar.f168612f, "scaleY", 1.0f, 0.0f));
                        animatorSet.setDuration(330L);
                        animatorSet.addListener(new C75006c(bVar));
                        animatorSet.setTarget(bVar.f168612f);
                        animatorSet.start();
                    }
                }
            }, 3000);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.c.e.b$g */
    public static final class C75012g extends C74990d {

        /* renamed from: a */
        final /* synthetic */ C75003b f168623a;

        /* renamed from: b */
        final /* synthetic */ AnimatorSet f168624b;

        static {
            Covode.recordClassIndex(87884);
        }

        @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.C74990d
        public final void onAnimationEnd(Animator animator) {
            this.f168624b.start();
        }

        C75012g(C75003b bVar, AnimatorSet animatorSet) {
            this.f168623a = bVar;
            this.f168624b = animatorSet;
        }
    }

    /* renamed from: a */
    public static float m131662a(Context context, float f) {
        if (context == null) {
            return 0.0f;
        }
        Resources resources = context.getResources();
        C89219l.m154716b(resources, "");
        return (f * resources.getDisplayMetrics().density) + 0.5f;
    }

    public C75003b(C75098b bVar, View view, View view2, View view3, View view4) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(view2, "");
        C89219l.m154721d(view3, "");
        C89219l.m154721d(view4, "");
        this.f168611e = bVar;
        this.f168612f = view;
        this.f168613g = view2;
        this.f168614h = view3;
        this.f168615i = view4;
    }
}
