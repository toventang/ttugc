package com.p2082ss.android.ugc.aweme.landpage;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;

/* renamed from: com.ss.android.ugc.aweme.landpage.AdLandPageServiceImpl */
public final class AdLandPageServiceImpl implements IAdLandPageService {
    static {
        Covode.recordClassIndex(68104);
    }

    @Override // com.p2082ss.android.ugc.aweme.landpage.IAdLandPageService
    /* renamed from: a */
    public final String mo95564a() {
        return "ad_commerce";
    }

    /* renamed from: b */
    public static IAdLandPageService m104886b() {
        MethodCollector.m26663i(9200);
        Object a = C81908b.m141854a(IAdLandPageService.class, false);
        if (a != null) {
            IAdLandPageService iAdLandPageService = (IAdLandPageService) a;
            MethodCollector.m26664o(9200);
            return iAdLandPageService;
        }
        if (C81908b.f183221bX == null) {
            synchronized (IAdLandPageService.class) {
                try {
                    if (C81908b.f183221bX == null) {
                        C81908b.f183221bX = new AdLandPageServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9200);
                    throw th;
                }
            }
        }
        AdLandPageServiceImpl adLandPageServiceImpl = (AdLandPageServiceImpl) C81908b.f183221bX;
        MethodCollector.m26664o(9200);
        return adLandPageServiceImpl;
    }
}
