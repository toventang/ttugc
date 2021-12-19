package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import p4600h.C89391z;

/* renamed from: kotlinx.coroutines.t */
public final class C89694t extends AbstractC89580cb<JobSupport> implements AbstractC89677s {

    /* renamed from: a */
    public final AbstractC89695u f203467a;

    static {
        Covode.recordClassIndex(105788);
    }

    @Override // kotlinx.coroutines.internal.C89646l
    public final String toString() {
        return "ChildHandle[" + this.f203467a + ']';
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
        this.f203467a.mo143988a((AbstractC89591cm) this.f203312c);
    }

    @Override // kotlinx.coroutines.AbstractC89677s
    /* renamed from: b */
    public final boolean mo144147b(Throwable th) {
        return ((JobSupport) this.f203312c).mo143996c(th);
    }

    public C89694t(JobSupport jobSupport, AbstractC89695u uVar) {
        super(jobSupport);
        this.f203467a = uVar;
    }
}
