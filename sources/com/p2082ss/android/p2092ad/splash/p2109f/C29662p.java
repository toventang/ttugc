package com.p2082ss.android.p2092ad.splash.p2109f;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ad.splash.f.p */
public final class C29662p {
    static {
        Covode.recordClassIndex(36058);
    }

    /* renamed from: c */
    private static boolean m59780c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("sslocal://");
    }

    /* renamed from: a */
    public static boolean m59778a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith("http://") || str.startsWith("https://")) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m59779b(String str) {
        if (!m59780c(str)) {
            return false;
        }
        String host = Uri.parse(str).getHost();
        if ("microapp".equals(host) || "microgame".equals(host)) {
            return true;
        }
        return false;
    }
}
