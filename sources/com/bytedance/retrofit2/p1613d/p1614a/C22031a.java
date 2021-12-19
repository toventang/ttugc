package com.bytedance.retrofit2.p1613d.p1614a;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.C22099u;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88417a;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: com.bytedance.retrofit2.d.a.a */
final class C22031a<T> extends AbstractC88979t<T> {

    /* renamed from: a */
    private final AbstractC88979t<C22099u<T>> f52045a;

    static {
        Covode.recordClassIndex(25721);
    }

    /* renamed from: com.bytedance.retrofit2.d.a.a$a */
    static class C22032a<R> implements AbstractC88986z<C22099u<R>> {

        /* renamed from: a */
        private final AbstractC88986z<? super R> f52046a;

        /* renamed from: b */
        private boolean f52047b;

        static {
            Covode.recordClassIndex(25722);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
            if (!this.f52047b) {
                this.f52046a.onComplete();
            }
        }

        C22032a(AbstractC88986z<? super R> zVar) {
            this.f52046a = zVar;
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            this.f52046a.onSubscribe(bVar);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            if (!this.f52047b) {
                this.f52046a.onError(th);
                return;
            }
            AssertionError assertionError = new AssertionError("This should never happen! Report as a bug with the full stacktrace.");
            assertionError.initCause(th);
            C88925a.m154178a(assertionError);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final /* synthetic */ void onNext(Object obj) {
            C22099u uVar = (C22099u) obj;
            if (uVar.f52261a.mo35845a()) {
                this.f52046a.onNext(uVar.f52262b);
                return;
            }
            this.f52047b = true;
            C22037d dVar = new C22037d(uVar);
            try {
                this.f52046a.onError(dVar);
            } catch (Throwable th) {
                C88422b.m153670a(th);
                C88925a.m154178a(new C88417a(dVar, th));
            }
        }
    }

    C22031a(AbstractC88979t<C22099u<T>> tVar) {
        this.f52045a = tVar;
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super T> zVar) {
        this.f52045a.mo143062b(new C22032a(zVar));
    }
}
