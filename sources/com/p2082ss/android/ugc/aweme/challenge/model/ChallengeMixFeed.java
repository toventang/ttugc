package com.p2082ss.android.ugc.aweme.challenge.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42345d;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;

/* renamed from: com.ss.android.ugc.aweme.challenge.model.ChallengeMixFeed */
public final class ChallengeMixFeed {
    @AbstractC27891c(mo46611a = "dynamic_patch")
    public C42345d dynamicPatch;
    @AbstractC27891c(mo46611a = "dynamic_type")
    public int dynamicType;
    @AbstractC27891c(mo46611a = StringSet.type)
    public int feedType;
    public LogPbBean mLogPbBean;

    static {
        Covode.recordClassIndex(42739);
    }

    public final boolean isLynxCard() {
        if (this.feedType == 999) {
            return true;
        }
        return false;
    }

    public final boolean isVsLiveCard() {
        if (this.feedType == 998) {
            return true;
        }
        return false;
    }
}
