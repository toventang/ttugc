package com.bytedance.ies.android.base.runtime.p1119a;

import com.bytedance.covode.number.Covode;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.ies.android.base.runtime.a.d */
public final class C16096d {

    /* renamed from: d */
    public static final C16097a f38766d = new C16097a((byte) 0);

    /* renamed from: a */
    final HashMap<String, String> f38767a = new HashMap<>();

    /* renamed from: b */
    public String f38768b;

    /* renamed from: c */
    public String f38769c = "UTF-8";

    static {
        Covode.recordClassIndex(18374);
    }

    /* renamed from: com.bytedance.ies.android.base.runtime.a.d$a */
    public static final class C16097a {
        static {
            Covode.recordClassIndex(18375);
        }

        private C16097a() {
        }

        public /* synthetic */ C16097a(byte b) {
            this();
        }

        /* renamed from: a */
        private static String m29899a(String str, String str2) {
            if (str2 == null) {
                try {
                    str = URLEncoder.encode(str, "ISO_8859_1");
                } catch (UnsupportedEncodingException e) {
                    throw new IllegalArgumentException(e);
                }
            } else if (!C89219l.m154714a((Object) str2, (Object) "null_encoding")) {
                str = URLEncoder.encode(str, str2);
            }
            C89219l.m154709a((Object) str, "");
            return str;
        }

        /* renamed from: a */
        public static String m29900a(Map<String, String> map, String str) {
            String str2;
            StringBuilder sb = new StringBuilder();
            Set<String> keySet = map.keySet();
            if (keySet == null || keySet.isEmpty()) {
                return "";
            }
            for (String str3 : keySet) {
                String a = m29899a(str3, str);
                String str4 = map.get(str3);
                if (str4 == null || (str2 = m29899a(str4, str)) == null) {
                    str2 = "";
                }
                if (sb.length() > 0) {
                    sb.append("&");
                }
                sb.append(a);
                sb.append("=");
                sb.append(str2);
            }
            String sb2 = sb.toString();
            C89219l.m154709a((Object) sb2, "");
            return sb2;
        }
    }

    public final String toString() {
        return mo25548a();
    }

    /* renamed from: a */
    public final String mo25548a() {
        if (this.f38767a.isEmpty()) {
            return this.f38768b;
        }
        String a = C16097a.m29900a(this.f38767a, this.f38769c);
        String str = this.f38768b;
        if (str == null || str.length() == 0) {
            return a;
        }
        if (C89361p.m154882a((CharSequence) this.f38768b, '?', 0, false, 6) >= 0) {
            return this.f38768b + '&' + a;
        }
        return this.f38768b + '?' + a;
    }

    public C16096d(String str) {
        C89219l.m154719c(str, "");
        this.f38768b = str;
    }
}
