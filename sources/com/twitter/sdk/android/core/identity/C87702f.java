package com.twitter.sdk.android.core.identity;

import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.covode.number.Covode;
import com.example.p1811a.C23833c;
import com.p2082ss.android.ugc.tiktok.security.p4334b.C84365i;
import com.twitter.sdk.android.core.internal.p4498a.C87717f;
import java.net.URI;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.twitter.sdk.android.core.identity.f */
final class C87702f extends WebViewClient {

    /* renamed from: a */
    private final String f199216a;

    /* renamed from: b */
    private final AbstractC87703a f199217b;

    /* renamed from: com.twitter.sdk.android.core.identity.f$a */
    interface AbstractC87703a {
        static {
            Covode.recordClassIndex(103692);
        }

        /* renamed from: a */
        void mo142141a();

        /* renamed from: a */
        void mo142143a(Bundle bundle);

        /* renamed from: a */
        void mo142144a(WebView webView);
    }

    static {
        Covode.recordClassIndex(103691);
    }

    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return C23833c.m45039a(webView, renderProcessGoneDetail);
    }

    C87702f(String str, AbstractC87703a aVar) {
        this.f199216a = str;
        this.f199217b = aVar;
    }

    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.f199217b.mo142144a(webView);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (C84365i.m145122b(webView, str)) {
            return true;
        }
        if (!str.startsWith(this.f199216a)) {
            return super.shouldOverrideUrlLoading(webView, str);
        }
        TreeMap<String, String> a = C87717f.m152647a(URI.create(str), false);
        Bundle bundle = new Bundle(a.size());
        for (Map.Entry<String, String> entry : a.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        this.f199217b.mo142143a(bundle);
        return true;
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        AbstractC87703a aVar = this.f199217b;
        new C87707i(sslError.getPrimaryError(), null, null);
        aVar.mo142141a();
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        AbstractC87703a aVar = this.f199217b;
        new C87707i(i, str, str2);
        aVar.mo142141a();
    }
}
