package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p4600h.p4611f.p4613b.C89214g;

public class CompletedExceptionally {
    private static final AtomicIntegerFieldUpdater _handled$FU = AtomicIntegerFieldUpdater.newUpdater(CompletedExceptionally.class, "_handled");
    private volatile int _handled;
    public final Throwable cause;

    static {
        Covode.recordClassIndex(105534);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean getHandled() {
        /*
            r1 = this;
            int r0 = r1._handled
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.CompletedExceptionally.getHandled():boolean");
    }

    public final boolean makeHandled() {
        return _handled$FU.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return getClass().getSimpleName() + '[' + this.cause + ']';
    }

    public CompletedExceptionally(Throwable th, boolean z) {
        this.cause = th;
        this._handled = z ? 1 : 0;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CompletedExceptionally(Throwable th, boolean z, int i, C89214g gVar) {
        this(th, (i & 2) != 0 ? false : z);
    }
}
