package com.p2082ss.android.ugc.aweme.p2282ad.feed.reminder;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.p2082ss.android.ugc.aweme.feed.model.AdNoticeModel;
import p4560f.p4561a.AbstractC88979t;

/* renamed from: com.ss.android.ugc.aweme.ad.feed.reminder.NoticeUpdateApi */
public interface NoticeUpdateApi {
    static {
        Covode.recordClassIndex(40160);
    }

    @AbstractC22012t(mo35799a = "/tiktok/v1/ad/notice/update/")
    AbstractC88979t<AdNoticeModel> postAdNotice(@AbstractC22018z(mo35807a = "creative_id") String str, @AbstractC22018z(mo35807a = "enable_notice") Boolean bool, @AbstractC22018z(mo35807a = "log_id") String str2);
}
