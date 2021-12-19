package com.bytedance.platform.p1572b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.p1572b.p1573a.C21663b;
import com.bytedance.platform.p1572b.p1573a.RunnableC21662a;
import com.bytedance.platform.p1572b.p1573a.RunnableC21664c;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.platform.b.e */
public final class C21670e extends ThreadPoolExecutor implements AbstractC21667c {

    /* renamed from: a */
    private String f51427a;

    /* renamed from: b */
    private ThreadLocal<RunnableC21662a> f51428b = new ThreadLocal<>();

    /* renamed from: c */
    private Map<Runnable, RunnableC21664c> f51429c = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(25311);
    }

    @Override // com.bytedance.platform.p1572b.AbstractC21667c
    /* renamed from: a */
    public final String mo35329a() {
        if (!TextUtils.isEmpty(this.f51427a)) {
            return this.f51427a;
        }
        return "PlatformScheduleExecutor";
    }

    public final void execute(Runnable runnable) {
        MethodCollector.m26663i(8877);
        if (C21663b.f51414b) {
            RunnableC21664c cVar = new RunnableC21664c(this, runnable);
            this.f51429c.put(runnable, cVar);
            C21663b.f51413a.postDelayed(cVar, (long) C21663b.f51416d);
        }
        super.execute(runnable);
        MethodCollector.m26664o(8877);
    }

    /* access modifiers changed from: protected */
    public final void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        if (C21663b.f51414b) {
            C21663b.f51413a.removeCallbacks(this.f51428b.get());
        }
    }

    /* access modifiers changed from: protected */
    public final void beforeExecute(Thread thread, Runnable runnable) {
        super.beforeExecute(thread, runnable);
        if (C21663b.f51414b) {
            C21663b.f51413a.removeCallbacks(this.f51429c.remove(runnable));
            RunnableC21662a aVar = new RunnableC21662a(this, thread, runnable);
            this.f51428b.set(aVar);
            C21663b.f51413a.postDelayed(aVar, (long) C21663b.f51415c);
        }
    }

    public C21670e(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler, String str) {
        super(i, i2, j, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
        this.f51427a = str;
    }
}
