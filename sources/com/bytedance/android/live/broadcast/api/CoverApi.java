package com.bytedance.android.live.broadcast.api;

import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import p4560f.p4561a.AbstractC88979t;

public interface CoverApi {
    static {
        Covode.recordClassIndex(3484);
    }

    @AbstractC22000h(mo35789a = "/webcast/room/anchor_cover_status/")
    AbstractC88979t<C5832d<Object>> anchorCoverStatus();

    @AbstractC22000h(mo35789a = "/webcast/room/anchor_cover_quality/")
    AbstractC88979t<C5832d<Object>> getCoverQuality(@AbstractC22018z(mo35807a = "uri") String str);
}
