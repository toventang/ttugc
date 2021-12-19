package com.google.android.gms.p1940d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.d.p */
public final class C25642p<TResult> implements AbstractC25652z<TResult> {

    /* renamed from: a */
    final Object f60768a = new Object();

    /* renamed from: b */
    AbstractC25625b f60769b;

    /* renamed from: c */
    private final Executor f60770c;

    static {
        Covode.recordClassIndex(31053);
    }

    public C25642p(Executor executor, AbstractC25625b bVar) {
        this.f60770c = executor;
        this.f60769b = bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001e, code lost:
        r3.f60770c.execute(new com.google.android.gms.p1940d.RunnableC25643q(r3));
     */
    @Override // com.google.android.gms.p1940d.AbstractC25652z
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo41899a(com.google.android.gms.p1940d.AbstractC25631h r4) {
        /*
            r3 = this;
            r2 = 1653(0x675, float:2.316E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r2)
            boolean r0 = r4.mo41885c()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r1 = r3.f60768a
            monitor-enter(r1)
            com.google.android.gms.d.b r0 = r3.f60769b     // Catch:{ all -> 0x0017 }
            if (r0 != 0) goto L_0x001d
            monitor-exit(r1)     // Catch:{ all -> 0x0017 }
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r2)
            return
        L_0x0017:
            r0 = move-exception
            monitor-exit(r1)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r2)
            throw r0
        L_0x001d:
            monitor-exit(r1)
            java.util.concurrent.Executor r1 = r3.f60770c
            com.google.android.gms.d.q r0 = new com.google.android.gms.d.q
            r0.<init>(r3)
            r1.execute(r0)
        L_0x0028:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.p1940d.C25642p.mo41899a(com.google.android.gms.d.h):void");
    }

    @Override // com.google.android.gms.p1940d.AbstractC25652z
    /* renamed from: N_ */
    public final void mo41898N_() {
        MethodCollector.m26663i(1656);
        synchronized (this.f60768a) {
            try {
                this.f60769b = null;
            } finally {
                MethodCollector.m26664o(1656);
            }
        }
    }
}
