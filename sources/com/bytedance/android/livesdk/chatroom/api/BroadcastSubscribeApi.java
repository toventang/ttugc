package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import p4560f.p4561a.AbstractC88979t;

public interface BroadcastSubscribeApi {
    static {
        Covode.recordClassIndex(8034);
    }

    @AbstractC22000h(mo35789a = "/webcast/sub/privilege/get_sub_info/")
    AbstractC88979t<C5832d<C7296f>> getSubscribeInfo(@AbstractC22018z(mo35807a = "need_current_state") boolean z, @AbstractC22018z(mo35807a = "sec_anchor_id") String str);
}
