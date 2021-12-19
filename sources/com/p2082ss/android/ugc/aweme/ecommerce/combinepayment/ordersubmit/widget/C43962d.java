package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.widget;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitState;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.widget.d */
final /* synthetic */ class C43962d extends C89232y {

    /* renamed from: a */
    public static final AbstractC89290k f102487a = new C43962d();

    static {
        Covode.recordClassIndex(52252);
    }

    C43962d() {
        super(OrderSubmitState.class, "orderSummaryPanelOpened", "getOrderSummaryPanelOpened()Z", 0);
    }

    @Override // p4600h.p4620k.AbstractC89290k, p4600h.p4611f.p4613b.C89232y
    public final Object get(Object obj) {
        return Boolean.valueOf(((OrderSubmitState) obj).getOrderSummaryPanelOpened());
    }
}
