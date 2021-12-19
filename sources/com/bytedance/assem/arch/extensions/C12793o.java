package com.bytedance.assem.arch.extensions;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.assem.arch.extensions.o */
public final class C12793o<A> {

    /* renamed from: a */
    public final A f31117a;

    static {
        Covode.recordClassIndex(14621);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C12793o) && C89219l.m154714a(this.f31117a, ((C12793o) obj).f31117a);
        }
        return true;
    }

    public final int hashCode() {
        A a = this.f31117a;
        if (a != null) {
            return a.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "Tuple1(a=" + ((Object) this.f31117a) + ")";
    }

    public C12793o(A a) {
        this.f31117a = a;
    }
}
