package com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.p3934d;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.C74962a;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.C74990d;
import com.p2082ss.android.ugc.aweme.specact.pendant.views.C75098b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specact.pendant.c.d.b */
public final class C74993b {

    /* renamed from: g */
    public static final C74994a f168587g = new C74994a((byte) 0);

    /* renamed from: a */
    boolean f168588a = true;

    /* renamed from: b */
    final C74962a f168589b = new C74962a(this.f168592e);

    /* renamed from: c */
    C75098b f168590c;

    /* renamed from: d */
    public View f168591d;

    /* renamed from: e */
    View f168592e;

    /* renamed from: f */
    View f168593f;

    static {
        Covode.recordClassIndex(87865);
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.c.d.b$a */
    public static final class C74994a {
        static {
            Covode.recordClassIndex(87866);
        }

        private C74994a() {
        }

        public /* synthetic */ C74994a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.c.d.b$c */
    public static final class RunnableC74996c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C74993b f168595a;

        static {
            Covode.recordClassIndex(87868);
        }

        public RunnableC74996c(C74993b bVar) {
            this.f168595a = bVar;
        }

        public final void run() {
            C74993b bVar = this.f168595a;
            bVar.f168590c.setCanDrag(false);
            ViewGroup.LayoutParams layoutParams = bVar.f168592e.getLayoutParams();
            layoutParams.width = bVar.f168593f.getWidth();
            layoutParams.height = bVar.f168593f.getHeight();
            bVar.f168592e.setLayoutParams(layoutParams);
            bVar.f168591d.setVisibility(0);
            bVar.f168588a = false;
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(bVar.f168589b, "width", 0.0f, (float) bVar.f168593f.getWidth()), ObjectAnimator.ofFloat(bVar.f168593f, "alpha", 0.0f, 1.0f));
            animatorSet.setDuration(466L);
            animatorSet.addListener(new C74997d(bVar));
            animatorSet.start();
        }
    }

    /* renamed from: a */
    public final void mo118111a() {
        if (!this.f168588a) {
            this.f168588a = true;
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.f168589b, "width", (float) this.f168593f.getWidth(), 0.0f), ObjectAnimator.ofFloat(this.f168593f, "alpha", 1.0f, 0.0f));
            animatorSet.setDuration(466L);
            animatorSet.addListener(new C74995b(this));
            animatorSet.start();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.c.d.b$b */
    public static final class C74995b extends C74990d {

        /* renamed from: a */
        final /* synthetic */ C74993b f168594a;

        static {
            Covode.recordClassIndex(87867);
        }

        C74995b(C74993b bVar) {
            this.f168594a = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.C74990d
        public final void onAnimationEnd(Animator animator) {
            this.f168594a.f168591d.setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.c.d.b$d */
    public static final class C74997d extends C74990d {

        /* renamed from: a */
        final /* synthetic */ C74993b f168596a;

        static {
            Covode.recordClassIndex(87869);
        }

        C74997d(C74993b bVar) {
            this.f168596a = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.C74990d
        public final void onAnimationEnd(Animator animator) {
            this.f168596a.f168591d.postDelayed(new Runnable(this) {
                /* class com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.p3934d.C74993b.C74997d.RunnableC749981 */

                /* renamed from: a */
                final /* synthetic */ C74997d f168597a;

                static {
                    Covode.recordClassIndex(87870);
                }

                {
                    this.f168597a = r1;
                }

                public final void run() {
                    this.f168597a.f168596a.mo118111a();
                }
            }, 5000);
        }
    }

    public C74993b(C75098b bVar, View view, View view2, View view3) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(view2, "");
        C89219l.m154721d(view3, "");
        this.f168590c = bVar;
        this.f168591d = view;
        this.f168592e = view2;
        this.f168593f = view3;
    }
}
