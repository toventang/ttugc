package com.bytedance.assem.arch.extensions;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.assem.arch.extensions.q */
public final class C12795q<A, B, C> {

    /* renamed from: a */
    public final A f31120a;

    /* renamed from: b */
    public final B f31121b;

    /* renamed from: c */
    public final C f31122c;

    static {
        Covode.recordClassIndex(14623);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12795q)) {
            return false;
        }
        C12795q qVar = (C12795q) obj;
        return C89219l.m154714a(this.f31120a, qVar.f31120a) && C89219l.m154714a(this.f31121b, qVar.f31121b) && C89219l.m154714a(this.f31122c, qVar.f31122c);
    }

    public final int hashCode() {
        A a = this.f31120a;
        int i = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b = this.f31121b;
        int hashCode2 = (hashCode + (b != null ? b.hashCode() : 0)) * 31;
        C c = this.f31122c;
        if (c != null) {
            i = c.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "Tuple3(a=" + ((Object) this.f31120a) + ", b=" + ((Object) this.f31121b) + ", c=" + ((Object) this.f31122c) + ")";
    }

    public C12795q(A a, B b, C c) {
        this.f31120a = a;
        this.f31121b = b;
        this.f31122c = c;
    }
}
