package p4560f.p4561a.p4568e.p4573e.p4578e;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4568e.p4569a.EnumC88442c;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4568e.p4580f.C88851c;
import p4560f.p4561a.p4585f.AbstractC88919b;

/* renamed from: f.a.e.e.e.af */
public final class C88645af<T, K, V> extends AbstractC88637a<T, AbstractC88919b<K, V>> {

    /* renamed from: b */
    final AbstractC88434g<? super T, ? extends K> f201114b;

    /* renamed from: c */
    final AbstractC88434g<? super T, ? extends V> f201115c;

    /* renamed from: d */
    final int f201116d;

    /* renamed from: e */
    final boolean f201117e = false;

    static {
        Covode.recordClassIndex(104687);
    }

    /* renamed from: f.a.e.e.e.af$a */
    public static final class C88646a<T, K, V> extends AtomicInteger implements AbstractC88412b, AbstractC88986z<T> {

        /* renamed from: g */
        static final Object f201118g = new Object();
        private static final long serialVersionUID = -3688291656102519502L;

        /* renamed from: a */
        final AbstractC88986z<? super AbstractC88919b<K, V>> f201119a;

        /* renamed from: b */
        final AbstractC88434g<? super T, ? extends K> f201120b;

        /* renamed from: c */
        final AbstractC88434g<? super T, ? extends V> f201121c;

        /* renamed from: d */
        final int f201122d;

        /* renamed from: e */
        final boolean f201123e;

        /* renamed from: f */
        final Map<Object, C88647b<K, V>> f201124f;

        /* renamed from: h */
        AbstractC88412b f201125h;

        /* renamed from: i */
        final AtomicBoolean f201126i = new AtomicBoolean();

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f201126i.get();
        }

