package p4560f.p4561a.p4568e.p4573e.p4578e;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4568e.p4569a.EnumC88442c;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4568e.p4572d.AbstractC88479c;

/* renamed from: f.a.e.e.e.ad */
public final class C88642ad<T> extends AbstractC88979t<T> {

    /* renamed from: a */
    final Iterable<? extends T> f201106a;

    static {
        Covode.recordClassIndex(104684);
    }

    /* renamed from: f.a.e.e.e.ad$a */
    static final class C88643a<T> extends AbstractC88479c<T> {

        /* renamed from: a */
        final AbstractC88986z<? super T> f201107a;

        /* renamed from: b */
        final Iterator<? extends T> f201108b;

        /* renamed from: c */
        volatile boolean f201109c;

        /* renamed from: d */
        boolean f201110d;

        /* renamed from: e */
        boolean f201111e;

        /* renamed from: f */
        boolean f201112f;

        static {
            Covode.recordClassIndex(104685);
        }

        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
        public final void clear() {
            this.f201111e = true;
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            this.f201109c = true;
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f201109c;
        }

        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
        public final boolean isEmpty() {
            return this.f201111e;
        }

        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
        public final T poll() {
            if (this.f201111e) {
                return null;
            }
            if (!this.f201112f) {
                this.f201112f = true;
            } else if (!this.f201108b.hasNext()) {
                this.f201111e = true;
                return null;
            }
            return (T) C88466b.m153697a(this.f201108b.next(), "The iterator returned a null value");
        }

        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88472e
        public final int requestFusion(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.f201110d = true;
            return 1;
        }

        C88643a(AbstractC88986z<? super T> zVar, Iterator<? extends T> it) {
            this.f201107a = zVar;
            this.f201108b = it;
        }
    }

    public C88642ad(Iterable<? extends T> iterable) {
        this.f201106a = iterable;
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super T> zVar) {
        try {
            Iterator<? extends T> it = this.f201106a.iterator();
            try {
                if (!it.hasNext()) {
                    EnumC88442c.complete(zVar);
                    return;
                }
                C88643a aVar = new C88643a(zVar, it);
                zVar.onSubscribe(aVar);
                if (!aVar.f201110d) {
                    while (!aVar.isDisposed()) {
                        try {
                            aVar.f201107a.onNext(C88466b.m153697a(aVar.f201108b.next(), "The iterator returned a null value"));
                            if (!aVar.isDisposed()) {
                                try {
                                    if (!aVar.f201108b.hasNext()) {
                                        if (!aVar.isDisposed()) {
                                            aVar.f201107a.onComplete();
                                            return;
                                        }
                                        return;
                                    }
                                } catch (Throwable th) {
                                    C88422b.m153670a(th);
                                    aVar.f201107a.onError(th);
                                    return;
                                }
                            } else {
                                return;
                            }
                        } catch (Throwable th2) {
                            C88422b.m153670a(th2);
                            aVar.f201107a.onError(th2);
                            return;
                        }
                    }
                }
            } catch (Throwable th3) {
                C88422b.m153670a(th3);
                EnumC88442c.error(th3, zVar);
            }
        } catch (Throwable th4) {
            C88422b.m153670a(th4);
            EnumC88442c.error(th4, zVar);
        }
    }
}
