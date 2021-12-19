package com.bytedance.android.livesdk.rank.api.model;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

public class PeriodRankExtra extends Extra {
    @AbstractC27891c(mo46611a = "gap_description")
    public String gapDescription;
    @AbstractC27891c(mo46611a = "self_info")
    public User mUser;
    @AbstractC27891c(mo46611a = "self_rank")
    public int selfRank;
    @AbstractC27891c(mo46611a = "self_score")
    public long selfScore;

    static {
        Covode.recordClassIndex(11914);
    }
}
