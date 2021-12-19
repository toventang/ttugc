package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.livesdkapi.depend.model.live.C11734o;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC21987aa;
import com.bytedance.retrofit2.p1610b.AbstractC21993ag;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import java.util.Map;
import p4560f.p4561a.AbstractC88979t;

public interface StickerDonationRetrofitApi {
    static {
        Covode.recordClassIndex(8050);
    }

    @AbstractC22000h
    AbstractC88979t<C11734o> fetchStickerDonation(@AbstractC21993ag String str, @AbstractC21987aa Map<String, String> map);
}
