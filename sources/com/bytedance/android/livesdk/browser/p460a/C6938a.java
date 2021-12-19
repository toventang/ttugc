package com.bytedance.android.livesdk.browser.p460a;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.browser.a.a */
public class C6938a extends C6940c {

    /* renamed from: a */
    private WebViewClient f17348a = null;

    static {
        Covode.recordClassIndex(7677);
    }

    @Override // com.bytedance.android.livesdk.browser.p460a.C6940c
    public void onPageFinished(WebView webView, String str) {
        WebViewClient webViewClient = this.f17348a;
        if (webViewClient != null) {
            webViewClient.onPageFinished(webView, str);
        }
    }

    @Override // com.bytedance.android.livesdk.browser.p460a.C6940c
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        WebViewClient webViewClient = this.f17348a;
        if (webViewClient != null) {
            webViewClient.onPageStarted(webView, str, bitmap);
        }
    }

    @Override // com.bytedance.android.livesdk.browser.p460a.C6940c
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        WebViewClient webViewClient = this.f17348a;
        if (webViewClient != null) {
            webViewClient.onReceivedError(webView, i, str, str2);
        }
    }
}
