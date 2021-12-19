package com.bytedance.android.livesdk.p425aa;

import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.android.livesdk.aa.g */
public class ExecutorC6547g implements Executor {

    /* renamed from: a */
    public static final String f16351a = ExecutorC6547g.class.getSimpleName();

    /* renamed from: b */
    private ArrayBlockingQueue<Runnable> f16352b;

    /* renamed from: c */
    private AbstractC6550c f16353c;

    /* renamed from: d */
    private RunnableC6549b f16354d;

    /* renamed from: com.bytedance.android.livesdk.aa.g$a */
    public static class C6548a {

        /* renamed from: a */
        int f16355a;

        /* renamed from: b */
        AbstractC6550c f16356b;

        /* renamed from: c */
        String f16357c;

        static {
            Covode.recordClassIndex(7284);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.aa.g$c */
    public interface AbstractC6550c {
        static {
            Covode.recordClassIndex(7286);
        }

        /* renamed from: a */
        void mo12685a();
    }

    static {
        Covode.recordClassIndex(7283);
    }

    /* renamed from: com.bytedance.android.livesdk.aa.g$b */
    public static class RunnableC6549b implements Runnable {

        /* renamed from: a */
        public boolean f16358a;

        /* renamed from: b */
        private ArrayBlockingQueue<Runnable> f16359b;

        static {
            Covode.recordClassIndex(7285);
        }

        public final void run() {
            while (!this.f16358a) {
                try {
                    this.f16359b.take().run();
                } catch (InterruptedException e) {
                    C3854a.m9453a(6, ExecutorC6547g.f16351a, e.getMessage());
                }
            }
        }

        private RunnableC6549b(ArrayBlockingQueue<Runnable> arrayBlockingQueue) {
            this.f16359b = arrayBlockingQueue;
        }

        /* synthetic */ RunnableC6549b(ArrayBlockingQueue arrayBlockingQueue, byte b) {
            this(arrayBlockingQueue);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.aa.g$d */
    static class ThreadFactoryC6551d implements ThreadFactory {

        /* renamed from: a */
        private String f16360a;

        /* renamed from: b */
        private AtomicInteger f16361b;

        static {
            Covode.recordClassIndex(7287);
        }

        private ThreadFactoryC6551d(String str) {
            this.f16361b = new AtomicInteger();
            this.f16360a = str;
        }

        public final Thread newThread(Runnable runnable) {
            MethodCollector.m26663i(11220);
            Thread thread = new Thread(runnable, this.f16360a + "-" + this.f16361b.incrementAndGet());
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 1) {
                thread.setPriority(1);
            }
            MethodCollector.m26664o(11220);
            return thread;
        }

        /* synthetic */ ThreadFactoryC6551d(String str, byte b) {
            this(str);
        }
    }

    public void execute(Runnable runnable) {
        AbstractC6550c cVar;
        if (!this.f16352b.offer(runnable) && (cVar = this.f16353c) != null) {
            cVar.mo12685a();
        }
    }

    private ExecutorC6547g(int i, ThreadFactory threadFactory, AbstractC6550c cVar) {
        this.f16352b = new ArrayBlockingQueue<>(i);
        RunnableC6549b bVar = new RunnableC6549b(this.f16352b, (byte) 0);
        this.f16354d = bVar;
        threadFactory.newThread(bVar).start();
        this.f16353c = cVar;
    }

    /* synthetic */ ExecutorC6547g(int i, ThreadFactory threadFactory, AbstractC6550c cVar, byte b) {
        this(i, threadFactory, cVar);
    }
}
