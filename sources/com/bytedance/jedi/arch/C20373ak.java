package com.bytedance.jedi.arch;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.jedi.arch.ak */
public final class C20373ak<A> {

    /* renamed from: a */
    public final A f48257a;

    static {
        Covode.recordClassIndex(23885);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C20373ak) && C89219l.m154714a(this.f48257a, ((C20373ak) obj).f48257a);
        }
        return true;
    }

    public final int hashCode() {
        A a = this.f48257a;
        if (a != null) {
            return a.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "Tuple1(a=" + ((Object) this.f48257a) + ")";
    }

    public C20373ak(A a) {
        this.f48257a = a;
    }
}
