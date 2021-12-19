package com.bytedance.android.livesdk.model.utils.p593a;

import com.bytedance.covode.number.Covode;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.model.utils.a.d */
public final class C9910d {
    static {
        Covode.recordClassIndex(11456);
    }

    /* renamed from: a */
    private static String m18215a(String str, String str2) {
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
    public static String m18216a(List<? extends AbstractC9909c> list, String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        for (AbstractC9909c cVar : list) {
            String a = m18215a(cVar.mo16602a(), str);
            String b = cVar.mo16603b();
            if (b != null) {
                str2 = m18215a(b, str);
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
