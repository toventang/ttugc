package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.e */
public final class C32381e {
    @AbstractC27891c(mo46611a = "error_code")

    /* renamed from: a */
    public final Integer f77216a;
    @AbstractC27891c(mo46611a = "description")

    /* renamed from: b */
    public final String f77217b;
    @AbstractC27891c(mo46611a = "login_name")

    /* renamed from: c */
    public final String f77218c;

    static {
        Covode.recordClassIndex(39149);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32381e)) {
            return false;
        }
        C32381e eVar = (C32381e) obj;
        return C89219l.m154714a(this.f77216a, eVar.f77216a) && C89219l.m154714a(this.f77217b, eVar.f77217b) && C89219l.m154714a(this.f77218c, eVar.f77218c);
    }

    public final int hashCode() {
        Integer num = this.f77216a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.f77217b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f77218c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "CommitUserNameData(error_code=" + this.f77216a + ", description=" + this.f77217b + ", login_name=" + this.f77218c + ")";
    }
}
