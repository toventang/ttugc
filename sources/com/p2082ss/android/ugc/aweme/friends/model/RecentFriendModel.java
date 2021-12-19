package com.p2082ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.p2401bq.p2402a.C34908a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.friends.model.RecentFriendModel */
public final class RecentFriendModel extends BaseResponse {
    @AbstractC27891c(mo46611a = "block_results")
    public final List<C34908a> blockResults = new ArrayList();
    @AbstractC27891c(mo46611a = "cursor")
    public final long cursor;
    @AbstractC27891c(mo46611a = "has_more")
    public final boolean hasMore;
    @AbstractC27891c(mo46611a = "user_list")
    public final List<User> users = new ArrayList();

    static {
        Covode.recordClassIndex(60910);
    }
}
