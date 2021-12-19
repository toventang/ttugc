package com.bytedance.android.live.liveinteract.linkroom.widget;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.linkroom.widget.ac */
public final class C4905ac {

    /* renamed from: a */
    static boolean f12858a;

    /* renamed from: b */
    static Runnable f12859b;

    /* renamed from: c */
    public static final C4905ac f12860c = new C4905ac();

    /* renamed from: d */
    private static EnumC4906a f12861d = EnumC4906a.NOTCOHOST;

    /* renamed from: com.bytedance.android.live.liveinteract.linkroom.widget.ac$a */
    public enum EnumC4906a {
        NOTCOHOST(0),
        COHOST(1);
        

        /* renamed from: b */
        private final int f12863b;

        public final int getValue() {
            return this.f12863b;
        }

        static {
            Covode.recordClassIndex(5489);
        }

        private EnumC4906a(int i) {
            this.f12863b = i;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.linkroom.widget.ac$b */
    public enum EnumC4907b {
        MULTIGUEST(0),
        PK(1);
        

        /* renamed from: b */
        private final int f12866b;

        public final int getValue() {
            return this.f12866b;
        }

        static {
            Covode.recordClassIndex(5490);
        }

        private EnumC4907b(int i) {
            this.f12866b = i;
        }
    }

    private C4905ac() {
    }

    static {
        Covode.recordClassIndex(5488);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.linkroom.widget.ac$c */
    public static final class RunnableC4908c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Runnable f12867a;

        /* renamed from: b */
        final /* synthetic */ View f12868b;

        static {
            Covode.recordClassIndex(5491);
        }

        RunnableC4908c(Runnable runnable, View view) {
            this.f12867a = runnable;
            this.f12868b = view;
        }

        public final void run() {
            this.f12867a.run();
            if (this.f12868b.getVisibility() == 0) {
                ObjectAnimator.ofFloat(this.f12868b, "alpha", 0.0f, 1.0f).setDuration(200L).start();
            }
        }
    }

    /* renamed from: a */
    public static void m11132a(EnumC4906a aVar) {
        C89219l.m154721d(aVar, "");
        f12861d = aVar;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.linkroom.widget.ac$d */
    public static final class C4909d implements AbstractC4910ad {

        /* renamed from: a */
        final /* synthetic */ View f12869a;

        /* renamed from: b */
        final /* synthetic */ Runnable f12870b;

        static {
            Covode.recordClassIndex(5492);
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        public final void onAnimationEnd(Animator animator) {
            this.f12869a.setAlpha(1.0f);
            this.f12870b.run();
            C4905ac.f12858a = false;
            Runnable runnable = C4905ac.f12859b;
            if (runnable != null) {
                runnable.run();
            }
            C4905ac.f12859b = null;
        }

        C4909d(View view, Runnable runnable) {
            this.f12869a = view;
            this.f12870b = runnable;
        }
    }

    /* renamed from: b */
    public static void m11133b(View view, Runnable runnable, EnumC4907b bVar) {
        C89219l.m154721d(runnable, "");
        C89219l.m154721d(bVar, "");
        if (view == null || view.getVisibility() == 0 || bVar.getValue() == f12861d.getValue()) {
            runnable.run();
            return;
        }
        RunnableC4908c cVar = new RunnableC4908c(runnable, view);
        if (f12858a) {
            f12859b = cVar;
        } else {
            cVar.run();
        }
    }

    /* renamed from: a */
    public static void m11131a(View view, Runnable runnable, EnumC4907b bVar) {
        C89219l.m154721d(runnable, "");
        C89219l.m154721d(bVar, "");
        if (view != null && view.getVisibility() == 0 && bVar.getValue() == f12861d.getValue()) {
            ObjectAnimator duration = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f).setDuration(200L);
            C89219l.m154716b(duration, "");
            duration.addListener(new C4909d(view, runnable));
            f12858a = true;
            duration.start();
            return;
        }
        runnable.run();
    }
}
