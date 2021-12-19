package com.bytedance.ies.bullet.service.base.web;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.C16614as;
import com.example.p1811a.C23833c;
import com.p2082ss.android.ugc.aweme.net.model.C61425e;
import com.p2082ss.android.ugc.aweme.net.model.EnumC61424d;
import com.p2082ss.android.ugc.aweme.net.monitor.C61439n;
import com.p2082ss.android.ugc.tiktok.security.p4334b.C84365i;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.service.base.web.p */
public final class C16695p extends WebViewClient {

    /* renamed from: a */
    public final CopyOnWriteArrayList<C16694o> f39872a = new CopyOnWriteArrayList<>();

    static {
        Covode.recordClassIndex(19135);
    }

    /* renamed from: a */
    public final void mo26522a(C16694o oVar) {
        C89219l.m154719c(oVar, "");
        this.f39872a.add(oVar);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (C84365i.m145122b(webView, str)) {
            return true;
        }
        return m30984a(webView, str);
    }

    /* renamed from: a */
    private WebResourceResponse m30983a(WebView webView, WebResourceRequest webResourceRequest) {
        Iterator<T> it = this.f39872a.iterator();
        while (it.hasNext()) {
            try {
                return it.next().shouldInterceptRequest(webView, webResourceRequest);
            } catch (C16614as unused) {
            }
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    /* renamed from: b */
    private WebResourceResponse m30985b(WebView webView, String str) {
        Iterator<T> it = this.f39872a.iterator();
        while (it.hasNext()) {
            try {
                return it.next().shouldInterceptRequest(webView, str);
            } catch (C16614as unused) {
            }
        }
        return super.shouldInterceptRequest(webView, str);
    }

    public final void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        Iterator<T> it = this.f39872a.iterator();
        while (it.hasNext()) {
            try {
                it.next().onLoadResource(webView, str);
            } catch (C16614as unused) {
            }
        }
    }

    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        Iterator<T> it = this.f39872a.iterator();
        while (it.hasNext()) {
            try {
                it.next().onPageFinished(webView, str);
            } catch (C16614as unused) {
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Iterator<T> it = this.f39872a.iterator();
        while (it.hasNext()) {
            try {
                return it.next().shouldOverrideUrlLoading(webView, webResourceRequest);
            } catch (C16614as unused) {
            }
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    /* renamed from: a */
    private boolean m30984a(WebView webView, String str) {
        Iterator<T> it = this.f39872a.iterator();
        while (it.hasNext()) {
            try {
                return it.next().shouldOverrideUrlLoading(webView, str);
            } catch (C16614as unused) {
            }
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }

    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        Iterator<T> it = this.f39872a.iterator();
        while (it.hasNext()) {
            try {
                it.next().onRenderProcessGone(webView, renderProcessGoneDetail);
                return C23833c.m45039a(webView, renderProcessGoneDetail);
            } catch (C16614as unused) {
            }
        }
        super.onRenderProcessGone(webView, renderProcessGoneDetail);
        return C23833c.m45039a(webView, renderProcessGoneDetail);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        webResourceRequest.getUrl();
        C61425e<WebResourceRequest, WebResourceResponse> o = C61439n.f139485e.mo68814o(new C61425e<>(webResourceRequest, webView, null, EnumC61424d.CONTINUE));
        if (o.f139473f == EnumC61424d.INTERCEPT && o.f139469b != null) {
            return o.f139469b;
        }
        if (o.f139473f != EnumC61424d.EXCEPTION || o.f139472e == null) {
            return m30983a(o.f139470c, (WebResourceRequest) o.f139468a);
        }
        throw o.f139472e;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        C61425e<String, WebResourceResponse> n = C61439n.f139485e.mo68813n(new C61425e<>(str, webView, null, EnumC61424d.CONTINUE));
        if (n.f139473f == EnumC61424d.INTERCEPT && n.f139469b != null) {
            return n.f139469b;
        }
        if (n.f139473f != EnumC61424d.EXCEPTION || n.f139472e == null) {
            return m30985b(n.f139470c, n.f139468a);
        }
        throw n.f139472e;
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        Iterator<T> it = this.f39872a.iterator();
        while (it.hasNext()) {
            try {
                it.next().onPageStarted(webView, str, bitmap);
            } catch (C16614as unused) {
            }
        }
    }

    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        Iterator<T> it = this.f39872a.iterator();
        while (it.hasNext()) {
            try {
                it.next().onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            } catch (C16614as unused) {
            }
        }
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        Iterator<T> it = this.f39872a.iterator();
        while (it.hasNext()) {
            try {
                it.next().onReceivedSslError(webView, sslErrorHandler, sslError);
            } catch (C16614as unused) {
            }
        }
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        Iterator<T> it = this.f39872a.iterator();
        while (it.hasNext()) {
            try {
                it.next().onReceivedError(webView, webResourceRequest, webResourceError);
            } catch (C16614as unused) {
            }
        }
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        Iterator<T> it = this.f39872a.iterator();
        while (it.hasNext()) {
            try {
                it.next().onReceivedError(webView, i, str, str2);
            } catch (C16614as unused) {
            }
        }
    }

    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        Iterator<T> it = this.f39872a.iterator();
        while (it.hasNext()) {
            try {
                it.next().onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            } catch (C16614as unused) {
            }
        }
    }
}
