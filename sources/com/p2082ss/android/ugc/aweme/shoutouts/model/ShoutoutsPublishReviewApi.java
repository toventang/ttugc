package com.p2082ss.android.ugc.aweme.shoutouts.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4560f.p4561a.AbstractC88979t;
import p4640l.p4644b.AbstractC89731o;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.shoutouts.model.ShoutoutsPublishReviewApi */
public interface ShoutoutsPublishReviewApi {

    /* renamed from: a */
    public static final C74434a f167391a = C74434a.f167392a;

    static {
        Covode.recordClassIndex(87220);
    }

    @AbstractC89731o(mo144285a = "/tiktok/shoutouts/product/rating/create/v1")
    AbstractC88979t<BaseResponse> publishReview(@AbstractC89736t(mo144292a = "product_id") String str, @AbstractC89736t(mo144292a = "order_id") String str2, @AbstractC89736t(mo144292a = "rating_value") int i, @AbstractC89736t(mo144292a = "rating_text") String str3);

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.model.ShoutoutsPublishReviewApi$a */
    public static final class C74434a {

        /* renamed from: a */
        static final /* synthetic */ C74434a f167392a = new C74434a();

        private C74434a() {
        }

        static {
            Covode.recordClassIndex(87221);
        }
    }
}
