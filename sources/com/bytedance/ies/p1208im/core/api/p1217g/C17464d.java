package com.bytedance.ies.p1208im.core.api.p1217g;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.im.core.api.g.d */
public final class C17464d {

    /* renamed from: a */
    public final EnumC17463c f41821a;

    /* renamed from: b */
    public final EnumC17465e f41822b;

    static {
        Covode.recordClassIndex(19951);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17464d)) {
            return false;
        }
        C17464d dVar = (C17464d) obj;
        return C89219l.m154714a(this.f41821a, dVar.f41821a) && C89219l.m154714a(this.f41822b, dVar.f41822b);
    }

    public final int hashCode() {
        EnumC17463c cVar = this.f41821a;
        int i = 0;
        int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
        EnumC17465e eVar = this.f41822b;
        if (eVar != null) {
            i = eVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "NetworkStateInfo(state=" + this.f41821a + ", type=" + this.f41822b + ")";
    }

    public C17464d(EnumC17463c cVar, EnumC17465e eVar) {
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(eVar, "");
        this.f41821a = cVar;
        this.f41822b = eVar;
    }
}
