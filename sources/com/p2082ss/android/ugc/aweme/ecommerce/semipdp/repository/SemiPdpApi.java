package com.p2082ss.android.ugc.aweme.ecommerce.semipdp.repository;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.AbstractC18099f;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.C22099u;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.C43612a;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.C44889a;
import java.util.HashMap;
import java.util.Map;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;
import p4640l.p4644b.AbstractC89717a;
import p4640l.p4644b.AbstractC89731o;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.repository.SemiPdpApi */
public interface SemiPdpApi {

    /* renamed from: a */
    public static final C45360a f105694a = C45360a.f105695a;

    static {
        Covode.recordClassIndex(53819);
    }

    @AbstractC89731o(mo144285a = "/api/v1/shop/third_party_product_info/get")
    AbstractC88979t<C22099u<C43612a<C44889a>>> getProductInfo(@AbstractC89717a Map<String, Object> map);

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.repository.SemiPdpApi$a */
    public static final class C45360a {

        /* renamed from: a */
        static final /* synthetic */ C45360a f105695a = new C45360a();

        /* renamed from: b */
        private static final AbstractC18099f f105696b = RetrofitFactory.m33635a().mo28817b("https://oec-api.tiktokv.com/").mo28832d();

        private C45360a() {
        }

        static {
            Covode.recordClassIndex(53820);
        }

        /* renamed from: a */
        public static AbstractC88979t<C22099u<C43612a<C44889a>>> m87932a(HashMap<String, Object> hashMap) {
            C89219l.m154721d(hashMap, "");
            return ((SemiPdpApi) f105696b.mo28858a(SemiPdpApi.class)).getProductInfo(hashMap);
        }
    }
}
