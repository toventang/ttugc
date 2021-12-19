package com.p2082ss.android.ugc.aweme.ecommerce.router;

import android.net.Uri;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.ecommerce.router.view.AbstractC45290a;
import com.p2082ss.android.ugc.aweme.ecommerce.router.view.FallbackView;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.router.StrategyService */
public final class StrategyService implements IStrategyService {
    static {
        Covode.recordClassIndex(53686);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.router.IStrategyService
    /* renamed from: a */
    public final AbstractC45262h mo76330a() {
        return new C45276o();
    }

    /* renamed from: b */
    public static IStrategyService m87825b() {
        MethodCollector.m26663i(7954);
        Object a = C81908b.m141854a(IStrategyService.class, false);
        if (a != null) {
            IStrategyService iStrategyService = (IStrategyService) a;
            MethodCollector.m26664o(7954);
            return iStrategyService;
        }
        if (C81908b.f183231bh == null) {
            synchronized (IStrategyService.class) {
                try {
                    if (C81908b.f183231bh == null) {
                        C81908b.f183231bh = new StrategyService();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(7954);
                    throw th;
                }
            }
        }
        StrategyService strategyService = (StrategyService) C81908b.f183231bh;
        MethodCollector.m26664o(7954);
        return strategyService;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.router.IStrategyService
    /* renamed from: a */
    public final AbstractC45290a mo76331a(ActivityC0945e eVar, Uri uri, boolean z) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(uri, "");
        FallbackView fallbackView = new FallbackView(eVar);
        fallbackView.mo76362a(eVar, uri, z);
        return fallbackView;
    }
}
