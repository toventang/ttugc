package com.bytedance.webx.p1756e.p1757a.p1758a.p1759a;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.covode.number.Covode;
import com.bytedance.webx.C23612h;
import com.bytedance.webx.p1755d.AbstractC23567c;
import com.bytedance.webx.p1755d.C23565a;
import com.bytedance.webx.p1756e.AbstractC23595b;
import com.bytedance.webx.p1756e.C23571a;
import com.example.p1811a.C23833c;
import com.p2082ss.android.ugc.aweme.net.model.C61425e;
import com.p2082ss.android.ugc.aweme.net.model.EnumC61424d;
import com.p2082ss.android.ugc.aweme.net.monitor.C61439n;
import com.p2082ss.android.ugc.tiktok.security.p4334b.C84365i;

/* renamed from: com.bytedance.webx.e.a.a.a.b */
public class C23576b extends WebViewClient implements AbstractC23567c, AbstractC23595b {

    /* renamed from: a */
    public WebViewClient f55831a;

    /* renamed from: b */
    private C23612h f55832b;

    /* renamed from: c */
    private C23571a f55833c = new C23571a();

    static {
        Covode.recordClassIndex(27674);
    }

    @Override // com.bytedance.webx.p1756e.AbstractC23595b
    public C23565a getExtendableContext() {
        C23571a aVar = this.f55833c;
        if (aVar == null) {
            return null;
        }
        return aVar.f55827a;
    }

    @Override // com.bytedance.webx.p1756e.AbstractC23595b
    /* renamed from: a */
    public final void mo38728a(C23612h hVar) {
        this.f55832b = hVar;
        this.f55833c.f55827a = new C23565a(this.f55832b, this);
    }

    public void onLoadResource(WebView webView, String str) {
        WebViewClient webViewClient = this.f55831a;
        if (webViewClient != null) {
            webViewClient.onLoadResource(webView, str);
        } else {
            super.onLoadResource(webView, str);
        }
    }

    public void onPageCommitVisible(WebView webView, String str) {
        WebViewClient webViewClient = this.f55831a;
        if (webViewClient != null) {
            webViewClient.onPageCommitVisible(webView, str);
        } else {
            super.onPageCommitVisible(webView, str);
        }
    }

    public void onPageFinished(WebView webView, String str) {
        WebViewClient webViewClient = this.f55831a;
        if (webViewClient != null) {
            webViewClient.onPageFinished(webView, str);
        } else {
            super.onPageFinished(webView, str);
        }
    }

