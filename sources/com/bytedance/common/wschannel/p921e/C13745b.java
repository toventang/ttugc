package com.bytedance.common.wschannel.p921e;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.common.wschannel.e.b */
public class C13745b {

    /* renamed from: a */
    private Object f33384a;

    static {
        Covode.recordClassIndex(15780);
    }

    C13745b() {
    }

    /* renamed from: a */
    private Object m24775a() {
        MethodCollector.m26663i(11561);
        if (this.f33384a == null) {
            synchronized (C13745b.class) {
                try {
                    if (this.f33384a == null) {
                        try {
                            this.f33384a = Class.forName("android.os.SystemProperties").newInstance();
                        } catch (Throwable unused) {
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(11561);
                    throw th;
                }
            }
        }
        Object obj = this.f33384a;
        MethodCollector.m26664o(11561);
        return obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:?, code lost:
        r6 = m24775a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0026, code lost:
        return "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0029, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        return (java.lang.String) r6.getClass().getMethod("get", java.lang.String.class).invoke(r6, r8);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0005 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo22103a(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = android.os.SystemProperties.get(r8)     // Catch:{ all -> 0x0005 }
            return r0
        L_0x0005:
            java.lang.Object r6 = r7.m24775a()     // Catch:{ IllegalArgumentException -> 0x0029, all -> 0x0026 }
            java.lang.Class r5 = r6.getClass()     // Catch:{ IllegalArgumentException -> 0x0029, all -> 0x0026 }
            java.lang.String r4 = "get"
            r3 = 1
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch:{ IllegalArgumentException -> 0x0029, all -> 0x0026 }
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r2 = 0
            r1[r2] = r0     // Catch:{ IllegalArgumentException -> 0x0029, all -> 0x0026 }
            java.lang.reflect.Method r1 = r5.getMethod(r4, r1)     // Catch:{ IllegalArgumentException -> 0x0029, all -> 0x0026 }
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ IllegalArgumentException -> 0x0029, all -> 0x0026 }
            r0[r2] = r8     // Catch:{ IllegalArgumentException -> 0x0029, all -> 0x0026 }
            java.lang.Object r0 = r1.invoke(r6, r0)     // Catch:{ IllegalArgumentException -> 0x0029, all -> 0x0026 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IllegalArgumentException -> 0x0029, all -> 0x0026 }
            goto L_0x0028
        L_0x0026:
            java.lang.String r0 = ""
        L_0x0028:
            return r0
        L_0x0029:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.p921e.C13745b.mo22103a(java.lang.String):java.lang.String");
    }
}
