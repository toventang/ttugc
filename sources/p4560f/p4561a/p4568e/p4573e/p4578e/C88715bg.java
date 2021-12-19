package p4560f.p4561a.p4568e.p4573e.p4578e;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4568e.p4569a.EnumC88442c;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.e.e.bg */
public final class C88715bg<T> extends AbstractC88637a<T, T> {

    /* renamed from: b */
    final long f201324b;

    static {
        Covode.recordClassIndex(104757);
    }

    /* renamed from: f.a.e.e.e.bg$a */
    static final class C88716a<T> implements AbstractC88412b, AbstractC88986z<T> {

        /* renamed from: a */
        final AbstractC88986z<? super T> f201325a;

        /* renamed from: b */
        boolean f201326b;

        /* renamed from: c */
        AbstractC88412b f201327c;

        /* renamed from: d */
        long f201328d;

        static {
            Covode.recordClassIndex(104758);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            this.f201327c.dispose();
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f201327c.isDisposed();
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
            if (!this.f201326b) {
                this.f201326b = true;
                this.f201327c.dispose();
                this.f201325a.onComplete();
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            if (this.f201326b) {
                C88925a.m154178a(th);
                return;
            }
            this.f201326b = true;
            this.f201327c.dispose();
            this.f201325a.onError(th);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onNext(T t) {
            boolean z;
            if (!this.f201326b) {
                long j = this.f201328d;
                long j2 = j - 1;
                this.f201328d = j2;
                if (j > 0) {
                    if (j2 == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.f201325a.onNext(t);
                    if (z) {
                        onComplete();
                    }
                }
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            if (EnumC88441b.validate(this.f201327c, bVar)) {
                this.f201327c = bVar;
                if (this.f201328d == 0) {
                    this.f201326b = true;
                    bVar.dispose();
                    EnumC88442c.complete(this.f201325a);
                    return;
                }
                this.f201325a.onSubscribe(this);
            }
        }

        C88716a(AbstractC88986z<? super T> zVar, long j) {
            this.f201325a = zVar;
            this.f201328d = j;
        }
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super T> zVar) {
        this.f201095a.mo143062b(new C88716a(zVar, this.f201324b));
    }

    public C88715bg(AbstractC88984x<T> xVar, long j) {
        super(xVar);
        this.f201324b = j;
    }
}
