package com.bytedance.android.live.core.feed;

import com.bytedance.android.live.base.model.p181c.C2965a;
import com.bytedance.android.live.network.p380a.AbstractC5796a;
import com.bytedance.android.live.network.response.C5827a;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC21993ag;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import p4560f.p4561a.AbstractC88979t;

public interface FeedApi {
    static {
        Covode.recordClassIndex(4497);
    }

    @AbstractC22000h
    @AbstractC5796a(mo11568a = AbstractC5796a.EnumC5797a.FEED)
    AbstractC88979t<C5827a<FeedItem, C2965a>> feed(@AbstractC21993ag String str, @AbstractC22018z(mo35807a = "max_time") long j, @AbstractC22018z(mo35807a = "req_from") String str2);

    @AbstractC22000h
    @AbstractC5796a(mo11568a = AbstractC5796a.EnumC5797a.FEED)
    AbstractC88979t<C5827a<FeedItem, C2965a>> feed(@AbstractC21993ag String str, @AbstractC22018z(mo35807a = "max_time") long j, @AbstractC22018z(mo35807a = "req_from") String str2, @AbstractC22018z(mo35807a = "is_draw") long j2, @AbstractC22018z(mo35807a = "draw_room_id") long j3, @AbstractC22018z(mo35807a = "draw_room_owner_id") long j4);

    @AbstractC22000h
    @AbstractC5796a(mo11568a = AbstractC5796a.EnumC5797a.FEED)
    AbstractC88979t<C5827a<FeedItem, C2965a>> feed(@AbstractC21993ag String str, @AbstractC22018z(mo35807a = "max_time") long j, @AbstractC22018z(mo35807a = "req_from") String str2, @AbstractC22018z(mo35807a = "channel_id") String str3, @AbstractC22018z(mo35807a = "is_draw") long j2, @AbstractC22018z(mo35807a = "draw_room_id") long j3, @AbstractC22018z(mo35807a = "draw_room_owner_id") long j4);

    @AbstractC22000h
    @AbstractC5796a(mo11568a = AbstractC5796a.EnumC5797a.FEED)
    AbstractC88979t<C5827a<FeedItem, C2965a>> feed(@AbstractC21993ag String str, @AbstractC22018z(mo35807a = "max_time") long j, @AbstractC22018z(mo35807a = "req_from") String str2, @AbstractC22018z(mo35807a = "channel_id") String str3, @AbstractC22018z(mo35807a = "draw_room_id") String str4, @AbstractC22018z(mo35807a = "draw_room_owner_id") String str5, @AbstractC22018z(mo35807a = "hashtag_id") long j2, @AbstractC22018z(mo35807a = "style") long j3);
}
