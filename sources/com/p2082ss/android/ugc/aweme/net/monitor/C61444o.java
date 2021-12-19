package com.p2082ss.android.ugc.aweme.net.monitor;

import com.bytedance.covode.number.Covode;
import java.util.Locale;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.net.monitor.o */
public final class C61444o {

    /* renamed from: a */
    public static final C61444o f139491a = new C61444o();

    private C61444o() {
    }

    static {
        Covode.recordClassIndex(72099);
    }

    /* renamed from: a */
    public static boolean m111273a(String str) {
        if (str != null && !C89361p.m154870a((CharSequence) str)) {
            Locale locale = Locale.getDefault();
            C89219l.m154716b(locale, "");
            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = str.toLowerCase(locale);
            C89219l.m154716b(lowerCase, "");
            if (C89361p.m154929e((CharSequence) lowerCase, (CharSequence) "application/json") || C89361p.m154929e((CharSequence) lowerCase, (CharSequence) "text/plain")) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0061, code lost:
        if (p4600h.p4622m.C89361p.m154870a((java.lang.CharSequence) r1) == false) goto L_0x0076;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m111270a(com.bytedance.retrofit2.C22099u<?> r7) {
        /*
        // Method dump skipped, instructions count: 152
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.net.monitor.C61444o.m111270a(com.bytedance.retrofit2.u):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0088  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m111272a(okhttp3.C90029ac r6) {
        /*
        // Method dump skipped, instructions count: 141
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.net.monitor.C61444o.m111272a(okhttp3.ac):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002b, code lost:
        p4600h.p4610e.C89146c.m154636a(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002e, code lost:
        throw r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m111271a(java.lang.String r3, java.io.InputStream r4) {
        /*
            boolean r0 = m111273a(r3)
            r3 = 0
            if (r0 == 0) goto L_0x002f
            if (r4 == 0) goto L_0x0018
            java.nio.charset.Charset r0 = p4600h.p4622m.C89338d.f202990a
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            r1.<init>(r4, r0)
            java.io.BufferedReader r2 = new java.io.BufferedReader
            r0 = 8192(0x2000, float:1.14794E-41)
            r2.<init>(r1, r0)
            goto L_0x0019
        L_0x0018:
            r2 = r3
        L_0x0019:
            r0 = r2
            java.io.BufferedReader r0 = (java.io.BufferedReader) r0     // Catch:{ all -> 0x0028 }
            if (r0 == 0) goto L_0x0023
            java.lang.String r0 = p4600h.p4610e.C89167q.m154662a(r0)     // Catch:{ all -> 0x0028 }
            goto L_0x0024
        L_0x0023:
            r0 = r3
        L_0x0024:
            p4600h.p4610e.C89146c.m154636a(r2, r3)
            return r0
        L_0x0028:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x002a }
        L_0x002a:
            r0 = move-exception
            p4600h.p4610e.C89146c.m154636a(r2, r1)
            throw r0
        L_0x002f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.net.monitor.C61444o.m111271a(java.lang.String, java.io.InputStream):java.lang.String");
    }
}
