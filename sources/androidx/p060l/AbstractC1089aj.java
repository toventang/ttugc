package androidx.p060l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.p060l.AbstractC1134m;
import androidx.p060l.C1075a;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.l.aj */
public abstract class AbstractC1089aj extends AbstractC1134m {

    /* renamed from: a */
    private static final String[] f3741a = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: p */
    public int f3742p = 3;

    /* renamed from: a */
    public Animator mo3856a(ViewGroup viewGroup, View view, C1150s sVar) {
        return null;
    }

    /* renamed from: a */
    public Animator mo3857a(ViewGroup viewGroup, View view, C1150s sVar, C1150s sVar2) {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.l.aj$b */
    public static class C1092b {

        /* renamed from: a */
        boolean f3752a;

        /* renamed from: b */
        boolean f3753b;

        /* renamed from: c */
        int f3754c;

        /* renamed from: d */
        int f3755d;

        /* renamed from: e */
        ViewGroup f3756e;

        /* renamed from: f */
        ViewGroup f3757f;

        static {
            Covode.recordClassIndex(1185);
        }

        C1092b() {
        }
    }

    static {
        Covode.recordClassIndex(1182);
    }

    /* renamed from: androidx.l.aj$a */
    static class C1091a extends AnimatorListenerAdapter implements C1075a.AbstractC1076a, AbstractC1134m.AbstractC1140c {

        /* renamed from: a */
        boolean f3746a;

        /* renamed from: b */
        private final View f3747b;

        /* renamed from: c */
        private final int f3748c;

        /* renamed from: d */
        private final ViewGroup f3749d;

        /* renamed from: e */
        private final boolean f3750e = true;

        /* renamed from: f */
        private boolean f3751f;

        static {
            Covode.recordClassIndex(1184);
        }

        @Override // androidx.p060l.AbstractC1134m.AbstractC1140c
        /* renamed from: d */
        public final void mo3868d(AbstractC1134m mVar) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        /* renamed from: a */
        private void m3674a() {
            if (!this.f3746a) {
                C1082ae.m3647a(this.f3747b, this.f3748c);
                ViewGroup viewGroup = this.f3749d;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            m3675a(false);
        }

        public final void onAnimationCancel(Animator animator) {
            this.f3746a = true;
        }

        public final void onAnimationEnd(Animator animator) {
            m3674a();
        }

        @Override // androidx.p060l.AbstractC1134m.AbstractC1140c
        /* renamed from: a */
        public final void mo3865a(AbstractC1134m mVar) {
            m3674a();
            mVar.mo3922b(this);
        }

        @Override // androidx.p060l.AbstractC1134m.AbstractC1140c
        /* renamed from: b */
        public final void mo3866b(AbstractC1134m mVar) {
            m3675a(false);
        }

        @Override // androidx.p060l.AbstractC1134m.AbstractC1140c
        /* renamed from: c */
        public final void mo3867c(AbstractC1134m mVar) {
            m3675a(true);
        }

        @Override // androidx.p060l.C1075a.AbstractC1076a
        public final void onAnimationPause(Animator animator) {
            if (!this.f3746a) {
                C1082ae.m3647a(this.f3747b, this.f3748c);
            }
        }

        @Override // androidx.p060l.C1075a.AbstractC1076a
        public final void onAnimationResume(Animator animator) {
            if (!this.f3746a) {
                C1082ae.m3647a(this.f3747b, 0);
            }
        }

        /* renamed from: a */
        private void m3675a(boolean z) {
            ViewGroup viewGroup;
            if (this.f3750e && this.f3751f != z && (viewGroup = this.f3749d) != null) {
                this.f3751f = z;
                C1157y.m3842a(viewGroup, z);
            }
        }

        C1091a(View view, int i) {
            this.f3747b = view;
            this.f3748c = i;
            this.f3749d = (ViewGroup) view.getParent();
            m3675a(true);
        }
    }

    @Override // androidx.p060l.AbstractC1134m
    /* renamed from: a */
    public final String[] mo3861a() {
        return f3741a;
    }

    @Override // androidx.p060l.AbstractC1134m
    /* renamed from: b */
    public void mo3862b(C1150s sVar) {
        m3665d(sVar);
    }

    @Override // androidx.p060l.AbstractC1134m
    /* renamed from: a */
    public void mo3859a(C1150s sVar) {
        m3665d(sVar);
    }

    /* renamed from: c */
    public final void mo3863c(int i) {
        if ((i & -4) == 0) {
            this.f3742p = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    /* renamed from: d */
    private static void m3665d(C1150s sVar) {
        sVar.f3899a.put("android:visibility:visibility", Integer.valueOf(sVar.f3900b.getVisibility()));
        sVar.f3899a.put("android:visibility:parent", sVar.f3900b.getParent());
        int[] iArr = new int[2];
        sVar.f3900b.getLocationOnScreen(iArr);
        sVar.f3899a.put("android:visibility:screenLocation", iArr);
    }

    @Override // androidx.p060l.AbstractC1134m
    /* renamed from: a */
    public final boolean mo3860a(C1150s sVar, C1150s sVar2) {
        if (sVar == null) {
            if (sVar2 == null) {
                return false;
            }
        } else if (!(sVar2 == null || sVar2.f3899a.containsKey("android:visibility:visibility") == sVar.f3899a.containsKey("android:visibility:visibility"))) {
            return false;
        }
        C1092b b = m3664b(sVar, sVar2);
        if (!b.f3752a || (b.f3754c != 0 && b.f3755d != 0)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a3, code lost:
        if (r8 == null) goto L_0x00a5;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static androidx.p060l.AbstractC1089aj.C1092b m3664b(androidx.p060l.C1150s r7, androidx.p060l.C1150s r8) {
        /*
        // Method dump skipped, instructions count: 174
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.p060l.AbstractC1089aj.m3664b(androidx.l.s, androidx.l.s):androidx.l.aj$b");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a7, code lost:
        if (0 != 0) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0124, code lost:
        if (r9.f3858k != false) goto L_0x005a;
     */
    @Override // androidx.p060l.AbstractC1134m
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.Animator mo3858a(android.view.ViewGroup r10, androidx.p060l.C1150s r11, androidx.p060l.C1150s r12) {
        /*
        // Method dump skipped, instructions count: 300
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.p060l.AbstractC1089aj.mo3858a(android.view.ViewGroup, androidx.l.s, androidx.l.s):android.animation.Animator");
    }
}
