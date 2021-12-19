package com.bytedance.android.live.banner;

import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdk.model.message.C9695c;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import p4560f.p4561a.AbstractC88979t;

public interface BannerRetrofitApi {
    static {
        Covode.recordClassIndex(3383);
    }

    @AbstractC22000h(mo35789a = "/webcast/room/in_room_banner/")
    AbstractC88979t<C5832d<C9695c>> queryLiveRoomBanner(@AbstractC22018z(mo35807a = "room_id") long j, @AbstractC22018z(mo35807a = "user_type") int i);
}
