package p4560f.p4561a.p4568e.p4573e.p4579f;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4568e.p4569a.EnumC88442c;
import p4560f.p4561a.p4568e.p4570b.C88466b;

/* renamed from: f.a.e.e.f.i */
public final class C88815i<T> extends AbstractC88403ab<T> {

    /* renamed from: a */
    final Callable<? extends Throwable> f201684a;

    static {
        Covode.recordClassIndex(104857);
    }

    public C88815i(Callable<? extends Throwable> callable) {
        this.f201684a = callable;
    }

    @Override // p4560f.p4561a.AbstractC88403ab
    /* renamed from: a */
    public final void mo17955a(AbstractC88406ae<? super T> aeVar) {
        Throwable th;
        try {
            th = (Throwable) C88466b.m153697a(this.f201684a.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th2) {
            th = th2;
            C88422b.m153670a(th);
        }
        EnumC88442c.error(th, aeVar);
    }
}
