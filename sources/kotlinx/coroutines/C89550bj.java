package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import p4600h.C89391z;

/* renamed from: kotlinx.coroutines.bj */
public final class C89550bj extends AbstractC89583ce<AbstractC89568bz> {

    /* renamed from: a */
    private final AbstractC89548bh f203272a;

    static {
        Covode.recordClassIndex(105641);
    }

    @Override // kotlinx.coroutines.internal.C89646l
    public final String toString() {
        return "DisposeOnCompletion[" + this.f203272a + ']';
    }

    @Override // kotlinx.coroutines.AbstractC89503ad
    /* renamed from: a */
    public final void mo144029a(Throwable th) {
        this.f203272a.cQ_();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final /* synthetic */ C89391z invoke(Throwable th) {
        mo144029a(th);
        return C89391z.f203057a;
    }

    public C89550bj(AbstractC89568bz bzVar, AbstractC89548bh bhVar) {
        super(bzVar);
        this.f203272a = bhVar;
    }
}
