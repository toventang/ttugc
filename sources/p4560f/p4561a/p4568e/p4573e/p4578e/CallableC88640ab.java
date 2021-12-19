package p4560f.p4561a.p4568e.p4573e.p4578e;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4568e.p4572d.C88486j;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.e.e.ab */
public final class CallableC88640ab<T> extends AbstractC88979t<T> implements Callable<T> {

    /* renamed from: a */
    final Callable<? extends T> f201102a;

    static {
        Covode.recordClassIndex(104682);
    }

    @Override // java.util.concurrent.Callable
    public final T call() {
        return (T) C88466b.m153697a(this.f201102a.call(), "The callable returned a null value");
    }

    public CallableC88640ab(Callable<? extends T> callable) {
        this.f201102a = callable;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: f.a.e.d.j */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super T> zVar) {
        C88486j jVar = new C88486j(zVar);
        zVar.onSubscribe(jVar);
        if (!jVar.isDisposed()) {
            try {
                jVar.complete(C88466b.m153697a(this.f201102a.call(), "Callable returned null"));
            } catch (Throwable th) {
                C88422b.m153670a(th);
                if (!jVar.isDisposed()) {
                    zVar.onError(th);
                } else {
                    C88925a.m154178a(th);
                }
            }
        }
    }
}
