package com.p2082ss.android.ugc.aweme.filter.repository.p2986a;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.a.e */
public final class C50697e {

    /* renamed from: a */
    public final C50696d f117045a;

    /* renamed from: b */
    public final C50696d f117046b;

    static {
        Covode.recordClassIndex(59859);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50697e)) {
            return false;
        }
        C50697e eVar = (C50697e) obj;
        return C89219l.m154714a(this.f117045a, eVar.f117045a) && C89219l.m154714a(this.f117046b, eVar.f117046b);
    }

    public final int hashCode() {
        C50696d dVar = this.f117045a;
        int i = 0;
        int hashCode = (dVar != null ? dVar.hashCode() : 0) * 31;
        C50696d dVar2 = this.f117046b;
        if (dVar2 != null) {
            i = dVar2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "FilterInfoEvent(from=" + this.f117045a + ", to=" + this.f117046b + ")";
    }

    public C50697e(C50696d dVar, C50696d dVar2) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(dVar2, "");
        this.f117045a = dVar;
        this.f117046b = dVar2;
    }
}
