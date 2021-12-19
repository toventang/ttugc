package com.google.android.gms.p1940d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayDeque;
import java.util.Queue;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.d.aa */
public final class C25620aa<TResult> {

    /* renamed from: a */
    private final Object f60741a = new Object();

    /* renamed from: b */
    private Queue<AbstractC25652z<TResult>> f60742b;

    /* renamed from: c */
    private boolean f60743c;

    static {
        Covode.recordClassIndex(31031);
    }

    C25620aa() {
    }

    /* renamed from: a */
    public final void mo41865a(AbstractC25652z<TResult> zVar) {
        MethodCollector.m26663i(1290);
        synchronized (this.f60741a) {
            try {
                if (this.f60742b == null) {
                    this.f60742b = new ArrayDeque();
                }
                this.f60742b.add(zVar);
            } finally {
                MethodCollector.m26664o(1290);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0019, code lost:
        r1 = r3.f60741a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r0 = r3.f60742b.poll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0024, code lost:
        if (r0 != null) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0026, code lost:
        r3.f60743c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0029, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002b, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002c, code lost:
        r0.mo41899a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0033, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0034, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0036, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(1295);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0039, code lost:
        throw r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo41864a(com.google.android.gms.p1940d.AbstractC25631h<TResult> r4) {
        /*
            r3 = this;
            r2 = 1295(0x50f, float:1.815E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r2)
            java.lang.Object r1 = r3.f60741a
            monitor-enter(r1)
            java.util.Queue<com.google.android.gms.d.z<TResult>> r0 = r3.f60742b     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0010
            boolean r0 = r3.f60743c     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0015
        L_0x0010:
            monitor-exit(r1)     // Catch:{ all -> 0x003a }
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r2)
            return
        L_0x0015:
            r0 = 1
            r3.f60743c = r0
            monitor-exit(r1)
        L_0x0019:
            java.lang.Object r1 = r3.f60741a
            monitor-enter(r1)
            java.util.Queue<com.google.android.gms.d.z<TResult>> r0 = r3.f60742b     // Catch:{ all -> 0x0034 }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x0034 }
            com.google.android.gms.d.z r0 = (com.google.android.gms.p1940d.AbstractC25652z) r0     // Catch:{ all -> 0x0034 }
            if (r0 != 0) goto L_0x002b
            r0 = 0
            r3.f60743c = r0     // Catch:{ all -> 0x0034 }
            monitor-exit(r1)     // Catch:{ all -> 0x0034 }
            goto L_0x0030
        L_0x002b:
            monitor-exit(r1)
            r0.mo41899a(r4)
            goto L_0x0019
        L_0x0030:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r2)
            return
        L_0x0034:
            r0 = move-exception
            monitor-exit(r1)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r2)
            throw r0
        L_0x003a:
            r0 = move-exception
            monitor-exit(r1)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.p1940d.C25620aa.mo41864a(com.google.android.gms.d.h):void");
    }
}
