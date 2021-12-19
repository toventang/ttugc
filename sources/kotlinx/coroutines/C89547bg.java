package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Future;

/* renamed from: kotlinx.coroutines.bg */
final class C89547bg implements AbstractC89548bh {

    /* renamed from: a */
    private final Future<?> f203270a;

    static {
        Covode.recordClassIndex(105638);
    }

    @Override // kotlinx.coroutines.AbstractC89548bh
    public final void cQ_() {
        this.f203270a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f203270a + ']';
    }

    public C89547bg(Future<?> future) {
        this.f203270a = future;
    }
}
