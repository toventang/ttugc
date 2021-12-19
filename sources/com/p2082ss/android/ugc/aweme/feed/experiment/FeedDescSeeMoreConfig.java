package com.p2082ss.android.ugc.aweme.feed.experiment;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.feed.experiment.FeedDescSeeMoreConfig */
public final class FeedDescSeeMoreConfig {
    @AbstractC27891c(mo46611a = "groupId")
    private final int groupId;
    @AbstractC27891c(mo46611a = "opacity")
    private final float opacity;

    static {
        Covode.recordClassIndex(58306);
    }

    /* renamed from: com_ss_android_ugc_aweme_feed_experiment_FeedDescSeeMoreConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m92731xef3823bb(int i) {
        return i;
    }

    public static /* synthetic */ FeedDescSeeMoreConfig copy$default(FeedDescSeeMoreConfig feedDescSeeMoreConfig, int i, float f, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = feedDescSeeMoreConfig.groupId;
        }
        if ((i2 & 2) != 0) {
            f = feedDescSeeMoreConfig.opacity;
        }
        return feedDescSeeMoreConfig.copy(i, f);
    }

    public final int component1() {
        return this.groupId;
    }

    public final float component2() {
        return this.opacity;
    }

    public final FeedDescSeeMoreConfig copy(int i, float f) {
        return new FeedDescSeeMoreConfig(i, f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedDescSeeMoreConfig)) {
            return false;
        }
        FeedDescSeeMoreConfig feedDescSeeMoreConfig = (FeedDescSeeMoreConfig) obj;
        return this.groupId == feedDescSeeMoreConfig.groupId && Float.compare(this.opacity, feedDescSeeMoreConfig.opacity) == 0;
    }

    public final int hashCode() {
        return (m92731xef3823bb(this.groupId) * 31) + m92730xef3823bb(this.opacity);
    }

    public final String toString() {
        return "FeedDescSeeMoreConfig(groupId=" + this.groupId + ", opacity=" + this.opacity + ")";
    }

    public final int getGroupId() {
        return this.groupId;
    }

    public final float getOpacity() {
        return this.opacity;
    }

    /* renamed from: com_ss_android_ugc_aweme_feed_experiment_FeedDescSeeMoreConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m92730xef3823bb(float f) {
        return Float.floatToIntBits(f);
    }

    public FeedDescSeeMoreConfig(int i, float f) {
        this.groupId = i;
        this.opacity = f;
    }
}
