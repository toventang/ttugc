package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: kotlinx.coroutines.bw */
final class C89565bw extends AbstractC89669k {

    /* renamed from: a */
    private final AbstractC89172b<Throwable, C89391z> f203283a;

    static {
        Covode.recordClassIndex(105656);
    }

    public final String toString() {
        return "InvokeOnCancel[" + this.f203283a.getClass().getSimpleName() + '@' + Integer.toHexString(System.identityHashCode(this)) + ']';
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: h.f.a.b<? super java.lang.Throwable, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C89565bw(AbstractC89172b<? super Throwable, C89391z> bVar) {
        this.f203283a = bVar;
    }

    @Override // kotlinx.coroutines.AbstractC89670l
    /* renamed from: a */
    public final void mo144051a(Throwable th) {
        this.f203283a.invoke(th);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final /* synthetic */ C89391z invoke(Throwable th) {
        mo144051a(th);
        return C89391z.f203057a;
    }
}
