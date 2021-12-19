package com.bytedance.android.live.core.p218f;

import android.os.Build;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.bytedance.android.live.core.f.t */
public final class C3959t {

    /* renamed from: a */
    static final C3960a f10859a = new C3961b((byte) 0);

    /* renamed from: com.bytedance.android.live.core.f.t$a */
    static class C3960a {
        static {
            Covode.recordClassIndex(4489);
        }

        private C3960a() {
        }

        /* synthetic */ C3960a(byte b) {
            this();
        }

        /* renamed from: a */
        public void mo9307a(WebView webView, String str) {
            MethodCollector.m26663i(12018);
            if (webView == null) {
                MethodCollector.m26664o(12018);
                return;
            }
            try {
                webView.loadUrl(str);
                MethodCollector.m26664o(12018);
            } catch (Throwable unused) {
                MethodCollector.m26664o(12018);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.core.f.t$b */
    static class C3961b extends C3960a {
        static {
            Covode.recordClassIndex(4490);
        }

        private C3961b() {
            super((byte) 0);
        }

        /* synthetic */ C3961b(byte b) {
            this();
        }

        @Override // com.bytedance.android.live.core.p218f.C3959t.C3960a
        /* renamed from: a */
        public final void mo9307a(WebView webView, String str) {
            MethodCollector.m26663i(12155);
            if (webView == null) {
                MethodCollector.m26664o(12155);
                return;
            }
            if (str != null && str.startsWith("javascript:")) {
                try {
                    webView.evaluateJavascript(str, null);
                    MethodCollector.m26664o(12155);
                    return;
                } catch (Throwable th) {
                    boolean z = th instanceof IllegalStateException;
                }
            }
            try {
                webView.loadUrl(str);
                MethodCollector.m26664o(12155);
            } catch (Throwable unused) {
            }
        }
    }

    static {
        Covode.recordClassIndex(4488);
        int i = Build.VERSION.SDK_INT;
    }

    /* renamed from: a */
    public static void m9647a(WebView webView, String str) {
        f10859a.mo9307a(webView, str);
    }
}
