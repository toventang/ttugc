package com.bytedance.android.livesdk.service.network;

import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdk.gift.model.C8859w;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC21997e;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import p4560f.p4561a.AbstractC88979t;

public interface PropApi {
    static {
        Covode.recordClassIndex(12359);
    }

    @AbstractC22012t(mo35799a = "/webcast/props/mine/")
    AbstractC88979t<C5832d<C10761a>> getPropList(@AbstractC22018z(mo35807a = "room_id") long j);

    @AbstractC22012t(mo35799a = "/webcast/props/consume/")
    @AbstractC21999g
    AbstractC88979t<C5832d<C8859w>> sendProp(@AbstractC21997e(mo35786a = "prop_def_id") long j, @AbstractC22018z(mo35807a = "room_id") long j2, @AbstractC21997e(mo35786a = "count") int i, @AbstractC21997e(mo35786a = "to_user_id") long j3, @AbstractC21997e(mo35786a = "is_aweme_free_gift") int i2);
}
