package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.p */
final /* synthetic */ class C44151p extends C89232y {

    /* renamed from: a */
    public static final AbstractC89290k f102936a = new C44151p();

    static {
        Covode.recordClassIndex(52462);
    }

    C44151p() {
        super(PaymentState.class, "emailHintVisible", "getEmailHintVisible()Z", 0);
    }

    @Override // p4600h.p4620k.AbstractC89290k, p4600h.p4611f.p4613b.C89232y
    public final Object get(Object obj) {
        return Boolean.valueOf(((PaymentState) obj).getEmailHintVisible());
    }
}
