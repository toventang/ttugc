package com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.Region;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.b */
public final class C44455b {
    @AbstractC27891c(mo46611a = "order_skus")

    /* renamed from: a */
    public final List<OrderSKUDTO> f103643a;
    @AbstractC27891c(mo46611a = "buyer_addr_id")

    /* renamed from: b */
    public final String f103644b;
    @AbstractC27891c(mo46611a = "ship_to_addr")

    /* renamed from: c */
    public final List<Region> f103645c;

    static {
        Covode.recordClassIndex(52798);
    }

    private /* synthetic */ C44455b() {
        this(null, null, null);
    }

    public C44455b(List<OrderSKUDTO> list, String str, List<Region> list2) {
        this.f103643a = list;
        this.f103644b = str;
        this.f103645c = list2;
    }
}
