package com.bytedance.android.livesdk.chatroom.detail;

import com.bytedance.android.live.network.p380a.AbstractC5796a;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import p4560f.p4561a.AbstractC88979t;

public interface RoomApi {
    static {
        Covode.recordClassIndex(8190);
    }

    @AbstractC22000h(mo35789a = "/webcast/room/collect_unread/")
    AbstractC88979t<C5832d<Object>> collectUnreadRequest(@AbstractC22018z(mo35807a = "room_id") long j, @AbstractC22018z(mo35807a = "anchor_id") long j2, @AbstractC22018z(mo35807a = "unread_extra") String str, @AbstractC22018z(mo35807a = "room_ids") String str2);

    @AbstractC22000h(mo35789a = "/webcast/room/info_by_user/")
    @AbstractC5796a(mo11568a = AbstractC5796a.EnumC5797a.ROOM)
    AbstractC88979t<C5832d<Room>> fetchUserRoom(@AbstractC22018z(mo35807a = "user_id") long j, @AbstractC22018z(mo35807a = "sec_user_id") String str);
}
