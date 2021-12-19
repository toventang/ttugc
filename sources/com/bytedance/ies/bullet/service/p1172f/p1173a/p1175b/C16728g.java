package com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.service.f.a.b.g */
public final class C16728g<R> {

    /* renamed from: a */
    public final Class<R> f39953a;

    /* renamed from: b */
    public final R f39954b;

    static {
        Covode.recordClassIndex(19168);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16728g)) {
            return false;
        }
        C16728g gVar = (C16728g) obj;
        return C89219l.m154714a(this.f39953a, gVar.f39953a) && C89219l.m154714a(this.f39954b, gVar.f39954b);
    }

    public final int hashCode() {
        Class<R> cls = this.f39953a;
        int i = 0;
        int hashCode = (cls != null ? cls.hashCode() : 0) * 31;
        R r = this.f39954b;
        if (r != null) {
            i = r.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "InputInterceptorResult(type=" + this.f39953a + ", value=" + ((Object) this.f39954b) + ")";
    }

    public C16728g(Class<R> cls, R r) {
        C89219l.m154719c(cls, "");
        this.f39953a = cls;
        this.f39954b = r;
    }
}
