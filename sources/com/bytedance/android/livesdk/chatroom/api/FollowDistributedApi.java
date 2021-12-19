package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC21997e;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import p4560f.p4561a.AbstractC88979t;

public interface FollowDistributedApi {
    static {
        Covode.recordClassIndex(8037);
    }

    @AbstractC22012t(mo35799a = "/webcast/linkmic/online/user_room_info/")
    @AbstractC21999g
    AbstractC88979t<C5832d<Room>> getFollowRoomInfo(@AbstractC21997e(mo35786a = "scene") int i, @AbstractC21997e(mo35786a = "user_id") long j);
}
