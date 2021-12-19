package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.i */
final /* synthetic */ class C44144i extends C89232y {

    /* renamed from: a */
    public static final AbstractC89290k f102929a = new C44144i();

    static {
        Covode.recordClassIndex(52455);
    }

    C44144i() {
        super(PaymentState.class, "checkedPaymentMethod", "getCheckedPaymentMethod()Lcom/ss/android/ugc/aweme/ecommerce/combinepayment/payment/dto/PaymentMethod;", 0);
    }

    @Override // p4600h.p4620k.AbstractC89290k, p4600h.p4611f.p4613b.C89232y
    public final Object get(Object obj) {
        return ((PaymentState) obj).getCheckedPaymentMethod();
    }
}
