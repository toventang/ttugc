package com.p2082ss.android.ugc.aweme.friends.recommendlist.repository;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.friends.model.RecommendUserDialogList;
import p4560f.p4561a.AbstractC88979t;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.friends.recommendlist.repository.RecommendUserDialogApi */
public interface RecommendUserDialogApi {

    /* renamed from: a */
    public static final C51600a f118907a = C51600a.f118908a;

    static {
        Covode.recordClassIndex(60942);
    }

    @AbstractC89722f(mo144276a = "/tiktok/v1/fyp/user/recommendations/")
    AbstractC88979t<RecommendUserDialogList> fetchRecommendUserDialogList(@AbstractC89736t(mo144292a = "count") Integer num, @AbstractC89736t(mo144292a = "cursor") Integer num2, @AbstractC89736t(mo144292a = "rec_impr_users") String str);

    /* renamed from: com.ss.android.ugc.aweme.friends.recommendlist.repository.RecommendUserDialogApi$a */
    public static final class C51600a {

        /* renamed from: a */
        static final /* synthetic */ C51600a f118908a = new C51600a();

        private C51600a() {
        }

        static {
            Covode.recordClassIndex(60943);
        }
    }
}
