package com.bytedance.ttnet.utils;

import com.bytedance.common.utility.C13617h;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.p995g.C14754d;
import com.bytedance.retrofit2.C22092q;
import com.bytedance.retrofit2.p1612c.AbstractC22021a;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.ttnet.utils.d */
public final class C22970d {
    static {
        Covode.recordClassIndex(26887);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        if (r1 != null) goto L_0x0028;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m43301a(java.lang.Throwable r4) {
        /*
            r3 = 0
            java.io.StringWriter r2 = new java.io.StringWriter     // Catch:{ all -> 0x0025 }
            r2.<init>()     // Catch:{ all -> 0x0025 }
            java.io.PrintWriter r1 = new java.io.PrintWriter     // Catch:{ all -> 0x0025 }
            r1.<init>(r2)     // Catch:{ all -> 0x0025 }
            r4.printStackTrace(r1)     // Catch:{ all -> 0x0026 }
            java.lang.Throwable r0 = r4.getCause()     // Catch:{ all -> 0x0026 }
            if (r0 == 0) goto L_0x0020
            r0.printStackTrace(r1)     // Catch:{ all -> 0x0026 }
            java.lang.Throwable r0 = r0.getCause()     // Catch:{ all -> 0x0026 }
            if (r0 == 0) goto L_0x0020
            r0.printStackTrace(r1)     // Catch:{ all -> 0x0026 }
        L_0x0020:
            java.lang.String r3 = r2.toString()     // Catch:{ all -> 0x0026 }
            goto L_0x0028
        L_0x0025:
            r1 = r3
        L_0x0026:
            if (r1 == 0) goto L_0x002b
        L_0x0028:
            r1.close()
        L_0x002b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.utils.C22970d.m43301a(java.lang.Throwable):java.lang.String");
    }

    /* renamed from: b */
    public static void m43304b(String str, List<String> list) {
        if (!(C13627m.m24498a(str) || list == null)) {
            String[] split = str.split(",");
            for (String str2 : split) {
                if (!C13627m.m24498a(str2) && !m43303a(str2, list)) {
                    list.add(str2.trim());
                }
            }
        }
    }

    /* renamed from: a */
    public static void m43302a(C14754d<String, C22092q> dVar, AbstractC22021a aVar) {
        MethodCollector.m26663i(4241);
        if (dVar == null || dVar.mo23772b() <= 0) {
            MethodCollector.m26664o(4241);
            return;
        }
        Map<String, C22092q> c = dVar.mo23774c();
        Collection<C22092q> values = c.values();
        synchronized (c) {
            try {
                for (C22092q qVar : values) {
                    List<AbstractC22021a> list = qVar.f52140g;
                    if (list != null && !list.contains(aVar)) {
                        list.add(aVar);
                    }
                }
            } finally {
                MethodCollector.m26664o(4241);
            }
        }
    }

    /* renamed from: a */
    public static boolean m43303a(String str, List<String> list) {
        if (!C13627m.m24498a(str) && !C13617h.m24465a(list)) {
            for (String str2 : list) {
                if (!C13627m.m24498a(str2) && str.endsWith(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
