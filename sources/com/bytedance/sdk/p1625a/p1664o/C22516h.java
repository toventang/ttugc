package com.bytedance.sdk.p1625a.p1664o;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.bytedance.sdk.a.o.h */
public final class C22516h {

    /* renamed from: a */
    public final Map<String, String> f53229a;

    /* renamed from: b */
    public String f53230b;

    static {
        Covode.recordClassIndex(26332);
    }

    public C22516h() {
        this.f53229a = new LinkedHashMap();
        this.f53230b = null;
    }

    public final String toString() {
        String str;
        if (this.f53229a.isEmpty()) {
            return this.f53230b;
        }
        Map<String, String> map = this.f53229a;
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String b = m42472b(entry.getKey(), "UTF-8");
            String value = entry.getValue();
            if (value != null) {
                str = m42472b(value, "UTF-8");
            } else {
                str = "";
            }
            if (!TextUtils.isEmpty(str)) {
                str = str.replace("+", "%20");
            }
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(b);
            sb.append("=");
            sb.append(str);
        }
        String sb2 = sb.toString();
        String str2 = this.f53230b;
        if (str2 == null || str2.length() == 0) {
            return sb2;
        }
        if (this.f53230b.indexOf(63) >= 0) {
            return this.f53230b + "&" + sb2;
        }
        return this.f53230b + "?" + sb2;
    }

    /* renamed from: a */
    public final void mo36787a(String str) {
        this.f53229a.put(str, "19");
    }

    public C22516h(String str) {
        this.f53229a = new LinkedHashMap();
        this.f53230b = str;
    }

    /* renamed from: b */
    private static String m42472b(String str, String str2) {
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public final void mo36788a(String str, String str2) {
        this.f53229a.put(str, str2);
    }
}
