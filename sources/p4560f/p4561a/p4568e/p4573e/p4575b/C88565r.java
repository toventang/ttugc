package p4560f.p4561a.p4568e.p4573e.p4575b;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicLong;
import org.p4663a.AbstractC90214c;
import org.p4663a.AbstractC90215d;
import p4560f.p4561a.AbstractC88924h;
import p4560f.p4561a.AbstractC88955l;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4566c.C88423c;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4568e.p4571c.AbstractC88475h;
import p4560f.p4561a.p4568e.p4580f.C88850b;
import p4560f.p4561a.p4568e.p4580f.C88851c;
import p4560f.p4561a.p4568e.p4583i.AbstractC88892a;
import p4560f.p4561a.p4568e.p4583i.EnumC88897f;
import p4560f.p4561a.p4568e.p4584j.C88902d;

/* renamed from: f.a.e.e.b.r */
public final class C88565r<T> extends AbstractC88514a<T, T> {

    /* renamed from: c */
    final int f200943c;

    /* renamed from: d */
    final boolean f200944d = true;

    /* renamed from: e */
    final boolean f200945e = false;

    /* renamed from: f */
    final AbstractC88428a f200946f;

    static {
        Covode.recordClassIndex(104607);
    }

    /* renamed from: f.a.e.e.b.r$a */
    static final class C88566a<T> extends AbstractC88892a<T> implements AbstractC88955l<T> {
        private static final long serialVersionUID = -2514538129242366402L;

        /* renamed from: a */
        final AbstractC90214c<? super T> f200947a;

        /* renamed from: b */
        final AbstractC88475h<T> f200948b;

        /* renamed from: c */
        final boolean f200949c;

        /* renamed from: d */
        final AbstractC88428a f200950d;

        /* renamed from: e */
        AbstractC90215d f200951e;

        /* renamed from: f */
        volatile boolean f200952f;

        /* renamed from: g */
        volatile boolean f200953g;

        /* renamed from: h */
        Throwable f200954h;

        /* renamed from: i */
        final AtomicLong f200955i = new AtomicLong();

        /* renamed from: j */
        boolean f200956j;

        static {
            Covode.recordClassIndex(104608);
        }

        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
        public final void clear() {
            this.f200948b.clear();
        }

        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
        public final boolean isEmpty() {
            return this.f200948b.isEmpty();
        }

        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
        public final T poll() {
            return this.f200948b.poll();
        }

        @Override // org.p4663a.AbstractC90215d
        public final void cancel() {
            if (!this.f200952f) {
                this.f200952f = true;
                this.f200951e.cancel();
                if (getAndIncrement() == 0) {
                    this.f200948b.clear();
                }
            }
        }

        @Override // org.p4663a.AbstractC90214c
        public final void onComplete() {
            this.f200953g = true;
            if (this.f200956j) {
                this.f200947a.onComplete();
            } else {
                m153808a();
            }
        }

        /* renamed from: a */
        private void m153808a() {
            boolean z;
            if (getAndIncrement() == 0) {
                AbstractC88475h<T> hVar = this.f200948b;
                AbstractC90214c<? super T> cVar = this.f200947a;
                int i = 1;
                while (!m153809a(this.f200953g, hVar.isEmpty(), cVar)) {
                    long j = this.f200955i.get();
                    long j2 = 0;
                    while (j2 != j) {
                        boolean z2 = this.f200953g;
                        T poll = hVar.poll();
                        if (poll == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!m153809a(z2, z, cVar)) {
                            if (z) {
                                break;
                            }
                            cVar.onNext(poll);
                            j2++;
                        } else {
                            return;
                        }
                    }
                    if (j2 != j || !m153809a(this.f200953g, hVar.isEmpty(), cVar)) {
                        if (!(j2 == 0 || j == Long.MAX_VALUE)) {
                            this.f200955i.addAndGet(-j2);
                        }
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88472e
        public final int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.f200956j = true;
            return 2;
        }

        @Override // org.p4663a.AbstractC90214c
        public final void onError(Throwable th) {
            this.f200954h = th;
            this.f200953g = true;
            if (this.f200956j) {
                this.f200947a.onError(th);
            } else {
                m153808a();
            }
        }

        @Override // org.p4663a.AbstractC90214c, p4560f.p4561a.AbstractC88955l
        public final void onSubscribe(AbstractC90215d dVar) {
            if (EnumC88897f.validate(this.f200951e, dVar)) {
                this.f200951e = dVar;
                this.f200947a.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.p4663a.AbstractC90215d
        public final void request(long j) {
            if (!this.f200956j && EnumC88897f.validate(j)) {
                C88902d.m154098a(this.f200955i, j);
                m153808a();
            }
        }

        @Override // org.p4663a.AbstractC90214c
        public final void onNext(T t) {
            if (!this.f200948b.offer(t)) {
                this.f200951e.cancel();
                C88423c cVar = new C88423c("Buffer is full");
                try {
                    this.f200950d.mo8579a();
                } catch (Throwable th) {
                    C88422b.m153670a(th);
                    cVar.initCause(th);
                }
                onError(cVar);
            } else if (this.f200956j) {
                this.f200947a.onNext(null);
            } else {
                m153808a();
            }
        }

        /* renamed from: a */
        private boolean m153809a(boolean z, boolean z2, AbstractC90214c<? super T> cVar) {
            if (this.f200952f) {
                this.f200948b.clear();
                return true;
            } else if (!z) {
                return false;
            } else {
                if (!this.f200949c) {
                    Throwable th = this.f200954h;
                    if (th != null) {
                        this.f200948b.clear();
                        cVar.onError(th);
                        return true;
                    } else if (!z2) {
                        return false;
                    } else {
                        cVar.onComplete();
                        return true;
                    }
                } else if (!z2) {
                    return false;
                } else {
                    Throwable th2 = this.f200954h;
                    if (th2 != null) {
                        cVar.onError(th2);
                    } else {
                        cVar.onComplete();
                    }
                    return true;
                }
            }
        }

        C88566a(AbstractC90214c<? super T> cVar, int i, boolean z, boolean z2, AbstractC88428a aVar) {
            AbstractC88475h<T> bVar;
            this.f200947a = cVar;
            this.f200950d = aVar;
            this.f200949c = z2;
            if (z) {
                bVar = new C88851c<>(i);
            } else {
                bVar = new C88850b<>(i);
            }
            this.f200948b = bVar;
        }
    }

    @Override // p4560f.p4561a.AbstractC88924h
    /* renamed from: a */
    public final void mo17954a(AbstractC90214c<? super T> cVar) {
        this.f200799b.mo143201a((AbstractC88955l) new C88566a(cVar, this.f200943c, this.f200944d, this.f200945e, this.f200946f));
    }

    public C88565r(AbstractC88924h<T> hVar, int i, AbstractC88428a aVar) {
        super(hVar);
        this.f200943c = i;
        this.f200946f = aVar;
    }
}
