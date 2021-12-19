package com.p2082ss.android.ugc.aweme.shoutouts.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4560f.p4561a.AbstractC88403ab;
import p4640l.p4644b.AbstractC89731o;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.shoutouts.model.ShoutoutsRatingDeleteApi */
public interface ShoutoutsRatingDeleteApi {

    /* renamed from: a */
    public static final C74435a f167393a = C74435a.f167394a;

    static {
        Covode.recordClassIndex(87222);
    }

    @AbstractC89731o(mo144285a = "/tiktok/shoutouts/product/rating/delete/v1")
    AbstractC88403ab<BaseResponse> deleteRating(@AbstractC89736t(mo144292a = "product_id") String str, @AbstractC89736t(mo144292a = "rating_id") String str2);

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.model.ShoutoutsRatingDeleteApi$a */
    public static final class C74435a {

        /* renamed from: a */
        static final /* synthetic */ C74435a f167394a = new C74435a();

        private C74435a() {
        }

        static {
            Covode.recordClassIndex(87223);
        }
    }
}
