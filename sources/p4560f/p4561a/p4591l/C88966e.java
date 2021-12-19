package p4560f.p4561a.p4591l;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4568e.p4584j.C88898a;
import p4560f.p4561a.p4568e.p4584j.EnumC88909j;

/* access modifiers changed from: package-private */
/* renamed from: f.a.l.e */
public final class C88966e<T> extends AbstractC88969g<T> implements C88898a.AbstractC88899a<Object> {

    /* renamed from: a */
    final AbstractC88969g<T> f202041a;

    /* renamed from: b */
    boolean f202042b;

    /* renamed from: c */
    C88898a<Object> f202043c;

    /* renamed from: d */
    volatile boolean f202044d;

    static {
        Covode.recordClassIndex(105008);
    }

    /* renamed from: i */
    private void m154234i() {
        C88898a<Object> aVar;
        MethodCollector.m26663i(1025);
        while (true) {
            synchronized (this) {
                try {
                    aVar = this.f202043c;
                    if (aVar == null) {
                        this.f202042b = false;
                        return;
                    }
                    this.f202043c = null;
                } finally {
                    MethodCollector.m26664o(1025);
                }
            }
            aVar.mo143172a((C88898a.AbstractC88899a<? super Object>) this);
        }
    }

    @Override // p4560f.p4561a.AbstractC88986z
    public final void onComplete() {
        MethodCollector.m26663i(1022);
        if (this.f202044d) {
            MethodCollector.m26664o(1022);
            return;
        }
        synchronized (this) {
            try {
                if (!this.f202044d) {
                    this.f202044d = true;
                    if (this.f202042b) {
                        C88898a<Object> aVar = this.f202043c;
                        if (aVar == null) {
                            aVar = new C88898a<>();
                            this.f202043c = aVar;
                        }
                        aVar.mo143173a(EnumC88909j.complete());
                        MethodCollector.m26664o(1022);
                        return;
                    }
                    this.f202042b = true;
                    this.f202041a.onComplete();
                    MethodCollector.m26664o(1022);
                }
            } finally {
                MethodCollector.m26664o(1022);
            }
        }
    }

    C88966e(AbstractC88969g<T> gVar) {
        this.f202041a = gVar;
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super T> zVar) {
        this.f202041a.mo143062b((AbstractC88986z) zVar);
    }

