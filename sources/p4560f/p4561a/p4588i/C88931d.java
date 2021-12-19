package p4560f.p4561a.p4588i;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.p4663a.AbstractC90214c;
import org.p4663a.AbstractC90215d;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4568e.p4580f.C88851c;
import p4560f.p4561a.p4568e.p4583i.AbstractC88892a;
import p4560f.p4561a.p4568e.p4583i.EnumC88894c;
import p4560f.p4561a.p4568e.p4583i.EnumC88897f;
import p4560f.p4561a.p4568e.p4584j.C88902d;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.i.d */
public final class C88931d<T> extends AbstractC88927a<T> {

    /* renamed from: b */
    final C88851c<T> f201967b;

    /* renamed from: c */
    final AtomicReference<Runnable> f201968c;

    /* renamed from: d */
    final boolean f201969d;

    /* renamed from: e */
    volatile boolean f201970e;

    /* renamed from: f */
    Throwable f201971f;

    /* renamed from: g */
    final AtomicReference<AbstractC90214c<? super T>> f201972g;

    /* renamed from: h */
    volatile boolean f201973h;

    /* renamed from: i */
    final AtomicBoolean f201974i;

    /* renamed from: j */
    final AbstractC88892a<T> f201975j;

    /* renamed from: k */
    final AtomicLong f201976k;

    /* renamed from: l */
    boolean f201977l;

    static {
        Covode.recordClassIndex(104973);
    }

    /* renamed from: f.a.i.d$a */
    final class C88932a extends AbstractC88892a<T> {
        private static final long serialVersionUID = -4896760517184205454L;

        static {
            Covode.recordClassIndex(104974);
        }

        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
        public final void clear() {
            C88931d.this.f201967b.clear();
        }

        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
        public final boolean isEmpty() {
            return C88931d.this.f201967b.isEmpty();
        }

        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
        public final T poll() {
            return C88931d.this.f201967b.poll();
        }

        @Override // org.p4663a.AbstractC90215d
        public final void cancel() {
            if (!C88931d.this.f201973h) {
                C88931d.this.f201973h = true;
                C88931d.this.mo143211g();
                if (!C88931d.this.f201977l && C88931d.this.f201975j.getAndIncrement() == 0) {
                    C88931d.this.f201967b.clear();
                    C88931d.this.f201972g.lazySet(null);
                }
            }
        }

        C88932a() {
        }

        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88472e
        public final int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            C88931d.this.f201977l = true;
            return 2;
        }

