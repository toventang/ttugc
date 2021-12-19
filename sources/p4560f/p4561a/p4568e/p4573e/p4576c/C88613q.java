package p4560f.p4561a.p4568e.p4573e.p4576c;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88975p;
import p4560f.p4561a.AbstractC88977r;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88417a;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4568e.p4570b.C88466b;

/* renamed from: f.a.e.e.c.q */
public final class C88613q<T> extends AbstractC88585a<T, T> {

    /* renamed from: b */
    final AbstractC88434g<? super Throwable, ? extends T> f201049b;

    static {
        Covode.recordClassIndex(104655);
    }

    /* renamed from: f.a.e.e.c.q$a */
    static final class C88614a<T> implements AbstractC88412b, AbstractC88975p<T> {

        /* renamed from: a */
        final AbstractC88975p<? super T> f201050a;

        /* renamed from: b */
        final AbstractC88434g<? super Throwable, ? extends T> f201051b;

        /* renamed from: c */
        AbstractC88412b f201052c;

        static {
            Covode.recordClassIndex(104656);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            this.f201052c.dispose();
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f201052c.isDisposed();
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onComplete() {
            this.f201050a.onComplete();
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onSuccess(T t) {
            this.f201050a.onSuccess(t);
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onSubscribe(AbstractC88412b bVar) {
            if (EnumC88441b.validate(this.f201052c, bVar)) {
                this.f201052c = bVar;
                this.f201050a.onSubscribe(this);
            }
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onError(Throwable th) {
            try {
                this.f201050a.onSuccess(C88466b.m153697a(this.f201051b.apply(th), "The valueSupplier returned a null value"));
            } catch (Throwable th2) {
                C88422b.m153670a(th2);
                this.f201050a.onError(new C88417a(th, th2));
            }
        }

        C88614a(AbstractC88975p<? super T> pVar, AbstractC88434g<? super Throwable, ? extends T> gVar) {
            this.f201050a = pVar;
            this.f201051b = gVar;
        }
    }

    @Override // p4560f.p4561a.AbstractC88973n
    /* renamed from: b */
    public final void mo143019b(AbstractC88975p<? super T> pVar) {
        this.f200998a.mo143239a(new C88614a(pVar, this.f201049b));
    }

    public C88613q(AbstractC88977r<T> rVar, AbstractC88434g<? super Throwable, ? extends T> gVar) {
        super(rVar);
        this.f201049b = gVar;
    }
}
