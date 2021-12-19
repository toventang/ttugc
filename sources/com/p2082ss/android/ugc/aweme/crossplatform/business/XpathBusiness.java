package com.p2082ss.android.ugc.aweme.crossplatform.business;

import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.crossplatform.business.BusinessService;
import com.p2082ss.android.ugc.aweme.crossplatform.p2710d.p2711a.C40618a;
import com.p2082ss.android.ugc.aweme.p2282ad.utils.C33391a;
import com.p2082ss.android.ugc.tiktok.security.p4334b.C84357h;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.business.XpathBusiness */
public class XpathBusiness extends BusinessService.Business {
    static {
        Covode.recordClassIndex(48421);
    }

    XpathBusiness(C40589e eVar) {
        super(eVar);
    }

    public void xpathDirect(C40618a aVar, WebView webView) {
        MethodCollector.m26663i(6617);
        if (aVar == null) {
            MethodCollector.m26664o(6617);
            return;
        }
        long j = aVar.f95069b.f95106a;
        String str = aVar.f95069b.f95122q;
        if (j > 0 && !TextUtils.isEmpty(str)) {
            String a = C33391a.m68474a(str, j);
            if (!TextUtils.isEmpty(a) && webView != null) {
                String a2 = C84357h.f188595a.mo129370a(webView, a);
                if (!TextUtils.isEmpty(a2)) {
                    a = a2;
                }
                webView.loadUrl(a);
            }
        }
        MethodCollector.m26664o(6617);
    }
}
