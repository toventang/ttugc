package com.squareup.p2075a.p2076a.p2078b;

import com.bytedance.covode.number.Covode;
import com.bytedance.p951d.p952a.p953a.p954a.p955a.C14420a;

/* renamed from: com.squareup.a.a.b.i */
public final class C29174i {
    static {
        Covode.recordClassIndex(35523);
    }

    /* renamed from: a */
    public static boolean m58310a(String str) {
        if (str.equals("POST") || str.equals("PATCH") || str.equals(C14420a.f34883c) || str.equals(C14420a.f34884d) || str.equals("MOVE")) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m58311b(String str) {
        if (str.equals("POST") || str.equals(C14420a.f34883c) || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m58312c(String str) {
        if (m58311b(str) || str.equals(C14420a.f34885e) || str.equals(C14420a.f34884d) || str.equals("PROPFIND") || str.equals("MKCOL") || str.equals("LOCK")) {
            return true;
        }
        return false;
    }
}
