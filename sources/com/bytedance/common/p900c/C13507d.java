package com.bytedance.common.p900c;

import android.os.Build;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.common.c.d */
public final class C13507d {

    /* renamed from: a */
    public static C13508a f32889a;

    /* renamed from: com.bytedance.common.c.d$a */
    public static class C13508a {
        static {
            Covode.recordClassIndex(15516);
        }

        /* renamed from: a */
        public void mo21778a(WebSettings webSettings, int i) {
        }

        /* renamed from: a */
        public void mo21779a(WebView webView) {
        }

        private C13508a() {
        }

        /* synthetic */ C13508a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.common.c.d$b */
    static class C13509b extends C13508a {
        static {
            Covode.recordClassIndex(15517);
        }

        private C13509b() {
            super((byte) 0);
        }

        /* synthetic */ C13509b(byte b) {
            this();
        }

        @Override // com.bytedance.common.p900c.C13507d.C13508a
        /* renamed from: a */
        public final void mo21779a(WebView webView) {
            if (webView != null) {
                try {
                    CookieManager.getInstance().setAcceptThirdPartyCookies(webView, true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        @Override // com.bytedance.common.p900c.C13507d.C13508a
        /* renamed from: a */
        public final void mo21778a(WebSettings webSettings, int i) {
            if (webSettings != null) {
                try {
                    webSettings.setMixedContentMode(i);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(15515);
        if (Build.VERSION.SDK_INT >= 21) {
            f32889a = new C13509b((byte) 0);
        } else {
            f32889a = new C13508a((byte) 0);
        }
    }

    /* renamed from: a */
    public static void m24290a(WebSettings webSettings, int i) {
        f32889a.mo21778a(webSettings, i);
    }
}
