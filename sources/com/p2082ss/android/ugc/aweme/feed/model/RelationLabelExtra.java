package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.RelationLabelExtra */
public final class RelationLabelExtra implements Serializable {
    @AbstractC27891c(mo46611a = "after_text")
    private String afterText = "";
    @AbstractC27891c(mo46611a = "comment_id")
    private String cid = "";
    @AbstractC27891c(mo46611a = "tab_text")
    private String tabText = "";

    static {
        Covode.recordClassIndex(58750);
    }

    public final String getAfterText() {
        return this.afterText;
    }

    public final String getCid() {
        return this.cid;
    }

    public final String getTabText() {
        return this.tabText;
    }

    public final void setAfterText(String str) {
        this.afterText = str;
    }

    public final void setCid(String str) {
        this.cid = str;
    }

    public final void setTabText(String str) {
        this.tabText = str;
    }
}
