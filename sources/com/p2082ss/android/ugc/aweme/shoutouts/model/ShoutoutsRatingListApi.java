package com.p2082ss.android.ugc.aweme.shoutouts.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p2082ss.android.p2123b.C29736b;
import p4560f.p4561a.AbstractC88403ab;
import p4600h.p4611f.p4613b.C89219l;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.shoutouts.model.ShoutoutsRatingListApi */
public interface ShoutoutsRatingListApi {

    /* renamed from: a */
    public static final C74436a f167395a = C74436a.f167396a;

    static {
        Covode.recordClassIndex(87224);
    }

    @AbstractC89722f(mo144276a = "/tiktok/shoutouts/product/rating/list/v1")
    AbstractC88403ab<C74442f> getRatingList(@AbstractC89736t(mo144292a = "creator_uid") String str, @AbstractC89736t(mo144292a = "product_id") String str2, @AbstractC89736t(mo144292a = "offset") int i, @AbstractC89736t(mo144292a = "count") int i2);

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.model.ShoutoutsRatingListApi$a */
    public static final class C74436a {

        /* renamed from: a */
        static final /* synthetic */ C74436a f167396a = new C74436a();

        private C74436a() {
        }

        static {
            Covode.recordClassIndex(87225);
        }

        /* renamed from: a */
        public static ShoutoutsRatingListApi m130892a() {
            Object a = RetrofitFactory.m33635a().mo28817b(C29736b.f70924e).mo28832d().mo28858a(ShoutoutsRatingListApi.class);
            C89219l.m154716b(a, "");
            return (ShoutoutsRatingListApi) a;
        }
    }
}
