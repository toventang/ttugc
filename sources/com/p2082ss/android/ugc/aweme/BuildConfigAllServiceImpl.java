package com.p2082ss.android.ugc.aweme;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.app.p2333k.C33799a;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.BuildConfigAllServiceImpl */
public class BuildConfigAllServiceImpl implements IBuildConfigAllService {
    static {
        Covode.recordClassIndex(37915);
    }

    /* renamed from: b */
    public static IBuildConfigAllService m65220b() {
        MethodCollector.m26663i(1699);
        Object a = C81908b.m141854a(IBuildConfigAllService.class, false);
        if (a != null) {
            IBuildConfigAllService iBuildConfigAllService = (IBuildConfigAllService) a;
            MethodCollector.m26664o(1699);
            return iBuildConfigAllService;
        }
        if (C81908b.f183404m == null) {
            synchronized (IBuildConfigAllService.class) {
                try {
                    if (C81908b.f183404m == null) {
                        C81908b.f183404m = new BuildConfigAllServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(1699);
                    throw th;
                }
            }
        }
        BuildConfigAllServiceImpl buildConfigAllServiceImpl = (BuildConfigAllServiceImpl) C81908b.f183404m;
        MethodCollector.m26664o(1699);
        return buildConfigAllServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.IBuildConfigAllService
    /* renamed from: a */
    public final boolean mo57028a() {
        if (C89361p.m154872a("startupTest", C33799a.f80046a, true) || C89361p.m154872a("MTraceStartup", C33799a.f80046a, true) || C89361p.m154872a("MTraceStartupDiff", C33799a.f80046a, true)) {
            return true;
        }
        return false;
    }
}
