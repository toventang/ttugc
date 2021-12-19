package com.p2082ss.android.ugc.aweme.shortvideo.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.MvModel */
public final class MvModel implements Serializable {
    @AbstractC27891c(mo46611a = "desc")
    private String desc;
    @AbstractC27891c(mo46611a = "extra")
    private String extra;
    @AbstractC27891c(mo46611a = "icon_url")
    private UrlModel iconUrl;
    @AbstractC27891c(mo46611a = "is_collected")
    private boolean isCollected;
    @AbstractC27891c(mo46611a = "id")
    private String mvId;
    @AbstractC27891c(mo46611a = StringSet.name)
    private String name;
    @AbstractC27891c(mo46611a = "user_count")
    private Long userCount;

    static {
        Covode.recordClassIndex(84604);
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final UrlModel getIconUrl() {
        return this.iconUrl;
    }

    public final String getMvId() {
        return this.mvId;
    }

    public final String getName() {
        return this.name;
    }

    public final Long getUserCount() {
        return this.userCount;
    }

    public final boolean isCollected() {
        return this.isCollected;
    }

    public final void setCollected(boolean z) {
        this.isCollected = z;
    }

    public final void setDesc(String str) {
        this.desc = str;
    }

    public final void setExtra(String str) {
        this.extra = str;
    }

    public final void setIconUrl(UrlModel urlModel) {
        this.iconUrl = urlModel;
    }

    public final void setMvId(String str) {
        this.mvId = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setUserCount(Long l) {
        this.userCount = l;
    }
}
