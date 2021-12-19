package com.p2082ss.android.ugc.aweme.feed.api;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.live.response.C58730a;
import com.p2082ss.android.ugc.aweme.live.response.Extra;

/* renamed from: com.ss.android.ugc.aweme.feed.api.FeedLiveRoomApi */
public final class FeedLiveRoomApi {

    /* renamed from: a */
    private static final RoomApi f111991a = ((RoomApi) RetrofitFactory.m33635a().mo28817b("https://" + LiveOuterService.m107269s().mo95832f().mo120925a()).mo28832d().mo28858a(RoomApi.class));

    /* renamed from: com.ss.android.ugc.aweme.feed.api.FeedLiveRoomApi$RoomApi */
    public interface RoomApi {
        static {
            Covode.recordClassIndex(57083);
        }

        @AbstractC22000h(mo35789a = "webcast/d/topview_room/")
        AbstractC21983b<C58730a<Room, Extra>> queryRoomInfo(@AbstractC22018z(mo35807a = "uid") long j, @AbstractC22018z(mo35807a = "sec_uid") String str);

        @AbstractC22000h(mo35789a = "/webcast/topview/room/")
        AbstractC21983b<C58730a<Room, Extra>> queryTopViewLiveRoomInfo(@AbstractC22018z(mo35807a = "uid") long j, @AbstractC22018z(mo35807a = "sec_uid") String str);
    }

    static {
        Covode.recordClassIndex(57082);
    }

    /* renamed from: a */
    public static AbstractC21983b<C58730a<Room, Extra>> m91779a(long j, String str) {
        return f111991a.queryTopViewLiveRoomInfo(j, str);
    }
}
