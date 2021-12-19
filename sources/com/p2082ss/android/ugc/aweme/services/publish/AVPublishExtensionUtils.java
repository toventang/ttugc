package com.p2082ss.android.ugc.aweme.services.publish;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.services.publish.AVPublishExtensionUtils */
public final class AVPublishExtensionUtils {
    static {
        Covode.recordClassIndex(79921);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, com.ss.android.ugc.aweme.services.publish.IAVPublishExtension] */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0038, code lost:
        if (r4 == false) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> T findExtension(java.util.List<? extends androidx.core.p036g.C0692e<java.lang.Class<?>, com.p2082ss.android.ugc.aweme.services.publish.IAVPublishExtension<?>>> r5, java.lang.Class<?> r6) {
        /*
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r5, r0)
            p4600h.p4611f.p4613b.C89219l.m154721d(r6, r0)
            java.util.Iterator r5 = r5.iterator()
            r0 = 0
            r4 = 0
            r3 = r0
        L_0x000f:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0038
            java.lang.Object r2 = r5.next()
            r1 = r2
            androidx.core.g.e r1 = (androidx.core.p036g.C0692e) r1
            F r1 = r1.f2750a
            if (r1 != 0) goto L_0x0023
            p4600h.p4611f.p4613b.C89219l.m154715b()
        L_0x0023:
            boolean r1 = p4600h.p4611f.p4613b.C89219l.m154714a(r1, r6)
            if (r1 == 0) goto L_0x000f
            if (r4 == 0) goto L_0x0035
        L_0x002b:
            r3 = r0
        L_0x002c:
            androidx.core.g.e r3 = (androidx.core.p036g.C0692e) r3
            if (r3 == 0) goto L_0x0034
            S r0 = r3.f2751b
            com.ss.android.ugc.aweme.services.publish.IAVPublishExtension r0 = (com.p2082ss.android.ugc.aweme.services.publish.IAVPublishExtension) r0
        L_0x0034:
            return r0
        L_0x0035:
            r4 = 1
            r3 = r2
            goto L_0x000f
        L_0x0038:
            if (r4 != 0) goto L_0x002c
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.services.publish.AVPublishExtensionUtils.findExtension(java.util.List, java.lang.Class):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        if (r3 == false) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> T findModel(java.util.List<? extends androidx.core.p036g.C0692e<java.lang.Class<?>, com.p2082ss.android.ugc.aweme.services.publish.IAVPublishExtension<?>>> r5, java.lang.Class<T> r6) {
        /*
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r5, r0)
            p4600h.p4611f.p4613b.C89219l.m154721d(r6, r0)
            java.util.Iterator r5 = r5.iterator()
            r4 = 0
            r3 = 0
            r2 = r4
        L_0x000f:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x003e
            java.lang.Object r1 = r5.next()
            r0 = r1
            androidx.core.g.e r0 = (androidx.core.p036g.C0692e) r0
            F r0 = r0.f2750a
            if (r0 != 0) goto L_0x0023
            p4600h.p4611f.p4613b.C89219l.m154715b()
        L_0x0023:
            boolean r0 = p4600h.p4611f.p4613b.C89219l.m154714a(r0, r6)
            if (r0 == 0) goto L_0x000f
            if (r3 == 0) goto L_0x003b
        L_0x002b:
            r2 = r4
        L_0x002c:
            androidx.core.g.e r2 = (androidx.core.p036g.C0692e) r2
            if (r2 == 0) goto L_0x0041
            S r0 = r2.f2751b
            com.ss.android.ugc.aweme.services.publish.IAVPublishExtension r0 = (com.p2082ss.android.ugc.aweme.services.publish.IAVPublishExtension) r0
            if (r0 == 0) goto L_0x0041
            java.lang.Object r0 = r0.provideExtensionData()
            return r0
        L_0x003b:
            r3 = 1
            r2 = r1
            goto L_0x000f
        L_0x003e:
            if (r3 != 0) goto L_0x002c
            goto L_0x002b
        L_0x0041:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.services.publish.AVPublishExtensionUtils.findModel(java.util.List, java.lang.Class):java.lang.Object");
    }
}
