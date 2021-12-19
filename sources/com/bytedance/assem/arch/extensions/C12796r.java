package com.bytedance.assem.arch.extensions;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.assem.arch.extensions.r */
public final class C12796r<A, B, C, D> {

    /* renamed from: a */
    public final A f31123a;

    /* renamed from: b */
    public final B f31124b;

    /* renamed from: c */
    public final C f31125c;

    /* renamed from: d */
    public final D f31126d;

    static {
        Covode.recordClassIndex(14624);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12796r)) {
            return false;
        }
        C12796r rVar = (C12796r) obj;
        return C89219l.m154714a(this.f31123a, rVar.f31123a) && C89219l.m154714a(this.f31124b, rVar.f31124b) && C89219l.m154714a(this.f31125c, rVar.f31125c) && C89219l.m154714a(this.f31126d, rVar.f31126d);
    }

    public final int hashCode() {
        A a = this.f31123a;
        int i = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b = this.f31124b;
        int hashCode2 = (hashCode + (b != null ? b.hashCode() : 0)) * 31;
        C c = this.f31125c;
        int hashCode3 = (hashCode2 + (c != null ? c.hashCode() : 0)) * 31;
        D d = this.f31126d;
        if (d != null) {
            i = d.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "Tuple4(a=" + ((Object) this.f31123a) + ", b=" + ((Object) this.f31124b) + ", c=" + ((Object) this.f31125c) + ", d=" + ((Object) this.f31126d) + ")";
    }

    public C12796r(A a, B b, C c, D d) {
        this.f31123a = a;
        this.f31124b = b;
        this.f31125c = c;
        this.f31126d = d;
    }
}
