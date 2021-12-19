package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.C89631d;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89127f;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: kotlinx.coroutines.bq */
public abstract class AbstractC89559bq extends AbstractC89556bp implements AbstractC89534ax {

    /* renamed from: a */
    private boolean f203278a;

    static {
        Covode.recordClassIndex(105650);
    }

    /* renamed from: b */
    public final void mo144132b() {
        this.f203278a = C89631d.m155574a(mo144131a());
    }

    public int hashCode() {
        return System.identityHashCode(mo144131a());
    }

    @Override // kotlinx.coroutines.AbstractC89507ah
    public String toString() {
        return mo144131a().toString();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor a = mo144131a();
        if (!(a instanceof ExecutorService)) {
            a = null;
        }
        ExecutorService executorService = (ExecutorService) a;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AbstractC89559bq) || ((AbstractC89556bp) obj).mo144131a() != mo144131a()) {
            return false;
        }
        return true;
    }

    @Override // kotlinx.coroutines.AbstractC89507ah
    public void dispatch(AbstractC89127f fVar, Runnable runnable) {
        Runnable runnable2;
        try {
            Executor a = mo144131a();
            AbstractC89602cx cxVar = C89603cy.f203330a;
            if (cxVar == null || (runnable2 = cxVar.mo144152b()) == null) {
                runnable2 = runnable;
            }
            a.execute(runnable2);
        } catch (RejectedExecutionException unused) {
            RunnableC89529at.f203247a.enqueue(runnable);
        }
    }

    @Override // kotlinx.coroutines.AbstractC89534ax
    public AbstractC89548bh invokeOnTimeout(long j, Runnable runnable) {
        ScheduledFuture<?> a;
        if (!this.f203278a || (a = m155492a(runnable, j, TimeUnit.MILLISECONDS)) == null) {
            return RunnableC89529at.f203247a.invokeOnTimeout(j, runnable);
        }
        return new C89547bg(a);
    }

    @Override // kotlinx.coroutines.AbstractC89534ax
    public void scheduleResumeAfterDelay(long j, AbstractC89671m<? super C89391z> mVar) {
        ScheduledFuture<?> a;
        if (!this.f203278a || (a = m155492a(new RunnableC89595cq(this, mVar), j, TimeUnit.MILLISECONDS)) == null) {
            RunnableC89529at.f203247a.scheduleResumeAfterDelay(j, mVar);
        } else {
            mVar.mo144211a((AbstractC89172b<? super Throwable, C89391z>) new C89668j(a));
        }
    }

    /* renamed from: a */
    private final ScheduledFuture<?> m155492a(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            Executor a = mo144131a();
            if (!(a instanceof ScheduledExecutorService)) {
                a = null;
            }
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) a;
            if (scheduledExecutorService != null) {
                return scheduledExecutorService.schedule(runnable, j, timeUnit);
            }
            return null;
        } catch (RejectedExecutionException unused) {
            return null;
        }
    }
}
