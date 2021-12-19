package com.p2082ss.android.ugc.aweme.forward.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Extra;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.forward.model.ForwardItemList */
public class ForwardItemList {
    @AbstractC27891c(mo46611a = "error_code")
    public int error_code;
    @AbstractC27891c(mo46611a = "extra")
    Extra extra;
    @AbstractC27891c(mo46611a = "has_more")
    int hasMore;
    @AbstractC27891c(mo46611a = "forward_list")
    List<Aweme> items;
    @AbstractC27891c(mo46611a = "log_pb")
    private LogPbBean logPb;
    @AbstractC27891c(mo46611a = "max_cursor", mo46612b = {"max_time"})
    long maxCursor;
    @AbstractC27891c(mo46611a = "min_cursor", mo46612b = {"min_time"})
    long minCursor;
    @AbstractC27891c(mo46611a = "status_code")
    public int status_code;
    @AbstractC27891c(mo46611a = "status_msg")
    public String status_msg;

    static {
        Covode.recordClassIndex(60632);
    }

    public int getError_code() {
        return this.error_code;
    }

    public Extra getExtra() {
        return this.extra;
    }

    public int getHasMore() {
        return this.hasMore;
    }

    public List<Aweme> getItems() {
        return this.items;
    }

    public LogPbBean getLogPb() {
        return this.logPb;
    }

    public long getMaxCursor() {
        return this.maxCursor;
    }

    public long getMinCursor() {
        return this.minCursor;
    }

    public int getStatus_code() {
        return this.status_code;
    }

    public String getStatus_msg() {
        return this.status_msg;
    }

    public void setError_code(int i) {
        this.error_code = i;
    }

    public void setExtra(Extra extra2) {
        this.extra = extra2;
    }

    public void setHasMore(int i) {
        this.hasMore = i;
    }

    public void setItems(List<Aweme> list) {
        this.items = list;
    }

    public void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public void setMaxCursor(long j) {
        this.maxCursor = j;
    }

    public void setMinCursor(long j) {
        this.minCursor = j;
    }

    public void setStatus_code(int i) {
        this.status_code = i;
    }

    public void setStatus_msg(String str) {
        this.status_msg = str;
    }
}
