package com;

import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.language.C58068a;
import com.p2082ss.android.ugc.aweme.net.p3492e.C61339b;
import com.p2082ss.android.ugc.tiktok.security.p4335c.C84367b;
import java.util.Locale;

/* renamed from: com.a */
public final class C1764a {
    static {
        Covode.recordClassIndex(1934);
    }

    /* renamed from: a */
    public static String m5928a(String str, Object[] objArr) {
        if (str == null || !str.contains("%d")) {
            return String.format(str, objArr);
        }
        try {
            if (C58068a.m104898a()) {
                return String.format(Locale.ENGLISH, str, objArr);
            }
            return String.format(Locale.getDefault(), str, objArr);
        } catch (Exception unused) {
            return str;
        }
    }

    /* renamed from: a */
    public static String m5929a(Locale locale, String str, Object[] objArr) {
        try {
            if (C58068a.m104898a()) {
                locale = Locale.ENGLISH;
            }
            return String.format(locale, str, objArr);
        } catch (Exception unused) {
            return str;
        }
    }

    /* renamed from: a */
    public static View m5927a(LayoutInflater layoutInflater, int i, ViewGroup viewGroup, boolean z) {
        MethodCollector.m26663i(5967);
        if (!C61339b.m111037a()) {
            View inflate = layoutInflater.inflate(i, viewGroup, z);
            MethodCollector.m26664o(5967);
            return inflate;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        View inflate2 = layoutInflater.inflate(i, viewGroup, z);
        C61339b.m111036a("sys", i, SystemClock.elapsedRealtime() - elapsedRealtime, inflate2 != null ? inflate2.getContext() : null);
        MethodCollector.m26664o(5967);
        return inflate2;
    }

    /* renamed from: a */
    public static void m5930a(WebSettings webSettings, String str) {
        if (C84367b.m145126a() && (!str.contains("BytedanceWebview/d8a21c6") || !str.endsWith("BytedanceWebview/d8a21c6"))) {
            String replace = str.replace("BytedanceWebview/d8a21c6", "");
            StringBuilder sb = new StringBuilder();
            sb.append(replace).append(" BytedanceWebview/d8a21c6");
            str = sb.toString();
        }
        webSettings.setUserAgentString(str);
    }
}
