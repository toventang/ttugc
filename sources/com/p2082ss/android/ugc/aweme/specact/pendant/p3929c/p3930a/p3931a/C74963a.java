package com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.p3930a.p3931a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.C74990d;
import com.p2082ss.android.ugc.aweme.specact.pendant.views.C75088a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specact.pendant.c.a.a.a */
public final class C74963a {

    /* renamed from: e */
    public static final C74964a f168533e = new C74964a((byte) 0);

    /* renamed from: a */
    boolean f168534a = true;

    /* renamed from: b */
    public boolean f168535b;

    /* renamed from: c */
    public C75088a f168536c;

    /* renamed from: d */
    public View f168537d;

    static {
        Covode.recordClassIndex(87835);
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.c.a.a.a$a */
    public static final class C74964a {
        static {
            Covode.recordClassIndex(87836);
        }

        private C74964a() {
        }

        public /* synthetic */ C74964a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.c.a.a.a$c */
    public static final class RunnableC74966c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C74963a f168539a;

        static {
            Covode.recordClassIndex(87838);
        }

        public RunnableC74966c(C74963a aVar) {
            this.f168539a = aVar;
        }

        public final void run() {
            C74963a aVar = this.f168539a;
            aVar.f168537d.setPivotX(C74963a.m131614a(aVar.f168537d.getContext(), 40.0f));
            aVar.f168537d.setPivotY(C74963a.m131614a(aVar.f168537d.getContext(), 25.0f));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(aVar.f168537d, "scaleX", 1.3f, 1.0f), ObjectAnimator.ofFloat(aVar.f168537d, "scaleY", 1.3f, 1.0f));
            animatorSet.setDuration(297L);
            animatorSet.addListener(new C74967d(aVar));
            animatorSet.setTarget(aVar.f168537d);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(ObjectAnimator.ofFloat(aVar.f168537d, "scaleX", 0.0f, 1.3f), ObjectAnimator.ofFloat(aVar.f168537d, "scaleY", 0.0f, 1.3f));
            animatorSet2.setDuration(528L);
            animatorSet2.addListener(new C74969e(aVar, animatorSet));
            animatorSet2.setTarget(aVar.f168537d);
            aVar.f168537d.setVisibility(0);
            animatorSet2.start();
            aVar.f168534a = false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.c.a.a.a$b */
    public static final class C74965b extends C74990d {

        /* renamed from: a */
        final /* synthetic */ C74963a f168538a;

        static {
            Covode.recordClassIndex(87837);
        }

        C74965b(C74963a aVar) {
            this.f168538a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.C74990d
        public final void onAnimationEnd(Animator animator) {
            this.f168538a.f168537d.setVisibility(8);
            this.f168538a.f168536c.setCanDrag(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.c.a.a.a$d */
    public static final class C74967d extends C74990d {

        /* renamed from: a */
        final /* synthetic */ C74963a f168540a;

        static {
            Covode.recordClassIndex(87839);
        }

        C74967d(C74963a aVar) {
            this.f168540a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.C74990d
        public final void onAnimationEnd(Animator animator) {
            this.f168540a.f168537d.postDelayed(new Runnable(this) {
                /* class com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.p3930a.p3931a.C74963a.C74967d.RunnableC749681 */

                /* renamed from: a */
                final /* synthetic */ C74967d f168541a;

                static {
                    Covode.recordClassIndex(87840);
                }

                {
                    this.f168541a = r1;
                }

                public final void run() {
                    C74963a aVar = this.f168541a.f168540a;
                    if (!aVar.f168534a) {
                        aVar.f168534a = true;
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(ObjectAnimator.ofFloat(aVar.f168537d, "scaleX", 1.0f, 0.0f), ObjectAnimator.ofFloat(aVar.f168537d, "scaleY", 1.0f, 0.0f));
                        animatorSet.setDuration(330L);
                        animatorSet.addListener(new C74965b(aVar));
                        animatorSet.setTarget(aVar.f168537d);
                        animatorSet.start();
                    }
                }
            }, 3000);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.c.a.a.a$e */
    public static final class C74969e extends C74990d {

        /* renamed from: a */
        final /* synthetic */ C74963a f168542a;

        /* renamed from: b */
        final /* synthetic */ AnimatorSet f168543b;

        static {
            Covode.recordClassIndex(87841);
        }

        @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.C74990d
        public final void onAnimationEnd(Animator animator) {
            this.f168543b.start();
        }

        C74969e(C74963a aVar, AnimatorSet animatorSet) {
            this.f168542a = aVar;
            this.f168543b = animatorSet;
        }
    }

    public C74963a(C75088a aVar, View view) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(view, "");
        this.f168536c = aVar;
        this.f168537d = view;
    }

    /* renamed from: a */
    public static float m131614a(Context context, float f) {
        if (context == null) {
            return 0.0f;
        }
        Resources resources = context.getResources();
        C89219l.m154716b(resources, "");
        return (f * resources.getDisplayMetrics().density) + 0.5f;
    }
}
