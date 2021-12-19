package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.f */
public final class C32382f {
    @AbstractC27891c(mo46611a = "message")

    /* renamed from: a */
    public final String f77219a;
    @AbstractC27891c(mo46611a = "data")

    /* renamed from: b */
    public final C32381e f77220b;

    static {
        Covode.recordClassIndex(39150);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32382f)) {
            return false;
        }
        C32382f fVar = (C32382f) obj;
        return C89219l.m154714a(this.f77219a, fVar.f77219a) && C89219l.m154714a(this.f77220b, fVar.f77220b);
    }

    public final int hashCode() {
        String str = this.f77219a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C32381e eVar = this.f77220b;
        if (eVar != null) {
            i = eVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "CommitUserNameResponse(message=" + this.f77219a + ", data=" + this.f77220b + ")";
    }
}
