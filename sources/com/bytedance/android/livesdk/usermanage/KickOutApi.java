package com.bytedance.android.livesdk.usermanage;

import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.p405s.p406a.C6099c;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import p4560f.p4561a.AbstractC88979t;
import p4600h.C89391z;

public interface KickOutApi {
    static {
        Covode.recordClassIndex(12670);
    }

    @AbstractC22000h(mo35789a = "/webcast/room/kick/list/")
    AbstractC88979t<C6099c> getKickedOutList(@AbstractC22018z(mo35807a = "room_id") long j, @AbstractC22018z(mo35807a = "count") int i, @AbstractC22018z(mo35807a = "offset") int i2, @AbstractC22018z(mo35807a = "sec_user_id") String str);

    @AbstractC22000h(mo35789a = "/webcast/room/kick/user/")
    AbstractC88979t<C5832d<C89391z>> kickOut(@AbstractC22018z(mo35807a = "room_id") long j, @AbstractC22018z(mo35807a = "kick_uid") long j2);

    @AbstractC22000h(mo35789a = "/webcast/room/unkick/user/")
    AbstractC88979t<C5832d<C89391z>> unKickOut(@AbstractC22018z(mo35807a = "room_id") long j, @AbstractC22018z(mo35807a = "kick_uid") long j2);
}
