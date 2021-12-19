package com.bytedance.apm.p789q;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;

/* renamed from: com.bytedance.apm.q.v */
public final class C12603v {
    static {
        Covode.recordClassIndex(14420);
    }

    /* renamed from: a */
    public static String m22728a(String str) {
        if (str == null) {
            return null;
        }
        try {
            URL url = new URL(str);
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(url.getProtocol());
            stringBuffer.append("://");
            stringBuffer.append(url.getHost());
            if (url.getPort() != -1) {
                stringBuffer.append(":");
                stringBuffer.append(url.getPort());
            }
            stringBuffer.append(url.getPath());
            return stringBuffer.toString();
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static String m22729a(String str, String str2) {
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static String m22730a(String str, Map<String, String> map) {
        if (!TextUtils.isDigitsOnly(str) && map != null && !map.isEmpty()) {
            if (str.indexOf("?") < 0) {
                str = str + "?";
            }
            str = str.endsWith("?") ? str + m22729a("sdk_version", "UTF-8") + "=" + m22729a("400", "UTF-8") : str + "&" + m22729a("sdk_version", "UTF-8") + "=" + m22729a("400", "UTF-8");
            if (map.size() > 0) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    if (map.get(entry.getKey()) != null) {
                        str = str.endsWith("?") ? str + m22729a(entry.getKey().toString(), "UTF-8") + "=" + m22729a(map.get(entry.getKey()).toString(), "UTF-8") : str + "&" + m22729a(entry.getKey().toString(), "UTF-8") + "=" + m22729a(map.get(entry.getKey()).toString(), "UTF-8");
                    }
                }
            }
        }
        return str;
    }
}
