package com.bytedance.jedi.arch;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.jedi.arch.am */
public final class C20375am<A, B, C> {

    /* renamed from: a */
    public final A f48260a;

    /* renamed from: b */
    public final B f48261b;

    /* renamed from: c */
    public final C f48262c;

    static {
        Covode.recordClassIndex(23887);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20375am)) {
            return false;
        }
        C20375am amVar = (C20375am) obj;
        return C89219l.m154714a(this.f48260a, amVar.f48260a) && C89219l.m154714a(this.f48261b, amVar.f48261b) && C89219l.m154714a(this.f48262c, amVar.f48262c);
    }

    public final int hashCode() {
        A a = this.f48260a;
        int i = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b = this.f48261b;
        int hashCode2 = (hashCode + (b != null ? b.hashCode() : 0)) * 31;
        C c = this.f48262c;
        if (c != null) {
            i = c.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "Tuple3(a=" + ((Object) this.f48260a) + ", b=" + ((Object) this.f48261b) + ", c=" + ((Object) this.f48262c) + ")";
    }

    public C20375am(A a, B b, C c) {
        this.f48260a = a;
        this.f48261b = b;
        this.f48262c = c;
    }
}
