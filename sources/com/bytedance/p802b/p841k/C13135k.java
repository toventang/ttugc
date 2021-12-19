package com.bytedance.p802b.p841k;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

/* renamed from: com.bytedance.b.k.k */
public final class C13135k {

    /* renamed from: a */
    static int f31983a = 1;

    static {
        Covode.recordClassIndex(14971);
    }

    /* renamed from: a */
    private static String m23622a(String str, String str2) {
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static String m23623a(String str, Map<String, String> map) {
        if (!TextUtils.isDigitsOnly(str) && map != null && !map.isEmpty()) {
            if (str.indexOf("?") < 0) {
                str = str + "?";
            }
            str = str.endsWith("?") ? str + m23622a("sdk_version", "UTF-8") + "=" + m23622a(String.valueOf(f31983a), "UTF-8") : str + "&" + m23622a("sdk_version", "UTF-8") + "=" + m23622a(String.valueOf(f31983a), "UTF-8");
            if (map.size() > 0) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    if (map.get(entry.getKey()) != null) {
                        str = str.endsWith("?") ? str + m23622a(entry.getKey().toString(), "UTF-8") + "=" + m23622a(map.get(entry.getKey()).toString(), "UTF-8") : str + "&" + m23622a(entry.getKey().toString(), "UTF-8") + "=" + m23622a(map.get(entry.getKey()).toString(), "UTF-8");
                    }
                }
            }
        }
        return str;
    }
}
