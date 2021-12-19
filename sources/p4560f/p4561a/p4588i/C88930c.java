package p4560f.p4561a.p4588i;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import org.p4663a.AbstractC90214c;
import p4560f.p4561a.p4568e.p4584j.C88898a;
import p4560f.p4561a.p4568e.p4584j.EnumC88909j;

/* access modifiers changed from: package-private */
/* renamed from: f.a.i.c */
public final class C88930c<T> extends AbstractC88927a<T> {

    /* renamed from: b */
    final AbstractC88927a<T> f201963b;

    /* renamed from: c */
    boolean f201964c;

    /* renamed from: d */
    C88898a<Object> f201965d;

    /* renamed from: e */
    volatile boolean f201966e;

    static {
        Covode.recordClassIndex(104972);
    }

    /* renamed from: g */
    private void m154189g() {
        C88898a<Object> aVar;
        MethodCollector.m26663i(1684);
        while (true) {
            synchronized (this) {
                try {
                    aVar = this.f201965d;
                    if (aVar == null) {
                        this.f201964c = false;
                        return;
                    }
                    this.f201965d = null;
                } finally {
                    MethodCollector.m26664o(1684);
                }
            }
            aVar.mo143174a((AbstractC90214c) this.f201963b);
        }
    }

    @Override // org.p4663a.AbstractC90214c
    public final void onComplete() {
        MethodCollector.m26663i(1650);
        if (this.f201966e) {
            MethodCollector.m26664o(1650);
            return;
        }
        synchronized (this) {
            try {
                if (!this.f201966e) {
                    this.f201966e = true;
                    if (this.f201964c) {
                        C88898a<Object> aVar = this.f201965d;
                        if (aVar == null) {
                            aVar = new C88898a<>();
                            this.f201965d = aVar;
                        }
                        aVar.mo143173a(EnumC88909j.complete());
                        MethodCollector.m26664o(1650);
                        return;
                    }
                    this.f201964c = true;
                    this.f201963b.onComplete();
                    MethodCollector.m26664o(1650);
                }
            } finally {
                MethodCollector.m26664o(1650);
            }
        }
    }

    C88930c(AbstractC88927a<T> aVar) {
        this.f201963b = aVar;
    }

