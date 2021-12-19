package p4560f.p4561a.p4568e.p4573e.p4575b;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.p4663a.AbstractC90214c;
import org.p4663a.AbstractC90215d;
import p4560f.p4561a.AbstractC88924h;
import p4560f.p4561a.AbstractC88933j;
import p4560f.p4561a.AbstractC88945k;
import p4560f.p4561a.EnumC88388a;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4566c.C88423c;
import p4560f.p4561a.p4568e.p4569a.C88445f;
import p4560f.p4561a.p4568e.p4580f.C88851c;
import p4560f.p4561a.p4568e.p4583i.EnumC88897f;
import p4560f.p4561a.p4568e.p4584j.C88902d;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.e.b.b */
public final class C88524b<T> extends AbstractC88924h<T> {

    /* renamed from: b */
    final AbstractC88945k<T> f200827b;

    /* renamed from: c */
    final EnumC88388a f200828c;

    static {
        Covode.recordClassIndex(104566);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f.a.e.e.b.b$a */
    public static abstract class AbstractC88526a<T> extends AtomicLong implements AbstractC88933j<T>, AbstractC90215d {
        private static final long serialVersionUID = 7326289992464377023L;

        /* renamed from: a */
        final AbstractC90214c<? super T> f200830a;

        /* renamed from: b */
        final C88445f f200831b = new C88445f();

        static {
            Covode.recordClassIndex(104568);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo143027c() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo143029d() {
        }

        @Override // p4560f.p4561a.AbstractC88920g
        /* renamed from: a */
        public void mo143023a() {
            mo143025b();
        }

        @Override // org.p4663a.AbstractC90215d
        public final void cancel() {
            this.f200831b.dispose();
            mo143027c();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final void mo143025b() {
            if (!this.f200831b.isDisposed()) {
                try {
                    this.f200830a.onComplete();
                } finally {
                    this.f200831b.dispose();
                }
            }
        }

        public String toString() {
            return C1764a.m5928a("%s{%s}", new Object[]{getClass().getSimpleName(), super.toString()});
        }

        /* renamed from: b */
        public boolean mo143026b(Throwable th) {
            return mo143028c(th);
        }

        AbstractC88526a(AbstractC90214c<? super T> cVar) {
            this.f200830a = cVar;
        }

        @Override // p4560f.p4561a.AbstractC88920g
        /* renamed from: a */
        public final void mo143024a(Throwable th) {
            if (!mo143026b(th)) {
                C88925a.m154178a(th);
            }
        }

        @Override // org.p4663a.AbstractC90215d
        public final void request(long j) {
            if (EnumC88897f.validate(j)) {
                C88902d.m154098a(this, j);
                mo143029d();
            }
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: protected */
        /* renamed from: c */
        public final boolean mo143028c(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (this.f200831b.isDisposed()) {
                return false;
            }
            try {
                this.f200830a.onError(th);
                this.f200831b.dispose();
                return true;
            } catch (Throwable th2) {
                this.f200831b.dispose();
                throw th2;
            }
        }
    }

    /* renamed from: f.a.e.e.b.b$b */
    static final class C88527b<T> extends AbstractC88526a<T> {
        private static final long serialVersionUID = 2427151001689639875L;

        /* renamed from: c */
        final C88851c<T> f200832c;

        /* renamed from: d */
        Throwable f200833d;

        /* renamed from: e */
        volatile boolean f200834e;

        /* renamed from: f */
        final AtomicInteger f200835f = new AtomicInteger();

        static {
            Covode.recordClassIndex(104569);
        }

        /* access modifiers changed from: package-private */
        @Override // p4560f.p4561a.p4568e.p4573e.p4575b.C88524b.AbstractC88526a
        /* renamed from: d */
        public final void mo143029d() {
            m153749e();
        }

        @Override // p4560f.p4561a.AbstractC88920g, p4560f.p4561a.p4568e.p4573e.p4575b.C88524b.AbstractC88526a
        /* renamed from: a */
        public final void mo143023a() {
            this.f200834e = true;
            m153749e();
        }

        /* access modifiers changed from: package-private */
        @Override // p4560f.p4561a.p4568e.p4573e.p4575b.C88524b.AbstractC88526a
        /* renamed from: c */
        public final void mo143027c() {
            if (this.f200835f.getAndIncrement() == 0) {
                this.f200832c.clear();
            }
        }

        /* renamed from: e */
        private void m153749e() {
            boolean z;
            if (this.f200835f.getAndIncrement() == 0) {
                AbstractC90214c cVar = this.f200830a;
                C88851c<T> cVar2 = this.f200832c;
                int i = 1;
                do {
                    long j = get();
                    long j2 = 0;
                    while (j2 != j) {
                        if (this.f200831b.isDisposed()) {
                            cVar2.clear();
                            return;
                        }
                        boolean z2 = this.f200834e;
                        T poll = cVar2.poll();
                        if (poll == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z2) {
                            if (z) {
                                break;
                            }
                        } else if (z) {
                            Throwable th = this.f200833d;
                            if (th != null) {
                                mo143028c(th);
                                return;
                            } else {
                                mo143025b();
                                return;
                            }
                        }
                        cVar.onNext(poll);
                        j2++;
                    }
                    if (j2 == j) {
                        if (this.f200831b.isDisposed()) {
                            cVar2.clear();
                            return;
                        }
                        boolean z3 = this.f200834e;
                        boolean isEmpty = cVar2.isEmpty();
                        if (z3 && isEmpty) {
                            Throwable th2 = this.f200833d;
                            if (th2 != null) {
                                mo143028c(th2);
                                return;
                            } else {
                                mo143025b();
                                return;
                            }
                        }
                    }
                    if (j2 != 0) {
                        C88902d.m154099b(this, j2);
                    }
                    i = this.f200835f.addAndGet(-i);
                } while (i != 0);
            }
        }

        @Override // p4560f.p4561a.p4568e.p4573e.p4575b.C88524b.AbstractC88526a
        /* renamed from: b */
        public final boolean mo143026b(Throwable th) {
            if (this.f200834e || this.f200831b.isDisposed()) {
                return false;
            }
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.f200833d = th;
            this.f200834e = true;
            m153749e();
            return true;
        }

        @Override // p4560f.p4561a.AbstractC88920g
        /* renamed from: a */
        public final void mo143031a(T t) {
            if (!this.f200834e && !this.f200831b.isDisposed()) {
                if (t == null) {
                    mo143024a((Throwable) new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                    return;
                }
                this.f200832c.offer(t);
                m153749e();
            }
        }

        C88527b(AbstractC90214c<? super T> cVar, int i) {
            super(cVar);
            this.f200832c = new C88851c<>(i);
        }
    }

    /* renamed from: f.a.e.e.b.b$e */
    static final class C88530e<T> extends AbstractC88526a<T> {
        private static final long serialVersionUID = 4023437720691792495L;

        /* renamed from: c */
        final AtomicReference<T> f200836c = new AtomicReference<>();

        /* renamed from: d */
        Throwable f200837d;

        /* renamed from: e */
        volatile boolean f200838e;

        /* renamed from: f */
        final AtomicInteger f200839f = new AtomicInteger();

        static {
            Covode.recordClassIndex(104572);
        }

        /* access modifiers changed from: package-private */
        @Override // p4560f.p4561a.p4568e.p4573e.p4575b.C88524b.AbstractC88526a
        /* renamed from: d */
        public final void mo143029d() {
            m153757e();
        }

        @Override // p4560f.p4561a.AbstractC88920g, p4560f.p4561a.p4568e.p4573e.p4575b.C88524b.AbstractC88526a
        /* renamed from: a */
        public final void mo143023a() {
            this.f200838e = true;
            m153757e();
        }

        /* access modifiers changed from: package-private */
        @Override // p4560f.p4561a.p4568e.p4573e.p4575b.C88524b.AbstractC88526a
        /* renamed from: c */
        public final void mo143027c() {
            if (this.f200839f.getAndIncrement() == 0) {
                this.f200836c.lazySet(null);
            }
        }

        /* renamed from: e */
        private void m153757e() {
            boolean z;
            boolean z2;
            if (this.f200839f.getAndIncrement() == 0) {
                AbstractC90214c cVar = this.f200830a;
                AtomicReference<T> atomicReference = this.f200836c;
                int i = 1;
                do {
                    long j = get();
                    long j2 = 0;
                    while (true) {
                        z = false;
                        if (j2 == j) {
                            break;
                        } else if (this.f200831b.isDisposed()) {
                            atomicReference.lazySet(null);
                            return;
                        } else {
                            boolean z3 = this.f200838e;
                            T andSet = atomicReference.getAndSet(null);
                            if (andSet == null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (!z3) {
                                if (z2) {
                                    break;
                                }
                            } else if (z2) {
                                Throwable th = this.f200837d;
                                if (th != null) {
                                    mo143028c(th);
                                    return;
                                } else {
                                    mo143025b();
                                    return;
                                }
                            }
                            cVar.onNext(andSet);
                            j2++;
                        }
                    }
                    if (j2 == j) {
                        if (this.f200831b.isDisposed()) {
                            atomicReference.lazySet(null);
                            return;
                        }
                        boolean z4 = this.f200838e;
                        if (atomicReference.get() == null) {
                            z = true;
                        }
                        if (z4 && z) {
                            Throwable th2 = this.f200837d;
                            if (th2 != null) {
                                mo143028c(th2);
                                return;
                            } else {
                                mo143025b();
                                return;
                            }
                        }
                    }
                    if (j2 != 0) {
                        C88902d.m154099b(this, j2);
                    }
                    i = this.f200839f.addAndGet(-i);
                } while (i != 0);
            }
        }

        C88530e(AbstractC90214c<? super T> cVar) {
            super(cVar);
        }

        @Override // p4560f.p4561a.AbstractC88920g
        /* renamed from: a */
        public final void mo143031a(T t) {
            if (!this.f200838e && !this.f200831b.isDisposed()) {
                if (t == null) {
                    mo143024a((Throwable) new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                    return;
                }
                this.f200836c.set(t);
                m153757e();
            }
        }

        @Override // p4560f.p4561a.p4568e.p4573e.p4575b.C88524b.AbstractC88526a
        /* renamed from: b */
        public final boolean mo143026b(Throwable th) {
            if (this.f200838e || this.f200831b.isDisposed()) {
                return false;
            }
            if (th == null) {
                mo143024a((Throwable) new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources."));
            }
            this.f200837d = th;
            this.f200838e = true;
            m153757e();
            return true;
        }
    }

    /* renamed from: f.a.e.e.b.b$d */
    static final class C88529d<T> extends AbstractC88532g<T> {
        private static final long serialVersionUID = 338953216916120960L;

        static {
            Covode.recordClassIndex(104571);
        }

        /* access modifiers changed from: package-private */
        @Override // p4560f.p4561a.p4568e.p4573e.p4575b.C88524b.AbstractC88532g
        /* renamed from: e */
        public final void mo143032e() {
            mo143024a((Throwable) new C88423c("create: could not emit value due to lack of requests"));
        }

        C88529d(AbstractC90214c<? super T> cVar) {
            super(cVar);
        }
    }

    /* renamed from: f.a.e.e.b.b$1 */
    static /* synthetic */ class C885251 {

        /* renamed from: a */
        static final /* synthetic */ int[] f200829a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        static {
            /*
                r0 = 104567(0x19877, float:1.4653E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                f.a.a[] r0 = p4560f.p4561a.EnumC88388a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                p4560f.p4561a.p4568e.p4573e.p4575b.C88524b.C885251.f200829a = r2
                f.a.a r0 = p4560f.p4561a.EnumC88388a.MISSING     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = p4560f.p4561a.p4568e.p4573e.p4575b.C88524b.C885251.f200829a     // Catch:{ NoSuchFieldError -> 0x0023 }
                f.a.a r0 = p4560f.p4561a.EnumC88388a.ERROR     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = p4560f.p4561a.p4568e.p4573e.p4575b.C88524b.C885251.f200829a     // Catch:{ NoSuchFieldError -> 0x002e }
                f.a.a r0 = p4560f.p4561a.EnumC88388a.DROP     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = p4560f.p4561a.p4568e.p4573e.p4575b.C88524b.C885251.f200829a     // Catch:{ NoSuchFieldError -> 0x0039 }
                f.a.a r0 = p4560f.p4561a.EnumC88388a.LATEST     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p4560f.p4561a.p4568e.p4573e.p4575b.C88524b.C885251.<clinit>():void");
        }
    }

    /* renamed from: f.a.e.e.b.b$c */
    static final class C88528c<T> extends AbstractC88532g<T> {
        private static final long serialVersionUID = 8360058422307496563L;

        static {
            Covode.recordClassIndex(104570);
        }

        /* access modifiers changed from: package-private */
        @Override // p4560f.p4561a.p4568e.p4573e.p4575b.C88524b.AbstractC88532g
        /* renamed from: e */
        public final void mo143032e() {
        }

        C88528c(AbstractC90214c<? super T> cVar) {
            super(cVar);
        }
    }

    /* renamed from: f.a.e.e.b.b$f */
    static final class C88531f<T> extends AbstractC88526a<T> {
        private static final long serialVersionUID = 3776720187248809713L;

        static {
            Covode.recordClassIndex(104573);
        }

        C88531f(AbstractC90214c<? super T> cVar) {
            super(cVar);
        }

        @Override // p4560f.p4561a.AbstractC88920g
        /* renamed from: a */
        public final void mo143031a(T t) {
            long j;
            if (!this.f200831b.isDisposed()) {
                if (t != null) {
                    this.f200830a.onNext(t);
                    do {
                        j = get();
                        if (j == 0) {
                            return;
                        }
                    } while (!compareAndSet(j, j - 1));
                    return;
                }
                mo143024a((Throwable) new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            }
        }
    }

    /* renamed from: f.a.e.e.b.b$g */
    static abstract class AbstractC88532g<T> extends AbstractC88526a<T> {
        private static final long serialVersionUID = 4127754106204442833L;

        static {
            Covode.recordClassIndex(104574);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public abstract void mo143032e();

        AbstractC88532g(AbstractC90214c<? super T> cVar) {
            super(cVar);
        }

        @Override // p4560f.p4561a.AbstractC88920g
        /* renamed from: a */
        public final void mo143031a(T t) {
            if (!this.f200831b.isDisposed()) {
                if (t == null) {
                    mo143024a((Throwable) new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                } else if (get() != 0) {
                    this.f200830a.onNext(t);
                    C88902d.m154099b(this, 1);
                } else {
                    mo143032e();
                }
            }
        }
    }

    @Override // p4560f.p4561a.AbstractC88924h
    /* renamed from: a */
    public final void mo17954a(AbstractC90214c<? super T> cVar) {
        AbstractC88526a fVar;
        int i = C885251.f200829a[this.f200828c.ordinal()];
        if (i == 1) {
            fVar = new C88531f(cVar);
        } else if (i == 2) {
            fVar = new C88529d(cVar);
        } else if (i == 3) {
            fVar = new C88528c(cVar);
        } else if (i != 4) {
            fVar = new C88527b(cVar, AbstractC88924h.f201932a);
        } else {
            fVar = new C88530e(cVar);
        }
        cVar.onSubscribe(fVar);
        try {
            this.f200827b.mo17627a(fVar);
        } catch (Throwable th) {
            C88422b.m153670a(th);
            fVar.mo143024a(th);
        }
    }

    public C88524b(AbstractC88945k<T> kVar, EnumC88388a aVar) {
        this.f200827b = kVar;
        this.f200828c = aVar;
    }
}
