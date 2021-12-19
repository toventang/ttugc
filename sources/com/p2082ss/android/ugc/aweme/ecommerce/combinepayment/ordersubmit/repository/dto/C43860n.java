package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.n */
public final class C43860n {
    @AbstractC27891c(mo46611a = "title")

    /* renamed from: a */
    public final String f102227a;
    @AbstractC27891c(mo46611a = "submit_text")

    /* renamed from: b */
    public final String f102228b;
    @AbstractC27891c(mo46611a = "reasons")

    /* renamed from: c */
    public final List<C43861o> f102229c;

    static {
        Covode.recordClassIndex(52140);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43860n)) {
            return false;
        }
        C43860n nVar = (C43860n) obj;
        return C89219l.m154714a(this.f102227a, nVar.f102227a) && C89219l.m154714a(this.f102228b, nVar.f102228b) && C89219l.m154714a(this.f102229c, nVar.f102229c);
    }

    public final int hashCode() {
        String str = this.f102227a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f102228b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<C43861o> list = this.f102229c;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "QuitReasonData(title=" + this.f102227a + ", submitText=" + this.f102228b + ", reasons=" + this.f102229c + ")";
    }
}
