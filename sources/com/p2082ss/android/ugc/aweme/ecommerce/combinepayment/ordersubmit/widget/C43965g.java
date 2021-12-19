package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.widget;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitState;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44085n;
import p4600h.p4611f.p4613b.C89225r;
import p4600h.p4620k.AbstractC89284h;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.widget.g */
final /* synthetic */ class C43965g extends C89225r {

    /* renamed from: a */
    public static final AbstractC89284h f102490a = new C43965g();

    static {
        Covode.recordClassIndex(52255);
    }

    C43965g() {
        super(OrderSubmitState.class, "userPaymentInfo", "getUserPaymentInfo()Lcom/ss/android/ugc/aweme/ecommerce/combinepayment/payment/dto/PaymentInfo;", 0);
    }

    @Override // p4600h.p4611f.p4613b.C89225r, p4600h.p4620k.AbstractC89290k
    public final Object get(Object obj) {
        return ((OrderSubmitState) obj).getUserPaymentInfo();
    }

    @Override // p4600h.p4611f.p4613b.C89225r
    public final void set(Object obj, Object obj2) {
        ((OrderSubmitState) obj).setUserPaymentInfo((C44085n) obj2);
    }
}
