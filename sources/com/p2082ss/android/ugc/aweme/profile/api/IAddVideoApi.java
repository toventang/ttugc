package com.p2082ss.android.ugc.aweme.profile.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.p2082ss.android.ugc.aweme.feed.model.FeedItemList;
import p4560f.p4561a.AbstractC88979t;

/* renamed from: com.ss.android.ugc.aweme.profile.api.IAddVideoApi */
public interface IAddVideoApi {
    static {
        Covode.recordClassIndex(74726);
    }

    @AbstractC22000h(mo35789a = "/aweme/v1/aweme/post/")
    AbstractC88979t<FeedItemList> getMyPublishVideos(@AbstractC22018z(mo35807a = "source") int i, @AbstractC22018z(mo35807a = "user_avatar_shrink") String str, @AbstractC22018z(mo35807a = "video_cover_shrink") String str2, @AbstractC22018z(mo35807a = "filter_private") int i2, @AbstractC22018z(mo35807a = "max_cursor") long j, @AbstractC22018z(mo35807a = "sec_user_id") String str3, @AbstractC22018z(mo35807a = "count") int i3);
}
