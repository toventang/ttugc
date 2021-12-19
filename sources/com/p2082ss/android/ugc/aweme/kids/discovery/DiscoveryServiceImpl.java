package com.p2082ss.android.ugc.aweme.kids.discovery;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.kids.discovery.api.IDiscoveryService;
import com.p2082ss.android.ugc.aweme.kids.discovery.list.C57599e;

/* renamed from: com.ss.android.ugc.aweme.kids.discovery.DiscoveryServiceImpl */
public final class DiscoveryServiceImpl implements IDiscoveryService {
    static {
        Covode.recordClassIndex(67484);
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.discovery.api.IDiscoveryService
    /* renamed from: a */
    public final Fragment mo94887a() {
        return new C57599e();
    }

    /* renamed from: b */
    public static IDiscoveryService m104243b() {
        MethodCollector.m26663i(1602);
        Object a = C81908b.m141854a(IDiscoveryService.class, false);
        if (a != null) {
            IDiscoveryService iDiscoveryService = (IDiscoveryService) a;
            MethodCollector.m26664o(1602);
            return iDiscoveryService;
        }
        if (C81908b.f183212bO == null) {
            synchronized (IDiscoveryService.class) {
                try {
                    if (C81908b.f183212bO == null) {
                        C81908b.f183212bO = new DiscoveryServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(1602);
                    throw th;
                }
            }
        }
        DiscoveryServiceImpl discoveryServiceImpl = (DiscoveryServiceImpl) C81908b.f183212bO;
        MethodCollector.m26664o(1602);
        return discoveryServiceImpl;
    }
}
