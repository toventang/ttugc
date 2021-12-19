package com.p2082ss.android.ugc.aweme.util;

import android.content.Context;
import android.net.Uri;
import com.bytedance.business.base.jira.IGoToFeedbackListener;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.common.util.C29844g;

/* renamed from: com.ss.android.ugc.aweme.util.g */
final /* synthetic */ class C80129g implements IGoToFeedbackListener {

    /* renamed from: a */
    static final IGoToFeedbackListener f179539a = new C80129g();

    static {
        Covode.recordClassIndex(93373);
    }

    private C80129g() {
    }

    @Override // com.bytedance.business.base.jira.IGoToFeedbackListener
    public final void gotoFeedback(Context context, String str) {
        C29844g gVar = new C29844g("https://www.tiktokv.com/aweme/faq_beta_version/");
        gVar.mo52130a("enter_from", "settings");
        gVar.mo52130a("imgUrl", str);
        SmartRouter.buildRoute(context, "//webview").withParam("url", Uri.parse(gVar.toString())).withParam("hide_nav_bar", true).open();
    }
}
