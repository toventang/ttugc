package com.bytedance.android.livesdk.browser.p460a;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.bytedance.android.monitor.webview.C12044i;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.browser.a.b */
public class C6939b extends WebChromeClient {
    static {
        Covode.recordClassIndex(7678);
    }

    public void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        C12044i.f28862a.mo19237a(webView, i);
    }
}
