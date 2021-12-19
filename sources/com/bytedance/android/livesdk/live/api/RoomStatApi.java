package com.bytedance.android.livesdk.live.api;

import com.bytedance.android.live.network.response.C5831c;
import com.bytedance.android.livesdk.live.model.C9304c;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC21997e;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import p4560f.p4561a.AbstractC88979t;

public interface RoomStatApi {
    static {
        Covode.recordClassIndex(10206);
    }

    @AbstractC22012t(mo35799a = "/webcast/room/check_alive/")
    @AbstractC21999g
    AbstractC88979t<C5831c<C9304c>> checkRoom(@AbstractC21997e(mo35786a = "room_ids") String str);
}
