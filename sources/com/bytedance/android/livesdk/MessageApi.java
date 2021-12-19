package com.bytedance.android.livesdk;

import com.bytedance.android.p150e.p151a.p152a.C2726d;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.p1610b.AbstractC21996d;
import com.bytedance.retrofit2.p1610b.AbstractC21997e;
import com.bytedance.retrofit2.p1610b.AbstractC21998f;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.bytedance.retrofit2.p1610b.AbstractC22016x;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import java.util.Map;

public interface MessageApi {
    static {
        Covode.recordClassIndex(7151);
    }

    @AbstractC22012t(mo35799a = "/webcast/im/fetch/")
    @AbstractC21999g
    AbstractC21983b<C2726d.AbstractC2728b> fetchMessagePbByteArraySource(@AbstractC21997e(mo35786a = "room_id") long j, @AbstractC22018z(mo35807a = "keep_method") String str, @AbstractC21998f Map<String, String> map, @AbstractC21997e(mo35786a = "fetch_rule") int i, @AbstractC21996d Object obj);

    @AbstractC22012t(mo35799a = "/webcast/room/{room_id}/_fetch_message_polling/")
    @AbstractC21999g
    AbstractC21983b<C2726d.AbstractC2728b> fetchMessagePbByteArraySource(@AbstractC22016x(mo35804a = "room_id") long j, @AbstractC22018z(mo35807a = "keep_method") String str, @AbstractC21998f Map<String, String> map, @AbstractC21996d Object obj);
}
