package com.bytedance.android.live.broadcast.api;

import com.bytedance.android.live.base.model.user.C2993a;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p1610b.AbstractC21994b;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import p4560f.p4561a.AbstractC88403ab;

public interface BroadcastUserApi {
    static {
        Covode.recordClassIndex(3483);
    }

    @AbstractC22012t(mo35799a = "/webcast/room/upload/image/")
    AbstractC88403ab<C5832d<C2993a>> uploadAvatar(@AbstractC21994b TypedOutput typedOutput);
}
