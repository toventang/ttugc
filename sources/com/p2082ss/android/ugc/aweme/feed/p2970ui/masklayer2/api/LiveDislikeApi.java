package com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.api;

import com.bytedance.android.live.base.model.live.C2978a;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import p4560f.p4561a.AbstractC88979t;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.api.LiveDislikeApi */
public interface LiveDislikeApi {
    static {
        Covode.recordClassIndex(59507);
    }

    @AbstractC22000h(mo35789a = "/webcast/room/dislike/")
    AbstractC88979t<Object<C2978a>> dislikeLiveRoom(@AbstractC22018z(mo35807a = "room_id") long j, @AbstractC22018z(mo35807a = "owner_uid") long j2, @AbstractC22018z(mo35807a = "request_id") String str, @AbstractC22018z(mo35807a = "source") String str2, @AbstractC22018z(mo35807a = "enter_from_merge") String str3, @AbstractC22018z(mo35807a = "enter_method") String str4, @AbstractC22018z(mo35807a = "ad_id") String str5, @AbstractC22018z(mo35807a = "creative_id") String str6, @AbstractC22018z(mo35807a = "log_extra") String str7, @AbstractC22018z(mo35807a = "tag") String str8);
}
