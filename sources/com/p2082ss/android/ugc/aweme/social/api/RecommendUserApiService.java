package com.p2082ss.android.ugc.aweme.social.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.friends.model.NewRecommendList;
import com.p2082ss.android.ugc.aweme.friends.model.RecommendList;
import com.p2082ss.android.ugc.aweme.friends.model.RecommendUserDialogList;
import com.p2082ss.android.ugc.aweme.friends.model.RecommendUserInDMBean;
import com.p2082ss.android.ugc.aweme.friends.model.SuperAccountList;
import com.p2082ss.android.ugc.aweme.social.p3916c.C74723c;
import p077b.C1731i;
import p4560f.p4561a.AbstractC88979t;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89731o;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.social.api.RecommendUserApiService */
public final class RecommendUserApiService implements IRecommendUserApi {

    /* renamed from: a */
    public static final RecommendUserApiService f167940a = new RecommendUserApiService();

    /* renamed from: b */
    private final /* synthetic */ IRecommendUserApi f167941b = ((IRecommendUserApi) C74715a.f167942a.mo28858a(IRecommendUserApi.class));

    @Override // com.p2082ss.android.ugc.aweme.social.api.IRecommendUserApi
    @AbstractC89722f(mo144276a = "/aweme/v1/recommend/user/dislike/")
    public final AbstractC88979t<C89391z> dislikeRecommend(@AbstractC89736t(mo144292a = "user_id") String str, @AbstractC89736t(mo144292a = "sec_user_id") String str2, @AbstractC89736t(mo144292a = "scene") Integer num) {
        C89219l.m154721d(str, "");
        return this.f167941b.dislikeRecommend(str, str2, num);
    }

