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

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.m */
public final class C38755m implements AbstractC40691e {

    /* renamed from: a */
    public boolean f91525a;

    /* renamed from: b */
    public boolean f91526b;

    /* renamed from: c */
    public boolean f91527c;

    /* renamed from: d */
    public long f91528d;

    /* renamed from: e */
    public AbstractC38756a f91529e;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.m$a */
    public interface AbstractC38756a {
        static {
            Covode.recordClassIndex(46297);
        }

        /* renamed from: a */
        void mo67292a();

        /* renamed from: a */
        void mo67293a(long j);

        /* renamed from: b */
        void mo67294b();

        /* renamed from: c */
        void mo67295c();
    }

    static {
        Covode.recordClassIndex(46296);
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
    public final void mo67291a(boolean z) {
        AbstractC38756a aVar;
        this.f91527c = z;
        if (z && !this.f91525a && (aVar = this.f91529e) != null) {
            aVar.mo67295c();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
    /* renamed from: a */
    public final void mo61846a(WebView webView, String str) {
        if (!C89219l.m154714a((Object) str, (Object) "about:blank") && !this.f91525a && !this.f91526b && !this.f91527c) {
            this.f91525a = true;
            AbstractC38756a aVar = this.f91529e;
            if (aVar != null) {
                aVar.mo67293a(System.currentTimeMillis() - this.f91528d);
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
            this.f91526b = true;
            AbstractC38756a aVar = this.f91529e;
            if (aVar != null) {
                aVar.mo67294b();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
    /* renamed from: a */
    public final void mo65795a(WebView webView, String str, Bitmap bitmap) {
        if (!C89219l.m154714a((Object) str, (Object) "about:blank")) {
            this.f91525a = false;
            this.f91526b = false;
            mo67291a(false);
            this.f91528d = System.currentTimeMillis();
            AbstractC38756a aVar = this.f91529e;
            if (aVar != null) {
                aVar.mo67292a();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
    /* renamed from: a */
    public final void mo65791a(WebView webView, int i, String str, String str2) {
        if (!C89219l.m154714a((Object) str2, (Object) "about:blank")) {
            this.f91526b = true;
            AbstractC38756a aVar = this.f91529e;
            if (aVar != null) {
                aVar.mo67294b();
            }
        }
    }
}
