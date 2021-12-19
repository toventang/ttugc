package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.c */
public final class C44073c {
    @AbstractC27891c(mo46611a = "button_text")

    /* renamed from: a */
    public final String f102734a;
    @AbstractC27891c(mo46611a = "note")

    /* renamed from: b */
    public final String f102735b;
    @AbstractC27891c(mo46611a = "title")

    /* renamed from: c */
    public final String f102736c;

    static {
        Covode.recordClassIndex(52384);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44073c)) {
            return false;
        }
        C44073c cVar = (C44073c) obj;
        return C89219l.m154714a(this.f102734a, cVar.f102734a) && C89219l.m154714a(this.f102735b, cVar.f102735b) && C89219l.m154714a(this.f102736c, cVar.f102736c);
    }

    public final int hashCode() {
        String str = this.f102734a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f102735b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f102736c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "BindInfo(buttonText=" + this.f102734a + ", note=" + this.f102735b + ", title=" + this.f102736c + ")";
    }
}
