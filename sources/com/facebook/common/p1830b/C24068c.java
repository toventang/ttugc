package com.facebook.common.p1830b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.facebook.common.b.c */
public final class C24068c extends C24066b implements AbstractExecutorServiceC24072g {
    static {
        Covode.recordClassIndex(28195);
    }

    public C24068c(Executor executor) {
        super("SerialExecutor", executor, new LinkedBlockingQueue());
    }

    @Override // com.facebook.common.p1830b.C24066b
    public final synchronized void execute(Runnable runnable) {
        MethodCollector.m26663i(11868);
        super.execute(runnable);
        MethodCollector.m26664o(11868);
    }
}
