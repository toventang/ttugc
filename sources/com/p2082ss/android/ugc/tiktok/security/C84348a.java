package com.p2082ss.android.ugc.tiktok.security;

import android.view.View;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.api.p1088b.AbstractC15315l;
import com.bytedance.helios.api.p1088b.C15314k;
import com.bytedance.ies.web.jsbridge2.AbstractC18329b;
import com.bytedance.ies.web.jsbridge2.C18362v;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tiktok.security.a */
public final class C84348a {

    /* renamed from: a */
    public static final C84348a f188593a = new C84348a();

    /* renamed from: b */
    private static final AbstractC15315l f188594b = AbstractC15315l.C15316a.m28213a();

    private C84348a() {
    }

    static {
        Covode.recordClassIndex(98300);
    }

    /* renamed from: a */
    public static final void m145092a(AbstractC18329b bVar, C18362v vVar) {
        String str;
        String str2;
        AbstractC15315l lVar = f188594b;
        if (lVar != null && bVar != null) {
            View b = bVar.mo16240b();
            if (!(b instanceof WebView)) {
                b = null;
            }
            WebView webView = (WebView) b;
            C15314k kVar = new C15314k();
            if (webView == null || (str = webView.getUrl()) == null) {
                str = "";
            }
            C89219l.m154719c(str, "");
            kVar.f37342a = str;
            kVar.f37345d = System.currentTimeMillis();
            if (vVar == null || (str2 = vVar.f43915d) == null) {
                str2 = "";
            }
            C89219l.m154719c(str2, "");
            kVar.f37344c = str2;
            String canonicalName = bVar.getClass().getCanonicalName();
            if (canonicalName == null) {
                canonicalName = "";
            }
            C89219l.m154719c(canonicalName, "");
            kVar.f37343b = canonicalName;
            lVar.addJsbEvent(kVar);
            if (webView != null) {
                webView.getUrl();
            }
        }
    }
}
