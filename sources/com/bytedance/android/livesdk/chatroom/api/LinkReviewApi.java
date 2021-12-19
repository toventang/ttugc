package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdk.chatroom.model.C7687g;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import p4560f.p4561a.AbstractC88403ab;

public interface LinkReviewApi {
    static {
        Covode.recordClassIndex(8044);
    }

    @AbstractC22000h(mo35789a = "/webcast/review/get_latest_ban_record/")
    AbstractC88403ab<C5832d<C7687g>> bannedInfo(@AbstractC22018z(mo35807a = "ban_type") int i);
}
