package com.p2082ss.android.ugc.aweme.notice.api.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.notice.api.bean.NoticeList */
public final class NoticeList extends BaseResponse {
    @AbstractC27891c(mo46611a = "follow_tab_channel_count")
    private List<Object> followTabChannelCounts;
    @AbstractC27891c(mo46611a = "groups_in_filters")
    private List<C61559k> groups;
    @AbstractC27891c(mo46611a = "notice_count")
    private List<NoticeCount> items;
    @AbstractC27891c(mo46611a = "log_pb")
    private LogPbBean logPb;
    @AbstractC27891c(mo46611a = "user_id")
    private Long userId;

    static {
        Covode.recordClassIndex(72221);
    }

    public final List<Object> getFollowTabChannelCounts() {
        return this.followTabChannelCounts;
    }

    public final List<C61559k> getGroups() {
        return this.groups;
    }

    public final List<NoticeCount> getItems() {
        return this.items;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final Long getUserId() {
        return this.userId;
    }

    public final void setFollowTabChannelCounts(List<Object> list) {
        this.followTabChannelCounts = list;
    }

    public final void setGroups(List<C61559k> list) {
        this.groups = list;
    }

    public final void setItems(List<NoticeCount> list) {
        this.items = list;
    }

    public final void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public final void setUserId(Long l) {
        this.userId = l;
    }

    public NoticeList(Long l, List<NoticeCount> list, LogPbBean logPbBean, List<C61559k> list2, List<Object> list3) {
        this.userId = l;
        this.items = list;
        this.logPb = logPbBean;
        this.groups = list2;
        this.followTabChannelCounts = list3;
    }
}
