package com.p2082ss.android.sdk.webview;

import android.graphics.Bitmap;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18292c;
import com.example.p1811a.C23833c;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.p3385b.C58007a;

/* renamed from: com.ss.android.sdk.webview.j */
public class C30266j extends C18292c {

    /* renamed from: a */
    private WebViewClient f72202a;

    static {
        Covode.recordClassIndex(36778);
    }

    @Override // com.bytedance.ies.web.p1285a.C18292c
    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        C58007a.m104833b(str);
    }

    public void onPageFinished(WebView webView, String str) {
        WebViewClient webViewClient = this.f72202a;
        if (webViewClient != null) {
            webViewClient.onPageFinished(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient, com.bytedance.ies.web.p1285a.C18292c
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        C58007a.m104833b(str);
        return super.shouldOverrideUrlLoading(webView, str);
    }

    @Override // com.bytedance.ies.web.p1285a.C18292c
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        C51423a.m95784a(3, null, "onRenderProcessGone");
        return C23833c.m45039a(webView, renderProcessGoneDetail);
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        WebViewClient webViewClient = this.f72202a;
        if (webViewClient != null) {
            webViewClient.onPageStarted(webView, str, bitmap);
        }
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        WebViewClient webViewClient = this.f72202a;
        if (webViewClient != null) {
            webViewClient.onReceivedError(webView, webResourceRequest, webResourceError);
        }
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        WebViewClient webViewClient = this.f72202a;
        if (webViewClient != null) {
            webViewClient.onReceivedError(webView, i, str, str2);
        }
    }
}
