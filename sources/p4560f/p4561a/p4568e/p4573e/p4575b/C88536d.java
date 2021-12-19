package p4560f.p4561a.p4568e.p4573e.p4575b;

import com.bytedance.covode.number.Covode;
import org.p4663a.AbstractC90214c;
import p4560f.p4561a.AbstractC88924h;
import p4560f.p4561a.AbstractC88955l;
import p4560f.p4561a.p4566c.C88417a;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4568e.p4571c.AbstractC88468a;
import p4560f.p4561a.p4568e.p4582h.AbstractC88888a;
import p4560f.p4561a.p4568e.p4582h.AbstractC88889b;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.e.b.d */
public final class C88536d<T> extends AbstractC88514a<T, T> {

    /* renamed from: c */
    final AbstractC88433f<? super T> f200851c;

    /* renamed from: d */
    final AbstractC88433f<? super Throwable> f200852d;

    /* renamed from: e */
    final AbstractC88428a f200853e;

    /* renamed from: f */
    final AbstractC88428a f200854f;

    static {
        Covode.recordClassIndex(104578);
    }

    /* renamed from: f.a.e.e.b.d$a */
    static final class C88537a<T> extends AbstractC88888a<T, T> {

        /* renamed from: a */
        final AbstractC88433f<? super T> f200855a;

        /* renamed from: b */
        final AbstractC88433f<? super Throwable> f200856b;

        /* renamed from: c */
        final AbstractC88428a f200857c;

        /* renamed from: d */
        final AbstractC88428a f200858d;

        static {
            Covode.recordClassIndex(104579);
        }

        @Override // org.p4663a.AbstractC90214c, p4560f.p4561a.p4568e.p4582h.AbstractC88888a
        public final void onComplete() {
            if (!this.f201876h) {
                try {
                    this.f200857c.mo8579a();
                    this.f201876h = true;
                    this.f201873e.onComplete();
                    try {
                        this.f200858d.mo8579a();
                    } catch (Throwable th) {
                        C88422b.m153670a(th);
                        C88925a.m154178a(th);
                    }
                } catch (Throwable th2) {
                    mo143156a(th2);
                }
            }
        }

        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
        public final T poll() {
            try {
                T t = (T) this.f201875g.poll();
                if (t != null) {
                    try {
                        this.f200855a.accept(t);
                        this.f200858d.mo8579a();
                    } catch (Throwable th) {
                        throw new C88417a(th, th);
                    }
                } else if (this.f201877i == 1) {
                    this.f200857c.mo8579a();
                    this.f200858d.mo8579a();
                }
                return t;
            } catch (Throwable th2) {
                throw new C88417a(th, th2);
            }
        }

        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88472e
        public final int requestFusion(int i) {
            return mo143155a(i);
        }

        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88468a
        /* renamed from: a */
        public final boolean mo142981a(T t) {
            if (this.f201876h) {
                return false;
            }
            try {
                this.f200855a.accept(t);
                return this.f201873e.mo142981a(t);
            } catch (Throwable th) {
                mo143156a(th);
                return false;
            }
        }

        @Override // org.p4663a.AbstractC90214c
        public final void onNext(T t) {
            if (!this.f201876h) {
                if (this.f201877i != 0) {
                    this.f201873e.onNext(null);
                    return;
                }
                try {
                    this.f200855a.accept(t);
                    this.f201873e.onNext(t);
                } catch (Throwable th) {
                    mo143156a(th);
                }
            }
        }

        @Override // org.p4663a.AbstractC90214c, p4560f.p4561a.p4568e.p4582h.AbstractC88888a
        public final void onError(Throwable th) {
            if (this.f201876h) {
                C88925a.m154178a(th);
                return;
            }
            this.f201876h = true;
            try {
                this.f200856b.accept(th);
                this.f201873e.onError(th);
            } catch (Throwable th2) {
                C88422b.m153670a(th2);
                this.f201873e.onError(new C88417a(th, th2));
            }
            try {
                this.f200858d.mo8579a();
            } catch (Throwable th3) {
                C88422b.m153670a(th3);
                C88925a.m154178a(th3);
            }
        }

