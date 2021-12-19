package com.bytedance.android.livesdk.manage.api;

import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdk.manage.p575d.C9493a;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import p4560f.p4561a.AbstractC88979t;

public interface AssetsApi {
    static {
        Covode.recordClassIndex(10990);
    }

    @AbstractC22000h(mo35789a = "/webcast/assets/effects/")
    AbstractC88979t<C5832d<C9493a>> getAssets(@AbstractC22018z(mo35807a = "download_assets_from") int i, @AbstractC22018z(mo35807a = "room_id") Long l);
}
