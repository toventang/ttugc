package com.bytedance.assem.arch.extensions;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.assem.arch.extensions.p */
public final class C12794p<A, B> {

    /* renamed from: a */
    public final A f31118a;

    /* renamed from: b */
    public final B f31119b;

    static {
        Covode.recordClassIndex(14622);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12794p)) {
            return false;
        }
        C12794p pVar = (C12794p) obj;
        return C89219l.m154714a(this.f31118a, pVar.f31118a) && C89219l.m154714a(this.f31119b, pVar.f31119b);
    }

    public final int hashCode() {
        A a = this.f31118a;
        int i = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b = this.f31119b;
        if (b != null) {
            i = b.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "Tuple2(a=" + ((Object) this.f31118a) + ", b=" + ((Object) this.f31119b) + ")";
    }

    public C12794p(A a, B b) {
        this.f31118a = a;
        this.f31119b = b;
    }
}
