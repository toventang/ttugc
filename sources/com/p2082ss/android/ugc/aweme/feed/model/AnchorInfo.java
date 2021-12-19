package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.android.ugc.aweme.feed.model.AnchorInfo */
public final class AnchorInfo implements Serializable {
    public static final Companion Companion = new Companion(null);
    @AbstractC27891c(mo46611a = "extra")
    public String extra;
    @AbstractC27891c(mo46611a = "icon")
    public UrlModel icon;
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: id */
    public String f114474id;
    @AbstractC27891c(mo46611a = "log_extra")
    public String logExtra;
    @AbstractC27891c(mo46611a = "mp_url")
    public String mpUrl;
    @AbstractC27891c(mo46611a = "open_url")
    public String openUrl;
    @AbstractC27891c(mo46611a = "title")
    public String title;
    @AbstractC27891c(mo46611a = StringSet.type)
    public Integer type = -1;
    @AbstractC27891c(mo46611a = "web_url")
    public String webUrl;

    static {
        Covode.recordClassIndex(58603);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.model.AnchorInfo$Companion */
    public static final class Companion {
        static {
            Covode.recordClassIndex(58604);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C89214g gVar) {
            this();
        }
    }

    public final String getExtra() {
        return this.extra;
    }

    public final UrlModel getIcon() {
        return this.icon;
    }

    public final String getId() {
        return this.f114474id;
    }

    public final String getLogExtra() {
        return this.logExtra;
    }

    public final String getMpUrl() {
        return this.mpUrl;
    }

    public final String getOpenUrl() {
        return this.openUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Integer getType() {
        return this.type;
    }

    public final String getWebUrl() {
        return this.webUrl;
    }

    public final void setExtra(String str) {
        this.extra = str;
    }

    public final void setIcon(UrlModel urlModel) {
        this.icon = urlModel;
    }

    public final void setId(String str) {
        this.f114474id = str;
    }

    public final void setLogExtra(String str) {
        this.logExtra = str;
    }

    public final void setMpUrl(String str) {
        this.mpUrl = str;
    }

    public final void setOpenUrl(String str) {
        this.openUrl = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setType(Integer num) {
        this.type = num;
    }

    public final void setWebUrl(String str) {
        this.webUrl = str;
    }
}
