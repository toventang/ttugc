package com.facebook.p1844d;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.d.a */
public abstract class AbstractC24152a<T> implements AbstractC24157c<T> {

    /* renamed from: a */
    private EnumC24155a f57121a = EnumC24155a.IN_PROGRESS;

    /* renamed from: b */
    private boolean f57122b;

    /* renamed from: c */
    private T f57123c;

    /* renamed from: d */
    private Throwable f57124d;

    /* renamed from: e */
    private float f57125e;

    /* renamed from: f */
    private final ConcurrentLinkedQueue<Pair<AbstractC24160e<T>, Executor>> f57126f = new ConcurrentLinkedQueue<>();

    static {
        Covode.recordClassIndex(28283);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo39740a(T t) {
    }

    /* renamed from: a */
    public final synchronized boolean mo39741a() {
        return this.f57122b;
    }

    @Override // com.facebook.p1844d.AbstractC24157c
    /* renamed from: d */
    public synchronized T mo39747d() {
        return this.f57123c;
    }

    @Override // com.facebook.p1844d.AbstractC24157c
    /* renamed from: e */
    public final synchronized Throwable mo39748e() {
        return this.f57124d;
    }

    @Override // com.facebook.p1844d.AbstractC24157c
    /* renamed from: f */
    public final synchronized float mo39749f() {
        return this.f57125e;
    }

    /* renamed from: h */
    private synchronized boolean mo39758h() {
        boolean z;
        if (this.f57121a == EnumC24155a.FAILURE) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    @Override // com.facebook.p1844d.AbstractC24157c
    /* renamed from: b */
    public final synchronized boolean mo39745b() {
        boolean z;
        if (this.f57121a != EnumC24155a.IN_PROGRESS) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    @Override // com.facebook.p1844d.AbstractC24157c
    /* renamed from: c */
    public synchronized boolean mo39746c() {
        boolean z;
        if (this.f57123c != null) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: j */
    private synchronized boolean m45772j() {
        boolean z;
        if (!mo39741a() || mo39745b()) {
            z = false;
        } else {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.d.a$a */
    public enum EnumC24155a {
        IN_PROGRESS,
        SUCCESS,
        FAILURE;

        static {
            Covode.recordClassIndex(28286);
        }
    }

    /* renamed from: i */
    private void mo39765i() {
        boolean h = mo39758h();
        boolean j = m45772j();
        Iterator<Pair<AbstractC24160e<T>, Executor>> it = this.f57126f.iterator();
        while (it.hasNext()) {
            Pair<AbstractC24160e<T>, Executor> next = it.next();
            m45766a((AbstractC24160e) next.first, (Executor) next.second, h, j);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
        mo39740a((java.lang.Object) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        if (mo39745b() != false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
        mo39765i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3.f57126f.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0025, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0026, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
        if (r1 == null) goto L_0x0016;
     */
    @Override // com.facebook.p1844d.AbstractC24157c
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo39750g() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f57122b     // Catch:{ all -> 0x002a }
            if (r0 == 0) goto L_0x0008
            r0 = 0
            monitor-exit(r3)     // Catch:{ all -> 0x002a }
            return r0
        L_0x0008:
            r2 = 1
            r3.f57122b = r2     // Catch:{ all -> 0x002a }
            T r1 = r3.f57123c     // Catch:{ all -> 0x002a }
            r0 = 0
            r3.f57123c = r0     // Catch:{ all -> 0x002a }
            monitor-exit(r3)     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x0016
            r3.mo39740a(r1)
        L_0x0016:
            boolean r0 = r3.mo39745b()
            if (r0 != 0) goto L_0x001f
            r3.mo39765i()
        L_0x001f:
            monitor-enter(r3)
            java.util.concurrent.ConcurrentLinkedQueue<android.util.Pair<com.facebook.d.e<T>, java.util.concurrent.Executor>> r0 = r3.f57126f     // Catch:{ all -> 0x0027 }
            r0.clear()     // Catch:{ all -> 0x0027 }
            monitor-exit(r3)     // Catch:{ all -> 0x0027 }
            return r2
        L_0x0027:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x002a:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p1844d.AbstractC24152a.mo39750g():boolean");
    }

    /* renamed from: b */
    private synchronized boolean m45767b(float f) {
        if (!this.f57122b) {
            if (this.f57121a == EnumC24155a.IN_PROGRESS) {
                if (f < this.f57125e) {
                    return false;
                }
                this.f57125e = f;
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private synchronized boolean mo40275b(Throwable th) {
        if (!this.f57122b) {
            if (this.f57121a == EnumC24155a.IN_PROGRESS) {
                this.f57121a = EnumC24155a.FAILURE;
                this.f57124d = th;
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo39742a(float f) {
        boolean b = m45767b(f);
        if (b) {
            Iterator<Pair<AbstractC24160e<T>, Executor>> it = this.f57126f.iterator();
            while (it.hasNext()) {
                Pair<AbstractC24160e<T>, Executor> next = it.next();
                final AbstractC24160e eVar = (AbstractC24160e) next.first;
                ((Executor) next.second).execute(new Runnable() {
                    /* class com.facebook.p1844d.AbstractC24152a.RunnableC241542 */

                    static {
                        Covode.recordClassIndex(28285);
                    }

                    public final void run() {
                        eVar.onProgressUpdate(AbstractC24152a.this);
                    }
                });
            }
        }
        return b;
    }

    /* renamed from: a */
    public boolean mo39744a(Throwable th) {
        boolean b = mo40275b(th);
        if (b) {
            mo39765i();
        }
        return b;
    }

    /* renamed from: a */
    public boolean mo39743a(T t, boolean z) {
        boolean b = m45768b(t, z);
        if (b) {
            mo39765i();
        }
        return b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0025, code lost:
        if (r4 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0027, code lost:
        mo39740a((java.lang.Object) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return false;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m45768b(T r4, boolean r5) {
        /*
            r3 = this;
            r2 = 0
            monitor-enter(r3)     // Catch:{ all -> 0x003b }
            boolean r0 = r3.f57122b     // Catch:{ all -> 0x0038 }
            if (r0 != 0) goto L_0x002c
            com.facebook.d.a$a r1 = r3.f57121a     // Catch:{ all -> 0x0038 }
            com.facebook.d.a$a r0 = com.facebook.p1844d.AbstractC24152a.EnumC24155a.IN_PROGRESS     // Catch:{ all -> 0x0038 }
            if (r1 == r0) goto L_0x000d
            goto L_0x002c
        L_0x000d:
            if (r5 == 0) goto L_0x0017
            com.facebook.d.a$a r0 = com.facebook.p1844d.AbstractC24152a.EnumC24155a.SUCCESS     // Catch:{ all -> 0x0038 }
            r3.f57121a = r0     // Catch:{ all -> 0x0038 }
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.f57125e = r0     // Catch:{ all -> 0x0038 }
        L_0x0017:
            T r1 = r3.f57123c     // Catch:{ all -> 0x0038 }
            if (r1 == r4) goto L_0x0023
            r3.f57123c = r4     // Catch:{ all -> 0x001e }
            goto L_0x0021
        L_0x001e:
            r0 = move-exception
            r2 = r1
            goto L_0x0039
        L_0x0021:
            r4 = r1
            goto L_0x0024
        L_0x0023:
            r4 = r2
        L_0x0024:
            monitor-exit(r3)     // Catch:{ all -> 0x002e }
            if (r4 == 0) goto L_0x002a
            r3.mo39740a(r4)
        L_0x002a:
            r0 = 1
            return r0
        L_0x002c:
            monitor-exit(r3)
            goto L_0x0031
        L_0x002e:
            r0 = move-exception
            r2 = r4
            goto L_0x0039
        L_0x0031:
            if (r4 == 0) goto L_0x0036
            r3.mo39740a(r4)
        L_0x0036:
            r0 = 0
            return r0
        L_0x0038:
            r0 = move-exception
        L_0x0039:
            monitor-exit(r3)
            throw r0
        L_0x003b:
            r0 = move-exception
            if (r2 == 0) goto L_0x0041
            r3.mo39740a(r2)
        L_0x0041:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p1844d.AbstractC24152a.m45768b(java.lang.Object, boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0033, code lost:
        if (r0 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0035, code lost:
        m45766a(r3, r4, mo39758h(), m45772j());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    @Override // com.facebook.p1844d.AbstractC24157c
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo39739a(com.facebook.p1844d.AbstractC24160e<T> r3, java.util.concurrent.Executor r4) {
        /*
            r2 = this;
            com.facebook.common.p1832d.C24091i.m45617a(r3)
            com.facebook.common.p1832d.C24091i.m45617a(r4)
            monitor-enter(r2)
            boolean r0 = r2.f57122b     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x000d
            monitor-exit(r2)     // Catch:{ all -> 0x0041 }
            return
        L_0x000d:
            com.facebook.d.a$a r1 = r2.f57121a     // Catch:{ all -> 0x0041 }
            com.facebook.d.a$a r0 = com.facebook.p1844d.AbstractC24152a.EnumC24155a.IN_PROGRESS     // Catch:{ all -> 0x0041 }
            if (r1 != r0) goto L_0x001c
            java.util.concurrent.ConcurrentLinkedQueue<android.util.Pair<com.facebook.d.e<T>, java.util.concurrent.Executor>> r1 = r2.f57126f     // Catch:{ all -> 0x0041 }
            android.util.Pair r0 = android.util.Pair.create(r3, r4)     // Catch:{ all -> 0x0041 }
            r1.add(r0)     // Catch:{ all -> 0x0041 }
        L_0x001c:
            boolean r0 = r2.mo39746c()     // Catch:{ all -> 0x0041 }
            if (r0 != 0) goto L_0x0031
            boolean r0 = r2.mo39745b()     // Catch:{ all -> 0x0041 }
            if (r0 != 0) goto L_0x0031
            boolean r0 = r2.m45772j()     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            r0 = 0
            goto L_0x0032
        L_0x0031:
            r0 = 1
        L_0x0032:
            monitor-exit(r2)     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x0040
            boolean r1 = r2.mo39758h()
            boolean r0 = r2.m45772j()
            r2.m45766a(r3, r4, r1, r0)
        L_0x0040:
            return
        L_0x0041:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p1844d.AbstractC24152a.mo39739a(com.facebook.d.e, java.util.concurrent.Executor):void");
    }

    /* renamed from: a */
    private void m45766a(final AbstractC24160e<T> eVar, Executor executor, final boolean z, final boolean z2) {
        executor.execute(new Runnable() {
            /* class com.facebook.p1844d.AbstractC24152a.RunnableC241531 */

            static {
                Covode.recordClassIndex(28284);
            }

            public final void run() {
                if (z) {
                    eVar.onFailure(AbstractC24152a.this);
                } else if (z2) {
                    eVar.onCancellation(AbstractC24152a.this);
                } else {
                    eVar.onNewResult(AbstractC24152a.this);
                }
            }
        });
    }
}
