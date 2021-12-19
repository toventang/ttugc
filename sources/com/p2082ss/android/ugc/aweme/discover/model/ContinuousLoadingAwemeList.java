package com.p2082ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Extra;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.model.ContinuousLoadingAwemeList */
public final class ContinuousLoadingAwemeList implements IAwemeList<ContinuousLoadingAwemeList> {
    @AbstractC27891c(mo46611a = "items")
    public List<Aweme> awemeList;
    @AbstractC27891c(mo46611a = "cursor")
    public int cursor;
    @AbstractC27891c(mo46611a = "extra")
    public Extra extra;
    @AbstractC27891c(mo46611a = "has_more")
    public int hasMore;
    @AbstractC27891c(mo46611a = "log_pb")
    public LogPbBean logPb;
    @AbstractC27891c(mo46611a = "status_code")
    public int statusCode;

    static {
        Covode.recordClassIndex(50442);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.model.IAwemeList
    public final List<Aweme> getIAwemeList() {
        return this.awemeList;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.model.IAwemeList
    public final int getICursor() {
        return this.cursor;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.model.IAwemeList
    public final int getIHasMore() {
        return this.hasMore;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.model.IAwemeList
    public final int getIStatusCode() {
        return this.statusCode;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.model.IAwemeList
    public final void setICursor(int i) {
        this.cursor = i;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.model.IAwemeList
    public final void setIHasMore(int i) {
        this.hasMore = i;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.model.IAwemeList
    public final void setIStatusCode(int i) {
        this.statusCode = i;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.model.IAwemeList
    public final void setIAwemeList(List<Aweme> list) {
        C89219l.m154721d(list, "");
        this.awemeList = list;
    }

    public final void updateData(ContinuousLoadingAwemeList continuousLoadingAwemeList) {
        C89219l.m154721d(continuousLoadingAwemeList, "");
        this.hasMore &= continuousLoadingAwemeList.hasMore;
        this.cursor = continuousLoadingAwemeList.cursor;
        this.statusCode = continuousLoadingAwemeList.statusCode;
        this.extra = continuousLoadingAwemeList.extra;
        this.logPb = continuousLoadingAwemeList.logPb;
    }
}
