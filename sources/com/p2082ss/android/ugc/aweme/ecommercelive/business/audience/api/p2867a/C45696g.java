package com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.api.p2867a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.api.a.g */
public final class C45696g {
    @AbstractC27891c(mo46611a = "products")

    /* renamed from: a */
    public final List<C45687a> f106413a;

    static {
        Covode.recordClassIndex(54211);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C45696g) && C89219l.m154714a(this.f106413a, ((C45696g) obj).f106413a);
        }
        return true;
    }

    public final int hashCode() {
        List<C45687a> list = this.f106413a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ProductListDTO(products=" + this.f106413a + ")";
    }
}