    @Override // p4560f.p4561a.p4568e.p4584j.C88898a.AbstractC88899a, p4560f.p4561a.p4567d.AbstractC88438k
    /* renamed from: a */
    public final boolean mo7718a(Object obj) {
        return EnumC88909j.acceptFull(obj, this.f202041a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003a, code lost:
        if (r2 == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
        p4560f.p4561a.p4587h.C88925a.m154178a(r5);
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(1019);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0042, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
        r4.f202041a.onError(r5);
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(1019);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004b, code lost:
        return;
     */
    @Override // p4560f.p4561a.AbstractC88986z
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onError(java.lang.Throwable r5) {
        /*
            r4 = this;
            r3 = 1019(0x3fb, float:1.428E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r3)
            boolean r0 = r4.f202044d
            if (r0 == 0) goto L_0x0010
            p4560f.p4561a.p4587h.C88925a.m154178a(r5)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            return
        L_0x0010:
            monitor-enter(r4)
            boolean r0 = r4.f202044d     // Catch:{ all -> 0x004c }
            r2 = 0
            r1 = 1
            if (r0 == 0) goto L_0x0019
            r2 = 1
            goto L_0x0039
        L_0x0019:
            r4.f202044d = r1     // Catch:{ all -> 0x004c }
            boolean r0 = r4.f202042b     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x0037
            f.a.e.j.a<java.lang.Object> r0 = r4.f202043c     // Catch:{ all -> 0x004c }
            if (r0 != 0) goto L_0x002a
            f.a.e.j.a r0 = new f.a.e.j.a     // Catch:{ all -> 0x004c }
            r0.<init>()     // Catch:{ all -> 0x004c }
            r4.f202043c = r0     // Catch:{ all -> 0x004c }
        L_0x002a:
            java.lang.Object r1 = p4560f.p4561a.p4568e.p4584j.EnumC88909j.error(r5)     // Catch:{ all -> 0x004c }
            java.lang.Object[] r0 = r0.f201908b     // Catch:{ all -> 0x004c }
            r0[r2] = r1     // Catch:{ all -> 0x004c }
            monitor-exit(r4)     // Catch:{ all -> 0x004c }
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            return
        L_0x0037:
            r4.f202042b = r1
        L_0x0039:
            monitor-exit(r4)
            if (r2 == 0) goto L_0x0043
            p4560f.p4561a.p4587h.C88925a.m154178a(r5)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            return
        L_0x0043:
            f.a.l.g<T> r0 = r4.f202041a
            r0.onError(r5)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            return
        L_0x004c:
            r0 = move-exception
            monitor-exit(r4)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p4560f.p4561a.p4591l.C88966e.onError(java.lang.Throwable):void");
    }

    @Override // p4560f.p4561a.AbstractC88986z
    public final void onNext(T t) {
        MethodCollector.m26663i(1013);
        if (this.f202044d) {
            MethodCollector.m26664o(1013);
            return;
        }
        synchronized (this) {
            try {
                if (!this.f202044d) {
                    if (this.f202042b) {
                        C88898a<Object> aVar = this.f202043c;
                        if (aVar == null) {
                            aVar = new C88898a<>();
                            this.f202043c = aVar;
                        }
                        aVar.mo143173a(EnumC88909j.next(t));
                        MethodCollector.m26664o(1013);
                        return;
                    }
                    this.f202042b = true;
                    this.f202041a.onNext(t);
                    m154234i();
                    MethodCollector.m26664o(1013);
                }
            } finally {
                MethodCollector.m26664o(1013);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0038, code lost:
        if (r1 == false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0041, code lost:
        r3.f202041a.onSubscribe(r4);
        m154234i();
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(1006);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004c, code lost:
        return;
     */
    @Override // p4560f.p4561a.AbstractC88986z
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onSubscribe(p4560f.p4561a.p4565b.AbstractC88412b r4) {
        /*
            r3 = this;
            r2 = 1006(0x3ee, float:1.41E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r2)
            boolean r0 = r3.f202044d
            r1 = 1
            if (r0 != 0) goto L_0x003a
            monitor-enter(r3)
            boolean r0 = r3.f202044d     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x0011
        L_0x000f:
            monitor-exit(r3)     // Catch:{ all -> 0x0032 }
            goto L_0x0038
        L_0x0011:
            boolean r0 = r3.f202042b     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x0029
            f.a.e.j.a<java.lang.Object> r1 = r3.f202043c     // Catch:{ all -> 0x0032 }
            if (r1 != 0) goto L_0x0020
            f.a.e.j.a r1 = new f.a.e.j.a     // Catch:{ all -> 0x0032 }
            r1.<init>()     // Catch:{ all -> 0x0032 }
            r3.f202043c = r1     // Catch:{ all -> 0x0032 }
        L_0x0020:
            java.lang.Object r0 = p4560f.p4561a.p4568e.p4584j.EnumC88909j.disposable(r4)     // Catch:{ all -> 0x0032 }
            r1.mo143173a(r0)     // Catch:{ all -> 0x0032 }
            monitor-exit(r3)     // Catch:{ all -> 0x0032 }
            goto L_0x002e
        L_0x0029:
            r3.f202042b = r1     // Catch:{ all -> 0x0032 }
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
            r4.dispose()
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r2)
            return
        L_0x0041:
            f.a.l.g<T> r0 = r3.f202041a
            r0.onSubscribe(r4)
            r3.m154234i()
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p4560f.p4561a.p4591l.C88966e.onSubscribe(f.a.b.b):void");
    }
}
