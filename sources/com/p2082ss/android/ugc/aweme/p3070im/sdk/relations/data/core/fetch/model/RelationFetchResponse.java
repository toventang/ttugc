package com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.fetch.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.p2401bq.p2402a.C34908a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.model.RelationFetchResponse */
public class RelationFetchResponse extends BaseResponse {
    @AbstractC27891c(mo46611a = "block_results")
    List<C34908a> blockResults;
    @AbstractC27891c(mo46611a = "followings")
    List<IMUser> followings;
    @AbstractC27891c(mo46611a = "has_more")
    int hasMore;
    @AbstractC27891c(mo46611a = "hotsoon_hide_text")
    String hotSoonNotice;
    @AbstractC27891c(mo46611a = "hotsoon_hide_en_text")
    String hotSoonNoticeEn;
    @AbstractC27891c(mo46611a = "max_time")
    long maxTime;
    @AbstractC27891c(mo46611a = "min_time")
    long minTime;
    @AbstractC27891c(mo46611a = "next_req_count")
    int nextReqCount;

    static {
        Covode.recordClassIndex(65631);
    }

    public List<C34908a> getBlockResults() {
        return this.blockResults;
    }

    public List<IMUser> getFollowings() {
        return this.followings;
    }

    public int getHasMore() {
        return this.hasMore;
    }

    public String getHotSoonNotice() {
        return this.hotSoonNotice;
    }

    public String getHotSoonNoticeEn() {
        return this.hotSoonNoticeEn;
    }

    public long getMaxTime() {
        return this.maxTime;
    }

    public long getMinTime() {
        return this.minTime;
    }

    public int getNextReqCount() {
        return this.nextReqCount;
    }

    public void setBlockResults(List<C34908a> list) {
        this.blockResults = list;
    }

    public void setFollowings(List<IMUser> list) {
        this.followings = list;
    }

    public void setHasMore(int i) {
        this.hasMore = i;
    }

    public void setHotSoonNotice(String str) {
        this.hotSoonNotice = str;
    }

    public void setHotSoonNoticeEn(String str) {
        this.hotSoonNoticeEn = str;
    }

    public void setMaxTime(long j) {
        this.maxTime = j;
    }

    public void setMinTime(long j) {
        this.minTime = j;
    }

    public void setNextReqCount(int i) {
        this.nextReqCount = i;
    }
}
