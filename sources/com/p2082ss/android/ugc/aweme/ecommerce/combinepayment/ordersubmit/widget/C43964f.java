package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.widget;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitState;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.widget.f */
final /* synthetic */ class C43964f extends C89232y {

    /* renamed from: a */
    public static final AbstractC89290k f102489a = new C43964f();

    static {
        Covode.recordClassIndex(52254);
    }

    C43964f() {
        super(OrderSubmitState.class, "hasAddress", "getHasAddress()Z", 0);
    }

    @Override // p4600h.p4620k.AbstractC89290k, p4600h.p4611f.p4613b.C89232y
    public final Object get(Object obj) {
        return Boolean.valueOf(((OrderSubmitState) obj).getHasAddress());
    }
}
