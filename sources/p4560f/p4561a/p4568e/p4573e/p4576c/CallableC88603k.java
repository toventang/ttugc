package p4560f.p4561a.p4568e.p4573e.p4576c;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;
import p4560f.p4561a.AbstractC88973n;
import p4560f.p4561a.AbstractC88975p;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88413c;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4568e.p4570b.C88446a;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.e.c.k */
public final class CallableC88603k<T> extends AbstractC88973n<T> implements Callable<T> {

    /* renamed from: a */
    final Callable<? extends T> f201031a;

    static {
        Covode.recordClassIndex(104645);
    }

    @Override // java.util.concurrent.Callable
    public final T call() {
        return (T) this.f201031a.call();
    }

    public CallableC88603k(Callable<? extends T> callable) {
        this.f201031a = callable;
    }

    @Override // p4560f.p4561a.AbstractC88973n
    /* renamed from: b */
    public final void mo143019b(AbstractC88975p<? super T> pVar) {
        AbstractC88412b a = C88413c.m153658a(C88446a.f200696b);
        pVar.onSubscribe(a);
        if (!a.isDisposed()) {
            try {
                Object obj = (Object) this.f201031a.call();
                if (a.isDisposed()) {
                    return;
                }
                if (obj == 0) {
                    pVar.onComplete();
                } else {
                    pVar.onSuccess(obj);
                }
            } catch (Throwable th) {
                C88422b.m153670a(th);
                if (!a.isDisposed()) {
                    pVar.onError(th);
                } else {
                    C88925a.m154178a(th);
                }
            }
        }
    }
}
