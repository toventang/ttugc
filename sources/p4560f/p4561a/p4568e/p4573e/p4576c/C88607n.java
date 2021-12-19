package p4560f.p4561a.p4568e.p4573e.p4576c;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88975p;
import p4560f.p4561a.AbstractC88977r;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4568e.p4570b.C88466b;

/* renamed from: f.a.e.e.c.n */
public final class C88607n<T, R> extends AbstractC88585a<T, R> {

    /* renamed from: b */
    final AbstractC88434g<? super T, ? extends R> f201036b;

    static {
        Covode.recordClassIndex(104649);
    }

    /* renamed from: f.a.e.e.c.n$a */
    static final class C88608a<T, R> implements AbstractC88412b, AbstractC88975p<T> {

        /* renamed from: a */
        final AbstractC88975p<? super R> f201037a;

        /* renamed from: b */
        final AbstractC88434g<? super T, ? extends R> f201038b;

        /* renamed from: c */
        AbstractC88412b f201039c;

        static {
            Covode.recordClassIndex(104650);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f201039c.isDisposed();
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onComplete() {
            this.f201037a.onComplete();
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            AbstractC88412b bVar = this.f201039c;
            this.f201039c = EnumC88441b.DISPOSED;
            bVar.dispose();
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onError(Throwable th) {
            this.f201037a.onError(th);
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onSubscribe(AbstractC88412b bVar) {
            if (EnumC88441b.validate(this.f201039c, bVar)) {
                this.f201039c = bVar;
                this.f201037a.onSubscribe(this);
            }
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onSuccess(T t) {
            try {
                this.f201037a.onSuccess(C88466b.m153697a(this.f201038b.apply(t), "The mapper returned a null item"));
            } catch (Throwable th) {
                C88422b.m153670a(th);
                this.f201037a.onError(th);
            }
        }

        C88608a(AbstractC88975p<? super R> pVar, AbstractC88434g<? super T, ? extends R> gVar) {
            this.f201037a = pVar;
            this.f201038b = gVar;
        }
    }

    @Override // p4560f.p4561a.AbstractC88973n
    /* renamed from: b */
    public final void mo143019b(AbstractC88975p<? super R> pVar) {
        this.f200998a.mo143239a(new C88608a(pVar, this.f201036b));
    }

    public C88607n(AbstractC88977r<T> rVar, AbstractC88434g<? super T, ? extends R> gVar) {
        super(rVar);
        this.f201036b = gVar;
    }
}
