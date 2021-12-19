package com.p2082ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.HomePageBottomToast */
public final class HomePageBottomToast implements Serializable {
    @AbstractC27891c(mo46611a = "group_id")
    private Integer groupId;
    @AbstractC27891c(mo46611a = "icon_url")
    private UrlModel iconUrl;
    @AbstractC27891c(mo46611a = "interval")
    private Long interval;
    @AbstractC27891c(mo46611a = "jump_url")
    private String jumpUrl;
    @AbstractC27891c(mo46611a = "jump_url_title")
    private String jumpUrlTitle;
    @AbstractC27891c(mo46611a = "limit")
    private Integer limit;
    @AbstractC27891c(mo46611a = "toast")
    private String toast;
    @AbstractC27891c(mo46611a = "toast_type")
    private Integer toastType;
    @AbstractC27891c(mo46611a = "type_limit")
    private Integer typeLimit;

    static {
        Covode.recordClassIndex(75176);
    }

    public final Integer getGroupId() {
        return this.groupId;
    }

    public final UrlModel getIconUrl() {
        return this.iconUrl;
    }

    public final Long getInterval() {
        return this.interval;
    }

    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    public final String getJumpUrlTitle() {
        return this.jumpUrlTitle;
    }

    public final Integer getLimit() {
        return this.limit;
    }

    public final String getToast() {
        return this.toast;
    }

    public final Integer getToastType() {
        return this.toastType;
    }

    public final Integer getTypeLimit() {
        return this.typeLimit;
    }

    public final void setGroupId(Integer num) {
        this.groupId = num;
    }

    public final void setIconUrl(UrlModel urlModel) {
        this.iconUrl = urlModel;
    }

    public final void setInterval(Long l) {
        this.interval = l;
    }

    public final void setJumpUrl(String str) {
        this.jumpUrl = str;
    }

    public final void setJumpUrlTitle(String str) {
        this.jumpUrlTitle = str;
    }

    public final void setLimit(Integer num) {
        this.limit = num;
    }

    public final void setToast(String str) {
        this.toast = str;
    }

    public final void setToastType(Integer num) {
        this.toastType = num;
    }

    public final void setTypeLimit(Integer num) {
        this.typeLimit = num;
    }
}
