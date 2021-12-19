package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.base.model.p181c.C2965a;
import com.bytedance.android.live.network.response.C5827a;
import com.bytedance.android.live.network.response.C5831c;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import p4560f.p4561a.AbstractC88979t;

public interface EndPageRecommendRetrofitApi {
    static {
        Covode.recordClassIndex(8036);
    }

    @AbstractC22000h(mo35789a = "/webcast/room/recommend_live/")
    AbstractC88979t<C5827a<Room, C2965a>> getLive(@AbstractC22018z(mo35807a = "room_id") long j);

    @AbstractC22000h(mo35789a = "/webcast/feed/")
    AbstractC88979t<C5827a<FeedItem, C2965a>> getNewRecommend(@AbstractC22018z(mo35807a = "max_time") long j, @AbstractC22018z(mo35807a = "req_from") String str, @AbstractC22018z(mo35807a = "channel_id") String str2, @AbstractC22018z(mo35807a = "is_draw") long j2, @AbstractC22018z(mo35807a = "draw_room_id") long j3, @AbstractC22018z(mo35807a = "draw_room_owner_id") long j4);

    @AbstractC22000h(mo35789a = "/webcast/room/recommend_item/")
    AbstractC88979t<C5831c<Object>> getVideos(@AbstractC22018z(mo35807a = "room_id") long j);
}
