package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p4600h.p4603c.AbstractC89124d;

/* renamed from: kotlinx.coroutines.q */
public final class C89675q extends CompletedExceptionally {

    /* renamed from: a */
    private static final AtomicIntegerFieldUpdater f203426a = AtomicIntegerFieldUpdater.newUpdater(C89675q.class, "_resumed");
    private volatile int _resumed;

    static {
        Covode.recordClassIndex(105768);
    }

    /* renamed from: a */
    public final boolean mo144222a() {
        return f203426a.compareAndSet(this, 0, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C89675q(AbstractC89124d<?> dVar, Throwable th, boolean z) {
        super(th == null ? new CancellationException("Continuation " + dVar + " was cancelled normally") : th, z);
        this._resumed = 0;
    }
}
