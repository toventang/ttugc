package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.AnchorShopLinkStruct */
public final class AnchorShopLinkStruct implements Serializable {
    @AbstractC27891c(mo46611a = "keyword")
    public String keyword;
    @AbstractC27891c(mo46611a = "url")
    public String url;

    static {
        Covode.recordClassIndex(58608);
    }

    public final String getKeyword() {
        return this.keyword;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setKeyword(String str) {
        this.keyword = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }
}
