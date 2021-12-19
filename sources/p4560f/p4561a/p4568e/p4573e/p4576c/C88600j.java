package p4560f.p4561a.p4568e.p4573e.p4576c;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88975p;
import p4560f.p4561a.AbstractC88977r;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4568e.p4570b.C88466b;

/* renamed from: f.a.e.e.c.j */
public final class C88600j<T, R> extends AbstractC88585a<T, R> {

    /* renamed from: b */
    final AbstractC88434g<? super T, ? extends AbstractC88977r<? extends R>> f201026b;

    static {
        Covode.recordClassIndex(104642);
    }

    /* renamed from: f.a.e.e.c.j$a */
    static final class C88601a<T, R> extends AtomicReference<AbstractC88412b> implements AbstractC88412b, AbstractC88975p<T> {
        private static final long serialVersionUID = 4375739915521278546L;

        /* renamed from: a */
        final AbstractC88975p<? super R> f201027a;

        /* renamed from: b */
        final AbstractC88434g<? super T, ? extends AbstractC88977r<? extends R>> f201028b;

        /* renamed from: c */
        AbstractC88412b f201029c;

        static {
            Covode.recordClassIndex(104643);
        }

        /* renamed from: f.a.e.e.c.j$a$a */
        final class C88602a implements AbstractC88975p<R> {
            static {
                Covode.recordClassIndex(104644);
            }

            @Override // p4560f.p4561a.AbstractC88975p
            public final void onComplete() {
                C88601a.this.f201027a.onComplete();
            }

            C88602a() {
            }

            @Override // p4560f.p4561a.AbstractC88975p
            public final void onError(Throwable th) {
                C88601a.this.f201027a.onError(th);
            }

            @Override // p4560f.p4561a.AbstractC88975p
            public final void onSubscribe(AbstractC88412b bVar) {
                EnumC88441b.setOnce(C88601a.this, bVar);
            }

            @Override // p4560f.p4561a.AbstractC88975p
            public final void onSuccess(R r) {
                C88601a.this.f201027a.onSuccess(r);
            }
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onComplete() {
            this.f201027a.onComplete();
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            EnumC88441b.dispose(this);
            this.f201029c.dispose();
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return EnumC88441b.isDisposed((AbstractC88412b) get());
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onError(Throwable th) {
            this.f201027a.onError(th);
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onSubscribe(AbstractC88412b bVar) {
            if (EnumC88441b.validate(this.f201029c, bVar)) {
                this.f201029c = bVar;
                this.f201027a.onSubscribe(this);
            }
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onSuccess(T t) {
            try {
                AbstractC88977r rVar = (AbstractC88977r) C88466b.m153697a(this.f201028b.apply(t), "The mapper returned a null MaybeSource");
                if (!isDisposed()) {
                    rVar.mo143239a(new C88602a());
                }
            } catch (Exception e) {
                C88422b.m153670a(e);
                this.f201027a.onError(e);
            }
        }

        C88601a(AbstractC88975p<? super R> pVar, AbstractC88434g<? super T, ? extends AbstractC88977r<? extends R>> gVar) {
            this.f201027a = pVar;
            this.f201028b = gVar;
        }
    }

    @Override // p4560f.p4561a.AbstractC88973n
    /* renamed from: b */
    public final void mo143019b(AbstractC88975p<? super R> pVar) {
        this.f200998a.mo143239a(new C88601a(pVar, this.f201026b));
    }

    public C88600j(AbstractC88977r<T> rVar, AbstractC88434g<? super T, ? extends AbstractC88977r<? extends R>> gVar) {
        super(rVar);
        this.f201026b = gVar;
    }
}