    public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        WebViewClient webViewClient = this.f55831a;
        if (webViewClient != null) {
            webViewClient.onReceivedClientCertRequest(webView, clientCertRequest);
        } else {
            super.onReceivedClientCertRequest(webView, clientCertRequest);
        }
    }

    public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        WebViewClient webViewClient = this.f55831a;
        if (webViewClient != null) {
            webViewClient.onUnhandledKeyEvent(webView, keyEvent);
        } else {
            super.onUnhandledKeyEvent(webView, keyEvent);
        }
    }

    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        WebViewClient webViewClient = this.f55831a;
        if (webViewClient != null) {
            return webViewClient.shouldOverrideKeyEvent(webView, keyEvent);
        }
        return super.shouldOverrideKeyEvent(webView, keyEvent);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        WebViewClient webViewClient = this.f55831a;
        if (webViewClient != null) {
            return webViewClient.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        WebViewClient webViewClient = this.f55831a;
        if (webViewClient != null) {
            webViewClient.onRenderProcessGone(webView, renderProcessGoneDetail);
            return C23833c.m45039a(webView, renderProcessGoneDetail);
        }
        super.onRenderProcessGone(webView, renderProcessGoneDetail);
        return C23833c.m45039a(webView, renderProcessGoneDetail);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (C84365i.m145122b(webView, str)) {
            return true;
        }
        WebViewClient webViewClient = this.f55831a;
        if (webViewClient != null) {
            return webViewClient.shouldOverrideUrlLoading(webView, str);
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        C61425e<String, WebResourceResponse> n = C61439n.f139485e.mo68813n(new C61425e<>(str, webView, null, EnumC61424d.CONTINUE));
        if (n.f139473f == EnumC61424d.INTERCEPT && n.f139469b != null) {
            return n.f139469b;
        }
        if (n.f139473f != EnumC61424d.EXCEPTION || n.f139472e == null) {
            WebView webView2 = n.f139470c;
            Q q = n.f139468a;
            WebViewClient webViewClient = this.f55831a;
            if (webViewClient != null) {
                return webViewClient.shouldInterceptRequest(webView2, (String) q);
            }
            return super.shouldInterceptRequest(webView2, (String) q);
        }
        throw n.f139472e;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        webResourceRequest.getUrl();
        C61425e<WebResourceRequest, WebResourceResponse> o = C61439n.f139485e.mo68814o(new C61425e<>(webResourceRequest, webView, null, EnumC61424d.CONTINUE));
        if (o.f139473f == EnumC61424d.INTERCEPT && o.f139469b != null) {
            return o.f139469b;
        }
        if (o.f139473f != EnumC61424d.EXCEPTION || o.f139472e == null) {
            WebView webView2 = o.f139470c;
            Q q = o.f139468a;
            WebViewClient webViewClient = this.f55831a;
            if (webViewClient != null) {
                return webViewClient.shouldInterceptRequest(webView2, (WebResourceRequest) q);
            }
            return super.shouldInterceptRequest(webView2, (WebResourceRequest) q);
        }
        throw o.f139472e;
    }

    public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        WebViewClient webViewClient = this.f55831a;
        if (webViewClient != null) {
            webViewClient.doUpdateVisitedHistory(webView, str, z);
        } else {
            super.doUpdateVisitedHistory(webView, str, z);
        }
    }

    public void onFormResubmission(WebView webView, Message message, Message message2) {
        WebViewClient webViewClient = this.f55831a;
        if (webViewClient != null) {
            webViewClient.onFormResubmission(webView, message, message2);
        } else {
            super.onFormResubmission(webView, message, message2);
        }
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        WebViewClient webViewClient = this.f55831a;
        if (webViewClient != null) {
            webViewClient.onPageStarted(webView, str, bitmap);
        } else {
            super.onPageStarted(webView, str, bitmap);
        }
    }

    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        WebViewClient webViewClient = this.f55831a;
        if (webViewClient != null) {
            webViewClient.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        } else {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        }
    }

    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        WebViewClient webViewClient = this.f55831a;
        if (webViewClient != null) {
            webViewClient.onReceivedSslError(webView, sslErrorHandler, sslError);
        } else {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    public void onScaleChanged(WebView webView, float f, float f2) {
        WebViewClient webViewClient = this.f55831a;
        if (webViewClient != null) {
            webViewClient.onScaleChanged(webView, f, f2);
        } else {
            super.onScaleChanged(webView, f, f2);
        }
    }

    public void onTooManyRedirects(WebView webView, Message message, Message message2) {
        WebViewClient webViewClient = this.f55831a;
        if (webViewClient != null) {
            webViewClient.onTooManyRedirects(webView, message, message2);
        } else {
            super.onTooManyRedirects(webView, message, message2);
        }
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        WebViewClient webViewClient = this.f55831a;
        if (webViewClient != null) {
            webViewClient.onReceivedError(webView, webResourceRequest, webResourceError);
        } else {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        WebViewClient webViewClient = this.f55831a;
        if (webViewClient != null) {
            webViewClient.onReceivedError(webView, i, str, str2);
        } else {
            super.onReceivedError(webView, i, str, str2);
        }
    }

    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        WebViewClient webViewClient = this.f55831a;
        if (webViewClient != null) {
            webViewClient.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        } else {
            super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        }
    }

    public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        WebViewClient webViewClient = this.f55831a;
        if (webViewClient != null) {
            webViewClient.onReceivedLoginRequest(webView, str, str2, str3);
        } else {
            super.onReceivedLoginRequest(webView, str, str2, str3);
        }
    }

    public void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        WebViewClient webViewClient = this.f55831a;
        if (webViewClient != null) {
            webViewClient.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
        } else {
            super.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
        }
    }
}
