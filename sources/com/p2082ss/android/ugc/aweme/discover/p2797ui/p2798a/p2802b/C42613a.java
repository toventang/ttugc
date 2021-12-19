package com.p2082ss.android.ugc.aweme.discover.p2797ui.p2798a.p2802b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.a.b.a */
public final class C42613a {

    /* renamed from: a */
    public static final C42613a f99415a = new C42613a();

    private C42613a() {
    }

    static {
        Covode.recordClassIndex(50717);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.a.b.a$c */
    public static final class C42616c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89234a f99418a;

        /* renamed from: b */
        final /* synthetic */ View f99419b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89238e f99420c;

        static {
            Covode.recordClassIndex(50720);
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.ui.a.b.a$c$a */
        static final class RunnableC42617a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C42616c f99421a;

            static {
                Covode.recordClassIndex(50721);
            }

            RunnableC42617a(C42616c cVar) {
                this.f99421a = cVar;
            }

            public final void run() {
                this.f99421a.f99420c.element.start();
                this.f99421a.f99418a.element = true;
            }
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (!this.f99418a.element) {
                this.f99419b.postDelayed(new RunnableC42617a(this), 1000);
            }
        }

        public C42616c(C89233z.C89234a aVar, View view, C89233z.C89238e eVar) {
            this.f99418a = aVar;
            this.f99419b = view;
            this.f99420c = eVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.a.b.a$a */
    public static final class C42614a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89238e f99416a;

        static {
            Covode.recordClassIndex(50718);
        }

        public C42614a(C89233z.C89238e eVar) {
            this.f99416a = eVar;
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f99416a.element.start();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.a.b.a$b */
    public static final class C42615b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89238e f99417a;

        static {
            Covode.recordClassIndex(50719);
        }

        public C42615b(C89233z.C89238e eVar) {
            this.f99417a = eVar;
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f99417a.element.start();
        }
    }
}
