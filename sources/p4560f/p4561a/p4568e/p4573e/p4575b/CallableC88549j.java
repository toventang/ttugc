package p4560f.p4561a.p4568e.p4573e.p4575b;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;
import org.p4663a.AbstractC90214c;
import p4560f.p4561a.AbstractC88924h;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4568e.p4583i.C88893b;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.e.b.j */
public final class CallableC88549j<T> extends AbstractC88924h<T> implements Callable<T> {

    /* renamed from: b */
    final Callable<? extends T> f200907b;

    static {
        Covode.recordClassIndex(104591);
    }

    @Override // java.util.concurrent.Callable
    public final T call() {
        return (T) C88466b.m153697a(this.f200907b.call(), "The callable returned a null value");
    }

    public CallableC88549j(Callable<? extends T> callable) {
        this.f200907b = callable;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: f.a.e.i.b */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p4560f.p4561a.AbstractC88924h
    /* renamed from: a */
    public final void mo17954a(AbstractC90214c<? super T> cVar) {
        C88893b bVar = new C88893b(cVar);
        cVar.onSubscribe(bVar);
        try {
            bVar.complete(C88466b.m153697a(this.f200907b.call(), "The callable returned a null value"));
        } catch (Throwable th) {
            C88422b.m153670a(th);
            if (bVar.isCancelled()) {
                C88925a.m154178a(th);
            } else {
                cVar.onError(th);
            }
        }
    }
}
