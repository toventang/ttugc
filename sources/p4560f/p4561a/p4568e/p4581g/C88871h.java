package p4560f.p4561a.p4568e.p4581g;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88398aa;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4569a.AbstractC88440a;
import p4560f.p4561a.p4568e.p4569a.EnumC88442c;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.g.h */
public class C88871h extends AbstractC88398aa.AbstractC88401c {

    /* renamed from: b */
    public final ScheduledExecutorService f201836b;

    /* renamed from: c */
    public volatile boolean f201837c;

    static {
        Covode.recordClassIndex(104913);
    }

    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public boolean isDisposed() {
        return this.f201837c;
    }

    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public void dispose() {
        if (!this.f201837c) {
            this.f201837c = true;
            this.f201836b.shutdownNow();
        }
    }

    @Override // p4560f.p4561a.AbstractC88398aa.AbstractC88401c
    /* renamed from: a */
    public final AbstractC88412b mo101910a(Runnable runnable) {
        return mo20706a(runnable, 0, null);
    }

    public C88871h(ThreadFactory threadFactory) {
        this.f201836b = C88878n.m154071a(threadFactory);
    }

    @Override // p4560f.p4561a.AbstractC88398aa.AbstractC88401c
    /* renamed from: a */
    public final AbstractC88412b mo20706a(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.f201837c) {
            return EnumC88442c.INSTANCE;
        }
        return mo143141a(runnable, j, timeUnit, (AbstractC88440a) null);
    }

    /* renamed from: b */
    public final AbstractC88412b mo143143b(Runnable runnable, long j, TimeUnit timeUnit) {
        Future<?> future;
        CallableC88876l lVar = new CallableC88876l(C88925a.m154175a(runnable));
        if (j <= 0) {
            try {
                future = this.f201836b.submit(lVar);
            } catch (RejectedExecutionException e) {
                C88925a.m154178a(e);
                return EnumC88442c.INSTANCE;
            }
        } else {
            future = this.f201836b.schedule(lVar, j, timeUnit);
        }
        lVar.setFuture(future);
        return lVar;
    }

    /* renamed from: a */
    public final RunnableC88877m mo143141a(Runnable runnable, long j, TimeUnit timeUnit, AbstractC88440a aVar) {
        Future<?> future;
        RunnableC88877m mVar = new RunnableC88877m(C88925a.m154175a(runnable), aVar);
        if (aVar != null && !aVar.mo142945a(mVar)) {
            return mVar;
        }
        if (j <= 0) {
            try {
                future = this.f201836b.submit((Callable) mVar);
            } catch (RejectedExecutionException e) {
                if (aVar != null) {
                    aVar.mo142946b(mVar);
                }
                C88925a.m154178a(e);
            }
        } else {
            future = this.f201836b.schedule((Callable) mVar, j, timeUnit);
        }
        mVar.setFuture(future);
        return mVar;
    }

    /* renamed from: b */
    public final AbstractC88412b mo143142b(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Future<?> future;
        Runnable a = C88925a.m154175a(runnable);
        if (j2 <= 0) {
            CallableC88865e eVar = new CallableC88865e(a, this.f201836b);
            if (j <= 0) {
                try {
                    future = this.f201836b.submit(eVar);
                } catch (RejectedExecutionException e) {
                    C88925a.m154178a(e);
                    return EnumC88442c.INSTANCE;
                }
            } else {
                future = this.f201836b.schedule(eVar, j, timeUnit);
            }
            eVar.mo143136a(future);
            return eVar;
        }
        RunnableC88875k kVar = new RunnableC88875k(a);
        try {
            kVar.setFuture(this.f201836b.scheduleAtFixedRate(kVar, j, j2, timeUnit));
            return kVar;
        } catch (RejectedExecutionException e2) {
            C88925a.m154178a(e2);
            return EnumC88442c.INSTANCE;
        }
    }
}
