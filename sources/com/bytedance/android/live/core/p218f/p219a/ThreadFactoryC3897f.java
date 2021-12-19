package com.bytedance.android.live.core.p218f.p219a;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.ThreadFactory;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.core.f.a.f */
public final /* synthetic */ class ThreadFactoryC3897f implements ThreadFactory {

    /* renamed from: a */
    static final ThreadFactory f10792a = new ThreadFactoryC3897f();

    static {
        Covode.recordClassIndex(4426);
    }

    private ThreadFactoryC3897f() {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "image-net-requests-monitor");
    }
}
