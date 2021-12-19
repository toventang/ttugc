package com.bytedance.android.live.effect.api;

import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC21997e;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import p4560f.p4561a.AbstractC88979t;

public interface EffectRelatedApi {
    static {
        Covode.recordClassIndex(4714);
    }

    @AbstractC22012t(mo35799a = "/webcast/room/internal_ci_info/")
    @AbstractC21999g
    AbstractC88979t<C5832d<Void>> uploadBeautyParams(@AbstractC21997e(mo35786a = "room_id") long j, @AbstractC21997e(mo35786a = "filter_name") String str, @AbstractC21997e(mo35786a = "brightening") int i, @AbstractC21997e(mo35786a = "beauty_skin") int i2, @AbstractC21997e(mo35786a = "big_eyes") int i3, @AbstractC21997e(mo35786a = "face_lift") int i4, @AbstractC21997e(mo35786a = "use_filter") boolean z);
}
