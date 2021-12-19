package androidx.p060l;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.l.c */
public final class C1098c extends AbstractC1134m {

    /* renamed from: p */
    private static final String[] f3761p = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: q */
    private static final Property<Drawable, PointF> f3762q = new Property<Drawable, PointF>(PointF.class, "boundsOrigin") {
        /* class androidx.p060l.C1098c.C10991 */

        /* renamed from: a */
        private Rect f3772a = new Rect();

        static {
            Covode.recordClassIndex(1192);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public final /* synthetic */ PointF get(Drawable drawable) {
            drawable.copyBounds(this.f3772a);
            return new PointF((float) this.f3772a.left, (float) this.f3772a.top);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public final /* synthetic */ void set(Drawable drawable, PointF pointF) {
            Drawable drawable2 = drawable;
            PointF pointF2 = pointF;
            drawable2.copyBounds(this.f3772a);
            this.f3772a.offsetTo(Math.round(pointF2.x), Math.round(pointF2.y));
            drawable2.setBounds(this.f3772a);
        }
    };

    /* renamed from: r */
    private static final Property<C1109a, PointF> f3763r = new Property<C1109a, PointF>(PointF.class, "topLeft") {
        /* class androidx.p060l.C1098c.C11023 */

        static {
            Covode.recordClassIndex(1195);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(C1109a aVar) {
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public final /* synthetic */ void set(C1109a aVar, PointF pointF) {
            C1109a aVar2 = aVar;
            PointF pointF2 = pointF;
            aVar2.f3791a = Math.round(pointF2.x);
            aVar2.f3792b = Math.round(pointF2.y);
            aVar2.f3795e++;
            if (aVar2.f3795e == aVar2.f3796f) {
                aVar2.mo3894a();
            }
        }
    };

    /* renamed from: s */
    private static final Property<C1109a, PointF> f3764s = new Property<C1109a, PointF>(PointF.class, "bottomRight") {
        /* class androidx.p060l.C1098c.C11034 */

        static {
            Covode.recordClassIndex(1196);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(C1109a aVar) {
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public final /* synthetic */ void set(C1109a aVar, PointF pointF) {
            C1109a aVar2 = aVar;
            PointF pointF2 = pointF;
            aVar2.f3793c = Math.round(pointF2.x);
            aVar2.f3794d = Math.round(pointF2.y);
            aVar2.f3796f++;
            if (aVar2.f3795e == aVar2.f3796f) {
                aVar2.mo3894a();
            }
        }
    };

    /* renamed from: t */
    private static final Property<View, PointF> f3765t = new Property<View, PointF>(PointF.class, "bottomRight") {
        /* class androidx.p060l.C1098c.C11045 */

        static {
            Covode.recordClassIndex(1197);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public final /* synthetic */ void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            C1082ae.m3648a(view2, view2.getLeft(), view2.getTop(), Math.round(pointF2.x), Math.round(pointF2.y));
        }
    };

    /* renamed from: u */
    private static final Property<View, PointF> f3766u = new Property<View, PointF>(PointF.class, "topLeft") {
        /* class androidx.p060l.C1098c.C11056 */

        static {
            Covode.recordClassIndex(1198);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public final /* synthetic */ void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            C1082ae.m3648a(view2, Math.round(pointF2.x), Math.round(pointF2.y), view2.getRight(), view2.getBottom());
        }
    };

    /* renamed from: v */
    private static final Property<View, PointF> f3767v = new Property<View, PointF>(PointF.class, "position") {
        /* class androidx.p060l.C1098c.C11067 */

        static {
            Covode.recordClassIndex(1199);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public final /* synthetic */ void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            int round = Math.round(pointF2.x);
            int round2 = Math.round(pointF2.y);
            C1082ae.m3648a(view2, round, round2, view2.getWidth() + round, view2.getHeight() + round2);
        }
    };

    /* renamed from: y */
    private static C1121i f3768y = new C1121i();

    /* renamed from: a */
    public boolean f3769a;

    /* renamed from: w */
    private int[] f3770w = new int[2];

    /* renamed from: x */
    private boolean f3771x;

    @Override // androidx.p060l.AbstractC1134m
    /* renamed from: a */
    public final String[] mo3861a() {
        return f3761p;
    }

    /* renamed from: androidx.l.c$a */
    static class C1109a {

        /* renamed from: a */
        int f3791a;

        /* renamed from: b */
        int f3792b;

        /* renamed from: c */
        int f3793c;

        /* renamed from: d */
        int f3794d;

        /* renamed from: e */
        int f3795e;

        /* renamed from: f */
        int f3796f;

        /* renamed from: g */
        private View f3797g;

        static {
            Covode.recordClassIndex(1202);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo3894a() {
            C1082ae.m3648a(this.f3797g, this.f3791a, this.f3792b, this.f3793c, this.f3794d);
            this.f3795e = 0;
            this.f3796f = 0;
        }

        C1109a(View view) {
            this.f3797g = view;
        }
    }

    static {
        Covode.recordClassIndex(1191);
    }

    @Override // androidx.p060l.AbstractC1134m
    /* renamed from: a */
    public final void mo3859a(C1150s sVar) {
        m3685d(sVar);
    }

    @Override // androidx.p060l.AbstractC1134m
    /* renamed from: b */
    public final void mo3862b(C1150s sVar) {
        m3685d(sVar);
    }

    /* renamed from: d */
    private void m3685d(C1150s sVar) {
        View view = sVar.f3900b;
        if (C0792v.m2788v(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            sVar.f3899a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            sVar.f3899a.put("android:changeBounds:parent", sVar.f3900b.getParent());
            if (this.f3771x) {
                sVar.f3900b.getLocationInWindow(this.f3770w);
                sVar.f3899a.put("android:changeBounds:windowX", Integer.valueOf(this.f3770w[0]));
                sVar.f3899a.put("android:changeBounds:windowY", Integer.valueOf(this.f3770w[1]));
            }
            if (this.f3769a) {
                sVar.f3899a.put("android:changeBounds:clip", C0792v.m2790x(view));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ba  */
    @Override // androidx.p060l.AbstractC1134m
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.Animator mo3858a(final android.view.ViewGroup r24, androidx.p060l.C1150s r25, androidx.p060l.C1150s r26) {
        /*
        // Method dump skipped, instructions count: 672
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.p060l.C1098c.mo3858a(android.view.ViewGroup, androidx.l.s, androidx.l.s):android.animation.Animator");
    }
}
