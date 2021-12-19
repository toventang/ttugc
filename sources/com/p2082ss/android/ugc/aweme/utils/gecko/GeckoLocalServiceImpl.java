package com.p2082ss.android.ugc.aweme.utils.gecko;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.i18n.language.i18n.GeckoLocalService;
import com.p2082ss.android.ugc.aweme.utils.C80333dc;

/* renamed from: com.ss.android.ugc.aweme.utils.gecko.GeckoLocalServiceImpl */
public class GeckoLocalServiceImpl implements GeckoLocalService {
    static {
        Covode.recordClassIndex(93752);
    }

    @Override // com.p2082ss.android.ugc.aweme.i18n.language.i18n.GeckoLocalService
    /* renamed from: a */
    public final void mo90016a() {
        C80333dc.m139284e();
    }

    /* renamed from: b */
    public static GeckoLocalService m139504b() {
        MethodCollector.m26663i(5907);
        Object a = C81908b.m141854a(GeckoLocalService.class, false);
        if (a != null) {
            GeckoLocalService geckoLocalService = (GeckoLocalService) a;
            MethodCollector.m26664o(5907);
            return geckoLocalService;
        }
        if (C81908b.f183358eB == null) {
            synchronized (GeckoLocalService.class) {
                try {
                    if (C81908b.f183358eB == null) {
                        C81908b.f183358eB = new GeckoLocalServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(5907);
                    throw th;
                }
            }
        }
        GeckoLocalServiceImpl geckoLocalServiceImpl = (GeckoLocalServiceImpl) C81908b.f183358eB;
        MethodCollector.m26664o(5907);
        return geckoLocalServiceImpl;
    }
}
