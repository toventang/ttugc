package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Future;
import p4600h.C89391z;

/* renamed from: kotlinx.coroutines.j */
final class C89668j extends AbstractC89669k {

    /* renamed from: a */
    private final Future<?> f203420a;

    static {
        Covode.recordClassIndex(105761);
    }

    public final String toString() {
        return "CancelFutureOnCancel[" + this.f203420a + ']';
    }

    public C89668j(Future<?> future) {
        this.f203420a = future;
    }

    @Override // kotlinx.coroutines.AbstractC89670l
    /* renamed from: a */
    public final void mo144051a(Throwable th) {
        this.f203420a.cancel(false);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final /* synthetic */ C89391z invoke(Throwable th) {
        mo144051a(th);
        return C89391z.f203057a;
    }
}
