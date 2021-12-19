package com.bytedance.android.live.broadcast.api;

import com.bytedance.android.live.broadcast.model.C3260f;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import p4560f.p4561a.AbstractC88979t;

public interface BroadcastSettingApi {
    static {
        Covode.recordClassIndex(3482);
    }

    @AbstractC22000h(mo35789a = "/webcast/user/permission/")
    AbstractC88979t<C5832d<C3260f>> fetchBroadcastSetting();
}
