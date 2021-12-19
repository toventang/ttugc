package com.p2082ss.android.ugc.aweme.ecommerce.widget.regionpicker.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.dto.OrderSKUDTO;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.model.a */
public final class C45655a {
    @AbstractC27891c(mo46611a = "geoname_ids")

    /* renamed from: a */
    public final String[] f106279a;
    @AbstractC27891c(mo46611a = "order_skus")

    /* renamed from: b */
    public final List<OrderSKUDTO> f106280b;

    static {
        Covode.recordClassIndex(54157);
    }

    private /* synthetic */ C45655a() {
        this(null, null);
    }

    public C45655a(String[] strArr, List<OrderSKUDTO> list) {
        this.f106279a = strArr;
        this.f106280b = list;
    }
}
