package com.bytedance.android.livesdk.browser;

import android.os.Build;
import android.os.Handler;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.example.p1811a.C23833c;
import com.p2082ss.android.common.util.C29843f;
import com.p2082ss.android.ugc.tiktok.security.p4335c.C84367b;

/* renamed from: com.bytedance.android.livesdk.browser.h */
public final class C7026h {

    /* renamed from: a */
    public static final boolean f17622a;

    /* renamed from: b */
    public static int f17623b = -1;

    /* renamed from: c */
    public static int f17624c = -1;

    /* renamed from: d */
    static Handler f17625d = null;

    /* renamed from: e */
    private static final boolean f17626e;

    /* renamed from: f */
    private static int f17627f = -1;

    static {
        boolean z;
        Covode.recordClassIndex(7765);
        int i = Build.VERSION.SDK_INT;
        boolean z2 = false;
        if (C29843f.m60136c()) {
            z = true;
        } else {
            z = false;
        }
        f17626e = z;
        if (z || (Build.VERSION.SDK_INT == 16 && "ZTE N5".equals(Build.MODEL))) {
            z2 = true;
        }
        f17622a = z2;
    }

    /* renamed from: a */
    public static void m14983a(WebView webView) {
        MethodCollector.m26663i(7352);
        if (webView == null) {
            MethodCollector.m26664o(7352);
            return;
        }
        webView.setWebChromeClient(null);
        C84367b.m145126a();
        webView.setWebViewClient(C23833c.m45038a(null));
        ViewParent parent = webView.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(webView);
            try {
                webView.destroy();
                MethodCollector.m26664o(7352);
                return;
            } catch (Throwable unused) {
            }
        }
        MethodCollector.m26664o(7352);
    }
}
