package com.p2082ss.android.ugc.aweme.account.apiguard;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.retrofit2.p1612c.AbstractC22021a;
import com.google.p1998c.p2001c.AbstractC27349ab;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.C31291a;
import com.p2082ss.android.ugc.aweme.IApiGuardService;
import com.p2082ss.android.ugc.aweme.utils.C80213ah;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.apiguard.ApiGuardService */
public final class ApiGuardService implements IApiGuardService {
    public static final C31573a Companion = new C31573a((byte) 0);
    private static final String PROD_KEY = "PROD";
    private static final String QA_KEY = "QA";
    private static final String TAG = "apiguard";
    private static volatile boolean didInit;
    private static final AtomicBoolean didStartInit = new AtomicBoolean(false);

    /* renamed from: com.ss.android.ugc.aweme.account.apiguard.ApiGuardService$a */
    public static final class C31573a {
        static {
            Covode.recordClassIndex(38298);
        }

        private C31573a() {
        }

        public /* synthetic */ C31573a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.IApiGuardService
    public final AbstractC22021a getInterceptor() {
        return new ApiGuardInterceptor();
    }

    @Override // com.p2082ss.android.ugc.aweme.IApiGuardService
    public final boolean isEnabled() {
        return C31574a.m65858a();
    }

    @Override // com.p2082ss.android.ugc.aweme.IApiGuardService
    public final void initializeApiGuard() {
        Application application = C31291a.f74991a;
        C89219l.m154716b(application, "");
        tryInit(application);
    }

    static {
        Covode.recordClassIndex(38297);
    }

    @Override // com.p2082ss.android.ugc.aweme.IApiGuardService
    public final void parseHeaders(Map<String, String> map) {
        C89219l.m154721d(map, "");
        boolean z = didInit;
    }

    private final void init(Application application) {
        C89219l.m154716b(C80213ah.m139041a(), "");
    }

    private final void tryInit(Application application) {
        if (C31574a.m65858a() && !didInit && didStartInit.compareAndSet(false, true)) {
            init(application);
            didInit = true;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.IApiGuardService
    public final Map<String, String> getHeaders(String str) {
        C89219l.m154721d(str, "");
        if (!didInit) {
            AbstractC27349ab of = AbstractC27349ab.m54638of();
            C89219l.m154716b(of, "");
            return of;
        }
        AbstractC27349ab of2 = AbstractC27349ab.m54638of();
        C89219l.m154716b(of2, "");
        return of2;
    }

    public static IApiGuardService createIApiGuardServicebyMonsterPlugin(boolean z) {
        MethodCollector.m26663i(11340);
        Object a = C81908b.m141854a(IApiGuardService.class, z);
        if (a != null) {
            IApiGuardService iApiGuardService = (IApiGuardService) a;
            MethodCollector.m26664o(11340);
            return iApiGuardService;
        }
        if (C81908b.f183417z == null) {
            synchronized (IApiGuardService.class) {
                try {
                    if (C81908b.f183417z == null) {
                        C81908b.f183417z = new ApiGuardService();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(11340);
                    throw th;
                }
            }
        }
        ApiGuardService apiGuardService = (ApiGuardService) C81908b.f183417z;
        MethodCollector.m26664o(11340);
        return apiGuardService;
    }
}
