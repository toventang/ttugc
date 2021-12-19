package com.p2082ss.android.ugc.aweme.crossplatform.p2709c;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.c.e */
public final class C40610e {

    /* renamed from: a */
    public final String f95039a;

    /* renamed from: b */
    public final String f95040b;

    /* renamed from: c */
    public final String f95041c;

    static {
        Covode.recordClassIndex(48450);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40610e)) {
            return false;
        }
        C40610e eVar = (C40610e) obj;
        return C89219l.m154714a(this.f95039a, eVar.f95039a) && C89219l.m154714a(this.f95040b, eVar.f95040b) && C89219l.m154714a(this.f95041c, eVar.f95041c);
    }

    public final int hashCode() {
        String str = this.f95039a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f95040b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f95041c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "SessionInfo(projectName=" + this.f95039a + ", enterFrom=" + this.f95040b + ", type=" + this.f95041c + ")";
    }

    public C40610e(String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        this.f95039a = str;
        this.f95040b = str2;
        this.f95041c = str3;
    }
}
