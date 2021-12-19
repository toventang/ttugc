package androidx.core.p037h;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.WindowInsets;
import androidx.core.graphics.C0700b;
import androidx.core.p036g.C0691d;
import androidx.core.p036g.C0697g;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Objects;

/* renamed from: androidx.core.h.ad */
public class C0753ad {

    /* renamed from: a */
    public static final C0753ad f2887a = new C0754a().f2889a.mo2874a().f2888b.mo2882f().f2888b.mo2879d().f2888b.mo2878c();

    /* renamed from: b */
    public final C0758e f2888b;

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.core.h.ad$b */
    public static class C0755b {

        /* renamed from: a */
        private final C0753ad f2890a;

        static {
            Covode.recordClassIndex(836);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2875a(C0700b bVar) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0753ad mo2874a() {
            return this.f2890a;
        }

        C0755b() {
            this(new C0753ad((C0753ad) null));
        }

        C0755b(C0753ad adVar) {
            this.f2890a = adVar;
        }
    }

    /* renamed from: androidx.core.h.ad$e */
    public static class C0758e {

        /* renamed from: a */
        final C0753ad f2897a;

        static {
            Covode.recordClassIndex(839);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo2876a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo2877b() {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C0768c mo2880e() {
            return null;
        }

        /* renamed from: c */
        public C0753ad mo2878c() {
            return this.f2897a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C0753ad mo2879d() {
            return this.f2897a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public C0753ad mo2882f() {
            return this.f2897a;
        }

        /* renamed from: g */
        public C0700b mo2883g() {
            return C0700b.f2758a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public C0700b mo2884h() {
            return C0700b.f2758a;
        }

        public int hashCode() {
            return C0691d.m2447a(Boolean.valueOf(mo2876a()), Boolean.valueOf(mo2877b()), mo2883g(), mo2884h(), mo2880e());
        }

        C0758e(C0753ad adVar) {
            this.f2897a = adVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0758e)) {
                return false;
            }
            C0758e eVar = (C0758e) obj;
            if (mo2876a() != eVar.mo2876a() || mo2877b() != eVar.mo2877b() || !C0691d.m2448a(mo2883g(), eVar.mo2883g()) || !C0691d.m2448a(mo2884h(), eVar.mo2884h()) || !C0691d.m2448a(mo2880e(), eVar.mo2880e())) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: androidx.core.h.ad$c */
    static class C0756c extends C0755b {

        /* renamed from: a */
        private static Field f2891a;

        /* renamed from: b */
        private static boolean f2892b;

        /* renamed from: c */
        private static Constructor<WindowInsets> f2893c;

        /* renamed from: d */
        private static boolean f2894d;

        /* renamed from: e */
        private WindowInsets f2895e;

        static {
            Covode.recordClassIndex(837);
        }

        /* renamed from: a */
        public static int m2647a(String str, String str2, Throwable th) {
            return 0;
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.core.p037h.C0753ad.C0755b
        /* renamed from: a */
        public final C0753ad mo2874a() {
            return C0753ad.m2637a(this.f2895e);
        }

        C0756c() {
            this.f2895e = m2648b();
        }

        /* renamed from: b */
        private static WindowInsets m2648b() {
            if (!f2892b) {
                try {
                    f2891a = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e) {
                    m2647a("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e);
                }
                f2892b = true;
            }
            Field field = f2891a;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e2) {
                    m2647a("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e2);
                }
            }
            if (!f2894d) {
                try {
                    f2893c = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e3) {
                    m2647a("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e3);
                }
                f2894d = true;
            }
            Constructor<WindowInsets> constructor = f2893c;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e4) {
                    m2647a("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e4);
                }
            }
            return null;
        }

        C0756c(C0753ad adVar) {
            this.f2895e = adVar.mo2870e();
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.core.p037h.C0753ad.C0755b
        /* renamed from: a */
        public final void mo2875a(C0700b bVar) {
            WindowInsets windowInsets = this.f2895e;
            if (windowInsets != null) {
                this.f2895e = windowInsets.replaceSystemWindowInsets(bVar.f2759b, bVar.f2760c, bVar.f2761d, bVar.f2762e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.core.h.ad$f */
    public static class C0759f extends C0758e {

        /* renamed from: b */
        final WindowInsets f2898b;

        /* renamed from: c */
        private C0700b f2899c;

        static {
            Covode.recordClassIndex(840);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.core.p037h.C0753ad.C0758e
        /* renamed from: a */
        public boolean mo2876a() {
            return this.f2898b.isRound();
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.core.p037h.C0753ad.C0758e
        /* renamed from: g */
        public final C0700b mo2883g() {
            if (this.f2899c == null) {
                this.f2899c = C0700b.m2468a(this.f2898b.getSystemWindowInsetLeft(), this.f2898b.getSystemWindowInsetTop(), this.f2898b.getSystemWindowInsetRight(), this.f2898b.getSystemWindowInsetBottom());
            }
            return this.f2899c;
        }

        C0759f(C0753ad adVar, WindowInsets windowInsets) {
            super(adVar);
            this.f2898b = windowInsets;
        }

        C0759f(C0753ad adVar, C0759f fVar) {
            this(adVar, new WindowInsets(fVar.f2898b));
        }
    }

    /* renamed from: androidx.core.h.ad$g */
    static class C0760g extends C0759f {

        /* renamed from: c */
        private C0700b f2900c;

        static {
            Covode.recordClassIndex(841);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.core.p037h.C0753ad.C0758e
        /* renamed from: b */
        public boolean mo2877b() {
            return this.f2898b.isConsumed();
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.core.p037h.C0753ad.C0758e
        /* renamed from: c */
        public C0753ad mo2878c() {
            return C0753ad.m2637a(this.f2898b.consumeSystemWindowInsets());
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.core.p037h.C0753ad.C0758e
        /* renamed from: d */
        public C0753ad mo2879d() {
            return C0753ad.m2637a(this.f2898b.consumeStableInsets());
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.core.p037h.C0753ad.C0758e
        /* renamed from: h */
        public final C0700b mo2884h() {
            if (this.f2900c == null) {
                this.f2900c = C0700b.m2468a(this.f2898b.getStableInsetLeft(), this.f2898b.getStableInsetTop(), this.f2898b.getStableInsetRight(), this.f2898b.getStableInsetBottom());
            }
            return this.f2900c;
        }

        C0760g(C0753ad adVar, WindowInsets windowInsets) {
            super(adVar, windowInsets);
        }

        C0760g(C0753ad adVar, C0760g gVar) {
            super(adVar, gVar);
        }
    }

    /* renamed from: androidx.core.h.ad$h */
    static class C0761h extends C0760g {
        static {
            Covode.recordClassIndex(842);
        }

        @Override // androidx.core.p037h.C0753ad.C0758e
        public int hashCode() {
            return this.f2898b.hashCode();
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.core.p037h.C0753ad.C0758e
        /* renamed from: e */
        public C0768c mo2880e() {
            DisplayCutout displayCutout = this.f2898b.getDisplayCutout();
            if (displayCutout == null) {
                return null;
            }
            return new C0768c(displayCutout);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.core.p037h.C0753ad.C0758e
        /* renamed from: f */
        public C0753ad mo2882f() {
            return C0753ad.m2637a(this.f2898b.consumeDisplayCutout());
        }

        @Override // androidx.core.p037h.C0753ad.C0758e
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0761h)) {
                return false;
            }
            return Objects.equals(this.f2898b, ((C0761h) obj).f2898b);
        }

        C0761h(C0753ad adVar, WindowInsets windowInsets) {
            super(adVar, windowInsets);
        }

        C0761h(C0753ad adVar, C0761h hVar) {
            super(adVar, hVar);
        }
    }

    /* renamed from: androidx.core.h.ad$d */
    static class C0757d extends C0755b {

        /* renamed from: a */
        final WindowInsets.Builder f2896a;

        static {
            Covode.recordClassIndex(838);
        }

        C0757d() {
            this.f2896a = new WindowInsets.Builder();
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.core.p037h.C0753ad.C0755b
        /* renamed from: a */
        public final C0753ad mo2874a() {
            return C0753ad.m2637a(this.f2896a.build());
        }

        C0757d(C0753ad adVar) {
            WindowInsets.Builder builder;
            WindowInsets e = adVar.mo2870e();
            if (e != null) {
                builder = new WindowInsets.Builder(e);
            } else {
                builder = new WindowInsets.Builder();
            }
            this.f2896a = builder;
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.core.p037h.C0753ad.C0755b
        /* renamed from: a */
        public final void mo2875a(C0700b bVar) {
            this.f2896a.setSystemWindowInsets(Insets.of(bVar.f2759b, bVar.f2760c, bVar.f2761d, bVar.f2762e));
        }
    }

    /* renamed from: b */
    public final int mo2867b() {
        return this.f2888b.mo2883g().f2760c;
    }

    /* renamed from: c */
    public final int mo2868c() {
        return this.f2888b.mo2883g().f2761d;
    }

    /* renamed from: d */
    public final int mo2869d() {
        return this.f2888b.mo2883g().f2762e;
    }

    /* renamed from: e */
    public final WindowInsets mo2870e() {
        C0758e eVar = this.f2888b;
        if (eVar instanceof C0759f) {
            return ((C0759f) eVar).f2898b;
        }
        return null;
    }

    public int hashCode() {
        C0758e eVar = this.f2888b;
        if (eVar == null) {
            return 0;
        }
        return eVar.hashCode();
    }

    /* renamed from: a */
    public final int mo2865a() {
        return this.f2888b.mo2883g().f2759b;
    }

    /* renamed from: androidx.core.h.ad$a */
    public static final class C0754a {

        /* renamed from: a */
        final C0755b f2889a;

        static {
            Covode.recordClassIndex(835);
        }

        public C0754a() {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f2889a = new C0757d();
            } else if (Build.VERSION.SDK_INT >= 20) {
                this.f2889a = new C0756c();
            } else {
                this.f2889a = new C0755b();
            }
        }

        /* renamed from: a */
        public final C0754a mo2873a(C0700b bVar) {
            this.f2889a.mo2875a(bVar);
            return this;
        }

        public C0754a(C0753ad adVar) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f2889a = new C0757d(adVar);
            } else if (Build.VERSION.SDK_INT >= 20) {
                this.f2889a = new C0756c(adVar);
            } else {
                this.f2889a = new C0755b(adVar);
            }
        }
    }

    static {
        Covode.recordClassIndex(834);
    }

    /* renamed from: a */
    public static C0753ad m2637a(WindowInsets windowInsets) {
        return new C0753ad((WindowInsets) C0697g.m2452a(windowInsets));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0753ad)) {
            return false;
        }
        return C0691d.m2448a(this.f2888b, ((C0753ad) obj).f2888b);
    }

    private C0753ad(WindowInsets windowInsets) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f2888b = new C0762i(this, windowInsets);
        } else if (Build.VERSION.SDK_INT >= 28) {
            this.f2888b = new C0761h(this, windowInsets);
        } else if (Build.VERSION.SDK_INT >= 21) {
            this.f2888b = new C0760g(this, windowInsets);
        } else if (Build.VERSION.SDK_INT >= 20) {
            this.f2888b = new C0759f(this, windowInsets);
        } else {
            this.f2888b = new C0758e(this);
        }
    }

    public C0753ad(C0753ad adVar) {
        if (adVar != null) {
            C0758e eVar = adVar.f2888b;
            if (Build.VERSION.SDK_INT >= 29 && (eVar instanceof C0762i)) {
                this.f2888b = new C0762i(this, (C0762i) eVar);
            } else if (Build.VERSION.SDK_INT >= 28 && (eVar instanceof C0761h)) {
                this.f2888b = new C0761h(this, (C0761h) eVar);
            } else if (Build.VERSION.SDK_INT >= 21 && (eVar instanceof C0760g)) {
                this.f2888b = new C0760g(this, (C0760g) eVar);
            } else if (Build.VERSION.SDK_INT < 20 || !(eVar instanceof C0759f)) {
                this.f2888b = new C0758e(this);
            } else {
                this.f2888b = new C0759f(this, (C0759f) eVar);
            }
        } else {
            this.f2888b = new C0758e(this);
        }
    }

    /* renamed from: androidx.core.h.ad$i */
    static class C0762i extends C0761h {
        static {
            Covode.recordClassIndex(843);
        }

        C0762i(C0753ad adVar, WindowInsets windowInsets) {
            super(adVar, windowInsets);
        }

        C0762i(C0753ad adVar, C0762i iVar) {
            super(adVar, iVar);
        }
    }

    /* renamed from: a */
    public final C0753ad mo2866a(int i, int i2, int i3, int i4) {
        return new C0754a(this).mo2873a(C0700b.m2468a(i, i2, i3, i4)).f2889a.mo2874a();
    }
}
