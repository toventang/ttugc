package com.bytedance.ies.bullet.kit.web;

import android.webkit.WebView;
import com.bytedance.android.monitor.webview.AbstractC12021c;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.web.C16684k;

/* renamed from: com.bytedance.ies.bullet.kit.web.h */
public final class C16499h extends C16684k {

    /* renamed from: a */
    private final AbstractC12021c f39560a;

    static {
        Covode.recordClassIndex(18930);
    }

    public C16499h(AbstractC12021c cVar) {
        this.f39560a = cVar;
    }

    public final void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        AbstractC12021c cVar = this.f39560a;
        if (cVar != null) {
            cVar.mo19237a(webView, i);
        }
    }
}
