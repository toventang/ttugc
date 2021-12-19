package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.c */
public final class C32379c {
    @AbstractC27891c(mo46611a = "message")

    /* renamed from: a */
    public final String f77212a = null;
    @AbstractC27891c(mo46611a = "data")

    /* renamed from: b */
    public final C32378b f77213b = null;

    static {
        Covode.recordClassIndex(39147);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32379c)) {
            return false;
        }
        C32379c cVar = (C32379c) obj;
        return C89219l.m154714a(this.f77212a, cVar.f77212a) && C89219l.m154714a(this.f77213b, cVar.f77213b);
    }

    public final int hashCode() {
        String str = this.f77212a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C32378b bVar = this.f77213b;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "Check2SvPushClickResponseWrap(message=" + this.f77212a + ", data=" + this.f77213b + ")";
    }

    private C32379c() {
    }
}
