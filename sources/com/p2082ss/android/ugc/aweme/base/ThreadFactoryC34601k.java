package com.p2082ss.android.ugc.aweme.base;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.ThreadFactory;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.base.k */
public final /* synthetic */ class ThreadFactoryC34601k implements ThreadFactory {

    /* renamed from: a */
    static final ThreadFactory f81653a = new ThreadFactoryC34601k();

    static {
        Covode.recordClassIndex(41563);
    }

    private ThreadFactoryC34601k() {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "image-net-requests-monitor");
    }
}
