package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.widget;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitState;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.widget.e */
final /* synthetic */ class C43963e extends C89232y {

    /* renamed from: a */
    public static final AbstractC89290k f102488a = new C43963e();

    static {
        Covode.recordClassIndex(52253);
    }

    C43963e() {
        super(OrderSubmitState.class, "totalItems", "getTotalItems()I", 0);
    }

    @Override // p4600h.p4620k.AbstractC89290k, p4600h.p4611f.p4613b.C89232y
    public final Object get(Object obj) {
        return Integer.valueOf(((OrderSubmitState) obj).getTotalItems());
    }
}
