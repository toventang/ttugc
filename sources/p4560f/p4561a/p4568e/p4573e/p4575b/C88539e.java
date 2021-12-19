package p4560f.p4561a.p4568e.p4573e.p4575b;

import com.bytedance.covode.number.Covode;
import org.p4663a.AbstractC90214c;
import org.p4663a.AbstractC90215d;
import p4560f.p4561a.AbstractC88924h;
import p4560f.p4561a.AbstractC88955l;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88437j;
import p4560f.p4561a.p4568e.p4583i.EnumC88894c;
import p4560f.p4561a.p4568e.p4583i.EnumC88897f;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.e.b.e */
public final class C88539e<T> extends AbstractC88514a<T, T> {

    /* renamed from: c */
    private final AbstractC88433f<? super AbstractC90215d> f200863c;

    /* renamed from: d */
    private final AbstractC88437j f200864d;

    /* renamed from: e */
    private final AbstractC88428a f200865e;

    static {
        Covode.recordClassIndex(104581);
    }

    /* renamed from: f.a.e.e.b.e$a */
    static final class C88540a<T> implements AbstractC88955l<T>, AbstractC90215d {

        /* renamed from: a */
        final AbstractC90214c<? super T> f200866a;

        /* renamed from: b */
        final AbstractC88433f<? super AbstractC90215d> f200867b;

        /* renamed from: c */
        final AbstractC88437j f200868c;

        /* renamed from: d */
        final AbstractC88428a f200869d;

        /* renamed from: e */
        AbstractC90215d f200870e;

        static {
            Covode.recordClassIndex(104582);
        }

        @Override // org.p4663a.AbstractC90214c
        public final void onComplete() {
            if (this.f200870e != EnumC88897f.CANCELLED) {
                this.f200866a.onComplete();
            }
        }

        @Override // org.p4663a.AbstractC90215d
        public final void cancel() {
            AbstractC90215d dVar = this.f200870e;
            if (dVar != EnumC88897f.CANCELLED) {
                this.f200870e = EnumC88897f.CANCELLED;
                try {
                    this.f200869d.mo8579a();
                } catch (Throwable th) {
                    C88422b.m153670a(th);
                    C88925a.m154178a(th);
                }
                dVar.cancel();
            }
        }

        @Override // org.p4663a.AbstractC90214c
        public final void onNext(T t) {
            this.f200866a.onNext(t);
        }

        @Override // org.p4663a.AbstractC90215d
        public final void request(long j) {
            this.f200870e.request(j);
        }

        @Override // org.p4663a.AbstractC90214c
        public final void onError(Throwable th) {
            if (this.f200870e != EnumC88897f.CANCELLED) {
                this.f200866a.onError(th);
            } else {
                C88925a.m154178a(th);
            }
        }

        @Override // org.p4663a.AbstractC90214c, p4560f.p4561a.AbstractC88955l
        public final void onSubscribe(AbstractC90215d dVar) {
            try {
                this.f200867b.accept(dVar);
                if (EnumC88897f.validate(this.f200870e, dVar)) {
                    this.f200870e = dVar;
                    this.f200866a.onSubscribe(this);
                }
            } catch (Throwable th) {
                C88422b.m153670a(th);
                dVar.cancel();
                this.f200870e = EnumC88897f.CANCELLED;
                EnumC88894c.error(th, this.f200866a);
            }
        }

        C88540a(AbstractC90214c<? super T> cVar, AbstractC88433f<? super AbstractC90215d> fVar, AbstractC88437j jVar, AbstractC88428a aVar) {
            this.f200866a = cVar;
            this.f200867b = fVar;
            this.f200869d = aVar;
            this.f200868c = jVar;
        }
    }

    @Override // p4560f.p4561a.AbstractC88924h
    /* renamed from: a */
    public final void mo17954a(AbstractC90214c<? super T> cVar) {
        this.f200799b.mo143201a((AbstractC88955l) new C88540a(cVar, this.f200863c, this.f200864d, this.f200865e));
    }

    public C88539e(AbstractC88924h<T> hVar, AbstractC88433f<? super AbstractC90215d> fVar, AbstractC88437j jVar, AbstractC88428a aVar) {
        super(hVar);
        this.f200863c = fVar;
        this.f200864d = jVar;
        this.f200865e = aVar;
    }
}
