package com.ttnet.org.chromium.base.task;

import android.os.Binder;
import com.bytedance.covode.number.Covode;
import com.ttnet.org.chromium.base.C87457f;
import com.ttnet.org.chromium.base.ThreadUtils;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ttnet.org.chromium.base.task.a */
public abstract class AbstractC87475a<Result> {

    /* renamed from: a */
    public static final Executor f198422a = ExecutorC87480c.f198434a;

    /* renamed from: b */
    public static final Executor f198423b = new ExecutorC87490k();

    /* renamed from: f */
    private static final RejectedExecutionHandlerC87478b f198424f = new RejectedExecutionHandlerC87478b((byte) 0);

    /* renamed from: c */
    public volatile int f198425c;

    /* renamed from: d */
    public final AtomicBoolean f198426d = new AtomicBoolean();

    /* renamed from: e */
    public final AtomicBoolean f198427e = new AtomicBoolean();

    /* renamed from: g */
    private final Callable<Result> f198428g;

    /* renamed from: h */
    private final FutureTask<Result> f198429h;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Result mo141544a();

    /* renamed from: com.ttnet.org.chromium.base.task.a$b */
    static class RejectedExecutionHandlerC87478b implements RejectedExecutionHandler {
        static {
            Covode.recordClassIndex(103424);
        }

        private RejectedExecutionHandlerC87478b() {
        }

        /* synthetic */ RejectedExecutionHandlerC87478b(byte b) {
            this();
        }

        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            AbstractC87475a.f198422a.execute(runnable);
        }
    }

    static {
        Covode.recordClassIndex(103421);
    }

    public AbstractC87475a() {
        CallableC874761 r1 = new Callable<Result>() {
            /* class com.ttnet.org.chromium.base.task.AbstractC87475a.CallableC874761 */

            static {
                Covode.recordClassIndex(103422);
            }

            @Override // java.util.concurrent.Callable
            public final Result call() {
                AbstractC87475a.this.f198427e.set(true);
                Result result = null;
                try {
                    result = (Result) AbstractC87475a.this.mo141544a();
                    Binder.flushPendingCommands();
                    AbstractC87475a.this.mo141546b(result);
                    return result;
                } catch (Throwable th) {
                    AbstractC87475a.this.mo141546b(result);
                    throw th;
                }
            }
        };
        this.f198428g = r1;
        this.f198429h = new C87477a(r1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ttnet.org.chromium.base.task.a$a */
    public class C87477a extends FutureTask<Result> {
        static {
            Covode.recordClassIndex(103423);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: com.ttnet.org.chromium.base.task.a */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: protected */
        public void done() {
            try {
                AbstractC87475a.this.mo141545a(get());
            } catch (InterruptedException e) {
                C87457f.m151788b("AsyncTask", e.toString(), new Object[0]);
            } catch (ExecutionException e2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
            } catch (CancellationException unused) {
                AbstractC87475a.this.mo141545a(null);
            }
        }

        C87477a(Callable<Result> callable) {
            super(callable);
        }
    }

    /* renamed from: a */
    public final void mo141545a(Result result) {
        if (!this.f198427e.get()) {
            mo141546b(result);
        }
    }

    /* renamed from: b */
    public final void mo141546b(Result result) {
        if (this instanceof AbstractC87481d) {
            this.f198425c = 2;
        } else {
            ThreadUtils.m151757a(new RunnableC87479b(this, result));
        }
    }
}
