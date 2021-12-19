package p4560f.p4561a.p4592m;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicReference;
import org.p4663a.AbstractC90215d;
import p4560f.p4561a.AbstractC88955l;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4568e.p4583i.EnumC88897f;
import p4560f.p4561a.p4568e.p4584j.C88904f;

/* renamed from: f.a.m.a */
public abstract class AbstractC88971a<T> implements AbstractC88412b, AbstractC88955l<T> {

    /* renamed from: c */
    final AtomicReference<AbstractC90215d> f202052c = new AtomicReference<>();

    static {
        Covode.recordClassIndex(105013);
    }

    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public final void dispose() {
        EnumC88897f.cancel(this.f202052c);
    }

    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public final boolean isDisposed() {
        if (this.f202052c.get() == EnumC88897f.CANCELLED) {
            return true;
        }
        return false;
    }

    @Override // org.p4663a.AbstractC90214c, p4560f.p4561a.AbstractC88955l
    public final void onSubscribe(AbstractC90215d dVar) {
        AtomicReference<AbstractC90215d> atomicReference = this.f202052c;
        Class<?> cls = getClass();
        C88466b.m153697a((Object) dVar, "next is null");
        if (!atomicReference.compareAndSet(null, dVar)) {
            dVar.cancel();
            if (atomicReference.get() != EnumC88897f.CANCELLED) {
                C88904f.m154102a(cls);
                return;
            }
            return;
        }
        this.f202052c.get().request(Long.MAX_VALUE);
    }
}
