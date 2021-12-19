package com.google.android.gms.p1940d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.d.t */
public final class C25646t<TResult> implements AbstractC25652z<TResult> {

    /* renamed from: a */
    final Object f60777a = new Object();

    /* renamed from: b */
    AbstractC25627d f60778b;

    /* renamed from: c */
    private final Executor f60779c;

    static {
        Covode.recordClassIndex(31057);
    }

    public C25646t(Executor executor, AbstractC25627d dVar) {
        this.f60779c = executor;
        this.f60778b = dVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0024, code lost:
        r3.f60779c.execute(new com.google.android.gms.p1940d.RunnableC25647u(r3, r4));
     */
    @Override // com.google.android.gms.p1940d.AbstractC25652z
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo41899a(com.google.android.gms.p1940d.AbstractC25631h<TResult> r4) {
        /*
            r3 = this;
            r2 = 3515(0xdbb, float:4.926E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r2)
            boolean r0 = r4.mo41882b()
            if (r0 != 0) goto L_0x002e
            boolean r0 = r4.mo41885c()
            if (r0 != 0) goto L_0x002e
            java.lang.Object r1 = r3.f60777a
            monitor-enter(r1)
            com.google.android.gms.d.d r0 = r3.f60778b     // Catch:{ all -> 0x001d }
            if (r0 != 0) goto L_0x0023
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r2)
            return
        L_0x001d:
            r0 = move-exception
            monitor-exit(r1)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r2)
            throw r0
        L_0x0023:
            monitor-exit(r1)
            java.util.concurrent.Executor r1 = r3.f60779c
            com.google.android.gms.d.u r0 = new com.google.android.gms.d.u
            r0.<init>(r3, r4)
            r1.execute(r0)
        L_0x002e:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.p1940d.C25646t.mo41899a(com.google.android.gms.d.h):void");
    }

    @Override // com.google.android.gms.p1940d.AbstractC25652z
    /* renamed from: N_ */
    public final void mo41898N_() {
        MethodCollector.m26663i(3518);
        synchronized (this.f60777a) {
            try {
                this.f60778b = null;
            } finally {
                MethodCollector.m26664o(3518);
            }
        }
    }
}
