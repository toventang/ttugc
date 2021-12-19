package com.bytedance.ies.foundation.base.p1207a;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.foundation.base.a.b */
public final class C17364b<A, B> {

    /* renamed from: a */
    public final A f41681a;

    /* renamed from: b */
    public final B f41682b;

    static {
        Covode.recordClassIndex(19850);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17364b)) {
            return false;
        }
        C17364b bVar = (C17364b) obj;
        return C89219l.m154714a(this.f41681a, bVar.f41681a) && C89219l.m154714a(this.f41682b, bVar.f41682b);
    }

    public final int hashCode() {
        A a = this.f41681a;
        int i = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b = this.f41682b;
        if (b != null) {
            i = b.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "Tuple2(a=" + ((Object) this.f41681a) + ", b=" + ((Object) this.f41682b) + ")";
    }

    public C17364b(A a, B b) {
        this.f41681a = a;
        this.f41682b = b;
    }
}
