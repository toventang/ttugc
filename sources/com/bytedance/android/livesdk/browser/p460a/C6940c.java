package com.bytedance.android.livesdk.browser.p460a;

import android.graphics.Bitmap;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.android.monitor.webview.C12044i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18292c;

/* renamed from: com.bytedance.android.livesdk.browser.a.c */
public class C6940c extends C18292c {
    static {
        Covode.recordClassIndex(7679);
    }

    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        C12044i.f28862a.mo19244e(webView, str);
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        C12044i.f28862a.mo19242b(webView, str);
    }

    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        C12044i.f28862a.mo19240a(webView, webResourceRequest, webResourceResponse);
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        C12044i.f28862a.mo19239a(webView, webResourceRequest, webResourceError);
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        C12044i.f28862a.mo19238a(webView, i, str, str2);
    }
}
