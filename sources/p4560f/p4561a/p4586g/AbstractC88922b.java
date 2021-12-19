package p4560f.p4561a.p4586g;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4568e.p4584j.C88904f;

/* renamed from: f.a.g.b */
public abstract class AbstractC88922b<T> implements AbstractC88412b, AbstractC88986z<T> {

    /* renamed from: d */
    final AtomicReference<AbstractC88412b> f201925d = new AtomicReference<>();

    static {
        Covode.recordClassIndex(104964);
    }

    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public final void dispose() {
        EnumC88441b.dispose(this.f201925d);
    }

    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public final boolean isDisposed() {
        if (this.f201925d.get() == EnumC88441b.DISPOSED) {
            return true;
        }
        return false;
    }

    @Override // p4560f.p4561a.AbstractC88986z
    public final void onSubscribe(AbstractC88412b bVar) {
        C88904f.m154103a(this.f201925d, bVar, getClass());
    }
}
