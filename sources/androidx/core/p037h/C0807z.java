package androidx.core.p037h;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

/* renamed from: androidx.core.h.z */
public final class C0807z {

    /* renamed from: a */
    public WeakReference<View> f2974a;

    /* renamed from: b */
    Runnable f2975b;

    /* renamed from: c */
    public Runnable f2976c;

    /* renamed from: d */
    int f2977d = -1;

    static {
        Covode.recordClassIndex(888);
    }

    /* renamed from: a */
    public final long mo2930a() {
        View view = this.f2974a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0;
    }

    /* renamed from: c */
    public final void mo2940c() {
        View view = this.f2974a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    /* renamed from: b */
    public final void mo2939b() {
        View view = this.f2974a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: androidx.core.h.z$a */
    public static class C0810a implements AbstractC0750aa {

        /* renamed from: a */
        C0807z f2984a;

        /* renamed from: b */
        boolean f2985b;

        static {
            Covode.recordClassIndex(891);
        }

        public C0810a(C0807z zVar) {
            this.f2984a = zVar;
        }

        @Override // androidx.core.p037h.AbstractC0750aa
        /* renamed from: c */
        public final void mo1705c(View view) {
            AbstractC0750aa aaVar;
            Object tag = view.getTag(2113929216);
            if ((tag instanceof AbstractC0750aa) && (aaVar = (AbstractC0750aa) tag) != null) {
                aaVar.mo1705c(view);
            }
        }

        @Override // androidx.core.p037h.AbstractC0750aa
        /* renamed from: a */
        public final void mo557a(View view) {
            AbstractC0750aa aaVar;
            this.f2985b = false;
            if (this.f2984a.f2977d >= 0) {
                view.setLayerType(2, null);
            }
            if (this.f2984a.f2975b != null) {
                Runnable runnable = this.f2984a.f2975b;
                this.f2984a.f2975b = null;
                runnable.run();
            }
            Object tag = view.getTag(2113929216);
            if ((tag instanceof AbstractC0750aa) && (aaVar = (AbstractC0750aa) tag) != null) {
                aaVar.mo557a(view);
            }
        }

        @Override // androidx.core.p037h.AbstractC0750aa
        /* renamed from: b */
        public final void mo558b(View view) {
            AbstractC0750aa aaVar;
            if (this.f2984a.f2977d >= 0) {
                view.setLayerType(this.f2984a.f2977d, null);
                this.f2984a.f2977d = -1;
            }
            int i = Build.VERSION.SDK_INT;
            if (this.f2984a.f2976c != null) {
                Runnable runnable = this.f2984a.f2976c;
                this.f2984a.f2976c = null;
                runnable.run();
            }
            Object tag = view.getTag(2113929216);
            if ((tag instanceof AbstractC0750aa) && (aaVar = (AbstractC0750aa) tag) != null) {
                aaVar.mo558b(view);
            }
            this.f2985b = true;
        }
    }

    C0807z(View view) {
        this.f2974a = new WeakReference<>(view);
    }

    /* renamed from: b */
    public final C0807z mo2937b(float f) {
        View view = this.f2974a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }

    /* renamed from: a */
    public final C0807z mo2931a(float f) {
        View view = this.f2974a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    /* renamed from: b */
    public final C0807z mo2938b(long j) {
        View view = this.f2974a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    /* renamed from: a */
    public final C0807z mo2932a(long j) {
        View view = this.f2974a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    /* renamed from: a */
    public final C0807z mo2933a(Interpolator interpolator) {
        View view = this.f2974a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    /* renamed from: a */
    public final C0807z mo2934a(AbstractC0750aa aaVar) {
        View view = this.f2974a.get();
        if (view != null) {
            int i = Build.VERSION.SDK_INT;
            mo2936a(view, aaVar);
        }
        return this;
    }

    /* renamed from: a */
    public final C0807z mo2935a(final AbstractC0752ac acVar) {
        final View view = this.f2974a.get();
        if (view != null) {
            int i = Build.VERSION.SDK_INT;
            C08092 r1 = null;
            if (acVar != null) {
                r1 = new ValueAnimator.AnimatorUpdateListener() {
                    /* class androidx.core.p037h.C0807z.C08092 */

                    static {
                        Covode.recordClassIndex(890);
                    }

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        acVar.mo612a();
                    }
                };
            }
            view.animate().setUpdateListener(r1);
        }
        return this;
    }

    /* renamed from: a */
    public final void mo2936a(final View view, final AbstractC0750aa aaVar) {
        if (aaVar != null) {
            view.animate().setListener(new AnimatorListenerAdapter() {
                /* class androidx.core.p037h.C0807z.C08081 */

                static {
                    Covode.recordClassIndex(889);
                }

                public final void onAnimationCancel(Animator animator) {
                    aaVar.mo1705c(view);
                }

                public final void onAnimationEnd(Animator animator) {
                    aaVar.mo558b(view);
                }

                public final void onAnimationStart(Animator animator) {
                    aaVar.mo557a(view);
                }
            });
        } else {
            view.animate().setListener(null);
        }
    }
}
