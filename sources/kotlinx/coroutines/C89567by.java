package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: kotlinx.coroutines.by */
final class C89567by extends AbstractC89583ce<AbstractC89568bz> {

    /* renamed from: a */
    private final AbstractC89172b<Throwable, C89391z> f203286a;

    static {
        Covode.recordClassIndex(105658);
    }

    @Override // kotlinx.coroutines.internal.C89646l
    public final String toString() {
        return "InvokeOnCompletion[" + getClass().getSimpleName() + '@' + Integer.toHexString(System.identityHashCode(this)) + ']';
    }

    @Override // kotlinx.coroutines.AbstractC89503ad
    /* renamed from: a */
    public final void mo144029a(Throwable th) {
        this.f203286a.invoke(th);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final /* synthetic */ C89391z invoke(Throwable th) {
        mo144029a(th);
        return C89391z.f203057a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.b<? super java.lang.Throwable, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C89567by(AbstractC89568bz bzVar, AbstractC89172b<? super Throwable, C89391z> bVar) {
        super(bzVar);
        this.f203286a = bVar;
    }
}
