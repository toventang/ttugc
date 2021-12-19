package com.bytedance.push.p1600k;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.push.k.f */
public final class C21860f {

    /* renamed from: a */
    private Object f51786a;

    static {
        Covode.recordClassIndex(25512);
    }

    C21860f() {
    }

    /* renamed from: a */
    private Object m40954a() {
        MethodCollector.m26663i(4659);
        if (this.f51786a == null) {
            synchronized (C21858d.class) {
                try {
                    if (this.f51786a == null) {
                        try {
                            this.f51786a = Class.forName("android.os.SystemProperties").newInstance();
                        } catch (Throwable unused) {
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(4659);
                    throw th;
                }
            }
        }
        Object obj = this.f51786a;
        MethodCollector.m26664o(4659);
        return obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:?, code lost:
        r6 = m40954a();
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
    public final java.lang.String mo35538a(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = android.os.SystemProperties.get(r8)     // Catch:{ all -> 0x0005 }
            return r0
        L_0x0005:
            java.lang.Object r6 = r7.m40954a()     // Catch:{ IllegalArgumentException -> 0x0029, all -> 0x0026 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.push.p1600k.C21860f.mo35538a(java.lang.String):java.lang.String");
    }
}
