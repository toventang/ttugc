package p4560f.p4561a.p4568e.p4581g;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4570b.C88446a;

/* renamed from: f.a.e.g.a */
public abstract class AbstractC88852a extends AtomicReference<Future<?>> implements AbstractC88412b {

    /* renamed from: c */
    protected static final FutureTask<Void> f201770c = new FutureTask<>(C88446a.f200696b, null);

    /* renamed from: d */
    protected static final FutureTask<Void> f201771d = new FutureTask<>(C88446a.f200696b, null);
    private static final long serialVersionUID = 1811839108042568751L;

    /* renamed from: a */
    protected final Runnable f201772a;

    /* renamed from: b */
    protected Thread f201773b;

    public Runnable getWrappedRunnable() {
        return this.f201772a;
    }

    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public final boolean isDisposed() {
        Object obj = get();
        if (obj == f201770c || obj == f201771d) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(104894);
    }

    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public final void dispose() {
        FutureTask<Void> futureTask;
        boolean z;
        Future future = (Future) get();
        if (future != f201770c && future != (futureTask = f201771d) && compareAndSet(future, futureTask) && future != null) {
            if (this.f201773b != Thread.currentThread()) {
                z = true;
            } else {
                z = false;
            }
            future.cancel(z);
        }
    }

    AbstractC88852a(Runnable runnable) {
        this.f201772a = runnable;
    }

    public final void setFuture(Future<?> future) {
        Object obj;
        boolean z;
        do {
            obj = get();
            if (obj == f201770c) {
                return;
            }
            if (obj == f201771d) {
                if (this.f201773b != Thread.currentThread()) {
                    z = true;
                } else {
                    z = false;
                }
                future.cancel(z);
                return;
            }
        } while (!compareAndSet(obj, future));
    }
}
