package com.p2082ss.android.ugc.aweme.follow.api;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.ugc.aweme.follow.presenter.FollowFeedList;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.follow.api.FollowFeedApiV2 */
public interface FollowFeedApiV2 {
    static {
        Covode.recordClassIndex(60253);
    }

    @AbstractC89722f(mo144276a = "/aweme/v2/follow/feed/")
    AbstractFutureC27655q<FollowFeedList> getFollowFeedListNew(@AbstractC89736t(mo144292a = "follow_req_index") int i, @AbstractC89736t(mo144292a = "cursor") long j, @AbstractC89736t(mo144292a = "level") int i2, @AbstractC89736t(mo144292a = "count") int i3, @AbstractC89736t(mo144292a = "pull_type") int i4, @AbstractC89736t(mo144292a = "feed_style") int i5, @AbstractC89736t(mo144292a = "enter_time") long j2, @AbstractC89736t(mo144292a = "rec_impr_users") String str, @AbstractC89736t(mo144292a = "aweme_id") String str2, @AbstractC89736t(mo144292a = "aweme_ids") String str3, @AbstractC89736t(mo144292a = "push_params") String str4, @AbstractC89736t(mo144292a = "last_follow_uid") String str5, @AbstractC89736t(mo144292a = "address_book_access") int i6, @AbstractC89736t(mo144292a = "filter_strategy") int i7, @AbstractC89736t(mo144292a = "notice_count_log_id") String str6, @AbstractC89736t(mo144292a = "notice_item_count") Integer num, @AbstractC89736t(mo144292a = "notice_live_count") Integer num2, @AbstractC89736t(mo144292a = "notice_count_type") Integer num3, @AbstractC89736t(mo144292a = "notice_link_author_id") Long l, @AbstractC89736t(mo144292a = "notice_link_item_id") Long l2, @AbstractC89736t(mo144292a = "notice_is_display_live") Integer num4, @AbstractC89736t(mo144292a = "user_avatar_shrink") String str7);
}
