package com.p2082ss.android.ugc.aweme.ecommerce.address.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.dto.C44457d;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.address.dto.a */
public final class C43365a {
    @AbstractC27891c(mo46611a = "shipping_address_list")

    /* renamed from: a */
    public final List<C44457d> f101214a;

    static {
        Covode.recordClassIndex(51591);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C43365a) && C89219l.m154714a(this.f101214a, ((C43365a) obj).f101214a);
        }
        return true;
    }

    public final int hashCode() {
        List<C44457d> list = this.f101214a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "AddressListData(addressList=" + this.f101214a + ")";
    }
}
