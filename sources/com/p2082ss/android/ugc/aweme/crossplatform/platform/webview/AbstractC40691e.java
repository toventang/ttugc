package com.p2082ss.android.ugc.aweme.crossplatform.platform.webview;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.e */
public interface AbstractC40691e {
    static {
        Covode.recordClassIndex(48537);
    }

    /* renamed from: a */
    void mo65791a(WebView webView, int i, String str, String str2);

    /* renamed from: a */
    void mo65792a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError);

    /* renamed from: a */
    void mo65793a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError);

    /* renamed from: a */
    void mo65794a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse);

    /* renamed from: a */
    void mo61846a(WebView webView, String str);

    /* renamed from: a */
    void mo65795a(WebView webView, String str, Bitmap bitmap);

    /* renamed from: b */
    boolean mo65796b(WebView webView, String str);

    /* renamed from: c */
    void mo65797c(WebView webView, String str);
}
