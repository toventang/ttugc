package com.p2082ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.discover.model.GuideSearchWord */
public final class GuideSearchWord implements Serializable {
    @AbstractC27891c(mo46611a = "display_query")
    private String displayQuery;
    @AbstractC27891c(mo46611a = "gs_query")
    private String gsQuery;
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: id */
    private String f99015id;
    @AbstractC27891c(mo46611a = "query_id")
    private String queryId;
    private boolean selected;
    @AbstractC27891c(mo46611a = StringSet.type)
    private String type;

    static {
        Covode.recordClassIndex(50455);
    }

    public final String getDisplayQuery() {
        return this.displayQuery;
    }

    public final String getGsQuery() {
        return this.gsQuery;
    }

    public final String getId() {
        return this.f99015id;
    }

    public final String getQueryId() {
        return this.queryId;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final String getType() {
        return this.type;
    }

    public final void setDisplayQuery(String str) {
        this.displayQuery = str;
    }

    public final void setGsQuery(String str) {
        this.gsQuery = str;
    }

    public final void setId(String str) {
        this.f99015id = str;
    }

    public final void setQueryId(String str) {
        this.queryId = str;
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }

    public final void setType(String str) {
        this.type = str;
    }
}
