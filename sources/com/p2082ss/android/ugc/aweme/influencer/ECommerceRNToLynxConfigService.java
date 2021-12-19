package com.p2082ss.android.ugc.aweme.influencer;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.influencer.ecommercelive.IECommerceRNToLynxConfigService;

/* renamed from: com.ss.android.ugc.aweme.influencer.ECommerceRNToLynxConfigService */
public final class ECommerceRNToLynxConfigService implements IECommerceRNToLynxConfigService {
    static {
        Covode.recordClassIndex(66430);
    }

    @Override // com.p2082ss.android.ugc.aweme.influencer.ecommercelive.IECommerceRNToLynxConfigService
    /* renamed from: a */
    public final String mo93515a() {
        return "aweme://lynxview/?hide_nav_bar=1&thread_strategy=0&immersive_mode=0&hide_status_bar=0&channel=lynx_ecommerce_tab_shop&bundle=profile_tab_shop_page/template.js&dynamic=1&is_host_profile={is_host_profile}&target_sec_uid={target_sec_uid}&enter_from={enter_from}&author_id={author_id}&follow_status={follow_status}";
    }

    /* renamed from: b */
    public static IECommerceRNToLynxConfigService m102576b() {
        MethodCollector.m26663i(502);
        Object a = C81908b.m141854a(IECommerceRNToLynxConfigService.class, false);
        if (a != null) {
            IECommerceRNToLynxConfigService iECommerceRNToLynxConfigService = (IECommerceRNToLynxConfigService) a;
            MethodCollector.m26664o(502);
            return iECommerceRNToLynxConfigService;
        }
        if (C81908b.f183200bC == null) {
            synchronized (IECommerceRNToLynxConfigService.class) {
                try {
                    if (C81908b.f183200bC == null) {
                        C81908b.f183200bC = new ECommerceRNToLynxConfigService();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(502);
                    throw th;
                }
            }
        }
        ECommerceRNToLynxConfigService eCommerceRNToLynxConfigService = (ECommerceRNToLynxConfigService) C81908b.f183200bC;
        MethodCollector.m26664o(502);
        return eCommerceRNToLynxConfigService;
    }
}
