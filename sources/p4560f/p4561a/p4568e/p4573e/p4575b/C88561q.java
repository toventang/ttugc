package p4560f.p4561a.p4568e.p4573e.p4575b;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicLong;
import org.p4663a.AbstractC90214c;
import org.p4663a.AbstractC90215d;
import p4560f.p4561a.AbstractC88398aa;
import p4560f.p4561a.AbstractC88924h;
import p4560f.p4561a.AbstractC88955l;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4566c.C88423c;
import p4560f.p4561a.p4568e.p4571c.AbstractC88468a;
import p4560f.p4561a.p4568e.p4571c.AbstractC88473f;
import p4560f.p4561a.p4568e.p4571c.AbstractC88476i;
import p4560f.p4561a.p4568e.p4580f.C88850b;
import p4560f.p4561a.p4568e.p4583i.AbstractC88892a;
import p4560f.p4561a.p4568e.p4583i.EnumC88897f;
import p4560f.p4561a.p4568e.p4584j.C88902d;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.e.b.q */
public final class C88561q<T> extends AbstractC88514a<T, T> {

    /* renamed from: c */
    final AbstractC88398aa f200924c;

    /* renamed from: d */
    final boolean f200925d = false;

    /* renamed from: e */
    final int f200926e;

    static {
        Covode.recordClassIndex(104603);
    }

    /* renamed from: f.a.e.e.b.q$a */
    static abstract class AbstractRunnableC88562a<T> extends AbstractC88892a<T> implements AbstractC88955l<T>, Runnable {
        private static final long serialVersionUID = -8241002408341274697L;

        /* renamed from: a */
        final AbstractC88398aa.AbstractC88401c f200927a;

        /* renamed from: b */
        final boolean f200928b;

        /* renamed from: c */
        final int f200929c;

        /* renamed from: d */
        final int f200930d;

        /* renamed from: e */
        final AtomicLong f200931e = new AtomicLong();

        /* renamed from: f */
        AbstractC90215d f200932f;

        /* renamed from: g */
        AbstractC88476i<T> f200933g;

        /* renamed from: h */
        volatile boolean f200934h;

        /* renamed from: i */
        volatile boolean f200935i;

        /* renamed from: j */
        Throwable f200936j;

        /* renamed from: k */
        int f200937k;

        /* renamed from: l */
        long f200938l;

        /* renamed from: m */
        boolean f200939m;

        static {
            Covode.recordClassIndex(104604);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo143040a();

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract void mo143042b();

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract void mo143043c();

        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
        public final void clear() {
            this.f200933g.clear();
        }

        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
        public final boolean isEmpty() {
            return this.f200933g.isEmpty();
        }

        /* renamed from: d */
        private void m153796d() {
            if (getAndIncrement() == 0) {
                this.f200927a.mo101910a(this);
            }
        }

        @Override // org.p4663a.AbstractC90214c
        public final void onComplete() {
            if (!this.f200935i) {
                this.f200935i = true;
                m153796d();
            }
        }

        @Override // org.p4663a.AbstractC90215d
        public final void cancel() {
            if (!this.f200934h) {
                this.f200934h = true;
                this.f200932f.cancel();
                this.f200927a.dispose();
                if (getAndIncrement() == 0) {
                    this.f200933g.clear();
                }
            }
        }

        public final void run() {
            if (this.f200939m) {
                mo143040a();
            } else if (this.f200937k == 1) {
                mo143042b();
            } else {
                mo143043c();
            }
        }

        @Override // org.p4663a.AbstractC90215d
        public final void request(long j) {
            if (EnumC88897f.validate(j)) {
                C88902d.m154098a(this.f200931e, j);
                m153796d();
            }
        }

        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88472e
        public final int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.f200939m = true;
            return 2;
        }

        @Override // org.p4663a.AbstractC90214c
        public final void onError(Throwable th) {
            if (this.f200935i) {
                C88925a.m154178a(th);
                return;
            }
            this.f200936j = th;
            this.f200935i = true;
            m153796d();
        }

        @Override // org.p4663a.AbstractC90214c
        public final void onNext(T t) {
            if (!this.f200935i) {
                if (this.f200937k == 2) {
                    m153796d();
                    return;
                }
                if (!this.f200933g.offer(t)) {
                    this.f200932f.cancel();
                    this.f200936j = new C88423c("Queue is full?!");
                    this.f200935i = true;
                }
                m153796d();
            }
        }

