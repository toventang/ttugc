package com.p2082ss.android.ugc.aweme.discover.hitrank;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.discover.hitrank.RankApi */
public interface RankApi {
    static {
        Covode.recordClassIndex(49995);
    }

    @AbstractC89722f(mo144276a = "aweme/v1/spotpoint/set/hitrank/")
    AbstractFutureC27655q<BaseResponse> finishHitRankTask(@AbstractC89736t(mo144292a = "to_userid") String str, @AbstractC89736t(mo144292a = "rank_type") int i, @AbstractC89736t(mo144292a = "action_type") int i2, @AbstractC89736t(mo144292a = "hashtag_names") List<String> list, @AbstractC89736t(mo144292a = "sec_to_userid") String str2);

    @AbstractC89722f(mo144276a = "aweme/v1/spotpoint/hit/notice/star/list/")
    AbstractFutureC27655q<HitNotice> getActivityInfo(@AbstractC89736t(mo144292a = "user_id") String str, @AbstractC89736t(mo144292a = "sec_user_id") String str2);
}
