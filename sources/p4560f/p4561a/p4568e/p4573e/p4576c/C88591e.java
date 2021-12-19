package p4560f.p4561a.p4568e.p4573e.p4576c;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicInteger;
import p4560f.p4561a.AbstractC88975p;
import p4560f.p4561a.AbstractC88977r;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.e.c.e */
public final class C88591e<T> extends AbstractC88585a<T, T> {

    /* renamed from: b */
    final AbstractC88428a f201008b;

    static {
        Covode.recordClassIndex(104633);
    }

    /* renamed from: f.a.e.e.c.e$a */
    static final class C88592a<T> extends AtomicInteger implements AbstractC88412b, AbstractC88975p<T> {
        private static final long serialVersionUID = 4109457741734051389L;

        /* renamed from: a */
        final AbstractC88975p<? super T> f201009a;

        /* renamed from: b */
        final AbstractC88428a f201010b;

        /* renamed from: c */
        AbstractC88412b f201011c;

        static {
            Covode.recordClassIndex(104634);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f201011c.isDisposed();
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            this.f201011c.dispose();
            m153831a();
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onComplete() {
            this.f201009a.onComplete();
            m153831a();
        }

        /* renamed from: a */
        private void m153831a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f201010b.mo8579a();
                } catch (Throwable th) {
                    C88422b.m153670a(th);
                    C88925a.m154178a(th);
                }
            }
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onError(Throwable th) {
            this.f201009a.onError(th);
            m153831a();
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onSubscribe(AbstractC88412b bVar) {
            if (EnumC88441b.validate(this.f201011c, bVar)) {
                this.f201011c = bVar;
                this.f201009a.onSubscribe(this);
            }
        }

        @Override // p4560f.p4561a.AbstractC88975p
        public final void onSuccess(T t) {
            this.f201009a.onSuccess(t);
            m153831a();
        }

        C88592a(AbstractC88975p<? super T> pVar, AbstractC88428a aVar) {
            this.f201009a = pVar;
            this.f201010b = aVar;
        }
    }

    @Override // p4560f.p4561a.AbstractC88973n
    /* renamed from: b */
    public final void mo143019b(AbstractC88975p<? super T> pVar) {
        this.f200998a.mo143239a(new C88592a(pVar, this.f201008b));
    }

    public C88591e(AbstractC88977r<T> rVar, AbstractC88428a aVar) {
        super(rVar);
        this.f201008b = aVar;
    }
}
