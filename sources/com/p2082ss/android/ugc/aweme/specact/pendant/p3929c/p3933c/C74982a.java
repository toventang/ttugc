package com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.p3933c;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.C74962a;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.C74990d;
import com.p2082ss.android.ugc.aweme.specact.pendant.views.C75088a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specact.pendant.c.c.a */
public final class C74982a {

    /* renamed from: h */
    public static final C74983a f168567h = new C74983a((byte) 0);

    /* renamed from: a */
    boolean f168568a = true;

    /* renamed from: b */
    public boolean f168569b;

    /* renamed from: c */
    final C74962a f168570c = new C74962a(this.f168573f);

    /* renamed from: d */
    public C75088a f168571d;

    /* renamed from: e */
    public View f168572e;

    /* renamed from: f */
    View f168573f;

    /* renamed from: g */
    View f168574g;

    static {
        Covode.recordClassIndex(87854);
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.c.c.a$a */
    public static final class C74983a {
        static {
            Covode.recordClassIndex(87855);
        }

        private C74983a() {
        }

        public /* synthetic */ C74983a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.c.c.a$c */
    public static final class RunnableC74985c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C74982a f168576a;

        static {
            Covode.recordClassIndex(87857);
        }

        public RunnableC74985c(C74982a aVar) {
            this.f168576a = aVar;
        }

        public final void run() {
            C74982a aVar = this.f168576a;
            aVar.f168571d.setCanDrag(false);
            ViewGroup.LayoutParams layoutParams = aVar.f168573f.getLayoutParams();
            layoutParams.width = aVar.f168574g.getWidth();
            layoutParams.height = aVar.f168574g.getHeight();
            aVar.f168573f.setLayoutParams(layoutParams);
            aVar.f168572e.setVisibility(0);
            aVar.f168568a = false;
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(aVar.f168570c, "width", 0.0f, (float) aVar.f168574g.getWidth()), ObjectAnimator.ofFloat(aVar.f168574g, "alpha", 0.0f, 1.0f));
            animatorSet.setDuration(466L);
            animatorSet.addListener(new C74986d(aVar));
            animatorSet.start();
        }
    }

    /* renamed from: a */
    public final void mo118105a() {
        if (!this.f168568a) {
            this.f168568a = true;
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.f168570c, "width", (float) this.f168574g.getWidth(), 0.0f), ObjectAnimator.ofFloat(this.f168574g, "alpha", 1.0f, 0.0f));
            animatorSet.setDuration(466L);
            animatorSet.addListener(new C74984b(this));
            animatorSet.start();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.c.c.a$b */
    public static final class C74984b extends C74990d {

        /* renamed from: a */
        final /* synthetic */ C74982a f168575a;

        static {
            Covode.recordClassIndex(87856);
        }

        C74984b(C74982a aVar) {
            this.f168575a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.C74990d
        public final void onAnimationEnd(Animator animator) {
            this.f168575a.f168572e.setVisibility(8);
            this.f168575a.f168571d.setCanDrag(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.c.c.a$d */
    public static final class C74986d extends C74990d {

        /* renamed from: a */
        final /* synthetic */ C74982a f168577a;

        static {
            Covode.recordClassIndex(87858);
        }

        C74986d(C74982a aVar) {
            this.f168577a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.C74990d
        public final void onAnimationEnd(Animator animator) {
            this.f168577a.f168572e.postDelayed(new Runnable(this) {
                /* class com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.p3933c.C74982a.C74986d.RunnableC749871 */

                /* renamed from: a */
                final /* synthetic */ C74986d f168578a;

                static {
                    Covode.recordClassIndex(87859);
                }

                {
                    this.f168578a = r1;
                }

                public final void run() {
                    this.f168578a.f168577a.mo118105a();
                }
            }, 5000);
        }
    }

    public C74982a(C75088a aVar, View view, View view2, View view3) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(view2, "");
        C89219l.m154721d(view3, "");
        this.f168571d = aVar;
        this.f168572e = view;
        this.f168573f = view2;
        this.f168574g = view3;
    }
}
