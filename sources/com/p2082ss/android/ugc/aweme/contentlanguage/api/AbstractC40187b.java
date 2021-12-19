package com.p2082ss.android.ugc.aweme.contentlanguage.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;

/* renamed from: com.ss.android.ugc.aweme.contentlanguage.api.b */
public abstract /* synthetic */ class AbstractC40187b {
    static {
        Covode.recordClassIndex(47982);
    }

    /* renamed from: a */
    public static LanguageApi m81299a() {
        return (LanguageApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f79771d).create(LanguageApi.class);
    }
}
