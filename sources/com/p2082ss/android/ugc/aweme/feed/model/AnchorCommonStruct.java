package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27889a;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;
import p4600h.p4601a.C89086z;

/* renamed from: com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct */
public final class AnchorCommonStruct implements Serializable {
    @AbstractC27891c(mo46611a = "actions")
    public List<AnchorPanelAction> actions = C89086z.INSTANCE;
    @AbstractC27891c(mo46611a = "deep_link")
    public String deepLink = "";
    @AbstractC27891c(mo46611a = "description")
    public String description = "";
    @AbstractC27891c(mo46611a = "extra")
    public String extra = "";
    @AbstractC27891c(mo46611a = "general_type")
    public int generalType;
    @AbstractC27891c(mo46611a = "icon")
    public UrlModel icon;
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: id */
    public String f114473id = "";
    @AbstractC27891c(mo46611a = "keyword")
    public String keyword;
    @AbstractC27891c(mo46611a = "language")
    public String language = "";
    @AbstractC27891c(mo46611a = "log_extra")
    public String logExtra;
    @AbstractC27889a
    public UrlModel newStyleBubbleIcon;
    @AbstractC27891c(mo46611a = "real_count")
    public int realCount;
    @AbstractC27891c(mo46611a = "schema")
    public String schema = "";
    @AbstractC27891c(mo46611a = "show_type")
    public int showType = 1;
    @AbstractC27891c(mo46611a = "thumbnail")
    public UrlModel thumbnail;
    @AbstractC27891c(mo46611a = StringSet.type)
    public int type;
    @AbstractC27891c(mo46611a = "universal_link")
    public String universalLink = "";
    @AbstractC27891c(mo46611a = "url")
    public String url;

    static {
        Covode.recordClassIndex(58601);
    }

    public final List<AnchorPanelAction> getActions() {
        return this.actions;
    }

    public final String getDeepLink() {
        return this.deepLink;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final int getGeneralType() {
        return this.generalType;
    }

    public final UrlModel getIcon() {
        return this.icon;
    }

    public final String getId() {
        return this.f114473id;
    }

    public final String getKeyword() {
        return this.keyword;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getLogExtra() {
        return this.logExtra;
    }

    public final UrlModel getNewStyleBubbleIcon() {
        return this.newStyleBubbleIcon;
    }

    public final int getRealCount() {
        return this.realCount;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final int getShowType() {
        return this.showType;
    }

    public final UrlModel getThumbnail() {
        return this.thumbnail;
    }

    public final int getType() {
        return this.type;
    }

    public final String getUniversalLink() {
        return this.universalLink;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setKeyword(String str) {
        this.keyword = str;
    }

    public final void setNewStyleBubbleIcon(UrlModel urlModel) {
        this.newStyleBubbleIcon = urlModel;
    }

    public final void setUrl(String str) {
        this.url = str;
    }
}
