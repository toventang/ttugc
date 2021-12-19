package com.p2082ss.android.ugc.aweme.push.downgrade;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lego.p3396f.C58227a;

/* renamed from: com.ss.android.ugc.aweme.push.downgrade.e */
public class C65714e {

    /* renamed from: a */
    public static volatile boolean f148066a;

    /* renamed from: b */
    public static volatile boolean f148067b;

    static {
        Covode.recordClassIndex(77212);
    }

    /* renamed from: a */
    public static boolean m117626a(Context context) {
        m117627b(context);
        return f148066a;
    }

    /* renamed from: b */
    private static void m117627b(Context context) {
        MethodCollector.m26663i(13558);
        if (!f148067b) {
            synchronized (C65714e.class) {
                try {
                    if (!f148067b) {
                        if (context == null || !C58227a.m105170a(context)) {
                            f148067b = true;
                        } else {
                            f148067b = m117628c(context);
                        }
                    }
                } finally {
                    MethodCollector.m26664o(13558);
                }
            }
            return;
        }
        MethodCollector.m26664o(13558);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        if (com.p2082ss.android.ugc.aweme.performance.C62845i.m113259b() != false) goto L_0x003a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0043 A[Catch:{ all -> 0x005a }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m117628c(android.content.Context r5) {
        /*
            r2 = 0
            com.bytedance.ies.abmock.b r1 = com.bytedance.ies.abmock.C16048b.m29633a()     // Catch:{ all -> 0x005a }
            java.lang.String r0 = "optimize_push_process"
            r3 = 1
            int r4 = r1.mo25412a(r3, r0, r3)     // Catch:{ all -> 0x005a }
            com.bytedance.ies.abmock.b r1 = com.bytedance.ies.abmock.C16048b.m29633a()     // Catch:{ all -> 0x005a }
            java.lang.String r0 = "optimize_push_process_v2"
            int r1 = r1.mo25412a(r3, r0, r2)     // Catch:{ all -> 0x005a }
            r0 = 4
            if (r4 != r0) goto L_0x001a
            goto L_0x003a
        L_0x001a:
            if (r4 == r3) goto L_0x003f
            com.p2082ss.android.ugc.aweme.performance.C62845i.m113255a(r5)     // Catch:{ all -> 0x005a }
            r0 = 3
            if (r4 != r0) goto L_0x0031
            boolean r0 = com.p2082ss.android.ugc.aweme.performance.C62845i.m113257a()     // Catch:{ all -> 0x005a }
            if (r0 != 0) goto L_0x003a
            if (r1 != r3) goto L_0x003c
            boolean r0 = com.p2082ss.android.ugc.aweme.utils.C80271br.m139139a()     // Catch:{ all -> 0x005a }
            if (r0 != 0) goto L_0x003a
            goto L_0x003c
        L_0x0031:
            r0 = 2
            if (r4 != r0) goto L_0x003c
            boolean r0 = com.p2082ss.android.ugc.aweme.performance.C62845i.m113259b()     // Catch:{ all -> 0x005a }
            if (r0 == 0) goto L_0x003c
        L_0x003a:
            r0 = 1
            goto L_0x003d
        L_0x003c:
            r0 = 0
        L_0x003d:
            com.p2082ss.android.ugc.aweme.push.downgrade.C65714e.f148066a = r0     // Catch:{ all -> 0x005a }
        L_0x003f:
            boolean r0 = com.p2082ss.android.ugc.aweme.push.downgrade.C65714e.f148066a     // Catch:{ all -> 0x005a }
            if (r0 != 0) goto L_0x0056
            java.lang.Boolean r0 = com.p2082ss.android.ugc.aweme.feed.C49907s.m93685a()     // Catch:{ all -> 0x005a }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x005a }
            if (r0 == 0) goto L_0x0054
            boolean r0 = com.p2082ss.android.ugc.aweme.p4173ug.C79631g.m138444a()     // Catch:{ all -> 0x005a }
            if (r0 == 0) goto L_0x0054
            goto L_0x0056
        L_0x0054:
            r0 = 0
            goto L_0x0057
        L_0x0056:
            r0 = 1
        L_0x0057:
            com.p2082ss.android.ugc.aweme.push.downgrade.C65714e.f148066a = r0     // Catch:{ all -> 0x005a }
            return r3
        L_0x005a:
            r0 = move-exception
            android.util.Log.getStackTraceString(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.push.downgrade.C65714e.m117628c(android.content.Context):boolean");
    }
}
