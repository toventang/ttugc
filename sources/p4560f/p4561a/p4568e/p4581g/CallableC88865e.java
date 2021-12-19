package p4560f.p4561a.p4568e.p4581g;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4570b.C88446a;
import p4560f.p4561a.p4587h.C88925a;

/* access modifiers changed from: package-private */
/* renamed from: f.a.e.g.e */
public final class CallableC88865e implements AbstractC88412b, Callable<Void> {

    /* renamed from: f */
    static final FutureTask<Void> f201809f = new FutureTask<>(C88446a.f200696b, null);

    /* renamed from: a */
    final Runnable f201810a;

    /* renamed from: b */
    final AtomicReference<Future<?>> f201811b = new AtomicReference<>();

    /* renamed from: c */
    final AtomicReference<Future<?>> f201812c = new AtomicReference<>();

    /* renamed from: d */
    final ExecutorService f201813d;

    /* renamed from: e */
    Thread f201814e;

    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public final boolean isDisposed() {
        if (this.f201812c.get() == f201809f) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(104907);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Void call() {
        boolean z;
        this.f201814e = Thread.currentThread();
        try {
            this.f201810a.run();
            Future<?> submit = this.f201813d.submit(this);
            while (true) {
                Future<?> future = this.f201811b.get();
                if (future != f201809f) {
                    if (this.f201811b.compareAndSet(future, submit)) {
                        break;
                    }
                } else {
                    if (this.f201814e != Thread.currentThread()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    submit.cancel(z);
                }
            }
            this.f201814e = null;
        } catch (Throwable th) {
            this.f201814e = null;
            C88925a.m154178a(th);
        }
        return null;
    }

    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public final void dispose() {
        boolean z;
        AtomicReference<Future<?>> atomicReference = this.f201812c;
        FutureTask<Void> futureTask = f201809f;
        Future<?> andSet = atomicReference.getAndSet(futureTask);
        boolean z2 = true;
        if (!(andSet == null || andSet == futureTask)) {
            if (this.f201814e != Thread.currentThread()) {
                z = true;
            } else {
                z = false;
            }
            andSet.cancel(z);
        }
        Future<?> andSet2 = this.f201811b.getAndSet(futureTask);
        if (andSet2 != null && andSet2 != futureTask) {
            if (this.f201814e == Thread.currentThread()) {
                z2 = false;
            }
            andSet2.cancel(z2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo143136a(Future<?> future) {
        Future<?> future2;
        boolean z;
        do {
            future2 = this.f201812c.get();
            if (future2 == f201809f) {
                if (this.f201814e != Thread.currentThread()) {
                    z = true;
                } else {
                    z = false;
                }
                future.cancel(z);
                return;
            }
        } while (!this.f201812c.compareAndSet(future2, future));
    }

    CallableC88865e(Runnable runnable, ExecutorService executorService) {
        this.f201810a = runnable;
        this.f201813d = executorService;
    }
}
