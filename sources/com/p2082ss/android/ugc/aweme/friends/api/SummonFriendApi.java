package com.p2082ss.android.ugc.aweme.friends.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.friends.C51475b;
import com.p2082ss.android.ugc.aweme.friends.model.FollowUserListModel;
import com.p2082ss.android.ugc.aweme.friends.model.RecentFriendModel;
import com.p2082ss.android.ugc.aweme.friends.model.SummonFriendList;
import com.p2082ss.android.ugc.aweme.p2401bq.p2402a.C34910c;
import com.p2082ss.android.ugc.aweme.p2401bq.p2402a.C34911d;
import p4560f.p4561a.AbstractC88979t;

/* renamed from: com.ss.android.ugc.aweme.friends.api.SummonFriendApi */
public final class SummonFriendApi {

    /* renamed from: a */
    public static final SummonFriendService f118656a = ((SummonFriendService) RetrofitFactory.m33635a().mo28816a(C29736b.f70924e).mo28858a(SummonFriendService.class));

    /* renamed from: com.ss.android.ugc.aweme.friends.api.SummonFriendApi$SummonFriendService */
    public interface SummonFriendService {
        static {
            Covode.recordClassIndex(60736);
        }

        @AbstractC22000h(mo35789a = "/tiktok/interaction/mention/general/check/v1")
        AbstractC21983b<C34910c> batchCheckMentionPrivacy(@AbstractC22018z(mo35807a = "uids") String str, @AbstractC22018z(mo35807a = "mention_type") String str2, @AbstractC22018z(mo35807a = "is_check_aweme") boolean z, @AbstractC22018z(mo35807a = "aweme_id") long j);

        @AbstractC22000h(mo35789a = "/aweme/v1/user/following/list/")
        AbstractC21983b<FollowUserListModel> queryFollowFriends(@AbstractC22018z(mo35807a = "count") int i, @AbstractC22018z(mo35807a = "user_id") String str, @AbstractC22018z(mo35807a = "sec_user_id") String str2, @AbstractC22018z(mo35807a = "max_time") long j, @AbstractC22018z(mo35807a = "min_time") long j2, @AbstractC22018z(mo35807a = "address_book_access") int i2);

        @AbstractC22000h(mo35789a = "/aweme/v1/at/default/list/")
        AbstractC88979t<RecentFriendModel> queryFollowFriends4At(@AbstractC22018z(mo35807a = "count") int i, @AbstractC22018z(mo35807a = "cursor") int i2);

        @AbstractC22000h(mo35789a = "/aweme/v1/user/recent/contact/")
        AbstractC21983b<RecentFriendModel> queryRecentFriends();

        @AbstractC22000h(mo35789a = "/aweme/v1/user/recent/contact/")
        AbstractC88979t<RecentFriendModel> queryRecentFriends4At();

        @AbstractC22000h(mo35789a = "/tiktok/interaction/mention/recent/contact/query/v1")
        AbstractC88979t<C34911d> queryRecentFriends4AtV2(@AbstractC22018z(mo35807a = "mention_type") long j);

        @AbstractC22000h(mo35789a = "/tiktok/interaction/mention/recent/contact/query/v1")
        AbstractC21983b<C34911d> queryRecentFriendsV2(@AbstractC22018z(mo35807a = "mention_type") long j);

        @AbstractC22000h(mo35789a = "/aweme/v1/discover/search/")
        AbstractC21983b<SummonFriendList> searchFriends(@AbstractC22018z(mo35807a = "keyword") String str, @AbstractC22018z(mo35807a = "count") long j, @AbstractC22018z(mo35807a = "cursor") long j2, @AbstractC22018z(mo35807a = "type") int i, @AbstractC22018z(mo35807a = "search_source") String str2, @AbstractC22018z(mo35807a = "filter_block") int i2);
    }

    static {
        Covode.recordClassIndex(60735);
    }

    /* renamed from: a */
    public static C34911d m95876a(long j) {
        return f118656a.queryRecentFriendsV2(j).execute().f52262b;
    }

    /* renamed from: a */
    public static AbstractC88979t<RecentFriendModel> m95879a(int i, int i2) {
        return C51475b.m95882a(f118656a, 20, i2);
    }

    /* renamed from: a */
    public static SummonFriendList m95878a(String str, long j, long j2, String str2) {
        return f118656a.searchFriends(str, j2, j, 1, str2, 1).execute().f52262b;
    }

    /* renamed from: a */
    public static FollowUserListModel m95877a(int i, long j, String str, String str2, int i2) {
        return f118656a.queryFollowFriends(i, str, str2, j, 0, i2).execute().f52262b;
    }
}
