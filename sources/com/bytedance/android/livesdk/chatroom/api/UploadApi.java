package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.base.model.user.C2996c;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p1610b.AbstractC21994b;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88979t;

public interface UploadApi {
    static {
        Covode.recordClassIndex(8051);
    }

    @AbstractC22012t(mo35799a = "/webcast/certification/submit_cert_data/")
    AbstractC88403ab<C5832d<C2996c>> upload(@AbstractC21994b TypedOutput typedOutput);

    @AbstractC22012t(mo35799a = "/webcast/certification/submit_cert_data/")
    AbstractC88979t<C5832d<C2996c>> upload2(@AbstractC21994b TypedOutput typedOutput);
}
