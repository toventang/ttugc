package com.p2082ss.android.ugc.aweme.miniapp_api;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.miniapp_api.model.C59314b;

/* renamed from: com.ss.android.ugc.aweme.miniapp_api.d */
public final class C59308d {
    static {
        Covode.recordClassIndex(69686);
    }

    /* renamed from: a */
    public static String m109005a(C59314b bVar) {
        if (bVar == null) {
            return "";
        }
        return bVar.getSchema();
    }

    /* renamed from: e */
    private static boolean m109010e(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static String m109006a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return Uri.parse(str).getQueryParameter("app_id");
    }

    /* renamed from: b */
    public static boolean m109007b(String str) {
        if (!m109010e(str)) {
            return false;
        }
        return TextUtils.equals(Uri.parse(str).getHost(), "microapp");
    }

    /* renamed from: d */
    public static boolean m109009d(String str) {
        if (!m109010e(str)) {
            return false;
        }
        return TextUtils.equals(Uri.parse(str).getHost(), "microgame");
    }

    /* renamed from: c */
    public static boolean m109008c(String str) {
        if (!m109010e(str)) {
            return false;
        }
        String host = Uri.parse(str).getHost();
        if (TextUtils.equals(host, "microapp") || TextUtils.equals(host, "microgame")) {
            return true;
        }
        return false;
    }
}
