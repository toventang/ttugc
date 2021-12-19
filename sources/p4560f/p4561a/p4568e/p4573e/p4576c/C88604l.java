package p4560f.p4561a.p4568e.p4573e.p4576c;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88410b;
import p4560f.p4561a.AbstractC88427d;
import p4560f.p4561a.AbstractC88975p;
import p4560f.p4561a.AbstractC88977r;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;

/* renamed from: f.a.e.e.c.l */
public final class C88604l<T> extends AbstractC88410b {

    /* renamed from: a */
    final AbstractC88977r<T> f201032a;

    static {
        Covode.recordClassIndex(104646);
    }

    /* renamed from: f.a.e.e.c.l$a */
    static final class C88605a<T> implements AbstractC88412b, AbstractC88975p<T> {

        /* renamed from: a */
        final AbstractC88427d f201033a;

        /* renamed from: b */
        AbstractC88412b f201034b;

        static {
            Covode.recordClassIndex(104647);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f201034b.isDisposed();
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            this.f201034b.dispose();
            this.f201034b = EnumC88441b.DISPOSED;
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onComplete() {
            this.f201034b = EnumC88441b.DISPOSED;
            this.f201033a.onComplete();
        }

        C88605a(AbstractC88427d dVar) {
            this.f201033a = dVar;
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onError(Throwable th) {
            this.f201034b = EnumC88441b.DISPOSED;
            this.f201033a.onError(th);
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onSubscribe(AbstractC88412b bVar) {
            if (EnumC88441b.validate(this.f201034b, bVar)) {
                this.f201034b = bVar;
                this.f201033a.onSubscribe(this);
            }
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onSuccess(T t) {
            this.f201034b = EnumC88441b.DISPOSED;
            this.f201033a.onComplete();
        }
    }

    public C88604l(AbstractC88977r<T> rVar) {
        this.f201032a = rVar;
    }

    @Override // p4560f.p4561a.AbstractC88410b
    /* renamed from: b */
    public final void mo142942b(AbstractC88427d dVar) {
        this.f201032a.mo143239a(new C88605a(dVar));
    }
}
