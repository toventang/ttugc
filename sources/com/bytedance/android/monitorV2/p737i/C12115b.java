package com.bytedance.android.monitorV2.p737i;

import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.monitorV2.i.b */
public final class C12115b {

    /* renamed from: a */
    public static boolean f29133a;

    /* renamed from: b */
    private static final boolean f29134b = Log.isLoggable("HBMonitorSDK_V2", 3);

    /* renamed from: c */
    private static final boolean f29135c = Log.isLoggable("HBMonitorSDK_Logcat", 3);

    /* renamed from: d */
    private static boolean f29136d = false;

    static {
        Covode.recordClassIndex(13844);
    }

    /* renamed from: a */
    private static boolean m21582a() {
        if (f29133a || f29134b) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static String m21579a(WebView webView) {
        if (webView == null) {
            return "null";
        }
        return webView.getClass().toString();
    }

    /* renamed from: a */
    private static String m21580a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "HBMonitorSDK_V2";
        }
        if (!str.startsWith("HBMonitorSDK_V2")) {
            return "HBMonitorSDK_V2_".concat(String.valueOf(str));
        }
        return str;
    }

    /* renamed from: a */
    public static void m21581a(String str, String str2) {
        if (m21582a()) {
            String a = m21580a(str);
            while (str2.length() > 3000) {
                if (f29135c || !C12114a.m21574a(a, str2.substring(0, 3000))) {
                    str2.substring(0, 3000);
                }
                str2 = str2.substring(3000);
            }
            if (!f29135c) {
                C12114a.m21574a(a, str2);
            }
        }
    }

    /* renamed from: b */
    public static void m21583b(String str, String str2) {
        String a = m21580a(str);
        while (str2.length() > 3000) {
            if (f29135c || !C12114a.m21577b(a, str2.substring(0, 3000))) {
                str2.substring(0, 3000);
            }
            str2 = str2.substring(3000);
        }
        if (!f29135c) {
            C12114a.m21577b(a, str2);
        }
    }

    /* renamed from: c */
    public static void m21584c(String str, String str2) {
        String a = m21580a(str);
        while (str2.length() > 3000) {
            if (f29135c || !C12114a.m21578c(a, str2.substring(0, 3000))) {
                str2.substring(0, 3000);
            }
            str2 = str2.substring(3000);
        }
        if (!f29135c) {
            C12114a.m21578c(a, str2);
        }
    }
}
