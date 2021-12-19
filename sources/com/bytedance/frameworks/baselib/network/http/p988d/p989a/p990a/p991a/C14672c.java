package com.bytedance.frameworks.baselib.network.http.p988d.p989a.p990a.p991a;

import com.bytedance.covode.number.Covode;
import java.util.regex.Pattern;

/* renamed from: com.bytedance.frameworks.baselib.network.http.d.a.a.a.c */
public final class C14672c {

    /* renamed from: a */
    private static Pattern f35615a = Pattern.compile("^(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)$");

    /* renamed from: b */
    private static final Pattern f35616b = Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");

    /* renamed from: c */
    private static final Pattern f35617c = Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");

    static {
        Covode.recordClassIndex(16769);
    }

    /* renamed from: a */
    public static boolean m26845a(String str) {
        if (m26847c(str) || m26848d(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m26847c(String str) {
        return f35616b.matcher(str).matches();
    }

    /* renamed from: d */
    private static boolean m26848d(String str) {
        return f35617c.matcher(str).matches();
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0096 A[RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m26846b(java.lang.String r9) {
        /*
        // Method dump skipped, instructions count: 151
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.p988d.p989a.p990a.p991a.C14672c.m26846b(java.lang.String):boolean");
    }
}
