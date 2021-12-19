package p4560f.p4561a.p4568e.p4573e.p4575b;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.p4663a.AbstractC90214c;
import org.p4663a.AbstractC90215d;
import p4560f.p4561a.AbstractC88924h;
import p4560f.p4561a.AbstractC88955l;
import p4560f.p4561a.p4568e.p4583i.EnumC88897f;
import p4560f.p4561a.p4568e.p4584j.C88902d;

/* renamed from: f.a.e.e.b.u */
public final class C88571u<T> extends AbstractC88514a<T, T> {
    static {
        Covode.recordClassIndex(104613);
    }

    /* renamed from: f.a.e.e.b.u$a */
    static final class C88572a<T> extends AtomicInteger implements AbstractC88955l<T>, AbstractC90215d {
        private static final long serialVersionUID = 163080509307634843L;

        /* renamed from: a */
        final AbstractC90214c<? super T> f200965a;

        /* renamed from: b */
        AbstractC90215d f200966b;

        /* renamed from: c */
        volatile boolean f200967c;

        /* renamed from: d */
        Throwable f200968d;

        /* renamed from: e */
        volatile boolean f200969e;

        /* renamed from: f */
        final AtomicLong f200970f = new AtomicLong();

        /* renamed from: g */
        final AtomicReference<T> f200971g = new AtomicReference<>();

        static {
            Covode.recordClassIndex(104614);
        }

        @Override // org.p4663a.AbstractC90214c
        public final void onComplete() {
            this.f200967c = true;
            m153813a();
        }

        @Override // org.p4663a.AbstractC90215d
        public final void cancel() {
            if (!this.f200969e) {
                this.f200969e = true;
                this.f200966b.cancel();
                if (getAndIncrement() == 0) {
                    this.f200971g.lazySet(null);
                }
            }
        }

        /* renamed from: a */
        private void m153813a() {
            boolean z;
            boolean z2;
            if (getAndIncrement() == 0) {
                AbstractC90214c<? super T> cVar = this.f200965a;
                AtomicLong atomicLong = this.f200970f;
                AtomicReference<T> atomicReference = this.f200971g;
                int i = 1;
                do {
                    long j = 0;
                    while (true) {
                        z = false;
                        if (j == atomicLong.get()) {
                            break;
                        }
                        boolean z3 = this.f200967c;
                        T andSet = atomicReference.getAndSet(null);
                        if (andSet == null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!m153814a(z3, z2, cVar, atomicReference)) {
                            if (z2) {
                                break;
                            }
                            cVar.onNext(andSet);
                            j++;
                        } else {
                            return;
                        }
                    }
                    if (j == atomicLong.get()) {
                        boolean z4 = this.f200967c;
                        if (atomicReference.get() == null) {
                            z = true;
                        }
                        if (m153814a(z4, z, cVar, atomicReference)) {
                            return;
                        }
                    }
                    if (j != 0) {
                        C88902d.m154099b(atomicLong, j);
                    }
                    i = addAndGet(-i);
                } while (i != 0);
            }
        }

        @Override // org.p4663a.AbstractC90214c
        public final void onError(Throwable th) {
            this.f200968d = th;
            this.f200967c = true;
            m153813a();
        }

        @Override // org.p4663a.AbstractC90214c
        public final void onNext(T t) {
            this.f200971g.lazySet(t);
            m153813a();
        }

        @Override // org.p4663a.AbstractC90215d
        public final void request(long j) {
            if (EnumC88897f.validate(j)) {
                C88902d.m154098a(this.f200970f, j);
                m153813a();
            }
        }

        C88572a(AbstractC90214c<? super T> cVar) {
            this.f200965a = cVar;
        }

        @Override // org.p4663a.AbstractC90214c, p4560f.p4561a.AbstractC88955l
        public final void onSubscribe(AbstractC90215d dVar) {
            if (EnumC88897f.validate(this.f200966b, dVar)) {
                this.f200966b = dVar;
                this.f200965a.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }

        /* renamed from: a */
        private boolean m153814a(boolean z, boolean z2, AbstractC90214c<?> cVar, AtomicReference<T> atomicReference) {
            if (this.f200969e) {
                atomicReference.lazySet(null);
                return true;
            } else if (!z) {
                return false;
            } else {
                Throwable th = this.f200968d;
                if (th != null) {
                    atomicReference.lazySet(null);
                    cVar.onError(th);
                    return true;
                } else if (!z2) {
                    return false;
                } else {
                    cVar.onComplete();
                    return true;
                }
            }
        }
    }

    public C88571u(AbstractC88924h<T> hVar) {
        super(hVar);
    }

    @Override // p4560f.p4561a.AbstractC88924h
    /* renamed from: a */
    public final void mo17954a(AbstractC90214c<? super T> cVar) {
        this.f200799b.mo143201a((AbstractC88955l) new C88572a(cVar));
    }
}
