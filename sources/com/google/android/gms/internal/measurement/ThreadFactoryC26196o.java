package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.o */
public final class ThreadFactoryC26196o implements ThreadFactory {

    /* renamed from: a */
    private ThreadFactory f61605a = Executors.defaultThreadFactory();

    static {
        Covode.recordClassIndex(31611);
    }

    ThreadFactoryC26196o() {
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f61605a.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
