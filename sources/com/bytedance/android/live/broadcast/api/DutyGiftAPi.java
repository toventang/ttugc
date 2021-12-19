package com.bytedance.android.live.broadcast.api;

import com.bytedance.android.live.broadcast.api.model.DutyGiftInfo;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import p4560f.p4561a.AbstractC88979t;

public interface DutyGiftAPi {
    static {
        Covode.recordClassIndex(3485);
    }

    @AbstractC22000h(mo35789a = "/webcast/gift/duty_gift/")
    AbstractC88979t<C5832d<DutyGiftInfo>> dutyGiftRequest(@AbstractC22018z(mo35807a = "room_id") long j, @AbstractC22018z(mo35807a = "anchor_id") long j2, @AbstractC22018z(mo35807a = "op_type") long j3, @AbstractC22018z(mo35807a = "is_cut_short") boolean z);
}
