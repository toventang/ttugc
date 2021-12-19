package com.p2082ss.android.ugc.aweme.kids.recommendfeed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.app.api.AbstractC33623d;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.kids.recommendfeed.model.KFeedItemList */
public class KFeedItemList implements AbstractC33623d {
    @AbstractC27891c(mo46611a = "block_code")
    public int blockCode;
    @AbstractC27891c(mo46611a = "has_more")
    public int hasMore;
    @AbstractC27891c(mo46611a = "aweme_list")
    public List<Aweme> items;
    @AbstractC27891c(mo46611a = "log_pb")
    public LogPbBean logPb;
    @AbstractC27891c(mo46611a = "max_cursor", mo46612b = {"max_time"})
    public long maxCursor;
    @AbstractC27891c(mo46611a = "min_cursor", mo46612b = {"min_time"})
    public long minCursor;
    @AbstractC27891c(mo46611a = "refresh_clear")
    public int refreshClear;
    @AbstractC27891c(mo46611a = "rid")
    public String requestId;
    @AbstractC27891c(mo46611a = "status_code")
    public int statusCode;
    @AbstractC27891c(mo46611a = "status_msg")
    public String statusMsg;

    static {
        Covode.recordClassIndex(67786);
    }

    public int getBlockCode() {
        return this.blockCode;
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

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33623d
    public String getRequestId() {
        return this.requestId;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public String getStatusMsg() {
        return this.statusMsg;
    }

    public boolean isHasMore() {
        if (this.hasMore == 1) {
            return true;
        }
        return false;
    }

    public boolean isRefreshClear() {
        if (this.refreshClear == 1) {
            return true;
        }
        return false;
    }

    public KFeedItemList clone() {
        KFeedItemList kFeedItemList = new KFeedItemList();
        kFeedItemList.minCursor = this.minCursor;
        kFeedItemList.maxCursor = this.maxCursor;
        kFeedItemList.hasMore = this.hasMore;
        kFeedItemList.items = this.items;
        kFeedItemList.requestId = this.requestId;
        kFeedItemList.refreshClear = this.refreshClear;
        kFeedItemList.statusCode = this.statusCode;
        kFeedItemList.statusMsg = this.statusMsg;
        kFeedItemList.blockCode = this.blockCode;
        kFeedItemList.logPb = this.logPb;
        return kFeedItemList;
    }

    public void setBlockCode(int i) {
        this.blockCode = i;
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

    public void setRefreshClear(int i) {
        this.refreshClear = i;
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33623d
    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setStatusCode(int i) {
        this.statusCode = i;
    }

    public void setStatusMsg(String str) {
        this.statusMsg = str;
    }
}
