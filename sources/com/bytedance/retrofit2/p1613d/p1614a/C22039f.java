package com.bytedance.retrofit2.p1613d.p1614a;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.C22099u;
import java.util.Objects;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88417a;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: com.bytedance.retrofit2.d.a.f */
final class C22039f<T> extends AbstractC88979t<C22038e<T>> {

    /* renamed from: a */
    private final AbstractC88979t<C22099u<T>> f52058a;

    static {
        Covode.recordClassIndex(25729);
    }

    /* renamed from: com.bytedance.retrofit2.d.a.f$a */
    static class C22040a<R> implements AbstractC88986z<C22099u<R>> {

        /* renamed from: a */
        private final AbstractC88986z<? super C22038e<R>> f52059a;

        static {
            Covode.recordClassIndex(25730);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
            this.f52059a.onComplete();
        }

        C22040a(AbstractC88986z<? super C22038e<R>> zVar) {
            this.f52059a = zVar;
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            this.f52059a.onSubscribe(bVar);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final /* synthetic */ void onNext(Object obj) {
            C22099u uVar = (C22099u) obj;
            AbstractC88986z<? super C22038e<R>> zVar = this.f52059a;
            Objects.requireNonNull(uVar, "response == null");
            zVar.onNext(new C22038e(uVar, null));
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            try {
                AbstractC88986z<? super C22038e<R>> zVar = this.f52059a;
                if (th != null) {
                    zVar.onNext(new C22038e(null, th));
                    this.f52059a.onComplete();
                    return;
                }
                throw new NullPointerException("error == null");
            } catch (Throwable th2) {
                C88422b.m153670a(th2);
                C88925a.m154178a(new C88417a(th, th2));
            }
        }
    }

    C22039f(AbstractC88979t<C22099u<T>> tVar) {
        this.f52058a = tVar;
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super C22038e<T>> zVar) {
        this.f52058a.mo143062b(new C22040a(zVar));
    }
}
