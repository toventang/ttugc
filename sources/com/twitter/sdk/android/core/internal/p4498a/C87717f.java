package com.twitter.sdk.android.core.internal.p4498a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.TreeMap;

/* renamed from: com.twitter.sdk.android.core.internal.a.f */
public final class C87717f {
    static {
        Covode.recordClassIndex(103706);
    }

    /* renamed from: a */
    public static String m152645a(String str) {
        if (str == null) {
            return "";
        }
        try {
            return URLEncoder.encode(str, "UTF8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    /* renamed from: c */
    private static String m152649c(String str) {
        if (str == null) {
            return "";
        }
        try {
            return URLDecoder.decode(str, "UTF8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    /* renamed from: b */
    public static String m152648b(String str) {
        int i;
        if (str == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String a = m152645a(str);
        int length = a.length();
        int i2 = 0;
        while (i2 < length) {
            char charAt = a.charAt(i2);
            if (charAt == '*') {
                sb.append("%2A");
            } else if (charAt == '+') {
                sb.append("%20");
            } else if (charAt == '%' && (i = i2 + 2) < length && a.charAt(i2 + 1) == '7' && a.charAt(i) == 'E') {
                sb.append('~');
                i2 = i;
            } else {
                sb.append(charAt);
            }
            i2++;
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static TreeMap<String, String> m152647a(URI uri, boolean z) {
        return m152646a(uri.getRawQuery(), z);
    }

    /* renamed from: a */
    public static TreeMap<String, String> m152646a(String str, boolean z) {
        TreeMap<String, String> treeMap = new TreeMap<>();
        if (str == null) {
            return treeMap;
        }
        for (String str2 : str.split("&")) {
            String[] split = str2.split("=");
            if (split.length == 2) {
                if (z) {
                    treeMap.put(m152649c(split[0]), m152649c(split[1]));
                } else {
                    treeMap.put(split[0], split[1]);
                }
            } else if (!TextUtils.isEmpty(split[0])) {
                if (z) {
                    treeMap.put(m152649c(split[0]), "");
                } else {
                    treeMap.put(split[0], "");
                }
            }
        }
        return treeMap;
    }
}
