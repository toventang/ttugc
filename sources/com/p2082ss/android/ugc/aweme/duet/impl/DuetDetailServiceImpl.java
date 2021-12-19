package com.p2082ss.android.ugc.aweme.duet.impl;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa;
import com.p2082ss.android.ugc.aweme.duet.p2814a.C43257d;
import com.p2082ss.android.ugc.aweme.tools.detail.IDuetDetailService;

/* renamed from: com.ss.android.ugc.aweme.duet.impl.DuetDetailServiceImpl */
public final class DuetDetailServiceImpl implements IDuetDetailService {
    static {
        Covode.recordClassIndex(51465);
    }

    /* renamed from: a */
    public static IDuetDetailService m86367a() {
        MethodCollector.m26663i(9700);
        Object a = C81908b.m141854a(IDuetDetailService.class, false);
        if (a != null) {
            IDuetDetailService iDuetDetailService = (IDuetDetailService) a;
            MethodCollector.m26664o(9700);
            return iDuetDetailService;
        }
        if (C81908b.f183227bd == null) {
            synchronized (IDuetDetailService.class) {
                try {
                    if (C81908b.f183227bd == null) {
                        C81908b.f183227bd = new DuetDetailServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9700);
                    throw th;
                }
            }
        }
        DuetDetailServiceImpl duetDetailServiceImpl = (DuetDetailServiceImpl) C81908b.f183227bd;
        MethodCollector.m26664o(9700);
        return duetDetailServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.detail.IDuetDetailService
    /* renamed from: a */
    public final AbstractC41262aa mo73786a(AbstractC39100a<?, ?> aVar) {
        return new C43257d(aVar);
    }
}
