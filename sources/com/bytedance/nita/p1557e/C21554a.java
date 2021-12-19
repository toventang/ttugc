package com.bytedance.nita.p1557e;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p084a.p088b.C1870c;
import com.p084a.p088b.C1873d;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import java.lang.reflect.Field;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.nita.e.a */
public final class C21554a {

    /* renamed from: a */
    static ConcurrentHashMap<String, C21560d> f51149a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public static final C21554a f51150b = new C21554a();

    /* renamed from: c */
    private static Handler f51151c;

    /* renamed from: d */
    private static HandlerThread f51152d;

    /* renamed from: e */
    private static C21560d f51153e = new C21560d();

    /* renamed from: f */
    private static Executor f51154f;

    private C21554a() {
    }

    /* renamed from: com.bytedance.nita.e.a$a */
    public static final class ThreadFactoryC21555a implements ThreadFactory {

        /* renamed from: a */
        public int f51155a = -20;

        /* renamed from: b */
        private AtomicInteger f51156b = new AtomicInteger(1);

        static {
            Covode.recordClassIndex(25196);
        }

        /* renamed from: com.bytedance.nita.e.a$a$a */
        static final class RunnableC21556a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ ThreadFactoryC21555a f51157a;

            /* renamed from: b */
            final /* synthetic */ Runnable f51158b;

            static {
                Covode.recordClassIndex(25197);
            }

            RunnableC21556a(ThreadFactoryC21555a aVar, Runnable runnable) {
                this.f51157a = aVar;
                this.f51158b = runnable;
            }

            public final void run() {
                C1873d dVar = C1870c.f5679b;
                C89219l.m154709a((Object) dVar, "");
                if (dVar.f5685f) {
                    Process.setThreadPriority(this.f51157a.f51155a);
                }
                this.f51158b.run();
            }
        }

        public final Thread newThread(Runnable runnable) {
            C89219l.m154719c(runnable, "");
            String str = "AsyncInflate #" + this.f51156b.getAndIncrement();
            Thread thread = new Thread(new RunnableC21556a(this, runnable), str);
            C21554a.f51149a.put(str, new C21560d());
            return thread;
        }
    }

    static {
        Covode.recordClassIndex(25195);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.nita.e.a$b */
    public static final class RunnableC21557b implements Runnable {

        /* renamed from: a */
        public static final RunnableC21557b f51159a = new RunnableC21557b();

        static {
            Covode.recordClassIndex(25198);
        }

        RunnableC21557b() {
        }

        public final void run() {
            try {
                Field declaredField = Looper.class.getDeclaredField("sThreadLocal");
                C89219l.m154709a((Object) declaredField, "");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(null);
                if (obj != null) {
                    ((ThreadLocal) obj).set(Looper.getMainLooper());
                    return;
                }
                throw new C89388w("null cannot be cast to non-null type");
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    private Handler m40488b() {
        MethodCollector.m26663i(5729);
        if (f51151c == null) {
            synchronized (this) {
                try {
                    if (f51151c == null) {
                        HandlerThread handlerThread = new HandlerThread("NitaMainThread");
                        f51152d = handlerThread;
                        handlerThread.start();
                        HandlerThread handlerThread2 = f51152d;
                        if (handlerThread2 == null) {
                            C89219l.m154707a();
                        }
                        Handler handler = new Handler(handlerThread2.getLooper());
                        f51151c = handler;
                        handler.postAtFrontOfQueue(RunnableC21557b.f51159a);
                        C1873d dVar = C1870c.f5679b;
                        C89219l.m154709a((Object) dVar, "");
                        if (dVar.f5685f) {
                            HandlerThread handlerThread3 = f51152d;
                            if (handlerThread3 == null) {
                                C89219l.m154707a();
                            }
                            Process.setThreadPriority(handlerThread3.getThreadId(), -20);
                        }
                        f51149a.put("NitaMainThread", f51153e);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(5729);
                    throw th;
                }
            }
        }
        Handler handler2 = f51151c;
        if (handler2 == null) {
            C89219l.m154707a();
        }
        MethodCollector.m26664o(5729);
        return handler2;
    }

    /* renamed from: a */
    public final synchronized Executor mo35228a() {
        Executor executor;
        MethodCollector.m26663i(5864);
        if (f51154f == null) {
            ThreadFactoryC21555a aVar = new ThreadFactoryC21555a();
            C1873d dVar = C1870c.f5679b;
            C89219l.m154709a((Object) dVar, "");
            int i = dVar.f5681b;
            C1873d dVar2 = C1870c.f5679b;
            C89219l.m154709a((Object) dVar2, "");
            f51154f = new ThreadPoolExecutor(i, dVar2.f5681b, 0, TimeUnit.SECONDS, new ArrayBlockingQueue(10000), aVar, new ThreadPoolExecutor.DiscardOldestPolicy());
        }
        executor = f51154f;
        if (executor == null) {
            C89219l.m154707a();
        }
        MethodCollector.m26664o(5864);
        return executor;
    }

    /* renamed from: a */
    public static C21560d m40487a(Thread thread) {
        C89219l.m154719c(thread, "");
        C21560d dVar = f51149a.get(thread.getName());
        if (dVar == null) {
            C89219l.m154707a();
        }
        return dVar;
    }

    /* renamed from: a */
    public static Handler m40486a(C21554a aVar) {
        boolean z;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C58945a.m108291c().mo96425a("method_nita_executor_inflate_handler_duration", false);
        }
        Handler b = aVar.m40488b();
        if (z) {
            C58945a.m108291c().mo96429b("method_nita_executor_inflate_handler_duration", false);
        }
        return b;
    }
}
