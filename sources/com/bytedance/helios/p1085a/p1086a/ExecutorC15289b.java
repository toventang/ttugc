package com.bytedance.helios.p1085a.p1086a;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: com.bytedance.helios.a.a.b */
public final class ExecutorC15289b implements Executor {

    /* renamed from: a */
    private final Handler f37306a;

    static {
        Covode.recordClassIndex(17519);
    }

    public ExecutorC15289b(Handler handler) {
        this.f37306a = handler;
    }

    public final void execute(Runnable runnable) {
        if (!this.f37306a.post(runnable)) {
            throw new RejectedExecutionException(this.f37306a + " is shutting down");
        }
    }
}
