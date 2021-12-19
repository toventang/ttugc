package com.bytedance.ies.web.p1285a;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.covode.number.Covode;
import com.example.p1811a.C23833c;
import com.p2082ss.android.ugc.tiktok.security.p4334b.C84365i;

/* renamed from: com.bytedance.ies.web.a.c */
public class C18292c extends WebViewClient {

    /* renamed from: d */
    public C18288a f43667d;

    static {
        Covode.recordClassIndex(20963);
    }

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return C23833c.m45039a(webView, renderProcessGoneDetail);
    }

    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        C18288a aVar = this.f43667d;
        if (aVar != null) {
            aVar.mo29255c(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (C84365i.m145122b(webView, str)) {
            return true;
        }
        C18288a aVar = this.f43667d;
        if (aVar == null || !aVar.mo29253b(str)) {
            return false;
        }
        return true;
    }
}
