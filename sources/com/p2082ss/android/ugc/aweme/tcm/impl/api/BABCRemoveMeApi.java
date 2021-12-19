package com.p2082ss.android.ugc.aweme.tcm.impl.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.p2082ss.android.ugc.aweme.feed.model.BABCRemoveMe;
import p4560f.p4561a.AbstractC88979t;

/* renamed from: com.ss.android.ugc.aweme.tcm.impl.api.BABCRemoveMeApi */
public interface BABCRemoveMeApi {
    static {
        Covode.recordClassIndex(90797);
    }

    @AbstractC22012t(mo35799a = "/aweme/v1/ad/ba/branded/content/remove/me/")
    AbstractC88979t<BABCRemoveMe> getBABCRemoveMe(@AbstractC22018z(mo35807a = "item_id") String str);
}
