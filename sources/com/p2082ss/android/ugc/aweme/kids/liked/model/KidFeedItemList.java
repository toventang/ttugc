package com.p2082ss.android.ugc.aweme.kids.liked.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.kids.liked.model.KidFeedItemList */
public class KidFeedItemList {
    @AbstractC27891c(mo46611a = "has_more")
    private int hasMore;
    @AbstractC27891c(mo46611a = "aweme_list")
    private List<? extends Aweme> items;
    @AbstractC27891c(mo46611a = "log_pb")
    private LogPbBean logPb;
    @AbstractC27891c(mo46611a = "max_cursor", mo46612b = {"max_time"})
    private long maxCursor;
    @AbstractC27891c(mo46611a = "min_cursor", mo46612b = {"min_time"})
    private long minCursor;
    @AbstractC27891c(mo46611a = "rid")
    private String requestId;
    @AbstractC27891c(mo46611a = "status_code")
    private int status_code;

    static {
        Covode.recordClassIndex(67721);
    }

    public final int getHasMore() {
        return this.hasMore;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme>, java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> */
    public final List<Aweme> getItems() {
        return this.items;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final long getMaxCursor() {
        return this.maxCursor;
    }

    public final long getMinCursor() {
        return this.minCursor;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final int getStatus_code() {
        return this.status_code;
    }

    public final void setHasMore(int i) {
        this.hasMore = i;
    }

    public final void setItems(List<? extends Aweme> list) {
        this.items = list;
    }

    public final void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public final void setMaxCursor(long j) {
        this.maxCursor = j;
    }

    public final void setMinCursor(long j) {
        this.minCursor = j;
    }

    public final void setRequestId(String str) {
        this.requestId = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }
}
