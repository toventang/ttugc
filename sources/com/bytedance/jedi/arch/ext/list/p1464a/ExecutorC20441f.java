package com.bytedance.jedi.arch.ext.list.p1464a;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;

/* renamed from: com.bytedance.jedi.arch.ext.list.a.f */
public final class ExecutorC20441f implements Executor {

    /* renamed from: a */
    private final Handler f48381a = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(23962);
    }

    public final void execute(Runnable runnable) {
        this.f48381a.post(runnable);
    }
}
