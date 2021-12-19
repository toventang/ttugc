package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.p */
public final class C43862p {
    @AbstractC27891c(mo46611a = "reason_key")

    /* renamed from: a */
    public final String f102235a;

    static {
        Covode.recordClassIndex(52142);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C43862p) && C89219l.m154714a(this.f102235a, ((C43862p) obj).f102235a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f102235a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "SelectReason(reasonKey=" + this.f102235a + ")";
    }

    public C43862p(String str) {
        C89219l.m154721d(str, "");
        this.f102235a = str;
    }
}
