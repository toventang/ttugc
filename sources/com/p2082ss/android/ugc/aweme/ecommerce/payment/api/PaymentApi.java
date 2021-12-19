package com.p2082ss.android.ugc.aweme.ecommerce.payment.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.AbstractC18099f;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.C43612a;
import com.p2082ss.android.ugc.aweme.ecommerce.payment.p2848a.C44628c;
import java.util.Map;
import p4560f.p4561a.AbstractC88979t;
import p4640l.p4644b.AbstractC89717a;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89731o;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.payment.api.PaymentApi */
public interface PaymentApi {

    /* renamed from: a */
    public static final C44630a f104126a = C44630a.f104128b;

    static {
        Covode.recordClassIndex(53009);
    }

    @AbstractC89722f(mo144276a = "/api/v1/pay/auth/get")
    AbstractC88979t<C43612a<C44628c>> getPaymentAuth();

    @AbstractC89731o(mo144285a = "/api/v1/trade/order/pay")
    AbstractC88979t<C43612a<C44628c>> getPaymentInfo(@AbstractC89717a Map<String, Object> map);

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.payment.api.PaymentApi$a */
    public static final class C44630a {

        /* renamed from: a */
        public static final AbstractC18099f f104127a = RetrofitFactory.m33635a().mo28817b("https://oec-api.tiktokv.com/").mo28832d();

        /* renamed from: b */
        static final /* synthetic */ C44630a f104128b = new C44630a();

        private C44630a() {
        }

        /* renamed from: a */
        public static AbstractC88979t<C43612a<C44628c>> m87364a() {
            return ((PaymentApi) f104127a.mo28858a(PaymentApi.class)).getPaymentAuth();
        }

        static {
            Covode.recordClassIndex(53010);
        }
    }
}
