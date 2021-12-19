package com.p2082ss.android.ugc.aweme.account.login.twostep;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.twostep.w */
public final class C32294w implements Serializable {
    @AbstractC27891c(mo46611a = "verify_ticket")

    /* renamed from: a */
    private final String f77024a;
    @AbstractC27891c(mo46611a = "sms_code_key")

    /* renamed from: b */
    private final String f77025b;
    @AbstractC27891c(mo46611a = "profile_key")

    /* renamed from: c */
    private final String f77026c;

    static {
        Covode.recordClassIndex(39059);
    }

    public static /* synthetic */ C32294w copy$default(C32294w wVar, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wVar.f77024a;
        }
        if ((i & 2) != 0) {
            str2 = wVar.f77025b;
        }
        if ((i & 4) != 0) {
            str3 = wVar.f77026c;
        }
        return wVar.copy(str, str2, str3);
    }

    public final String component1() {
        return this.f77024a;
    }

    public final String component2() {
        return this.f77025b;
    }

    public final String component3() {
        return this.f77026c;
    }

    public final C32294w copy(String str, String str2, String str3) {
        return new C32294w(str, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32294w)) {
            return false;
        }
        C32294w wVar = (C32294w) obj;
        return C89219l.m154714a(this.f77024a, wVar.f77024a) && C89219l.m154714a(this.f77025b, wVar.f77025b) && C89219l.m154714a(this.f77026c, wVar.f77026c);
    }

    public final int hashCode() {
        String str = this.f77024a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f77025b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f77026c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "TwpStep2067Bean(verify_ticket=" + this.f77024a + ", sms_code_key=" + this.f77025b + ", profile_key=" + this.f77026c + ")";
    }

    public final String getProfile_key() {
        return this.f77026c;
    }

    public final String getSms_code_key() {
        return this.f77025b;
    }

    public final String getVerify_ticket() {
        return this.f77024a;
    }

    public C32294w(String str, String str2, String str3) {
        this.f77024a = str;
        this.f77025b = str2;
        this.f77026c = str3;
    }
}
