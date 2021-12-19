package com.p2082ss.android.ugc.aweme.shoutouts.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p2082ss.android.p2123b.C29736b;
import p4560f.p4561a.AbstractC88403ab;
import p4600h.p4611f.p4613b.C89219l;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.shoutouts.model.ShoutoutsProductApi */
public interface ShoutoutsProductApi {

    /* renamed from: a */
    public static final C74433a f167389a = C74433a.f167390a;

    static {
        Covode.recordClassIndex(87217);
    }

    @AbstractC89722f(mo144276a = "/tiktok/shoutouts/product/get/v1")
    AbstractC88403ab<C74443g> getProduct(@AbstractC89736t(mo144292a = "creator_uid") String str, @AbstractC89736t(mo144292a = "product_id") String str2);

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.model.ShoutoutsProductApi$a */
    public static final class C74433a {

        /* renamed from: a */
        static final /* synthetic */ C74433a f167390a = new C74433a();

        private C74433a() {
        }

        static {
            Covode.recordClassIndex(87218);
        }

        /* renamed from: a */
        public static ShoutoutsProductApi m130891a() {
            Object a = RetrofitFactory.m33635a().mo28817b(C29736b.f70924e).mo28832d().mo28858a(ShoutoutsProductApi.class);
            C89219l.m154716b(a, "");
            return (ShoutoutsProductApi) a;
        }
    }
}
