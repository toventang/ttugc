package com.bytedance.android.livesdk.mvp;

import com.bytedance.android.live.network.response.C5830b;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC21997e;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import p4560f.p4561a.AbstractC88979t;

public interface PaidRoomApi {
    static {
        Covode.recordClassIndex(11468);
    }

    @AbstractC22012t(mo35799a = "/webcast/room/gated/check_ticket/")
    @AbstractC21999g
    AbstractC88979t<C5830b<Void, CheckCodeExtra>> checkCode(@AbstractC21997e(mo35786a = "ticket_code") String str, @AbstractC21997e(mo35786a = "room_id") Long l);

    @AbstractC22000h(mo35789a = "/webcast/room/gated/event_info/")
    AbstractC88979t<C5832d<C9919a>> queryRoomData(@AbstractC22018z(mo35807a = "room_id") Long l);
}
