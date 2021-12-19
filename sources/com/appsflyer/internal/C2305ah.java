package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.bytedance.covode.number.Covode;

/* renamed from: com.appsflyer.internal.ah */
public final class C2305ah {

    /* renamed from: ı */
    private static String f6987;

    /* renamed from: Ι */
    private static String f6988;

    static {
        Covode.recordClassIndex(2557);
    }

    C2305ah() {
    }

    /* renamed from: ǃ */
    public static void m7070(String str) {
        f6987 = str;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || i == str.length() - 1) {
                sb.append(str.charAt(i));
            } else {
                sb.append("*");
            }
        }
        f6988 = sb.toString();
    }

    /* renamed from: Ι */
    public static void m7071(String str) {
        if (f6987 == null) {
            m7070(AppsFlyerProperties.getInstance().getString("AppsFlyerKey"));
        }
        String str2 = f6987;
        if (str2 != null && str.contains(str2)) {
            AFLogger.afInfoLog(str.replace(f6987, f6988));
        }
    }
}
