package androidx.core.p036g;

import com.bytedance.covode.number.Covode;

/* renamed from: androidx.core.g.e */
public class C0692e<F, S> {

    /* renamed from: a */
    public final F f2750a;

    /* renamed from: b */
    public final S f2751b;

    static {
        Covode.recordClassIndex(771);
    }

    public int hashCode() {
        int hashCode;
        F f = this.f2750a;
        int i = 0;
        if (f == null) {
            hashCode = 0;
        } else {
            hashCode = f.hashCode();
        }
        S s = this.f2751b;
        if (s != null) {
            i = s.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "Pair{" + String.valueOf(this.f2750a) + " " + String.valueOf(this.f2751b) + "}";
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0692e)) {
            return false;
        }
        C0692e eVar = (C0692e) obj;
        if (!C0691d.m2448a(eVar.f2750a, this.f2750a) || !C0691d.m2448a(eVar.f2751b, this.f2751b)) {
            return false;
        }
        return true;
    }

    public C0692e(F f, S s) {
        this.f2750a = f;
        this.f2751b = s;
    }

    /* renamed from: a */
    public static <A, B> C0692e<A, B> m2449a(A a, B b) {
        return new C0692e<>(a, b);
    }
}
