package p4560f.p4561a.p4568e.p4573e.p4578e;

import com.bytedance.covode.number.Covode;
import java.util.Collection;
import java.util.concurrent.Callable;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4568e.p4569a.EnumC88442c;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4568e.p4572d.AbstractC88477a;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.e.e.m */
public final class C88773m<T, K> extends AbstractC88637a<T, T> {

    /* renamed from: b */
    final AbstractC88434g<? super T, K> f201559b;

    /* renamed from: c */
    final Callable<? extends Collection<? super K>> f201560c;

    static {
        Covode.recordClassIndex(104815);
    }

    /* renamed from: f.a.e.e.e.m$a */
    static final class C88774a<T, K> extends AbstractC88477a<T, T> {

        /* renamed from: f */
        final Collection<? super K> f201561f;

        /* renamed from: g */
        final AbstractC88434g<? super T, K> f201562g;

        static {
            Covode.recordClassIndex(104816);
        }

        @Override // p4560f.p4561a.p4568e.p4572d.AbstractC88477a, p4560f.p4561a.p4568e.p4571c.AbstractC88476i
        public final void clear() {
            this.f201561f.clear();
            super.clear();
        }

        @Override // p4560f.p4561a.p4568e.p4572d.AbstractC88477a, p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
            if (!this.f200719d) {
                this.f200719d = true;
                this.f201561f.clear();
                this.f200716a.onComplete();
            }
        }

        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
        public final T poll() {
            T t;
            do {
                t = (T) this.f200718c.poll();
                if (t == null) {
                    break;
                }
            } while (!this.f201561f.add((Object) C88466b.m153697a((Object) this.f201562g.apply(t), "The keySelector returned a null key")));
            return t;
        }

        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88472e
        public final int requestFusion(int i) {
            return mo142985a(i);
        }

        @Override // p4560f.p4561a.p4568e.p4572d.AbstractC88477a, p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            if (this.f200719d) {
                C88925a.m154178a(th);
                return;
            }
            this.f200719d = true;
            this.f201561f.clear();
            this.f200716a.onError(th);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onNext(T t) {
            if (!this.f200719d) {
                if (this.f200720e == 0) {
                    try {
                        if (this.f201561f.add(C88466b.m153697a((Object) this.f201562g.apply(t), "The keySelector returned a null key"))) {
                            this.f200716a.onNext(t);
                        }
                    } catch (Throwable th) {
                        mo142986a(th);
                    }
                } else {
                    this.f200716a.onNext(null);
                }
            }
        }

        C88774a(AbstractC88986z<? super T> zVar, AbstractC88434g<? super T, K> gVar, Collection<? super K> collection) {
            super(zVar);
            this.f201562g = gVar;
            this.f201561f = collection;
        }
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super T> zVar) {
        try {
            this.f201095a.mo143062b(new C88774a(zVar, this.f201559b, (Collection) C88466b.m153697a(this.f201560c.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            C88422b.m153670a(th);
            EnumC88442c.error(th, zVar);
        }
    }

    public C88773m(AbstractC88984x<T> xVar, AbstractC88434g<? super T, K> gVar, Callable<? extends Collection<? super K>> callable) {
        super(xVar);
        this.f201559b = gVar;
        this.f201560c = callable;
    }
}
