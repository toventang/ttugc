package com.example.p1811a;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.covode.number.Covode;

/* renamed from: com.example.a.c */
public final class C23833c {

    /* renamed from: a */
    public static AbstractC23831a f56367a;

    static {
        Covode.recordClassIndex(27941);
    }

    /* renamed from: a */
    public static WebViewClient m45038a(WebViewClient webViewClient) {
        if (webViewClient == null || !"android.webkit.WebViewClient".equals(webViewClient.getClass().getName())) {
            return webViewClient;
        }
        return new C23832b();
    }

    /* renamed from: a */
    public static boolean m45039a(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        AbstractC23831a aVar = f56367a;
        if (aVar != null) {
            return aVar.mo39294a(webView, renderProcessGoneDetail);
        }
        return true;
    }
}
