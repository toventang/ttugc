package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC21997e;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import p4560f.p4561a.AbstractC88979t;

public interface LiveEventApi {
    static {
        Covode.recordClassIndex(8045);
    }

    @AbstractC22012t(mo35799a = "/webcast/room/bind/event")
    @AbstractC21999g
    AbstractC88979t<C5832d<Void>> bindLiveEvent(@AbstractC21997e(mo35786a = "room_id") long j, @AbstractC21997e(mo35786a = "owner_user_id") long j2, @AbstractC21997e(mo35786a = "event_id") long j3);
}
