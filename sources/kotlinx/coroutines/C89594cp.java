package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import p4600h.C89379q;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;

/* renamed from: kotlinx.coroutines.cp */
final class C89594cp extends AbstractC89583ce<AbstractC89568bz> {

    /* renamed from: a */
    private final AbstractC89124d<C89391z> f203325a;

    static {
        Covode.recordClassIndex(105685);
    }

    @Override // kotlinx.coroutines.internal.C89646l
    public final String toString() {
        return "ResumeOnCompletion[" + this.f203325a + ']';
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final /* synthetic */ C89391z invoke(Throwable th) {
        mo144029a(th);
        return C89391z.f203057a;
    }

    @Override // kotlinx.coroutines.AbstractC89503ad
    /* renamed from: a */
    public final void mo144029a(Throwable th) {
        this.f203325a.resumeWith(C89379q.m157068constructorimpl(C89391z.f203057a));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.c.d<? super h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C89594cp(AbstractC89568bz bzVar, AbstractC89124d<? super C89391z> dVar) {
        super(bzVar);
        this.f203325a = dVar;
    }
}
