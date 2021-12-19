package com.bytedance.android.livesdk.subscribe;

import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.google.gson.C28022o;
import p4560f.p4561a.AbstractC88979t;

public interface SubscribeApi {
    static {
        Covode.recordClassIndex(12383);
    }

    @AbstractC22000h(mo35789a = "/webcast/sub/privilege/get_sub_privilege_detail")
    AbstractC88979t<C5832d<C28022o>> getSubPrivilegeDetail(@AbstractC22018z(mo35807a = "room_id") String str, @AbstractC22018z(mo35807a = "sec_anchor_id") String str2);
}
