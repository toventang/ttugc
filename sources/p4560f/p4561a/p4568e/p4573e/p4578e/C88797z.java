package p4560f.p4561a.p4568e.p4573e.p4578e;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.e.e.z */
public final class C88797z<T, R> extends AbstractC88637a<T, R> {

    /* renamed from: b */
    final AbstractC88434g<? super T, ? extends Iterable<? extends R>> f201647b;

    static {
        Covode.recordClassIndex(104839);
    }

    /* renamed from: f.a.e.e.e.z$a */
    static final class C88798a<T, R> implements AbstractC88412b, AbstractC88986z<T> {

        /* renamed from: a */
        final AbstractC88986z<? super R> f201648a;

        /* renamed from: b */
        final AbstractC88434g<? super T, ? extends Iterable<? extends R>> f201649b;

        /* renamed from: c */
        AbstractC88412b f201650c;

        static {
            Covode.recordClassIndex(104840);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f201650c.isDisposed();
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            this.f201650c.dispose();
            this.f201650c = EnumC88441b.DISPOSED;
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
            if (this.f201650c != EnumC88441b.DISPOSED) {
                this.f201650c = EnumC88441b.DISPOSED;
                this.f201648a.onComplete();
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            if (EnumC88441b.validate(this.f201650c, bVar)) {
                this.f201650c = bVar;
                this.f201648a.onSubscribe(this);
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            if (this.f201650c == EnumC88441b.DISPOSED) {
                C88925a.m154178a(th);
                return;
            }
            this.f201650c = EnumC88441b.DISPOSED;
            this.f201648a.onError(th);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onNext(T t) {
            if (this.f201650c != EnumC88441b.DISPOSED) {
                try {
                    AbstractC88986z<? super R> zVar = this.f201648a;
                    for (T t2 : (Iterable) this.f201649b.apply(t)) {
                        try {
                            try {
                                zVar.onNext((Object) C88466b.m153697a((Object) t2, "The iterator returned a null value"));
                            } catch (Throwable th) {
                                C88422b.m153670a(th);
                                this.f201650c.dispose();
                                onError(th);
                                return;
                            }
                        } catch (Throwable th2) {
                            C88422b.m153670a(th2);
                            this.f201650c.dispose();
                            onError(th2);
                            return;
                        }
                    }
                } catch (Throwable th3) {
                    C88422b.m153670a(th3);
                    this.f201650c.dispose();
                    onError(th3);
                }
            }
        }

        C88798a(AbstractC88986z<? super R> zVar, AbstractC88434g<? super T, ? extends Iterable<? extends R>> gVar) {
            this.f201648a = zVar;
            this.f201649b = gVar;
        }
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super R> zVar) {
        this.f201095a.mo143062b(new C88798a(zVar, this.f201647b));
    }

    public C88797z(AbstractC88984x<T> xVar, AbstractC88434g<? super T, ? extends Iterable<? extends R>> gVar) {
        super(xVar);
        this.f201647b = gVar;
    }
}
