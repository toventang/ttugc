package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdk.chatroom.model.ShareReportResult;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC21997e;
import com.bytedance.retrofit2.p1610b.AbstractC21998f;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import java.util.HashMap;
import p4560f.p4561a.AbstractC88979t;

public interface RetrofitApi {
    static {
        Covode.recordClassIndex(8048);
    }

    @AbstractC22012t(mo35799a = "/webcast/room/share/")
    @AbstractC21999g
    AbstractC88979t<C5832d<ShareReportResult>> sendShare(@AbstractC21997e(mo35786a = "room_id") long j, @AbstractC21998f HashMap<String, String> hashMap);
}
