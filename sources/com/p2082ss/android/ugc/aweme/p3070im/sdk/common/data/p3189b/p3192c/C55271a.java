package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3189b.p3192c;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3189b.p3191b.EnumC55267a;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.data.b.c.a */
public class C55271a {

    /* renamed from: a */
    private static C55271a f126378a;

    static {
        Covode.recordClassIndex(65020);
    }

    private C55271a() {
    }

    /* renamed from: a */
    public static C55271a m101036a() {
        MethodCollector.m26663i(3576);
        if (f126378a == null) {
            synchronized (C55271a.class) {
                try {
                    if (f126378a == null) {
                        f126378a = new C55271a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3576);
                    throw th;
                }
            }
        }
        C55271a aVar = f126378a;
        MethodCollector.m26664o(3576);
        return aVar;
    }

    /* renamed from: b */
    public static String m101037b() {
        StringBuilder sb = new StringBuilder();
        sb.append("create table if not exists FRIENDS_RELATION (");
        EnumC55267a[] values = EnumC55267a.values();
        for (EnumC55267a aVar : values) {
            sb.append(aVar.key).append(" ").append(aVar.type).append(",");
        }
        String sb2 = sb.toString();
        return sb2.substring(0, sb2.length() - 1) + ");";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0057, code lost:
        if (r2 != null) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0059, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0046, code lost:
        if (r2 != null) goto L_0x0059;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Map<java.lang.String, java.lang.Integer> m101038c() {
        /*
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r2 = 0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x004b, all -> 0x0049 }
            r4.<init>()     // Catch:{ Exception -> 0x004b, all -> 0x0049 }
            java.lang.String r0 = "select * from FRIENDS_RELATION"
            r4.append(r0)     // Catch:{ Exception -> 0x004b, all -> 0x0049 }
            com.ss.android.ugc.aweme.im.sdk.common.data.b.a.b r1 = com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3189b.p3190a.C55266b.m101026a()     // Catch:{ Exception -> 0x004b, all -> 0x0049 }
            java.lang.String r0 = r4.toString()     // Catch:{ Exception -> 0x004b, all -> 0x0049 }
            android.database.Cursor r2 = r1.mo92264b(r0)     // Catch:{ Exception -> 0x004b, all -> 0x0049 }
            if (r2 == 0) goto L_0x0046
        L_0x001e:
            boolean r0 = r2.moveToNext()     // Catch:{ Exception -> 0x0044 }
            if (r0 == 0) goto L_0x0046
            com.ss.android.ugc.aweme.im.sdk.common.data.b.b.a r0 = com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3189b.p3191b.EnumC55267a.COLUMN_SEC_UID     // Catch:{ Exception -> 0x0044 }
            java.lang.String r0 = r0.key     // Catch:{ Exception -> 0x0044 }
            int r0 = r2.getColumnIndex(r0)     // Catch:{ Exception -> 0x0044 }
            java.lang.String r1 = r2.getString(r0)     // Catch:{ Exception -> 0x0044 }
            com.ss.android.ugc.aweme.im.sdk.common.data.b.b.a r0 = com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3189b.p3191b.EnumC55267a.COLUMN_RELATION_TYPE     // Catch:{ Exception -> 0x0044 }
            java.lang.String r0 = r0.key     // Catch:{ Exception -> 0x0044 }
            int r0 = r2.getColumnIndex(r0)     // Catch:{ Exception -> 0x0044 }
            int r0 = r2.getInt(r0)     // Catch:{ Exception -> 0x0044 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0044 }
            r3.put(r1, r0)     // Catch:{ Exception -> 0x0044 }
            goto L_0x001e
        L_0x0044:
            r0 = move-exception
            goto L_0x004c
        L_0x0046:
            if (r2 == 0) goto L_0x005c
            goto L_0x0059
        L_0x0049:
            r0 = move-exception
            goto L_0x0051
        L_0x004b:
            r0 = move-exception
        L_0x004c:
            r0.printStackTrace()     // Catch:{ all -> 0x0050 }
            goto L_0x0057
        L_0x0050:
            r0 = move-exception
        L_0x0051:
            if (r2 == 0) goto L_0x0056
            r2.close()
        L_0x0056:
            throw r0
        L_0x0057:
            if (r2 == 0) goto L_0x005c
        L_0x0059:
            r2.close()
        L_0x005c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3189b.p3192c.C55271a.m101038c():java.util.Map");
    }
}
