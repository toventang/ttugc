package com.p2082ss.android.ugc.aweme.live.feedpage;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC21997e;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import p4560f.p4561a.AbstractC88979t;

/* renamed from: com.ss.android.ugc.aweme.live.feedpage.LiveStateApi */
public interface LiveStateApi {
    static {
        Covode.recordClassIndex(68916);
    }

    @AbstractC22012t(mo35799a = "/webcast/room/live_room_id/")
    @AbstractC21999g
    AbstractC88979t<C58628j> liveStates(@AbstractC21997e(mo35786a = "user_id") String str, @AbstractC21997e(mo35786a = "scene") String str2);
}
