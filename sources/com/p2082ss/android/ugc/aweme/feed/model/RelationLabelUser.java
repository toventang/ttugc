package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.RelationLabelUser */
public final class RelationLabelUser implements Serializable {
    @AbstractC27891c(mo46611a = "avatar")
    public UrlModel avatarLarger;
    @AbstractC27891c(mo46611a = "avatar_thumb")
    public UrlModel avatarThumb;
    @AbstractC27891c(mo46611a = "follow_status")
    public int followStatus;
    @AbstractC27891c(mo46611a = "nickname")
    public String nickName = "";
    @AbstractC27891c(mo46611a = "remark_name")
    public String remarkName = "";
    @AbstractC27891c(mo46611a = "sec_uid")
    public String secUid = "";
    @AbstractC27891c(mo46611a = "uid")
    public long uid;

    static {
        Covode.recordClassIndex(58753);
    }

    public final UrlModel getAvatarLarger() {
        return this.avatarLarger;
    }

    public final UrlModel getAvatarThumb() {
        return this.avatarThumb;
    }

    public final int getFollowStatus() {
        return this.followStatus;
    }

    public final String getNickName() {
        return this.nickName;
    }

    public final String getRemarkName() {
        return this.remarkName;
    }

    public final String getSecUid() {
        return this.secUid;
    }

    public final long getUid() {
        return this.uid;
    }

    public final void setAvatarLarger(UrlModel urlModel) {
        this.avatarLarger = urlModel;
    }

    public final void setAvatarThumb(UrlModel urlModel) {
        this.avatarThumb = urlModel;
    }

    public final void setFollowStatus(int i) {
        this.followStatus = i;
    }

    public final void setNickName(String str) {
        this.nickName = str;
    }

    public final void setRemarkName(String str) {
        this.remarkName = str;
    }

    public final void setSecUid(String str) {
        this.secUid = str;
    }

    public final void setUid(long j) {
        this.uid = j;
    }
}
