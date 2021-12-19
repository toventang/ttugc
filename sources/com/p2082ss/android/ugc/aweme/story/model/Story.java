package com.p2082ss.android.ugc.aweme.story.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.story.model.Story */
public class Story implements Cloneable {
    List<Aweme> awemes;
    @AbstractC27891c(mo46611a = "skylight_display_tag")
    public String skyLightDisplayTag;
    @AbstractC27891c(mo46611a = "status")
    int status;
    @AbstractC27891c(mo46611a = StringSet.type)
    public int type;
    @AbstractC27891c(mo46611a = "update_time")
    long updateTime;
    @AbstractC27891c(mo46611a = "user_info")
    User userInfo;

    static {
        Covode.recordClassIndex(90407);
    }

    public void setRead() {
        this.status = 1;
    }

    public List<Aweme> getAwemes() {
        return this.awemes;
    }

    public int getStatus() {
        return this.status;
    }

    public long getUpdateTime() {
        return this.updateTime;
    }

    public User getUserInfo() {
        return this.userInfo;
    }

    public boolean isRead() {
        if (this.status == 1) {
            return true;
        }
        return false;
    }

    public boolean isStory() {
        if (this.type == 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Object
    public Story clone() {
        try {
            return (Story) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getLiveUid() {
        User user = this.userInfo;
        if (user == null) {
            return "";
        }
        return user.getLiveUid();
    }

    public boolean isFollowing() {
        if (this.type == 2) {
            return true;
        }
        return false;
    }

    public boolean isLive() {
        int i = this.type;
        if (i == 1 || i == 5 || i == 6) {
            return true;
        }
        return false;
    }

    public boolean isNewLiveType() {
        int i = this.type;
        if (i == 5 || i == 6) {
            return true;
        }
        return false;
    }

    public String getUid() {
        if (getUserInfo() == null) {
            return null;
        }
        return getUserInfo().getUid();
    }

    public String toString() {
        return "Story{status=" + this.status + ", userInfo=" + this.userInfo + '}';
    }

    public void setAwemes(List<Aweme> list) {
        this.awemes = list;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setUpdateTime(long j) {
        this.updateTime = j;
    }

    public void setUserInfo(User user) {
        this.userInfo = user;
    }
}
