package com.p2082ss.android.ugc.aweme.app.services;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.app.services.WebviewService */
public final class WebviewService implements IWebViewService {
    static {
        Covode.recordClassIndex(40756);
    }

    @Override // com.p2082ss.android.ugc.aweme.app.services.IWebViewService
    /* renamed from: a */
    public final void mo60088a(Context context, String str) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "//webview/");
        if (!(context instanceof Activity)) {
            buildRoute.addFlags(268435456);
        }
        buildRoute.withParam("url", str).withParam("hide_nav_bar", true).open();
    }
}
