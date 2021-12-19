package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.a */
public final class C43847a {

    /* renamed from: a */
    public static final C43847a f102158a = new C43847a();

    /* renamed from: a */
    public static String m86772a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "" : "payment_discount" : "coupon" : "shipping_fee" : "tax" : "sub_total";
    }

    private C43847a() {
    }

    static {
        Covode.recordClassIndex(52127);
    }
}
