package com.bytedance.android.livesdk.usermanage;

import com.bytedance.android.live.network.response.C5827a;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdk.usermanage.p645a.C11056a;
import com.bytedance.android.livesdk.usermanage.p645a.C11057b;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC21997e;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import p4560f.p4561a.AbstractC88979t;

public interface AdminApi {
    static {
        Covode.recordClassIndex(12669);
    }

    @AbstractC22000h(mo35789a = "/webcast/user/admin/list/")
    AbstractC88979t<C5827a<C11057b, C11056a>> fetchAdministrators(@AbstractC22018z(mo35807a = "anchor_id") long j, @AbstractC22018z(mo35807a = "sec_anchor_id") String str, @AbstractC22018z(mo35807a = "sec_user_id") String str2);

    @AbstractC22012t(mo35799a = "/webcast/user/admin/update/")
    @AbstractC21999g
    AbstractC88979t<C5832d<Object>> updateAdmin(@AbstractC21997e(mo35786a = "update_type") int i, @AbstractC21997e(mo35786a = "to_user_id") long j, @AbstractC21997e(mo35786a = "anchor_id") long j2, @AbstractC21997e(mo35786a = "current_room_id") long j3);
}
