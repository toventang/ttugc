package com.bytedance.ies.web.p1285a;

import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.tiktok.security.p4334b.C84357h;

/* renamed from: com.bytedance.ies.web.a.i */
public final class C18298i {

    /* renamed from: a */
    static final C18299a f43677a = new C18300b((byte) 0);

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.web.a.i$a */
    public static class C18299a {
        static {
            Covode.recordClassIndex(20970);
        }

        private C18299a() {
        }

        /* synthetic */ C18299a(byte b) {
            this();
        }

        /* renamed from: a */
        public void mo29293a(WebView webView, String str) {
            MethodCollector.m26663i(4703);
            if (webView == null) {
                MethodCollector.m26664o(4703);
                return;
            }
            try {
                String a = C84357h.f188595a.mo129370a(webView, str);
                if (!TextUtils.isEmpty(a)) {
                    str = a;
                }
                webView.loadUrl(str);
                MethodCollector.m26664o(4703);
            } catch (Throwable unused) {
                MethodCollector.m26664o(4703);
            }
        }
    }

    /* renamed from: com.bytedance.ies.web.a.i$b */
    static class C18300b extends C18299a {
        static {
            Covode.recordClassIndex(20971);
        }

        private C18300b() {
            super((byte) 0);
        }

        /* synthetic */ C18300b(byte b) {
            this();
        }

        @Override // com.bytedance.ies.web.p1285a.C18298i.C18299a
        /* renamed from: a */
        public final void mo29293a(WebView webView, String str) {
            MethodCollector.m26663i(4800);
            if (webView == null) {
                MethodCollector.m26664o(4800);
                return;
            }
            if (str != null && str.startsWith("javascript:")) {
                try {
                    webView.evaluateJavascript(str, null);
                    MethodCollector.m26664o(4800);
                    return;
                } catch (Throwable th) {
                    boolean z = th instanceof IllegalStateException;
                }
            }
            try {
                String a = C84357h.f188595a.mo129370a(webView, str);
                if (!TextUtils.isEmpty(a)) {
                    str = a;
                }
                webView.loadUrl(str);
                MethodCollector.m26664o(4800);
            } catch (Throwable unused) {
            }
        }
    }

    static {
        Covode.recordClassIndex(20969);
        int i = Build.VERSION.SDK_INT;
    }

    /* renamed from: a */
    public static void m34033a(WebView webView, String str) {
        f43677a.mo29293a(webView, str);
    }
}
