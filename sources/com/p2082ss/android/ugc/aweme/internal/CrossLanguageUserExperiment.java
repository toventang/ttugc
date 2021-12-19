package com.p2082ss.android.ugc.aweme.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.C81908b;

/* renamed from: com.ss.android.ugc.aweme.internal.CrossLanguageUserExperiment */
public final class CrossLanguageUserExperiment implements ICrossLanguageUserService {
    static {
        Covode.recordClassIndex(66675);
    }

    @Override // com.p2082ss.android.ugc.aweme.internal.ICrossLanguageUserService
    /* renamed from: b */
    public final boolean mo93973b() {
        return C56810c.m103051a();
    }

    @Override // com.p2082ss.android.ugc.aweme.internal.ICrossLanguageUserService
    /* renamed from: a */
    public final boolean mo93972a() {
        if (C16048b.m29633a().mo25412a(true, "enable_cla_creator_auth_flow", 0) == C56809b.f129378a) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static ICrossLanguageUserService m103003c() {
        MethodCollector.m26663i(6949);
        Object a = C81908b.m141854a(ICrossLanguageUserService.class, false);
        if (a != null) {
            ICrossLanguageUserService iCrossLanguageUserService = (ICrossLanguageUserService) a;
            MethodCollector.m26664o(6949);
            return iCrossLanguageUserService;
        }
        if (C81908b.f183206bI == null) {
            synchronized (ICrossLanguageUserService.class) {
                try {
                    if (C81908b.f183206bI == null) {
                        C81908b.f183206bI = new CrossLanguageUserExperiment();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6949);
                    throw th;
                }
            }
        }
        CrossLanguageUserExperiment crossLanguageUserExperiment = (CrossLanguageUserExperiment) C81908b.f183206bI;
        MethodCollector.m26664o(6949);
        return crossLanguageUserExperiment;
    }
}
