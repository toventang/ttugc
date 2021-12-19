package androidx.p060l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.l.d */
public final class C1110d extends AbstractC1089aj {
    static {
        Covode.recordClassIndex(1203);
    }

    public C1110d() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.l.d$a */
    public static class C1112a extends AnimatorListenerAdapter {

        /* renamed from: a */
        private final View f3800a;

        /* renamed from: b */
        private boolean f3801b;

        static {
            Covode.recordClassIndex(1205);
        }

        C1112a(View view) {
            this.f3800a = view;
        }

        public final void onAnimationEnd(Animator animator) {
            C1082ae.m3646a(this.f3800a, 1.0f);
            if (this.f3801b) {
                this.f3800a.setLayerType(0, null);
            }
        }

        public final void onAnimationStart(Animator animator) {
            if (C0792v.m2782p(this.f3800a) && this.f3800a.getLayerType() == 0) {
                this.f3801b = true;
                this.f3800a.setLayerType(2, null);
            }
        }
    }

    public C1110d(int i) {
        mo3863c(i);
    }

    @Override // androidx.p060l.AbstractC1134m, androidx.p060l.AbstractC1089aj
    /* renamed from: a */
    public final void mo3859a(C1150s sVar) {
        super.mo3859a(sVar);
        sVar.f3899a.put("android:fade:transitionAlpha", Float.valueOf(C1082ae.f3726a.mo3849a(sVar.f3900b)));
    }

    /* renamed from: a */
    private static float m3694a(C1150s sVar, float f) {
        Float f2;
        if (sVar == null || (f2 = (Float) sVar.f3899a.get("android:fade:transitionAlpha")) == null) {
            return f;
        }
        return f2.floatValue();
    }

    /* renamed from: a */
    private Animator m3695a(final View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        C1082ae.m3646a(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, C1082ae.f3727b, f2);
        ofFloat.addListener(new C1112a(view));
        mo3908a(new C1141n() {
            /* class androidx.p060l.C1110d.C11111 */

            static {
                Covode.recordClassIndex(1204);
            }

            @Override // androidx.p060l.AbstractC1134m.AbstractC1140c, androidx.p060l.C1141n
            /* renamed from: a */
            public final void mo3865a(AbstractC1134m mVar) {
                C1082ae.m3646a(view, 1.0f);
                C1082ae.f3726a.mo3852c(view);
                mVar.mo3922b(this);
            }
        });
        return ofFloat;
    }

    @Override // androidx.p060l.AbstractC1089aj
    /* renamed from: a */
    public final Animator mo3856a(ViewGroup viewGroup, View view, C1150s sVar) {
        C1082ae.f3726a.mo3851b(view);
        return m3695a(view, m3694a(sVar, 1.0f), 0.0f);
    }

    @Override // androidx.p060l.AbstractC1089aj
    /* renamed from: a */
    public final Animator mo3857a(ViewGroup viewGroup, View view, C1150s sVar, C1150s sVar2) {
        float f = 0.0f;
        float a = m3694a(sVar, 0.0f);
        if (a != 1.0f) {
            f = a;
        }
        return m3695a(view, f, 1.0f);
    }
}
