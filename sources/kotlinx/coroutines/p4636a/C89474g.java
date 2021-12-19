package kotlinx.coroutines.p4636a;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.AbstractC89458a;
import kotlinx.coroutines.C89511aj;
import kotlinx.coroutines.C89579ca;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.AbstractC89127f;

/* renamed from: kotlinx.coroutines.a.g */
public class C89474g<E> extends AbstractC89458a<C89391z> implements AbstractC89473f<E>, AbstractC89492s<E> {

    /* renamed from: b */
    public final AbstractC89473f<E> f203194b;

    static {
        Covode.recordClassIndex(105563);
    }

    @Override // kotlinx.coroutines.p4636a.AbstractC89498y
    /* renamed from: b_ */
    public final boolean mo144063b_(Throwable th) {
        return this.f203194b.mo144063b_(th);
    }

    @Override // kotlinx.coroutines.AbstractC89568bz, kotlinx.coroutines.JobSupport, kotlinx.coroutines.AbstractC89458a
    /* renamed from: b */
    public final boolean mo143993b() {
        return super.mo143993b();
    }

    @Override // kotlinx.coroutines.AbstractC89458a
    /* renamed from: f */
    public final /* synthetic */ void mo144037f() {
        this.f203194b.mo144063b_(null);
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: b */
    public final void mo143992b(Throwable th) {
        this.f203194b.mo144076a(m155238a(th, (String) null));
        mo144000d(th);
    }

    @Override // kotlinx.coroutines.AbstractC89568bz, kotlinx.coroutines.p4636a.AbstractC89473f, kotlinx.coroutines.JobSupport
    /* renamed from: a */
    public final void mo143985a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C89579ca(mo144004g(), null, this);
        }
        mo143992b((Throwable) cancellationException);
    }

    @Override // kotlinx.coroutines.p4636a.AbstractC89498y
    /* renamed from: a */
    public final Object mo144060a(E e, AbstractC89124d<? super C89391z> dVar) {
        return this.f203194b.mo144060a(e, dVar);
    }

    @Override // kotlinx.coroutines.AbstractC89458a
    /* renamed from: a */
    public final void mo144032a(Throwable th, boolean z) {
        if (!this.f203194b.mo144063b_(th) && !z) {
            C89511aj.m155443a(getContext(), th);
        }
    }

    public C89474g(AbstractC89127f fVar, AbstractC89473f<E> fVar2, boolean z) {
        super(fVar, z);
        this.f203194b = fVar2;
    }
}
