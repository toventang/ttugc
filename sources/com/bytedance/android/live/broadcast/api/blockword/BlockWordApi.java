package com.bytedance.android.live.broadcast.api.blockword;

import com.bytedance.android.live.broadcast.api.blockword.model.BlockWordGetExtra;
import com.bytedance.android.live.broadcast.api.blockword.model.C3044b;
import com.bytedance.android.live.broadcast.api.blockword.model.C3045c;
import com.bytedance.android.live.network.response.C5830b;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import p4560f.p4561a.AbstractC88979t;

public interface BlockWordApi {
    static {
        Covode.recordClassIndex(3498);
    }

    @AbstractC22000h(mo35789a = "/webcast/room/add_sensitive_word/")
    AbstractC88979t<C5832d<C3044b>> addBlockWord(@AbstractC22018z(mo35807a = "word") String str, @AbstractC22018z(mo35807a = "sec_anchor_id") String str2, @AbstractC22018z(mo35807a = "room_id") long j);

    @AbstractC22000h(mo35789a = "/webcast/room/del_sensitive_word/")
    AbstractC88979t<C5832d<Object>> deleteBlockWord(@AbstractC22018z(mo35807a = "word_id") int i, @AbstractC22018z(mo35807a = "sec_anchor_id") String str, @AbstractC22018z(mo35807a = "room_id") long j);

    @AbstractC22000h(mo35789a = "/webcast/room/get_sensitive_word/")
    AbstractC88979t<C5830b<C3045c, BlockWordGetExtra>> getBlockWord(@AbstractC22018z(mo35807a = "sec_anchor_id") String str, @AbstractC22018z(mo35807a = "room_id") long j);
}
