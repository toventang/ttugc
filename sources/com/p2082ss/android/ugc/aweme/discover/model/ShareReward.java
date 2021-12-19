package com.p2082ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.model.ShareReward */
public final class ShareReward implements Serializable {
    @AbstractC27891c(mo46611a = "highest_profit")
    private final String highestProfit;
    @AbstractC27891c(mo46611a = "reward_consume_percent")
    private final Integer rewardConsumePercent;

    static {
        Covode.recordClassIndex(50528);
    }

    public ShareReward() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ ShareReward copy$default(ShareReward shareReward, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = shareReward.rewardConsumePercent;
        }
        if ((i & 2) != 0) {
            str = shareReward.highestProfit;
        }
        return shareReward.copy(num, str);
    }

    public final Integer component1() {
        return this.rewardConsumePercent;
    }

    public final String component2() {
        return this.highestProfit;
    }

    public final ShareReward copy(Integer num, String str) {
        return new ShareReward(num, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareReward)) {
            return false;
        }
        ShareReward shareReward = (ShareReward) obj;
        return C89219l.m154714a(this.rewardConsumePercent, shareReward.rewardConsumePercent) && C89219l.m154714a(this.highestProfit, shareReward.highestProfit);
    }

    public final int hashCode() {
        Integer num = this.rewardConsumePercent;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.highestProfit;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "ShareReward(rewardConsumePercent=" + this.rewardConsumePercent + ", highestProfit=" + this.highestProfit + ")";
    }

    public final String getHighestProfit() {
        return this.highestProfit;
    }

    public final Integer getRewardConsumePercent() {
        return this.rewardConsumePercent;
    }

    public ShareReward(Integer num, String str) {
        this.rewardConsumePercent = num;
        this.highestProfit = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ShareReward(Integer num, String str, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str);
    }
}
