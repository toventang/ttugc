package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.ExposeSharer */
public final class ExposeSharer implements Serializable {
    @AbstractC27891c(mo46611a = "avatar")
    private UrlModel avatar;
    @AbstractC27891c(mo46611a = "follow_status")
    private int followStatus;
    @AbstractC27891c(mo46611a = "follower_status")
    private int followerStatus;
    @AbstractC27891c(mo46611a = "is_private_account")
    private int isPrivateAccount;
    private boolean isShowed;
    @AbstractC27891c(mo46611a = "nickname")
    private String nickname;
    @AbstractC27891c(mo46611a = "sec_uid")
    private String secUid;
    @AbstractC27891c(mo46611a = "uid")
    private String uid;

    static {
        Covode.recordClassIndex(58681);
    }

    public final UrlModel getAvatar() {
        return this.avatar;
    }

    public final int getFollowStatus() {
        return this.followStatus;
    }

    public final int getFollowerStatus() {
        return this.followerStatus;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final String getSecUid() {
        return this.secUid;
    }

    public final String getUid() {
        return this.uid;
    }

    public final int isPrivateAccount() {
        return this.isPrivateAccount;
    }

    public final boolean isShowed() {
        return this.isShowed;
    }

    public final void setAvatar(UrlModel urlModel) {
        this.avatar = urlModel;
    }

    public final void setFollowStatus(int i) {
        this.followStatus = i;
    }

    public final void setFollowerStatus(int i) {
        this.followerStatus = i;
    }

    public final void setNickname(String str) {
        this.nickname = str;
    }

    public final void setPrivateAccount(int i) {
        this.isPrivateAccount = i;
    }

    public final void setSecUid(String str) {
        this.secUid = str;
    }

    public final void setShowed(boolean z) {
        this.isShowed = z;
    }

    public final void setUid(String str) {
        this.uid = str;
    }
}
