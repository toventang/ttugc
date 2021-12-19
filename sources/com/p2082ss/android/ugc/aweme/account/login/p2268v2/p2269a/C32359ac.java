package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.ac */
public final class C32359ac {
    @AbstractC27891c(mo46611a = "message")

    /* renamed from: a */
    public final String f77182a = null;
    @AbstractC27891c(mo46611a = "data")

    /* renamed from: b */
    public final C32358ab f77183b = null;

    static {
        Covode.recordClassIndex(39127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32359ac)) {
            return false;
        }
        C32359ac acVar = (C32359ac) obj;
        return C89219l.m154714a(this.f77182a, acVar.f77182a) && C89219l.m154714a(this.f77183b, acVar.f77183b);
    }

    public final int hashCode() {
        String str = this.f77182a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C32358ab abVar = this.f77183b;
        if (abVar != null) {
            i = abVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "Request2svPushChallengeResponseWarp(message=" + this.f77182a + ", data=" + this.f77183b + ")";
    }

    private C32359ac() {
    }
}
