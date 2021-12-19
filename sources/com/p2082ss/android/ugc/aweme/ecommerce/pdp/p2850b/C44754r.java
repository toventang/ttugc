package com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2850b;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import p4600h.C89378p;
import p4600h.p4601a.C89041ag;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.b.r */
public final class C44754r extends AbstractC44713g {

    /* renamed from: a */
    public final long f104417a;

    static {
        Covode.recordClassIndex(53140);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.track.AbstractC45535a
    /* renamed from: a */
    public final HashMap<String, Object> mo73987a() {
        return C89041ag.m154428c(new C89378p("duration", Long.valueOf(this.f104417a)), new C89378p("action_sheet_for", "sku"));
    }

    public C44754r(long j) {
        super("tiktokec_product_detail_skuactionsheet_stay_time");
        this.f104417a = j;
    }
}
