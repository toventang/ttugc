package com.p2082ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeResponse */
public class NoticeResponse extends BaseResponse {
    @AbstractC27891c(mo46611a = "has_more")
    public boolean hasMore;
    @AbstractC27891c(mo46611a = "notice_list")
    public List<BaseNotice> items;
    @AbstractC27891c(mo46611a = "last_read_time")
    public long lastReadTime;
    @AbstractC27891c(mo46611a = "log_pb")
    public LogPbBean logPbBean;
    @AbstractC27891c(mo46611a = "max_time")
    public long maxTime;
    @AbstractC27891c(mo46611a = "min_time")
    public long minTime;
    @AbstractC27891c(mo46611a = "total")
    public int total;
    @AbstractC27891c(mo46611a = "vcd_merge_total")
    public int vcdMergeTotal;
    @AbstractC27891c(mo46611a = "vcd_toast_text")
    public String vcdToastText;

    static {
        Covode.recordClassIndex(72346);
    }

    public List<BaseNotice> getItems() {
        return this.items;
    }

    public long getLastReadTime() {
        return this.lastReadTime;
    }

    public long getMaxTime() {
        return this.maxTime;
    }

    public long getMinTime() {
        return this.minTime;
    }

    public int getStatusCode() {
        return this.status_code;
    }

    public int getTotal() {
        return this.total;
    }

    public int getVcdMergeTotal() {
        return this.vcdMergeTotal;
    }

    public String getVcdToastText() {
        return this.vcdToastText;
    }

    public boolean isHasMore() {
        return this.hasMore;
    }

    public void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public void setItems(List<BaseNotice> list) {
        this.items = list;
    }

    public void setLastReadTime(long j) {
        this.lastReadTime = j;
    }

    public void setMaxTime(long j) {
        this.maxTime = j;
    }

    public void setMinTime(long j) {
        this.minTime = j;
    }

    public void setStatusCode(int i) {
        this.status_code = i;
    }

    public void setTotal(int i) {
        this.total = i;
    }

    public void setVcdMergeTotal(int i) {
        this.vcdMergeTotal = i;
    }

    public void setVcdToastText(String str) {
        this.vcdToastText = str;
    }
}
