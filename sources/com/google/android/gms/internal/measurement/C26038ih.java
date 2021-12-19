package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.measurement.ih */
final class C26038ih implements AbstractC26010hg {
    static {
        Covode.recordClassIndex(31453);
    }

    private C26038ih() {
    }

    /* synthetic */ C26038ih(byte b) {
        this();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26010hg
    /* renamed from: a */
    public final ExecutorService mo42668a(ThreadFactory threadFactory) {
        MethodCollector.m26663i(9691);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
        MethodCollector.m26664o(9691);
        return unconfigurableExecutorService;
    }
}
