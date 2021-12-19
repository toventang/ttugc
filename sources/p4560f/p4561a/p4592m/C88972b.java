package p4560f.p4561a.p4592m;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import org.p4663a.AbstractC90214c;
import org.p4663a.AbstractC90215d;
import p4560f.p4561a.AbstractC88955l;
import p4560f.p4561a.p4568e.p4583i.EnumC88897f;
import p4560f.p4561a.p4568e.p4584j.C88898a;
import p4560f.p4561a.p4568e.p4584j.EnumC88909j;

/* renamed from: f.a.m.b */
public final class C88972b<T> implements AbstractC88955l<T>, AbstractC90215d {

    /* renamed from: a */
    final AbstractC90214c<? super T> f202053a;

    /* renamed from: b */
    final boolean f202054b;

    /* renamed from: c */
    AbstractC90215d f202055c;

    /* renamed from: d */
    boolean f202056d;

    /* renamed from: e */
    C88898a<Object> f202057e;

    /* renamed from: f */
    volatile boolean f202058f;

    static {
        Covode.recordClassIndex(105014);
    }

    @Override // org.p4663a.AbstractC90215d
    public final void cancel() {
        this.f202055c.cancel();
    }

    /* JADX DEBUG: Type inference failed for r0v3. Raw type applied. Possible types: org.a.c<? super T>, org.a.c<? super U> */
    /* renamed from: a */
    private void m154241a() {
        C88898a<Object> aVar;
        MethodCollector.m26663i(2228);
        do {
            synchronized (this) {
                try {
                    aVar = this.f202057e;
                    if (aVar == null) {
                        this.f202056d = false;
                        MethodCollector.m26664o(2228);
                        return;
                    }
                    this.f202057e = null;
                } finally {
                    MethodCollector.m26664o(2228);
                }
            }
        } while (!aVar.mo143174a((AbstractC90214c<? super T>) this.f202053a));
    }

    @Override // org.p4663a.AbstractC90214c
    public final void onComplete() {
        MethodCollector.m26663i(2219);
        if (this.f202058f) {
            MethodCollector.m26664o(2219);
            return;
        }
        synchronized (this) {
            try {
                if (!this.f202058f) {
                    if (this.f202056d) {
                        C88898a<Object> aVar = this.f202057e;
                        if (aVar == null) {
                            aVar = new C88898a<>();
                            this.f202057e = aVar;
                        }
                        aVar.mo143173a(EnumC88909j.complete());
                        MethodCollector.m26664o(2219);
                        return;
                    }
                    this.f202058f = true;
                    this.f202056d = true;
                    this.f202053a.onComplete();
                    MethodCollector.m26664o(2219);
                }
            } finally {
                MethodCollector.m26664o(2219);
            }
        }
    }

    public C88972b(AbstractC90214c<? super T> cVar) {
        this(cVar, (byte) 0);
    }

    @Override // org.p4663a.AbstractC90215d
    public final void request(long j) {
        this.f202055c.request(j);
    }

    @Override // org.p4663a.AbstractC90214c, p4560f.p4561a.AbstractC88955l
    public final void onSubscribe(AbstractC90215d dVar) {
        if (EnumC88897f.validate(this.f202055c, dVar)) {
            this.f202055c = dVar;
            this.f202053a.onSubscribe(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0045, code lost:
        if (r3 == false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0047, code lost:
        p4560f.p4561a.p4587h.C88925a.m154178a(r6);
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(2124);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004e, code lost:
        r5.f202053a.onError(r6);
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(2124);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0056, code lost:
        return;
     */
    @Override // org.p4663a.AbstractC90214c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onError(java.lang.Throwable r6) {
        /*
            r5 = this;
            r4 = 2124(0x84c, float:2.976E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r4)
            boolean r0 = r5.f202058f
            if (r0 == 0) goto L_0x0010
            p4560f.p4561a.p4587h.C88925a.m154178a(r6)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            return
        L_0x0010:
            monitor-enter(r5)
            boolean r0 = r5.f202058f     // Catch:{ all -> 0x0057 }
            r3 = 0
            r1 = 1
            if (r0 == 0) goto L_0x0019
            r3 = 1
            goto L_0x0044
        L_0x0019:
            boolean r0 = r5.f202056d     // Catch:{ all -> 0x0057 }
            if (r0 == 0) goto L_0x0040
            r5.f202058f = r1     // Catch:{ all -> 0x0057 }
            f.a.e.j.a<java.lang.Object> r2 = r5.f202057e     // Catch:{ all -> 0x0057 }
            if (r2 != 0) goto L_0x002a
            f.a.e.j.a r2 = new f.a.e.j.a     // Catch:{ all -> 0x0057 }
            r2.<init>()     // Catch:{ all -> 0x0057 }
            r5.f202057e = r2     // Catch:{ all -> 0x0057 }
        L_0x002a:
            java.lang.Object r1 = p4560f.p4561a.p4568e.p4584j.EnumC88909j.error(r6)     // Catch:{ all -> 0x0057 }
            boolean r0 = r5.f202054b     // Catch:{ all -> 0x0057 }
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
            r5.f202058f = r1
            r5.f202056d = r1
        L_0x0044:
            monitor-exit(r5)
            if (r3 == 0) goto L_0x004e
            p4560f.p4561a.p4587h.C88925a.m154178a(r6)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            return
        L_0x004e:
            org.a.c<? super T> r0 = r5.f202053a
            r0.onError(r6)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            return
        L_0x0057:
            r0 = move-exception
            monitor-exit(r5)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p4560f.p4561a.p4592m.C88972b.onError(java.lang.Throwable):void");
    }

    @Override // org.p4663a.AbstractC90214c
    public final void onNext(T t) {
        MethodCollector.m26663i(2024);
        if (this.f202058f) {
            MethodCollector.m26664o(2024);
        } else if (t == null) {
            this.f202055c.cancel();
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            MethodCollector.m26664o(2024);
        } else {
            synchronized (this) {
                try {
                    if (!this.f202058f) {
                        if (this.f202056d) {
                            C88898a<Object> aVar = this.f202057e;
                            if (aVar == null) {
                                aVar = new C88898a<>();
                                this.f202057e = aVar;
                            }
                            aVar.mo143173a(EnumC88909j.next(t));
                            MethodCollector.m26664o(2024);
                            return;
                        }
                        this.f202056d = true;
                        this.f202053a.onNext(t);
                        m154241a();
                        MethodCollector.m26664o(2024);
                    }
                } finally {
                    MethodCollector.m26664o(2024);
                }
            }
        }
    }

    private C88972b(AbstractC90214c<? super T> cVar, byte b) {
        this.f202053a = cVar;
        this.f202054b = false;
    }
}
