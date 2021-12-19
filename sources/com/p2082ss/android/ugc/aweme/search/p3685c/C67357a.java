package com.p2082ss.android.ugc.aweme.search.p3685c;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.search.c.a */
public final class C67357a implements Serializable {
    @AbstractC27891c(mo46611a = "icon")
    public UrlModel icon;
    @AbstractC27891c(mo46611a = "keyword")
    public String keyword = "";
    @AbstractC27891c(mo46611a = "link")
    public String link = "";

    static {
        Covode.recordClassIndex(78987);
    }

    public final UrlModel getIcon() {
        return this.icon;
    }

    public final String getKeyword() {
        return this.keyword;
    }

    public final String getLink() {
        return this.link;
    }

    public final void setIcon(UrlModel urlModel) {
        this.icon = urlModel;
    }

    public final void setKeyword(String str) {
        this.keyword = str;
    }

    public final void setLink(String str) {
        this.link = str;
    }
}
