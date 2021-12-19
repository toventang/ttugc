package p4560f.p4561a.p4568e.p4581g;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88398aa;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4568e.p4569a.EnumC88442c;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.g.o */
public final class C88881o extends AbstractC88398aa {

    /* renamed from: d */
    static final ThreadFactoryC88873j f201852d = new ThreadFactoryC88873j("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);

    /* renamed from: e */
    static final ScheduledExecutorService f201853e;

    /* renamed from: a */
    final ThreadFactory f201854a;

    /* renamed from: c */
    final AtomicReference<ScheduledExecutorService> f201855c;

    /* renamed from: f.a.e.g.o$a */
    static final class C88882a extends AbstractC88398aa.AbstractC88401c {

        /* renamed from: a */
        final ScheduledExecutorService f201856a;

        /* renamed from: b */
        final C88411a f201857b = new C88411a();

        /* renamed from: c */
        volatile boolean f201858c;

        static {
            Covode.recordClassIndex(104924);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f201858c;
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            if (!this.f201858c) {
                this.f201858c = true;
                this.f201857b.dispose();
            }
        }

        C88882a(ScheduledExecutorService scheduledExecutorService) {
            this.f201856a = scheduledExecutorService;
        }

        @Override // p4560f.p4561a.AbstractC88398aa.AbstractC88401c
        /* renamed from: a */
        public final AbstractC88412b mo20706a(Runnable runnable, long j, TimeUnit timeUnit) {
            Future<?> future;
            if (this.f201858c) {
                return EnumC88442c.INSTANCE;
            }
            RunnableC88877m mVar = new RunnableC88877m(C88925a.m154175a(runnable), this.f201857b);
            this.f201857b.mo142945a(mVar);
            if (j <= 0) {
                try {
                    future = this.f201856a.submit((Callable) mVar);
                } catch (RejectedExecutionException e) {
                    dispose();
                    C88925a.m154178a(e);
                    return EnumC88442c.INSTANCE;
                }
            } else {
                future = this.f201856a.schedule((Callable) mVar, j, timeUnit);
            }
            mVar.setFuture(future);
            return mVar;
        }
    }

    public C88881o() {
        this(f201852d);
    }

    @Override // p4560f.p4561a.AbstractC88398aa
    /* renamed from: a */
    public final AbstractC88398aa.AbstractC88401c mo20704a() {
        return new C88882a(this.f201855c.get());
    }

    static {
        Covode.recordClassIndex(104923);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) C40780g.m82242a(C40787l.m82269a(EnumC40793o.SCHEDULED).mo70025a(0).mo70028a());
        f201853e = scheduledExecutorService;
        scheduledExecutorService.shutdown();
    }

    @Override // p4560f.p4561a.AbstractC88398aa
    /* renamed from: b */
    public final void mo142902b() {
        ScheduledExecutorService scheduledExecutorService;
        ScheduledExecutorService scheduledExecutorService2 = null;
        do {
            scheduledExecutorService = this.f201855c.get();
            if (scheduledExecutorService != f201853e) {
                if (scheduledExecutorService2 != null) {
                    scheduledExecutorService2.shutdown();
                    return;
                }
                return;
            } else if (scheduledExecutorService2 == null) {
                scheduledExecutorService2 = C88878n.m154071a(this.f201854a);
            }
        } while (!this.f201855c.compareAndSet(scheduledExecutorService, scheduledExecutorService2));
    }

    private C88881o(ThreadFactory threadFactory) {
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.f201855c = atomicReference;
        this.f201854a = threadFactory;
        atomicReference.lazySet(C88878n.m154071a(threadFactory));
    }

    @Override // p4560f.p4561a.AbstractC88398aa
    /* renamed from: a */
    public final AbstractC88412b mo20705a(Runnable runnable, long j, TimeUnit timeUnit) {
        Future<?> future;
        CallableC88876l lVar = new CallableC88876l(C88925a.m154175a(runnable));
        if (j <= 0) {
            try {
                future = this.f201855c.get().submit(lVar);
            } catch (RejectedExecutionException e) {
                C88925a.m154178a(e);
                return EnumC88442c.INSTANCE;
            }
        } else {
            future = this.f201855c.get().schedule(lVar, j, timeUnit);
        }
        lVar.setFuture(future);
        return lVar;
    }

    @Override // p4560f.p4561a.AbstractC88398aa
    /* renamed from: a */
    public final AbstractC88412b mo142901a(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Future<?> future;
        Runnable a = C88925a.m154175a(runnable);
        if (j2 <= 0) {
            ScheduledExecutorService scheduledExecutorService = this.f201855c.get();
            CallableC88865e eVar = new CallableC88865e(a, scheduledExecutorService);
            if (j <= 0) {
                try {
                    future = scheduledExecutorService.submit(eVar);
                } catch (RejectedExecutionException e) {
                    C88925a.m154178a(e);
                    return EnumC88442c.INSTANCE;
                }
            } else {
                future = scheduledExecutorService.schedule(eVar, j, timeUnit);
            }
            eVar.mo143136a(future);
            return eVar;
        }
        RunnableC88875k kVar = new RunnableC88875k(a);
        try {
            kVar.setFuture(this.f201855c.get().scheduleAtFixedRate(kVar, j, j2, timeUnit));
            return kVar;
        } catch (RejectedExecutionException e2) {
            C88925a.m154178a(e2);
            return EnumC88442c.INSTANCE;
        }
    }
}
