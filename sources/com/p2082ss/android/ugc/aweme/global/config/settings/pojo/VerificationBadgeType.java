package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.VerificationBadgeType */
public class VerificationBadgeType {
    @AbstractC27891c(mo46611a = "action_type")
    private Integer actionType = 1;
    @AbstractC27891c(mo46611a = "badge_type")
    private Integer badgeType = 1;
    @AbstractC27891c(mo46611a = "link")
    private String link = "";

    static {
        Covode.recordClassIndex(62425);
    }

    public Integer getActionType() {
        return this.actionType;
    }

    public Integer getBadgeType() {
        return this.badgeType;
    }

    public String getLink() {
        return this.link;
    }
}
