package com.bytedance.android.livesdk.microom;

import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdk.microom.p576a.C9508a;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import p4560f.p4561a.AbstractC88979t;

public interface MicRoomApi {
    static {
        Covode.recordClassIndex(11006);
    }

    @AbstractC22000h(mo35789a = "/webcast/room/next_event_show")
    AbstractC88979t<C5832d<C9508a>> getNextRoomData(@AbstractC22018z(mo35807a = "channel_uid") long j, @AbstractC22018z(mo35807a = "now_anchor_id") long j2);
}
