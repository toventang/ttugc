package com.bytedance.crash.nativecrash;

import com.bytedance.covode.number.Covode;
import org.json.JSONArray;

/* renamed from: com.bytedance.crash.nativecrash.d */
public final class C13952d {
    static {
        Covode.recordClassIndex(16015);
    }

    /* renamed from: a */
    public static String m25265a(JSONArray jSONArray) {
        for (int i = 0; i < jSONArray.length(); i++) {
            String optString = jSONArray.optString(i);
            if (optString.endsWith(")") && optString.contains("[xcrash] child terminated by a signal")) {
                return optString.substring(optString.lastIndexOf(40) + 1, optString.length() - 1);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m25266a(String str) {
        int i = 0;
        for (String str2 : str.split("\n")) {
            if (str2.trim().startsWith("#")) {
                i++;
            }
        }
        if (i <= 1) {
            return true;
        }
        return false;
    }
}
