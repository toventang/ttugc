package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.android.ugc.aweme.feed.model.PlayListInfo */
public final class PlayListInfo implements Serializable {
    public static final Companion Companion = new Companion(null);
    @AbstractC27891c(mo46611a = "create_time")
    public Long createTime = 0L;
    @AbstractC27891c(mo46611a = "icon")
    public UrlModel icon;
    @AbstractC27891c(mo46611a = "index")
    public Integer index = 0;
    @AbstractC27891c(mo46611a = "item_total")
    public Long itemTotal = 0L;
    @AbstractC27891c(mo46611a = "mix_id")
    public String mixId;
    @AbstractC27891c(mo46611a = StringSet.name)
    public String mixName;
    @AbstractC27891c(mo46611a = "mix_src")
    public Integer mixSrc = 0;
    @AbstractC27891c(mo46611a = "show_rename_tooltip")
    public Boolean showRenameTooltip = false;
    @AbstractC27891c(mo46611a = "update_time")
    public Long updateTime = 0L;

    static {
        Covode.recordClassIndex(58744);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.model.PlayListInfo$Companion */
    public static final class Companion {
        static {
            Covode.recordClassIndex(58745);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C89214g gVar) {
            this();
        }
    }

    public final Long getCreateTime() {
        return this.createTime;
    }

    public final UrlModel getIcon() {
        return this.icon;
    }

    public final Integer getIndex() {
        return this.index;
    }

    public final Long getItemTotal() {
        return this.itemTotal;
    }

    public final String getMixId() {
        return this.mixId;
    }

    public final String getMixName() {
        return this.mixName;
    }

    public final Integer getMixSrc() {
        return this.mixSrc;
    }

    public final Boolean getShowRenameTooltip() {
        return this.showRenameTooltip;
    }

    public final Long getUpdateTime() {
        return this.updateTime;
    }

    public final void setCreateTime(Long l) {
        this.createTime = l;
    }

    public final void setIcon(UrlModel urlModel) {
        this.icon = urlModel;
    }

    public final void setIndex(Integer num) {
        this.index = num;
    }

    public final void setItemTotal(Long l) {
        this.itemTotal = l;
    }

    public final void setMixId(String str) {
        this.mixId = str;
    }

    public final void setMixName(String str) {
        this.mixName = str;
    }

    public final void setMixSrc(Integer num) {
        this.mixSrc = num;
    }

    public final void setShowRenameTooltip(Boolean bool) {
        this.showRenameTooltip = bool;
    }

    public final void setUpdateTime(Long l) {
        this.updateTime = l;
    }
}
