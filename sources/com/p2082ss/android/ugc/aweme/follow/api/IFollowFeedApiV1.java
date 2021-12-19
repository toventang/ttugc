package com.p2082ss.android.ugc.aweme.follow.api;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.ugc.aweme.follow.presenter.FollowFeedList;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89731o;

/* renamed from: com.ss.android.ugc.aweme.follow.api.IFollowFeedApiV1 */
public interface IFollowFeedApiV1 {
    static {
        Covode.recordClassIndex(60254);
    }

    @AbstractC89731o(mo144285a = "/aweme/v1/friend/feed/")
    @AbstractC89721e
    AbstractFutureC27655q<FollowFeedList> getFriendList(@AbstractC89719c(mo144273a = "max_cursor") long j, @AbstractC89719c(mo144273a = "min_cursor") long j2, @AbstractC89719c(mo144273a = "count") int i, @AbstractC89719c(mo144273a = "pull_type") int i2, @AbstractC89719c(mo144273a = "feed_style") int i3, @AbstractC89719c(mo144273a = "enter_time") long j3, @AbstractC89719c(mo144273a = "fetch_recommend") int i4, @AbstractC89719c(mo144273a = "impression_ids") String str, @AbstractC89719c(mo144273a = "is_up_phone") int i5, @AbstractC89719c(mo144273a = "is_recommend") int i6, @AbstractC89719c(mo144273a = "push_params") String str2, @AbstractC89719c(mo144273a = "address_book_access") int i7, @AbstractC89719c(mo144273a = "notice_count_log_id") String str3, @AbstractC89719c(mo144273a = "notice_item_count") Integer num, @AbstractC89719c(mo144273a = "notice_count_type") Integer num2, @AbstractC89719c(mo144273a = "notice_link_author_id") Long l, @AbstractC89719c(mo144273a = "notice_link_item_id") Long l2);

    @AbstractC89731o(mo144285a = "/aweme/v1/follow/feed/recommend/")
    @AbstractC89721e
    AbstractFutureC27655q<FollowFeedList> getRecommendList(@AbstractC89719c(mo144273a = "count") int i, @AbstractC89719c(mo144273a = "pull_type") int i2, @AbstractC89719c(mo144273a = "feed_style") int i3, @AbstractC89719c(mo144273a = "enter_time") long j, @AbstractC89719c(mo144273a = "impression_ids") String str, @AbstractC89719c(mo144273a = "last_feed_ids") String str2);
}
