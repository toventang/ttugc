package com.bytedance.android.live.broadcast.api;

import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import p4560f.p4561a.AbstractC88979t;

public interface StatusApi {
    static {
        Covode.recordClassIndex(3488);
    }

    @AbstractC22000h(mo35789a = "/webcast/room/ping/anchor/")
    AbstractC88979t<C5832d<Void>> sendStatus(@AbstractC22018z(mo35807a = "room_id") long j, @AbstractC22018z(mo35807a = "status") int i, @AbstractC22018z(mo35807a = "stream_id") long j2, @AbstractC22018z(mo35807a = "reason_no") int i2);
}
