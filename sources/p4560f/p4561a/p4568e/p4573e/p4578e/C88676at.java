package p4560f.p4561a.p4568e.p4573e.p4578e;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicInteger;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4567d.AbstractC88432e;
import p4560f.p4561a.p4568e.p4569a.C88445f;

/* renamed from: f.a.e.e.e.at */
public final class C88676at<T> extends AbstractC88637a<T, T> {

    /* renamed from: b */
    final AbstractC88432e f201215b;

    static {
        Covode.recordClassIndex(104718);
    }

    /* renamed from: f.a.e.e.e.at$a */
    static final class C88677a<T> extends AtomicInteger implements AbstractC88986z<T> {
        private static final long serialVersionUID = -7098360935104053232L;

        /* renamed from: a */
        final AbstractC88986z<? super T> f201216a;

        /* renamed from: b */
        final C88445f f201217b;

        /* renamed from: c */
        final AbstractC88984x<? extends T> f201218c;

        /* renamed from: d */
        final AbstractC88432e f201219d;

        static {
            Covode.recordClassIndex(104719);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo143071a() {
            if (getAndIncrement() == 0) {
                int i = 1;
                do {
                    this.f201218c.mo143062b(this);
                    i = addAndGet(-i);
                } while (i != 0);
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
            try {
                if (this.f201219d.mo17930a()) {
                    this.f201216a.onComplete();
                } else {
                    mo143071a();
                }
            } catch (Throwable th) {
                C88422b.m153670a(th);
                this.f201216a.onError(th);
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            this.f201216a.onError(th);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onNext(T t) {
            this.f201216a.onNext(t);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            this.f201217b.replace(bVar);
        }

        C88677a(AbstractC88986z<? super T> zVar, AbstractC88432e eVar, C88445f fVar, AbstractC88984x<? extends T> xVar) {
            this.f201216a = zVar;
            this.f201217b = fVar;
            this.f201218c = xVar;
            this.f201219d = eVar;
        }
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super T> zVar) {
        C88445f fVar = new C88445f();
        zVar.onSubscribe(fVar);
        new C88677a(zVar, this.f201215b, fVar, this.f201095a).mo143071a();
    }

    public C88676at(AbstractC88979t<T> tVar, AbstractC88432e eVar) {
        super(tVar);
        this.f201215b = eVar;
    }
}
