package com.p2082ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;

/* renamed from: com.ss.android.ugc.aweme.profile.model.FollowStatus */
public final class FollowStatus extends BaseResponse {
    @AbstractC27891c(mo46611a = "contact_name")
    public String contactName;
    public int followFrom;
    @AbstractC27891c(mo46611a = "follow_status")
    public int followStatus;
    public int followerStatus = -1;
    @AbstractC27891c(mo46611a = "is_enterprise")
    int isEnterprise;
    public boolean isFollowChange = true;
    public boolean isFollowSucess = true;
    public String secUserId;
    public String userId;
    @AbstractC27891c(mo46611a = "watch_status")
    public int watchStatus;

    static {
        Covode.recordClassIndex(75170);
    }

    public final boolean getIsEnterprise() {
        if (this.isEnterprise == 1) {
            return true;
        }
        return false;
    }

    public FollowStatus() {
    }

    public final boolean isCheating() {
        if (this.status_code == 2149) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "FollowStatus{watchStatus=" + this.watchStatus + ", followStatus=" + this.followStatus + ", userId='" + this.userId + '\'' + ", isFollowSucess=" + this.isFollowSucess + ", contactName=" + this.contactName + ", isEnterprise=" + this.isEnterprise + ", followFrom" + this.followFrom + '}';
    }

    public FollowStatus(String str, int i) {
        this.userId = str;
        this.followStatus = i;
    }

    public FollowStatus(String str, int i, int i2) {
        this.userId = str;
        this.followStatus = i;
        this.status_code = i2;
    }
}
