package com.bytedance.android.monitor.p710h;

import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.monitor.h.b */
public final class C11937b {

    /* renamed from: a */
    public static boolean f28558a;

    static {
        Covode.recordClassIndex(13663);
    }

    /* renamed from: a */
    public static String m21060a(WebView webView) {
        if (webView == null) {
            return "null";
        }
        return webView.getClass().toString();
    }

    /* renamed from: a */
    private static String m21061a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "HBMonitorSDK";
        }
        if (!str.startsWith("HBMonitorSDK")) {
            return "HBMonitorSDK_".concat(String.valueOf(str));
        }
        return str;
    }

    /* renamed from: b */
    public static void m21063b(String str, String str2) {
        C11936a.m21056a(m21061a(str), str2);
    }

    /* renamed from: c */
    public static void m21064c(String str, String str2) {
        C11936a.m21059b(m21061a(str), str2);
    }

    /* renamed from: a */
    public static void m21062a(String str, String str2) {
        if (f28558a) {
            C11936a.m21057a(C11936a.m21054a("d"), m21061a(str), str2);
        }
    }
}
