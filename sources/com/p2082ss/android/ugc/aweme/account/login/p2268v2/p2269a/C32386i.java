package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1645h.p1646a.AbstractC22414i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.i */
public final class C32386i extends AbstractC22414i {

    /* renamed from: a */
    public final String f77223a;

    /* renamed from: b */
    public final String f77224b;

    static {
        Covode.recordClassIndex(39154);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32386i)) {
            return false;
        }
        C32386i iVar = (C32386i) obj;
        return C89219l.m154714a(this.f77223a, iVar.f77223a) && C89219l.m154714a(this.f77224b, iVar.f77224b);
    }

    public final int hashCode() {
        String str = this.f77223a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f77224b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "EmailBindQueryObj(email=" + this.f77223a + ", code=" + this.f77224b + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32386i(String str, String str2) {
        super(8);
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f77223a = str;
        this.f77224b = str2;
    }
}
