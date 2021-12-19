package com.p2082ss.android.ugc.aweme.friends;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.friends.api.SummonFriendApi;
import com.p2082ss.android.ugc.aweme.friends.model.RecentFriendModel;
import p4560f.p4561a.AbstractC88979t;

/* renamed from: com.ss.android.ugc.aweme.friends.b */
public final class C51475b {
    static {
        Covode.recordClassIndex(60740);
    }

    /* renamed from: a */
    public static AbstractC88979t<RecentFriendModel> m95882a(SummonFriendApi.SummonFriendService summonFriendService, int i, int i2) {
        return summonFriendService.queryFollowFriends4At(i, i2);
    }
}
