package com.bytedance.webx.p1769i.p1775e;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.webx.p1769i.C23629a;
import com.bytedance.webx.p1769i.p1773c.C23640a;
import java.net.URLEncoder;

/* renamed from: com.bytedance.webx.i.e.d */
public final class C23655d {
    static {
        Covode.recordClassIndex(27754);
    }

    /* renamed from: a */
    public static boolean m44729a(String str) {
        return str.startsWith(C23629a.f55913b.f55937c);
    }

    /* renamed from: b */
    public static boolean m44731b(String str) {
        if (TextUtils.isEmpty(str) || ((!str.startsWith("http") && !str.startsWith("https")) || m44729a(str))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m44730a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (!str2.equals(str) && !str2.equals(str + "/"))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static String m44728a(String str, String str2, int i) {
        C23640a aVar = C23629a.f55913b;
        if (aVar == null || TextUtils.isEmpty(str) || m44729a(str) || !m44731b(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C23629a.f55913b.f55937c);
        if (i > 0) {
            sb.append("/middle-page");
        }
        sb.append("?aid=").append(aVar.f55935a).append("&lang=").append(aVar.f55936b).append("&scene=").append(str2).append("&jumper_version=1&target=").append(URLEncoder.encode(str));
        if (i > 0) {
            sb.append("&type=").append(i);
        }
        return sb.toString();
    }
}
