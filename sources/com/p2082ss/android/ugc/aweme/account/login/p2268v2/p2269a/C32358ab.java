package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.ab */
public final class C32358ab {
    @AbstractC27891c(mo46611a = "captcha")

    /* renamed from: a */
    public final String f77172a;
    @AbstractC27891c(mo46611a = "desc_url")

    /* renamed from: b */
    public final String f77173b;
    @AbstractC27891c(mo46611a = "description")

    /* renamed from: c */
    public final String f77174c;
    @AbstractC27891c(mo46611a = "error_code")

    /* renamed from: d */
    public final Integer f77175d;
    @AbstractC27891c(mo46611a = "result")

    /* renamed from: e */
    public final String f77176e;
    @AbstractC27891c(mo46611a = "wait_ticket")

    /* renamed from: f */
    public final String f77177f;
    @AbstractC27891c(mo46611a = "challenge_ticket")

    /* renamed from: g */
    public final String f77178g;
    @AbstractC27891c(mo46611a = "pending")

    /* renamed from: h */
    public final Boolean f77179h;
    @AbstractC27891c(mo46611a = "reason")

    /* renamed from: i */
    public final String f77180i;
    @AbstractC27891c(mo46611a = "active_device_names")

    /* renamed from: j */
    public final List<String> f77181j;

    static {
        Covode.recordClassIndex(39126);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32358ab)) {
            return false;
        }
        C32358ab abVar = (C32358ab) obj;
        return C89219l.m154714a(this.f77172a, abVar.f77172a) && C89219l.m154714a(this.f77173b, abVar.f77173b) && C89219l.m154714a(this.f77174c, abVar.f77174c) && C89219l.m154714a(this.f77175d, abVar.f77175d) && C89219l.m154714a(this.f77176e, abVar.f77176e) && C89219l.m154714a(this.f77177f, abVar.f77177f) && C89219l.m154714a(this.f77178g, abVar.f77178g) && C89219l.m154714a(this.f77179h, abVar.f77179h) && C89219l.m154714a(this.f77180i, abVar.f77180i) && C89219l.m154714a(this.f77181j, abVar.f77181j);
    }

    public final int hashCode() {
        String str = this.f77172a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f77173b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f77174c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num = this.f77175d;
        int hashCode4 = (hashCode3 + (num != null ? num.hashCode() : 0)) * 31;
        String str4 = this.f77176e;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f77177f;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f77178g;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Boolean bool = this.f77179h;
        int hashCode8 = (hashCode7 + (bool != null ? bool.hashCode() : 0)) * 31;
        String str7 = this.f77180i;
        int hashCode9 = (hashCode8 + (str7 != null ? str7.hashCode() : 0)) * 31;
        List<String> list = this.f77181j;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode9 + i;
    }

    public final String toString() {
        return "Request2svPushChallengeResponse(captcha=" + this.f77172a + ", desc_url=" + this.f77173b + ", description=" + this.f77174c + ", error_code=" + this.f77175d + ", result=" + this.f77176e + ", wait_ticket=" + this.f77177f + ", challenge_ticket=" + this.f77178g + ", pending=" + this.f77179h + ", reason=" + this.f77180i + ", active_device_names=" + this.f77181j + ")";
    }
}
