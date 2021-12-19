package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import kotlinx.coroutines.internal.C89646l;
import p4600h.C89391z;

/* renamed from: kotlinx.coroutines.cn */
public final class C89592cn extends AbstractC89669k {

    /* renamed from: a */
    private final C89646l f203323a;

    static {
        Covode.recordClassIndex(105683);
    }

    public final String toString() {
        return "RemoveOnCancel[" + this.f203323a + ']';
    }

    public C89592cn(C89646l lVar) {
        this.f203323a = lVar;
    }

    @Override // kotlinx.coroutines.AbstractC89670l
    /* renamed from: a */
    public final void mo144051a(Throwable th) {
        this.f203323a.cR_();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final /* synthetic */ C89391z invoke(Throwable th) {
        mo144051a(th);
        return C89391z.f203057a;
    }
}
