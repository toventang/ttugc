package com.bytedance.ies.xbridge.base.runtime.p1293b;

import com.bytedance.covode.number.Covode;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Set;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.ies.xbridge.base.runtime.b.d */
public final class C18430d {

    /* renamed from: c */
    public static final C18431a f44050c = new C18431a((byte) 0);

    /* renamed from: a */
    public String f44051a;

    /* renamed from: b */
    public String f44052b = "UTF-8";

    /* renamed from: d */
    private final HashMap<String, String> f44053d = new HashMap<>();

    static {
        Covode.recordClassIndex(21104);
    }

    /* renamed from: com.bytedance.ies.xbridge.base.runtime.b.d$a */
    public static final class C18431a {
        static {
            Covode.recordClassIndex(21105);
        }

        private C18431a() {
        }

        public /* synthetic */ C18431a(byte b) {
            this();
        }

        /* renamed from: a */
        static String m34294a(String str, String str2) {
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
    }

    public final String toString() {
        return mo29469a();
    }

    /* renamed from: a */
    public final String mo29469a() {
        String str;
        if (this.f44053d.isEmpty()) {
            return this.f44051a;
        }
        HashMap<String, String> hashMap = this.f44053d;
        String str2 = this.f44052b;
        StringBuilder sb = new StringBuilder();
        Set<String> keySet = hashMap.keySet();
        String str3 = "";
        if (keySet != null && !keySet.isEmpty()) {
            for (String str4 : keySet) {
                String a = C18431a.m34294a(str4, str2);
                String str5 = hashMap.get(str4);
                if (str5 == null || (str = C18431a.m34294a(str5, str2)) == null) {
                    str = str3;
                }
                if (sb.length() > 0) {
                    sb.append("&");
                }
                sb.append(a);
                sb.append("=");
                sb.append(str);
            }
            String sb2 = sb.toString();
            C89219l.m154709a((Object) sb2, str3);
            str3 = sb2;
        }
        String str6 = this.f44051a;
        if (str6 == null || str6.length() == 0) {
            return str3;
        }
        if (C89361p.m154882a((CharSequence) this.f44051a, '?', 0, false, 6) >= 0) {
            return this.f44051a + '&' + str3;
        }
        return this.f44051a + '?' + str3;
    }

    public C18430d(String str) {
        C89219l.m154719c(str, "");
        this.f44051a = str;
    }

    /* renamed from: a */
    public final C18430d mo29468a(String str, String str2) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        this.f44053d.put(str, str2);
        return this;
    }
}
