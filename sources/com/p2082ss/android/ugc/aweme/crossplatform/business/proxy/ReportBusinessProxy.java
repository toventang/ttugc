package com.p2082ss.android.ugc.aweme.crossplatform.business.proxy;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.CrossPlatformLegacyServiceImpl;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.crossplatform.business.BusinessService;
import com.p2082ss.android.ugc.aweme.crossplatform.business.C40589e;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.business.proxy.ReportBusinessProxy */
public class ReportBusinessProxy extends BusinessService.Business {

    /* renamed from: a */
    public String f95004a = this.f94935k.f95068a.f95066o;

    /* renamed from: b */
    public Long f95005b = -1L;

    static {
        Covode.recordClassIndex(48435);
    }

    /* renamed from: a */
    public final void mo69752a(Activity activity) {
        CrossPlatformLegacyServiceImpl.m65225f().mo57037a(activity, this.f94935k.f95068a.f95061j);
    }

    ReportBusinessProxy(C40589e eVar) {
        super(eVar);
    }

    /* renamed from: a */
    public final void mo69753a(Activity activity, String str, int i) {
        String aid;
        if (!TextUtils.isEmpty(this.f95004a)) {
            Uri.Builder builder = new Uri.Builder();
            Aweme b = AwemeService.m70060b().mo60684b(this.f94935k.f95068a.f95061j);
            String str2 = this.f94935k.f95068a.f95064m;
            C39162r.m79460a("report", new C33744d().mo59983a("author_id", str2).mo59983a("enter_from", this.f94935k.f95068a.f95057f).mo59983a("group_id", C59208ac.m108771e(b)).mo59983a("log_pb", C48027ac.C48028a.f111257a.mo80055a(C59208ac.m108763b(b))).mo59983a("report_type", this.f95004a).mo59983a("reported_url", str).mo59983a("page_depth", String.valueOf(i)).f79943a);
            Uri.Builder appendQueryParameter = builder.appendQueryParameter("report_type", this.f95004a).appendQueryParameter("owner_id", str2).appendQueryParameter("enter_from", this.f94935k.f95068a.f95057f).appendQueryParameter("reported_url", str).appendQueryParameter("page_depth", String.valueOf(i)).appendQueryParameter("user_id", C31575b.m65865g().getCurUserId());
            if (b == null) {
                aid = "";
            } else {
                aid = b.getAid();
            }
            appendQueryParameter.appendQueryParameter("object_id", aid);
            CrossPlatformLegacyServiceImpl.m65225f().mo57035a(activity, builder);
        }
    }
}
