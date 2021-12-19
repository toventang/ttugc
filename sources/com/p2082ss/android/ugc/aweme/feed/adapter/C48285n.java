package com.p2082ss.android.ugc.aweme.feed.adapter;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.n */
public final class C48285n {
    static {
        Covode.recordClassIndex(57027);
    }

    /* renamed from: a */
    public static final int m91724a(LiveRoomStruct liveRoomStruct) {
        C89219l.m154721d(liveRoomStruct, "");
        if (liveRoomStruct.owner == null) {
            return -1;
        }
        User user = liveRoomStruct.owner;
        C89219l.m154716b(user, "");
        int followStatus = user.getFollowStatus();
        if (followStatus == 0 || followStatus == 1 || followStatus == 2) {
            return followStatus;
        }
        User user2 = liveRoomStruct.owner;
        C89219l.m154716b(user2, "");
        if (user2.getFollowerStatus() == 0) {
            return 0;
        }
        return 3;
    }
}
