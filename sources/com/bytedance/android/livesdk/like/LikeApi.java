package com.bytedance.android.livesdk.like;

import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC21997e;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import p4560f.p4561a.AbstractC88979t;

public interface LikeApi {
    static {
        Covode.recordClassIndex(10067);
    }

    @AbstractC22000h(mo35789a = "/webcast/room/like/icon/")
    AbstractC88979t<C5832d<C9187u>> getIcons(@AbstractC22018z(mo35807a = "room_id") long j, @AbstractC22018z(mo35807a = "anchor_id") long j2);

    @AbstractC22012t(mo35799a = "/webcast/room/like/")
    @AbstractC21999g
    AbstractC88979t<C5832d<Void>> like(@AbstractC21997e(mo35786a = "room_id") long j, @AbstractC21997e(mo35786a = "count") long j2);
}
