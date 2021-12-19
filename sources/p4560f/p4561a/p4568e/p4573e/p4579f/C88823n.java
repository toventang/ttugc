package p4560f.p4561a.p4568e.p4573e.p4579f;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.p4568e.p4569a.EnumC88442c;

/* renamed from: f.a.e.e.f.n */
public final class C88823n<T> extends AbstractC88403ab<T> {

    /* renamed from: a */
    final T f201696a;

    static {
        Covode.recordClassIndex(104865);
    }

    public C88823n(T t) {
        this.f201696a = t;
    }

    @Override // p4560f.p4561a.AbstractC88403ab
    /* renamed from: a */
    public final void mo17955a(AbstractC88406ae<? super T> aeVar) {
        aeVar.onSubscribe(EnumC88442c.INSTANCE);
        aeVar.onSuccess(this.f201696a);
    }
}
