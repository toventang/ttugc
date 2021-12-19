package com.p2082ss.android.ugc.aweme.commercialize.business;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.crossplatform.business.BusinessService;
import com.p2082ss.android.ugc.aweme.crossplatform.business.C40589e;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.report.C67105b;

/* renamed from: com.ss.android.ugc.aweme.commercialize.business.ReportBusiness */
public class ReportBusiness extends BusinessService.Business {
    static {
        Covode.recordClassIndex(45058);
    }

    ReportBusiness(C40589e eVar) {
        super(eVar);
    }

    /* renamed from: a */
    public final void mo65535a(Activity activity) {
        Aweme d = AwemeService.m70060b().mo60690d(this.f94935k.f95068a.f95061j);
        C39223a.m79587a().mo68693a(C67105b.m118761a(d, "homepage_hot"));
        C39223a.m79587a().mo68694b(activity, C67105b.m118760a(d, "landing_page", "ad"));
    }
}
