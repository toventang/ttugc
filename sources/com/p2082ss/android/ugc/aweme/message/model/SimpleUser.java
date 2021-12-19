package com.p2082ss.android.ugc.aweme.message.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.discover.hitrank.C42063a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.message.model.SimpleUser */
public class SimpleUser implements Serializable {
    static final long serialVersionUID = 42;
    @AbstractC27891c(mo46611a = "avatar_thumb")
    UrlModel avatarThumb;
    @AbstractC27891c(mo46611a = "follow_status")
    int followStatus;
    @AbstractC27891c(mo46611a = "nickname")
    String nickName;
    @AbstractC27891c(mo46611a = "signature")
    String signature;
    @AbstractC27891c(mo46611a = "hit_task_info")
    C42063a taskInfo;
    private int type;
    @AbstractC27891c(mo46611a = "uid")
    String uid;

    static {
        Covode.recordClassIndex(69563);
    }

    public SimpleUser() {
    }

    public UrlModel getAvatarThumb() {
        return this.avatarThumb;
    }

    public int getFollowStatus() {
        return this.followStatus;
    }

    public String getNickName() {
        return this.nickName;
    }

    public String getSignature() {
        return this.signature;
    }

    public C42063a getTaskInfo() {
        return this.taskInfo;
    }

    public int getType() {
        return this.type;
    }

    public String getUid() {
        return this.uid;
    }

    public int hashCode() {
        if (getUid() != null) {
            return getUid().hashCode();
        }
        return 0;
    }

    public String toString() {
        return "SimpleUser{uid='" + this.uid + '\'' + ", nickName='" + this.nickName + '\'' + ", signature='" + this.signature + '\'' + ", avatarThumb=" + this.avatarThumb + '}';
    }

    public void setAvatarThumb(UrlModel urlModel) {
        this.avatarThumb = urlModel;
    }

    public void setFollowStatus(int i) {
        this.followStatus = i;
    }

    public void setNickName(String str) {
        this.nickName = str;
    }

    public void setSignature(String str) {
        this.signature = str;
    }

    public SimpleUser setTaskInfo(C42063a aVar) {
        this.taskInfo = aVar;
        return this;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setUid(String str) {
        this.uid = str;
    }

    public void setFollowStatus(Integer num) {
        this.followStatus = num.intValue();
    }

    public static SimpleUser fromUser(User user) {
        SimpleUser simpleUser = new SimpleUser();
        simpleUser.setNickName(user.getNickname());
        simpleUser.setAvatarThumb(user.getAvatarThumb());
        simpleUser.setSignature(user.getSignature());
        simpleUser.setUid(user.getUid());
        simpleUser.setFollowStatus(user.getFollowStatus());
        return simpleUser;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimpleUser)) {
            return false;
        }
        SimpleUser simpleUser = (SimpleUser) obj;
        if (getUid() != null) {
            return getUid().equals(simpleUser.getUid());
        }
        if (simpleUser.getUid() == null) {
            return true;
        }
        return false;
    }

    public SimpleUser(String str, String str2, String str3, UrlModel urlModel, int i) {
        this.uid = str;
        this.nickName = str2;
        this.signature = str3;
        this.avatarThumb = urlModel;
        this.followStatus = i;
    }
}
