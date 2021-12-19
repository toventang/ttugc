package p4560f.p4561a.p4586g;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88427d;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4568e.p4584j.C88904f;

/* renamed from: f.a.g.a */
public abstract class AbstractC88921a implements AbstractC88412b, AbstractC88427d {

    /* renamed from: b */
    final AtomicReference<AbstractC88412b> f201924b = new AtomicReference<>();

    static {
        Covode.recordClassIndex(104963);
    }

    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public final void dispose() {
        EnumC88441b.dispose(this.f201924b);
    }

    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public final boolean isDisposed() {
        if (this.f201924b.get() == EnumC88441b.DISPOSED) {
            return true;
        }
        return false;
    }

    @Override // p4560f.p4561a.AbstractC88427d
    public final void onSubscribe(AbstractC88412b bVar) {
        C88904f.m154103a(this.f201924b, bVar, getClass());
    }
}
