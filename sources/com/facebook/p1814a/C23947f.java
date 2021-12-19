package com.facebook.p1814a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.facebook.internal.p1894a.p1896b.C24677a;
import com.facebook.p1814a.C23866a;
import com.facebook.p1814a.C23909c;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

/* access modifiers changed from: package-private */
/* renamed from: com.facebook.a.f */
public class C23947f {

    /* renamed from: a */
    private static final String f56692a = C23947f.class.getName();

    C23947f() {
    }

    static {
        Covode.recordClassIndex(28068);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.a.f$a */
    public static class C23948a extends ObjectInputStream {
        static {
            Covode.recordClassIndex(28069);
        }

        /* access modifiers changed from: protected */
        @Override // java.io.ObjectInputStream
        public final ObjectStreamClass readClassDescriptor() {
            ObjectStreamClass readClassDescriptor = super.readClassDescriptor();
            if (readClassDescriptor.getName().equals("com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1")) {
                return ObjectStreamClass.lookup(C23866a.C23867a.class);
            }
            if (readClassDescriptor.getName().equals("com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV1")) {
                return ObjectStreamClass.lookup(C23909c.C23910a.class);
            }
            return readClassDescriptor;
        }

        public C23948a(InputStream inputStream) {
            super(inputStream);
            MethodCollector.m26663i(6595);
            MethodCollector.m26664o(6595);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        if (r1 != null) goto L_0x006f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized com.facebook.p1814a.C23999n m45271a() {
        /*
        // Method dump skipped, instructions count: 128
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p1814a.C23947f.m45271a():com.facebook.a.n");
    }

    /* renamed from: a */
    public static synchronized void m45273a(C23914d dVar) {
        synchronized (C23947f.class) {
            MethodCollector.m26663i(7065);
            if (C24677a.m47209a(C23947f.class)) {
                MethodCollector.m26664o(7065);
                return;
            }
            try {
                C23999n a = m45271a();
                for (C23866a aVar : dVar.mo39410a()) {
                    a.mo39482a(aVar, dVar.mo39409a(aVar).mo39484a());
                }
                m45274a(a);
                MethodCollector.m26664o(7065);
            } catch (Throwable th) {
                C24677a.m47208a(th, C23947f.class);
                MethodCollector.m26664o(7065);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:14|13|15|16|17|19) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0042, code lost:
        com.facebook.internal.C24693ad.m47251a(r4);
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(7347);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0033 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m45274a(com.facebook.p1814a.C23999n r8) {
        /*
            java.lang.String r7 = "AppEventsLogger.persistedevents"
            java.lang.Class<com.facebook.a.f> r6 = com.facebook.p1814a.C23947f.class
            r5 = 7347(0x1cb3, float:1.0295E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r5)
            boolean r0 = com.facebook.internal.p1894a.p1896b.C24677a.m47209a(r6)
            if (r0 == 0) goto L_0x0013
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
            return
        L_0x0013:
            r4 = 0
            com.facebook.internal.C24699ae.m47299a()     // Catch:{ all -> 0x0049 }
            android.content.Context r3 = com.facebook.C24872m.f59047g     // Catch:{ all -> 0x0049 }
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch:{ all -> 0x0033 }
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x0033 }
            r0 = 0
            java.io.FileOutputStream r0 = r3.openFileOutput(r7, r0)     // Catch:{ all -> 0x0033 }
            r1.<init>(r0)     // Catch:{ all -> 0x0033 }
            r2.<init>(r1)     // Catch:{ all -> 0x0033 }
            r2.writeObject(r8)     // Catch:{ all -> 0x0032 }
            com.facebook.internal.C24693ad.m47251a(r2)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
            return
        L_0x0032:
            r4 = r2
        L_0x0033:
            java.io.File r0 = r3.getFileStreamPath(r7)     // Catch:{ Exception -> 0x003a, all -> 0x0041 }
            m45275a(r0)     // Catch:{ Exception -> 0x003a, all -> 0x0041 }
        L_0x003a:
            com.facebook.internal.C24693ad.m47251a(r4)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
            return
        L_0x0041:
            r0 = move-exception
            com.facebook.internal.C24693ad.m47251a(r4)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
            throw r0
        L_0x0049:
            r0 = move-exception
            com.facebook.internal.p1894a.p1896b.C24677a.m47208a(r0, r6)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p1814a.C23947f.m45274a(com.facebook.a.n):void");
    }

    /* renamed from: a */
    private static boolean m45275a(File file) {
        MethodCollector.m26663i(7345);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(7345);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(7345);
        return delete;
    }

    /* renamed from: a */
    public static synchronized void m45272a(C23866a aVar, C24001o oVar) {
        synchronized (C23947f.class) {
            MethodCollector.m26663i(7062);
            if (C24677a.m47209a(C23947f.class)) {
                MethodCollector.m26664o(7062);
                return;
            }
            try {
                C23999n a = m45271a();
                a.mo39482a(aVar, oVar.mo39484a());
                m45274a(a);
                MethodCollector.m26664o(7062);
            } catch (Throwable th) {
                C24677a.m47208a(th, C23947f.class);
                MethodCollector.m26664o(7062);
            }
        }
    }
}
