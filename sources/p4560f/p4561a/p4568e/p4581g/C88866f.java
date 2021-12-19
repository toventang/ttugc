package p4560f.p4561a.p4568e.p4581g;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88398aa;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4568e.p4569a.EnumC88442c;

/* renamed from: f.a.e.g.f */
public final class C88866f extends AbstractC88398aa {

    /* renamed from: a */
    static final ThreadFactoryC88873j f201815a;

    /* renamed from: c */
    static final ThreadFactoryC88873j f201816c;

    /* renamed from: d */
    static final C88869c f201817d;

    /* renamed from: g */
    static final RunnableC88867a f201818g;

    /* renamed from: h */
    private static final long f201819h = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    /* renamed from: i */
    private static final TimeUnit f201820i = TimeUnit.SECONDS;

    /* renamed from: e */
    final ThreadFactory f201821e;

    /* renamed from: f */
    final AtomicReference<RunnableC88867a> f201822f;

    /* renamed from: f.a.e.g.f$b */
    static final class C88868b extends AbstractC88398aa.AbstractC88401c {

        /* renamed from: a */
        final AtomicBoolean f201829a = new AtomicBoolean();

        /* renamed from: b */
        private final C88411a f201830b;

        /* renamed from: c */
        private final RunnableC88867a f201831c;

        /* renamed from: d */
        private final C88869c f201832d;

        static {
            Covode.recordClassIndex(104910);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f201829a.get();
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            if (this.f201829a.compareAndSet(false, true)) {
                this.f201830b.dispose();
                RunnableC88867a aVar = this.f201831c;
                C88869c cVar = this.f201832d;
                cVar.f201833a = System.nanoTime() + aVar.f201823a;
                aVar.f201824b.offer(cVar);
            }
        }

        C88868b(RunnableC88867a aVar) {
            this.f201831c = aVar;
            this.f201830b = new C88411a();
            this.f201832d = aVar.mo143138a();
        }

        @Override // p4560f.p4561a.AbstractC88398aa.AbstractC88401c
        /* renamed from: a */
        public final AbstractC88412b mo20706a(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.f201830b.isDisposed()) {
                return EnumC88442c.INSTANCE;
            }
            return this.f201832d.mo143141a(runnable, j, timeUnit, this.f201830b);
        }
    }

    public C88866f() {
        this(f201815a);
    }

    @Override // p4560f.p4561a.AbstractC88398aa
    /* renamed from: a */
    public final AbstractC88398aa.AbstractC88401c mo20704a() {
        return new C88868b(this.f201822f.get());
    }

    /* renamed from: f.a.e.g.f$a */
    static final class RunnableC88867a implements Runnable {

        /* renamed from: a */
        final long f201823a;

        /* renamed from: b */
        final ConcurrentLinkedQueue<C88869c> f201824b;

        /* renamed from: c */
        final C88411a f201825c;

        /* renamed from: d */
        private final ScheduledExecutorService f201826d;

        /* renamed from: e */
        private final Future<?> f201827e;

        /* renamed from: f */
        private final ThreadFactory f201828f;

        static {
            Covode.recordClassIndex(104909);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo143139b() {
            this.f201825c.dispose();
            Future<?> future = this.f201827e;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.f201826d;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final C88869c mo143138a() {
            if (this.f201825c.isDisposed()) {
                return C88866f.f201817d;
            }
            while (!this.f201824b.isEmpty()) {
                C88869c poll = this.f201824b.poll();
                if (poll != null) {
                    return poll;
                }
            }
            C88869c cVar = new C88869c(this.f201828f);
            this.f201825c.mo142945a(cVar);
            return cVar;
        }

        public final void run() {
            if (!this.f201824b.isEmpty()) {
                long nanoTime = System.nanoTime();
                Iterator<C88869c> it = this.f201824b.iterator();
                while (it.hasNext()) {
                    C88869c next = it.next();
                    if (next.f201833a > nanoTime) {
                        return;
                    }
                    if (this.f201824b.remove(next)) {
                        this.f201825c.mo142946b(next);
                    }
                }
            }
        }

        RunnableC88867a(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
            long j2;
            ScheduledFuture<?> scheduledFuture;
            if (timeUnit != null) {
                j2 = timeUnit.toNanos(j);
            } else {
                j2 = 0;
            }
            this.f201823a = j2;
            this.f201824b = new ConcurrentLinkedQueue<>();
            this.f201825c = new C88411a();
            this.f201828f = threadFactory;
            ScheduledExecutorService scheduledExecutorService = null;
            if (timeUnit != null) {
                scheduledExecutorService = (ScheduledExecutorService) C40780g.m82242a(C40787l.m82269a(EnumC40793o.SCHEDULED).mo70025a(1).mo70027a(C88866f.f201816c).mo70028a());
                scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(this, j2, j2, TimeUnit.NANOSECONDS);
            } else {
                scheduledFuture = null;
            }
            this.f201826d = scheduledExecutorService;
            this.f201827e = scheduledFuture;
        }
    }

    @Override // p4560f.p4561a.AbstractC88398aa
    /* renamed from: b */
    public final void mo142902b() {
        RunnableC88867a aVar = new RunnableC88867a(f201819h, f201820i, this.f201821e);
        if (!this.f201822f.compareAndSet(f201818g, aVar)) {
            aVar.mo143139b();
        }
    }

    static {
        Covode.recordClassIndex(104908);
        C88869c cVar = new C88869c(new ThreadFactoryC88873j("RxCachedThreadSchedulerShutdown"));
        f201817d = cVar;
        cVar.dispose();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        ThreadFactoryC88873j jVar = new ThreadFactoryC88873j("RxCachedThreadScheduler", max);
        f201815a = jVar;
        f201816c = new ThreadFactoryC88873j("RxCachedWorkerPoolEvictor", max);
        RunnableC88867a aVar = new RunnableC88867a(0, null, jVar);
        f201818g = aVar;
        aVar.mo143139b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f.a.e.g.f$c */
    public static final class C88869c extends C88871h {

        /* renamed from: a */
        public long f201833a;

        static {
            Covode.recordClassIndex(104911);
        }

        C88869c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    private C88866f(ThreadFactory threadFactory) {
        this.f201821e = threadFactory;
        this.f201822f = new AtomicReference<>(f201818g);
        mo142902b();
    }
}
