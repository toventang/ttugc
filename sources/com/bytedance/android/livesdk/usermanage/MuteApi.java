package com.bytedance.android.livesdk.usermanage;

import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.p405s.p406a.C6099c;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import p4560f.p4561a.AbstractC88979t;

public interface MuteApi {
    static {
        Covode.recordClassIndex(12671);
    }

    @AbstractC22000h(mo35789a = "/webcast/room/silence/list/")
    AbstractC88979t<C6099c> getMuteList(@AbstractC22018z(mo35807a = "room_id") long j, @AbstractC22018z(mo35807a = "count") int i, @AbstractC22018z(mo35807a = "offset") int i2, @AbstractC22018z(mo35807a = "sec_user_id") String str);

    @AbstractC22000h(mo35789a = "/webcast/room/silence/")
    AbstractC88979t<C5832d<Object>> mute(@AbstractC22018z(mo35807a = "room_id") long j, @AbstractC22018z(mo35807a = "user_id") long j2, @AbstractC22018z(mo35807a = "silence_type") long j3, @AbstractC22018z(mo35807a = "sec_user_id") String str, @AbstractC22018z(mo35807a = "duration") long j4);

    @AbstractC22000h(mo35789a = "/webcast/room/unsilence/")
    AbstractC88979t<C5832d<Object>> unmute(@AbstractC22018z(mo35807a = "room_id") long j, @AbstractC22018z(mo35807a = "user_id") long j2, @AbstractC22018z(mo35807a = "sec_user_id") String str);
}
