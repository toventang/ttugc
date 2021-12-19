package p4560f.p4561a.p4568e.p4573e.p4578e;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88417a;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4568e.p4569a.C88445f;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.e.e.ap */
public final class C88665ap<T> extends AbstractC88637a<T, T> {

    /* renamed from: b */
    final AbstractC88434g<? super Throwable, ? extends AbstractC88984x<? extends T>> f201177b;

    /* renamed from: c */
    final boolean f201178c;

    static {
        Covode.recordClassIndex(104707);
    }

    /* renamed from: f.a.e.e.e.ap$a */
    static final class C88666a<T> implements AbstractC88986z<T> {

        /* renamed from: a */
        final AbstractC88986z<? super T> f201179a;

        /* renamed from: b */
        final AbstractC88434g<? super Throwable, ? extends AbstractC88984x<? extends T>> f201180b;

        /* renamed from: c */
        final boolean f201181c;

        /* renamed from: d */
        final C88445f f201182d = new C88445f();

        /* renamed from: e */
        boolean f201183e;

        /* renamed from: f */
        boolean f201184f;

        static {
            Covode.recordClassIndex(104708);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
            if (!this.f201184f) {
                this.f201184f = true;
                this.f201183e = true;
                this.f201179a.onComplete();
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            this.f201182d.replace(bVar);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onNext(T t) {
            if (!this.f201184f) {
                this.f201179a.onNext(t);
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            if (!this.f201183e) {
                this.f201183e = true;
                if (!this.f201181c || (th instanceof Exception)) {
                    try {
                        AbstractC88984x xVar = (AbstractC88984x) this.f201180b.apply(th);
                        if (xVar == null) {
                            NullPointerException nullPointerException = new NullPointerException("Observable is null");
                            nullPointerException.initCause(th);
                            this.f201179a.onError(nullPointerException);
                            return;
                        }
                        xVar.mo143062b(this);
                    } catch (Throwable th2) {
                        C88422b.m153670a(th2);
                        this.f201179a.onError(new C88417a(th, th2));
                    }
                } else {
                    this.f201179a.onError(th);
                }
            } else if (this.f201184f) {
                C88925a.m154178a(th);
            } else {
                this.f201179a.onError(th);
            }
        }

        C88666a(AbstractC88986z<? super T> zVar, AbstractC88434g<? super Throwable, ? extends AbstractC88984x<? extends T>> gVar, boolean z) {
            this.f201179a = zVar;
            this.f201180b = gVar;
            this.f201181c = z;
        }
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super T> zVar) {
        C88666a aVar = new C88666a(zVar, this.f201177b, this.f201178c);
        zVar.onSubscribe(aVar.f201182d);
        this.f201095a.mo143062b(aVar);
    }

    public C88665ap(AbstractC88984x<T> xVar, AbstractC88434g<? super Throwable, ? extends AbstractC88984x<? extends T>> gVar, boolean z) {
        super(xVar);
        this.f201177b = gVar;
        this.f201178c = z;
    }
}
