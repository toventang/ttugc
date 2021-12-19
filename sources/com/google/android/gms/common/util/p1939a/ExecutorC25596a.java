package com.google.android.gms.common.util.p1939a;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.p1946e.HandlerC25734g;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.common.util.a.a */
public final class ExecutorC25596a implements Executor {

    /* renamed from: a */
    private final Handler f60704a;

    static {
        Covode.recordClassIndex(31006);
    }

    public final void execute(Runnable runnable) {
        this.f60704a.post(runnable);
    }

    public ExecutorC25596a(Looper looper) {
        this.f60704a = new HandlerC25734g(looper);
    }
}
