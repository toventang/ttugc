package com.p2082ss.android.p2092ad.splash.p2109f;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2092ad.splash.core.C29495h;

/* renamed from: com.ss.android.ad.splash.f.a */
public final class C29638a {
    static {
        Covode.recordClassIndex(36034);
    }

    /* renamed from: b */
    public static void m59663b(String str) {
        if (C29495h.m59104c() != null) {
            StringBuilder sb = new StringBuilder();
            m59662a(sb, 0, str, null);
            C29495h.m59104c().mo28670c("[BDASplash]", sb.toString(), null, null);
        }
    }

    /* renamed from: a */
    public static void m59661a(String str) {
        if (C29495h.m59104c() != null) {
            StringBuilder sb = new StringBuilder();
            m59662a(sb, 0, str, null);
            C29495h.m59104c().mo28668a("[BDASplash]", sb.toString(), null, null);
        }
    }

    /* renamed from: a */
    public static void m59659a(long j, String str) {
        if (C29495h.m59104c() != null) {
            StringBuilder sb = new StringBuilder();
            m59662a(sb, j, str, null);
            C29495h.m59104c().mo28669b("[BDASplash]", sb.toString(), null, null);
        }
    }

    /* renamed from: a */
    public static void m59660a(long j, String str, Throwable th) {
        if (C29495h.m59104c() != null) {
            StringBuilder sb = new StringBuilder();
            m59662a(sb, j, str, th);
            C29495h.m59104c().mo28671d("[BDASplash]", sb.toString(), th, null);
        }
    }

    /* renamed from: a */
    private static void m59662a(StringBuilder sb, long j, String str, Throwable th) {
        sb.append("[BDASplash]");
        if (j > 0) {
            sb.append(", ");
            sb.append("SplashAdId");
            sb.append("= ");
            sb.append(j);
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(", message: ");
            sb.append(str);
        }
        if (th != null) {
            sb.append(", tr: ");
            sb.append(th.getMessage());
        }
    }
}