    @Override // p4560f.p4561a.AbstractC88924h
    /* renamed from: a */
    public final void mo17954a(AbstractC90214c<? super T> cVar) {
        this.f201963b.mo57509a_(cVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003a, code lost:
        if (r2 == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
        p4560f.p4561a.p4587h.C88925a.m154178a(r5);
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(1643);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0042, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
        r4.f201963b.onError(r5);
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(1643);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004b, code lost:
        return;
     */
    @Override // org.p4663a.AbstractC90214c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onError(java.lang.Throwable r5) {
        /*
            r4 = this;
            r3 = 1643(0x66b, float:2.302E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r3)
            boolean r0 = r4.f201966e
            if (r0 == 0) goto L_0x0010
            p4560f.p4561a.p4587h.C88925a.m154178a(r5)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            return
        L_0x0010:
            monitor-enter(r4)
            boolean r0 = r4.f201966e     // Catch:{ all -> 0x004c }
            r2 = 0
            r1 = 1
            if (r0 == 0) goto L_0x0019
            r2 = 1
            goto L_0x0039
        L_0x0019:
            r4.f201966e = r1     // Catch:{ all -> 0x004c }
            boolean r0 = r4.f201964c     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x0037
            f.a.e.j.a<java.lang.Object> r0 = r4.f201965d     // Catch:{ all -> 0x004c }
            if (r0 != 0) goto L_0x002a
            f.a.e.j.a r0 = new f.a.e.j.a     // Catch:{ all -> 0x004c }
            r0.<init>()     // Catch:{ all -> 0x004c }
            r4.f201965d = r0     // Catch:{ all -> 0x004c }
        L_0x002a:
            java.lang.Object r1 = p4560f.p4561a.p4568e.p4584j.EnumC88909j.error(r5)     // Catch:{ all -> 0x004c }
            java.lang.Object[] r0 = r0.f201908b     // Catch:{ all -> 0x004c }
            r0[r2] = r1     // Catch:{ all -> 0x004c }
            monitor-exit(r4)     // Catch:{ all -> 0x004c }
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            return
        L_0x0037:
            r4.f201964c = r1
        L_0x0039:
            monitor-exit(r4)
            if (r2 == 0) goto L_0x0043
            p4560f.p4561a.p4587h.C88925a.m154178a(r5)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            return
        L_0x0043:
            f.a.i.a<T> r0 = r4.f201963b
            r0.onError(r5)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            return
        L_0x004c:
            r0 = move-exception
            monitor-exit(r4)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p4560f.p4561a.p4588i.C88930c.onError(java.lang.Throwable):void");
    }

    @Override // org.p4663a.AbstractC90214c
    public final void onNext(T t) {
        MethodCollector.m26663i(1634);
        if (this.f201966e) {
            MethodCollector.m26664o(1634);
            return;
        }
        synchronized (this) {
            try {
                if (!this.f201966e) {
                    if (this.f201964c) {
                        C88898a<Object> aVar = this.f201965d;
                        if (aVar == null) {
                            aVar = new C88898a<>();
                            this.f201965d = aVar;
                        }
                        aVar.mo143173a(EnumC88909j.next(t));
                        MethodCollector.m26664o(1634);
                        return;
                    }
                    this.f201964c = true;
                    this.f201963b.onNext(t);
                    m154189g();
                    MethodCollector.m26664o(1634);
                }
            } finally {
                MethodCollector.m26664o(1634);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0038, code lost:
        if (r1 == false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0041, code lost:
        r3.f201963b.onSubscribe(r4);
        m154189g();
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(1628);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004c, code lost:
        return;
     */
    @Override // org.p4663a.AbstractC90214c, p4560f.p4561a.AbstractC88955l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onSubscribe(org.p4663a.AbstractC90215d r4) {
        /*
            r3 = this;
            r2 = 1628(0x65c, float:2.281E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r2)
            boolean r0 = r3.f201966e
            r1 = 1
            if (r0 != 0) goto L_0x003a
            monitor-enter(r3)
            boolean r0 = r3.f201966e     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x0011
        L_0x000f:
            monitor-exit(r3)     // Catch:{ all -> 0x0032 }
            goto L_0x0038
        L_0x0011:
            boolean r0 = r3.f201964c     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x0029
            f.a.e.j.a<java.lang.Object> r1 = r3.f201965d     // Catch:{ all -> 0x0032 }
            if (r1 != 0) goto L_0x0020
            f.a.e.j.a r1 = new f.a.e.j.a     // Catch:{ all -> 0x0032 }
            r1.<init>()     // Catch:{ all -> 0x0032 }
            r3.f201965d = r1     // Catch:{ all -> 0x0032 }
        L_0x0020:
            java.lang.Object r0 = p4560f.p4561a.p4568e.p4584j.EnumC88909j.subscription(r4)     // Catch:{ all -> 0x0032 }
            r1.mo143173a(r0)     // Catch:{ all -> 0x0032 }
            monitor-exit(r3)     // Catch:{ all -> 0x0032 }
            goto L_0x002e
        L_0x0029:
            r3.f201964c = r1     // Catch:{ all -> 0x0032 }
            r0 = 0
            r1 = 0
            goto L_0x000f
        L_0x002e:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r2)
            return
        L_0x0032:
            r0 = move-exception
            monitor-exit(r3)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r2)
            throw r0
        L_0x0038:
            if (r1 == 0) goto L_0x0041
        L_0x003a:
            r4.cancel()
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r2)
            return
        L_0x0041:
            f.a.i.a<T> r0 = r3.f201963b
            r0.onSubscribe(r4)
            r3.m154189g()
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p4560f.p4561a.p4588i.C88930c.onSubscribe(org.a.d):void");
    }
}
