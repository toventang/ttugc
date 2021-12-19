package com.bytedance.android.livesdk.feed.dislike;

import com.bytedance.android.live.base.model.live.C2978a;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import p4560f.p4561a.AbstractC88979t;

public interface DislikeApi {
    static {
        Covode.recordClassIndex(9381);
    }

    @AbstractC22000h(mo35789a = "/webcast/room/dislike/")
    AbstractC88979t<C5832d<C2978a>> dislikeRoom(@AbstractC22018z(mo35807a = "id") long j, @AbstractC22018z(mo35807a = "owner_uid") long j2, @AbstractC22018z(mo35807a = "request_id") String str, @AbstractC22018z(mo35807a = "enter_source") String str2, @AbstractC22018z(mo35807a = "source") String str3, @AbstractC22018z(mo35807a = "log_pb") String str4);
}