        C88537a(AbstractC88468a<? super T> aVar, AbstractC88433f<? super T> fVar, AbstractC88433f<? super Throwable> fVar2, AbstractC88428a aVar2, AbstractC88428a aVar3) {
            super(aVar);
            this.f200855a = fVar;
            this.f200856b = fVar2;
            this.f200857c = aVar2;
            this.f200858d = aVar3;
        }
    }

    /* renamed from: f.a.e.e.b.d$b */
    static final class C88538b<T> extends AbstractC88889b<T, T> {

        /* renamed from: a */
        final AbstractC88433f<? super T> f200859a;

        /* renamed from: b */
        final AbstractC88433f<? super Throwable> f200860b;

        /* renamed from: c */
        final AbstractC88428a f200861c;

        /* renamed from: d */
        final AbstractC88428a f200862d;

        static {
            Covode.recordClassIndex(104580);
        }

        @Override // org.p4663a.AbstractC90214c, p4560f.p4561a.p4568e.p4582h.AbstractC88889b
        public final void onComplete() {
            if (!this.f201881h) {
                try {
                    this.f200861c.mo8579a();
                    this.f201881h = true;
                    this.f201878e.onComplete();
                    try {
                        this.f200862d.mo8579a();
                    } catch (Throwable th) {
                        C88422b.m153670a(th);
                        C88925a.m154178a(th);
                    }
                } catch (Throwable th2) {
                    mo143158a(th2);
                }
            }
        }

        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
        public final T poll() {
            try {
                T t = (T) this.f201880g.poll();
                if (t != null) {
                    try {
                        this.f200859a.accept(t);
                        this.f200862d.mo8579a();
                    } catch (Throwable th) {
                        throw new C88417a(th, th);
                    }
                } else if (this.f201882i == 1) {
                    this.f200861c.mo8579a();
                    this.f200862d.mo8579a();
                }
                return t;
            } catch (Throwable th2) {
                throw new C88417a(th, th2);
            }
        }

        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88472e
        public final int requestFusion(int i) {
            return mo143157a(i);
        }

        @Override // org.p4663a.AbstractC90214c
        public final void onNext(T t) {
            if (!this.f201881h) {
                if (this.f201882i != 0) {
                    this.f201878e.onNext(null);
                    return;
                }
                try {
                    this.f200859a.accept(t);
                    this.f201878e.onNext(t);
                } catch (Throwable th) {
                    mo143158a(th);
                }
            }
        }

        @Override // org.p4663a.AbstractC90214c, p4560f.p4561a.p4568e.p4582h.AbstractC88889b
        public final void onError(Throwable th) {
            if (this.f201881h) {
                C88925a.m154178a(th);
                return;
            }
            this.f201881h = true;
            try {
                this.f200860b.accept(th);
                this.f201878e.onError(th);
            } catch (Throwable th2) {
                C88422b.m153670a(th2);
                this.f201878e.onError(new C88417a(th, th2));
            }
            try {
                this.f200862d.mo8579a();
            } catch (Throwable th3) {
                C88422b.m153670a(th3);
                C88925a.m154178a(th3);
            }
        }

        C88538b(AbstractC90214c<? super T> cVar, AbstractC88433f<? super T> fVar, AbstractC88433f<? super Throwable> fVar2, AbstractC88428a aVar, AbstractC88428a aVar2) {
            super(cVar);
            this.f200859a = fVar;
            this.f200860b = fVar2;
            this.f200861c = aVar;
            this.f200862d = aVar2;
        }
    }

    @Override // p4560f.p4561a.AbstractC88924h
    /* renamed from: a */
    public final void mo17954a(AbstractC90214c<? super T> cVar) {
        if (cVar instanceof AbstractC88468a) {
            this.f200799b.mo143201a((AbstractC88955l) new C88537a((AbstractC88468a) cVar, this.f200851c, this.f200852d, this.f200853e, this.f200854f));
        } else {
            this.f200799b.mo143201a((AbstractC88955l) new C88538b(cVar, this.f200851c, this.f200852d, this.f200853e, this.f200854f));
        }
    }

    public C88536d(AbstractC88924h<T> hVar, AbstractC88433f<? super T> fVar, AbstractC88433f<? super Throwable> fVar2, AbstractC88428a aVar, AbstractC88428a aVar2) {
        super(hVar);
        this.f200851c = fVar;
        this.f200852d = fVar2;
        this.f200853e = aVar;
        this.f200854f = aVar2;
    }
}
