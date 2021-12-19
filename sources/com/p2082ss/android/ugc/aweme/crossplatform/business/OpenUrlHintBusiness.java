package com.p2082ss.android.ugc.aweme.crossplatform.business;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.commercialize.views.OpenURLHintLayout;
import com.p2082ss.android.ugc.aweme.crossplatform.business.BusinessService;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.business.OpenUrlHintBusiness */
public class OpenUrlHintBusiness extends BusinessService.Business {
    static {
        Covode.recordClassIndex(48402);
    }

    public OpenUrlHintBusiness(C40589e eVar) {
        super(eVar);
    }

    /* renamed from: a */
    public static void m81900a(OpenURLHintLayout openURLHintLayout, String str) {
        openURLHintLayout.mo67406a(AwemeService.m70060b().mo60690d(str));
    }
}
