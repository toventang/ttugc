package com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.fetch;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3173d.C55074a;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.a */
public final class C55834a {

    /* renamed from: a */
    public static FamiliarApi f127267a;

    static {
        Covode.recordClassIndex(65621);
        IRetrofitService createIRetrofitServicebyMonsterPlugin = RetrofitService.createIRetrofitServicebyMonsterPlugin(false);
        if (createIRetrofitServicebyMonsterPlugin != null) {
            f127267a = (FamiliarApi) createIRetrofitServicebyMonsterPlugin.createNewRetrofit(C55074a.f126040b).create(FamiliarApi.class);
        }
    }
}
