package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.NewFaceSticker */
public final class NewFaceSticker implements Serializable {
    @AbstractC27891c(mo46611a = "desc")
    private String desc;
    @AbstractC27891c(mo46611a = "effect_id")
    private String effectId;
    @AbstractC27891c(mo46611a = "icon_url")
    private UrlModel iconUrl;
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: id */
    private String f114480id;
    @AbstractC27891c(mo46611a = "log_pb")
    private LogPbBean logPb;
    @AbstractC27891c(mo46611a = StringSet.name)
    private String name;
    @AbstractC27891c(mo46611a = "owner_id")
    private String ownerId;
    @AbstractC27891c(mo46611a = "owner_nickname")
    private String ownerNickName;
    @AbstractC27891c(mo46611a = "user_count")
    private int userCount;

    static {
        Covode.recordClassIndex(58737);
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getEffectId() {
        return this.effectId;
    }

    public final UrlModel getIconUrl() {
        return this.iconUrl;
    }

    public final String getId() {
        return this.f114480id;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOwnerId() {
        return this.ownerId;
    }

    public final String getOwnerNickName() {
        return this.ownerNickName;
    }

    public final int getUserCount() {
        return this.userCount;
    }

    public final void setDesc(String str) {
        this.desc = str;
    }

    public final void setEffectId(String str) {
        this.effectId = str;
    }

    public final void setIconUrl(UrlModel urlModel) {
        this.iconUrl = urlModel;
    }

    public final void setId(String str) {
        this.f114480id = str;
    }

    public final void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setOwnerId(String str) {
        this.ownerId = str;
    }

    public final void setOwnerNickName(String str) {
        this.ownerNickName = str;
    }

    public final void setUserCount(int i) {
        this.userCount = i;
    }
}
