package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1645h.p1646a.AbstractC22414i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.n */
public final class C32392n extends AbstractC22414i {

    /* renamed from: a */
    public final String f77229a;

    /* renamed from: b */
    public final String f77230b;

    /* renamed from: c */
    public final String f77231c;

    static {
        Covode.recordClassIndex(39160);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32392n)) {
            return false;
        }
        C32392n nVar = (C32392n) obj;
        return C89219l.m154714a(this.f77229a, nVar.f77229a) && C89219l.m154714a(this.f77230b, nVar.f77230b) && C89219l.m154714a(this.f77231c, nVar.f77231c);
    }

    public final int hashCode() {
        String str = this.f77229a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f77230b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f77231c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "EmailChangeQueryObj(code=" + this.f77229a + ", email=" + this.f77230b + ", ticket=" + this.f77231c + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32392n(String str, String str2, String str3) {
        super(22);
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        this.f77229a = str;
        this.f77230b = str2;
        this.f77231c = str3;
    }
}
