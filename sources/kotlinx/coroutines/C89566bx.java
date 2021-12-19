package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: kotlinx.coroutines.bx */
final class C89566bx extends AbstractC89580cb<AbstractC89568bz> {

    /* renamed from: a */
    private static final AtomicIntegerFieldUpdater f203284a = AtomicIntegerFieldUpdater.newUpdater(C89566bx.class, "_invoked");
    private volatile int _invoked;

    /* renamed from: b */
    private final AbstractC89172b<Throwable, C89391z> f203285b;

    static {
        Covode.recordClassIndex(105657);
    }

    @Override // kotlinx.coroutines.internal.C89646l
    public final String toString() {
        return "InvokeOnCancelling[" + getClass().getSimpleName() + '@' + Integer.toHexString(System.identityHashCode(this)) + ']';
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
        if (f203284a.compareAndSet(this, 0, 1)) {
            this.f203285b.invoke(th);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.b<? super java.lang.Throwable, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C89566bx(AbstractC89568bz bzVar, AbstractC89172b<? super Throwable, C89391z> bVar) {
        super(bzVar);
        this.f203285b = bVar;
    }
}
