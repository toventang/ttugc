package com.bytedance.ies.bullet.service.base.web;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.C16614as;
import com.bytedance.ies.bullet.service.base.web.C16685l;
import com.example.p1811a.C23833c;
import com.p2082ss.android.ugc.aweme.net.model.C61425e;
import com.p2082ss.android.ugc.aweme.net.model.EnumC61424d;
import com.p2082ss.android.ugc.aweme.net.monitor.C61439n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.service.base.web.o */
public class C16694o extends WebViewClient {
    static {
        Covode.recordClassIndex(19134);
    }

    /* renamed from: a */
    public void mo26516a(WebView webView, AbstractC16681h hVar, WebResourceResponse webResourceResponse) {
    }

    /* renamed from: a */
    public void mo26517a(WebView webView, AbstractC16681h hVar, AbstractC16680g gVar) {
    }

    /* renamed from: a */
    public boolean mo26518a() {
        throw new C16614as("An operation is not implemented");
    }

    /* renamed from: b */
    public WebResourceResponse mo26520b(WebView webView, AbstractC16681h hVar) {
        throw new C16614as("An operation is not implemented");
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        throw new C16614as("An operation is not implemented");
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        AbstractC16681h hVar;
        if (webResourceRequest != null) {
            hVar = C16685l.m30970a(webResourceRequest);
        } else {
            hVar = null;
        }
        return mo26519a(webView, hVar);
    }

    /* renamed from: a */
    public boolean mo26519a(WebView webView, AbstractC16681h hVar) {
        throw new C16614as("An operation is not implemented");
    }

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (renderProcessGoneDetail != null) {
            C89219l.m154719c(renderProcessGoneDetail, "");
            new C16685l.C16688c(renderProcessGoneDetail);
        }
        mo26518a();
        return C23833c.m45039a(webView, renderProcessGoneDetail);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        webResourceRequest.getUrl();
        AbstractC16681h hVar = null;
        C61425e<WebResourceRequest, WebResourceResponse> o = C61439n.f139485e.mo68814o(new C61425e<>(webResourceRequest, webView, null, EnumC61424d.CONTINUE));
        if (o.f139473f == EnumC61424d.INTERCEPT && o.f139469b != null) {
            return o.f139469b;
        }
        if (o.f139473f != EnumC61424d.EXCEPTION || o.f139472e == null) {
            WebView webView2 = o.f139470c;
            Q q = o.f139468a;
            if (q != null) {
                hVar = C16685l.m30970a(q);
            }
            return mo26520b(webView2, hVar);
        }
        throw o.f139472e;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        C61425e<String, WebResourceResponse> n = C61439n.f139485e.mo68813n(new C61425e<>(str, webView, null, EnumC61424d.CONTINUE));
        if (n.f139473f == EnumC61424d.INTERCEPT && n.f139469b != null) {
            return n.f139469b;
        }
        if (n.f139473f != EnumC61424d.EXCEPTION || n.f139472e == null) {
            throw new C16614as("An operation is not implemented");
        }
        throw n.f139472e;
    }

    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        AbstractC16681h hVar;
        if (webResourceRequest != null) {
            hVar = C16685l.m30970a(webResourceRequest);
        } else {
            hVar = null;
        }
        mo26516a(webView, hVar, webResourceResponse);
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        AbstractC16681h hVar;
        C16685l.C16687b bVar = null;
        if (webResourceRequest != null) {
            hVar = C16685l.m30970a(webResourceRequest);
        } else {
            hVar = null;
        }
        if (webResourceError != null) {
            C89219l.m154719c(webResourceError, "");
            bVar = new C16685l.C16687b(webResourceError);
        }
        mo26517a(webView, hVar, bVar);
    }
}
