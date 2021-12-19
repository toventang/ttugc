package com.p2082ss.android.ugc.aweme.search.p3685c;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.search.c.c */
public final class C67359c implements Serializable {
    @AbstractC27891c(mo46611a = "caption_anchor")
    public C67357a captionAnchor;
    @AbstractC27891c(mo46611a = "caption_info")
    public C67358b captionInfo;
    @AbstractC27891c(mo46611a = "match_info")
    public List<C67360d> matchInfoList;
    @AbstractC27891c(mo46611a = "query_limit")
    public int queryLimit;
    @AbstractC27891c(mo46611a = "total_limit")
    public int totalLimit;

    static {
        Covode.recordClassIndex(78989);
    }

    public final C67357a getCaptionAnchor() {
        return this.captionAnchor;
    }

    public final C67358b getCaptionInfo() {
        return this.captionInfo;
    }

    public final List<C67360d> getMatchInfoList() {
        return this.matchInfoList;
    }

    public final int getQueryLimit() {
        return this.queryLimit;
    }

    public final int getTotalLimit() {
        return this.totalLimit;
    }

    public final void setCaptionAnchor(C67357a aVar) {
        this.captionAnchor = aVar;
    }

    public final void setCaptionInfo(C67358b bVar) {
        this.captionInfo = bVar;
    }

    public final void setMatchInfoList(List<C67360d> list) {
        this.matchInfoList = list;
    }

    public final void setQueryLimit(int i) {
        this.queryLimit = i;
    }

    public final void setTotalLimit(int i) {
        this.totalLimit = i;
    }
}
