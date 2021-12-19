package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.g */
public final class C43853g {
    @AbstractC27891c(mo46611a = "sku_infos")

    /* renamed from: a */
    public final List<C43863q> f102194a;

    static {
        Covode.recordClassIndex(52133);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C43853g) && C89219l.m154714a(this.f102194a, ((C43853g) obj).f102194a);
        }
        return true;
    }

    public final int hashCode() {
        List<C43863q> list = this.f102194a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ExtraInfo(skuInfos=" + this.f102194a + ")";
    }

    public C43853g(List<C43863q> list) {
        C89219l.m154721d(list, "");
        this.f102194a = list;
    }
}
