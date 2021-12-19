package com.bytedance.jedi.arch;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.jedi.arch.al */
public final class C20374al<A, B> {

    /* renamed from: a */
    public final A f48258a;

    /* renamed from: b */
    public final B f48259b;

    static {
        Covode.recordClassIndex(23886);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20374al)) {
            return false;
        }
        C20374al alVar = (C20374al) obj;
        return C89219l.m154714a(this.f48258a, alVar.f48258a) && C89219l.m154714a(this.f48259b, alVar.f48259b);
    }

    public final int hashCode() {
        A a = this.f48258a;
        int i = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b = this.f48259b;
        if (b != null) {
            i = b.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "Tuple2(a=" + ((Object) this.f48258a) + ", b=" + ((Object) this.f48259b) + ")";
    }

    public C20374al(A a, B b) {
        this.f48258a = a;
        this.f48259b = b;
    }
}
