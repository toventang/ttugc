package com.p2082ss.android.ugc.aweme.app;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: com.ss.android.ugc.aweme.app.t */
public final class RejectedExecutionHandlerC33853t implements RejectedExecutionHandler {
    static {
        Covode.recordClassIndex(40766);
    }

    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        C51423a.m95791b(3, null, "Task " + runnable.toString() + " rejected from " + threadPoolExecutor.toString() + " Pending tasks: " + threadPoolExecutor.getQueue());
    }
}
