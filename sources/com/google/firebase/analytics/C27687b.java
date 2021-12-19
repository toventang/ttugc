package com.google.firebase.analytics;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.internal.measurement.C26178ni;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.analytics.b */
final class C27687b extends ThreadPoolExecutor {
    static {
        Covode.recordClassIndex(33268);
    }

    public final void execute(Runnable runnable) {
        MethodCollector.m26663i(2643);
        super.execute(C26178ni.f61582a.mo42866a(runnable));
        MethodCollector.m26664o(2643);
    }

    C27687b(TimeUnit timeUnit, BlockingQueue blockingQueue) {
        super(0, 1, 30, timeUnit, blockingQueue);
    }
}
