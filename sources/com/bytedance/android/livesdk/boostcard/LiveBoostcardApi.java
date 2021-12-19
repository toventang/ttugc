package com.bytedance.android.livesdk.boostcard;

import com.bytedance.android.live.network.p380a.AbstractC5796a;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC21997e;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import p4560f.p4561a.AbstractC88979t;

public interface LiveBoostcardApi {
    static {
        Covode.recordClassIndex(7651);
    }

    @AbstractC21999g
    @AbstractC5796a(mo11568a = AbstractC5796a.EnumC5797a.GIFT)
    @AbstractC22012t(mo35799a = "/webcast/boost/card/ack/")
    AbstractC88979t<C5832d<C6915c>> boostCardAck(@AbstractC21997e(mo35786a = "room_id") long j, @AbstractC21997e(mo35786a = "ack_type") int i);

    @AbstractC22000h(mo35789a = "/webcast/boost/card/boosted_users/")
    @AbstractC5796a(mo11568a = AbstractC5796a.EnumC5797a.GIFT)
    AbstractC88979t<C5832d<C6931e>> queryUserStatus(@AbstractC22018z(mo35807a = "room_id") long j, @AbstractC22018z(mo35807a = "need_points") boolean z);
}
