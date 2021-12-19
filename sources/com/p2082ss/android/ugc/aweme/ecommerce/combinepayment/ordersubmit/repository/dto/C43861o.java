package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.o */
public final class C43861o {
    @AbstractC27891c(mo46611a = "reason_type")

    /* renamed from: a */
    public final Integer f102230a;
    @AbstractC27891c(mo46611a = "reason_key")

    /* renamed from: b */
    public final String f102231b;
    @AbstractC27891c(mo46611a = "title")

    /* renamed from: c */
    public final String f102232c;
    @AbstractC27891c(mo46611a = "description")

    /* renamed from: d */
    public final String f102233d;
    @AbstractC27891c(mo46611a = "description_limit")

    /* renamed from: e */
    public final Integer f102234e;

    static {
        Covode.recordClassIndex(52141);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43861o)) {
            return false;
        }
        C43861o oVar = (C43861o) obj;
        return C89219l.m154714a(this.f102230a, oVar.f102230a) && C89219l.m154714a(this.f102231b, oVar.f102231b) && C89219l.m154714a(this.f102232c, oVar.f102232c) && C89219l.m154714a(this.f102233d, oVar.f102233d) && C89219l.m154714a(this.f102234e, oVar.f102234e);
    }

    public final int hashCode() {
        Integer num = this.f102230a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.f102231b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f102232c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f102233d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num2 = this.f102234e;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "Reason(reasonType=" + this.f102230a + ", reasonKey=" + this.f102231b + ", title=" + this.f102232c + ", description=" + this.f102233d + ", descriptionLimit=" + this.f102234e + ")";
    }

    private /* synthetic */ C43861o() {
        this(1, 200);
    }

    private C43861o(Integer num, Integer num2) {
        this.f102230a = num;
        this.f102231b = null;
        this.f102232c = null;
        this.f102233d = null;
        this.f102234e = num2;
    }
}
