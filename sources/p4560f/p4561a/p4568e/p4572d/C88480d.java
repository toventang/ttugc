package p4560f.p4561a.p4568e.p4572d;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88417a;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4567d.AbstractC88429b;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.d.d */
public final class C88480d<T> extends AtomicReference<AbstractC88412b> implements AbstractC88406ae<T>, AbstractC88412b {
    private static final long serialVersionUID = 4943102778943297569L;

    /* renamed from: a */
    final AbstractC88429b<? super T, ? super Throwable> f200721a;

    static {
        Covode.recordClassIndex(104522);
    }

    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public final void dispose() {
        EnumC88441b.dispose(this);
    }

    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public final boolean isDisposed() {
        if (get() == EnumC88441b.DISPOSED) {
            return true;
        }
        return false;
    }

    @Override // p4560f.p4561a.AbstractC88406ae
    public final void onSubscribe(AbstractC88412b bVar) {
        EnumC88441b.setOnce(this, bVar);
    }

    public C88480d(AbstractC88429b<? super T, ? super Throwable> bVar) {
        this.f200721a = bVar;
    }

    @Override // p4560f.p4561a.AbstractC88406ae
    public final void onSuccess(T t) {
        try {
            lazySet(EnumC88441b.DISPOSED);
            this.f200721a.mo10350a(t, null);
        } catch (Throwable th) {
            C88422b.m153670a(th);
            C88925a.m154178a(th);
        }
    }

    @Override // p4560f.p4561a.AbstractC88406ae
    public final void onError(Throwable th) {
        try {
            lazySet(EnumC88441b.DISPOSED);
            this.f200721a.mo10350a(null, th);
        } catch (Throwable th2) {
            C88422b.m153670a(th2);
            C88925a.m154178a(new C88417a(th, th2));
        }
    }
}
