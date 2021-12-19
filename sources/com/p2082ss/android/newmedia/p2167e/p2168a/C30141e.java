package com.p2082ss.android.newmedia.p2167e.p2168a;

import android.app.Activity;
import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.common.p900c.C13501b;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.newmedia.e.a.e */
public final class C30141e {

    /* renamed from: a */
    private static String f71907a;

    /* renamed from: b */
    private static boolean f71908b;

    static {
        Covode.recordClassIndex(36640);
    }

    /* renamed from: a */
    public static final String m60967a(Context context, WebView webView) {
        String str;
        WebSettings settings;
        MethodCollector.m26663i(5974);
        if (webView == null || (settings = webView.getSettings()) == null) {
            str = null;
        } else {
            str = settings.getUserAgentString();
        }
        if (!C13627m.m24498a(str)) {
            f71907a = str;
            MethodCollector.m26664o(5974);
            return str;
        } else if (!C13627m.m24498a(f71907a)) {
            String str2 = f71907a;
            MethodCollector.m26664o(5974);
            return str2;
        } else {
            String a = C13501b.f32887a.mo21775a(context);
            f71907a = a;
            if (!C13627m.m24498a(a)) {
                String str3 = f71907a;
                MethodCollector.m26664o(5974);
                return str3;
            }
            if (!f71908b && webView == null && context != null && (context instanceof Activity)) {
                f71908b = true;
                try {
                    WebView webView2 = new WebView(context);
                    WebSettings settings2 = webView2.getSettings();
                    C89219l.m154716b(settings2, "");
                    f71907a = settings2.getUserAgentString();
                    webView2.destroy();
                } catch (Throwable unused) {
                }
            }
            String str4 = f71907a;
            MethodCollector.m26664o(5974);
            return str4;
        }
    }
}
