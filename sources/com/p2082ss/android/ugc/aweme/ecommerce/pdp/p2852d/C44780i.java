package com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ShopPolicy;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.d.i */
public final class C44780i implements AbstractC44779h {

    /* renamed from: a */
    public final List<ShopPolicy> f104484a;

    static {
        Covode.recordClassIndex(53166);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d.AbstractC44779h
    /* renamed from: a */
    public final String mo75904a() {
        return "retailer_policies";
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C44780i) && C89219l.m154714a(this.f104484a, ((C44780i) obj).f104484a);
        }
        return true;
    }

    public final int hashCode() {
        List<ShopPolicy> list = this.f104484a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ProductSelectServicesVO(shopPolicy=" + this.f104484a + ")";
    }

    public C44780i(List<ShopPolicy> list) {
        C89219l.m154721d(list, "");
        this.f104484a = list;
    }
}
