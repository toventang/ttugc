package com.p2082ss.android.ugc.aweme.ecommerce.ordercenter.repository.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.AbstractC18099f;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p2082ss.android.ugc.aweme.ecommerce.ordercenter.repository.dto.ListOrderTabResponse;
import p4560f.p4561a.AbstractC88979t;
import p4640l.p4644b.AbstractC89722f;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.ordercenter.repository.api.OrderTabDataApi */
public interface OrderTabDataApi {

    /* renamed from: a */
    public static final C44619a f104085a = C44619a.f104087b;

    static {
        Covode.recordClassIndex(52987);
    }

    @AbstractC89722f(mo144276a = "/api/v1/trade/list_order_tab/get")
    AbstractC88979t<ListOrderTabResponse> getOrderTabData();

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.ordercenter.repository.api.OrderTabDataApi$a */
    public static final class C44619a {

        /* renamed from: a */
        public static final AbstractC18099f f104086a = RetrofitFactory.m33635a().mo28817b("https://oec-api.tiktokv.com/").mo28832d();

        /* renamed from: b */
        static final /* synthetic */ C44619a f104087b = new C44619a();

        private C44619a() {
        }

        static {
            Covode.recordClassIndex(52988);
        }
    }
}
