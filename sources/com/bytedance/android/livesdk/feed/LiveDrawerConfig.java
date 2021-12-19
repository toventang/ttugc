package com.bytedance.android.livesdk.feed;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

public final class LiveDrawerConfig implements Serializable {
    @AbstractC27891c(mo46611a = "enable_drawer_cell_show_avatar")
    private final boolean drawerCellShowAvatar;
    @AbstractC27891c(mo46611a = "enable_drawer_cell_show_name")
    private final boolean drawerCellShowName;
    @AbstractC27891c(mo46611a = "enable_drawer_go_live_animation")
    private final boolean drawerGoLiveAnimation;
    @AbstractC27891c(mo46611a = "drawer_refresh_interval")
    private final long drawerRefreshInterval = 1;
    @AbstractC27891c(mo46611a = "enable_drawer_bottom_left_label")
    private final boolean enableDrawerBottomLeftLabel = true;
    @AbstractC27891c(mo46611a = "enable_drawer_repeat_jump")
    private final boolean enableDrawerRepeatJump = true;
    @AbstractC27891c(mo46611a = "enable_full_entrance")
    private final boolean enableFullEntrance = true;
    @AbstractC27891c(mo46611a = "enable_guide_animation")
    private final boolean enableGuideAnimation = true;
    @AbstractC27891c(mo46611a = "enable_return_btn")
    private final boolean enableReturnBtn = true;
    @AbstractC27891c(mo46611a = "guide_animation_show_time")
    private final int guideAnimationShowTime = 20;
    @AbstractC27891c(mo46611a = "guide_animation_total_count")
    private final int guideAnimationTotalCount = 5;
    @AbstractC27891c(mo46611a = "enable_open_drawer_return")
    private final boolean openDrawerReturn = true;

    static {
        Covode.recordClassIndex(9321);
    }

    public final boolean getDrawerCellShowAvatar() {
        return this.drawerCellShowAvatar;
    }

    public final boolean getDrawerCellShowName() {
        return this.drawerCellShowName;
    }

    public final long getDrawerRefreshInterval() {
        return this.drawerRefreshInterval;
    }

    public final boolean getEnableDrawerRepeatJump() {
        return this.enableDrawerRepeatJump;
    }

    public final boolean getEnableFullEntrance() {
        return this.enableFullEntrance;
    }

    public final int getGuideAnimationShowTime() {
        return this.guideAnimationShowTime;
    }

    public final int getGuideAnimationTotalCount() {
        return this.guideAnimationTotalCount;
    }

    public final boolean enableDrawerBottomLeftLabel() {
        if (!this.enableDrawerBottomLeftLabel || !this.enableFullEntrance) {
            return false;
        }
        return true;
    }

    public final boolean enableGoLiveAnimation() {
        if (!this.drawerGoLiveAnimation || !this.enableFullEntrance) {
            return false;
        }
        return true;
    }

    public final boolean enableGuideAnimation() {
        if (!this.enableGuideAnimation || !this.enableFullEntrance) {
            return false;
        }
        return true;
    }

    public final boolean enableReturnBtn() {
        if (!this.enableReturnBtn || !this.enableFullEntrance) {
            return false;
        }
        return true;
    }

    public final boolean openDrawerReturn() {
        if (!this.openDrawerReturn || !this.enableFullEntrance) {
            return false;
        }
        return true;
    }
}
