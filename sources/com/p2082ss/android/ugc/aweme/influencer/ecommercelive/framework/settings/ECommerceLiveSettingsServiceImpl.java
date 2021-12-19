package com.p2082ss.android.ugc.aweme.influencer.ecommercelive.framework.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.influencer.ecommercelive.IECommerceLiveSettingsService;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.influencer.ecommercelive.framework.settings.ECommerceLiveSettingsServiceImpl */
public final class ECommerceLiveSettingsServiceImpl implements IECommerceLiveSettingsService {
    static {
        Covode.recordClassIndex(66501);
    }

    @Override // com.p2082ss.android.ugc.aweme.influencer.ecommercelive.IECommerceLiveSettingsService
    /* renamed from: a */
    public final boolean mo93516a() {
        return C89219l.m154714a((Object) C56658e.m102660a().f129127a, (Object) true);
    }

    @Override // com.p2082ss.android.ugc.aweme.influencer.ecommercelive.IECommerceLiveSettingsService
    /* renamed from: b */
    public final long mo93517b() {
        Long l = C56658e.m102660a().f129129c;
        if (l != null) {
            return l.longValue();
        }
        return 30000;
    }

    /* renamed from: c */
    public static IECommerceLiveSettingsService m102655c() {
        MethodCollector.m26663i(4446);
        Object a = C81908b.m141854a(IECommerceLiveSettingsService.class, false);
        if (a != null) {
            IECommerceLiveSettingsService iECommerceLiveSettingsService = (IECommerceLiveSettingsService) a;
            MethodCollector.m26664o(4446);
            return iECommerceLiveSettingsService;
        }
        if (C81908b.f183201bD == null) {
            synchronized (IECommerceLiveSettingsService.class) {
                try {
                    if (C81908b.f183201bD == null) {
                        C81908b.f183201bD = new ECommerceLiveSettingsServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(4446);
                    throw th;
                }
            }
        }
        ECommerceLiveSettingsServiceImpl eCommerceLiveSettingsServiceImpl = (ECommerceLiveSettingsServiceImpl) C81908b.f183201bD;
        MethodCollector.m26664o(4446);
        return eCommerceLiveSettingsServiceImpl;
    }
}
