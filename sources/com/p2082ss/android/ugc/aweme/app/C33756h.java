package com.p2082ss.android.ugc.aweme.app;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.net.CommonApi;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.app.h */
public final class C33756h {

    /* renamed from: a */
    public static final String f79964a = (Api.f79771d + "/aweme/v1/check/in/");

    /* renamed from: b */
    public static final String f79965b = (Api.f79771d + "/aweme/v1/check/out/");

    /* renamed from: c */
    public static final CommonApi f79966c = ((CommonApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f79771d).create(CommonApi.class));

    /* renamed from: d */
    private static final String f79967d = (Api.f79771d + "/aweme/v1/device/update/");

    /* renamed from: a */
    public static void m69101a() {
        C34608n.m70658a().mo61083a(null, new Callable() {
            /* class com.p2082ss.android.ugc.aweme.app.C33756h.CallableC337571 */

            static {
                Covode.recordClassIndex(40652);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                Api.m68817a(C33756h.f79966c.doGet(C33756h.f79964a).execute().f52262b, C33756h.f79964a);
                return null;
            }
        }, 0);
    }

    static {
        Covode.recordClassIndex(40651);
    }
}
