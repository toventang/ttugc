package com.bytedance.scene.p1622d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.bytedance.scene.d.b */
public class C22160b {

    /* renamed from: a */
    private boolean f52397a;

    /* renamed from: b */
    private AbstractC22161a f52398b;

    /* renamed from: c */
    private Object f52399c;

    /* renamed from: d */
    private boolean f52400d;

    /* renamed from: com.bytedance.scene.d.b$a */
    public interface AbstractC22161a {
        static {
            Covode.recordClassIndex(25965);
        }

        /* renamed from: a */
        void mo36323a();
    }

    static {
        Covode.recordClassIndex(25964);
    }

    /* renamed from: c */
    private void mo36345c() {
        MethodCollector.m26663i(10637);
        while (this.f52400d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
        MethodCollector.m26664o(10637);
    }

    /* renamed from: b */
    public final boolean mo36344b() {
        boolean z;
        MethodCollector.m26663i(10330);
        synchronized (this) {
            try {
                z = this.f52397a;
            } finally {
                MethodCollector.m26664o(10330);
            }
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        if (r0 == null) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r0.mo36323a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        if (r2 == null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0021, code lost:
        r0 = android.os.Build.VERSION.SDK_INT;
        ((android.os.CancellationSignal) r2).cancel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r4.f52400d = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0033, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(10472);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0036, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0037, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0039, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(10472);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003d, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r4.f52400d = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0043, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0047, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0048, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x004a, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(10472);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x004d, code lost:
        throw r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo36342a() {
        /*
            r4 = this;
            r3 = 10472(0x28e8, float:1.4674E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r3)
            monitor-enter(r4)
            boolean r0 = r4.f52397a     // Catch:{ all -> 0x004e }
            if (r0 == 0) goto L_0x000f
            monitor-exit(r4)     // Catch:{ all -> 0x004e }
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            return
        L_0x000f:
            r0 = 1
            r4.f52397a = r0
            r4.f52400d = r0
            com.bytedance.scene.d.b$a r0 = r4.f52398b
            java.lang.Object r2 = r4.f52399c
            monitor-exit(r4)
            r1 = 0
            if (r0 == 0) goto L_0x001f
            r0.mo36323a()     // Catch:{ all -> 0x002b }
        L_0x001f:
            if (r2 == 0) goto L_0x003d
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x002b }
            r0 = 16
            android.os.CancellationSignal r2 = (android.os.CancellationSignal) r2     // Catch:{ all -> 0x002b }
            r2.cancel()     // Catch:{ all -> 0x002b }
            goto L_0x003d
        L_0x002b:
            r0 = move-exception
            monitor-enter(r4)
            r4.f52400d = r1     // Catch:{ all -> 0x0037 }
            r4.notifyAll()     // Catch:{ all -> 0x0037 }
            monitor-exit(r4)     // Catch:{ all -> 0x0037 }
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            throw r0
        L_0x0037:
            r0 = move-exception
            monitor-exit(r4)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            throw r0
        L_0x003d:
            monitor-enter(r4)
            r4.f52400d = r1     // Catch:{ all -> 0x0048 }
            r4.notifyAll()     // Catch:{ all -> 0x0048 }
            monitor-exit(r4)     // Catch:{ all -> 0x0048 }
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            return
        L_0x0048:
            r0 = move-exception
            monitor-exit(r4)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            throw r0
        L_0x004e:
            r0 = move-exception
            monitor-exit(r4)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.scene.p1622d.C22160b.mo36342a():void");
    }

    /* renamed from: a */
    public final void mo36343a(AbstractC22161a aVar) {
        MethodCollector.m26663i(10474);
        synchronized (this) {
            try {
                mo36345c();
                if (this.f52398b != aVar) {
                    this.f52398b = aVar;
                    if (!this.f52397a) {
                        MethodCollector.m26664o(10474);
                        return;
                    }
                    aVar.mo36323a();
                    MethodCollector.m26664o(10474);
                }
            } finally {
                MethodCollector.m26664o(10474);
            }
        }
    }
}
