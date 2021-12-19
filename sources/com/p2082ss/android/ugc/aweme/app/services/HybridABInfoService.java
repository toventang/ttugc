package com.p2082ss.android.ugc.aweme.app.services;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.app.services.HybridABInfoService */
public final class HybridABInfoService implements IHybridABInfoService {

    /* renamed from: a */
    private Boolean f80133a;

    static {
        Covode.recordClassIndex(40746);
    }

    /* renamed from: b */
    public static IHybridABInfoService m69246b() {
        MethodCollector.m26663i(3714);
        Object a = C81908b.m141854a(IHybridABInfoService.class, false);
        if (a != null) {
            IHybridABInfoService iHybridABInfoService = (IHybridABInfoService) a;
            MethodCollector.m26664o(3714);
            return iHybridABInfoService;
        }
        if (C81908b.f183130M == null) {
            synchronized (IHybridABInfoService.class) {
                try {
                    if (C81908b.f183130M == null) {
                        C81908b.f183130M = new HybridABInfoService();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3714);
                    throw th;
                }
            }
        }
        HybridABInfoService hybridABInfoService = (HybridABInfoService) C81908b.f183130M;
        MethodCollector.m26664o(3714);
        return hybridABInfoService;
    }

    @Override // com.p2082ss.android.ugc.aweme.app.services.IHybridABInfoService
    /* renamed from: a */
    public final Integer mo60084a() {
        Boolean bool = this.f80133a;
        if (C89219l.m154714a((Object) bool, (Object) true)) {
            return 1;
        }
        if (C89219l.m154714a((Object) bool, (Object) false)) {
            return 0;
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.app.services.IHybridABInfoService
    /* renamed from: a */
    public final void mo60085a(boolean z) {
        this.f80133a = Boolean.valueOf(z);
    }
}
