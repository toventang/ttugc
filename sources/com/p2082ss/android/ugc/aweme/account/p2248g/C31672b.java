package com.p2082ss.android.ugc.aweme.account.p2248g;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.g.b */
public final class C31672b {

    /* renamed from: a */
    public final String f75744a;

    /* renamed from: b */
    public final String f75745b;

    /* renamed from: c */
    public final Integer f75746c;

    /* renamed from: d */
    public final String f75747d;

    /* renamed from: e */
    public final String f75748e;

    static {
        Covode.recordClassIndex(38405);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31672b)) {
            return false;
        }
        C31672b bVar = (C31672b) obj;
        return C89219l.m154714a(this.f75744a, bVar.f75744a) && C89219l.m154714a(this.f75745b, bVar.f75745b) && C89219l.m154714a(this.f75746c, bVar.f75746c) && C89219l.m154714a(this.f75747d, bVar.f75747d) && C89219l.m154714a(this.f75748e, bVar.f75748e);
    }

    public final int hashCode() {
        String str = this.f75744a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f75745b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.f75746c;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        String str3 = this.f75747d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f75748e;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "TwoStepAuthResponse(successTicket=" + this.f75744a + ", profileKey=" + this.f75745b + ", errorCode=" + this.f75746c + ", errorMessage=" + this.f75747d + ", smsCodeKey=" + this.f75748e + ")";
    }

    public /* synthetic */ C31672b(String str, String str2, Integer num, String str3) {
        this(str, str2, num, str3, null);
    }

    public C31672b(String str, String str2, Integer num, String str3, String str4) {
        this.f75744a = str;
        this.f75745b = str2;
        this.f75746c = num;
        this.f75747d = str3;
        this.f75748e = str4;
    }
}
