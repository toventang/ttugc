package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p4600h.p4603c.AbstractC89127f;
import p4600h.p4619j.C89271h;
import p4600h.p4622m.C89361p;

/* renamed from: kotlinx.coroutines.v */
public final class C89696v extends AbstractC89556bp {

    /* renamed from: a */
    public static final C89696v f203468a = new C89696v();

    /* renamed from: d */
    private static final int f203469d;

    /* renamed from: e */
    private static boolean f203470e;
    private static volatile Executor pool;

    /* access modifiers changed from: package-private */
    /* renamed from: kotlinx.coroutines.v$b */
    public static final class RunnableC89698b implements Runnable {

        /* renamed from: a */
        public static final RunnableC89698b f203472a = new RunnableC89698b();

        static {
            Covode.recordClassIndex(105792);
        }

        RunnableC89698b() {
        }

        public final void run() {
        }
    }

    @Override // kotlinx.coroutines.AbstractC89507ah
    public final String toString() {
        return "CommonPool";
    }

    private C89696v() {
    }

    /* renamed from: e */
    private final synchronized Executor m155728e() {
        Executor executor;
        executor = pool;
        if (executor == null) {
            executor = m155726c();
            pool = executor;
        }
        return executor;
    }

    @Override // kotlinx.coroutines.AbstractC89556bp
    /* renamed from: a */
    public final Executor mo144131a() {
        Executor executor = pool;
        if (executor == null) {
            return m155728e();
        }
        return executor;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Close cannot be invoked on CommonPool".toString());
    }

    /* renamed from: d */
    private static ExecutorService m155727d() {
        return m155723a(m155725b(), new ThreadFactoryC89697a(new AtomicInteger()));
    }

    static {
        int i;
        Covode.recordClassIndex(105790);
        try {
            String property = System.getProperty("kotlinx.coroutines.default.parallelism");
            if (property == null) {
                i = -1;
                f203469d = i;
            }
            Integer e = C89361p.m154863e(property);
            if (e == null || e.intValue() <= 0) {
                throw new IllegalStateException("Expected positive number in kotlinx.coroutines.default.parallelism, but has ".concat(String.valueOf(property)).toString());
            }
            i = e.intValue();
            f203469d = i;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    private static int m155725b() {
        Integer valueOf = Integer.valueOf(f203469d);
        if (valueOf.intValue() <= 0 || valueOf == null) {
            return C89271h.m154769b(Runtime.getRuntime().availableProcessors() - 1, 1);
        }
        return valueOf.intValue();
    }

    /* renamed from: c */
    private static ExecutorService m155726c() {
        Class<?> cls;
        ExecutorService executorService;
        Object obj;
        if (System.getSecurityManager() != null) {
            return m155727d();
        }
        ExecutorService executorService2 = null;
        try {
            cls = Class.forName("java.util.concurrent.ForkJoinPool");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return m155727d();
        }
        if (!f203470e && f203469d < 0) {
            try {
                Method method = cls.getMethod("commonPool", new Class[0]);
                if (method != null) {
                    obj = method.invoke(null, new Object[0]);
                } else {
                    obj = null;
                }
                if (!(obj instanceof ExecutorService)) {
                    obj = null;
                }
                executorService = (ExecutorService) obj;
            } catch (Throwable unused2) {
                executorService = null;
            }
            if (executorService != null) {
                if (!m155724a(cls, executorService)) {
                    executorService = null;
                }
                if (executorService != null) {
                    return executorService;
                }
            }
        }
        try {
            Object newInstance = cls.getConstructor(Integer.TYPE).newInstance(Integer.valueOf(m155725b()));
            if (!(newInstance instanceof ExecutorService)) {
                newInstance = null;
            }
            executorService2 = (ExecutorService) newInstance;
        } catch (Throwable unused3) {
        }
        if (executorService2 != null) {
            return executorService2;
        }
        return m155727d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: kotlinx.coroutines.v$a */
    public static final class ThreadFactoryC89697a implements ThreadFactory {

        /* renamed from: a */
        final /* synthetic */ AtomicInteger f203471a;

        static {
            Covode.recordClassIndex(105791);
        }

        ThreadFactoryC89697a(AtomicInteger atomicInteger) {
            this.f203471a = atomicInteger;
        }

        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "CommonPool-worker-" + this.f203471a.incrementAndGet());
            thread.setDaemon(true);
            return thread;
        }
    }

    /* renamed from: a */
    private static ExecutorService m155723a(int i, ThreadFactory threadFactory) {
        return C40780g.m82242a(C40787l.m82269a(EnumC40793o.FIXED).mo70025a(i).mo70027a(threadFactory).mo70028a());
    }

    @Override // kotlinx.coroutines.AbstractC89507ah
    public final void dispatch(AbstractC89127f fVar, Runnable runnable) {
        Runnable runnable2;
        try {
            Executor executor = pool;
            if (executor == null) {
                executor = m155728e();
            }
            AbstractC89602cx cxVar = C89603cy.f203330a;
            if (cxVar == null || (runnable2 = cxVar.mo144152b()) == null) {
                runnable2 = runnable;
            }
            executor.execute(runnable2);
        } catch (RejectedExecutionException unused) {
            RunnableC89529at.f203247a.enqueue(runnable);
        }
    }

    /* renamed from: a */
    private static boolean m155724a(Class<?> cls, ExecutorService executorService) {
        executorService.submit(RunnableC89698b.f203472a);
        Integer num = null;
        try {
            Object invoke = cls.getMethod("getPoolSize", new Class[0]).invoke(executorService, new Object[0]);
            if (!(invoke instanceof Integer)) {
                invoke = null;
            }
            num = (Integer) invoke;
        } catch (Throwable unused) {
        }
        if (num == null || num.intValue() <= 0) {
            return false;
        }
        return true;
    }
}
