package p4560f.p4561a.p4568e.p4573e.p4578e;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88398aa;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4568e.p4571c.AbstractC88471d;
import p4560f.p4561a.p4568e.p4571c.AbstractC88476i;
import p4560f.p4561a.p4568e.p4572d.AbstractC88478b;
import p4560f.p4561a.p4568e.p4580f.C88851c;
import p4560f.p4561a.p4568e.p4581g.C88883p;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.e.e.ao */
public final class C88663ao<T> extends AbstractC88637a<T, T> {

    /* renamed from: b */
    final AbstractC88398aa f201163b;

    /* renamed from: c */
    final boolean f201164c = false;

    /* renamed from: d */
    final int f201165d;

    static {
        Covode.recordClassIndex(104705);
    }

    /* renamed from: f.a.e.e.e.ao$a */
    static final class RunnableC88664a<T> extends AbstractC88478b<T> implements AbstractC88986z<T>, Runnable {
        private static final long serialVersionUID = 6576896619930983584L;

        /* renamed from: a */
        final AbstractC88986z<? super T> f201166a;

        /* renamed from: b */
        final AbstractC88398aa.AbstractC88401c f201167b;

        /* renamed from: c */
        final boolean f201168c;

        /* renamed from: d */
        final int f201169d;

        /* renamed from: e */
        AbstractC88476i<T> f201170e;

        /* renamed from: f */
        AbstractC88412b f201171f;

        /* renamed from: g */
        Throwable f201172g;

        /* renamed from: h */
        volatile boolean f201173h;

        /* renamed from: i */
        volatile boolean f201174i;

        /* renamed from: j */
        int f201175j;

        /* renamed from: k */
        boolean f201176k;

        static {
            Covode.recordClassIndex(104706);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f201174i;
        }

        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
        public final void clear() {
            this.f201170e.clear();
        }

        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
        public final boolean isEmpty() {
            return this.f201170e.isEmpty();
        }

        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
        public final T poll() {
            return this.f201170e.poll();
        }

        /* renamed from: a */
        private void m153877a() {
            if (getAndIncrement() == 0) {
                this.f201167b.mo101910a(this);
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
            if (!this.f201173h) {
                this.f201173h = true;
                m153877a();
            }
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            if (!this.f201174i) {
                this.f201174i = true;
                this.f201171f.dispose();
                this.f201167b.dispose();
                if (getAndIncrement() == 0) {
                    this.f201170e.clear();
                }
            }
        }

        public final void run() {
            boolean z;
            if (this.f201176k) {
                int i = 1;
                while (!this.f201174i) {
                    boolean z2 = this.f201173h;
                    Throwable th = this.f201172g;
                    if (this.f201168c || !z2 || th == null) {
                        this.f201166a.onNext(null);
                        if (z2) {
                            this.f201174i = true;
                            Throwable th2 = this.f201172g;
                            if (th2 != null) {
                                this.f201166a.onError(th2);
                            } else {
                                this.f201166a.onComplete();
                            }
                            this.f201167b.dispose();
                            return;
                        }
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        this.f201174i = true;
                        this.f201166a.onError(this.f201172g);
                        this.f201167b.dispose();
                        return;
                    }
                }
                return;
            }
            AbstractC88476i<T> iVar = this.f201170e;
            AbstractC88986z<? super T> zVar = this.f201166a;
            int i2 = 1;
            while (!m153878a(this.f201173h, iVar.isEmpty(), zVar)) {
                while (true) {
                    boolean z3 = this.f201173h;
                    try {
                        T poll = iVar.poll();
                        if (poll == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (m153878a(z3, z, zVar)) {
                            return;
                        }
                        if (!z) {
                            zVar.onNext(poll);
                        } else {
                            i2 = addAndGet(-i2);
                            if (i2 == 0) {
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        C88422b.m153670a(th3);
                        this.f201174i = true;
                        this.f201171f.dispose();
                        iVar.clear();
                        zVar.onError(th3);
                        this.f201167b.dispose();
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
            this.f201176k = true;
            return 2;
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            if (this.f201173h) {
                C88925a.m154178a(th);
                return;
            }
            this.f201172g = th;
            this.f201173h = true;
            m153877a();
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onNext(T t) {
            if (!this.f201173h) {
                if (this.f201175j != 2) {
                    this.f201170e.offer(t);
                }
                m153877a();
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            if (EnumC88441b.validate(this.f201171f, bVar)) {
                this.f201171f = bVar;
                if (bVar instanceof AbstractC88471d) {
                    AbstractC88471d dVar = (AbstractC88471d) bVar;
                    int requestFusion = dVar.requestFusion(7);
                    if (requestFusion == 1) {
                        this.f201175j = requestFusion;
                        this.f201170e = dVar;
                        this.f201173h = true;
                        this.f201166a.onSubscribe(this);
                        m153877a();
                        return;
                    } else if (requestFusion == 2) {
                        this.f201175j = requestFusion;
                        this.f201170e = dVar;
                        this.f201166a.onSubscribe(this);
                        return;
                    }
                }
                this.f201170e = new C88851c(this.f201169d);
                this.f201166a.onSubscribe(this);
            }
        }

        /* renamed from: a */
        private boolean m153878a(boolean z, boolean z2, AbstractC88986z<? super T> zVar) {
            if (this.f201174i) {
                this.f201170e.clear();
                return true;
            } else if (!z) {
                return false;
            } else {
                Throwable th = this.f201172g;
                if (this.f201168c) {
                    if (!z2) {
                        return false;
                    }
                    this.f201174i = true;
                    if (th != null) {
                        zVar.onError(th);
                    } else {
                        zVar.onComplete();
                    }
                    this.f201167b.dispose();
                    return true;
                } else if (th != null) {
                    this.f201174i = true;
                    this.f201170e.clear();
                    zVar.onError(th);
                    this.f201167b.dispose();
                    return true;
                } else if (!z2) {
                    return false;
                } else {
                    this.f201174i = true;
                    zVar.onComplete();
                    this.f201167b.dispose();
                    return true;
                }
            }
        }

        RunnableC88664a(AbstractC88986z<? super T> zVar, AbstractC88398aa.AbstractC88401c cVar, boolean z, int i) {
            this.f201166a = zVar;
            this.f201167b = cVar;
            this.f201168c = z;
            this.f201169d = i;
        }
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super T> zVar) {
        AbstractC88398aa aaVar = this.f201163b;
        if (aaVar instanceof C88883p) {
            this.f201095a.mo143062b(zVar);
            return;
        }
        this.f201095a.mo143062b(new RunnableC88664a(zVar, aaVar.mo20704a(), this.f201164c, this.f201165d));
    }

    public C88663ao(AbstractC88984x<T> xVar, AbstractC88398aa aaVar, int i) {
        super(xVar);
        this.f201163b = aaVar;
        this.f201165d = i;
    }
}
