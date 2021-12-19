package com.p2082ss.android.ugc.aweme.commercialize.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.p2123b.C29736b;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89731o;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.CreateOrderApi */
public final class CreateOrderApi {

    /* renamed from: a */
    public static final CreateOrderApi f91218a = new CreateOrderApi();

    /* renamed from: b */
    private static final RealApi f91219b = ((RealApi) RetrofitFactory.m33635a().mo28817b(C29736b.f70924e).mo28832d().mo28858a(RealApi.class));

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.CreateOrderApi$RealApi */
    interface RealApi {
        static {
            Covode.recordClassIndex(46140);
        }

        @AbstractC89731o(mo144285a = "/aweme/v1/dypay/open/order/create/")
        @AbstractC89721e
        AbstractFutureC27655q<Object> createOrder(@AbstractC89719c(mo144273a = "prepay_order_id") String str);
    }

    private CreateOrderApi() {
    }

    static {
        Covode.recordClassIndex(46139);
    }
}
