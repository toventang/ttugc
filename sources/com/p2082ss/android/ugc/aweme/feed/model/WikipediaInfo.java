package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.model.WikipediaInfo */
public final class WikipediaInfo implements Serializable {
    public String anchorId = "";
    public WikipediaExtra extra;
    @AbstractC27891c(mo46611a = "keyword")
    public String keyword;
    @AbstractC27891c(mo46611a = "lang")
    public String lang;

    static {
        Covode.recordClassIndex(58779);
    }

    public final String getAnchorId() {
        return this.anchorId;
    }

    public final WikipediaExtra getExtra() {
        return this.extra;
    }

    public final String getKeyword() {
        return this.keyword;
    }

    public final String getLang() {
        return this.lang;
    }

    public final int hashCode() {
        String str = this.keyword;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final void setAnchorId(String str) {
        this.anchorId = str;
    }

    public final void setExtra(WikipediaExtra wikipediaExtra) {
        this.extra = wikipediaExtra;
    }

    public final void setKeyword(String str) {
        this.keyword = str;
    }

    public final void setLang(String str) {
        this.lang = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof WikipediaInfo) {
            WikipediaInfo wikipediaInfo = (WikipediaInfo) obj;
            if (!C89219l.m154714a((Object) wikipediaInfo.keyword, (Object) this.keyword) || !C89219l.m154714a((Object) wikipediaInfo.lang, (Object) this.lang)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