    @Override // com.p2082ss.android.ugc.aweme.social.api.IRecommendUserApi
    @AbstractC89722f(mo144276a = "/tiktok/v1/ffp/user/recommendations/")
    public final AbstractC88979t<NewRecommendList> fetchRecommendList4FindFriends(@AbstractC89736t(mo144292a = "count") Integer num, @AbstractC89736t(mo144292a = "cursor") Integer num2, @AbstractC89736t(mo144292a = "rec_impr_users") String str) {
        return this.f167941b.fetchRecommendList4FindFriends(num, num2, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.social.api.IRecommendUserApi
    @AbstractC89722f(mo144276a = "/tiktok/v1/fyp/user/recommendations/")
    public final C1731i<RecommendUserDialogList> fetchRecommendUserDialoList(@AbstractC89736t(mo144292a = "count") Integer num, @AbstractC89736t(mo144292a = "cursor") Integer num2, @AbstractC89736t(mo144292a = "rec_impr_users") String str) {
        return this.f167941b.fetchRecommendUserDialoList(num, num2, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.social.api.IRecommendUserApi
    @AbstractC89722f(mo144276a = "/tiktok/v1/dmp/user/recommendations/")
    public final AbstractC88979t<RecommendUserInDMBean> fetchRecommendUserForDMPage() {
        return this.f167941b.fetchRecommendUserForDMPage();
    }

    @Override // com.p2082ss.android.ugc.aweme.social.api.IRecommendUserApi
    @AbstractC89731o(mo144285a = "/aweme/v1/multi/commit/follow/user/")
    @AbstractC89721e
    public final C1731i<BaseResponse> followUsers(@AbstractC89719c(mo144273a = "user_ids") String str, @AbstractC89719c(mo144273a = "sec_user_ids") String str2, @AbstractC89719c(mo144273a = "type") int i) {
        return this.f167941b.followUsers(str, str2, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.social.api.IRecommendUserApi
    @AbstractC89722f(mo144276a = "/tiktok/user/relation/maf/list/v1")
    public final AbstractC88979t<C74723c> getMAFList(@AbstractC89736t(mo144292a = "maf_scene") int i, @AbstractC89736t(mo144292a = "count") int i2) {
        return this.f167941b.getMAFList(i, i2);
    }

    @Override // com.p2082ss.android.ugc.aweme.social.api.IRecommendUserApi
    @AbstractC89731o(mo144285a = "/aweme/v1/commit/user/extra/")
    @AbstractC89721e
    public final C1731i<BaseResponse> modifyUser(@AbstractC89719c(mo144273a = "need_recommend") int i) {
        return this.f167941b.modifyUser(i);
    }

    @Override // com.p2082ss.android.ugc.aweme.social.api.IRecommendUserApi
    @AbstractC89722f(mo144276a = "/aweme/v2/user/recommend/")
    public final C1731i<RecommendList> recommendList(@AbstractC89736t(mo144292a = "count") Integer num, @AbstractC89736t(mo144292a = "cursor") Integer num2, @AbstractC89736t(mo144292a = "target_user_id") String str, @AbstractC89736t(mo144292a = "recommend_type") Integer num3, @AbstractC89736t(mo144292a = "yellow_point_count") Integer num4, @AbstractC89736t(mo144292a = "address_book_access") Integer num5, @AbstractC89736t(mo144292a = "rec_impr_users") String str2, @AbstractC89736t(mo144292a = "sec_target_user_id") String str3) {
        return this.f167941b.recommendList(num, num2, str, num3, num4, num5, str2, str3);
    }

    @Override // com.p2082ss.android.ugc.aweme.social.api.IRecommendUserApi
    @AbstractC89722f(mo144276a = "/aweme/v2/user/recommend/")
    public final C1731i<RecommendList> recommendList(@AbstractC89736t(mo144292a = "count") Integer num, @AbstractC89736t(mo144292a = "cursor") Integer num2, @AbstractC89736t(mo144292a = "target_user_id") String str, @AbstractC89736t(mo144292a = "recommend_type") Integer num3, @AbstractC89736t(mo144292a = "yellow_point_count") Integer num4, @AbstractC89736t(mo144292a = "address_book_access") Integer num5, @AbstractC89736t(mo144292a = "rec_impr_users") String str2, @AbstractC89736t(mo144292a = "sec_target_user_id") String str3, @AbstractC89736t(mo144292a = "show_super_account_when_follow_empty") int i) {
        return this.f167941b.recommendList(num, num2, str, num3, num4, num5, str2, str3, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.social.api.IRecommendUserApi
    @AbstractC89722f(mo144276a = "/aweme/v2/user/recommend/")
    public final C1731i<RecommendList> recommendList(@AbstractC89736t(mo144292a = "count") Integer num, @AbstractC89736t(mo144292a = "cursor") Integer num2, @AbstractC89736t(mo144292a = "target_user_id") String str, @AbstractC89736t(mo144292a = "recommend_type") Integer num3, @AbstractC89736t(mo144292a = "yellow_point_count") Integer num4, @AbstractC89736t(mo144292a = "address_book_access") Integer num5, @AbstractC89736t(mo144292a = "rec_impr_users") String str2, @AbstractC89736t(mo144292a = "push_user_id") String str3, @AbstractC89736t(mo144292a = "sec_target_user_id") String str4, @AbstractC89736t(mo144292a = "sec_push_user_id") String str5) {
        return this.f167941b.recommendList(num, num2, str, num3, num4, num5, str2, str3, str4, str5);
    }

    @Override // com.p2082ss.android.ugc.aweme.social.api.IRecommendUserApi
    @AbstractC89722f(mo144276a = "/aweme/v2/user/recommend/")
    public final AbstractC88979t<RecommendList> recommendList(@AbstractC89736t(mo144292a = "count") Integer num, @AbstractC89736t(mo144292a = "cursor") Integer num2, @AbstractC89736t(mo144292a = "target_user_id") String str, @AbstractC89736t(mo144292a = "recommend_type") int i, @AbstractC89736t(mo144292a = "yellow_point_count") Integer num3, @AbstractC89736t(mo144292a = "address_book_access") Integer num4, @AbstractC89736t(mo144292a = "rec_impr_users") String str2, @AbstractC89736t(mo144292a = "push_user_id") String str3, @AbstractC89736t(mo144292a = "sec_target_user_id") String str4) {
        return this.f167941b.recommendList(num, num2, str, i, num3, num4, str2, str3, str4);
    }

    @Override // com.p2082ss.android.ugc.aweme.social.api.IRecommendUserApi
    @AbstractC89722f(mo144276a = "/tiktok/v1/ffp/user/recommendations/")
    public final C1731i<NewRecommendList> recommendList4NewFindFriends(@AbstractC89736t(mo144292a = "count") Integer num, @AbstractC89736t(mo144292a = "cursor") Integer num2, @AbstractC89736t(mo144292a = "rec_impr_users") String str) {
        return this.f167941b.recommendList4NewFindFriends(num, num2, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.social.api.IRecommendUserApi
    @AbstractC89722f(mo144276a = "/aweme/v1/profile/user/recommend/")
    public final C1731i<RecommendList> recommendListMT(@AbstractC89736t(mo144292a = "count") Integer num, @AbstractC89736t(mo144292a = "cursor") Integer num2, @AbstractC89736t(mo144292a = "rec_impr_users") String str, @AbstractC89736t(mo144292a = "sec_target_user_id") String str2, @AbstractC89736t(mo144292a = "scenario") Integer num3, @AbstractC89736t(mo144292a = "with_inviter") boolean z) {
        return this.f167941b.recommendListMT(num, num2, str, str2, num3, z);
    }

    @Override // com.p2082ss.android.ugc.aweme.social.api.IRecommendUserApi
    @AbstractC89722f(mo144276a = "/aweme/v1/profile/user/recommend/")
    public final AbstractC88979t<RecommendList> recommendListMT(@AbstractC89736t(mo144292a = "count") Integer num, @AbstractC89736t(mo144292a = "cursor") Integer num2, @AbstractC89736t(mo144292a = "rec_impr_users") String str, @AbstractC89736t(mo144292a = "sec_target_user_id") String str2, @AbstractC89736t(mo144292a = "scenario") Integer num3, @AbstractC89736t(mo144292a = "filters") String str3, @AbstractC89736t(mo144292a = "with_inviter") boolean z) {
        C89219l.m154721d(str3, "");
        return this.f167941b.recommendListMT(num, num2, str, str2, num3, str3, z);
    }

    @Override // com.p2082ss.android.ugc.aweme.social.api.IRecommendUserApi
    @AbstractC89722f(mo144276a = "/aweme/v1/profile/user/recommend/")
    public final C1731i<RecommendList> recommendListTask(@AbstractC89736t(mo144292a = "count") Integer num, @AbstractC89736t(mo144292a = "cursor") Integer num2, @AbstractC89736t(mo144292a = "rec_impr_users") String str, @AbstractC89736t(mo144292a = "sec_target_user_id") String str2, @AbstractC89736t(mo144292a = "scenario") Integer num3, @AbstractC89736t(mo144292a = "filters") String str3, @AbstractC89736t(mo144292a = "with_inviter") boolean z) {
        C89219l.m154721d(str3, "");
        return this.f167941b.recommendListTask(num, num2, str, str2, num3, str3, z);
    }

    @Override // com.p2082ss.android.ugc.aweme.social.api.IRecommendUserApi
    @AbstractC89722f(mo144276a = "/aweme/v1/following/page/user/recommend/")
    public final C1731i<SuperAccountList> recommendSuperAccount() {
        return this.f167941b.recommendSuperAccount();
    }

    static {
        Covode.recordClassIndex(87551);
    }

    private RecommendUserApiService() {
    }
}
