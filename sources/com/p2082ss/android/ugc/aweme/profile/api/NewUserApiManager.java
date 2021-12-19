package com.p2082ss.android.ugc.aweme.profile.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.friends.model.NewRecommendList;
import com.p2082ss.android.ugc.aweme.profile.model.NewUserCount;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import p077b.C1731i;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.profile.api.NewUserApiManager */
public final class NewUserApiManager {

    /* renamed from: a */
    private static NewUserApi f144005a = ((NewUserApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f79771d).create(NewUserApi.class));

    /* renamed from: com.ss.android.ugc.aweme.profile.api.NewUserApiManager$NewUserApi */
    interface NewUserApi {
        static {
            Covode.recordClassIndex(74728);
        }

        @AbstractC89722f(mo144276a = "/aweme/v2/new/recommend/user/count/")
        C1731i<NewUserCount> getNewUserCount();

        @AbstractC89722f(mo144276a = "/tiktok/v1/ffp/user/recommendations/")
        C1731i<NewRecommendList> recommendList4NewFindFriends(@AbstractC89736t(mo144292a = "count") Integer num, @AbstractC89736t(mo144292a = "cursor") Integer num2, @AbstractC89736t(mo144292a = "rec_impr_users") String str);
    }

    static {
        Covode.recordClassIndex(74727);
    }
}
