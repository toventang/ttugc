package com.bytedance.ies.ugc.aweme.smartanchor_declaration;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.p1246a.AbstractC17884a;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.app.p2330h.C33758a;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.compliance.protection.familypairing.C40089b;
import com.p2082ss.android.ugc.aweme.donation.DonationServiceImpl;
import com.p2082ss.android.ugc.aweme.ecommerce.ECommerceService;
import com.p2082ss.android.ugc.aweme.p2479ck.C36092a;
import com.p2082ss.android.ugc.aweme.p2479ck.C36098d;
import com.p2082ss.android.ugc.aweme.p2479ck.C36101f;
import com.p2082ss.android.ugc.aweme.p2479ck.C36103g;
import com.p2082ss.android.ugc.aweme.p2479ck.C36105h;
import com.p2082ss.android.ugc.aweme.p2479ck.C36107i;
import com.p2082ss.android.ugc.aweme.p2479ck.C36110k;
import com.p2082ss.android.ugc.aweme.p2479ck.C36112l;
import com.p2082ss.android.ugc.aweme.p2479ck.C36114m;
import com.p2082ss.android.ugc.aweme.p2479ck.C36115n;
import com.p2082ss.android.ugc.aweme.p2479ck.C36117o;
import com.p2082ss.android.ugc.aweme.p2479ck.C36121p;
import com.p2082ss.android.ugc.aweme.p2479ck.C36133w;
import com.p2082ss.android.ugc.aweme.search.p3699m.C67649b;
import com.p2082ss.android.ugc.aweme.util.C80143n;
import java.util.Iterator;

public class RouterAnchorPoint implements AbstractC17884a {
    static {
        Covode.recordClassIndex(20804);
    }

    public static AbstractC17884a getPoint() {
        return new RouterAnchorPoint();
    }

    @Override // com.bytedance.ies.ugc.aweme.p1246a.AbstractC17884a
    public void run(Object obj) {
        SmartRouter.addInterceptor(new C40089b());
        SmartRouter.addInterceptor(new C36133w());
        SmartRouter.addInterceptor(new C36103g());
        SmartRouter.addInterceptor(new C36114m());
        SmartRouter.addInterceptor(new C36092a());
        System.out.println("Cofig will add challenge");
        SmartRouter.addInterceptor(new C36101f());
        SmartRouter.addInterceptor(new C36105h());
        Iterator<T> it = ECommerceService.createIECommerceServicebyMonsterPlugin(false).getEComPipeRouterInterceptors().iterator();
        while (it.hasNext()) {
            SmartRouter.addInterceptor(it.next());
        }
        SmartRouter.addInterceptor(new C33758a());
        SmartRouter.addInterceptor(new C36133w());
        SmartRouter.addInterceptor(new C36117o());
        SmartRouter.addInterceptor(new C36121p());
        SmartRouter.addInterceptor(new C36103g());
        SmartRouter.addInterceptor(new C36115n());
        SmartRouter.addInterceptor(new C36112l());
        SmartRouter.addInterceptor(C39223a.m79602p().mo68655d());
        SmartRouter.addInterceptor(new C36098d());
        SmartRouter.addInterceptor(DonationServiceImpl.m86009b().mo73339a());
        SmartRouter.addInterceptor(new C36107i());
        SmartRouter.addInterceptor(new C36110k());
        Iterator<T> it2 = ECommerceService.createIECommerceServicebyMonsterPlugin(false).getECommerceRouterInterceptors().iterator();
        while (it2.hasNext()) {
            SmartRouter.addInterceptor(it2.next());
        }
        SmartRouter.addInterceptor(new C67649b());
        SmartRouter.addInterceptor(new C80143n.C80144a());
    }
}
