package com.google.android.gms.internal.p1945d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.d.f */
final class C25726f implements AbstractC25724d {
    static {
        Covode.recordClassIndex(31141);
    }

    private C25726f() {
    }

    /* synthetic */ C25726f(byte b) {
        this();
    }

    @Override // com.google.android.gms.internal.p1945d.AbstractC25724d
    /* renamed from: a */
    public final ExecutorService mo41956a(ThreadFactory threadFactory) {
        MethodCollector.m26663i(8504);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
        MethodCollector.m26664o(8504);
        return unconfigurableExecutorService;
    }
}
