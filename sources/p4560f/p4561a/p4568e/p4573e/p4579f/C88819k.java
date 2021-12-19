package p4560f.p4561a.p4568e.p4573e.p4579f;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88413c;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4568e.p4570b.C88446a;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.e.f.k */
public final class C88819k<T> extends AbstractC88403ab<T> {

    /* renamed from: a */
    final Callable<? extends T> f201691a;

    static {
        Covode.recordClassIndex(104861);
    }

    public C88819k(Callable<? extends T> callable) {
        this.f201691a = callable;
    }

    @Override // p4560f.p4561a.AbstractC88403ab
    /* renamed from: a */
    public final void mo17955a(AbstractC88406ae<? super T> aeVar) {
        AbstractC88412b a = C88413c.m153658a(C88446a.f200696b);
        aeVar.onSubscribe(a);
        if (!a.isDisposed()) {
            try {
                Object obj = (Object) C88466b.m153697a(this.f201691a.call(), "The callable returned a null value");
                if (!a.isDisposed()) {
                    aeVar.onSuccess(obj);
                }
            } catch (Throwable th) {
                C88422b.m153670a(th);
                if (!a.isDisposed()) {
                    aeVar.onError(th);
                } else {
                    C88925a.m154178a(th);
                }
            }
        }
    }
}
