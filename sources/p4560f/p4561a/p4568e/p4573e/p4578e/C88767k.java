package p4560f.p4561a.p4568e.p4573e.p4578e;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4568e.p4569a.EnumC88442c;
import p4560f.p4561a.p4568e.p4570b.C88466b;

/* renamed from: f.a.e.e.e.k */
public final class C88767k<T> extends AbstractC88979t<T> {

    /* renamed from: a */
    final Callable<? extends AbstractC88984x<? extends T>> f201543a;

    static {
        Covode.recordClassIndex(104809);
    }

    public C88767k(Callable<? extends AbstractC88984x<? extends T>> callable) {
        this.f201543a = callable;
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super T> zVar) {
        try {
            ((AbstractC88984x) C88466b.m153697a(this.f201543a.call(), "null ObservableSource supplied")).mo143062b(zVar);
        } catch (Throwable th) {
            C88422b.m153670a(th);
            EnumC88442c.error(th, zVar);
        }
    }
}
