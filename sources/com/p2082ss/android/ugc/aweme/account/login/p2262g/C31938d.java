package com.p2082ss.android.ugc.aweme.account.login.p2262g;

import android.app.Activity;
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

/* renamed from: com.ss.android.ugc.aweme.account.login.g.d */
public final class C31938d extends WebViewClient {

    /* renamed from: a */
    public final Activity f76281a;

    static {
        Covode.recordClassIndex(38682);
    }

    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return C23833c.m45039a(webView, renderProcessGoneDetail);
    }

    public C31938d(Activity activity) {
        this.f76281a = activity;
    }

    /* renamed from: a */
    private boolean m66305a(String str) {
        if (str == null) {
            return false;
        }
        if (C89361p.m154874b(str, "http://", false) || C89361p.m154874b(str, "https://", false)) {
            SmartRouter.buildRoute(this.f76281a, "//webview").withParam(Uri.parse(str)).withParam("use_webview_title", true).open();
            return true;
        } else if (!C89361p.m154874b(str, "mailto:", false)) {
            return false;
        } else {
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse(str));
            try {
                Activity activity = this.f76281a;
                if (activity != null) {
                    C84349a.m145093a(intent, activity);
                    activity.startActivity(intent);
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
        return m66305a(str);
    }
}
