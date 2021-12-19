package com.airbnb.epoxy;

import com.bytedance.covode.number.Covode;

/* renamed from: com.airbnb.epoxy.b */
public final class C1924b {
    static {
        Covode.recordClassIndex(2115);
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0004  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m6128a(android.content.Context r3) {
        /*
        L_0x0000:
            r2 = 1
            if (r3 != 0) goto L_0x0004
            return r2
        L_0x0004:
            boolean r0 = r3 instanceof android.app.Activity
            r1 = 0
            if (r0 != 0) goto L_0x001a
            boolean r0 = r3 instanceof android.content.ContextWrapper
            if (r0 != 0) goto L_0x000e
            r3 = 0
        L_0x000e:
            android.content.ContextWrapper r3 = (android.content.ContextWrapper) r3
            if (r3 == 0) goto L_0x0019
            android.content.Context r3 = r3.getBaseContext()
            if (r3 == 0) goto L_0x0019
            goto L_0x0000
        L_0x0019:
            return r1
        L_0x001a:
            android.app.Activity r3 = (android.app.Activity) r3
            boolean r0 = r3.isFinishing()
            if (r0 == 0) goto L_0x0023
            return r2
        L_0x0023:
            int r0 = android.os.Build.VERSION.SDK_INT
            r0 = 17
            boolean r0 = r3.isDestroyed()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.epoxy.C1924b.m6128a(android.content.Context):boolean");
    }
}
