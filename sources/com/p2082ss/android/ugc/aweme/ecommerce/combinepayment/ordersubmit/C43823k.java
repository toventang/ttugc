package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.k */
final /* synthetic */ class C43823k extends C89232y {

    /* renamed from: a */
    public static final AbstractC89290k f102119a = new C43823k();

    static {
        Covode.recordClassIndex(52088);
    }

    C43823k() {
        super(OrderSubmitState.class, "pageLoadStatus", "getPageLoadStatus()I", 0);
    }

    @Override // p4600h.p4620k.AbstractC89290k, p4600h.p4611f.p4613b.C89232y
    public final Object get(Object obj) {
        return Integer.valueOf(((OrderSubmitState) obj).getPageLoadStatus());
    }
}
