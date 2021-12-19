package com.p2082ss.android.ugc.aweme.compliance.business.termspp;

import android.content.Intent;
import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.example.p1811a.C23833c;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.tiktok.security.p4334b.C84365i;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.termspp.d */
public final class C39588d extends WebViewClient {

    /* renamed from: a */
    public final TermsConsentDialog f93348a;

    static {
        Covode.recordClassIndex(47299);
    }

    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return C23833c.m45039a(webView, renderProcessGoneDetail);
    }

    public C39588d(TermsConsentDialog termsConsentDialog) {
        this.f93348a = termsConsentDialog;
    }

    /* renamed from: a */
    private boolean m80370a(String str) {
        if (str == null) {
            return false;
        }
        if (C89361p.m154874b(str, "http://", false) || C89361p.m154874b(str, "https://", false)) {
            SmartRouter.buildRoute(this.f93348a, "//webview").withParam(Uri.parse(str)).withParam("use_webview_title", true).open();
            return true;
        } else if (!C89361p.m154874b(str, "mailto:", false)) {
            return false;
        } else {
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse(str));
            try {
                TermsConsentDialog termsConsentDialog = this.f93348a;
                if (termsConsentDialog != null) {
                    C84349a.m145093a(intent, termsConsentDialog);
                    termsConsentDialog.startActivity(intent);
                }
                return true;
            } catch (Exception e) {
                e.printStackTrace();
            } catch (Throwable unused) {
            }
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (C84365i.m145122b(webView, str)) {
            return true;
        }
        return m80370a(str);
    }
}
