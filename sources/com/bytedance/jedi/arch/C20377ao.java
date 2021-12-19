package com.bytedance.jedi.arch;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.jedi.arch.ao */
public final class C20377ao<A, B, C, D, E> {

    /* renamed from: a */
    public final A f48267a;

    /* renamed from: b */
    public final B f48268b;

    /* renamed from: c */
    public final C f48269c;

    /* renamed from: d */
    public final D f48270d;

    /* renamed from: e */
    public final E f48271e;

    static {
        Covode.recordClassIndex(23889);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20377ao)) {
            return false;
        }
        C20377ao aoVar = (C20377ao) obj;
        return C89219l.m154714a(this.f48267a, aoVar.f48267a) && C89219l.m154714a(this.f48268b, aoVar.f48268b) && C89219l.m154714a(this.f48269c, aoVar.f48269c) && C89219l.m154714a(this.f48270d, aoVar.f48270d) && C89219l.m154714a(this.f48271e, aoVar.f48271e);
    }

    public final int hashCode() {
        A a = this.f48267a;
        int i = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b = this.f48268b;
        int hashCode2 = (hashCode + (b != null ? b.hashCode() : 0)) * 31;
        C c = this.f48269c;
        int hashCode3 = (hashCode2 + (c != null ? c.hashCode() : 0)) * 31;
        D d = this.f48270d;
        int hashCode4 = (hashCode3 + (d != null ? d.hashCode() : 0)) * 31;
        E e = this.f48271e;
        if (e != null) {
            i = e.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "Tuple5(a=" + ((Object) this.f48267a) + ", b=" + ((Object) this.f48268b) + ", c=" + ((Object) this.f48269c) + ", d=" + ((Object) this.f48270d) + ", e=" + ((Object) this.f48271e) + ")";
    }

    public C20377ao(A a, B b, C c, D d, E e) {
        this.f48267a = a;
        this.f48268b = b;
        this.f48269c = c;
        this.f48270d = d;
        this.f48271e = e;
    }
}
