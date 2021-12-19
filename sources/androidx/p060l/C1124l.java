package androidx.p060l;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.l.l */
public final class C1124l extends AbstractC1089aj {

    /* renamed from: q */
    private static final TimeInterpolator f3827q = new DecelerateInterpolator();

    /* renamed from: r */
    private static final TimeInterpolator f3828r = new AccelerateInterpolator();

    /* renamed from: t */
    private static final AbstractC1131a f3829t = new AbstractC1132b() {
        /* class androidx.p060l.C1124l.C11251 */

        static {
            Covode.recordClassIndex(1218);
        }

        @Override // androidx.p060l.C1124l.AbstractC1131a
        /* renamed from: a */
        public final float mo3904a(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - ((float) viewGroup.getWidth());
        }
    };

    /* renamed from: u */
    private static final AbstractC1131a f3830u = new AbstractC1132b() {
        /* class androidx.p060l.C1124l.C11262 */

        static {
            Covode.recordClassIndex(1219);
        }

        @Override // androidx.p060l.C1124l.AbstractC1131a
        /* renamed from: a */
        public final float mo3904a(ViewGroup viewGroup, View view) {
            if (C0792v.m2768e(viewGroup) == 1) {
                return view.getTranslationX() + ((float) viewGroup.getWidth());
            }
            return view.getTranslationX() - ((float) viewGroup.getWidth());
        }
    };

    /* renamed from: v */
    private static final AbstractC1131a f3831v = new AbstractC1133c() {
        /* class androidx.p060l.C1124l.C11273 */

        static {
            Covode.recordClassIndex(1220);
        }

        @Override // androidx.p060l.C1124l.AbstractC1131a
        /* renamed from: b */
        public final float mo3905b(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - ((float) viewGroup.getHeight());
        }
    };

    /* renamed from: w */
    private static final AbstractC1131a f3832w = new AbstractC1132b() {
        /* class androidx.p060l.C1124l.C11284 */

        static {
            Covode.recordClassIndex(1221);
        }

        @Override // androidx.p060l.C1124l.AbstractC1131a
        /* renamed from: a */
        public final float mo3904a(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + ((float) viewGroup.getWidth());
        }
    };

    /* renamed from: x */
    private static final AbstractC1131a f3833x = new AbstractC1132b() {
        /* class androidx.p060l.C1124l.C11295 */

        static {
            Covode.recordClassIndex(1222);
        }

        @Override // androidx.p060l.C1124l.AbstractC1131a
        /* renamed from: a */
        public final float mo3904a(ViewGroup viewGroup, View view) {
            if (C0792v.m2768e(viewGroup) == 1) {
                return view.getTranslationX() - ((float) viewGroup.getWidth());
            }
            return view.getTranslationX() + ((float) viewGroup.getWidth());
        }
    };

    /* renamed from: y */
    private static final AbstractC1131a f3834y = new AbstractC1133c() {
        /* class androidx.p060l.C1124l.C11306 */

        static {
            Covode.recordClassIndex(1223);
        }

        @Override // androidx.p060l.C1124l.AbstractC1131a
        /* renamed from: b */
        public final float mo3905b(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + ((float) viewGroup.getHeight());
        }
    };

    /* renamed from: a */
    public int f3835a = 80;

    /* renamed from: s */
    private AbstractC1131a f3836s = f3834y;

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.l.l$a */
    public interface AbstractC1131a {
        static {
            Covode.recordClassIndex(1224);
        }

        /* renamed from: a */
        float mo3904a(ViewGroup viewGroup, View view);

        /* renamed from: b */
        float mo3905b(ViewGroup viewGroup, View view);
    }

    /* renamed from: androidx.l.l$b */
    static abstract class AbstractC1132b implements AbstractC1131a {
        static {
            Covode.recordClassIndex(1225);
        }

        private AbstractC1132b() {
        }

        /* synthetic */ AbstractC1132b(byte b) {
            this();
        }

        @Override // androidx.p060l.C1124l.AbstractC1131a
        /* renamed from: b */
        public final float mo3905b(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }
    }

    /* renamed from: androidx.l.l$c */
    static abstract class AbstractC1133c implements AbstractC1131a {
        static {
            Covode.recordClassIndex(1226);
        }

        private AbstractC1133c() {
        }

        /* synthetic */ AbstractC1133c(byte b) {
            this();
        }

        @Override // androidx.p060l.C1124l.AbstractC1131a
        /* renamed from: a */
        public final float mo3904a(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }
    }

    public C1124l() {
        mo3903a(80);
    }

    static {
        Covode.recordClassIndex(1217);
    }

    @Override // androidx.p060l.AbstractC1134m, androidx.p060l.AbstractC1089aj
    /* renamed from: a */
    public final void mo3859a(C1150s sVar) {
        super.mo3859a(sVar);
        m3731d(sVar);
    }

    @Override // androidx.p060l.AbstractC1134m, androidx.p060l.AbstractC1089aj
    /* renamed from: b */
    public final void mo3862b(C1150s sVar) {
        super.mo3862b(sVar);
        m3731d(sVar);
    }

    /* renamed from: d */
    private static void m3731d(C1150s sVar) {
        int[] iArr = new int[2];
        sVar.f3900b.getLocationOnScreen(iArr);
        sVar.f3899a.put("android:slide:screenPosition", iArr);
    }

    /* renamed from: a */
    public final void mo3903a(int i) {
        if (i == 3) {
            this.f3836s = f3829t;
        } else if (i == 5) {
            this.f3836s = f3832w;
        } else if (i == 48) {
            this.f3836s = f3831v;
        } else if (i == 80) {
            this.f3836s = f3834y;
        } else if (i == 8388611) {
            this.f3836s = f3830u;
        } else if (i == 8388613) {
            this.f3836s = f3833x;
        } else {
            throw new IllegalArgumentException("Invalid slide direction");
        }
        this.f3835a = i;
        C1123k kVar = new C1123k();
        kVar.f3825a = i;
        mo3916a(kVar);
    }

    @Override // androidx.p060l.AbstractC1089aj
    /* renamed from: a */
    public final Animator mo3856a(ViewGroup viewGroup, View view, C1150s sVar) {
        if (sVar == null) {
            return null;
        }
        int[] iArr = (int[]) sVar.f3899a.get("android:slide:screenPosition");
        return C1152u.m3833a(view, sVar, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.f3836s.mo3904a(viewGroup, view), this.f3836s.mo3905b(viewGroup, view), f3828r);
    }

    @Override // androidx.p060l.AbstractC1089aj
    /* renamed from: a */
    public final Animator mo3857a(ViewGroup viewGroup, View view, C1150s sVar, C1150s sVar2) {
        if (sVar2 == null) {
            return null;
        }
        int[] iArr = (int[]) sVar2.f3899a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return C1152u.m3833a(view, sVar2, iArr[0], iArr[1], this.f3836s.mo3904a(viewGroup, view), this.f3836s.mo3905b(viewGroup, view), translationX, translationY, f3827q);
    }
}
