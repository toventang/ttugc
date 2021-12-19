package com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.AbstractC18099f;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.C43612a;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.C44890b;
import java.util.Map;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;
import p4640l.p4644b.AbstractC89717a;
import p4640l.p4644b.AbstractC89731o;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.api.PdpApi */
public interface PdpApi {

    /* renamed from: a */
    public static final C44837a f104571a = C44837a.f104573b;

    static {
        Covode.recordClassIndex(53223);
    }

    @AbstractC89731o(mo144285a = "/api/v1/shop/product_info/get")
    AbstractC88979t<C44890b> getProductInfo(@AbstractC89717a Map<String, Object> map);

    @AbstractC89731o(mo144285a = "/api/v1/shop/product_info/batch")
    AbstractC88979t<C44890b> getProductInfoBatch(@AbstractC89717a Map<String, Object> map);

    @AbstractC89731o(mo144285a = "https://oec-api.tiktokv.com/aweme/v1/oec/creator_union/chain_collector/visit_event/report")
    AbstractC88979t<C43612a<Object>> reportEnterPdp(@AbstractC89717a Map<String, Object> map);

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.api.PdpApi$a */
    public static final class C44837a {

        /* renamed from: a */
        static final AbstractC18099f f104572a = RetrofitFactory.m33635a().mo28817b("https://oec-api.tiktokv.com/").mo28832d();

        /* renamed from: b */
        static final /* synthetic */ C44837a f104573b = new C44837a();

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.api.PdpApi$a$a */
        public static final class C44838a<T> implements AbstractC88433f {

            /* renamed from: a */
            public static final C44838a f104574a = new C44838a();

            static {
                Covode.recordClassIndex(53225);
            }

            C44838a() {
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.api.PdpApi$a$b */
        public static final class C44839b<T> implements AbstractC88433f {

            /* renamed from: a */
            public static final C44839b f104575a = new C44839b();

            static {
                Covode.recordClassIndex(53226);
            }

            C44839b() {
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.api.PdpApi$a$c */
        public static final class C44840c implements AbstractC88428a {

            /* renamed from: a */
            public static final C44840c f104576a = new C44840c();

            static {
                Covode.recordClassIndex(53227);
            }

            C44840c() {
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88428a
            /* renamed from: a */
            public final void mo8579a() {
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.api.PdpApi$a$d */
        public static final class C44841d<T> implements AbstractC88433f {

            /* renamed from: a */
            public static final C44841d f104577a = new C44841d();

            static {
                Covode.recordClassIndex(53228);
            }

            C44841d() {
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        private C44837a() {
        }

        static {
            Covode.recordClassIndex(53224);
        }

        /* renamed from: a */
        public static void m87547a(Map<String, Object> map) {
            C89219l.m154721d(map, "");
            map.put("click_time_millis", Long.valueOf(System.currentTimeMillis()));
            map.put("request_time_millis", Long.valueOf(System.currentTimeMillis()));
            ((PdpApi) f104572a.mo28858a(PdpApi.class)).reportEnterPdp(map).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143256a(C44838a.f104574a, C44839b.f104575a, C44840c.f104576a, C44841d.f104577a);
        }
    }
}
