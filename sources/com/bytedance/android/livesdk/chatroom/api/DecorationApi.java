package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdk.chatroom.model.C7693m;
import com.bytedance.android.livesdk.chatroom.model.C7695o;
import com.bytedance.android.livesdkapi.depend.model.live.C11719c;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC21987aa;
import com.bytedance.retrofit2.p1610b.AbstractC21997e;
import com.bytedance.retrofit2.p1610b.AbstractC21998f;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import java.util.HashMap;
import java.util.Map;
import p4560f.p4561a.AbstractC88979t;

public interface DecorationApi {
    static {
        Covode.recordClassIndex(8035);
    }

    @AbstractC22012t(mo35799a = "/webcast/room/token_create/")
    @AbstractC21999g
    AbstractC88979t<C5832d<C11719c>> createDonateToken(@AbstractC21998f Map<String, Object> map);

    @AbstractC22000h(mo35789a = "/webcast/room/stickers/")
    AbstractC88979t<C5832d<C7695o>> fetchStickerList();

    @AbstractC22000h(mo35789a = "/webcast/ranklist/donation/")
    AbstractC88979t<C5832d<C7693m>> getRoomDonationInfo(@AbstractC21987aa Map<String, Object> map);

    @AbstractC22012t(mo35799a = "/webcast/room/decoration/set/")
    @AbstractC21999g
    AbstractC88979t<C5832d<Object>> setDecoration(@AbstractC21997e(mo35786a = "room_id") long j, @AbstractC21997e(mo35786a = "type") int i, @AbstractC21998f HashMap<String, String> hashMap);
}
