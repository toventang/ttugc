package com.p2082ss.android.ugc.aweme.app.services;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.app.services.RegionService */
public final class RegionService implements IRegionService {
    static {
        Covode.recordClassIndex(40755);
    }

    @Override // com.p2082ss.android.ugc.aweme.app.services.IRegionService
    /* renamed from: a */
    public final String mo60087a() {
        String g = C58071d.m104913g();
        C89219l.m154716b(g, "");
        return g;
    }

    /* renamed from: b */
    public static IRegionService m69268b() {
        MethodCollector.m26663i(2232);
        Object a = C81908b.m141854a(IRegionService.class, false);
        if (a != null) {
            IRegionService iRegionService = (IRegionService) a;
            MethodCollector.m26664o(2232);
            return iRegionService;
        }
        if (C81908b.f183132O == null) {
            synchronized (IRegionService.class) {
                try {
                    if (C81908b.f183132O == null) {
                        C81908b.f183132O = new RegionService();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(2232);
                    throw th;
                }
            }
        }
        RegionService regionService = (RegionService) C81908b.f183132O;
        MethodCollector.m26664o(2232);
        return regionService;
    }
}
