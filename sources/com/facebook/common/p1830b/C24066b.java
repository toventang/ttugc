package com.facebook.common.p1830b;

import com.bytedance.covode.number.Covode;
import com.facebook.common.p1833e.C24099a;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.common.b.b */
public class C24066b extends AbstractExecutorService {

    /* renamed from: a */
    public static final Class<?> f56999a = C24066b.class;

    /* renamed from: b */
    public final String f57000b;

    /* renamed from: c */
    public final BlockingQueue<Runnable> f57001c;

    /* renamed from: d */
    public final AtomicInteger f57002d;

    /* renamed from: e */
    private final Executor f57003e;

    /* renamed from: f */
    private volatile int f57004f = 1;

    /* renamed from: g */
    private final RunnableC24067a f57005g;

    /* renamed from: h */
    private final AtomicInteger f57006h;

    public boolean isShutdown() {
        return false;
    }

    public boolean isTerminated() {
        return false;
    }

    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException();
    }

    static {
        Covode.recordClassIndex(28193);
    }

    /* renamed from: a */
    public final void mo39605a() {
        int i = this.f57002d.get();
        while (i < this.f57004f) {
            int i2 = i + 1;
            if (this.f57002d.compareAndSet(i, i2)) {
                C24099a.m45637a(f56999a, "%s: starting worker %d of %d", this.f57000b, Integer.valueOf(i2), Integer.valueOf(this.f57004f));
                this.f57003e.execute(this.f57005g);
                return;
            }
            C24099a.m45635a(f56999a, "%s: race in startWorkerIfNeeded; retrying", this.f57000b);
            i = this.f57002d.get();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.common.b.b$a */
    public class RunnableC24067a implements Runnable {
        static {
            Covode.recordClassIndex(28194);
        }

        public final void run() {
            int decrementAndGet;
            boolean isEmpty;
            try {
                Runnable poll = C24066b.this.f57001c.poll();
                if (poll != null) {
                    poll.run();
                } else {
                    C24099a.m45635a(C24066b.f56999a, "%s: Worker has nothing to run", C24066b.this.f57000b);
                }
                if (isEmpty) {
                    C24099a.m45636a(C24066b.f56999a, "%s: worker finished; %d workers left", C24066b.this.f57000b, Integer.valueOf(decrementAndGet));
                }
            } finally {
                decrementAndGet = C24066b.this.f57002d.decrementAndGet();
                if (!C24066b.this.f57001c.isEmpty()) {
                    C24066b.this.mo39605a();
                } else {
                    C24099a.m45636a(C24066b.f56999a, "%s: worker finished; %d workers left", C24066b.this.f57000b, Integer.valueOf(decrementAndGet));
                }
            }
        }

        private RunnableC24067a() {
        }

        /* synthetic */ RunnableC24067a(C24066b bVar, byte b) {
            this();
        }
    }

    public void execute(Runnable runnable) {
        Objects.requireNonNull(runnable, "runnable parameter is null");
        if (this.f57001c.offer(runnable)) {
            int size = this.f57001c.size();
            int i = this.f57006h.get();
            if (size > i && this.f57006h.compareAndSet(i, size)) {
                C24099a.m45636a(f56999a, "%s: max pending work in queue = %d", this.f57000b, Integer.valueOf(size));
            }
            mo39605a();
            return;
        }
        throw new RejectedExecutionException(this.f57000b + " queue is full, size=" + this.f57001c.size());
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public C24066b(String str, Executor executor, BlockingQueue<Runnable> blockingQueue) {
        this.f57000b = str;
        this.f57003e = executor;
        this.f57001c = blockingQueue;
        this.f57005g = new RunnableC24067a(this, (byte) 0);
        this.f57002d = new AtomicInteger(0);
        this.f57006h = new AtomicInteger(0);
    }
}
