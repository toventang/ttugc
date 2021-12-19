package com.bytedance.ies.foundation.base.p1207a;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.foundation.base.a.a */
public final class C17363a<A> {

    /* renamed from: a */
    public final A f41680a;

    static {
        Covode.recordClassIndex(19849);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C17363a) && C89219l.m154714a(this.f41680a, ((C17363a) obj).f41680a);
        }
        return true;
    }

    public final int hashCode() {
        A a = this.f41680a;
        if (a != null) {
            return a.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "Tuple1(a=" + ((Object) this.f41680a) + ")";
    }

    public C17363a(A a) {
        this.f41680a = a;
    }
}
