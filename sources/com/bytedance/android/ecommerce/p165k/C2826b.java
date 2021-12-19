package com.bytedance.android.ecommerce.p165k;

import android.content.Context;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.bytedance.android.ecommerce.p164j.AbstractC2805d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.bytedance.android.ecommerce.k.b */
public final class C2826b implements AbstractC2805d {

    /* renamed from: a */
    private final Context f8430a;

    /* renamed from: b */
    private final WebChromeClient f8431b = new WebChromeClient() {
        /* class com.bytedance.android.ecommerce.p165k.C2826b.C28271 */

        static {
            Covode.recordClassIndex(3253);
        }

        public final void onProgressChanged(WebView webView, int i) {
        }
    };

    static {
        Covode.recordClassIndex(3252);
    }

    public C2826b(Context context) {
        this.f8430a = context;
    }

    @Override // com.bytedance.android.ecommerce.p164j.AbstractC2805d
    /* renamed from: a */
    public final String mo7392a(String str) {
        MethodCollector.m26663i(3756);
        try {
            WebView webView = new WebView(this.f8430a);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.setWebChromeClient(this.f8431b);
            webView.loadData("<head>\n    <script type=\"text/javascript\"\n            src=\"https://h.online-metrix.net/fp/tags.js?org_id=" + "k8vif92e" + "&session_id=" + "bytedance" + str + "\"></script>\n</head>", "text/html", "UTF-8");
            MethodCollector.m26664o(3756);
            return "success";
        } catch (Throwable th) {
            th.getLocalizedMessage();
            String message = th.getMessage();
            MethodCollector.m26664o(3756);
            return message;
        }
    }
}
