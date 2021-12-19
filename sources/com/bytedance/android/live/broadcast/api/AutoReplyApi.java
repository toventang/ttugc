package com.bytedance.android.live.broadcast.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC21997e;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import p4560f.p4561a.AbstractC88979t;

public interface AutoReplyApi {
    static {
        Covode.recordClassIndex(3479);
    }

    @AbstractC22012t(mo35799a = "/webcast/room/set_auto_gift_thanks/")
    @AbstractC21999g
    AbstractC88979t<Object> enableAutoReply(@AbstractC21997e(mo35786a = "enabled") String str);
}
