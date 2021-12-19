package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.r */
public final class C43864r {
    @AbstractC27891c(mo46611a = "reason_show_type")

    /* renamed from: a */
    public final int f102238a = 0;
    @AbstractC27891c(mo46611a = "select_reasons")

    /* renamed from: b */
    public final List<C43862p> f102239b;
    @AbstractC27891c(mo46611a = "input_reasons")

    /* renamed from: c */
    public final List<C43854h> f102240c;

    static {
        Covode.recordClassIndex(52144);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43864r)) {
            return false;
        }
        C43864r rVar = (C43864r) obj;
        return this.f102238a == rVar.f102238a && C89219l.m154714a(this.f102239b, rVar.f102239b) && C89219l.m154714a(this.f102240c, rVar.f102240c);
    }

    public final int hashCode() {
        int i = this.f102238a * 31;
        List<C43862p> list = this.f102239b;
        int i2 = 0;
        int hashCode = (i + (list != null ? list.hashCode() : 0)) * 31;
        List<C43854h> list2 = this.f102240c;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "SubmitQuitReason(reasonShowType=" + this.f102238a + ", selectReasons=" + this.f102239b + ", inputReasons=" + this.f102240c + ")";
    }

    public C43864r(List<C43862p> list, List<C43854h> list2) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(list2, "");
        this.f102239b = list;
        this.f102240c = list2;
    }
}
