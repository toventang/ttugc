package com.p2082ss.android.ugc.aweme.ecommerce.ordercenter.repository.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.AbstractC18099f;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p2082ss.android.ugc.aweme.ecommerce.ordercenter.repository.dto.GetEntranceInfoResponse;
import p4560f.p4561a.AbstractC88979t;
import p4640l.p4644b.AbstractC89722f;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.ordercenter.repository.api.OrderEntranceApi */
public interface OrderEntranceApi {

    /* renamed from: a */
    public static final C44618a f104082a = C44618a.f104084b;

    static {
        Covode.recordClassIndex(52985);
    }

    @AbstractC89722f(mo144276a = "/api/v1/trade/entrance/get")
    AbstractC88979t<GetEntranceInfoResponse> getEntranceInfo();

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.ordercenter.repository.api.OrderEntranceApi$a */
    public static final class C44618a {

        /* renamed from: a */
        public static final AbstractC18099f f104083a = RetrofitFactory.m33635a().mo28817b("https://oec-api.tiktokv.com/").mo28832d();

        /* renamed from: b */
        static final /* synthetic */ C44618a f104084b = new C44618a();

        private C44618a() {
        }

        static {
            Covode.recordClassIndex(52986);
        }
    }
}
