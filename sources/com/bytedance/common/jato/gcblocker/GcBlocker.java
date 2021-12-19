package com.bytedance.common.jato.gcblocker;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;

public final class GcBlocker extends AbstractC13575a {

    /* renamed from: a */
    private static long f33015a = 209715200;

    /* renamed from: b */
    private static long f33016b = 536870912;

    /* renamed from: c */
    private final HashMap<String, Integer> f33017c = new HashMap<>();

    private static native int nativeCreateToken(boolean z);

    private static native void nativeReleaseToken(int i);

    private static native void nativeRequestBlockGc(long j);

    private static native int nativeStartBlockGc(int i);

    private static native void nativeStopBlockGc(int i);

    static {
        Covode.recordClassIndex(15593);
    }

    /* renamed from: a */
    private static boolean m24377a() {
        long j = Runtime.getRuntime().totalMemory();
        if ((Build.VERSION.SDK_INT < 29 || j < f33016b) && j >= f33015a) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.common.jato.gcblocker.AbstractC13575a
    /* renamed from: a */
    public final void mo21843a(long j) {
        MethodCollector.m26663i(10218);
        if (m24377a() && j > 0 && j <= 5000) {
            nativeRequestBlockGc(j);
        }
        MethodCollector.m26664o(10218);
    }

    @Override // com.bytedance.common.jato.gcblocker.AbstractC13575a
    /* renamed from: b */
    public final void mo21845b(String str) {
        MethodCollector.m26663i(10371);
        synchronized (this.f33017c) {
            try {
                Integer remove = this.f33017c.remove(str);
                if (remove != null && remove.intValue() > 0) {
                    nativeStopBlockGc(remove.intValue());
                    nativeReleaseToken(remove.intValue());
                }
            } finally {
                MethodCollector.m26664o(10371);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        if (r1 != null) goto L_0x0028;
     */
    @Override // com.bytedance.common.jato.gcblocker.AbstractC13575a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo21844a(java.lang.String r5) {
        /*
            r4 = this;
            r3 = 10219(0x27eb, float:1.432E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r3)
            boolean r0 = m24377a()
            if (r0 == 0) goto L_0x0040
            java.util.HashMap<java.lang.String, java.lang.Integer> r2 = r4.f33017c
            monitor-enter(r2)
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r4.f33017c     // Catch:{ all -> 0x003a }
            java.lang.Object r1 = r0.get(r5)     // Catch:{ all -> 0x003a }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x003a }
            if (r1 != 0) goto L_0x0028
            r0 = 0
            int r0 = nativeCreateToken(r0)     // Catch:{ all -> 0x003a }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x003a }
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r4.f33017c     // Catch:{ all -> 0x003a }
            r0.put(r5, r1)     // Catch:{ all -> 0x003a }
            if (r1 == 0) goto L_0x0035
        L_0x0028:
            int r0 = r1.intValue()     // Catch:{ all -> 0x003a }
            if (r0 <= 0) goto L_0x0035
            int r0 = r1.intValue()     // Catch:{ all -> 0x003a }
            nativeStartBlockGc(r0)     // Catch:{ all -> 0x003a }
        L_0x0035:
            monitor-exit(r2)     // Catch:{ all -> 0x003a }
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            return
        L_0x003a:
            r0 = move-exception
            monitor-exit(r2)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            throw r0
        L_0x0040:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.jato.gcblocker.GcBlocker.mo21844a(java.lang.String):void");
    }
}
