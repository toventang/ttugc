package com.bytedance.android.livesdk.service.network;

import com.bytedance.android.live.network.p380a.AbstractC5796a;
import com.bytedance.android.live.network.response.C5830b;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdk.gift.model.C8846j;
import com.bytedance.android.livesdk.gift.model.C8859w;
import com.bytedance.android.livesdk.gift.model.C8860x;
import com.bytedance.android.livesdk.service.p624b.C10699c;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC21997e;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import p4560f.p4561a.AbstractC88979t;

public interface GiftRetrofitApi {
    static {
        Covode.recordClassIndex(12358);
    }

    @AbstractC22000h(mo35789a = "/webcast/wishlist/get/")
    AbstractC88979t<C5832d<C8860x>> getWishList(@AbstractC22018z(mo35807a = "anchor_id") long j, @AbstractC22018z(mo35807a = "room_id") long j2);

    @AbstractC21999g
    @AbstractC5796a(mo11568a = AbstractC5796a.EnumC5797a.GIFT)
    @AbstractC22012t(mo35799a = "/webcast/gift/send/")
    AbstractC88979t<C5832d<C8859w>> send(@AbstractC21997e(mo35786a = "gift_id") long j, @AbstractC22018z(mo35807a = "room_id") long j2, @AbstractC21997e(mo35786a = "to_user_id") long j3, @AbstractC21997e(mo35786a = "count") int i);

    @AbstractC21999g
    @AbstractC5796a(mo11568a = AbstractC5796a.EnumC5797a.GIFT)
    @AbstractC22012t(mo35799a = "/webcast/gift/send/")
    AbstractC88979t<C5832d<C8859w>> sendAddType(@AbstractC21997e(mo35786a = "gift_id") long j, @AbstractC22018z(mo35807a = "room_id") long j2, @AbstractC21997e(mo35786a = "to_user_id") long j3, @AbstractC21997e(mo35786a = "count") int i, @AbstractC21997e(mo35786a = "send_scene") int i2, @AbstractC21997e(mo35786a = "send_type") int i3, @AbstractC21997e(mo35786a = "enter_from") String str, @AbstractC21997e(mo35786a = "send_gift_req_start_ms") long j4, @AbstractC21997e(mo35786a = "ug_exchange") int i4);

    @AbstractC22000h(mo35789a = "/webcast/gift/list/")
    @AbstractC5796a(mo11568a = AbstractC5796a.EnumC5797a.GIFT)
    AbstractC88979t<C5830b<C8846j, C10699c>> syncGiftList(@AbstractC22018z(mo35807a = "room_id") String str, @AbstractC22018z(mo35807a = "fetch_giftlist_from") int i);
}
