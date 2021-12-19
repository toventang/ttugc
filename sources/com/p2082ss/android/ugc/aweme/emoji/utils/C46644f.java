package com.p2082ss.android.ugc.aweme.emoji.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import java.io.File;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.f */
public final class C46644f {

    /* renamed from: a */
    public static final C46644f f108766a = new C46644f();

    private C46644f() {
    }

    static {
        Covode.recordClassIndex(55236);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0055 A[SYNTHETIC, Splitter:B:29:0x0055] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m90038a(java.io.File r6) {
        /*
            r5 = 10517(0x2915, float:1.4737E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r5)
            java.lang.String r4 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r6, r4)
            r3 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x003f }
            java.io.FileReader r0 = new java.io.FileReader     // Catch:{ Exception -> 0x003f }
            r0.<init>(r6)     // Catch:{ Exception -> 0x003f }
            r2.<init>(r0)     // Catch:{ Exception -> 0x003f }
            java.lang.String r1 = r2.readLine()     // Catch:{ Exception -> 0x003c, all -> 0x0039 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x003c, all -> 0x0039 }
            r0.<init>()     // Catch:{ Exception -> 0x003c, all -> 0x0039 }
        L_0x001e:
            if (r1 == 0) goto L_0x0028
            r0.append(r1)     // Catch:{ Exception -> 0x003c, all -> 0x0039 }
            java.lang.String r1 = r2.readLine()     // Catch:{ Exception -> 0x003c, all -> 0x0039 }
            goto L_0x001e
        L_0x0028:
            java.lang.String r1 = r0.toString()     // Catch:{ Exception -> 0x003c, all -> 0x0039 }
            p4600h.p4611f.p4613b.C89219l.m154716b(r1, r4)     // Catch:{ Exception -> 0x003c, all -> 0x0039 }
            r2.close()     // Catch:{ Exception -> 0x0033 }
            goto L_0x0037
        L_0x0033:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0037:
            r4 = r1
            goto L_0x005d
        L_0x0039:
            r1 = move-exception
            r3 = r2
            goto L_0x0045
        L_0x003c:
            r0 = move-exception
            r3 = r2
            goto L_0x0040
        L_0x003f:
            r0 = move-exception
        L_0x0040:
            r0.printStackTrace()     // Catch:{ all -> 0x0044 }
            goto L_0x0053
        L_0x0044:
            r1 = move-exception
        L_0x0045:
            if (r3 == 0) goto L_0x004f
            r3.close()     // Catch:{ Exception -> 0x004b }
            goto L_0x004f
        L_0x004b:
            r0 = move-exception
            r0.printStackTrace()
        L_0x004f:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
            throw r1
        L_0x0053:
            if (r3 == 0) goto L_0x005d
            r3.close()     // Catch:{ Exception -> 0x0059 }
            goto L_0x005d
        L_0x0059:
            r0 = move-exception
            r0.printStackTrace()
        L_0x005d:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.emoji.utils.C46644f.m90038a(java.io.File):java.lang.String");
    }

    /* renamed from: a */
    public static final synchronized <T extends Serializable> List<T> m90040a(String str, Class<T> cls) {
        List<T> a;
        synchronized (C46644f.class) {
            MethodCollector.m26663i(10373);
            C89219l.m154721d(str, "");
            C89219l.m154721d(cls, "");
            File fileStreamPath = C17867d.m33078a().getFileStreamPath(str);
            C89219l.m154716b(fileStreamPath, "");
            a = m90039a(fileStreamPath, cls);
            MethodCollector.m26664o(10373);
        }
        return a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0061 A[SYNTHETIC, Splitter:B:21:0x0061] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0072 A[SYNTHETIC, Splitter:B:31:0x0072] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final synchronized <T extends java.io.Serializable> java.util.List<T> m90039a(java.io.File r8, java.lang.Class<T> r9) {
        /*
        // Method dump skipped, instructions count: 129
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.emoji.utils.C46644f.m90039a(java.io.File, java.lang.Class):java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x007e A[SYNTHETIC, Splitter:B:36:0x007e] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final synchronized <T extends java.io.Serializable> boolean m90041a(java.io.File r9, java.util.List<? extends T> r10) {
        /*
        // Method dump skipped, instructions count: 157
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.emoji.utils.C46644f.m90041a(java.io.File, java.util.List):boolean");
    }

    /* renamed from: a */
    public static final synchronized <T extends Serializable> boolean m90042a(String str, List<? extends T> list) {
        boolean a;
        synchronized (C46644f.class) {
            MethodCollector.m26663i(12782);
            C89219l.m154721d(str, "");
            File fileStreamPath = C17867d.m33078a().getFileStreamPath(str);
            C89219l.m154716b(fileStreamPath, "");
            a = m90041a(fileStreamPath, list);
            MethodCollector.m26664o(12782);
        }
        return a;
    }
}
