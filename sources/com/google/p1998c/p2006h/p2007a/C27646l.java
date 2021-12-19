package com.google.p1998c.p2006h.p2007a;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27238h;
import com.google.p1998c.p1999a.C27245k;
import com.google.p1998c.p2006h.p2007a.AbstractC27650o;
import com.google.p1998c.p2006h.p2007a.AbstractRunnableC27618a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* renamed from: com.google.c.h.a.l */
public final class C27646l extends AbstractC27649n {
    static {
        Covode.recordClassIndex(33226);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.c.h.a.l$a */
    public static final class RunnableC27647a<V> implements Runnable {

        /* renamed from: a */
        final Future<V> f65044a;

        /* renamed from: b */
        final AbstractC27645k<? super V> f65045b;

        static {
            Covode.recordClassIndex(33227);
        }

        public final String toString() {
            return C27238h.m54215a(this).mo45325a(this.f65045b).toString();
        }

        public final void run() {
            try {
                this.f65045b.onSuccess(C27646l.m55297a((Future) this.f65044a));
            } catch (ExecutionException e) {
                this.f65045b.onFailure(e.getCause());
            } catch (Error | RuntimeException e2) {
                this.f65045b.onFailure(e2);
            }
        }

        RunnableC27647a(Future<V> future, AbstractC27645k<? super V> kVar) {
            this.f65044a = future;
            this.f65045b = kVar;
        }
    }

    /* renamed from: a */
    public static <V> AbstractFutureC27655q<V> m55295a(V v) {
        if (v == null) {
            return AbstractC27650o.C27652b.f65047a;
        }
        return new AbstractC27650o.C27652b(v);
    }

    /* renamed from: a */
    public static <V> AbstractFutureC27655q<V> m55296a(Throwable th) {
        C27245k.m54229a(th);
        return new AbstractC27650o.C27651a(th);
    }

    /* renamed from: a */
    public static <V> V m55297a(Future<V> future) {
        C27245k.m54245b(future.isDone(), "Future was expected to be done: %s", future);
        return (V) C27671y.m55319a(future);
    }

    /* renamed from: a */
    public static <V> void m55298a(AbstractFutureC27655q<V> qVar, AbstractC27645k<? super V> kVar, Executor executor) {
        C27245k.m54229a(kVar);
        qVar.mo5481a(new RunnableC27647a(qVar, kVar), executor);
    }

    /* renamed from: a */
    public static <V, X extends Throwable> AbstractFutureC27655q<V> m55294a(AbstractFutureC27655q<? extends V> qVar, Class<X> cls, AbstractC27637e<? super X, ? extends V> eVar, Executor executor) {
        AbstractRunnableC27618a.C27619a aVar = new AbstractRunnableC27618a.C27619a(qVar, cls, eVar);
        qVar.mo5481a(aVar, C27659u.m55306a(executor, aVar));
        return aVar;
    }
}