        @Override // org.p4663a.AbstractC90215d
        public final void request(long j) {
            if (EnumC88897f.validate(j)) {
                C88902d.m154098a(C88931d.this.f201976k, j);
                C88931d.this.mo143212h();
            }
        }
    }

    public C88931d() {
        this(8);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo143211g() {
        Runnable andSet = this.f201968c.getAndSet(null);
        if (andSet != null) {
            andSet.run();
        }
    }

    @Override // org.p4663a.AbstractC90214c
    public final void onComplete() {
        if (!this.f201970e && !this.f201973h) {
            this.f201970e = true;
            mo143211g();
            mo143212h();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo143212h() {
        boolean z;
        if (this.f201975j.getAndIncrement() == 0) {
            AbstractC90214c<? super T> cVar = this.f201972g.get();
            int i = 1;
            int i2 = 1;
            while (cVar == null) {
                i2 = this.f201975j.addAndGet(-i2);
                if (i2 != 0) {
                    cVar = this.f201972g.get();
                    i = 1;
                } else {
                    return;
                }
            }
            if (this.f201977l) {
                C88851c<T> cVar2 = this.f201967b;
                int i3 = (this.f201969d ? 1 : 0) ^ i;
                while (!this.f201973h) {
                    boolean z2 = this.f201970e;
                    if (i3 == 0 || !z2 || this.f201971f == null) {
                        cVar.onNext(null);
                        if (z2) {
                            this.f201972g.lazySet(null);
                            Throwable th = this.f201971f;
                            if (th != null) {
                                cVar.onError(th);
                                return;
                            } else {
                                cVar.onComplete();
                                return;
                            }
                        } else {
                            i = this.f201975j.addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        }
                    } else {
                        cVar2.clear();
                        this.f201972g.lazySet(null);
                        cVar.onError(this.f201971f);
                        return;
                    }
                }
                cVar2.clear();
                this.f201972g.lazySet(null);
                return;
            }
            C88851c<T> cVar3 = this.f201967b;
            boolean z3 = !this.f201969d;
            int i4 = 1;
            do {
                long j = this.f201976k.get();
                long j2 = 0;
                while (j != j2) {
                    boolean z4 = this.f201970e;
                    T poll = cVar3.poll();
                    if (poll == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!m154191a(z3, z4, z, cVar, cVar3)) {
                        if (z) {
                            break;
                        }
                        cVar.onNext(poll);
                        j2++;
                    } else {
                        return;
                    }
                }
                if (j != j2 || !m154191a(z3, this.f201970e, cVar3.isEmpty(), cVar, cVar3)) {
                    if (!(j2 == 0 || j == Long.MAX_VALUE)) {
                        this.f201976k.addAndGet(-j2);
                    }
                    i4 = this.f201975j.addAndGet(-i4);
                } else {
                    return;
                }
            } while (i4 != 0);
        }
    }

    @Override // org.p4663a.AbstractC90214c
    public final void onError(Throwable th) {
        C88466b.m153697a((Object) th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f201970e || this.f201973h) {
            C88925a.m154178a(th);
            return;
        }
        this.f201971f = th;
        this.f201970e = true;
        mo143211g();
        mo143212h();
    }

    @Override // org.p4663a.AbstractC90214c
    public final void onNext(T t) {
        C88466b.m153697a((Object) t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f201970e && !this.f201973h) {
            this.f201967b.offer(t);
            mo143212h();
        }
    }

    @Override // org.p4663a.AbstractC90214c, p4560f.p4561a.AbstractC88955l
    public final void onSubscribe(AbstractC90215d dVar) {
        if (this.f201970e || this.f201973h) {
            dVar.cancel();
        } else {
            dVar.request(Long.MAX_VALUE);
        }
    }

    private C88931d(int i) {
        this.f201967b = new C88851c<>(C88466b.m153696a(8, "capacityHint"));
        this.f201968c = new AtomicReference<>(null);
        this.f201969d = true;
        this.f201972g = new AtomicReference<>();
        this.f201974i = new AtomicBoolean();
        this.f201975j = new C88932a();
        this.f201976k = new AtomicLong();
    }

    @Override // p4560f.p4561a.AbstractC88924h
    /* renamed from: a */
    public final void mo17954a(AbstractC90214c<? super T> cVar) {
        if (this.f201974i.get() || !this.f201974i.compareAndSet(false, true)) {
            EnumC88894c.error(new IllegalStateException("This processor allows only a single Subscriber"), cVar);
            return;
        }
        cVar.onSubscribe(this.f201975j);
        this.f201972g.set(cVar);
        if (this.f201973h) {
            this.f201972g.lazySet(null);
        } else {
            mo143212h();
        }
    }

    /* renamed from: a */
    private boolean m154191a(boolean z, boolean z2, boolean z3, AbstractC90214c<? super T> cVar, C88851c<T> cVar2) {
        if (this.f201973h) {
            cVar2.clear();
            this.f201972g.lazySet(null);
            return true;
        } else if (!z2) {
            return false;
        } else {
            if (z && this.f201971f != null) {
                cVar2.clear();
                this.f201972g.lazySet(null);
                cVar.onError(this.f201971f);
                return true;
            } else if (!z3) {
                return false;
            } else {
                Throwable th = this.f201971f;
                this.f201972g.lazySet(null);
                if (th != null) {
                    cVar.onError(th);
                } else {
                    cVar.onComplete();
                }
                return true;
            }
        }
    }
}
