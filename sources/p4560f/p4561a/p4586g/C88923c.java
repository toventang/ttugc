package p4560f.p4561a.p4586g;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4568e.p4584j.C88898a;
import p4560f.p4561a.p4568e.p4584j.EnumC88909j;

/* renamed from: f.a.g.c */
public final class C88923c<T> implements AbstractC88412b, AbstractC88986z<T> {

    /* renamed from: a */
    final AbstractC88986z<? super T> f201926a;

    /* renamed from: b */
    final boolean f201927b;

    /* renamed from: c */
    AbstractC88412b f201928c;

    /* renamed from: d */
    boolean f201929d;

    /* renamed from: e */
    C88898a<Object> f201930e;

    /* renamed from: f */
    volatile boolean f201931f;

    static {
        Covode.recordClassIndex(104965);
    }

    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public final void dispose() {
        this.f201928c.dispose();
    }

    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public final boolean isDisposed() {
        return this.f201928c.isDisposed();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
        r4 = r6.f201926a;
        r0 = r1.f201908b;
        r3 = r1.f201907a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0019, code lost:
        if (r0 == null) goto L_0x0005;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
        if (r2 >= r3) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        r1 = r0[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0020, code lost:
        if (r1 == null) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0026, code lost:
        if (p4560f.p4561a.p4568e.p4584j.EnumC88909j.acceptFull(r1, r4) == false) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002c, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002f, code lost:
        r0 = r0[r3];
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m154130a() {
        /*
            r6 = this;
            r5 = 2091(0x82b, float:2.93E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r5)
        L_0x0005:
            monitor-enter(r6)
            f.a.e.j.a<java.lang.Object> r1 = r6.f201930e     // Catch:{ all -> 0x0038 }
            r0 = 0
            if (r1 != 0) goto L_0x000f
            r6.f201929d = r0     // Catch:{ all -> 0x0038 }
            monitor-exit(r6)     // Catch:{ all -> 0x0038 }
            goto L_0x0034
        L_0x000f:
            r0 = 0
            r6.f201930e = r0     // Catch:{ all -> 0x0038 }
            monitor-exit(r6)     // Catch:{ all -> 0x0038 }
            f.a.z<? super T> r4 = r6.f201926a
            java.lang.Object[] r0 = r1.f201908b
            int r3 = r1.f201907a
        L_0x0019:
            if (r0 == 0) goto L_0x0005
            r2 = 0
        L_0x001c:
            if (r2 >= r3) goto L_0x002f
            r1 = r0[r2]
            if (r1 == 0) goto L_0x002f
            boolean r1 = p4560f.p4561a.p4568e.p4584j.EnumC88909j.acceptFull(r1, r4)
            if (r1 == 0) goto L_0x002c
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
            return
        L_0x002c:
            int r2 = r2 + 1
            goto L_0x001c
        L_0x002f:
            r0 = r0[r3]
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            goto L_0x0019
        L_0x0034:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
            return
        L_0x0038:
            r0 = move-exception
            monitor-exit(r6)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p4560f.p4561a.p4586g.C88923c.m154130a():void");
    }

    @Override // p4560f.p4561a.AbstractC88986z
    public final void onComplete() {
        MethodCollector.m26663i(2088);
        if (this.f201931f) {
            MethodCollector.m26664o(2088);
            return;
        }
        synchronized (this) {
            try {
                if (!this.f201931f) {
                    if (this.f201929d) {
                        C88898a<Object> aVar = this.f201930e;
                        if (aVar == null) {
                            aVar = new C88898a<>();
                            this.f201930e = aVar;
                        }
                        aVar.mo143173a(EnumC88909j.complete());
                        MethodCollector.m26664o(2088);
                        return;
                    }
                    this.f201931f = true;
                    this.f201929d = true;
                    this.f201926a.onComplete();
                    MethodCollector.m26664o(2088);
                }
            } finally {
                MethodCollector.m26664o(2088);
            }
        }
    }

    public C88923c(AbstractC88986z<? super T> zVar) {
        this(zVar, (byte) 0);
    }

    @Override // p4560f.p4561a.AbstractC88986z
    public final void onSubscribe(AbstractC88412b bVar) {
        if (EnumC88441b.validate(this.f201928c, bVar)) {
            this.f201928c = bVar;
            this.f201926a.onSubscribe(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0045, code lost:
        if (r3 == false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0047, code lost:
        p4560f.p4561a.p4587h.C88925a.m154178a(r6);
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(2080);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004e, code lost:
        r5.f201926a.onError(r6);
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(2080);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0056, code lost:
        return;
     */
    @Override // p4560f.p4561a.AbstractC88986z
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onError(java.lang.Throwable r6) {
        /*
            r5 = this;
            r4 = 2080(0x820, float:2.915E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r4)
            boolean r0 = r5.f201931f
            if (r0 == 0) goto L_0x0010
            p4560f.p4561a.p4587h.C88925a.m154178a(r6)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            return
        L_0x0010:
            monitor-enter(r5)
            boolean r0 = r5.f201931f     // Catch:{ all -> 0x0057 }
            r3 = 0
            r1 = 1
            if (r0 == 0) goto L_0x0019
            r3 = 1
            goto L_0x0044
        L_0x0019:
            boolean r0 = r5.f201929d     // Catch:{ all -> 0x0057 }
            if (r0 == 0) goto L_0x0040
            r5.f201931f = r1     // Catch:{ all -> 0x0057 }
            f.a.e.j.a<java.lang.Object> r2 = r5.f201930e     // Catch:{ all -> 0x0057 }
            if (r2 != 0) goto L_0x002a
            f.a.e.j.a r2 = new f.a.e.j.a     // Catch:{ all -> 0x0057 }
            r2.<init>()     // Catch:{ all -> 0x0057 }
            r5.f201930e = r2     // Catch:{ all -> 0x0057 }
        L_0x002a:
            java.lang.Object r1 = p4560f.p4561a.p4568e.p4584j.EnumC88909j.error(r6)     // Catch:{ all -> 0x0057 }
            boolean r0 = r5.f201927b     // Catch:{ all -> 0x0057 }
            if (r0 == 0) goto L_0x0037
            r2.mo143173a(r1)     // Catch:{ all -> 0x0057 }
        L_0x0035:
            monitor-exit(r5)     // Catch:{ all -> 0x0057 }
            goto L_0x003c
        L_0x0037:
            java.lang.Object[] r0 = r2.f201908b     // Catch:{ all -> 0x0057 }
            r0[r3] = r1     // Catch:{ all -> 0x0057 }
            goto L_0x0035
        L_0x003c:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            return
        L_0x0040:
            r5.f201931f = r1
            r5.f201929d = r1
        L_0x0044:
            monitor-exit(r5)
            if (r3 == 0) goto L_0x004e
            p4560f.p4561a.p4587h.C88925a.m154178a(r6)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            return
        L_0x004e:
            f.a.z<? super T> r0 = r5.f201926a
            r0.onError(r6)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            return
        L_0x0057:
            r0 = move-exception
            monitor-exit(r5)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p4560f.p4561a.p4586g.C88923c.onError(java.lang.Throwable):void");
    }

    @Override // p4560f.p4561a.AbstractC88986z
    public final void onNext(T t) {
        MethodCollector.m26663i(2064);
        if (this.f201931f) {
            MethodCollector.m26664o(2064);
        } else if (t == null) {
            this.f201928c.dispose();
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            MethodCollector.m26664o(2064);
        } else {
            synchronized (this) {
                try {
                    if (!this.f201931f) {
                        if (this.f201929d) {
                            C88898a<Object> aVar = this.f201930e;
                            if (aVar == null) {
                                aVar = new C88898a<>();
                                this.f201930e = aVar;
                            }
                            aVar.mo143173a(EnumC88909j.next(t));
                            MethodCollector.m26664o(2064);
                            return;
                        }
                        this.f201929d = true;
                        this.f201926a.onNext(t);
                        m154130a();
                        MethodCollector.m26664o(2064);
                    }
                } finally {
                    MethodCollector.m26664o(2064);
                }
            }
        }
    }

    private C88923c(AbstractC88986z<? super T> zVar, byte b) {
        this.f201926a = zVar;
        this.f201927b = false;
    }
}
