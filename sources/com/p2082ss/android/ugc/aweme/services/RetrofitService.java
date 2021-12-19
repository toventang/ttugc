package com.p2082ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.network.ext.C18097a;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p2082ss.android.ugc.aweme.framework.services.IRetrofitService;

/* renamed from: com.ss.android.ugc.aweme.services.RetrofitService */
public class RetrofitService implements IRetrofitService {
    static {
        Covode.recordClassIndex(79721);
    }

    @Override // com.p2082ss.android.ugc.aweme.framework.services.IRetrofitService
    public IRetrofit createNewRetrofit(final String str) {
        return new IRetrofit() {
            /* class com.p2082ss.android.ugc.aweme.services.RetrofitService.C678761 */

            static {
                Covode.recordClassIndex(79722);
            }

            @Override // com.p2082ss.android.ugc.aweme.framework.services.IRetrofit
            public <T> T create(Class<T> cls) {
                return (T) C18097a.m33697a(str).mo28858a(cls);
            }
        };
    }

    public static IRetrofitService createIRetrofitServicebyMonsterPlugin(boolean z) {
        MethodCollector.m26663i(8987);
        Object a = C81908b.m141854a(IRetrofitService.class, z);
        if (a != null) {
            IRetrofitService iRetrofitService = (IRetrofitService) a;
            MethodCollector.m26664o(8987);
            return iRetrofitService;
        }
        if (C81908b.f183354dy == null) {
            synchronized (IRetrofitService.class) {
                try {
                    if (C81908b.f183354dy == null) {
                        C81908b.f183354dy = new RetrofitService();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(8987);
                    throw th;
                }
            }
        }
        RetrofitService retrofitService = (RetrofitService) C81908b.f183354dy;
        MethodCollector.m26664o(8987);
        return retrofitService;
    }
}
