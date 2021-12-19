package p4560f.p4561a.p4568e.p4573e.p4575b;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicLong;
import org.p4663a.AbstractC90214c;
import org.p4663a.AbstractC90215d;
import p4560f.p4561a.AbstractC88924h;
import p4560f.p4561a.AbstractC88955l;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4568e.p4583i.EnumC88897f;
import p4560f.p4561a.p4568e.p4584j.C88902d;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.e.b.s */
public final class C88567s<T> extends AbstractC88514a<T, T> implements AbstractC88433f<T> {

    /* renamed from: c */
    final AbstractC88433f<? super T> f200957c = this;

    static {
        Covode.recordClassIndex(104609);
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(T t) {
    }

    /* renamed from: f.a.e.e.b.s$a */
    static final class C88568a<T> extends AtomicLong implements AbstractC88955l<T>, AbstractC90215d {
        private static final long serialVersionUID = -6246093802440953054L;

        /* renamed from: a */
        final AbstractC90214c<? super T> f200958a;

        /* renamed from: b */
        final AbstractC88433f<? super T> f200959b;

        /* renamed from: c */
        AbstractC90215d f200960c;

        /* renamed from: d */
        boolean f200961d;

        static {
            Covode.recordClassIndex(104610);
        }

        @Override // org.p4663a.AbstractC90215d
        public final void cancel() {
            this.f200960c.cancel();
        }

        @Override // org.p4663a.AbstractC90214c
        public final void onComplete() {
            if (!this.f200961d) {
                this.f200961d = true;
                this.f200958a.onComplete();
            }
        }

        @Override // org.p4663a.AbstractC90215d
        public final void request(long j) {
            if (EnumC88897f.validate(j)) {
                C88902d.m154098a(this, j);
            }
        }

        @Override // org.p4663a.AbstractC90214c
        public final void onError(Throwable th) {
            if (this.f200961d) {
                C88925a.m154178a(th);
                return;
            }
            this.f200961d = true;
            this.f200958a.onError(th);
        }

        @Override // org.p4663a.AbstractC90214c, p4560f.p4561a.AbstractC88955l
        public final void onSubscribe(AbstractC90215d dVar) {
            if (EnumC88897f.validate(this.f200960c, dVar)) {
                this.f200960c = dVar;
                this.f200958a.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.p4663a.AbstractC90214c
        public final void onNext(T t) {
            if (!this.f200961d) {
                if (get() != 0) {
                    this.f200958a.onNext(t);
                    C88902d.m154099b(this, 1);
                    return;
                }
                try {
                    this.f200959b.accept(t);
                } catch (Throwable th) {
                    C88422b.m153670a(th);
                    cancel();
                    onError(th);
                }
            }
        }

        C88568a(AbstractC90214c<? super T> cVar, AbstractC88433f<? super T> fVar) {
            this.f200958a = cVar;
            this.f200959b = fVar;
        }
    }

    public C88567s(AbstractC88924h<T> hVar) {
        super(hVar);
    }

    @Override // p4560f.p4561a.AbstractC88924h
    /* renamed from: a */
    public final void mo17954a(AbstractC90214c<? super T> cVar) {
        this.f200799b.mo143201a((AbstractC88955l) new C88568a(cVar, this.f200957c));
    }
}
