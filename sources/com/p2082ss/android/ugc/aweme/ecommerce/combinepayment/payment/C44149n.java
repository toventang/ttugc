package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.n */
final /* synthetic */ class C44149n extends C89232y {

    /* renamed from: a */
    public static final AbstractC89290k f102934a = new C44149n();

    static {
        Covode.recordClassIndex(52460);
    }

    C44149n() {
        super(PaymentState.class, "paymentList", "getPaymentList()Ljava/util/List;", 0);
    }

    @Override // p4600h.p4620k.AbstractC89290k, p4600h.p4611f.p4613b.C89232y
    public final Object get(Object obj) {
        return ((PaymentState) obj).getPaymentList();
    }
}
