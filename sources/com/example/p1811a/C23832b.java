package com.example.p1811a;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.covode.number.Covode;

/* renamed from: com.example.a.b */
public final class C23832b extends WebViewClient {
    static {
        Covode.recordClassIndex(27940);
    }

    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (C23833c.f56367a != null) {
            return C23833c.f56367a.mo39294a(webView, renderProcessGoneDetail);
        }
        return true;
    }
}
