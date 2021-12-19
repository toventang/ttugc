package com.p2082ss.android.ugc.aweme.commercialize.live.promote.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.p2082ss.android.ugc.aweme.feed.model.PromoteEntryCheck;
import p4560f.p4561a.AbstractC88979t;

/* renamed from: com.ss.android.ugc.aweme.commercialize.live.promote.api.PromoteEntryCheckApi */
public interface PromoteEntryCheckApi {
    static {
        Covode.recordClassIndex(45604);
    }

    @AbstractC22000h(mo35789a = "/aweme/v1/promote/api/entry/check/")
    AbstractC88979t<PromoteEntryCheck> getPromoteEntryCheck(@AbstractC22018z(mo35807a = "item_id") String str, @AbstractC22018z(mo35807a = "source") String str2);
}