        AbstractRunnableC88562a(AbstractC88398aa.AbstractC88401c cVar, boolean z, int i) {
            this.f200927a = cVar;
            this.f200928b = z;
            this.f200929c = i;
            this.f200930d = i - (i >> 2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final boolean mo143041a(boolean z, boolean z2, AbstractC90214c<?> cVar) {
            if (this.f200934h) {
                clear();
                return true;
            } else if (!z) {
                return false;
            } else {
                if (!this.f200928b) {
                    Throwable th = this.f200936j;
                    if (th != null) {
                        this.f200934h = true;
                        clear();
                        cVar.onError(th);
                        this.f200927a.dispose();
                        return true;
                    } else if (!z2) {
                        return false;
                    } else {
                        this.f200934h = true;
                        cVar.onComplete();
                        this.f200927a.dispose();
                        return true;
                    }
                } else if (!z2) {
                    return false;
                } else {
                    this.f200934h = true;
                    Throwable th2 = this.f200936j;
                    if (th2 != null) {
                        cVar.onError(th2);
                    } else {
                        cVar.onComplete();
                    }
                    this.f200927a.dispose();
                    return true;
                }
            }
        }
    }

    /* renamed from: f.a.e.e.b.q$b */
    static final class C88563b<T> extends AbstractRunnableC88562a<T> {
        private static final long serialVersionUID = 644624475404284533L;

        /* renamed from: n */
        final AbstractC88468a<? super T> f200940n;

        /* renamed from: o */
        long f200941o;

        static {
            Covode.recordClassIndex(104605);
        }

        /* access modifiers changed from: package-private */
        @Override // p4560f.p4561a.p4568e.p4573e.p4575b.C88561q.AbstractRunnableC88562a
        /* renamed from: a */
        public final void mo143040a() {
            int i = 1;
            while (!this.f200934h) {
                boolean z = this.f200935i;
                this.f200940n.onNext(null);
                if (z) {
                    this.f200934h = true;
                    Throwable th = this.f200936j;
                    if (th != null) {
                        this.f200940n.onError(th);
                    } else {
                        this.f200940n.onComplete();
                    }
                    this.f200927a.dispose();
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
        public final T poll() {
            T t = (T) this.f200933g.poll();
            if (!(t == null || this.f200937k == 1)) {
                long j = this.f200941o + 1;
                if (j == ((long) this.f200930d)) {
                    this.f200941o = 0;
                    this.f200932f.request(j);
                } else {
                    this.f200941o = j;
                }
            }
            return t;
        }

        /* access modifiers changed from: package-private */
        @Override // p4560f.p4561a.p4568e.p4573e.p4575b.C88561q.AbstractRunnableC88562a
        /* renamed from: b */
        public final void mo143042b() {
            AbstractC88468a<? super T> aVar = this.f200940n;
            AbstractC88476i iVar = this.f200933g;
            long j = this.f200938l;
            int i = 1;
            while (true) {
                long j2 = this.f200931e.get();
                while (j != j2) {
                    try {
                        Object obj = (Object) iVar.poll();
                        if (!this.f200934h) {
                            if (obj == 0) {
                                this.f200934h = true;
                                aVar.onComplete();
                                this.f200927a.dispose();
                                return;
                            } else if (aVar.mo142981a(obj)) {
                                j++;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C88422b.m153670a(th);
                        this.f200934h = true;
                        this.f200932f.cancel();
                        aVar.onError(th);
                        this.f200927a.dispose();
                        return;
                    }
                }
                if (!this.f200934h) {
                    if (iVar.isEmpty()) {
                        this.f200934h = true;
                        aVar.onComplete();
                        this.f200927a.dispose();
                        return;
                    }
                    int i2 = get();
                    if (i == i2) {
                        this.f200938l = j;
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        i = i2;
                    }
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        @Override // p4560f.p4561a.p4568e.p4573e.p4575b.C88561q.AbstractRunnableC88562a
        /* renamed from: c */
        public final void mo143043c() {
            boolean z;
            AbstractC88468a<? super T> aVar = this.f200940n;
            AbstractC88476i iVar = this.f200933g;
            long j = this.f200938l;
            long j2 = this.f200941o;
            int i = 1;
            while (true) {
                long j3 = this.f200931e.get();
                while (j != j3) {
                    boolean z2 = this.f200935i;
                    try {
                        Object obj = (Object) iVar.poll();
                        if (obj == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!mo143041a(z2, z, aVar)) {
                            if (z) {
                                break;
                            }
                            if (aVar.mo142981a(obj)) {
                                j++;
                            }
                            j2++;
                            if (j2 == ((long) this.f200930d)) {
                                this.f200932f.request(j2);
                                j2 = 0;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C88422b.m153670a(th);
                        this.f200934h = true;
                        this.f200932f.cancel();
                        iVar.clear();
                        aVar.onError(th);
                        this.f200927a.dispose();
                        return;
                    }
                }
                if (j != j3 || !mo143041a(this.f200935i, iVar.isEmpty(), aVar)) {
                    int i2 = get();
                    if (i == i2) {
                        this.f200938l = j;
                        this.f200941o = j2;
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        i = i2;
                    }
                } else {
                    return;
                }
            }
        }

        @Override // p4560f.p4561a.AbstractC88955l, org.p4663a.AbstractC90214c
        public final void onSubscribe(AbstractC90215d dVar) {
            if (EnumC88897f.validate(this.f200932f, dVar)) {
                this.f200932f = dVar;
                if (dVar instanceof AbstractC88473f) {
                    AbstractC88473f fVar = (AbstractC88473f) dVar;
                    int requestFusion = fVar.requestFusion(7);
                    if (requestFusion == 1) {
                        this.f200937k = 1;
                        this.f200933g = fVar;
                        this.f200935i = true;
                        this.f200940n.onSubscribe(this);
                        return;
                    } else if (requestFusion == 2) {
                        this.f200937k = 2;
                        this.f200933g = fVar;
                        this.f200940n.onSubscribe(this);
                        dVar.request((long) this.f200929c);
                        return;
                    }
                }
                this.f200933g = new C88850b(this.f200929c);
                this.f200940n.onSubscribe(this);
                dVar.request((long) this.f200929c);
            }
        }

        C88563b(AbstractC88468a<? super T> aVar, AbstractC88398aa.AbstractC88401c cVar, boolean z, int i) {
            super(cVar, z, i);
            this.f200940n = aVar;
        }
    }

    /* renamed from: f.a.e.e.b.q$c */
    static final class C88564c<T> extends AbstractRunnableC88562a<T> {
        private static final long serialVersionUID = -4547113800637756442L;

        /* renamed from: n */
        final AbstractC90214c<? super T> f200942n;

        static {
            Covode.recordClassIndex(104606);
        }

        /* access modifiers changed from: package-private */
        @Override // p4560f.p4561a.p4568e.p4573e.p4575b.C88561q.AbstractRunnableC88562a
        /* renamed from: a */
        public final void mo143040a() {
            int i = 1;
            while (!this.f200934h) {
                boolean z = this.f200935i;
                this.f200942n.onNext(null);
                if (z) {
                    this.f200934h = true;
                    Throwable th = this.f200936j;
                    if (th != null) {
                        this.f200942n.onError(th);
                    } else {
                        this.f200942n.onComplete();
                    }
                    this.f200927a.dispose();
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
        public final T poll() {
            T t = (T) this.f200933g.poll();
            if (!(t == null || this.f200937k == 1)) {
                long j = this.f200938l + 1;
                if (j == ((long) this.f200930d)) {
                    this.f200938l = 0;
                    this.f200932f.request(j);
                } else {
                    this.f200938l = j;
                }
            }
            return t;
        }

        /* access modifiers changed from: package-private */
        @Override // p4560f.p4561a.p4568e.p4573e.p4575b.C88561q.AbstractRunnableC88562a
        /* renamed from: b */
        public final void mo143042b() {
            AbstractC90214c<? super T> cVar = this.f200942n;
            AbstractC88476i iVar = this.f200933g;
            long j = this.f200938l;
            int i = 1;
            while (true) {
                long j2 = this.f200931e.get();
                while (j != j2) {
                    try {
                        Object obj = (Object) iVar.poll();
                        if (!this.f200934h) {
                            if (obj == 0) {
                                this.f200934h = true;
                                cVar.onComplete();
                                this.f200927a.dispose();
                                return;
                            }
                            cVar.onNext(obj);
                            j++;
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C88422b.m153670a(th);
                        this.f200934h = true;
                        this.f200932f.cancel();
                        cVar.onError(th);
                        this.f200927a.dispose();
                        return;
                    }
                }
                if (!this.f200934h) {
                    if (iVar.isEmpty()) {
                        this.f200934h = true;
                        cVar.onComplete();
                        this.f200927a.dispose();
                        return;
                    }
                    int i2 = get();
                    if (i == i2) {
                        this.f200938l = j;
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        i = i2;
                    }
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        @Override // p4560f.p4561a.p4568e.p4573e.p4575b.C88561q.AbstractRunnableC88562a
        /* renamed from: c */
        public final void mo143043c() {
            boolean z;
            AbstractC90214c<? super T> cVar = this.f200942n;
            AbstractC88476i iVar = this.f200933g;
            long j = this.f200938l;
            int i = 1;
            while (true) {
                long j2 = this.f200931e.get();
                while (j != j2) {
                    boolean z2 = this.f200935i;
                    try {
                        Object obj = (Object) iVar.poll();
                        if (obj == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!mo143041a(z2, z, cVar)) {
                            if (z) {
                                break;
                            }
                            cVar.onNext(obj);
                            j++;
                            if (j == ((long) this.f200930d)) {
                                if (j2 != Long.MAX_VALUE) {
                                    j2 = this.f200931e.addAndGet(-j);
                                }
                                this.f200932f.request(j);
                                j = 0;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C88422b.m153670a(th);
                        this.f200934h = true;
                        this.f200932f.cancel();
                        iVar.clear();
                        cVar.onError(th);
                        this.f200927a.dispose();
                        return;
                    }
                }
                if (j != j2 || !mo143041a(this.f200935i, iVar.isEmpty(), cVar)) {
                    int i2 = get();
                    if (i == i2) {
                        this.f200938l = j;
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        i = i2;
                    }
                } else {
                    return;
                }
            }
        }

        @Override // p4560f.p4561a.AbstractC88955l, org.p4663a.AbstractC90214c
        public final void onSubscribe(AbstractC90215d dVar) {
            if (EnumC88897f.validate(this.f200932f, dVar)) {
                this.f200932f = dVar;
                if (dVar instanceof AbstractC88473f) {
                    AbstractC88473f fVar = (AbstractC88473f) dVar;
                    int requestFusion = fVar.requestFusion(7);
                    if (requestFusion == 1) {
                        this.f200937k = 1;
                        this.f200933g = fVar;
                        this.f200935i = true;
                        this.f200942n.onSubscribe(this);
                        return;
                    } else if (requestFusion == 2) {
                        this.f200937k = 2;
                        this.f200933g = fVar;
                        this.f200942n.onSubscribe(this);
                        dVar.request((long) this.f200929c);
                        return;
                    }
                }
                this.f200933g = new C88850b(this.f200929c);
                this.f200942n.onSubscribe(this);
                dVar.request((long) this.f200929c);
            }
        }

        C88564c(AbstractC90214c<? super T> cVar, AbstractC88398aa.AbstractC88401c cVar2, boolean z, int i) {
            super(cVar2, z, i);
            this.f200942n = cVar;
        }
    }

    @Override // p4560f.p4561a.AbstractC88924h
    /* renamed from: a */
    public final void mo17954a(AbstractC90214c<? super T> cVar) {
        AbstractC88398aa.AbstractC88401c a = this.f200924c.mo20704a();
        if (cVar instanceof AbstractC88468a) {
            this.f200799b.mo143201a((AbstractC88955l) new C88563b((AbstractC88468a) cVar, a, this.f200925d, this.f200926e));
        } else {
            this.f200799b.mo143201a((AbstractC88955l) new C88564c(cVar, a, this.f200925d, this.f200926e));
        }
    }

    public C88561q(AbstractC88924h<T> hVar, AbstractC88398aa aaVar, int i) {
        super(hVar);
        this.f200924c = aaVar;
        this.f200926e = i;
    }
}
