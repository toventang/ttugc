package com.p2082ss.android.ugc.aweme.account.login.twostep;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.twostep.v */
public final class C32293v implements Serializable {
    @AbstractC27891c(mo46611a = "verify_ticket")

    /* renamed from: a */
    private final String f77020a;
    @AbstractC27891c(mo46611a = "default_verify_way")

    /* renamed from: b */
    private final String f77021b;
    @AbstractC27891c(mo46611a = "verify_ways")

    /* renamed from: c */
    private final ArrayList<C32291t> f77022c;
    @AbstractC27891c(mo46611a = "not_login_ticket")

    /* renamed from: d */
    private final String f77023d;

    static {
        Covode.recordClassIndex(39058);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.account.login.twostep.v */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C32293v copy$default(C32293v vVar, String str, String str2, ArrayList arrayList, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = vVar.f77020a;
        }
        if ((i & 2) != 0) {
            str2 = vVar.f77021b;
        }
        if ((i & 4) != 0) {
            arrayList = vVar.f77022c;
        }
        if ((i & 8) != 0) {
            str3 = vVar.f77023d;
        }
        return vVar.copy(str, str2, arrayList, str3);
    }

    public final String component1() {
        return this.f77020a;
    }

    public final String component2() {
        return this.f77021b;
    }

    public final ArrayList<C32291t> component3() {
        return this.f77022c;
    }

    public final String component4() {
        return this.f77023d;
    }

    public final C32293v copy(String str, String str2, ArrayList<C32291t> arrayList, String str3) {
        return new C32293v(str, str2, arrayList, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32293v)) {
            return false;
        }
        C32293v vVar = (C32293v) obj;
        return C89219l.m154714a(this.f77020a, vVar.f77020a) && C89219l.m154714a(this.f77021b, vVar.f77021b) && C89219l.m154714a(this.f77022c, vVar.f77022c) && C89219l.m154714a(this.f77023d, vVar.f77023d);
    }

    public final int hashCode() {
        String str = this.f77020a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f77021b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        ArrayList<C32291t> arrayList = this.f77022c;
        int hashCode3 = (hashCode2 + (arrayList != null ? arrayList.hashCode() : 0)) * 31;
        String str3 = this.f77023d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "TwpStep2046Bean(verify_ticket=" + this.f77020a + ", default_verify_way=" + this.f77021b + ", verify_ways=" + this.f77022c + ", not_login_ticket=" + this.f77023d + ")";
    }

    public final String getDefault_verify_way() {
        return this.f77021b;
    }

    public final String getNot_login_ticket() {
        return this.f77023d;
    }

    public final String getVerify_ticket() {
        return this.f77020a;
    }

    public final ArrayList<C32291t> getVerify_ways() {
        return this.f77022c;
    }

    public C32293v(String str, String str2, ArrayList<C32291t> arrayList, String str3) {
        this.f77020a = str;
        this.f77021b = str2;
        this.f77022c = arrayList;
        this.f77023d = str3;
    }
}
