package com.p2082ss.android.ugc.aweme.account.login.twostep;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.twostep.t */
public final class C32291t implements Serializable {
    @AbstractC27891c(mo46611a = "verify_way")

    /* renamed from: a */
    private final String f77004a;
    @AbstractC27891c(mo46611a = "mobile")

    /* renamed from: b */
    private final String f77005b;
    @AbstractC27891c(mo46611a = "email")

    /* renamed from: c */
    private final String f77006c;
    @AbstractC27891c(mo46611a = "password")

    /* renamed from: d */
    private final String f77007d;

    static {
        Covode.recordClassIndex(39056);
    }

    public static /* synthetic */ C32291t copy$default(C32291t tVar, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tVar.f77004a;
        }
        if ((i & 2) != 0) {
            str2 = tVar.f77005b;
        }
        if ((i & 4) != 0) {
            str3 = tVar.f77006c;
        }
        if ((i & 8) != 0) {
            str4 = tVar.f77007d;
        }
        return tVar.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.f77004a;
    }

    public final String component2() {
        return this.f77005b;
    }

    public final String component3() {
        return this.f77006c;
    }

    public final String component4() {
        return this.f77007d;
    }

    public final C32291t copy(String str, String str2, String str3, String str4) {
        return new C32291t(str, str2, str3, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32291t)) {
            return false;
        }
        C32291t tVar = (C32291t) obj;
        return C89219l.m154714a(this.f77004a, tVar.f77004a) && C89219l.m154714a(this.f77005b, tVar.f77005b) && C89219l.m154714a(this.f77006c, tVar.f77006c) && C89219l.m154714a(this.f77007d, tVar.f77007d);
    }

    public final int hashCode() {
        String str = this.f77004a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f77005b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f77006c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f77007d;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "TwoStepVerifyWays(verify_way=" + this.f77004a + ", mobile=" + this.f77005b + ", email=" + this.f77006c + ", password=" + this.f77007d + ")";
    }

    public final String getEmail() {
        return this.f77006c;
    }

    public final String getMobile() {
        return this.f77005b;
    }

    public final String getPassword() {
        return this.f77007d;
    }

    public final String getVerify_way() {
        return this.f77004a;
    }

    public C32291t(String str, String str2, String str3, String str4) {
        this.f77004a = str;
        this.f77005b = str2;
        this.f77006c = str3;
        this.f77007d = str4;
    }
}
