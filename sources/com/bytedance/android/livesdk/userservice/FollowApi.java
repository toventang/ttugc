package com.bytedance.android.livesdk.userservice;

import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC21997e;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import p4560f.p4561a.AbstractC88979t;

public interface FollowApi {
    static {
        Covode.recordClassIndex(12711);
    }

    @AbstractC22012t(mo35799a = "/webcast/user/relation/update/")
    @AbstractC21999g
    AbstractC88979t<C5832d<C11090a>> follow(@AbstractC21997e(mo35786a = "follow_type") int i, @AbstractC21997e(mo35786a = "to_user_id") long j, @AbstractC21997e(mo35786a = "current_room_id") long j2, @AbstractC21997e(mo35786a = "sec_user_id") String str, @AbstractC21997e(mo35786a = "sec_to_user_id") String str2);

    @AbstractC22012t(mo35799a = "/webcast/user/relation/update/")
    @AbstractC21999g
    AbstractC88979t<C5832d<C11090a>> unfollow(@AbstractC21997e(mo35786a = "follow_type") int i, @AbstractC21997e(mo35786a = "sec_user_id") String str, @AbstractC21997e(mo35786a = "to_user_id") long j, @AbstractC21997e(mo35786a = "sec_to_user_id") String str2, @AbstractC21997e(mo35786a = "current_room_id") long j2);
}
