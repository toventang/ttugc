package com.p2082ss.android.ugc.aweme.commercialize.utils;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ab */
public class C38616ab implements AbstractC40691e {

    /* renamed from: a */
    public boolean f91253a;

    /* renamed from: b */
    public boolean f91254b;

    /* renamed from: c */
    public boolean f91255c;

    /* renamed from: d */
    public long f91256d;

    /* renamed from: e */
    public AbstractC38617a f91257e;

    /* renamed from: f */
    public boolean f91258f = true;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ab$a */
    public interface AbstractC38617a {
        static {
            Covode.recordClassIndex(46158);
        }

        /* renamed from: a */
        void mo66156a();

        /* renamed from: b */
        void mo66157b();

        /* renamed from: c */
        void mo66158c();
    }

    static {
        Covode.recordClassIndex(46157);
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
    /* renamed from: a */
    public final void mo65792a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
    /* renamed from: a */
    public final void mo65794a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
    /* renamed from: b */
    public final boolean mo65796b(WebView webView, String str) {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
    /* renamed from: c */
    public final void mo65797c(WebView webView, String str) {
    }

    /* renamed from: a */
    public final void mo67194a(boolean z) {
        this.f91255c = z;
        if (z && !this.f91253a && this.f91257e != null) {
            System.currentTimeMillis();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
    /* renamed from: a */
    public final void mo61846a(WebView webView, String str) {
        if (!C89219l.m154714a((Object) str, (Object) "about:blank")) {
            if (this.f91258f) {
                this.f91258f = false;
                if (webView != null) {
                    webView.clearHistory();
                }
            }
            if (!this.f91253a && !this.f91254b && !this.f91255c) {
                this.f91253a = true;
            }
            AbstractC38617a aVar = this.f91257e;
            if (aVar != null) {
                aVar.mo66158c();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
    /* renamed from: a */
    public final void mo65793a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        String str;
        Uri url;
        if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null) {
            str = null;
        } else {
            str = url.toString();
        }
        if (!C89219l.m154714a((Object) str, (Object) "about:blank") && webResourceRequest != null && webResourceRequest.isForMainFrame()) {
            this.f91254b = true;
            AbstractC38617a aVar = this.f91257e;
            if (aVar != null) {
                aVar.mo66157b();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
    /* renamed from: a */
    public final void mo65795a(WebView webView, String str, Bitmap bitmap) {
        if (!C89219l.m154714a((Object) str, (Object) "about:blank")) {
            this.f91253a = false;
            this.f91254b = false;
            mo67194a(false);
            this.f91256d = System.currentTimeMillis();
            AbstractC38617a aVar = this.f91257e;
            if (aVar != null) {
                aVar.mo66156a();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
    /* renamed from: a */
    public final void mo65791a(WebView webView, int i, String str, String str2) {
        if (!C89219l.m154714a((Object) str2, (Object) "about:blank")) {
            this.f91254b = true;
            AbstractC38617a aVar = this.f91257e;
            if (aVar != null) {
                aVar.mo66157b();
            }
        }
    }
}
