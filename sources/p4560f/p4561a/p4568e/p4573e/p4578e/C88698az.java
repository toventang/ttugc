package p4560f.p4561a.p4568e.p4573e.p4578e;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88973n;
import p4560f.p4561a.AbstractC88975p;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.e.e.az */
public final class C88698az<T> extends AbstractC88973n<T> {

    /* renamed from: a */
    final AbstractC88984x<T> f201270a;

    static {
        Covode.recordClassIndex(104740);
    }

    /* renamed from: f.a.e.e.e.az$a */
    static final class C88699a<T> implements AbstractC88412b, AbstractC88986z<T> {

        /* renamed from: a */
        final AbstractC88975p<? super T> f201271a;

        /* renamed from: b */
        AbstractC88412b f201272b;

        /* renamed from: c */
        T f201273c;

        /* renamed from: d */
        boolean f201274d;

        static {
            Covode.recordClassIndex(104741);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            this.f201272b.dispose();
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f201272b.isDisposed();
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
            if (!this.f201274d) {
                this.f201274d = true;
                T t = this.f201273c;
                this.f201273c = null;
                if (t == null) {
                    this.f201271a.onComplete();
                } else {
                    this.f201271a.onSuccess(t);
                }
            }
        }

        C88699a(AbstractC88975p<? super T> pVar) {
            this.f201271a = pVar;
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            if (EnumC88441b.validate(this.f201272b, bVar)) {
                this.f201272b = bVar;
                this.f201271a.onSubscribe(this);
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            if (this.f201274d) {
                C88925a.m154178a(th);
                return;
            }
            this.f201274d = true;
            this.f201271a.onError(th);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onNext(T t) {
            if (!this.f201274d) {
                if (this.f201273c != null) {
                    this.f201274d = true;
                    this.f201272b.dispose();
                    this.f201271a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.f201273c = t;
            }
        }
    }

    public C88698az(AbstractC88984x<T> xVar) {
        this.f201270a = xVar;
    }

    @Override // p4560f.p4561a.AbstractC88973n
    /* renamed from: b */
    public final void mo143019b(AbstractC88975p<? super T> pVar) {
        this.f201270a.mo143062b(new C88699a(pVar));
    }
}
