package com.bytedance.tux.extension.player.p1718a;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.bytedance.covode.number.Covode;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.extension.player.a.d */
public final class C23088d {

    /* renamed from: a */
    public static Runnable f54658a;

    /* renamed from: b */
    public static final C23088d f54659b = new C23088d();

    /* renamed from: c */
    private static final AbstractC89244h f54660c = C89250i.m154773a((AbstractC89171a) C23091b.f54664a);

    /* renamed from: a */
    public static Handler m43534a() {
        return (Handler) f54660c.getValue();
    }

    private C23088d() {
    }

    /* renamed from: com.bytedance.tux.extension.player.a.d$b */
    static final class C23091b extends AbstractC89220m implements AbstractC89171a<Handler> {

        /* renamed from: a */
        public static final C23091b f54664a = new C23091b();

        static {
            Covode.recordClassIndex(27015);
        }

        C23091b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    static {
        Covode.recordClassIndex(27012);
    }

    /* renamed from: com.bytedance.tux.extension.player.a.d$a */
    public static final class RunnableC23089a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f54661a;

        /* renamed from: b */
        final /* synthetic */ Animator.AnimatorListener f54662b;

        static {
            Covode.recordClassIndex(27013);
        }

        public RunnableC23089a(View view, Animator.AnimatorListener animatorListener) {
            this.f54661a = view;
            this.f54662b = animatorListener;
        }

        public final void run() {
            float f;
            View view = this.f54661a;
            if (view != null) {
                f = view.getAlpha();
            } else {
                f = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f54661a, "alpha", f, 0.0f);
            C89219l.m154709a((Object) ofFloat, "");
            ofFloat.setInterpolator(new DecelerateInterpolator());
            ofFloat.addListener(new Animator.AnimatorListener(this) {
                /* class com.bytedance.tux.extension.player.p1718a.C23088d.RunnableC23089a.C230901 */

                /* renamed from: a */
                final /* synthetic */ RunnableC23089a f54663a;

                static {
                    Covode.recordClassIndex(27014);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f54663a = r1;
                }

                public final void onAnimationCancel(Animator animator) {
                    Animator.AnimatorListener animatorListener = this.f54663a.f54662b;
                    if (animatorListener != null) {
                        animatorListener.onAnimationCancel(animator);
                    }
                }

                public final void onAnimationEnd(Animator animator) {
                    Animator.AnimatorListener animatorListener = this.f54663a.f54662b;
                    if (animatorListener != null) {
                        animatorListener.onAnimationEnd(animator);
                    }
                }

                public final void onAnimationRepeat(Animator animator) {
                    Animator.AnimatorListener animatorListener = this.f54663a.f54662b;
                    if (animatorListener != null) {
                        animatorListener.onAnimationRepeat(animator);
                    }
                }

                public final void onAnimationStart(Animator animator) {
                    Animator.AnimatorListener animatorListener = this.f54663a.f54662b;
                    if (animatorListener != null) {
                        animatorListener.onAnimationStart(animator);
                    }
                }
            });
            ofFloat.setDuration(300L);
            ofFloat.start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.tux.extension.player.a.d$c */
    public static final class RunnableC23092c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f54665a;

        /* renamed from: b */
        final /* synthetic */ Animator.AnimatorListener f54666b;

        static {
            Covode.recordClassIndex(27016);
        }

        RunnableC23092c(View view, Animator.AnimatorListener animatorListener) {
            this.f54665a = view;
            this.f54666b = animatorListener;
        }

        public final void run() {
            float f;
            View view = this.f54665a;
            if (view != null) {
                f = view.getAlpha();
            } else {
                f = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f54665a, "alpha", f, 1.0f);
            C89219l.m154709a((Object) ofFloat, "");
            ofFloat.setInterpolator(new DecelerateInterpolator());
            ofFloat.addListener(new Animator.AnimatorListener(this) {
                /* class com.bytedance.tux.extension.player.p1718a.C23088d.RunnableC23092c.C230931 */

                /* renamed from: a */
                final /* synthetic */ RunnableC23092c f54667a;

                static {
                    Covode.recordClassIndex(27017);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f54667a = r1;
                }

                public final void onAnimationCancel(Animator animator) {
                    Animator.AnimatorListener animatorListener = this.f54667a.f54666b;
                    if (animatorListener != null) {
                        animatorListener.onAnimationCancel(animator);
                    }
                }

                public final void onAnimationEnd(Animator animator) {
                    Animator.AnimatorListener animatorListener = this.f54667a.f54666b;
                    if (animatorListener != null) {
                        animatorListener.onAnimationEnd(animator);
                    }
                }

                public final void onAnimationRepeat(Animator animator) {
                    Animator.AnimatorListener animatorListener = this.f54667a.f54666b;
                    if (animatorListener != null) {
                        animatorListener.onAnimationRepeat(animator);
                    }
                }

                public final void onAnimationStart(Animator animator) {
                    Animator.AnimatorListener animatorListener = this.f54667a.f54666b;
                    if (animatorListener != null) {
                        animatorListener.onAnimationStart(animator);
                    }
                }
            });
            ofFloat.setDuration(300L);
            ofFloat.start();
        }
    }

    /* renamed from: a */
    public static Rect m43533a(View view) {
        C89219l.m154719c(view, "");
        Rect rect = new Rect();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
        return rect;
    }

    /* renamed from: a */
    public static /* synthetic */ void m43535a(View view, Animator.AnimatorListener animatorListener, int i) {
        if ((i & 4) != 0) {
            animatorListener = null;
        }
        RunnableC23092c cVar = new RunnableC23092c(view, animatorListener);
        f54658a = cVar;
        m43534a().removeCallbacksAndMessages(null);
        m43534a().postDelayed(cVar, 0);
    }
}
