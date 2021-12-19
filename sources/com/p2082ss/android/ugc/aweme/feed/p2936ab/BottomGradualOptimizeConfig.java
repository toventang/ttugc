package com.p2082ss.android.ugc.aweme.feed.p2936ab;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.feed.ab.BottomGradualOptimizeConfig */
public final class BottomGradualOptimizeConfig {
    @AbstractC27891c(mo46611a = "groupId")
    private final int groupId;
    @AbstractC27891c(mo46611a = "opacity")
    private final float opacity;

    static {
        Covode.recordClassIndex(56747);
    }

    /* renamed from: com_ss_android_ugc_aweme_feed_ab_BottomGradualOptimizeConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m91031xc7e0f84a(int i) {
        return i;
    }

    public static /* synthetic */ BottomGradualOptimizeConfig copy$default(BottomGradualOptimizeConfig bottomGradualOptimizeConfig, int i, float f, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = bottomGradualOptimizeConfig.groupId;
        }
        if ((i2 & 2) != 0) {
            f = bottomGradualOptimizeConfig.opacity;
        }
        return bottomGradualOptimizeConfig.copy(i, f);
    }

    public final int component1() {
        return this.groupId;
    }

    public final float component2() {
        return this.opacity;
    }

    public final BottomGradualOptimizeConfig copy(int i, float f) {
        return new BottomGradualOptimizeConfig(i, f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomGradualOptimizeConfig)) {
            return false;
        }
        BottomGradualOptimizeConfig bottomGradualOptimizeConfig = (BottomGradualOptimizeConfig) obj;
        return this.groupId == bottomGradualOptimizeConfig.groupId && Float.compare(this.opacity, bottomGradualOptimizeConfig.opacity) == 0;
    }

    public final int hashCode() {
        return (m91031xc7e0f84a(this.groupId) * 31) + m91030xc7e0f84a(this.opacity);
    }

    public final String toString() {
        return "BottomGradualOptimizeConfig(groupId=" + this.groupId + ", opacity=" + this.opacity + ")";
    }

    public final int getGroupId() {
        return this.groupId;
    }

    public final float getOpacity() {
        return this.opacity;
    }

    /* renamed from: com_ss_android_ugc_aweme_feed_ab_BottomGradualOptimizeConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m91030xc7e0f84a(float f) {
        return Float.floatToIntBits(f);
    }

    public BottomGradualOptimizeConfig(int i, float f) {
        this.groupId = i;
        this.opacity = f;
    }
}
