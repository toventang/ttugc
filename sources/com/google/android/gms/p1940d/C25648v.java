package com.google.android.gms.p1940d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.d.v */
final class C25648v<TResult> implements AbstractC25652z<TResult> {

    /* renamed from: a */
    final Object f60782a = new Object();

    /* renamed from: b */
    AbstractC25628e<? super TResult> f60783b;

    /* renamed from: c */
    private final Executor f60784c;

    static {
        Covode.recordClassIndex(31059);
    }

    public C25648v(Executor executor, AbstractC25628e<? super TResult> eVar) {
        this.f60784c = executor;
        this.f60783b = eVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001e, code lost:
        r3.f60784c.execute(new com.google.android.gms.p1940d.RunnableC25649w(r3, r4));
     */
    @Override // com.google.android.gms.p1940d.AbstractC25652z
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo41899a(com.google.android.gms.p1940d.AbstractC25631h<TResult> r4) {
        /*
            r3 = this;
            r2 = 1546(0x60a, float:2.166E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r2)
            boolean r0 = r4.mo41882b()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r1 = r3.f60782a
            monitor-enter(r1)
            com.google.android.gms.d.e<? super TResult> r0 = r3.f60783b     // Catch:{ all -> 0x0017 }
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
            java.util.concurrent.Executor r1 = r3.f60784c
            com.google.android.gms.d.w r0 = new com.google.android.gms.d.w
            r0.<init>(r3, r4)
            r1.execute(r0)
        L_0x0028:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.p1940d.C25648v.mo41899a(com.google.android.gms.d.h):void");
    }

    @Override // com.google.android.gms.p1940d.AbstractC25652z
    /* renamed from: N_ */
    public final void mo41898N_() {
        MethodCollector.m26663i(1632);
        synchronized (this.f60782a) {
            try {
                this.f60783b = null;
            } finally {
                MethodCollector.m26664o(1632);
            }
        }
    }
}
