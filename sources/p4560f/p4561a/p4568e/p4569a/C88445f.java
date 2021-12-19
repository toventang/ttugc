package p4560f.p4561a.p4568e.p4569a;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.p4565b.AbstractC88412b;

/* renamed from: f.a.e.a.f */
public final class C88445f extends AtomicReference<AbstractC88412b> implements AbstractC88412b {
    private static final long serialVersionUID = -754898800686245608L;

    static {
        Covode.recordClassIndex(104487);
    }

    public C88445f() {
    }

    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public final void dispose() {
        EnumC88441b.dispose(this);
    }

    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public final boolean isDisposed() {
        return EnumC88441b.isDisposed((AbstractC88412b) get());
    }

    public C88445f(AbstractC88412b bVar) {
        lazySet(bVar);
    }

    public final boolean replace(AbstractC88412b bVar) {
        return EnumC88441b.replace(this, bVar);
    }

    public final boolean update(AbstractC88412b bVar) {
        return EnumC88441b.set(this, bVar);
    }
}
