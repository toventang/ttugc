package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.m */
final /* synthetic */ class C44148m extends C89232y {

    /* renamed from: a */
    public static final AbstractC89290k f102933a = new C44148m();

    static {
        Covode.recordClassIndex(52459);
    }

    C44148m() {
        super(PaymentState.class, "showLoading", "getShowLoading()Z", 0);
    }

    @Override // p4600h.p4620k.AbstractC89290k, p4600h.p4611f.p4613b.C89232y
    public final Object get(Object obj) {
        return Boolean.valueOf(((PaymentState) obj).getShowLoading());
    }
}
