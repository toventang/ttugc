package com.p2082ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.friends.model.FollowUserListModel */
public class FollowUserListModel extends BaseResponse {
    @AbstractC27891c(mo46611a = "has_more")
    public boolean hasMore;
    @AbstractC27891c(mo46611a = "min_time")
    public long maxTime;
    @AbstractC27891c(mo46611a = "max_time")
    public long minTime;
    @AbstractC27891c(mo46611a = "followings")
    public List<User> users;

    static {
        Covode.recordClassIndex(60887);
    }
}
