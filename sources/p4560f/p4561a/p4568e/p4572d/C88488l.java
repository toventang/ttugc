package p4560f.p4561a.p4568e.p4572d;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88427d;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88424d;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.d.l */
public final class C88488l extends AtomicReference<AbstractC88412b> implements AbstractC88412b, AbstractC88427d {
    private static final long serialVersionUID = -7545121636549663526L;

    static {
        Covode.recordClassIndex(104530);
    }

    public final boolean hasCustomOnError() {
        return false;
    }

    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public final void dispose() {
        EnumC88441b.dispose(this);
    }

    @Override // p4560f.p4561a.AbstractC88427d
    public final void onComplete() {
        lazySet(EnumC88441b.DISPOSED);
    }

    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public final boolean isDisposed() {
        if (get() == EnumC88441b.DISPOSED) {
            return true;
        }
        return false;
    }

    @Override // p4560f.p4561a.AbstractC88427d
    public final void onSubscribe(AbstractC88412b bVar) {
        EnumC88441b.setOnce(this, bVar);
    }

    @Override // p4560f.p4561a.AbstractC88427d
    public final void onError(Throwable th) {
        lazySet(EnumC88441b.DISPOSED);
        C88925a.m154178a(new C88424d(th));
    }
}
