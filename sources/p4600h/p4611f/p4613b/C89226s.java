package p4600h.p4611f.p4613b;

import com.bytedance.covode.number.Covode;

/* renamed from: h.f.b.s */
public final class C89226s implements AbstractC89210d {

    /* renamed from: a */
    private final Class<?> f202898a;

    /* renamed from: b */
    private final String f202899b;

    static {
        Covode.recordClassIndex(105310);
    }

    @Override // p4600h.p4611f.p4613b.AbstractC89210d
    /* renamed from: a */
    public final Class<?> mo143612a() {
        return this.f202898a;
    }

    public final int hashCode() {
        return this.f202898a.hashCode();
    }

    public final String toString() {
        return this.f202898a.toString() + " (Kotlin reflection is not available)";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C89226s) || !C89219l.m154714a(this.f202898a, ((C89226s) obj).f202898a)) {
            return false;
        }
        return true;
    }

    public C89226s(Class<?> cls, String str) {
        C89219l.m154721d(cls, "");
        C89219l.m154721d(str, "");
        this.f202898a = cls;
        this.f202899b = str;
    }
}
