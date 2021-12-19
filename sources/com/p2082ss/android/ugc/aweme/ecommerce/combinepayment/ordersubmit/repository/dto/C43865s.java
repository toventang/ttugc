package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.s */
public final class C43865s {
    @AbstractC27891c(mo46611a = "reason_show_type")

    /* renamed from: a */
    public final int f102241a;
    @AbstractC27891c(mo46611a = "select_reasons")

    /* renamed from: b */
    public final List<C43862p> f102242b;
    @AbstractC27891c(mo46611a = "input_reasons")

    /* renamed from: c */
    public final List<C43854h> f102243c;
    @AbstractC27891c(mo46611a = "extra")

    /* renamed from: d */
    public final String f102244d;

    static {
        Covode.recordClassIndex(52145);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43865s)) {
            return false;
        }
        C43865s sVar = (C43865s) obj;
        return this.f102241a == sVar.f102241a && C89219l.m154714a(this.f102242b, sVar.f102242b) && C89219l.m154714a(this.f102243c, sVar.f102243c) && C89219l.m154714a(this.f102244d, sVar.f102244d);
    }

    public final int hashCode() {
        int i = this.f102241a * 31;
        List<C43862p> list = this.f102242b;
        int i2 = 0;
        int hashCode = (i + (list != null ? list.hashCode() : 0)) * 31;
        List<C43854h> list2 = this.f102243c;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str = this.f102244d;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "SubmitQuitReasonRequest(reasonShowType=" + this.f102241a + ", selectReasons=" + this.f102242b + ", inputReasons=" + this.f102243c + ", extraInfo=" + this.f102244d + ")";
    }

    public C43865s(int i, List<C43862p> list, List<C43854h> list2, String str) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(list2, "");
        this.f102241a = i;
        this.f102242b = list;
        this.f102243c = list2;
        this.f102244d = str;
    }
}
