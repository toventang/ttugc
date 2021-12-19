package com.p2082ss.android.ugc.aweme.commerce.sdk.service;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.commerce.service.EmptyCommerceService;
import com.p2082ss.android.ugc.aweme.commerce.service.ICommerceService;

/* renamed from: com.ss.android.ugc.aweme.commerce.sdk.service.CommerceService */
public final class CommerceService extends EmptyCommerceService {
    static {
        Covode.recordClassIndex(44920);
    }

    public static ICommerceService createICommerceServicebyMonsterPlugin(boolean z) {
        MethodCollector.m26663i(13198);
        Object a = C81908b.m141854a(ICommerceService.class, z);
        if (a != null) {
            ICommerceService iCommerceService = (ICommerceService) a;
            MethodCollector.m26664o(13198);
            return iCommerceService;
        }
        if (C81908b.f183176af == null) {
            synchronized (ICommerceService.class) {
                try {
                    if (C81908b.f183176af == null) {
                        C81908b.f183176af = new CommerceService();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(13198);
                    throw th;
                }
            }
        }
        EmptyCommerceService emptyCommerceService = (EmptyCommerceService) C81908b.f183176af;
        MethodCollector.m26664o(13198);
        return emptyCommerceService;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x02b3  */
    @Override // com.p2082ss.android.ugc.aweme.commerce.service.ICommerceService, com.p2082ss.android.ugc.aweme.commerce.service.EmptyCommerceService
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void logCommerceEvents(java.lang.String r3, com.p2082ss.android.ugc.aweme.commerce.service.p2521a.C37534a r4) {
        /*
        // Method dump skipped, instructions count: 902
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.commerce.sdk.service.CommerceService.logCommerceEvents(java.lang.String, com.ss.android.ugc.aweme.commerce.service.a.a):void");
    }
}
