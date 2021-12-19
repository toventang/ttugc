package com.squareup.p2075a.p2076a.p2078b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.squareup.p2075a.C29098a;
import com.squareup.p2075a.C29226j;
import com.squareup.p2075a.C29252z;
import com.squareup.p2075a.p2076a.AbstractC29190d;
import com.squareup.p2075a.p2076a.C29205i;
import com.squareup.p2075a.p2076a.C29206j;
import com.squareup.p2075a.p2076a.p2079c.C29189b;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;

/* renamed from: com.squareup.a.a.b.s */
public final class C29185s {

    /* renamed from: a */
    public final C29098a f69116a;

    /* renamed from: b */
    public C29183q f69117b;

    /* renamed from: c */
    public C29189b f69118c;

    /* renamed from: d */
    private final C29226j f69119d;

    /* renamed from: e */
    private boolean f69120e;

    /* renamed from: f */
    private boolean f69121f;

    /* renamed from: g */
    private AbstractC29175j f69122g;

    static {
        Covode.recordClassIndex(35534);
    }

    public final String toString() {
        return this.f69116a.toString();
    }

    /* renamed from: b */
    private C29205i m58342b() {
        return AbstractC29190d.f69140b.mo50910a(this.f69119d);
    }

    /* renamed from: a */
    public final synchronized C29189b mo50890a() {
        C29189b bVar;
        MethodCollector.m26663i(3891);
        bVar = this.f69118c;
        MethodCollector.m26664o(3891);
        return bVar;
    }

    /* renamed from: a */
    public final void mo50892a(C29189b bVar) {
        bVar.f69134h.add(new WeakReference(this));
    }

