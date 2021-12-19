package p4560f.p4561a.p4568e.p4573e.p4575b;

import com.bytedance.covode.number.Covode;
import org.p4663a.AbstractC90214c;
import org.p4663a.AbstractC90215d;
import p4560f.p4561a.AbstractC88924h;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;

/* renamed from: f.a.e.e.b.k */
public final class C88550k<T> extends AbstractC88924h<T> {

    /* renamed from: b */
    private final AbstractC88979t<T> f200908b;

    static {
        Covode.recordClassIndex(104592);
    }

    /* renamed from: f.a.e.e.b.k$a */
    static final class C88551a<T> implements AbstractC88986z<T>, AbstractC90215d {

        /* renamed from: a */
        final AbstractC90214c<? super T> f200909a;

        /* renamed from: b */
        AbstractC88412b f200910b;

        static {
            Covode.recordClassIndex(104593);
        }

        @Override // org.p4663a.AbstractC90215d
        public final void request(long j) {
        }

        @Override // org.p4663a.AbstractC90215d
        public final void cancel() {
            this.f200910b.dispose();
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
            this.f200909a.onComplete();
        }

        C88551a(AbstractC90214c<? super T> cVar) {
            this.f200909a = cVar;
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            this.f200909a.onError(th);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onNext(T t) {
            this.f200909a.onNext(t);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            this.f200910b = bVar;
            this.f200909a.onSubscribe(this);
        }
    }

    public C88550k(AbstractC88979t<T> tVar) {
        this.f200908b = tVar;
    }

    @Override // p4560f.p4561a.AbstractC88924h
    /* renamed from: a */
    public final void mo17954a(AbstractC90214c<? super T> cVar) {
        this.f200908b.mo143062b((AbstractC88986z) new C88551a(cVar));
    }
}
