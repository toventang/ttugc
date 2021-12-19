package p4600h.p4601a;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: h.a.ac */
public final class C89037ac<T> {

    /* renamed from: a */
    public final int f202766a;

    /* renamed from: b */
    public final T f202767b;

    static {
        Covode.recordClassIndex(105121);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C89037ac)) {
            return false;
        }
        C89037ac acVar = (C89037ac) obj;
        return this.f202766a == acVar.f202766a && C89219l.m154714a(this.f202767b, acVar.f202767b);
    }

    public final int hashCode() {
        int i = this.f202766a * 31;
        T t = this.f202767b;
        return i + (t != null ? t.hashCode() : 0);
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f202766a + ", value=" + ((Object) this.f202767b) + ")";
    }

    public C89037ac(int i, T t) {
        this.f202766a = i;
        this.f202767b = t;
    }
}
