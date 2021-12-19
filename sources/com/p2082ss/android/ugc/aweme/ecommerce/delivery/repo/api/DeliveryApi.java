package com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.AbstractC18099f;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.C43612a;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.dto.C44454a;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.dto.C44455b;
import p4560f.p4561a.AbstractC88979t;
import p4640l.p4644b.AbstractC89717a;
import p4640l.p4644b.AbstractC89731o;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.repo.api.DeliveryApi */
public interface DeliveryApi {

    /* renamed from: a */
    public static final C44450a f103611a = C44450a.f103613b;

    static {
        Covode.recordClassIndex(52789);
    }

    @AbstractC89731o(mo144285a = "/api/v1/shop/logistic/list")
    AbstractC88979t<C43612a<C44454a>> getLogistics(@AbstractC89717a C44455b bVar);

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.repo.api.DeliveryApi$a */
    public static final class C44450a {

        /* renamed from: a */
        public static final AbstractC18099f f103612a = RetrofitFactory.m33635a().mo28817b("https://oec-api.tiktokv.com/").mo28832d();

        /* renamed from: b */
        static final /* synthetic */ C44450a f103613b = new C44450a();

        private C44450a() {
        }

        static {
            Covode.recordClassIndex(52790);
        }
    }
}
