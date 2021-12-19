package com.p2082ss.android.ugc.aweme.friends.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;

/* renamed from: com.ss.android.ugc.aweme.friends.api.a */
public abstract /* synthetic */ class AbstractC51474a {
    static {
        Covode.recordClassIndex(60739);
    }

    /* renamed from: a */
    public static FriendApi m95881a() {
        return (FriendApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f79771d).create(FriendApi.class);
    }
}
