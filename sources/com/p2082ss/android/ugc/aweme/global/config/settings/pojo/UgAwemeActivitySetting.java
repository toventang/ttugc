package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting */
public class UgAwemeActivitySetting {
    @AbstractC27891c(mo46611a = "activity_end_time")
    private Long activityEndTime;
    @AbstractC27891c(mo46611a = "activity_id")
    private String activityId;
    @AbstractC27891c(mo46611a = "activity_start_time")
    private Long activityStartTime;
    @AbstractC27891c(mo46611a = "activity_tasks")
    private List<UgActivityTasks> activityTasks = new ArrayList();
    @AbstractC27891c(mo46611a = "channel_popup")
    private UgChannelPopup channelPopup;
    @AbstractC27891c(mo46611a = "is_new_user")
    private Boolean isNewUser;
    @AbstractC27891c(mo46611a = "login_banner")
    private UgLoginBanner loginBanner;
    @AbstractC27891c(mo46611a = "new_feed_pendant")
    private UgNewFeedPendant newFeedPendant;
    @AbstractC27891c(mo46611a = "overall_switch")
    private Boolean overallSwitch;
    @AbstractC27891c(mo46611a = "pendant_version")
    private Integer pendantVersion;
    @AbstractC27891c(mo46611a = "profile_activity_button")
    private UgProfileActivityButton profileActivityButton;
    @AbstractC27891c(mo46611a = "profile_activity_icon")
    private UgProfileActivityIcon profileActivityIcon;
    @AbstractC27891c(mo46611a = "profile_tab_guide")
    private UgProfileTabGuide profileTabGuide;
    @AbstractC27891c(mo46611a = "shortcut_info")
    private UgShortcutInfo shortcutInfo;
    @AbstractC27891c(mo46611a = "feed_bottom_notice_bar")
    private UgFeedBottomNoticeBar ugFeedBottomNoticeBar;

    static {
        Covode.recordClassIndex(62404);
    }

    public List<UgActivityTasks> getActivityTasks() {
        return this.activityTasks;
    }

    public UgFeedBottomNoticeBar getUgFeedBottomNoticeBar() {
        return this.ugFeedBottomNoticeBar;
    }

    public Long getActivityEndTime() {
        Long l = this.activityEndTime;
        if (l != null) {
            return l;
        }
        throw new C16041a();
    }

    public String getActivityId() {
        String str = this.activityId;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public Long getActivityStartTime() {
        Long l = this.activityStartTime;
        if (l != null) {
            return l;
        }
        throw new C16041a();
    }

    public UgChannelPopup getChannelPopup() {
        UgChannelPopup ugChannelPopup = this.channelPopup;
        if (ugChannelPopup != null) {
            return ugChannelPopup;
        }
        throw new C16041a();
    }

    public Boolean getIsNewUser() {
        Boolean bool = this.isNewUser;
        if (bool != null) {
            return bool;
        }
        throw new C16041a();
    }

    public UgLoginBanner getLoginBanner() {
        UgLoginBanner ugLoginBanner = this.loginBanner;
        if (ugLoginBanner != null) {
            return ugLoginBanner;
        }
        throw new C16041a();
    }

    public UgNewFeedPendant getNewFeedPendant() {
        UgNewFeedPendant ugNewFeedPendant = this.newFeedPendant;
        if (ugNewFeedPendant != null) {
            return ugNewFeedPendant;
        }
        throw new C16041a();
    }

    public Boolean getOverallSwitch() {
        Boolean bool = this.overallSwitch;
        if (bool != null) {
            return bool;
        }
        throw new C16041a();
    }

    public Integer getPendantVersion() {
        Integer num = this.pendantVersion;
        if (num != null) {
            return num;
        }
        throw new C16041a();
    }

    public UgProfileActivityButton getProfileActivityButton() {
        UgProfileActivityButton ugProfileActivityButton = this.profileActivityButton;
        if (ugProfileActivityButton != null) {
            return ugProfileActivityButton;
        }
        throw new C16041a();
    }

    public UgProfileActivityIcon getProfileActivityIcon() {
        UgProfileActivityIcon ugProfileActivityIcon = this.profileActivityIcon;
        if (ugProfileActivityIcon != null) {
            return ugProfileActivityIcon;
        }
        throw new C16041a();
    }

    public UgProfileTabGuide getProfileTabGuide() {
        UgProfileTabGuide ugProfileTabGuide = this.profileTabGuide;
        if (ugProfileTabGuide != null) {
            return ugProfileTabGuide;
        }
        throw new C16041a();
    }

    public UgShortcutInfo getShortcutInfo() {
        UgShortcutInfo ugShortcutInfo = this.shortcutInfo;
        if (ugShortcutInfo != null) {
            return ugShortcutInfo;
        }
        throw new C16041a();
    }

    public void setUgFeedBottomNoticeBar(UgFeedBottomNoticeBar ugFeedBottomNoticeBar2) {
        this.ugFeedBottomNoticeBar = ugFeedBottomNoticeBar2;
    }
}
