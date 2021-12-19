package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.a */
public final class C44071a {
    @AbstractC27891c(mo46611a = "is_available")

    /* renamed from: a */
    public final Boolean f102725a;
    @AbstractC27891c(mo46611a = "unavailable_code")

    /* renamed from: b */
    public final String f102726b;
    @AbstractC27891c(mo46611a = "unavailable_reason")

    /* renamed from: c */
    public final String f102727c;

    static {
        Covode.recordClassIndex(52382);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44071a)) {
            return false;
        }
        C44071a aVar = (C44071a) obj;
        return C89219l.m154714a(this.f102725a, aVar.f102725a) && C89219l.m154714a(this.f102726b, aVar.f102726b) && C89219l.m154714a(this.f102727c, aVar.f102727c);
    }

    public final int hashCode() {
        Boolean bool = this.f102725a;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        String str = this.f102726b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f102727c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "Availability(isAvailable=" + this.f102725a + ", unavailableCode=" + this.f102726b + ", unavailableReason=" + this.f102727c + ")";
    }
}
