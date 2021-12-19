package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.h */
public final class C44079h {
    @AbstractC27891c(mo46611a = "error_code")

    /* renamed from: a */
    public final String f102765a;
    @AbstractC27891c(mo46611a = "error_msg")

    /* renamed from: b */
    public final String f102766b;
    @AbstractC27891c(mo46611a = "error_text")

    /* renamed from: c */
    public final String f102767c = null;

    static {
        Covode.recordClassIndex(52390);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44079h)) {
            return false;
        }
        C44079h hVar = (C44079h) obj;
        return C89219l.m154714a(this.f102765a, hVar.f102765a) && C89219l.m154714a(this.f102766b, hVar.f102766b) && C89219l.m154714a(this.f102767c, hVar.f102767c);
    }

    public final int hashCode() {
        String str = this.f102765a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f102766b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f102767c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "PayErrorToast(errorCode=" + this.f102765a + ", errorMsg=" + this.f102766b + ", errorText=" + this.f102767c + ")";
    }

    public C44079h(String str, String str2) {
        C89219l.m154721d(str2, "");
        this.f102765a = str;
        this.f102766b = str2;
    }
}
