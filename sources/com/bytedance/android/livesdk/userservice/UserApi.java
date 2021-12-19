package com.bytedance.android.livesdk.userservice;

import com.bytedance.android.live.base.model.user.C2993a;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdk.model.C9544ba;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p1610b.AbstractC21987aa;
import com.bytedance.retrofit2.p1610b.AbstractC21994b;
import com.bytedance.retrofit2.p1610b.AbstractC21997e;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import java.util.HashMap;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88979t;

public interface UserApi {
    static {
        Covode.recordClassIndex(12712);
    }

    @AbstractC22000h(mo35789a = "/webcast/user/attr/")
    AbstractC88403ab<C5832d<C9544ba>> getUserAttr(@AbstractC22018z(mo35807a = "attr_types") String str);

    @AbstractC22000h(mo35789a = "/webcast/user/")
    AbstractC88403ab<C5832d<User>> queryUser(@AbstractC22018z(mo35807a = "target_uid") long j, @AbstractC22018z(mo35807a = "packed_level") long j2, @AbstractC22018z(mo35807a = "sec_target_uid") String str);

    @AbstractC22000h(mo35789a = "/webcast/user/")
    AbstractC88403ab<C5832d<User>> queryUser(@AbstractC21987aa HashMap<String, String> hashMap);

    @AbstractC22012t(mo35799a = "/webcast/user/attr/update/")
    @AbstractC21999g
    AbstractC88979t<C5832d<Object>> updateSwitch(@AbstractC21997e(mo35786a = "attr_type") long j, @AbstractC21997e(mo35786a = "value") long j2);

    @AbstractC22012t(mo35799a = "/webcast/room/upload/image/")
    AbstractC88403ab<C5832d<C2993a>> uploadAvatar(@AbstractC21994b TypedOutput typedOutput);
}
