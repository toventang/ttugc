package com.bytedance.android.livesdk.usercard;

import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC21997e;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import p4560f.p4561a.AbstractC88979t;

public interface ProfileNotificationApi {
    static {
        Covode.recordClassIndex(12553);
    }

    @AbstractC22012t(mo35799a = "/webcast/user/relation/live_push_status/update/")
    @AbstractC21999g
    AbstractC88979t<C5832d<Object>> sendNewSetting(@AbstractC21997e(mo35786a = "push_status") int i, @AbstractC21997e(mo35786a = "sec_to_user_id") String str);
}
