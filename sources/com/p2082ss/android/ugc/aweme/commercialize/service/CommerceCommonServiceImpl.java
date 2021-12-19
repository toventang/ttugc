package com.p2082ss.android.ugc.aweme.commercialize.service;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.commercialize.log.AbstractC38157ad;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38177d;

/* renamed from: com.ss.android.ugc.aweme.commercialize.service.CommerceCommonServiceImpl */
public final class CommerceCommonServiceImpl implements ICommerceCommonService {
    static {
        Covode.recordClassIndex(46003);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.service.ICommerceCommonService
    /* renamed from: a */
    public final AbstractC38157ad mo67045a() {
        return C38177d.f90185a;
    }

    /* renamed from: b */
    public static ICommerceCommonService m77951b() {
        MethodCollector.m26663i(7804);
        Object a = C81908b.m141854a(ICommerceCommonService.class, false);
        if (a != null) {
            ICommerceCommonService iCommerceCommonService = (ICommerceCommonService) a;
            MethodCollector.m26664o(7804);
            return iCommerceCommonService;
        }
        if (C81908b.f183190at == null) {
            synchronized (ICommerceCommonService.class) {
                try {
                    if (C81908b.f183190at == null) {
                        C81908b.f183190at = new CommerceCommonServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(7804);
                    throw th;
                }
            }
        }
        CommerceCommonServiceImpl commerceCommonServiceImpl = (CommerceCommonServiceImpl) C81908b.f183190at;
        MethodCollector.m26664o(7804);
        return commerceCommonServiceImpl;
    }
}
