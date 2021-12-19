package p4560f.p4561a.p4568e.p4573e.p4576c;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88975p;
import p4560f.p4561a.AbstractC88977r;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88417a;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4568e.p4569a.EnumC88442c;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.e.c.r */
public final class C88615r<T> extends AbstractC88585a<T, T> {

    /* renamed from: b */
    final AbstractC88433f<? super AbstractC88412b> f201053b;

    /* renamed from: c */
    final AbstractC88433f<? super T> f201054c;

    /* renamed from: d */
    final AbstractC88433f<? super Throwable> f201055d;

    /* renamed from: e */
    final AbstractC88428a f201056e;

    /* renamed from: f */
    final AbstractC88428a f201057f;

    /* renamed from: g */
    final AbstractC88428a f201058g;

    static {
        Covode.recordClassIndex(104657);
    }

    /* renamed from: f.a.e.e.c.r$a */
    static final class C88616a<T> implements AbstractC88412b, AbstractC88975p<T> {

        /* renamed from: a */
        final AbstractC88975p<? super T> f201059a;

        /* renamed from: b */
        final C88615r<T> f201060b;

        /* renamed from: c */
        AbstractC88412b f201061c;

        static {
            Covode.recordClassIndex(104658);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f201061c.isDisposed();
        }

        /* renamed from: a */
        private void m153845a() {
            try {
                this.f201060b.f201057f.mo8579a();
            } catch (Throwable th) {
                C88422b.m153670a(th);
                C88925a.m154178a(th);
            }
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            try {
                this.f201060b.f201058g.mo8579a();
            } catch (Throwable th) {
                C88422b.m153670a(th);
                C88925a.m154178a(th);
            }
            this.f201061c.dispose();
            this.f201061c = EnumC88441b.DISPOSED;
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onComplete() {
            if (this.f201061c != EnumC88441b.DISPOSED) {
                try {
                    this.f201060b.f201056e.mo8579a();
                    this.f201061c = EnumC88441b.DISPOSED;
                    this.f201059a.onComplete();
                    m153845a();
                } catch (Throwable th) {
                    C88422b.m153670a(th);
                    m153846a(th);
                }
            }
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onError(Throwable th) {
            if (this.f201061c == EnumC88441b.DISPOSED) {
                C88925a.m154178a(th);
            } else {
                m153846a(th);
            }
        }

        /* renamed from: a */
        private void m153846a(Throwable th) {
            try {
                this.f201060b.f201055d.accept(th);
            } catch (Throwable th2) {
                C88422b.m153670a(th2);
                th = new C88417a(th, th2);
            }
            this.f201061c = EnumC88441b.DISPOSED;
            this.f201059a.onError(th);
            m153845a();
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onSubscribe(AbstractC88412b bVar) {
            if (EnumC88441b.validate(this.f201061c, bVar)) {
                try {
                    this.f201060b.f201053b.accept(bVar);
                    this.f201061c = bVar;
                    this.f201059a.onSubscribe(this);
                } catch (Throwable th) {
                    C88422b.m153670a(th);
                    bVar.dispose();
                    this.f201061c = EnumC88441b.DISPOSED;
                    EnumC88442c.error(th, this.f201059a);
                }
            }
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onSuccess(T t) {
            if (this.f201061c != EnumC88441b.DISPOSED) {
                try {
                    this.f201060b.f201054c.accept(t);
                    this.f201061c = EnumC88441b.DISPOSED;
                    this.f201059a.onSuccess(t);
                    m153845a();
                } catch (Throwable th) {
                    C88422b.m153670a(th);
                    m153846a(th);
                }
            }
        }

        C88616a(AbstractC88975p<? super T> pVar, C88615r<T> rVar) {
            this.f201059a = pVar;
            this.f201060b = rVar;
        }
    }

    @Override // p4560f.p4561a.AbstractC88973n
    /* renamed from: b */
    public final void mo143019b(AbstractC88975p<? super T> pVar) {
        this.f200998a.mo143239a(new C88616a(pVar, this));
    }

    public C88615r(AbstractC88977r<T> rVar, AbstractC88433f<? super AbstractC88412b> fVar, AbstractC88433f<? super T> fVar2, AbstractC88433f<? super Throwable> fVar3, AbstractC88428a aVar, AbstractC88428a aVar2, AbstractC88428a aVar3) {
        super(rVar);
        this.f201053b = fVar;
        this.f201054c = fVar2;
        this.f201055d = fVar3;
        this.f201056e = aVar;
        this.f201057f = aVar2;
        this.f201058g = aVar3;
    }
}
