package com.bytedance.android.livesdk.feed.tab.api;

import com.bytedance.android.live.network.response.C5827a;
import com.bytedance.android.livesdk.feed.feed.C8587f;
import com.bytedance.android.livesdk.model.C9520ag;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import p4560f.p4561a.AbstractC88979t;

public interface FeedTabApi {
    static {
        Covode.recordClassIndex(9560);
    }

    @AbstractC22000h(mo35789a = "/webcast/tab/")
    AbstractC88979t<C5827a<C9520ag, C8587f>> queryTab(@AbstractC22018z(mo35807a = "live_entrance") int i);
}
