package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.h */
public final class C43854h {
    @AbstractC27891c(mo46611a = "reason_key")

    /* renamed from: a */
    public final String f102195a;
    @AbstractC27891c(mo46611a = "content")

    /* renamed from: b */
    public final String f102196b;

    static {
        Covode.recordClassIndex(52134);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43854h)) {
            return false;
        }
        C43854h hVar = (C43854h) obj;
        return C89219l.m154714a(this.f102195a, hVar.f102195a) && C89219l.m154714a(this.f102196b, hVar.f102196b);
    }

    public final int hashCode() {
        String str = this.f102195a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f102196b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "InputReason(reasonKey=" + this.f102195a + ", content=" + this.f102196b + ")";
    }

    public C43854h(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f102195a = str;
        this.f102196b = str2;
    }
}
