package com.bytedance.android.live.adminsetting;

import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC21997e;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import p4560f.p4561a.AbstractC88979t;

public interface RoomSwitchApi {
    static {
        Covode.recordClassIndex(3345);
    }

    @AbstractC22012t(mo35799a = "/webcast/room/switch/update/")
    @AbstractC21999g
    AbstractC88979t<C5832d<Object>> updateSwitch(@AbstractC21997e(mo35786a = "room_id") long j, @AbstractC21997e(mo35786a = "switch_type") int i, @AbstractC21997e(mo35786a = "switch_value") boolean z);
}
