package com.bytedance.jedi.arch;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.jedi.arch.an */
public final class C20376an<A, B, C, D> {

    /* renamed from: a */
    public final A f48263a;

    /* renamed from: b */
    public final B f48264b;

    /* renamed from: c */
    public final C f48265c;

    /* renamed from: d */
    public final D f48266d;

    static {
        Covode.recordClassIndex(23888);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20376an)) {
            return false;
        }
        C20376an anVar = (C20376an) obj;
        return C89219l.m154714a(this.f48263a, anVar.f48263a) && C89219l.m154714a(this.f48264b, anVar.f48264b) && C89219l.m154714a(this.f48265c, anVar.f48265c) && C89219l.m154714a(this.f48266d, anVar.f48266d);
    }

    public final int hashCode() {
        A a = this.f48263a;
        int i = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b = this.f48264b;
        int hashCode2 = (hashCode + (b != null ? b.hashCode() : 0)) * 31;
        C c = this.f48265c;
        int hashCode3 = (hashCode2 + (c != null ? c.hashCode() : 0)) * 31;
        D d = this.f48266d;
        if (d != null) {
            i = d.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "Tuple4(a=" + ((Object) this.f48263a) + ", b=" + ((Object) this.f48264b) + ", c=" + ((Object) this.f48265c) + ", d=" + ((Object) this.f48266d) + ")";
    }

    public C20376an(A a, B b, C c, D d) {
        this.f48263a = a;
        this.f48264b = b;
        this.f48265c = c;
        this.f48266d = d;
    }
}
