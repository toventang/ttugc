package androidx.core.p035f;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.Locale;

/* renamed from: androidx.core.f.f */
public final class C0680f {

    /* renamed from: a */
    public static final AbstractC0679e f2735a = new C0685e(null, false);

    /* renamed from: b */
    public static final AbstractC0679e f2736b = new C0685e(null, true);

    /* renamed from: c */
    public static final AbstractC0679e f2737c = new C0685e(C0682b.f2743a, false);

    /* renamed from: d */
    public static final AbstractC0679e f2738d = new C0685e(C0682b.f2743a, true);

    /* renamed from: e */
    public static final AbstractC0679e f2739e = new C0685e(C0681a.f2741a, false);

    /* renamed from: f */
    public static final AbstractC0679e f2740f = C0686f.f2746a;

    /* renamed from: androidx.core.f.f$c */
    interface AbstractC0683c {
        static {
            Covode.recordClassIndex(762);
        }

        /* renamed from: a */
        int mo2718a(CharSequence charSequence, int i);
    }

    /* renamed from: androidx.core.f.f$b */
    static class C0682b implements AbstractC0683c {

        /* renamed from: a */
        static final C0682b f2743a = new C0682b();

        private C0682b() {
        }

        static {
            Covode.recordClassIndex(761);
        }

        @Override // androidx.core.p035f.C0680f.AbstractC0683c
        /* renamed from: a */
        public final int mo2718a(CharSequence charSequence, int i) {
            int i2 = i + 0;
            int i3 = 2;
            for (int i4 = 0; i4 < i2 && i3 == 2; i4++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i4));
                if (directionality != 0) {
                    if (!(directionality == 1 || directionality == 2)) {
                        switch (directionality) {
                            case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                            case 15:
                                break;
                            case 16:
                            case 17:
                                break;
                            default:
                                i3 = 2;
                                break;
                        }
                    }
                    i3 = 0;
                }
                i3 = 1;
            }
            return i3;
        }
    }

    /* renamed from: androidx.core.f.f$e */
    static class C0685e extends AbstractC0684d {

        /* renamed from: a */
        private final boolean f2745a;

        static {
            Covode.recordClassIndex(764);
        }

        /* access modifiers changed from: protected */
        @Override // androidx.core.p035f.C0680f.AbstractC0684d
        /* renamed from: a */
        public final boolean mo2719a() {
            return this.f2745a;
        }

        C0685e(AbstractC0683c cVar, boolean z) {
            super(cVar);
            this.f2745a = z;
        }
    }

    /* renamed from: androidx.core.f.f$a */
    static class C0681a implements AbstractC0683c {

        /* renamed from: a */
        static final C0681a f2741a = new C0681a();

        /* renamed from: b */
        private final boolean f2742b = true;

        private C0681a() {
        }

        static {
            Covode.recordClassIndex(760);
        }

        @Override // androidx.core.p035f.C0680f.AbstractC0683c
        /* renamed from: a */
        public final int mo2718a(CharSequence charSequence, int i) {
            int i2 = i + 0;
            boolean z = false;
            for (int i3 = 0; i3 < i2; i3++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i3));
                if (directionality == 0) {
                    if (!this.f2742b) {
                        return 1;
                    }
                    z = true;
                } else if (directionality == 1 || directionality == 2) {
                    if (this.f2742b) {
                        return 0;
                    }
                    z = true;
                }
            }
            if (!z) {
                return 2;
            }
            if (this.f2742b) {
                return 1;
            }
            return 0;
        }
    }

    /* renamed from: androidx.core.f.f$f */
    static class C0686f extends AbstractC0684d {

        /* renamed from: a */
        static final C0686f f2746a = new C0686f();

        C0686f() {
            super(null);
        }

        static {
            Covode.recordClassIndex(765);
        }

        /* access modifiers changed from: protected */
        @Override // androidx.core.p035f.C0680f.AbstractC0684d
        /* renamed from: a */
        public final boolean mo2719a() {
            if (C0687g.m2442a(Locale.getDefault()) == 1) {
                return true;
            }
            return false;
        }
    }

    static {
        Covode.recordClassIndex(759);
    }

    /* renamed from: androidx.core.f.f$d */
    static abstract class AbstractC0684d implements AbstractC0679e {

        /* renamed from: a */
        private final AbstractC0683c f2744a;

        static {
            Covode.recordClassIndex(763);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract boolean mo2719a();

        AbstractC0684d(AbstractC0683c cVar) {
            this.f2744a = cVar;
        }

        @Override // androidx.core.p035f.AbstractC0679e
        /* renamed from: a */
        public final boolean mo2717a(CharSequence charSequence, int i) {
            if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
                throw new IllegalArgumentException();
            }
            AbstractC0683c cVar = this.f2744a;
            if (cVar == null) {
                return mo2719a();
            }
            int a = cVar.mo2718a(charSequence, i);
            if (a == 0) {
                return true;
            }
            if (a != 1) {
                return mo2719a();
            }
            return false;
        }
    }
}
