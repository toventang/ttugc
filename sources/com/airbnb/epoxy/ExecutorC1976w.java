package com.airbnb.epoxy;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;

/* renamed from: com.airbnb.epoxy.w */
public class ExecutorC1976w implements Executor {

    /* renamed from: a */
    final Handler f5897a;

    static {
        Covode.recordClassIndex(2169);
    }

    ExecutorC1976w(Handler handler) {
        this.f5897a = handler;
    }

    public void execute(Runnable runnable) {
        if (Looper.myLooper() == this.f5897a.getLooper()) {
            runnable.run();
        } else {
            this.f5897a.post(runnable);
        }
    }
}
