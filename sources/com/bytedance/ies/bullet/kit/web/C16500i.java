package com.bytedance.ies.bullet.kit.web;

import android.graphics.Bitmap;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.android.monitor.webview.AbstractC12021c;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.web.C16694o;

/* renamed from: com.bytedance.ies.bullet.kit.web.i */
public final class C16500i extends C16694o {

    /* renamed from: a */
    private final AbstractC12021c f39561a;

    static {
        Covode.recordClassIndex(18931);
    }

    public C16500i(AbstractC12021c cVar) {
        this.f39561a = cVar;
    }

    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        AbstractC12021c cVar = this.f39561a;
        if (cVar != null) {
            cVar.mo19244e(webView, str);
        }
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        AbstractC12021c cVar = this.f39561a;
        if (cVar != null) {
            cVar.mo19243c(webView, str);
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.web.C16694o
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        AbstractC12021c cVar = this.f39561a;
        if (cVar != null) {
            cVar.mo19240a(webView, webResourceRequest, webResourceResponse);
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.web.C16694o
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        AbstractC12021c cVar = this.f39561a;
        if (cVar != null) {
            cVar.mo19239a(webView, webResourceRequest, webResourceError);
        }
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        AbstractC12021c cVar = this.f39561a;
        if (cVar != null) {
            cVar.mo19238a(webView, i, str, str2);
        }
    }
}
