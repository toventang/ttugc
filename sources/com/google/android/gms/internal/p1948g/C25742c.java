package com.google.android.gms.internal.p1948g;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.g.c */
final class C25742c implements AbstractC25741b {
    static {
        Covode.recordClassIndex(31157);
    }

    private C25742c() {
    }

    /* synthetic */ C25742c(byte b) {
        this();
    }

    @Override // com.google.android.gms.internal.p1948g.AbstractC25741b
    /* renamed from: a */
    public final ExecutorService mo41969a(ThreadFactory threadFactory) {
        MethodCollector.m26663i(10949);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
        MethodCollector.m26664o(10949);
        return unconfigurableExecutorService;
    }
}
