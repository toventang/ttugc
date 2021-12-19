package com.p2082ss.android.http.p2146a.p2147a.p2148a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.http.p2146a.AbstractC29938c;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

/* renamed from: com.ss.android.http.a.a.a.a */
public final class C29928a {
    static {
        Covode.recordClassIndex(36340);
    }

    /* renamed from: a */
    private static String m60309a(String str, String str2) {
        if (str2 == null) {
            try {
                return URLEncoder.encode(str, "ISO-8859-1");
            } catch (UnsupportedEncodingException e) {
                throw new IllegalArgumentException(e);
            }
        } else if (str2.equals("null_encoding")) {
            return str;
        } else {
            return URLEncoder.encode(str, str2);
        }
    }

    /* renamed from: a */
    public static String m60310a(List<? extends AbstractC29938c> list, String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        for (AbstractC29938c cVar : list) {
            String a = m60309a(cVar.mo52254a(), str);
            String b = cVar.mo52255b();
            if (b != null) {
                str2 = m60309a(b, str);
            } else {
                str2 = "";
            }
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(a);
            sb.append("=");
            sb.append(str2);
        }
        return sb.toString();
    }
}
