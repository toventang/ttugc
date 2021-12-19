package com.p2082ss.android.ugc.aweme.relation.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.friends.model.RecommendUserDialogList;
import com.p2082ss.android.ugc.aweme.relation.CheckMatchedFriendsResponse;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.relation.api.RelationApi */
public interface RelationApi {

    /* renamed from: a */
    public static final C66859a f150132a = C66859a.f150133a;

    static {
        Covode.recordClassIndex(78433);
    }

    @AbstractC89722f(mo144276a = "/tiktok/user/relation/matched_friends/check/v1")
    AbstractC88403ab<CheckMatchedFriendsResponse> checkMatchedFriends();

    @AbstractC89722f(mo144276a = "/tiktok/user/relation/matched_friends/get/v1")
    AbstractC88979t<RecommendUserDialogList> fetchMatchedFriendsList(@AbstractC89736t(mo144292a = "count") int i, @AbstractC89736t(mo144292a = "cursor") int i2, @AbstractC89736t(mo144292a = "platforms") String str);

    @AbstractC89722f(mo144276a = "/tiktok/v1/fyp/user/recommendations/")
    AbstractC88979t<RecommendUserDialogList> fetchUserRecommendationsList(@AbstractC89736t(mo144292a = "count") int i, @AbstractC89736t(mo144292a = "cursor") int i2, @AbstractC89736t(mo144292a = "skip_platforms") String str);

    /* renamed from: com.ss.android.ugc.aweme.relation.api.RelationApi$a */
    public static final class C66859a {

        /* renamed from: a */
        static final /* synthetic */ C66859a f150133a = new C66859a();

        private C66859a() {
        }

        static {
            Covode.recordClassIndex(78434);
        }

        /* renamed from: a */
        public static RelationApi m118565a() {
            Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f79771d).create(RelationApi.class);
            C89219l.m154716b(create, "");
            return (RelationApi) create;
        }
    }
}
