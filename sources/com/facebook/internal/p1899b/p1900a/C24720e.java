package com.facebook.internal.p1899b.p1900a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.facebook.internal.p1899b.AbstractC24727e;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;

/* renamed from: com.facebook.internal.b.a.e */
public final class C24720e implements AbstractC24727e {

    /* renamed from: a */
    private static C24720e f58704a;

    static {
        Covode.recordClassIndex(28873);
    }

    private C24720e() {
    }

    /* renamed from: b */
    public static synchronized C24720e m47345b() {
        C24720e eVar;
        synchronized (C24720e.class) {
            MethodCollector.m26663i(5995);
            if (f58704a == null) {
                f58704a = new C24720e();
            }
            eVar = f58704a;
            MethodCollector.m26664o(5995);
        }
        return eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.Collection] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.facebook.internal.p1899b.AbstractC24727e
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Collection<com.facebook.internal.p1899b.AbstractC24713a> mo40562a() {
        /*
            r8 = this;
            java.lang.String r7 = "facebooksdk.monitoring.persistedlogs"
            r6 = 6148(0x1804, float:8.615E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r6)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            com.facebook.internal.C24699ae.m47299a()
            android.content.Context r4 = com.facebook.C24872m.f59047g
            r3 = 0
            java.io.FileInputStream r1 = r4.openFileInput(r7)     // Catch:{ Exception -> 0x0044, all -> 0x0034 }
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch:{ Exception -> 0x0044, all -> 0x0034 }
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x0044, all -> 0x0034 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0044, all -> 0x0034 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x0044, all -> 0x0034 }
            java.lang.Object r1 = r2.readObject()     // Catch:{ Exception -> 0x0043, all -> 0x0031 }
            java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ Exception -> 0x0043, all -> 0x0031 }
            com.facebook.internal.C24693ad.m47251a(r2)
            java.io.File r0 = r4.getFileStreamPath(r7)     // Catch:{ Exception -> 0x004f }
            m47344a(r0)     // Catch:{ Exception -> 0x004f }
            goto L_0x004f
        L_0x0031:
            r1 = move-exception
            r3 = r2
            goto L_0x0035
        L_0x0034:
            r1 = move-exception
        L_0x0035:
            com.facebook.internal.C24693ad.m47251a(r3)
            java.io.File r0 = r4.getFileStreamPath(r7)     // Catch:{ Exception -> 0x003f }
            m47344a(r0)     // Catch:{ Exception -> 0x003f }
        L_0x003f:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r6)
            throw r1
        L_0x0043:
            r3 = r2
        L_0x0044:
            com.facebook.internal.C24693ad.m47251a(r3)
            java.io.File r0 = r4.getFileStreamPath(r7)     // Catch:{ Exception -> 0x0050 }
            m47344a(r0)     // Catch:{ Exception -> 0x0050 }
            goto L_0x0050
        L_0x004f:
            r5 = r1
        L_0x0050:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.p1899b.p1900a.C24720e.mo40562a():java.util.Collection");
    }

    /* renamed from: a */
    private static boolean m47344a(File file) {
        MethodCollector.m26663i(6288);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(6288);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(6288);
        return delete;
    }
}
