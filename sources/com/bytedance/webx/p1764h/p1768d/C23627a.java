package com.bytedance.webx.p1764h.p1768d;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.tiktok.security.p4334b.C84357h;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.webx.h.d.a */
public final class C23627a {
    static {
        Covode.recordClassIndex(27726);
    }

    /* renamed from: a */
    public static boolean m44672a(WebView webView) {
        if (webView == null) {
            return false;
        }
        Object tag = webView.getTag(R.id.fim);
        if (tag instanceof Boolean) {
            return ((Boolean) tag).booleanValue();
        }
        return false;
    }

    /* renamed from: a */
    public static void m44671a(WebView webView, boolean z) {
        if (webView != null) {
            webView.setTag(R.id.fim, Boolean.valueOf(z));
        }
    }

    /* renamed from: a */
    public static void m44669a(WebView webView, Context context) {
        if (webView != null) {
            webView.stopLoading();
            m44673b(webView, context);
            m44670a(webView, "about:blank");
            webView.destroy();
        }
    }

    /* renamed from: b */
    public static void m44673b(WebView webView, Context context) {
        if (webView != null && context != null) {
            Context context2 = webView.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context);
            }
        }
    }

    /* renamed from: a */
    private static void m44670a(WebView webView, String str) {
        MethodCollector.m26663i(3723);
        String a = C84357h.f188595a.mo129370a(webView, str);
        if (!TextUtils.isEmpty(a)) {
            str = a;
        }
        webView.loadUrl(str);
        MethodCollector.m26664o(3723);
    }
}
