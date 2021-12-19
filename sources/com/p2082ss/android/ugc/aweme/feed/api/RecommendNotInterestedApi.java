package com.p2082ss.android.ugc.aweme.feed.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.Map;
import p4560f.p4561a.AbstractC88979t;
import p4640l.p4644b.AbstractC89720d;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89731o;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.feed.api.RecommendNotInterestedApi */
public final class RecommendNotInterestedApi {

    /* renamed from: com.ss.android.ugc.aweme.feed.api.RecommendNotInterestedApi$SyncNotInterestedApi */
    public interface SyncNotInterestedApi {
        static {
            Covode.recordClassIndex(57096);
        }

        @AbstractC89731o(mo144285a = "/aweme/v1/commit/dislike/item/")
        @AbstractC89721e
        AbstractC88979t<BaseResponse> dislikeRecommend(@AbstractC89736t(mo144292a = "aweme_id") String str, @AbstractC89720d Map<String, String> map);
    }

    static {
        Covode.recordClassIndex(57095);
    }
}
