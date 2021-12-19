package com.bytedance.android.live.broadcast.api;

import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdk.gift.model.C8837b;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import p4560f.p4561a.AbstractC88979t;

public interface StickerGiftApi {
    static {
        Covode.recordClassIndex(3489);
    }

    @AbstractC22000h(mo35789a = "/webcast/gift/user_name/check/")
    AbstractC88979t<C5832d<C8837b>> checkUserNameLegality(@AbstractC22018z(mo35807a = "name") String str);
}
