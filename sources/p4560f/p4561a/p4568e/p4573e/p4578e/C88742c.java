package p4560f.p4561a.p4568e.p4573e.p4578e;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88398aa;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4568e.p4569a.EnumC88442c;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4568e.p4572d.AbstractC88492p;
import p4560f.p4561a.p4568e.p4580f.C88848a;
import p4560f.p4561a.p4568e.p4584j.C88916n;
import p4560f.p4561a.p4586g.C88923c;

/* renamed from: f.a.e.e.e.c */
public final class C88742c<T, U extends Collection<? super T>> extends AbstractC88637a<T, U> {

    /* renamed from: b */
    final long f201409b;

    /* renamed from: c */
    final long f201410c;

    /* renamed from: d */
    final TimeUnit f201411d;

    /* renamed from: e */
    final AbstractC88398aa f201412e;

    /* renamed from: f */
    final Callable<U> f201413f;

    /* renamed from: g */
    final int f201414g = Integer.MAX_VALUE;

    /* renamed from: h */
    final boolean f201415h = false;

    static {
        Covode.recordClassIndex(104784);
    }

    /* renamed from: f.a.e.e.e.c$a */
    static final class RunnableC88743a<T, U extends Collection<? super T>> extends AbstractC88492p<T, U, U> implements AbstractC88412b, Runnable {

        /* renamed from: g */
        final Callable<U> f201416g;

        /* renamed from: h */
        final long f201417h;

        /* renamed from: i */
        final TimeUnit f201418i;

        /* renamed from: j */
        final int f201419j;

        /* renamed from: k */
        final boolean f201420k;

        /* renamed from: l */
        final AbstractC88398aa.AbstractC88401c f201421l;

        /* renamed from: m */
        U f201422m;

        /* renamed from: n */
        AbstractC88412b f201423n;

        /* renamed from: o */
        AbstractC88412b f201424o;

        /* renamed from: p */
        long f201425p;

        /* renamed from: q */
        long f201426q;

        static {
            Covode.recordClassIndex(104785);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f200751c;
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            MethodCollector.m26663i(516);
            if (!this.f200751c) {
                this.f200751c = true;
                this.f201424o.dispose();
                this.f201421l.dispose();
                synchronized (this) {
                    try {
                        this.f201422m = null;
                    } finally {
                        MethodCollector.m26664o(516);
                    }
                }
                return;
            }
            MethodCollector.m26664o(516);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
            U u;
            MethodCollector.m26663i(512);
            this.f201421l.dispose();
            synchronized (this) {
                try {
                    u = this.f201422m;
                    this.f201422m = null;
                } finally {
                    MethodCollector.m26664o(512);
                }
            }
            this.f200750b.offer(u);
            this.f200752d = true;
            if (mo143013c()) {
                C88916n.m154121a(this.f200750b, this.f200749a, this, this);
            }
        }

