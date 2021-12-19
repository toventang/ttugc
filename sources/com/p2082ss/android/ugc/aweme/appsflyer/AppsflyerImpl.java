package com.p2082ss.android.ugc.aweme.appsflyer;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.launcher.service.appsflyer.IAppsflyerApi;
import com.p2082ss.android.ugc.aweme.utils.C80625r;

/* renamed from: com.ss.android.ugc.aweme.appsflyer.AppsflyerImpl */
public final class AppsflyerImpl implements IAppsflyerApi {
    static {
        Covode.recordClassIndex(40835);
    }

    @Override // com.p2082ss.android.ugc.aweme.launcher.service.appsflyer.IAppsflyerApi
    /* renamed from: a */
    public final void mo60155a() {
        C80625r.m139793a();
    }

    /* renamed from: b */
    public static IAppsflyerApi m69447b() {
        MethodCollector.m26663i(2135);
        Object a = C81908b.m141854a(IAppsflyerApi.class, false);
        if (a != null) {
            IAppsflyerApi iAppsflyerApi = (IAppsflyerApi) a;
            MethodCollector.m26664o(2135);
            return iAppsflyerApi;
        }
        if (C81908b.f183133P == null) {
            synchronized (IAppsflyerApi.class) {
                try {
                    if (C81908b.f183133P == null) {
                        C81908b.f183133P = new AppsflyerImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(2135);
                    throw th;
                }
            }
        }
        AppsflyerImpl appsflyerImpl = (AppsflyerImpl) C81908b.f183133P;
        MethodCollector.m26664o(2135);
        return appsflyerImpl;
    }
}
