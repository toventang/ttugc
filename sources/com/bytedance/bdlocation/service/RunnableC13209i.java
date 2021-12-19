package com.bytedance.bdlocation.service;

import android.content.Context;
import com.bytedance.bpea.basics.AbstractC13343d;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.bdlocation.service.i */
public final /* synthetic */ class RunnableC13209i implements Runnable {

    /* renamed from: a */
    private final Context f32279a;

    /* renamed from: b */
    private final AbstractC13343d f32280b;

    static {
        Covode.recordClassIndex(15158);
    }

    RunnableC13209i(Context context, AbstractC13343d dVar) {
        this.f32279a = context;
        this.f32280b = dVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        com.bytedance.bdlocation.p848c.C13162b.m23690d("BDRegionLocation upload: start", "UploadScheduleController--onStart");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        if (r3.f32290d.isShutdown() != false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        if (com.bytedance.bdlocation.p846a.C13153b.f32052k == false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0042, code lost:
        r3.f32290d.submit(new com.bytedance.bdlocation.service.C13211k.RunnableC132121(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004c, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(3793);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0056, code lost:
        com.bytedance.bdlocation.p848c.C13162b.m23690d("BDRegionLocation upload: Throwable", "UploadScheduleController--onStart");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            r5 = 3793(0xed1, float:5.315E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r5)
            android.content.Context r2 = r6.f32279a
            com.bytedance.bpea.basics.d r4 = r6.f32280b
            boolean r0 = com.bytedance.bdlocation.p846a.C13153b.f32046e
            if (r0 == 0) goto L_0x005d
            java.lang.String r1 = "boot start upload task "
            java.lang.String r0 = "BDLocation"
            com.bytedance.bdlocation.p848c.C13162b.m23690d(r0, r1)
            com.bytedance.bdlocation.service.k r3 = com.bytedance.bdlocation.service.C13211k.m23757a(r2)
            android.content.Context r2 = r3.f32289b
            monitor-enter(r2)
            boolean r0 = com.bytedance.bdlocation.service.C13211k.f32287c     // Catch:{ all -> 0x0050 }
            if (r0 != 0) goto L_0x002b
            java.lang.String r1 = "BDRegionLocation upload: start"
            java.lang.String r0 = "more"
            com.bytedance.bdlocation.p848c.C13162b.m23690d(r1, r0)     // Catch:{ all -> 0x0050 }
            monitor-exit(r2)     // Catch:{ all -> 0x0050 }
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
            return
        L_0x002b:
            r0 = 0
            com.bytedance.bdlocation.service.C13211k.f32287c = r0
            monitor-exit(r2)
            java.lang.String r1 = "BDRegionLocation upload: start"
            java.lang.String r0 = "UploadScheduleController--onStart"
            com.bytedance.bdlocation.p848c.C13162b.m23690d(r1, r0)
            java.util.concurrent.ExecutorService r0 = r3.f32290d     // Catch:{ all -> 0x0056 }
            boolean r0 = r0.isShutdown()     // Catch:{ all -> 0x0056 }
            if (r0 != 0) goto L_0x004c
            boolean r0 = com.bytedance.bdlocation.p846a.C13153b.f32052k     // Catch:{ all -> 0x0056 }
            if (r0 == 0) goto L_0x004c
            java.util.concurrent.ExecutorService r1 = r3.f32290d     // Catch:{ all -> 0x0056 }
            com.bytedance.bdlocation.service.k$1 r0 = new com.bytedance.bdlocation.service.k$1     // Catch:{ all -> 0x0056 }
            r0.<init>(r4)     // Catch:{ all -> 0x0056 }
            r1.submit(r0)     // Catch:{ all -> 0x0056 }
        L_0x004c:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
            return
        L_0x0050:
            r0 = move-exception
            monitor-exit(r2)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
            throw r0
        L_0x0056:
            java.lang.String r1 = "BDRegionLocation upload: Throwable"
            java.lang.String r0 = "UploadScheduleController--onStart"
            com.bytedance.bdlocation.p848c.C13162b.m23690d(r1, r0)
        L_0x005d:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bdlocation.service.RunnableC13209i.run():void");
    }
}