        public final void run() {
            MethodCollector.m26663i(523);
            try {
                U u = (U) ((Collection) C88466b.m153697a((Object) this.f201416g.call(), "The bufferSupplier returned a null buffer"));
                synchronized (this) {
                    try {
                        U u2 = this.f201422m;
                        if (u2 != null && this.f201425p == this.f201426q) {
                            this.f201422m = u;
                            mo143011b(u2, this);
                            MethodCollector.m26664o(523);
                        }
                    } finally {
                        MethodCollector.m26664o(523);
                    }
                }
            } catch (Throwable th) {
                C88422b.m153670a(th);
                dispose();
                this.f200749a.onError(th);
                MethodCollector.m26664o(523);
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            MethodCollector.m26663i(472);
            synchronized (this) {
                try {
                    this.f201422m = null;
                } catch (Throwable th2) {
                    MethodCollector.m26664o(472);
                    throw th2;
                }
            }
            this.f200749a.onError(th);
            this.f201421l.dispose();
            MethodCollector.m26664o(472);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            if (EnumC88441b.validate(this.f201424o, bVar)) {
                this.f201424o = bVar;
                try {
                    this.f201422m = (U) ((Collection) C88466b.m153697a((Object) this.f201416g.call(), "The buffer supplied is null"));
                    this.f200749a.onSubscribe(this);
                    AbstractC88398aa.AbstractC88401c cVar = this.f201421l;
                    long j = this.f201417h;
                    this.f201423n = cVar.mo142905a(this, j, j, this.f201418i);
                } catch (Throwable th) {
                    C88422b.m153670a(th);
                    bVar.dispose();
                    EnumC88442c.error(th, this.f200749a);
                    this.f201421l.dispose();
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x002c, code lost:
            if (r13.f201420k == false) goto L_0x0033;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
            r13.f201423n.dispose();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0033, code lost:
            mo143011b(r4, r13);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
            r0 = (U) ((java.util.Collection) p4560f.p4561a.p4568e.p4570b.C88466b.m153697a((java.lang.Object) r13.f201416g.call(), "The buffer supplied is null"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
            monitor-enter(r13);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            r13.f201422m = r0;
            r13.f201426q++;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x004c, code lost:
            monitor-exit(r13);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x004f, code lost:
            if (r13.f201420k == false) goto L_0x005f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0051, code lost:
            r6 = r13.f201421l;
            r8 = r13.f201417h;
            r13.f201423n = r6.mo142905a(r13, r8, r8, r13.f201418i);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0062, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0063, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0065, code lost:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(384);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0068, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0069, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x006a, code lost:
            p4560f.p4561a.p4566c.C88422b.m153670a(r1);
            r13.f200749a.onError(r1);
            dispose();
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(384);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0078, code lost:
            return;
         */
        @Override // p4560f.p4561a.AbstractC88986z
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onNext(T r14) {
            /*
            // Method dump skipped, instructions count: 127
            */
            throw new UnsupportedOperationException("Method not decompiled: p4560f.p4561a.p4568e.p4573e.p4578e.C88742c.RunnableC88743a.onNext(java.lang.Object):void");
        }

        @Override // p4560f.p4561a.p4568e.p4584j.AbstractC88913k, p4560f.p4561a.p4568e.p4572d.AbstractC88492p
        /* renamed from: a */
        public final /* synthetic */ void mo143008a(AbstractC88986z zVar, Object obj) {
            zVar.onNext(obj);
        }

        RunnableC88743a(AbstractC88986z<? super U> zVar, Callable<U> callable, long j, TimeUnit timeUnit, int i, boolean z, AbstractC88398aa.AbstractC88401c cVar) {
            super(zVar, new C88848a());
            this.f201416g = callable;
            this.f201417h = j;
            this.f201418i = timeUnit;
            this.f201419j = i;
            this.f201420k = z;
            this.f201421l = cVar;
        }
    }

    /* renamed from: f.a.e.e.e.c$c */
    static final class RunnableC88745c<T, U extends Collection<? super T>> extends AbstractC88492p<T, U, U> implements AbstractC88412b, Runnable {

        /* renamed from: g */
        final Callable<U> f201434g;

        /* renamed from: h */
        final long f201435h;

        /* renamed from: i */
        final long f201436i;

        /* renamed from: j */
        final TimeUnit f201437j;

        /* renamed from: k */
        final AbstractC88398aa.AbstractC88401c f201438k;

        /* renamed from: l */
        final List<U> f201439l = new LinkedList();

        /* renamed from: m */
        AbstractC88412b f201440m;

        static {
            Covode.recordClassIndex(104787);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f200751c;
        }

        /* renamed from: e */
        private void m153956e() {
            MethodCollector.m26663i(1689);
            synchronized (this) {
                try {
                    this.f201439l.clear();
                } finally {
                    MethodCollector.m26664o(1689);
                }
            }
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            if (!this.f200751c) {
                this.f200751c = true;
                m153956e();
                this.f201440m.dispose();
                this.f201438k.dispose();
            }
        }

        /* renamed from: f.a.e.e.e.c$c$a */
        final class RunnableC88746a implements Runnable {

            /* renamed from: b */
            private final U f201442b;

            static {
                Covode.recordClassIndex(104788);
            }

            public final void run() {
                MethodCollector.m26663i(1436);
                synchronized (RunnableC88745c.this) {
                    try {
                        RunnableC88745c.this.f201439l.remove(this.f201442b);
                    } catch (Throwable th) {
                        MethodCollector.m26664o(1436);
                        throw th;
                    }
                }
                RunnableC88745c cVar = RunnableC88745c.this;
                cVar.mo143011b(this.f201442b, cVar.f201438k);
                MethodCollector.m26664o(1436);
            }

            RunnableC88746a(U u) {
                this.f201442b = u;
            }
        }

        /* renamed from: f.a.e.e.e.c$c$b */
        final class RunnableC88747b implements Runnable {

            /* renamed from: b */
            private final U f201444b;

            static {
                Covode.recordClassIndex(104789);
            }

            public final void run() {
                MethodCollector.m26663i(1445);
                synchronized (RunnableC88745c.this) {
                    try {
                        RunnableC88745c.this.f201439l.remove(this.f201444b);
                    } catch (Throwable th) {
                        MethodCollector.m26664o(1445);
                        throw th;
                    }
                }
                RunnableC88745c cVar = RunnableC88745c.this;
                cVar.mo143011b(this.f201444b, cVar.f201438k);
                MethodCollector.m26664o(1445);
            }

            RunnableC88747b(U u) {
                this.f201444b = u;
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: f.a.e.c.h */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
            ArrayList<Object> arrayList;
            MethodCollector.m26663i(1686);
            synchronized (this) {
                try {
                    arrayList = new ArrayList(this.f201439l);
                    this.f201439l.clear();
                } finally {
                    MethodCollector.m26664o(1686);
                }
            }
            for (Object obj : arrayList) {
                this.f200750b.offer(obj);
            }
            this.f200752d = true;
            if (mo143013c()) {
                C88916n.m154121a(this.f200750b, this.f200749a, this.f201438k, this);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: java.util.List<U extends java.util.Collection<? super T>> */
        /* JADX WARN: Multi-variable type inference failed */
        public final void run() {
            MethodCollector.m26663i(1695);
            if (this.f200751c) {
                MethodCollector.m26664o(1695);
                return;
            }
            try {
                Collection collection = (Collection) C88466b.m153697a((Object) this.f201434g.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    try {
                        if (!this.f200751c) {
                            this.f201439l.add(collection);
                            this.f201438k.mo20706a(new RunnableC88746a(collection), this.f201435h, this.f201437j);
                            MethodCollector.m26664o(1695);
                        }
                    } finally {
                        MethodCollector.m26664o(1695);
                    }
                }
            } catch (Throwable th) {
                C88422b.m153670a(th);
                this.f200749a.onError(th);
                dispose();
                MethodCollector.m26664o(1695);
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            this.f200752d = true;
            m153956e();
            this.f200749a.onError(th);
            this.f201438k.dispose();
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onNext(T t) {
            MethodCollector.m26663i(1677);
            synchronized (this) {
                try {
                    for (U u : this.f201439l) {
                        u.add(t);
                    }
                } finally {
                    MethodCollector.m26664o(1677);
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: java.util.List<U extends java.util.Collection<? super T>> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            if (EnumC88441b.validate(this.f201440m, bVar)) {
                this.f201440m = bVar;
                try {
                    Collection collection = (Collection) C88466b.m153697a((Object) this.f201434g.call(), "The buffer supplied is null");
                    this.f201439l.add(collection);
                    this.f200749a.onSubscribe(this);
                    AbstractC88398aa.AbstractC88401c cVar = this.f201438k;
                    long j = this.f201436i;
                    cVar.mo142905a(this, j, j, this.f201437j);
                    this.f201438k.mo20706a(new RunnableC88747b(collection), this.f201435h, this.f201437j);
                } catch (Throwable th) {
                    C88422b.m153670a(th);
                    bVar.dispose();
                    EnumC88442c.error(th, this.f200749a);
                    this.f201438k.dispose();
                }
            }
        }

        @Override // p4560f.p4561a.p4568e.p4584j.AbstractC88913k, p4560f.p4561a.p4568e.p4572d.AbstractC88492p
        /* renamed from: a */
        public final /* synthetic */ void mo143008a(AbstractC88986z zVar, Object obj) {
            zVar.onNext(obj);
        }

        RunnableC88745c(AbstractC88986z<? super U> zVar, Callable<U> callable, long j, long j2, TimeUnit timeUnit, AbstractC88398aa.AbstractC88401c cVar) {
            super(zVar, new C88848a());
            this.f201434g = callable;
            this.f201435h = j;
            this.f201436i = j2;
            this.f201437j = timeUnit;
            this.f201438k = cVar;
        }
    }

    /* renamed from: f.a.e.e.e.c$b */
    static final class RunnableC88744b<T, U extends Collection<? super T>> extends AbstractC88492p<T, U, U> implements AbstractC88412b, Runnable {

        /* renamed from: g */
        final Callable<U> f201427g;

        /* renamed from: h */
        final long f201428h;

        /* renamed from: i */
        final TimeUnit f201429i;

        /* renamed from: j */
        final AbstractC88398aa f201430j;

        /* renamed from: k */
        AbstractC88412b f201431k;

        /* renamed from: l */
        U f201432l;

        /* renamed from: m */
        final AtomicReference<AbstractC88412b> f201433m = new AtomicReference<>();

        static {
            Covode.recordClassIndex(104786);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            EnumC88441b.dispose(this.f201433m);
            this.f201431k.dispose();
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            if (this.f201433m.get() == EnumC88441b.DISPOSED) {
                return true;
            }
            return false;
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
            U u;
            MethodCollector.m26663i(1616);
            synchronized (this) {
                try {
                    u = this.f201432l;
                    this.f201432l = null;
                } catch (Throwable th) {
                    MethodCollector.m26664o(1616);
                    throw th;
                }
            }
            if (u != null) {
                this.f200750b.offer(u);
                this.f200752d = true;
                if (mo143013c()) {
                    C88916n.m154121a(this.f200750b, this.f200749a, null, this);
                }
            }
            EnumC88441b.dispose(this.f201433m);
            MethodCollector.m26664o(1616);
        }

        public final void run() {
            U u;
            MethodCollector.m26663i(1636);
            try {
                U u2 = (U) ((Collection) C88466b.m153697a((Object) this.f201427g.call(), "The bufferSupplier returned a null buffer"));
                synchronized (this) {
                    try {
                        u = this.f201432l;
                        if (u != null) {
                            this.f201432l = u2;
                        }
                    } catch (Throwable th) {
                        MethodCollector.m26664o(1636);
                        throw th;
                    }
                }
                if (u == null) {
                    EnumC88441b.dispose(this.f201433m);
                    MethodCollector.m26664o(1636);
                    return;
                }
                mo143009a(u, this);
                MethodCollector.m26664o(1636);
            } catch (Throwable th2) {
                C88422b.m153670a(th2);
                this.f200749a.onError(th2);
                dispose();
                MethodCollector.m26664o(1636);
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            MethodCollector.m26663i(1601);
            synchronized (this) {
                try {
                    this.f201432l = null;
                } catch (Throwable th2) {
                    MethodCollector.m26664o(1601);
                    throw th2;
                }
            }
            this.f200749a.onError(th);
            EnumC88441b.dispose(this.f201433m);
            MethodCollector.m26664o(1601);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onNext(T t) {
            MethodCollector.m26663i(1597);
            synchronized (this) {
                try {
                    U u = this.f201432l;
                    if (u != null) {
                        u.add(t);
                        MethodCollector.m26664o(1597);
                    }
                } finally {
                    MethodCollector.m26664o(1597);
                }
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            if (EnumC88441b.validate(this.f201431k, bVar)) {
                this.f201431k = bVar;
                try {
                    this.f201432l = (U) ((Collection) C88466b.m153697a((Object) this.f201427g.call(), "The buffer supplied is null"));
                    this.f200749a.onSubscribe(this);
                    if (!this.f200751c) {
                        AbstractC88398aa aaVar = this.f201430j;
                        long j = this.f201428h;
                        AbstractC88412b a = aaVar.mo142901a(this, j, j, this.f201429i);
                        if (!this.f201433m.compareAndSet(null, a)) {
                            a.dispose();
                        }
                    }
                } catch (Throwable th) {
                    C88422b.m153670a(th);
                    dispose();
                    EnumC88442c.error(th, this.f200749a);
                }
            }
        }

        @Override // p4560f.p4561a.p4568e.p4584j.AbstractC88913k, p4560f.p4561a.p4568e.p4572d.AbstractC88492p
        /* renamed from: a */
        public final /* synthetic */ void mo143008a(AbstractC88986z zVar, Object obj) {
            this.f200749a.onNext(obj);
        }

        RunnableC88744b(AbstractC88986z<? super U> zVar, Callable<U> callable, long j, TimeUnit timeUnit, AbstractC88398aa aaVar) {
            super(zVar, new C88848a());
            this.f201427g = callable;
            this.f201428h = j;
            this.f201429i = timeUnit;
            this.f201430j = aaVar;
        }
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super U> zVar) {
        if (this.f201409b == this.f201410c && this.f201414g == Integer.MAX_VALUE) {
            this.f201095a.mo143062b(new RunnableC88744b(new C88923c(zVar), this.f201413f, this.f201409b, this.f201411d, this.f201412e));
            return;
        }
        AbstractC88398aa.AbstractC88401c a = this.f201412e.mo20704a();
        if (this.f201409b == this.f201410c) {
            this.f201095a.mo143062b(new RunnableC88743a(new C88923c(zVar), this.f201413f, this.f201409b, this.f201411d, this.f201414g, this.f201415h, a));
        } else {
            this.f201095a.mo143062b(new RunnableC88745c(new C88923c(zVar), this.f201413f, this.f201409b, this.f201410c, this.f201411d, a));
        }
    }

    public C88742c(AbstractC88984x<T> xVar, long j, long j2, TimeUnit timeUnit, AbstractC88398aa aaVar, Callable<U> callable, int i) {
        super(xVar);
        this.f201409b = j;
        this.f201410c = j2;
        this.f201411d = timeUnit;
        this.f201412e = aaVar;
        this.f201413f = callable;
    }
}
