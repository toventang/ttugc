package com.bytedance.android.live.publicscreen.impl.api;

import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.publicscreen.impl.api.p394a.C5897a;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC21997e;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import p4560f.p4561a.AbstractC88979t;

public interface PublicScreenApi {
    static {
        Covode.recordClassIndex(6504);
    }

    @AbstractC22012t(mo35799a = "/webcast/room/comment_translate/")
    @AbstractC21999g
    AbstractC88979t<C5832d<C5897a>> translateComment(@AbstractC21997e(mo35786a = "comment_content") String str, @AbstractC21997e(mo35786a = "anchor_id") long j);
}
