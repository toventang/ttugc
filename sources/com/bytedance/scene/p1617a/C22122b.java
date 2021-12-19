package com.bytedance.scene.p1617a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.bytedance.scene.a.b */
public final class C22122b {

    /* renamed from: a */
    public final Animation f52304a;

    /* renamed from: b */
    public final Animator f52305b;

    /* renamed from: c */
    public C22125a f52306c;

    static {
        Covode.recordClassIndex(25926);
    }

    /* renamed from: com.bytedance.scene.a.b$a */
    static class C22125a {

        /* renamed from: a */
        private final Runnable f52309a;

        /* renamed from: b */
        private boolean f52310b;

        static {
            Covode.recordClassIndex(25929);
        }

        /* renamed from: a */
        public final void mo36320a() {
            if (!this.f52310b) {
                this.f52310b = true;
                this.f52309a.run();
            }
        }

        private C22125a(Runnable runnable) {
            if (runnable != null) {
                this.f52309a = runnable;
                return;
            }
            throw new IllegalStateException("runnable cannot be null");
        }

        /* synthetic */ C22125a(Runnable runnable, byte b) {
            this(runnable);
        }
    }

    /* renamed from: a */
    public final void mo36313a() {
        Animation animation = this.f52304a;
        if (animation != null) {
            animation.cancel();
            this.f52304a.reset();
            C22125a aVar = this.f52306c;
            if (aVar != null) {
                aVar.mo36320a();
                return;
            }
            return;
        }
        Animator animator = this.f52305b;
        if (animator != null) {
            animator.end();
        }
    }

    private C22122b(Animator animator) {
        this.f52305b = animator;
        if (animator == null) {
            throw new IllegalStateException("Animator cannot be null");
        }
    }

    private C22122b(Animation animation) {
        this.f52304a = animation;
        if (animation == null) {
            throw new IllegalStateException("Animation cannot be null");
        }
    }

    /* renamed from: a */
    public final void mo36314a(View view) {
        Animation animation = this.f52304a;
        if (animation != null) {
            view.startAnimation(animation);
            return;
        }
        Animator animator = this.f52305b;
        if (animator != null) {
            animator.setTarget(view);
            this.f52305b.start();
        }
    }

    /* renamed from: a */
    public final void mo36315a(Runnable runnable) {
        this.f52306c = new C22125a(runnable, (byte) 0);
        Animation animation = this.f52304a;
        if (animation != null) {
            animation.setAnimationListener(new Animation.AnimationListener() {
                /* class com.bytedance.scene.p1617a.C22122b.animationAnimation$AnimationListenerC221231 */

                static {
                    Covode.recordClassIndex(25927);
                }

                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                }

                public final void onAnimationEnd(Animation animation) {
                    C22122b.this.f52306c.mo36320a();
                    animation.setAnimationListener(null);
                }
            });
            return;
        }
        Animator animator = this.f52305b;
        if (animator != null) {
            animator.addListener(new AnimatorListenerAdapter() {
                /* class com.bytedance.scene.p1617a.C22122b.C221242 */

                static {
                    Covode.recordClassIndex(25928);
                }

                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    C22122b.this.f52306c.mo36320a();
                    C22122b.this.f52305b.removeListener(this);
                }
            });
        }
    }

    /* renamed from: a */
    public static C22122b m41603a(Activity activity, int i) {
        MethodCollector.m26663i(8462);
        boolean equals = "anim".equals(activity.getResources().getResourceTypeName(i));
        if (equals) {
            try {
                Animation loadAnimation = AnimationUtils.loadAnimation(activity, i);
                if (loadAnimation != null) {
                    C22122b bVar = new C22122b(loadAnimation);
                    MethodCollector.m26664o(8462);
                    return bVar;
                }
            } catch (Resources.NotFoundException e) {
                MethodCollector.m26664o(8462);
                throw e;
            } catch (RuntimeException unused) {
            }
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("resource is error");
            MethodCollector.m26664o(8462);
            throw illegalArgumentException;
        }
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(activity, i);
            if (loadAnimator != null) {
                C22122b bVar2 = new C22122b(loadAnimator);
                MethodCollector.m26664o(8462);
                return bVar2;
            }
        } catch (RuntimeException e2) {
            if (!equals) {
                Animation loadAnimation2 = AnimationUtils.loadAnimation(activity, i);
                if (loadAnimation2 != null) {
                    C22122b bVar3 = new C22122b(loadAnimation2);
                    MethodCollector.m26664o(8462);
                    return bVar3;
                }
            } else {
                MethodCollector.m26664o(8462);
                throw e2;
            }
        }
        IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("resource is error");
        MethodCollector.m26664o(8462);
        throw illegalArgumentException2;
    }
}
