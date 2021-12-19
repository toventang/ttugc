package com.p2082ss.android.ugc.aweme.compliance.protection.common.p2673a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.protection.common.a.b */
public final class C40067b {
    @AbstractC27891c(mo46611a = "user_identity")

    /* renamed from: a */
    public final Integer f94114a;
    @AbstractC27891c(mo46611a = "restriction")

    /* renamed from: b */
    public final C40068c f94115b;

    static {
        Covode.recordClassIndex(47838);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40067b)) {
            return false;
        }
        C40067b bVar = (C40067b) obj;
        return C89219l.m154714a(this.f94114a, bVar.f94114a) && C89219l.m154714a(this.f94115b, bVar.f94115b);
    }

    public final int hashCode() {
        Integer num = this.f94114a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        C40068c cVar = this.f94115b;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "FamilyPairingBean(userIdentity=" + this.f94114a + ", restriction=" + this.f94115b + ")";
    }

    public /* synthetic */ C40067b() {
        this(1, new C40068c());
    }

    public C40067b(Integer num, C40068c cVar) {
        this.f94114a = num;
        this.f94115b = cVar;
    }
}
