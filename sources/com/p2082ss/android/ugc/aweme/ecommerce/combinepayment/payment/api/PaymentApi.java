package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.AbstractC18099f;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.C22099u;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.C43612a;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.BindInfoRequest;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.BindInfoResponseData;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44080i;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44081j;
import p4560f.p4561a.AbstractC88979t;
import p4640l.p4644b.AbstractC89717a;
import p4640l.p4644b.AbstractC89731o;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.api.PaymentApi */
public interface PaymentApi {

    /* renamed from: a */
    public static final C44053a f102694a = C44053a.f102696b;

    static {
        Covode.recordClassIndex(52358);
    }

    @AbstractC89731o(mo144285a = "/api/v1/trade/order/payment_method_bind_info")
    AbstractC88979t<C43612a<BindInfoResponseData>> getBindInfo(@AbstractC89717a BindInfoRequest bindInfoRequest);

    @AbstractC89731o(mo144285a = "/api/v1/trade/order/pay")
    AbstractC88979t<C22099u<C43612a<C44081j>>> pay(@AbstractC89717a C44080i iVar);

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.api.PaymentApi$a */
    public static final class C44053a {

        /* renamed from: a */
        public static final AbstractC18099f f102695a = RetrofitFactory.m33635a().mo28817b("https://oec-api.tiktokv.com/").mo28832d();

        /* renamed from: b */
        static final /* synthetic */ C44053a f102696b = new C44053a();

        private C44053a() {
        }

        static {
            Covode.recordClassIndex(52359);
        }
    }
}
