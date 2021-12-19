package com.p2082ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.friends.model.SummonFriendList */
public class SummonFriendList extends BaseResponse {
    @AbstractC27891c(mo46611a = "cursor")
    public long cursor;
    @AbstractC27891c(mo46611a = "has_more")
    public boolean hasMore;
    @AbstractC27891c(mo46611a = "user_list")
    public List<SummonFriendItem> items;
    @AbstractC27891c(mo46611a = "input_keyword")
    public String keyword;
    @AbstractC27891c(mo46611a = "log_pb")
    public LogPbBean logPbBean;
    @AbstractC27891c(mo46611a = "rid")
    public String requestId;

    static {
        Covode.recordClassIndex(60922);
    }

    public SummonFriendList(List<SummonFriendItem> list, long j, boolean z, String str) {
        this.items = list;
        this.cursor = j;
        this.hasMore = z;
        this.keyword = str;
    }
}
