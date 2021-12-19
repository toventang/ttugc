package com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.api.p2867a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.api.a.e */
public final class C45694e {
    @AbstractC27891c(mo46611a = "product_data")

    /* renamed from: a */
    public final Map<String, C45690c> f106410a;

    static {
        Covode.recordClassIndex(54209);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C45694e) && C89219l.m154714a(this.f106410a, ((C45694e) obj).f106410a);
        }
        return true;
    }

    public final int hashCode() {
        Map<String, C45690c> map = this.f106410a;
        if (map != null) {
            return map.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "FansPopUpDatas(productData=" + this.f106410a + ")";
    }
}
