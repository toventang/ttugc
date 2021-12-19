package com.p2082ss.android.newmedia;

import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.tiktok.security.p4334b.C84357h;

/* renamed from: com.ss.android.newmedia.g */
public final class C30144g {

    /* renamed from: a */
    static final C30145a f71912a = new C30146b((byte) 0);

    /* renamed from: com.ss.android.newmedia.g$a */
    static class C30145a {
        static {
            Covode.recordClassIndex(36645);
        }

        private C30145a() {
        }

        /* synthetic */ C30145a(byte b) {
            this();
        }

        /* renamed from: a */
        public void mo53557a(WebView webView, String str) {
            MethodCollector.m26663i(4663);
            if (webView == null) {
                MethodCollector.m26664o(4663);
                return;
            }
            try {
                String a = C84357h.f188595a.mo129370a(webView, str);
                if (!TextUtils.isEmpty(a)) {
                    str = a;
                }
                webView.loadUrl(str);
                MethodCollector.m26664o(4663);
            } catch (Throwable unused) {
                MethodCollector.m26664o(4663);
            }
        }
    }

    /* renamed from: com.ss.android.newmedia.g$b */
    static class C30146b extends C30145a {
        static {
            Covode.recordClassIndex(36646);
        }

        private C30146b() {
            super((byte) 0);
        }

        /* synthetic */ C30146b(byte b) {
            this();
        }

        @Override // com.p2082ss.android.newmedia.C30144g.C30145a
        /* renamed from: a */
        public final void mo53557a(WebView webView, String str) {
            MethodCollector.m26663i(4192);
            if (webView == null) {
                MethodCollector.m26664o(4192);
                return;
            }
            if (str != null && str.startsWith("javascript:")) {
                try {
                    webView.evaluateJavascript(str, null);
                    MethodCollector.m26664o(4192);
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
                MethodCollector.m26664o(4192);
            } catch (Throwable unused) {
            }
        }
    }

    static {
        Covode.recordClassIndex(36644);
        int i = Build.VERSION.SDK_INT;
    }

    /* renamed from: a */
    public static void m60968a(WebView webView, String str) {
        f71912a.mo53557a(webView, str);
    }
}
