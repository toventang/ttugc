package com.p2082ss.android.ugc.aweme.api.request;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.api.resp.EnterContext;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.android.ugc.aweme.api.request.GetItemProductInfoRequest */
public final class GetItemProductInfoRequest implements Serializable {
    @AbstractC27891c(mo46611a = "kol_id")
    private final String kolId;
    @AbstractC27891c(mo46611a = "product_enter_context")
    private final Map<String, EnterContext> productEnterContext;
    @AbstractC27891c(mo46611a = "product_id")
    private final List<String> productIds;

    static {
        Covode.recordClassIndex(40415);
    }

    public GetItemProductInfoRequest() {
        this(null, null, null, 7, null);
    }

    public final String getKolId() {
        return this.kolId;
    }

    public final Map<String, EnterContext> getProductEnterContext() {
        return this.productEnterContext;
    }

    public final List<String> getProductIds() {
        return this.productIds;
    }

    public GetItemProductInfoRequest(List<String> list, String str, Map<String, EnterContext> map) {
        this.productIds = list;
        this.kolId = str;
        this.productEnterContext = map;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetItemProductInfoRequest(List list, String str, Map map, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : map);
    }
}
