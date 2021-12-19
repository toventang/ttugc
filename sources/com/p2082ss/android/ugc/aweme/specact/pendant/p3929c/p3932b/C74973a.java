package com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.p3932b;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.C74990d;
import com.p2082ss.android.ugc.aweme.specact.pendant.views.C75098b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specact.pendant.c.b.a */
public final class C74973a {

    /* renamed from: d */
    public static final C74974a f168554d = new C74974a((byte) 0);

    /* renamed from: a */
    public boolean f168555a = true;

    /* renamed from: b */
    public C75098b f168556b;

    /* renamed from: c */
    public View f168557c;

    static {
        Covode.recordClassIndex(87845);
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.c.b.a$a */
    public static final class C74974a {
        static {
            Covode.recordClassIndex(87846);
        }

        private C74974a() {
        }

        public /* synthetic */ C74974a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.c.b.a$b */
    public static final class C74975b extends C74990d {

        /* renamed from: a */
        final /* synthetic */ C74973a f168558a;

        static {
            Covode.recordClassIndex(87847);
        }

        C74975b(C74973a aVar) {
            this.f168558a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.C74990d
        public final void onAnimationEnd(Animator animator) {
            this.f168558a.f168557c.setVisibility(8);
            this.f168558a.f168556b.setCanDrag(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.c.b.a$c */
    public static final class C74976c extends C74990d {

        /* renamed from: a */
        final /* synthetic */ C74973a f168559a;

        static {
            Covode.recordClassIndex(87848);
        }

        public C74976c(C74973a aVar) {
            this.f168559a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.C74990d
        public final void onAnimationEnd(Animator animator) {
            this.f168559a.f168557c.postDelayed(new Runnable(this) {
                /* class com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.p3932b.C74973a.C74976c.RunnableC749771 */

                /* renamed from: a */
                final /* synthetic */ C74976c f168560a;

                static {
                    Covode.recordClassIndex(87849);
                }

                {
                    this.f168560a = r1;
                }

                public final void run() {
                    C74973a aVar = this.f168560a.f168559a;
                    if (!aVar.f168555a) {
                        aVar.f168555a = true;
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(ObjectAnimator.ofFloat(aVar.f168557c, "scaleX", 1.0f, 0.0f), ObjectAnimator.ofFloat(aVar.f168557c, "scaleY", 1.0f, 0.0f));
                        animatorSet.setDuration(330L);
                        animatorSet.addListener(new C74975b(aVar));
                        animatorSet.setTarget(aVar.f168557c);
                        animatorSet.start();
                    }
                }
            }, 3000);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.c.b.a$d */
    public static final class C74978d extends C74990d {

        /* renamed from: a */
        final /* synthetic */ C74973a f168561a;

        /* renamed from: b */
        final /* synthetic */ AnimatorSet f168562b;

        static {
            Covode.recordClassIndex(87850);
        }

        @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.C74990d
        public final void onAnimationEnd(Animator animator) {
            this.f168562b.start();
        }

        public C74978d(C74973a aVar, AnimatorSet animatorSet) {
            this.f168561a = aVar;
            this.f168562b = animatorSet;
        }
    }

    public C74973a(C75098b bVar, View view) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(view, "");
        this.f168556b = bVar;
        this.f168557c = view;
    }

    /* renamed from: a */
    public static float m131624a(Context context, float f) {
        if (context == null) {
            return 0.0f;
        }
        Resources resources = context.getResources();
        C89219l.m154716b(resources, "");
        return (f * resources.getDisplayMetrics().density) + 0.5f;
    }
}
