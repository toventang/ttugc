package com.p2082ss.android.ugc.aweme.feed.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.ugc.aweme.feed.model.PrivateUrlModel;

/* renamed from: com.ss.android.ugc.aweme.feed.api.FeedStatsApi */
public interface FeedStatsApi {
    static {
        Covode.recordClassIndex(57086);
    }

    @AbstractC22000h(mo35789a = "/aweme/v1/aweme/modify/visibility/")
    AbstractFutureC27655q<PrivateUrlModel> feedStats(@AbstractC22018z(mo35807a = "aweme_id") String str, @AbstractC22018z(mo35807a = "type") int i);

    @AbstractC22000h(mo35789a = "/aweme/v1/aweme/modify/visibility/")
    AbstractFutureC27655q<PrivateUrlModel> feedStats(@AbstractC22018z(mo35807a = "aweme_id") String str, @AbstractC22018z(mo35807a = "type") int i, @AbstractC22018z(mo35807a = "video_hide_search") Integer num, @AbstractC22018z(mo35807a = "dont_share") Integer num2, @AbstractC22018z(mo35807a = "dont_share_list") String str2);
}
