package com.p2082ss.android.ugc.aweme.shoutouts.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.shoutouts.model.ShoutoutsOrderListApi */
public interface ShoutoutsOrderListApi {

    /* renamed from: a */
    public static final C74432a f167387a = C74432a.f167388a;

    static {
        Covode.recordClassIndex(87212);
    }

    @AbstractC89722f(mo144276a = "/tiktok/shoutouts/order/list/v1")
    AbstractC88979t<C74440d> getOrderList(@AbstractC89736t(mo144292a = "filter") int i, @AbstractC89736t(mo144292a = "product_id") String str, @AbstractC89736t(mo144292a = "count") int i2);

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.model.ShoutoutsOrderListApi$a */
    public static final class C74432a {

        /* renamed from: a */
        static final /* synthetic */ C74432a f167388a = new C74432a();

        private C74432a() {
        }

        static {
            Covode.recordClassIndex(87213);
        }

        /* renamed from: a */
        public static ShoutoutsOrderListApi m130886a() {
            Object a = RetrofitFactory.m33635a().mo28816a(Api.f79771d).mo28858a(ShoutoutsOrderListApi.class);
            C89219l.m154716b(a, "");
            return (ShoutoutsOrderListApi) a;
        }
    }
}
