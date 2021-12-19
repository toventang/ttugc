package com.p2082ss.android.ugc.aweme.web;

import android.content.DialogInterface;
import android.net.http.SslError;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.example.p1811a.C23833c;

/* renamed from: com.ss.android.ugc.aweme.web.j */
public class C81549j extends WebViewClient {
    static {
        Covode.recordClassIndex(94927);
    }

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return C23833c.m45039a(webView, renderProcessGoneDetail);
    }

    public void onReceivedSslError(WebView webView, final SslErrorHandler sslErrorHandler, SslError sslError) {
        C17197a.C17200a aVar = new C17197a.C17200a(webView.getContext());
        aVar.f41071b = "notification error ssl cert invalid";
        aVar.mo27192a("continue", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.web.C81549j.DialogInterface$OnClickListenerC815512 */

            static {
                Covode.recordClassIndex(94929);
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                sslErrorHandler.proceed();
            }
        }, false).mo27196b("cancel", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.web.C81549j.DialogInterface$OnClickListenerC815501 */

            static {
                Covode.recordClassIndex(94928);
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                sslErrorHandler.cancel();
            }
        }, false).mo27193a().mo27184b();
    }
}
