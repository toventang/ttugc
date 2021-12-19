package com.p2082ss.android.ugc.aweme.tools.draft.p4101b;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.b.e */
public final class C78205e {

    /* renamed from: a */
    public static final C78205e f175657a = new C78205e();

    private C78205e() {
    }

    static {
        Covode.recordClassIndex(91320);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0048, code lost:
        if (r2.isClosed() == false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004a, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002f, code lost:
        if (r2.isClosed() == false) goto L_0x004a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final boolean m136689a(android.database.sqlite.SQLiteDatabase r5, java.lang.String r6, java.lang.String r7) {
        /*
            r4 = 8873(0x22a9, float:1.2434E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r4)
            r2 = 0
            r3 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0042, all -> 0x0032 }
            java.lang.String r0 = "SELECT * FROM "
            r1.<init>(r0)     // Catch:{ Exception -> 0x0042, all -> 0x0032 }
            java.lang.StringBuilder r1 = r1.append(r6)     // Catch:{ Exception -> 0x0042, all -> 0x0032 }
            java.lang.String r0 = " LIMIT 0"
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch:{ Exception -> 0x0042, all -> 0x0032 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0042, all -> 0x0032 }
            android.database.Cursor r2 = r5.rawQuery(r0, r2)     // Catch:{ Exception -> 0x0042, all -> 0x0032 }
            if (r2 == 0) goto L_0x004d
            int r1 = r2.getColumnIndex(r7)     // Catch:{ Exception -> 0x0042, all -> 0x0032 }
            r0 = -1
            if (r1 == r0) goto L_0x002b
            r0 = 1
            r3 = 1
        L_0x002b:
            boolean r0 = r2.isClosed()
            if (r0 != 0) goto L_0x004d
            goto L_0x004a
        L_0x0032:
            r1 = move-exception
            if (r2 == 0) goto L_0x003e
            boolean r0 = r2.isClosed()
            if (r0 != 0) goto L_0x003e
            r2.close()
        L_0x003e:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            throw r1
        L_0x0042:
            if (r2 == 0) goto L_0x004d
            boolean r0 = r2.isClosed()
            if (r0 != 0) goto L_0x004d
        L_0x004a:
            r2.close()
        L_0x004d:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.draft.p4101b.C78205e.m136689a(android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String):boolean");
    }
}
