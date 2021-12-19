package com.p2082ss.android.ugc.aweme.p2282ad.feed.reminder;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.p2082ss.android.ugc.aweme.feed.model.AdNoticeModel;
import p4560f.p4561a.AbstractC88979t;

/* renamed from: com.ss.android.ugc.aweme.ad.feed.reminder.AdNoticeApi */
public interface AdNoticeApi {
    static {
        Covode.recordClassIndex(40159);
    }

    @AbstractC22000h(mo35789a = "/tiktok/v1/ad/notice/subscription/status/")
    AbstractC88979t<AdNoticeModel> getAdNotice(@AbstractC22018z(mo35807a = "creative_id") String str);
}
