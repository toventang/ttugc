package p4560f.p4561a.p4568e.p4572d;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;

/* renamed from: f.a.e.d.t */
public final class C88496t<T> implements AbstractC88406ae<T> {

    /* renamed from: a */
    final AtomicReference<AbstractC88412b> f200755a;

    /* renamed from: b */
    final AbstractC88406ae<? super T> f200756b;

    static {
        Covode.recordClassIndex(104538);
    }

    @Override // p4560f.p4561a.AbstractC88406ae
    public final void onError(Throwable th) {
        this.f200756b.onError(th);
    }

    @Override // p4560f.p4561a.AbstractC88406ae
    public final void onSubscribe(AbstractC88412b bVar) {
        EnumC88441b.replace(this.f200755a, bVar);
    }

    @Override // p4560f.p4561a.AbstractC88406ae
    public final void onSuccess(T t) {
        this.f200756b.onSuccess(t);
    }

    public C88496t(AtomicReference<AbstractC88412b> atomicReference, AbstractC88406ae<? super T> aeVar) {
        this.f200755a = atomicReference;
        this.f200756b = aeVar;
    }
}
