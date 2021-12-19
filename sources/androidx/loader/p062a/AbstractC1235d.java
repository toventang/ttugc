package androidx.loader.p062a;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: androidx.loader.a.d */
public abstract class AbstractC1235d<Params, Progress, Result> {

    /* renamed from: a */
    private static final ThreadFactory f4057a;

    /* renamed from: b */
    private static final BlockingQueue<Runnable> f4058b;

    /* renamed from: c */
    public static final Executor f4059c;

    /* renamed from: h */
    private static HandlerC1241b f4060h;

    /* renamed from: i */
    private static volatile Executor f4061i;

    /* renamed from: d */
    final FutureTask<Result> f4062d;

    /* renamed from: e */
    public volatile EnumC1242c f4063e = EnumC1242c.PENDING;

    /* renamed from: f */
    final AtomicBoolean f4064f = new AtomicBoolean();

    /* renamed from: g */
    final AtomicBoolean f4065g = new AtomicBoolean();

    /* renamed from: j */
    private final AbstractCallableC1243d<Params, Result> f4066j;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Result mo4069a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4070a(Result result) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo4071b(Result result) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.loader.a.d$d */
    public static abstract class AbstractCallableC1243d<Params, Result> implements Callable<Result> {

        /* renamed from: b */
        Params[] f4074b;

        static {
            Covode.recordClassIndex(1350);
        }

        AbstractCallableC1243d() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.loader.a.d$b */
    public static class HandlerC1241b extends Handler {
        static {
            Covode.recordClassIndex(1348);
        }

        HandlerC1241b() {
            super(Looper.getMainLooper());
        }

        public final void handleMessage(Message message) {
            C1240a aVar = (C1240a) message.obj;
            if (message.what == 1) {
                aVar.f4071a.mo4092e(aVar.f4072b[0]);
            }
        }
    }

    /* renamed from: b */
    private static Handler m3970b() {
        HandlerC1241b bVar;
        synchronized (AbstractC1235d.class) {
            if (f4060h == null) {
                f4060h = new HandlerC1241b();
            }
            bVar = f4060h;
        }
        return bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.loader.a.d$4 */
    public static /* synthetic */ class C12394 {

        /* renamed from: a */
        static final /* synthetic */ int[] f4070a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        static {
            /*
                r0 = 1346(0x542, float:1.886E-42)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                androidx.loader.a.d$c[] r0 = androidx.loader.p062a.AbstractC1235d.EnumC1242c.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                androidx.loader.p062a.AbstractC1235d.C12394.f4070a = r2
                androidx.loader.a.d$c r0 = androidx.loader.p062a.AbstractC1235d.EnumC1242c.RUNNING     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = androidx.loader.p062a.AbstractC1235d.C12394.f4070a     // Catch:{ NoSuchFieldError -> 0x0022 }
                androidx.loader.a.d$c r0 = androidx.loader.p062a.AbstractC1235d.EnumC1242c.FINISHED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.loader.p062a.AbstractC1235d.C12394.<clinit>():void");
        }
    }

    /* renamed from: androidx.loader.a.d$c */
    public enum EnumC1242c {
        PENDING,
        RUNNING,
        FINISHED;

        static {
            Covode.recordClassIndex(1349);
        }
    }

    static {
        Covode.recordClassIndex(1342);
        ThreadFactoryC12361 r7 = new ThreadFactory() {
            /* class androidx.loader.p062a.AbstractC1235d.ThreadFactoryC12361 */

            /* renamed from: a */
            private final AtomicInteger f4067a = new AtomicInteger(1);

            static {
                Covode.recordClassIndex(1343);
            }

            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, "ModernAsyncTask #" + this.f4067a.getAndIncrement());
            }
        };
        f4057a = r7;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        f4058b = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, linkedBlockingQueue, r7);
        f4059c = threadPoolExecutor;
        f4061i = threadPoolExecutor;
    }

    AbstractC1235d() {
        C12372 r1 = new AbstractCallableC1243d<Params, Result>() {
            /* class androidx.loader.p062a.AbstractC1235d.C12372 */

            static {
                Covode.recordClassIndex(1344);
            }

            @Override // java.util.concurrent.Callable
            public final Result call() {
                AbstractC1235d.this.f4065g.set(true);
                Result result = null;
                try {
                    Process.setThreadPriority(10);
                    result = (Result) AbstractC1235d.this.mo4069a();
                    Binder.flushPendingCommands();
                    AbstractC1235d.this.mo4091d(result);
                    return result;
                } catch (Throwable th) {
                    AbstractC1235d.this.mo4091d(result);
                    throw th;
                }
            }
        };
        this.f4066j = r1;
        this.f4062d = new FutureTask<Result>(r1) {
            /* class androidx.loader.p062a.AbstractC1235d.C12383 */

            static {
                Covode.recordClassIndex(1345);
            }

            /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: androidx.loader.a.d */
            /* JADX WARN: Multi-variable type inference failed */
            /* access modifiers changed from: protected */
            public final void done() {
                try {
                    AbstractC1235d.this.mo4090c(get());
                } catch (InterruptedException unused) {
                } catch (ExecutionException e) {
                    throw new RuntimeException("An error occurred while executing doInBackground()", e.getCause());
                } catch (CancellationException unused2) {
                    AbstractC1235d.this.mo4090c(null);
                } catch (Throwable th) {
                    throw new RuntimeException("An error occurred while executing doInBackground()", th);
                }
            }
        };
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo4090c(Result result) {
        if (!this.f4065g.get()) {
            mo4091d(result);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final Result mo4091d(Result result) {
        m3970b().obtainMessage(1, new C1240a(this, result)).sendToTarget();
        return result;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo4092e(Result result) {
        if (this.f4064f.get()) {
            mo4071b(result);
        } else {
            mo4070a((Object) result);
        }
        this.f4063e = EnumC1242c.FINISHED;
    }

    /* renamed from: a */
    public final AbstractC1235d<Params, Progress, Result> mo4089a(Executor executor) {
        if (this.f4063e != EnumC1242c.PENDING) {
            int i = C12394.f4070a[this.f4063e.ordinal()];
            if (i == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            } else if (i != 2) {
                throw new IllegalStateException("We should never reach this state");
            } else {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        } else {
            this.f4063e = EnumC1242c.RUNNING;
            this.f4066j.f4074b = null;
            executor.execute(this.f4062d);
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.loader.a.d$a */
    public static class C1240a<Data> {

        /* renamed from: a */
        final AbstractC1235d f4071a;

        /* renamed from: b */
        final Data[] f4072b;

        static {
            Covode.recordClassIndex(1347);
        }

        C1240a(AbstractC1235d dVar, Data... dataArr) {
            this.f4071a = dVar;
            this.f4072b = dataArr;
        }
    }
}
