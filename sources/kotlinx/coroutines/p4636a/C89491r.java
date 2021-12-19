package kotlinx.coroutines.p4636a;

import com.bytedance.covode.number.Covode;
import kotlinx.coroutines.C89511aj;
import p4600h.p4603c.AbstractC89127f;

/* renamed from: kotlinx.coroutines.a.r */
public final class C89491r<E> extends C89477i<E> implements AbstractC89492s<E> {
    static {
        Covode.recordClassIndex(105580);
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.AbstractC89458a, kotlinx.coroutines.AbstractC89568bz
    /* renamed from: b */
    public final boolean mo143993b() {
        return super.mo143993b();
    }

    @Override // kotlinx.coroutines.AbstractC89458a
    /* renamed from: f */
    public final /* synthetic */ void mo144037f() {
        ((C89477i) this).f203198b.mo144063b_(null);
    }

    public C89491r(AbstractC89127f fVar, AbstractC89475h<E> hVar) {
        super(fVar, hVar);
    }

    @Override // kotlinx.coroutines.AbstractC89458a
    /* renamed from: a */
    public final void mo144032a(Throwable th, boolean z) {
        if (!((C89477i) this).f203198b.mo144063b_(th) && !z) {
            C89511aj.m155443a(getContext(), th);
        }
    }
}