        static {
            Covode.recordClassIndex(104688);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            if (this.f201126i.compareAndSet(false, true) && decrementAndGet() == 0) {
                this.f201125h.dispose();
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
            ArrayList<C88647b> arrayList = new ArrayList(this.f201124f.values());
            this.f201124f.clear();
            for (C88647b bVar : arrayList) {
                C88648c<T, K> cVar = bVar.f201127a;
                cVar.f201132e = true;
                cVar.mo143061a();
            }
            this.f201119a.onComplete();
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            if (EnumC88441b.validate(this.f201125h, bVar)) {
                this.f201125h = bVar;
                this.f201119a.onSubscribe(this);
            }
        }

        public final void cancel(K k) {
            if (k == null) {
                k = (K) f201118g;
            }
            this.f201124f.remove(k);
            if (decrementAndGet() == 0) {
                this.f201125h.dispose();
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            ArrayList<C88647b> arrayList = new ArrayList(this.f201124f.values());
            this.f201124f.clear();
            for (C88647b bVar : arrayList) {
                C88648c<T, K> cVar = bVar.f201127a;
                cVar.f201133f = th;
                cVar.f201132e = true;
                cVar.mo143061a();
            }
            this.f201119a.onError(th);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: f.a.e.f.c<T> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p4560f.p4561a.AbstractC88986z
        public final void onNext(T t) {
            Object obj;
            try {
                Object apply = this.f201120b.apply(t);
                if (apply != null) {
                    obj = apply;
                } else {
                    obj = f201118g;
                }
                C88647b<K, V> bVar = this.f201124f.get(obj);
                if (bVar == null) {
                    if (!this.f201126i.get()) {
                        bVar = new C88647b<>(apply, new C88648c(this.f201122d, this, apply, this.f201123e));
                        this.f201124f.put(obj, bVar);
                        getAndIncrement();
                        this.f201119a.onNext(bVar);
                    } else {
                        return;
                    }
                }
                try {
                    Object a = C88466b.m153697a(this.f201121c.apply(t), "The value supplied is null");
                    C88648c<T, K> cVar = bVar.f201127a;
                    cVar.f201129b.offer(a);
                    cVar.mo143061a();
                } catch (Throwable th) {
                    C88422b.m153670a(th);
                    this.f201125h.dispose();
                    onError(th);
                }
            } catch (Throwable th2) {
                C88422b.m153670a(th2);
                this.f201125h.dispose();
                onError(th2);
            }
        }

        public C88646a(AbstractC88986z<? super AbstractC88919b<K, V>> zVar, AbstractC88434g<? super T, ? extends K> gVar, AbstractC88434g<? super T, ? extends V> gVar2, int i, boolean z) {
            this.f201119a = zVar;
            this.f201120b = gVar;
            this.f201121c = gVar2;
            this.f201122d = i;
            this.f201123e = z;
            this.f201124f = new ConcurrentHashMap();
            lazySet(1);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f.a.e.e.e.af$c */
    public static final class C88648c<T, K> extends AtomicInteger implements AbstractC88412b, AbstractC88984x<T> {
        private static final long serialVersionUID = -3852313036005250360L;

        /* renamed from: a */
        final K f201128a;

        /* renamed from: b */
        final C88851c<T> f201129b;

        /* renamed from: c */
        final C88646a<?, K, T> f201130c;

        /* renamed from: d */
        final boolean f201131d;

        /* renamed from: e */
        volatile boolean f201132e;

        /* renamed from: f */
        Throwable f201133f;

        /* renamed from: g */
        final AtomicBoolean f201134g = new AtomicBoolean();

        /* renamed from: h */
        final AtomicBoolean f201135h = new AtomicBoolean();

        /* renamed from: i */
        final AtomicReference<AbstractC88986z<? super T>> f201136i = new AtomicReference<>();

        static {
            Covode.recordClassIndex(104690);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f201134g.get();
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            if (this.f201134g.compareAndSet(false, true) && getAndIncrement() == 0) {
                this.f201136i.lazySet(null);
                this.f201130c.cancel(this.f201128a);
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
            if (r1 != false) goto L_0x002f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
            r4.onNext(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
            r1 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
            r3 = addAndGet(-r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
            if (r3 == 0) goto L_0x0041;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
            if (r4 != null) goto L_0x0017;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0041, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0015, code lost:
            if (r4 != null) goto L_0x0017;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
            r0 = r7.f201132e;
            r2 = r6.poll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
            if (r2 != null) goto L_0x002d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x001f, code lost:
            r1 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
            if (m153864a(r0, r1, r4, r5) == false) goto L_0x0027;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo143061a() {
            /*
                r7 = this;
                int r0 = r7.getAndIncrement()
                if (r0 == 0) goto L_0x0007
                return
            L_0x0007:
                f.a.e.f.c<T> r6 = r7.f201129b
                boolean r5 = r7.f201131d
                java.util.concurrent.atomic.AtomicReference<f.a.z<? super T>> r0 = r7.f201136i
                java.lang.Object r4 = r0.get()
                f.a.z r4 = (p4560f.p4561a.AbstractC88986z) r4
                r0 = 1
                r3 = 1
            L_0x0015:
                if (r4 == 0) goto L_0x002f
            L_0x0017:
                boolean r0 = r7.f201132e
                java.lang.Object r2 = r6.poll()
                if (r2 != 0) goto L_0x002d
                r1 = 1
            L_0x0020:
                boolean r0 = r7.m153864a(r0, r1, r4, r5)
                if (r0 == 0) goto L_0x0027
                return
            L_0x0027:
                if (r1 != 0) goto L_0x002f
                r4.onNext(r2)
                goto L_0x0017
            L_0x002d:
                r1 = 0
                goto L_0x0020
            L_0x002f:
                int r0 = -r3
                int r3 = r7.addAndGet(r0)
                if (r3 == 0) goto L_0x0041
                if (r4 != 0) goto L_0x0017
                java.util.concurrent.atomic.AtomicReference<f.a.z<? super T>> r0 = r7.f201136i
                java.lang.Object r4 = r0.get()
                f.a.z r4 = (p4560f.p4561a.AbstractC88986z) r4
                goto L_0x0015
            L_0x0041:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p4560f.p4561a.p4568e.p4573e.p4578e.C88645af.C88648c.mo143061a():void");
        }

        @Override // p4560f.p4561a.AbstractC88984x
        /* renamed from: b */
        public final void mo143062b(AbstractC88986z<? super T> zVar) {
            if (this.f201135h.compareAndSet(false, true)) {
                zVar.onSubscribe(this);
                this.f201136i.lazySet(zVar);
                if (this.f201134g.get()) {
                    this.f201136i.lazySet(null);
                } else {
                    mo143061a();
                }
            } else {
                EnumC88442c.error(new IllegalStateException("Only one Observer allowed!"), zVar);
            }
        }

        C88648c(int i, C88646a<?, K, T> aVar, K k, boolean z) {
            this.f201129b = new C88851c<>(i);
            this.f201130c = aVar;
            this.f201128a = k;
            this.f201131d = z;
        }

        /* renamed from: a */
        private boolean m153864a(boolean z, boolean z2, AbstractC88986z<? super T> zVar, boolean z3) {
            if (this.f201134g.get()) {
                this.f201129b.clear();
                this.f201130c.cancel(this.f201128a);
                this.f201136i.lazySet(null);
                return true;
            } else if (!z) {
                return false;
            } else {
                if (!z3) {
                    Throwable th = this.f201133f;
                    if (th != null) {
                        this.f201129b.clear();
                        this.f201136i.lazySet(null);
                        zVar.onError(th);
                        return true;
                    } else if (!z2) {
                        return false;
                    } else {
                        this.f201136i.lazySet(null);
                        zVar.onComplete();
                        return true;
                    }
                } else if (!z2) {
                    return false;
                } else {
                    Throwable th2 = this.f201133f;
                    this.f201136i.lazySet(null);
                    if (th2 != null) {
                        zVar.onError(th2);
                    } else {
                        zVar.onComplete();
                    }
                    return true;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f.a.e.e.e.af$b */
    public static final class C88647b<K, T> extends AbstractC88919b<K, T> {

        /* renamed from: a */
        final C88648c<T, K> f201127a;

        static {
            Covode.recordClassIndex(104689);
        }

        @Override // p4560f.p4561a.AbstractC88979t
        /* renamed from: a */
        public final void mo17922a(AbstractC88986z<? super T> zVar) {
            this.f201127a.mo143062b(zVar);
        }

        C88647b(K k, C88648c<T, K> cVar) {
            super(k);
            this.f201127a = cVar;
        }
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super AbstractC88919b<K, V>> zVar) {
        this.f201095a.mo143062b(new C88646a(zVar, this.f201114b, this.f201115c, this.f201116d, this.f201117e));
    }

    public C88645af(AbstractC88984x<T> xVar, AbstractC88434g<? super T, ? extends K> gVar, AbstractC88434g<? super T, ? extends V> gVar2, int i) {
        super(xVar);
        this.f201114b = gVar;
        this.f201115c = gVar2;
        this.f201116d = i;
    }
}
