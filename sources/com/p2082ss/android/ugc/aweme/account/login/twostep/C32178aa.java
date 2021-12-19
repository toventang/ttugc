package com.p2082ss.android.ugc.aweme.account.login.twostep;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.twostep.aa */
public final class C32178aa implements Serializable {
    @AbstractC27891c(mo46611a = "verify_way")

    /* renamed from: a */
    private final String f76805a;
    @AbstractC27891c(mo46611a = "is_available")

    /* renamed from: b */
    private final Boolean f76806b;

    static {
        Covode.recordClassIndex(38943);
    }

    public static /* synthetic */ C32178aa copy$default(C32178aa aaVar, String str, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aaVar.f76805a;
        }
        if ((i & 2) != 0) {
            bool = aaVar.f76806b;
        }
        return aaVar.copy(str, bool);
    }

    public final String component1() {
        return this.f76805a;
    }

    public final Boolean component2() {
        return this.f76806b;
    }

    public final C32178aa copy(String str, Boolean bool) {
        return new C32178aa(str, bool);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32178aa)) {
            return false;
        }
        C32178aa aaVar = (C32178aa) obj;
        return C89219l.m154714a(this.f76805a, aaVar.f76805a) && C89219l.m154714a(this.f76806b, aaVar.f76806b);
    }

    public final int hashCode() {
        String str = this.f76805a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Boolean bool = this.f76806b;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "VerifyWay(verify_way=" + this.f76805a + ", is_available=" + this.f76806b + ")";
    }

    public final String getVerify_way() {
        return this.f76805a;
    }

    public final Boolean is_available() {
        return this.f76806b;
    }

    public C32178aa(String str, Boolean bool) {
        this.f76805a = str;
        this.f76806b = bool;
    }
}
