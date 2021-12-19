package com.bytedance.android.livesdk.firstrecharge;

import com.bytedance.android.live.network.p380a.AbstractC5796a;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC21997e;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import p4560f.p4561a.AbstractC88979t;

public interface FirstRechargeApi {
    static {
        Covode.recordClassIndex(9599);
    }

    @AbstractC21999g
    @AbstractC5796a(mo11568a = AbstractC5796a.EnumC5797a.GIFT)
    @AbstractC22012t(mo35799a = "/webcast/diamond/first_charge/")
    AbstractC88979t<C5832d<C8726a>> syncFirstRechargeInfo(@AbstractC21997e(mo35786a = "live_id") Long l, @AbstractC21997e(mo35786a = "currency") String str);
}
