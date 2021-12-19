package com.p1795d.p1796a.p1797a.p1798a.p1806g;

import android.webkit.WebView;
import com.bytedance.covode.number.Covode;

/* renamed from: com.d.a.a.a.g.b */
public final class C23807b extends AbstractC23805a {
    static {
        Covode.recordClassIndex(27915);
    }

    public C23807b(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        mo39266a(webView);
    }
}
