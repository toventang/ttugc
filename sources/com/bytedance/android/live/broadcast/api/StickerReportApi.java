package com.bytedance.android.live.broadcast.api;

import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC21997e;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import p4560f.p4561a.AbstractC88979t;

public interface StickerReportApi {
    static {
        Covode.recordClassIndex(3490);
    }

    @AbstractC22012t(mo35799a = "/webcast/room/event_report/")
    @AbstractC21999g
    AbstractC88979t<C5832d<Void>> reportEffectChange(@AbstractC21997e(mo35786a = "room_id") long j, @AbstractC21997e(mo35786a = "event") int i, @AbstractC21997e(mo35786a = "effect_id") String str, @AbstractC21997e(mo35786a = "last_effect_id") String str2);

    @AbstractC22012t(mo35799a = "/webcast/gift/set_room_supported/")
    @AbstractC21999g
    AbstractC88979t<C5832d<Object>> reportFaceGift(@AbstractC21997e(mo35786a = "room_id") long j, @AbstractC21997e(mo35786a = "gift_ids") String str);
}
