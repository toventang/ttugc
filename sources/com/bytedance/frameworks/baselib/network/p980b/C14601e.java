package com.bytedance.frameworks.baselib.network.p980b;

import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.frameworks.baselib.network.b.e */
final class C14601e implements WeakHandler.IHandler {

    /* renamed from: b */
    static AtomicInteger f35292b = new AtomicInteger();

    /* renamed from: c */
    static C14601e f35293c = new C14601e();

    /* renamed from: a */
    WeakHandler f35294a = new WeakHandler(Looper.getMainLooper(), this);

    /* renamed from: d */
    private ThreadPoolExecutor f35295d;

    /* renamed from: e */
    private ThreadPoolExecutor f35296e;

    /* renamed from: f */
    private ThreadPoolExecutor f35297f;

    private C14601e() {
    }

    static {
        Covode.recordClassIndex(16692);
    }

    /* renamed from: a */
    public final synchronized ExecutorService mo23478a() {
        ThreadPoolExecutor threadPoolExecutor;
        MethodCollector.m26663i(11432);
        if (this.f35295d == null) {
            ThreadPoolExecutor threadPoolExecutor2 = C14604f.m26687a().f35304a;
            this.f35295d = threadPoolExecutor2;
            if (threadPoolExecutor2 == null) {
                this.f35295d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, C14604f.m26687a().f35312i, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactoryC14602a("NetImmediate"));
            }
        }
        threadPoolExecutor = this.f35295d;
        MethodCollector.m26664o(11432);
        return threadPoolExecutor;
    }

    /* renamed from: b */
    public final synchronized ExecutorService mo23479b() {
        ThreadPoolExecutor threadPoolExecutor;
        MethodCollector.m26663i(11600);
        if (this.f35296e == null) {
            ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(C14604f.m26687a().f35308e, C14604f.m26687a().f35306c, C14604f.m26687a().f35310g, TimeUnit.SECONDS, new PriorityBlockingQueue(), new ThreadFactoryC14602a("NetNormal"));
            this.f35296e = threadPoolExecutor2;
            threadPoolExecutor2.allowCoreThreadTimeOut(C14604f.m26687a().f35313j);
        }
        threadPoolExecutor = this.f35296e;
        MethodCollector.m26664o(11600);
        return threadPoolExecutor;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized ExecutorService mo23480c() {
        ThreadPoolExecutor threadPoolExecutor;
        MethodCollector.m26663i(11601);
        if (this.f35297f == null) {
            ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(C14604f.m26687a().f35309f, C14604f.m26687a().f35307d, C14604f.m26687a().f35311h, TimeUnit.SECONDS, new PriorityBlockingQueue(), new ThreadFactoryC14602a("NetDownload"));
            this.f35297f = threadPoolExecutor2;
            threadPoolExecutor2.allowCoreThreadTimeOut(C14604f.m26687a().f35313j);
        }
        threadPoolExecutor = this.f35297f;
        MethodCollector.m26664o(11601);
        return threadPoolExecutor;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.frameworks.baselib.network.b.e$a */
    public static class ThreadFactoryC14602a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f35298a = new AtomicInteger(1);

        /* renamed from: b */
        private String f35299b = "ApiExecutor";

        static {
            Covode.recordClassIndex(16693);
        }

        ThreadFactoryC14602a(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f35299b = str;
            }
        }

        public final Thread newThread(Runnable runnable) {
            C146031 r1 = new Thread(runnable, this.f35299b + "#" + this.f35298a.getAndIncrement()) {
                /* class com.bytedance.frameworks.baselib.network.p980b.C14601e.ThreadFactoryC14602a.C146031 */

                static {
                    Covode.recordClassIndex(16694);
                }

                public final void run() {
                    Process.setThreadPriority(10);
                    super.run();
                }
            };
            r1.setDaemon(false);
            return r1;
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        if (message != null && (message.obj instanceof Runnable)) {
            try {
                int i = message.what;
                if (i == 0) {
                    mo23479b().execute((Runnable) message.obj);
                } else if (i == 1) {
                    mo23478a().execute((Runnable) message.obj);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
