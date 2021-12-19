package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.EventLoopImplBase;

/* renamed from: kotlinx.coroutines.bm */
public abstract class AbstractC89553bm extends AbstractC89552bl {
    static {
        Covode.recordClassIndex(105644);
    }

    /* access modifiers changed from: protected */
    public abstract Thread getThread();

    /* access modifiers changed from: protected */
    public final void unpark() {
        Thread thread = getThread();
        if (Thread.currentThread() != thread && C89603cy.f203330a == null) {
            LockSupport.unpark(thread);
        }
    }

    /* access modifiers changed from: protected */
    public final void reschedule(long j, EventLoopImplBase.AbstractRunnableC89453c cVar) {
        if (!C89527ar.f203243a || this != RunnableC89529at.f203247a) {
            RunnableC89529at.f203247a.schedule(j, cVar);
            return;
        }
        throw new AssertionError();
    }
}
