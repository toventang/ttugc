package com.p2082ss.android.ugc.aweme.account.base;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.ugc.aweme.account.base.a */
public final class ExecutorC31589a implements Executor {

    /* renamed from: a */
    public static final ExecutorC31589a f75546a = new ExecutorC31589a();

    /* renamed from: b */
    private final Handler f75547b = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(38315);
    }

    private ExecutorC31589a() {
    }

    public final void execute(Runnable runnable) {
        this.f75547b.post(runnable);
    }
}
