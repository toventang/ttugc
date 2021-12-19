package p4560f.p4561a.p4591l;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4568e.p4584j.C88898a;
import p4560f.p4561a.p4568e.p4584j.C88906h;
import p4560f.p4561a.p4568e.p4584j.EnumC88909j;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.l.b */
public final class C88958b<T> extends AbstractC88969g<T> {

    /* renamed from: c */
    static final C88959a[] f202004c = new C88959a[0];

    /* renamed from: d */
    static final C88959a[] f202005d = new C88959a[0];

    /* renamed from: j */
    private static final Object[] f202006j = new Object[0];

    /* renamed from: a */
    final AtomicReference<Object> f202007a;

    /* renamed from: b */
    final AtomicReference<C88959a<T>[]> f202008b;

    /* renamed from: e */
    final ReadWriteLock f202009e;

    /* renamed from: f */
    final Lock f202010f;

    /* renamed from: g */
    final Lock f202011g;

    /* renamed from: h */
    final AtomicReference<Throwable> f202012h;

    /* renamed from: i */
    long f202013i;

    /* access modifiers changed from: package-private */
    /* renamed from: f.a.l.b$a */
    public static final class C88959a<T> implements AbstractC88412b, C88898a.AbstractC88899a<Object> {

        /* renamed from: a */
        final AbstractC88986z<? super T> f202014a;

        /* renamed from: b */
        final C88958b<T> f202015b;

        /* renamed from: c */
        boolean f202016c;

        /* renamed from: d */
        boolean f202017d;

        /* renamed from: e */
        C88898a<Object> f202018e;

        /* renamed from: f */
        boolean f202019f;

        /* renamed from: g */
        volatile boolean f202020g;

        /* renamed from: h */
        long f202021h;

        static {
            Covode.recordClassIndex(105001);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f202020g;
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            if (!this.f202020g) {
                this.f202020g = true;
                this.f202015b.mo143220a((C88959a) this);
            }
        }

        @Override // p4560f.p4561a.p4568e.p4584j.C88898a.AbstractC88899a, p4560f.p4561a.p4567d.AbstractC88438k
        /* renamed from: a */
        public final boolean mo7718a(Object obj) {
            if (this.f202020g || EnumC88909j.accept(obj, this.f202014a)) {
                return true;
            }
            return false;
        }

