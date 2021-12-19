package com.bytedance.android.livesdk.hashtag;

import com.bytedance.android.live.base.model.HashtagResponse;
import com.bytedance.android.live.network.p380a.AbstractC5796a;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC21997e;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import p4560f.p4561a.AbstractC88979t;

public interface HashtagApi {
    static {
        Covode.recordClassIndex(9813);
    }

    @AbstractC22000h(mo35789a = "/webcast/room/hashtag/list/")
    @AbstractC5796a(mo11568a = AbstractC5796a.EnumC5797a.BROADCAST)
    AbstractC88979t<C5832d<HashtagResponse>> fetchHashtagList();

    @AbstractC22012t(mo35799a = "/webcast/room/hashtag/set/")
    @AbstractC21999g
    AbstractC88979t<C5832d<Void>> setHashtag(@AbstractC21997e(mo35786a = "room_id") Long l, @AbstractC21997e(mo35786a = "anchor_id") Long l2, @AbstractC21997e(mo35786a = "hashtag_id") Long l3, @AbstractC21997e(mo35786a = "game_tag_id") Long l4);
}
