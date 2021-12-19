package kotlinx.coroutines.p4636a;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.AbstractC89458a;
import kotlinx.coroutines.C89579ca;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.AbstractC89127f;

/* renamed from: kotlinx.coroutines.a.i */
public class C89477i<E> extends AbstractC89458a<C89391z> implements AbstractC89475h<E> {

    /* renamed from: b */
    public final AbstractC89475h<E> f203198b;

    static {
        Covode.recordClassIndex(105566);
    }

    @Override // kotlinx.coroutines.p4636a.AbstractC89498y
    /* renamed from: b_ */
    public final boolean mo144063b_(Throwable th) {
        return this.f203198b.mo144063b_(th);
    }

    @Override // kotlinx.coroutines.AbstractC89568bz, kotlinx.coroutines.JobSupport
    /* renamed from: o */
    public final /* synthetic */ void mo144011o() {
        mo143992b((Throwable) new C89579ca(mo144004g(), null, this));
    }

    @Override // kotlinx.coroutines.p4636a.AbstractC89494u
    /* renamed from: a */
    public final Object mo144038a(AbstractC89124d<? super C89463aa<? extends E>> dVar) {
        return this.f203198b.mo144038a(dVar);
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: b */
    public final void mo143992b(Throwable th) {
        CancellationException cancellationException = m155238a(th, (String) null);
        this.f203198b.mo144039a(cancellationException);
        mo144000d((Throwable) cancellationException);
    }

    @Override // kotlinx.coroutines.AbstractC89568bz, kotlinx.coroutines.p4636a.AbstractC89494u, kotlinx.coroutines.JobSupport
    /* renamed from: a */
    public final void mo143985a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C89579ca(mo144004g(), null, this);
        }
        mo143992b((Throwable) cancellationException);
    }

    public C89477i(AbstractC89127f fVar, AbstractC89475h<E> hVar) {
        super(fVar, true);
        this.f203198b = hVar;
    }

    @Override // kotlinx.coroutines.p4636a.AbstractC89498y
    /* renamed from: a */
    public final Object mo144060a(E e, AbstractC89124d<? super C89391z> dVar) {
        return this.f203198b.mo144060a(e, dVar);
    }
}