        C88959a(AbstractC88986z<? super T> zVar, C88958b<T> bVar) {
            this.f202014a = zVar;
            this.f202015b = bVar;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0048, code lost:
            r4.f202019f = true;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo143222a(java.lang.Object r5, long r6) {
            /*
                r4 = this;
                r3 = 846(0x34e, float:1.185E-42)
                com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r3)
                boolean r0 = r4.f202020g
                if (r0 == 0) goto L_0x000d
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
                return
            L_0x000d:
                boolean r0 = r4.f202019f
                if (r0 != 0) goto L_0x004a
                monitor-enter(r4)
                boolean r0 = r4.f202020g     // Catch:{ all -> 0x0042 }
                if (r0 == 0) goto L_0x001b
                monitor-exit(r4)     // Catch:{ all -> 0x0042 }
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
                return
            L_0x001b:
                long r1 = r4.f202021h
                int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
                if (r0 != 0) goto L_0x0026
                monitor-exit(r4)
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
                return
            L_0x0026:
                boolean r0 = r4.f202017d
                if (r0 == 0) goto L_0x003d
                f.a.e.j.a<java.lang.Object> r0 = r4.f202018e
                if (r0 != 0) goto L_0x0035
                f.a.e.j.a r0 = new f.a.e.j.a
                r0.<init>()
                r4.f202018e = r0
            L_0x0035:
                r0.mo143173a(r5)
                monitor-exit(r4)
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
                return
            L_0x003d:
                r0 = 1
                r4.f202016c = r0
                monitor-exit(r4)
                goto L_0x0048
            L_0x0042:
                r0 = move-exception
                monitor-exit(r4)
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
                throw r0
            L_0x0048:
                r4.f202019f = r0
            L_0x004a:
                r4.mo7718a(r5)
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p4560f.p4561a.p4591l.C88958b.C88959a.mo143222a(java.lang.Object, long):void");
        }
    }

    static {
        Covode.recordClassIndex(105000);
    }

    /* renamed from: i */
    public final T mo143221i() {
        Object obj = this.f202007a.get();
        if (EnumC88909j.isComplete(obj) || EnumC88909j.isError(obj)) {
            return null;
        }
        return (T) EnumC88909j.getValue(obj);
    }

    public C88958b() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f202009e = reentrantReadWriteLock;
        this.f202010f = reentrantReadWriteLock.readLock();
        this.f202011g = reentrantReadWriteLock.writeLock();
        this.f202008b = new AtomicReference<>(f202004c);
        this.f202007a = new AtomicReference<>();
        this.f202012h = new AtomicReference<>();
    }

    @Override // p4560f.p4561a.AbstractC88986z
    public final void onComplete() {
        if (this.f202012h.compareAndSet(null, C88906h.f201913a)) {
            Object complete = EnumC88909j.complete();
            for (C88959a<T> aVar : m154215c(complete)) {
                aVar.mo143222a(complete, this.f202013i);
            }
        }
    }

    /* renamed from: a */
    public static <T> C88958b<T> m154214a(T t) {
        return new C88958b<>(t);
    }

    private C88958b(T t) {
        this();
        this.f202007a.lazySet(C88466b.m153697a((Object) t, "defaultValue is null"));
    }

    /* renamed from: c */
    private C88959a<T>[] m154215c(Object obj) {
        AtomicReference<C88959a<T>[]> atomicReference = this.f202008b;
        C88959a<T>[] aVarArr = f202005d;
        C88959a<T>[] andSet = atomicReference.getAndSet(aVarArr);
        if (andSet != aVarArr) {
            m154216d(obj);
        }
        return andSet;
    }

    @Override // p4560f.p4561a.AbstractC88986z
    public final void onSubscribe(AbstractC88412b bVar) {
        if (this.f202012h.get() != null) {
            bVar.dispose();
        }
    }

    /* renamed from: d */
    private void m154216d(Object obj) {
        this.f202011g.lock();
        this.f202013i++;
        this.f202007a.lazySet(obj);
        this.f202011g.unlock();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo143220a(C88959a<T> aVar) {
        C88959a<T>[] aVarArr;
        C88959a<T>[] aVarArr2;
        do {
            aVarArr = this.f202008b.get();
            int length = aVarArr.length;
            if (length != 0) {
                int i = 0;
                while (aVarArr[i] != aVar) {
                    i++;
                    if (i >= length) {
                        return;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        aVarArr2 = f202004c;
                    } else {
                        aVarArr2 = new C88959a[(length - 1)];
                        System.arraycopy(aVarArr, 0, aVarArr2, 0, i);
                        System.arraycopy(aVarArr, i + 1, aVarArr2, i, (length - i) - 1);
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!this.f202008b.compareAndSet(aVarArr, aVarArr2));
    }

    @Override // p4560f.p4561a.AbstractC88986z
    public final void onError(Throwable th) {
        C88466b.m153697a((Object) th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f202012h.compareAndSet(null, th)) {
            C88925a.m154178a(th);
            return;
        }
        Object error = EnumC88909j.error(th);
        for (C88959a<T> aVar : m154215c(error)) {
            aVar.mo143222a(error, this.f202013i);
        }
    }

    @Override // p4560f.p4561a.AbstractC88986z
    public final void onNext(T t) {
        C88466b.m153697a((Object) t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f202012h.get() == null) {
            Object next = EnumC88909j.next(t);
            m154216d(next);
            for (C88959a<T> aVar : this.f202008b.get()) {
                aVar.mo143222a(next, this.f202013i);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0087, code lost:
        if (r1 == null) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008d, code lost:
        if (r4.mo7718a(r1) != false) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0091, code lost:
        if (r4.f202020g != false) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0093, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r1 = r4.f202018e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0096, code lost:
        if (r1 != null) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0098, code lost:
        r4.f202017d = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x009a, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x009c, code lost:
        r4.f202018e = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x009f, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a0, code lost:
        r1.mo143172a((p4560f.p4561a.p4568e.p4584j.C88898a.AbstractC88899a<? super java.lang.Object>) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00a7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00a8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00aa, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(2301);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00ad, code lost:
        throw r0;
     */
    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17922a(p4560f.p4561a.AbstractC88986z<? super T> r9) {
        /*
        // Method dump skipped, instructions count: 184
        */
        throw new UnsupportedOperationException("Method not decompiled: p4560f.p4561a.p4591l.C88958b.mo17922a(f.a.z):void");
    }
}
