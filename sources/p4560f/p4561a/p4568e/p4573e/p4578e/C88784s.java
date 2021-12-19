package p4560f.p4561a.p4568e.p4573e.p4578e;

import com.bytedance.covode.number.Covode;
import java.util.NoSuchElementException;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.e.e.s */
public final class C88784s<T> extends AbstractC88637a<T, T> {

    /* renamed from: b */
    final long f201590b;

    /* renamed from: c */
    final T f201591c;

    /* renamed from: d */
    final boolean f201592d;

    static {
        Covode.recordClassIndex(104826);
    }

    /* renamed from: f.a.e.e.e.s$a */
    static final class C88785a<T> implements AbstractC88412b, AbstractC88986z<T> {

        /* renamed from: a */
        final AbstractC88986z<? super T> f201593a;

        /* renamed from: b */
        final long f201594b;

        /* renamed from: c */
        final T f201595c;

        /* renamed from: d */
        final boolean f201596d;

        /* renamed from: e */
        AbstractC88412b f201597e;

        /* renamed from: f */
        long f201598f;

        /* renamed from: g */
        boolean f201599g;

        static {
            Covode.recordClassIndex(104827);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            this.f201597e.dispose();
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f201597e.isDisposed();
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
            if (!this.f201599g) {
                this.f201599g = true;
                T t = this.f201595c;
                if (t != null) {
                    this.f201593a.onNext(t);
                } else if (this.f201596d) {
                    this.f201593a.onError(new NoSuchElementException());
                    return;
                }
                this.f201593a.onComplete();
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            if (EnumC88441b.validate(this.f201597e, bVar)) {
                this.f201597e = bVar;
                this.f201593a.onSubscribe(this);
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            if (this.f201599g) {
                C88925a.m154178a(th);
                return;
            }
            this.f201599g = true;
            this.f201593a.onError(th);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onNext(T t) {
            if (!this.f201599g) {
                long j = this.f201598f;
                if (j == this.f201594b) {
                    this.f201599g = true;
                    this.f201597e.dispose();
                    this.f201593a.onNext(t);
                    this.f201593a.onComplete();
                    return;
                }
                this.f201598f = j + 1;
            }
        }

        C88785a(AbstractC88986z<? super T> zVar, long j, T t, boolean z) {
            this.f201593a = zVar;
            this.f201594b = j;
            this.f201595c = t;
            this.f201596d = z;
        }
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super T> zVar) {
        this.f201095a.mo143062b(new C88785a(zVar, this.f201590b, this.f201591c, this.f201592d));
    }

    public C88784s(AbstractC88984x<T> xVar, long j, T t, boolean z) {
        super(xVar);
        this.f201590b = j;
        this.f201591c = t;
        this.f201592d = z;
    }
}
