package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.locks.LockSupport;
import p4600h.p4603c.AbstractC89127f;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: kotlinx.coroutines.e */
public final class C89613e<T> extends AbstractC89458a<T> {

    /* renamed from: b */
    private final Thread f203338b;

    /* renamed from: e */
    private final AbstractC89552bl f203339e;

    static {
        Covode.recordClassIndex(105704);
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: i */
    public final boolean mo144006i() {
        return true;
    }

    /* renamed from: j */
    public final T mo144154j() {
        long j;
        AbstractC89552bl blVar = this.f203339e;
        CompletedExceptionally completedExceptionally = null;
        if (blVar != null) {
            AbstractC89552bl.incrementUseCount$default(blVar, false, 1, completedExceptionally);
        }
        while (!Thread.interrupted()) {
            try {
                AbstractC89552bl blVar2 = this.f203339e;
                if (blVar2 != null) {
                    j = blVar2.processNextEvent();
                } else {
                    j = Long.MAX_VALUE;
                }
                if (mo144007k()) {
                    T t = (T) C89584cf.m155519b(mo144012p());
                    if (t instanceof CompletedExceptionally) {
                        completedExceptionally = t;
                    }
                    CompletedExceptionally completedExceptionally2 = completedExceptionally;
                    if (completedExceptionally2 == null) {
                        return t;
                    }
                    throw completedExceptionally2.cause;
                } else if (C89603cy.f203330a == null) {
                    LockSupport.parkNanos(this, j);
                }
            } finally {
                AbstractC89552bl blVar3 = this.f203339e;
                if (blVar3 != null) {
                    AbstractC89552bl.decrementUseCount$default(blVar3, false, 1, completedExceptionally);
                }
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        mo144000d((Throwable) interruptedException);
        throw interruptedException;
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: c */
    public final void mo143995c(Object obj) {
        if (!C89219l.m154714a(Thread.currentThread(), this.f203338b)) {
            LockSupport.unpark(this.f203338b);
        }
    }

    public C89613e(AbstractC89127f fVar, Thread thread, AbstractC89552bl blVar) {
        super(fVar, true);
        this.f203338b = thread;
        this.f203339e = blVar;
    }
}
