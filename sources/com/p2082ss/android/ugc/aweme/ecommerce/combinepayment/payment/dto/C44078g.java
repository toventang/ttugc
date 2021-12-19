package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.g */
public final class C44078g {
    @AbstractC27891c(mo46611a = "key")

    /* renamed from: a */
    public final String f102760a;
    @AbstractC27891c(mo46611a = "val")

    /* renamed from: b */
    public final String f102761b;
    @AbstractC27891c(mo46611a = StringSet.name)

    /* renamed from: c */
    public final String f102762c;
    @AbstractC27891c(mo46611a = "notification_url")

    /* renamed from: d */
    public final String f102763d;
    @AbstractC27891c(mo46611a = "icon_url")

    /* renamed from: e */
    public final String f102764e;

    static {
        Covode.recordClassIndex(52389);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44078g)) {
            return false;
        }
        C44078g gVar = (C44078g) obj;
        return C89219l.m154714a(this.f102760a, gVar.f102760a) && C89219l.m154714a(this.f102761b, gVar.f102761b) && C89219l.m154714a(this.f102762c, gVar.f102762c) && C89219l.m154714a(this.f102763d, gVar.f102763d) && C89219l.m154714a(this.f102764e, gVar.f102764e);
    }

    public final int hashCode() {
        String str = this.f102760a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f102761b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f102762c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f102763d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f102764e;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "Option(key=" + this.f102760a + ", value=" + this.f102761b + ", name=" + this.f102762c + ", notificationUrl=" + this.f102763d + ", iconUrl=" + this.f102764e + ")";
    }
}
