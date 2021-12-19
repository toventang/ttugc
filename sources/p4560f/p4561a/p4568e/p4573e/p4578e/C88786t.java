package p4560f.p4561a.p4568e.p4573e.p4578e;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88973n;
import p4560f.p4561a.AbstractC88975p;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4568e.p4571c.AbstractC88470c;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.e.e.t */
public final class C88786t<T> extends AbstractC88973n<T> implements AbstractC88470c<T> {

    /* renamed from: a */
    final AbstractC88984x<T> f201600a;

    /* renamed from: b */
    final long f201601b = 0;

    static {
        Covode.recordClassIndex(104828);
    }

    /* renamed from: f.a.e.e.e.t$a */
    static final class C88787a<T> implements AbstractC88412b, AbstractC88986z<T> {

        /* renamed from: a */
        final AbstractC88975p<? super T> f201602a;

        /* renamed from: b */
        final long f201603b;

        /* renamed from: c */
        AbstractC88412b f201604c;

        /* renamed from: d */
        long f201605d;

        /* renamed from: e */
        boolean f201606e;

        static {
            Covode.recordClassIndex(104829);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            this.f201604c.dispose();
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f201604c.isDisposed();
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
            if (!this.f201606e) {
                this.f201606e = true;
                this.f201602a.onComplete();
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            if (EnumC88441b.validate(this.f201604c, bVar)) {
                this.f201604c = bVar;
                this.f201602a.onSubscribe(this);
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            if (this.f201606e) {
                C88925a.m154178a(th);
                return;
            }
            this.f201606e = true;
            this.f201602a.onError(th);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onNext(T t) {
            if (!this.f201606e) {
                long j = this.f201605d;
                if (j == this.f201603b) {
                    this.f201606e = true;
                    this.f201604c.dispose();
                    this.f201602a.onSuccess(t);
                    return;
                }
                this.f201605d = j + 1;
            }
        }

        C88787a(AbstractC88975p<? super T> pVar, long j) {
            this.f201602a = pVar;
            this.f201603b = j;
        }
    }

    @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88470c
    /* renamed from: a */
    public final AbstractC88979t<T> mo142983a() {
        return C88925a.m154171a(new C88784s(this.f201600a, this.f201601b, null, false));
    }

    public C88786t(AbstractC88984x<T> xVar) {
        this.f201600a = xVar;
    }

    @Override // p4560f.p4561a.AbstractC88973n
    /* renamed from: b */
    public final void mo143019b(AbstractC88975p<? super T> pVar) {
        this.f201600a.mo143062b(new C88787a(pVar, this.f201601b));
    }
}
