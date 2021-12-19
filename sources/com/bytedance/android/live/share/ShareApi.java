package com.bytedance.android.live.share;

import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.share.response.BatchShareUsersResult;
import com.bytedance.android.livesdk.chatroom.model.ShareReportResult;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC21997e;
import com.bytedance.retrofit2.p1610b.AbstractC21998f;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import java.util.HashMap;
import p4560f.p4561a.AbstractC88979t;

public interface ShareApi {
    static {
        Covode.recordClassIndex(6799);
    }

    @AbstractC22000h(mo35789a = "/webcast/interaction/share/list/")
    AbstractC88979t<C5832d<BatchShareUsersResult>> getBatchShareUsers(@AbstractC22018z(mo35807a = "room_id") long j);

    @AbstractC22012t(mo35799a = "/webcast/room/share/")
    @AbstractC21999g
    AbstractC88979t<C5832d<ShareReportResult>> sendShare(@AbstractC21997e(mo35786a = "room_id") long j, @AbstractC21998f HashMap<String, String> hashMap);

    @AbstractC22012t(mo35799a = "/webcast/interaction/share/submit/")
    @AbstractC21999g
    AbstractC88979t<C5832d<Void>> submitShare(@AbstractC21997e(mo35786a = "room_id") long j, @AbstractC21997e(mo35786a = "to_user_ids") String str);
}
