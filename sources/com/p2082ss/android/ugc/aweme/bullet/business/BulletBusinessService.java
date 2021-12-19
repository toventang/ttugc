package com.p2082ss.android.ugc.aweme.bullet.business;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.bullet.business.BulletBusinessService */
public final class BulletBusinessService {

    /* renamed from: a */
    private final C35123a f82868a;

    /* renamed from: b */
    private HashMap<Class, Business> f82869b = new HashMap<>();

    static {
        Covode.recordClassIndex(42256);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.business.BulletBusinessService$Business */
    public static class Business {

        /* renamed from: k */
        protected final C35123a f82870k;

        static {
            Covode.recordClassIndex(42257);
        }

        public Business(C35123a aVar) {
            this.f82870k = aVar;
        }
    }

    BulletBusinessService(C35123a aVar) {
        this.f82868a = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0046 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T extends com.p2082ss.android.ugc.aweme.bullet.business.BulletBusinessService.Business> T mo61948a(java.lang.Class<T> r7) {
        /*
            r6 = this;
            java.util.HashMap<java.lang.Class, com.ss.android.ugc.aweme.bullet.business.BulletBusinessService$Business> r0 = r6.f82869b
            boolean r0 = r0.containsKey(r7)
            if (r0 == 0) goto L_0x0011
            java.util.HashMap<java.lang.Class, com.ss.android.ugc.aweme.bullet.business.BulletBusinessService$Business> r0 = r6.f82869b
            java.lang.Object r0 = r0.get(r7)
            com.ss.android.ugc.aweme.bullet.business.BulletBusinessService$Business r0 = (com.p2082ss.android.ugc.aweme.bullet.business.BulletBusinessService.Business) r0
            return r0
        L_0x0011:
            int r0 = r7.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isAbstract(r0)
            if (r0 != 0) goto L_0x0048
            r5 = 0
            r4 = 1
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x003f }
            java.lang.Class<com.ss.android.ugc.aweme.bullet.business.a> r0 = com.p2082ss.android.ugc.aweme.bullet.business.C35123a.class
            r3 = 0
            r1[r3] = r0     // Catch:{ Exception -> 0x003f }
            java.lang.reflect.Constructor r2 = r7.getDeclaredConstructor(r1)     // Catch:{ Exception -> 0x003f }
            r2.setAccessible(r4)     // Catch:{ Exception -> 0x003f }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x003f }
            com.ss.android.ugc.aweme.bullet.business.a r0 = r6.f82868a     // Catch:{ Exception -> 0x003f }
            r1[r3] = r0     // Catch:{ Exception -> 0x003f }
            java.lang.Object r1 = r2.newInstance(r1)     // Catch:{ Exception -> 0x003f }
            com.ss.android.ugc.aweme.bullet.business.BulletBusinessService$Business r1 = (com.p2082ss.android.ugc.aweme.bullet.business.BulletBusinessService.Business) r1     // Catch:{ Exception -> 0x003f }
            java.util.HashMap<java.lang.Class, com.ss.android.ugc.aweme.bullet.business.BulletBusinessService$Business> r0 = r6.f82869b     // Catch:{ Exception -> 0x003d }
            r0.put(r7, r1)     // Catch:{ Exception -> 0x003d }
            goto L_0x0044
        L_0x003d:
            r0 = move-exception
            goto L_0x0041
        L_0x003f:
            r0 = move-exception
            r1 = r5
        L_0x0041:
            r0.printStackTrace()
        L_0x0044:
            if (r1 != 0) goto L_0x0047
            return r5
        L_0x0047:
            return r1
        L_0x0048:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "can't use abstract class!"
            r1.<init>(r0)
            java.lang.String r0 = r7.getSimpleName()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.bullet.business.BulletBusinessService.mo61948a(java.lang.Class):com.ss.android.ugc.aweme.bullet.business.BulletBusinessService$Business");
    }
}
