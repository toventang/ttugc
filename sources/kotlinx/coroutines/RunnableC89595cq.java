package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import p4600h.C89391z;

/* renamed from: kotlinx.coroutines.cq */
final class RunnableC89595cq implements Runnable {

    /* renamed from: a */
    private final AbstractC89507ah f203326a;

    /* renamed from: b */
    private final AbstractC89671m<C89391z> f203327b;

    static {
        Covode.recordClassIndex(105686);
    }

    public final void run() {
        this.f203327b.mo144212a(this.f203326a, C89391z.f203057a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlinx.coroutines.m<? super h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public RunnableC89595cq(AbstractC89507ah ahVar, AbstractC89671m<? super C89391z> mVar) {
        this.f203326a = ahVar;
        this.f203327b = mVar;
    }
}