    /* renamed from: b */
    private void m58343b(C29189b bVar) {
        int size = bVar.f69134h.size();
        for (int i = 0; i < size; i++) {
            if (bVar.f69134h.get(i).get() == this) {
                bVar.f69134h.remove(i);
                return;
            }
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public final void mo50891a(AbstractC29175j jVar) {
        MethodCollector.m26663i(3847);
        synchronized (this.f69119d) {
            if (jVar != null) {
                try {
                    if (jVar == this.f69122g) {
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3847);
                    throw th;
                }
            }
            IllegalStateException illegalStateException = new IllegalStateException("expected " + this.f69122g + " but was " + jVar);
            MethodCollector.m26664o(3847);
            throw illegalStateException;
        }
        mo50894a(false, false, true);
        MethodCollector.m26664o(3847);
    }

    /* renamed from: a */
    public final void mo50893a(IOException iOException) {
        MethodCollector.m26663i(3917);
        synchronized (this.f69119d) {
            try {
                if (this.f69117b != null) {
                    if (this.f69118c.f69131e == 0) {
                        C29252z zVar = this.f69118c.f69127a;
                        C29183q qVar = this.f69117b;
                        if (!(zVar.f69372b.type() == Proxy.Type.DIRECT || qVar.f69104a.f68788g == null)) {
                            qVar.f69104a.f68788g.connectFailed(qVar.f69104a.f68782a.mo50989b(), zVar.f69372b.address(), iOException);
                        }
                        qVar.f69105b.mo50939a(zVar);
                    } else {
                        this.f69117b = null;
                    }
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(3917);
                throw th;
            }
        }
        mo50894a(true, false, true);
        MethodCollector.m26664o(3917);
    }

    public C29185s(C29226j jVar, C29098a aVar) {
        this.f69119d = jVar;
        this.f69116a = aVar;
    }

    /* renamed from: a */
    public final void mo50894a(boolean z, boolean z2, boolean z3) {
        C29189b bVar;
        C29189b bVar2;
        MethodCollector.m26663i(3914);
        synchronized (this.f69119d) {
            bVar = null;
            if (z3) {
                try {
                    this.f69122g = null;
                } catch (Throwable th) {
                    MethodCollector.m26664o(3914);
                    throw th;
                }
            }
            if (z2) {
                this.f69120e = true;
            }
            C29189b bVar3 = this.f69118c;
            if (bVar3 != null) {
                if (z) {
                    bVar3.f69135i = true;
                }
                if (this.f69122g == null && (this.f69120e || this.f69118c.f69135i)) {
                    m58343b(this.f69118c);
                    if (this.f69118c.f69131e > 0) {
                        this.f69117b = null;
                    }
                    if (this.f69118c.f69134h.isEmpty()) {
                        this.f69118c.f69136j = System.nanoTime();
                        if (AbstractC29190d.f69140b.mo50913a(this.f69119d, this.f69118c)) {
                            bVar2 = this.f69118c;
                            this.f69118c = null;
                            bVar = bVar2;
                        }
                    }
                    bVar2 = null;
                    this.f69118c = null;
                    bVar = bVar2;
                }
            }
        }
        if (bVar != null) {
            C29206j.m58439a(bVar.f69128b);
        }
        MethodCollector.m26664o(3914);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0046, code lost:
        r5 = new com.squareup.p2075a.p2076a.p2079c.C29189b(r11.f69117b.mo50887b());
        mo50892a(r5);
        r2 = r11.f69119d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0056, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        com.squareup.p2075a.p2076a.AbstractC29190d.f69140b.mo50914b(r11.f69119d, r5);
        r11.f69118c = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0062, code lost:
        if (r11.f69121f != false) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0064, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0065, code lost:
        r5.mo50905a(r12, r13, r14, r11.f69116a.f68787f, r15);
        m58342b().mo50940b(r5.f69127a);
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(3785);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007c, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007d, code lost:
        r1 = new java.io.IOException("Canceled");
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(3785);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0087, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0088, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008a, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(3785);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008d, code lost:
        throw r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.squareup.p2075a.p2076a.p2079c.C29189b m58340a(int r12, int r13, int r14, boolean r15) {
        /*
        // Method dump skipped, instructions count: 181
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.p2075a.p2076a.p2078b.C29185s.m58340a(int, int, int, boolean):com.squareup.a.a.c.b");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r2.mo50906a(r9) == false) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        return r2;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.squareup.p2075a.p2076a.p2079c.C29189b m58341b(int r5, int r6, int r7, boolean r8, boolean r9) {
        /*
            r4 = this;
            r3 = 3648(0xe40, float:5.112E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r3)
        L_0x0005:
            com.squareup.a.a.c.b r2 = r4.m58340a(r5, r6, r7, r8)
            com.squareup.a.j r1 = r4.f69119d
            monitor-enter(r1)
            int r0 = r2.f69131e     // Catch:{ all -> 0x0027 }
            if (r0 != 0) goto L_0x0012
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            goto L_0x0023
        L_0x0012:
            monitor-exit(r1)
            boolean r0 = r2.mo50906a(r9)
            if (r0 == 0) goto L_0x001d
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            return r2
        L_0x001d:
            r1 = 0
            r0 = 1
            r4.mo50894a(r0, r1, r0)
            goto L_0x0005
        L_0x0023:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            return r2
        L_0x0027:
            r0 = move-exception
            monitor-exit(r1)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.p2075a.p2076a.p2078b.C29185s.m58341b(int, int, int, boolean, boolean):com.squareup.a.a.c.b");
    }

    /* renamed from: a */
    public final AbstractC29175j mo50889a(int i, int i2, int i3, boolean z, boolean z2) {
        AbstractC29175j eVar;
        MethodCollector.m26663i(3641);
        try {
            C29189b b = m58341b(i, i2, i3, z, z2);
            if (b.f69130d != null) {
                eVar = new C29166f(this, b.f69130d);
            } else {
                b.f69128b.setSoTimeout(i2);
                b.f69132f.timeout().mo143784a((long) i2, TimeUnit.MILLISECONDS);
                b.f69133g.timeout().mo143784a((long) i3, TimeUnit.MILLISECONDS);
                eVar = new C29159e(this, b.f69132f, b.f69133g);
            }
            synchronized (this.f69119d) {
                try {
                    b.f69131e++;
                    this.f69122g = eVar;
                } finally {
                    MethodCollector.m26664o(3641);
                }
            }
            return eVar;
        } catch (IOException e) {
            C29182p pVar = new C29182p(e);
            MethodCollector.m26664o(3641);
            throw pVar;
        }
    }
}
