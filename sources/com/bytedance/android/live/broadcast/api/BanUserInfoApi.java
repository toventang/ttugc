package com.bytedance.android.live.broadcast.api;

import com.bytedance.android.live.broadcast.model.C3256c;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import p4560f.p4561a.AbstractC88979t;

public interface BanUserInfoApi {
    static {
        Covode.recordClassIndex(3480);
    }

    @AbstractC22000h(mo35789a = "/webcast/review/get_latest_ban_record/")
    AbstractC88979t<C5832d<C3256c>> getBanUserInfo(@AbstractC22018z(mo35807a = "ban_type") int i);
}
