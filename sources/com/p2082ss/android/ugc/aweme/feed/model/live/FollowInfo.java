package com.p2082ss.android.ugc.aweme.feed.model.live;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.live.FollowInfo */
public class FollowInfo implements Serializable {
    @AbstractC27891c(mo46611a = "follow_status")
    long followStatus;
    @AbstractC27891c(mo46611a = "follower_count")
    long followerCount;
    @AbstractC27891c(mo46611a = "following_count")
    long followingCount;
    @AbstractC27891c(mo46611a = "push_status")
    long pushStatus;

    static {
        Covode.recordClassIndex(58794);
    }
}
