package com.google.p1998c.p2006h.p2007a;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27245k;
import com.google.p1998c.p1999a.C27258s;
import com.google.p1998c.p2006h.p2007a.AbstractC27643j;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.c.h.a.u */
public final class C27659u {
    static {
        Covode.recordClassIndex(33239);
    }

    /* renamed from: com.google.c.h.a.u$b */
    public static class C27663b extends AbstractC27633c {

        /* renamed from: a */
        private final ExecutorService f65058a;

        static {
            Covode.recordClassIndex(33243);
        }

        public final boolean isShutdown() {
            return this.f65058a.isShutdown();
        }

        public final boolean isTerminated() {
            return this.f65058a.isTerminated();
        }

        public final void shutdown() {
            this.f65058a.shutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final List<Runnable> shutdownNow() {
            return this.f65058a.shutdownNow();
        }

        public final void execute(Runnable runnable) {
            this.f65058a.execute(runnable);
        }

        public C27663b(ExecutorService executorService) {
            this.f65058a = (ExecutorService) C27245k.m54229a(executorService);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean awaitTermination(long j, TimeUnit timeUnit) {
            return this.f65058a.awaitTermination(j, timeUnit);
        }
    }

    /* renamed from: com.google.c.h.a.u$c */
    public static final class C27664c extends C27663b implements AbstractScheduledExecutorServiceC27658t {

        /* renamed from: a */
        final ScheduledExecutorService f65059a;

        static {
            Covode.recordClassIndex(33244);
        }

        /* renamed from: com.google.c.h.a.u$c$b */
        static final class RunnableC27666b extends AbstractC27620b<Void> implements Runnable {

            /* renamed from: a */
            private final Runnable f65061a;

            static {
                Covode.recordClassIndex(33246);
            }

            public final void run() {
                try {
                    this.f65061a.run();
                } catch (Throwable th) {
                    mo46226a(th);
                    C27258s.m54266a(th);
                    throw new RuntimeException(th);
                }
            }

            public RunnableC27666b(Runnable runnable) {
                this.f65061a = (Runnable) C27245k.m54229a(runnable);
            }
        }

        /* renamed from: com.google.c.h.a.u$c$a */
        static final class C27665a<V> extends AbstractC27643j.AbstractC27644a<V> implements AbstractScheduledFutureC27656r<V> {

            /* renamed from: a */
            private final ScheduledFuture<?> f65060a;

            static {
                Covode.recordClassIndex(33245);
            }

            @Override // java.lang.Comparable
            public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
                return this.f65060a.compareTo(obj);
            }

            public final long getDelay(TimeUnit timeUnit) {
                return this.f65060a.getDelay(timeUnit);
            }

            @Override // com.google.p1998c.p2006h.p2007a.AbstractFutureC27642i
            public final boolean cancel(boolean z) {
                boolean cancel = super.cancel(z);
                if (cancel) {
                    this.f65060a.cancel(z);
                }
                return cancel;
            }

            public C27665a(AbstractFutureC27655q<V> qVar, ScheduledFuture<?> scheduledFuture) {
                super(qVar);
                this.f65060a = scheduledFuture;
            }
        }

        public C27664c(ScheduledExecutorService scheduledExecutorService) {
            super(scheduledExecutorService);
            this.f65059a = (ScheduledExecutorService) C27245k.m54229a(scheduledExecutorService);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public final /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
            RunnableFutureC27668w a = RunnableFutureC27668w.m55312a(callable);
            return new C27665a(a, this.f65059a.schedule(a, j, timeUnit));
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public final /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
            RunnableFutureC27668w a = RunnableFutureC27668w.m55311a(runnable, (Object) null);
            return new C27665a(a, this.f65059a.schedule(a, j, timeUnit));
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public final /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            RunnableC27666b bVar = new RunnableC27666b(runnable);
            return new C27665a(bVar, this.f65059a.scheduleAtFixedRate(bVar, j, j2, timeUnit));
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public final /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            RunnableC27666b bVar = new RunnableC27666b(runnable);
            return new C27665a(bVar, this.f65059a.scheduleWithFixedDelay(bVar, j, j2, timeUnit));
        }
    }

    /* renamed from: com.google.c.h.a.u$a */
    public enum EnumC27662a implements Executor {
        INSTANCE;

        public final String toString() {
            return "MoreExecutors.directExecutor()";
        }

        static {
            Covode.recordClassIndex(33242);
        }

        public final void execute(Runnable runnable) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public static Executor m55306a(final Executor executor, final AbstractC27620b<?> bVar) {
        C27245k.m54229a(executor);
        C27245k.m54229a(bVar);
        if (executor == EnumC27662a.INSTANCE) {
            return executor;
        }
        return new Executor() {
            /* class com.google.p1998c.p2006h.p2007a.C27659u.ExecutorC276601 */

            /* renamed from: a */
            boolean f65051a = true;

            static {
                Covode.recordClassIndex(33240);
            }

            public final void execute(final Runnable runnable) {
                try {
                    executor.execute(new Runnable() {
                        /* class com.google.p1998c.p2006h.p2007a.C27659u.ExecutorC276601.RunnableC276611 */

                        static {
                            Covode.recordClassIndex(33241);
                        }

                        public final void run() {
                            ExecutorC276601.this.f65051a = false;
                            runnable.run();
                        }
                    });
                } catch (RejectedExecutionException e) {
                    if (this.f65051a) {
                        bVar.mo46226a((Throwable) e);
                    }
                }
            }
        };
    }
}
