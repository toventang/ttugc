package p4560f.p4561a.p4568e.p4573e.p4578e;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4568e.p4569a.EnumC88442c;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4568e.p4571c.AbstractC88471d;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.e.e.ay */
public final class C88695ay {
    static {
        Covode.recordClassIndex(104737);
    }

    /* renamed from: f.a.e.e.e.ay$a */
    public static final class RunnableC88696a<T> extends AtomicInteger implements AbstractC88471d<T>, Runnable {
        private static final long serialVersionUID = 3880992722410194083L;

        /* renamed from: a */
        final AbstractC88986z<? super T> f201266a;

        /* renamed from: b */
        final T f201267b;

        static {
            Covode.recordClassIndex(104738);
        }

        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
        public final void clear() {
            lazySet(3);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            set(3);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            if (get() == 3) {
                return true;
            }
            return false;
        }

        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
        public final boolean isEmpty() {
            if (get() != 1) {
                return true;
            }
            return false;
        }

        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
        public final T poll() {
            if (get() != 1) {
                return null;
            }
            lazySet(3);
            return this.f201267b;
        }

        public final void run() {
            if (get() == 0 && compareAndSet(0, 2)) {
                this.f201266a.onNext(this.f201267b);
                if (get() == 2) {
                    lazySet(3);
                    this.f201266a.onComplete();
                }
            }
        }

        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88476i
        public final boolean offer(T t) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // p4560f.p4561a.p4568e.p4571c.AbstractC88472e
        public final int requestFusion(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            lazySet(1);
            return 1;
        }

        public RunnableC88696a(AbstractC88986z<? super T> zVar, T t) {
            this.f201266a = zVar;
            this.f201267b = t;
        }

        public final boolean offer(T t, T t2) {
            throw new UnsupportedOperationException("Should not be called!");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f.a.e.e.e.ay$b */
    public static final class C88697b<T, R> extends AbstractC88979t<R> {

        /* renamed from: a */
        final T f201268a;

        /* renamed from: b */
        final AbstractC88434g<? super T, ? extends AbstractC88984x<? extends R>> f201269b;

        static {
            Covode.recordClassIndex(104739);
        }

        @Override // p4560f.p4561a.AbstractC88979t
        /* renamed from: a */
        public final void mo17922a(AbstractC88986z<? super R> zVar) {
            try {
                AbstractC88984x xVar = (AbstractC88984x) C88466b.m153697a(this.f201269b.apply(this.f201268a), "The mapper returned a null ObservableSource");
                if (xVar instanceof Callable) {
                    try {
                        Object call = ((Callable) xVar).call();
                        if (call == null) {
                            EnumC88442c.complete(zVar);
                            return;
                        }
                        RunnableC88696a aVar = new RunnableC88696a(zVar, call);
                        zVar.onSubscribe(aVar);
                        aVar.run();
                    } catch (Throwable th) {
                        C88422b.m153670a(th);
                        EnumC88442c.error(th, zVar);
                    }
                } else {
                    xVar.mo143062b(zVar);
                }
            } catch (Throwable th2) {
                EnumC88442c.error(th2, zVar);
            }
        }

        C88697b(T t, AbstractC88434g<? super T, ? extends AbstractC88984x<? extends R>> gVar) {
            this.f201268a = t;
            this.f201269b = gVar;
        }
    }

    /* renamed from: a */
    public static <T, U> AbstractC88979t<U> m153918a(T t, AbstractC88434g<? super T, ? extends AbstractC88984x<? extends U>> gVar) {
        return C88925a.m154171a(new C88697b(t, gVar));
    }

    /* renamed from: a */
    public static <T, R> boolean m153919a(AbstractC88984x<T> xVar, AbstractC88986z<? super R> zVar, AbstractC88434g<? super T, ? extends AbstractC88984x<? extends R>> gVar) {
        if (!(xVar instanceof Callable)) {
            return false;
        }
        try {
            Object obj = (Object) ((Callable) xVar).call();
            if (obj == 0) {
                EnumC88442c.complete(zVar);
                return true;
            }
            try {
                AbstractC88984x xVar2 = (AbstractC88984x) C88466b.m153697a(gVar.apply(obj), "The mapper returned a null ObservableSource");
                if (xVar2 instanceof Callable) {
                    try {
                        Object call = ((Callable) xVar2).call();
                        if (call == null) {
                            EnumC88442c.complete(zVar);
                            return true;
                        }
                        RunnableC88696a aVar = new RunnableC88696a(zVar, call);
                        zVar.onSubscribe(aVar);
                        aVar.run();
                    } catch (Throwable th) {
                        C88422b.m153670a(th);
                        EnumC88442c.error(th, zVar);
                        return true;
                    }
                } else {
                    xVar2.mo143062b(zVar);
                }
                return true;
            } catch (Throwable th2) {
                C88422b.m153670a(th2);
                EnumC88442c.error(th2, zVar);
                return true;
            }
        } catch (Throwable th3) {
            C88422b.m153670a(th3);
            EnumC88442c.error(th3, zVar);
            return true;
        }
    }
}
