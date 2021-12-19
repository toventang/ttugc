package com.p2082ss.android.ugc.aweme.discover;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.prop.impl.PropReuseServiceImpl;

/* renamed from: com.ss.android.ugc.aweme.discover.DiscoverAllServiceImpl */
public final class DiscoverAllServiceImpl implements IDiscoverAllService {
    static {
        Covode.recordClassIndex(49385);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.IDiscoverAllService
    /* renamed from: a */
    public final AbstractC39100a<Aweme, ?> mo70758a() {
        return PropReuseServiceImpl.m116994c().mo104477a();
    }

    /* renamed from: b */
    public static IDiscoverAllService m83412b() {
        MethodCollector.m26663i(8084);
        Object a = C81908b.m141854a(IDiscoverAllService.class, false);
        if (a != null) {
            IDiscoverAllService iDiscoverAllService = (IDiscoverAllService) a;
            MethodCollector.m26664o(8084);
            return iDiscoverAllService;
        }
        if (C81908b.f183169aY == null) {
            synchronized (IDiscoverAllService.class) {
                try {
                    if (C81908b.f183169aY == null) {
                        C81908b.f183169aY = new DiscoverAllServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(8084);
                    throw th;
                }
            }
        }
        DiscoverAllServiceImpl discoverAllServiceImpl = (DiscoverAllServiceImpl) C81908b.f183169aY;
        MethodCollector.m26664o(8084);
        return discoverAllServiceImpl;
    }
}
