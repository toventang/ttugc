package p4560f.p4561a.p4568e.p4573e.p4578e;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88417a;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.e.e.q */
public final class C88781q<T> extends AbstractC88637a<T, T> {

    /* renamed from: b */
    final AbstractC88433f<? super T> f201577b;

    /* renamed from: c */
    final AbstractC88433f<? super Throwable> f201578c;

    /* renamed from: d */
    final AbstractC88428a f201579d;

    /* renamed from: e */
    final AbstractC88428a f201580e;

    static {
        Covode.recordClassIndex(104823);
    }

    /* renamed from: f.a.e.e.e.q$a */
    static final class C88782a<T> implements AbstractC88412b, AbstractC88986z<T> {

        /* renamed from: a */
        final AbstractC88986z<? super T> f201581a;

        /* renamed from: b */
        final AbstractC88433f<? super T> f201582b;

        /* renamed from: c */
        final AbstractC88433f<? super Throwable> f201583c;

        /* renamed from: d */
        final AbstractC88428a f201584d;

        /* renamed from: e */
        final AbstractC88428a f201585e;

        /* renamed from: f */
        AbstractC88412b f201586f;

        /* renamed from: g */
        boolean f201587g;

        static {
            Covode.recordClassIndex(104824);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            this.f201586f.dispose();
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f201586f.isDisposed();
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
            if (!this.f201587g) {
                try {
                    this.f201584d.mo8579a();
                    this.f201587g = true;
                    this.f201581a.onComplete();
                    try {
                        this.f201585e.mo8579a();
                    } catch (Throwable th) {
                        C88422b.m153670a(th);
                        C88925a.m154178a(th);
                    }
                } catch (Throwable th2) {
                    C88422b.m153670a(th2);
                    onError(th2);
                }
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            if (EnumC88441b.validate(this.f201586f, bVar)) {
                this.f201586f = bVar;
                this.f201581a.onSubscribe(this);
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onNext(T t) {
            if (!this.f201587g) {
                try {
                    this.f201582b.accept(t);
                    this.f201581a.onNext(t);
                } catch (Throwable th) {
                    C88422b.m153670a(th);
                    this.f201586f.dispose();
                    onError(th);
                }
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            if (this.f201587g) {
                C88925a.m154178a(th);
                return;
            }
            this.f201587g = true;
            try {
                this.f201583c.accept(th);
            } catch (Throwable th2) {
                C88422b.m153670a(th2);
                th = new C88417a(th, th2);
            }
            this.f201581a.onError(th);
            try {
                this.f201585e.mo8579a();
            } catch (Throwable th3) {
                C88422b.m153670a(th3);
                C88925a.m154178a(th3);
            }
        }

        C88782a(AbstractC88986z<? super T> zVar, AbstractC88433f<? super T> fVar, AbstractC88433f<? super Throwable> fVar2, AbstractC88428a aVar, AbstractC88428a aVar2) {
            this.f201581a = zVar;
            this.f201582b = fVar;
            this.f201583c = fVar2;
            this.f201584d = aVar;
            this.f201585e = aVar2;
        }
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super T> zVar) {
        this.f201095a.mo143062b(new C88782a(zVar, this.f201577b, this.f201578c, this.f201579d, this.f201580e));
    }

    public C88781q(AbstractC88984x<T> xVar, AbstractC88433f<? super T> fVar, AbstractC88433f<? super Throwable> fVar2, AbstractC88428a aVar, AbstractC88428a aVar2) {
        super(xVar);
        this.f201577b = fVar;
        this.f201578c = fVar2;
        this.f201579d = aVar;
        this.f201580e = aVar2;
    }
}
