package com.p2082ss.android.ugc.aweme.app;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;

/* renamed from: com.ss.android.ugc.aweme.app.AwemeApplicationServiceImpl */
public class AwemeApplicationServiceImpl implements IAwemeApplicationService {
    static {
        Covode.recordClassIndex(40426);
    }

    @Override // com.p2082ss.android.ugc.aweme.app.IAwemeApplicationService
    /* renamed from: a */
    public final boolean mo59702a() {
        return C33836o.m69201a().f80094a.f121705b;
    }

    @Override // com.p2082ss.android.ugc.aweme.app.IAwemeApplicationService
    /* renamed from: b */
    public final boolean mo59703b() {
        return C33836o.m69201a().f80094a.mo89311a();
    }

    /* renamed from: c */
    public static IAwemeApplicationService m68723c() {
        MethodCollector.m26663i(6108);
        Object a = C81908b.m141854a(IAwemeApplicationService.class, false);
        if (a != null) {
            IAwemeApplicationService iAwemeApplicationService = (IAwemeApplicationService) a;
            MethodCollector.m26664o(6108);
            return iAwemeApplicationService;
        }
        if (C81908b.f183127J == null) {
            synchronized (IAwemeApplicationService.class) {
                try {
                    if (C81908b.f183127J == null) {
                        C81908b.f183127J = new AwemeApplicationServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6108);
                    throw th;
                }
            }
        }
        AwemeApplicationServiceImpl awemeApplicationServiceImpl = (AwemeApplicationServiceImpl) C81908b.f183127J;
        MethodCollector.m26664o(6108);
        return awemeApplicationServiceImpl;
    }
}
