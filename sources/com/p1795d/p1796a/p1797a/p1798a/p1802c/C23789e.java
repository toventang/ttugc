package com.p1795d.p1796a.p1797a.p1798a.p1802c;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p1795d.p1796a.p1797a.p1798a.p1804e.C23800c;
import com.p2082ss.android.ugc.tiktok.security.p4334b.C84357h;
import org.json.JSONObject;

/* renamed from: com.d.a.a.a.c.e */
public final class C23789e {

    /* renamed from: a */
    public static C23789e f56285a = new C23789e();

    static {
        Covode.recordClassIndex(27897);
    }

    private C23789e() {
    }

    /* renamed from: a */
    private void m44960a(final WebView webView, StringBuilder sb) {
        final String sb2 = sb.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            m44963c(webView, sb2);
        } else {
            handler.post(new Runnable() {
                /* class com.p1795d.p1796a.p1797a.p1798a.p1802c.C23789e.RunnableC237901 */

                static {
                    Covode.recordClassIndex(27898);
                }

                public final void run() {
                    MethodCollector.m26663i(4220);
                    WebView webView = webView;
                    String str = sb2;
                    String a = C84357h.f188595a.mo129370a(webView, str);
                    if (!TextUtils.isEmpty(a)) {
                        str = a;
                    }
                    webView.loadUrl(str);
                    MethodCollector.m26664o(4220);
                }
            });
        }
    }

    /* renamed from: a */
    private static void m44961a(StringBuilder sb, Object[] objArr) {
        StringBuilder append;
        if (objArr != null && objArr.length > 0) {
            for (Object obj : objArr) {
                if (obj == null) {
                    append = sb.append('\"');
                } else {
                    if (obj instanceof String) {
                        String obj2 = obj.toString();
                        if (obj2.startsWith("{")) {
                            sb.append(obj2);
                        } else {
                            append = sb.append('\"').append(obj2);
                        }
                    } else {
                        sb.append(obj);
                    }
                    sb.append(",");
                }
                append.append('\"');
                sb.append(",");
            }
            sb.setLength(sb.length() - 1);
        }
    }

    /* renamed from: a */
    public static boolean m44962a(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        m44963c(webView, "javascript: ".concat(String.valueOf(str)));
        return true;
    }

    /* renamed from: a */
    public final void mo39254a(WebView webView, float f) {
        mo39257a(webView, "setDeviceVolume", Float.valueOf(f));
    }

    /* renamed from: a */
    public final void mo39255a(WebView webView, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            mo39257a(webView, "publishMediaEvent", str, jSONObject);
            return;
        }
        mo39257a(webView, "publishMediaEvent", str);
    }

    /* renamed from: a */
    public final void mo39256a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        mo39257a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    /* renamed from: a */
    public final void mo39257a(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            m44961a(sb, objArr);
            sb.append(")}");
            m44960a(webView, sb);
            return;
        }
        C23800c.m44989a("The WebView is null for ".concat(String.valueOf(str)));
    }

    /* renamed from: b */
    public final void mo39258b(WebView webView, String str) {
        mo39257a(webView, "setNativeViewHierarchy", str);
    }

    /* renamed from: c */
    private static void m44963c(WebView webView, String str) {
        MethodCollector.m26663i(4410);
        String a = C84357h.f188595a.mo129370a(webView, str);
        if (!TextUtils.isEmpty(a)) {
            str = a;
        }
        webView.loadUrl(str);
        MethodCollector.m26664o(4410);
    }
}
