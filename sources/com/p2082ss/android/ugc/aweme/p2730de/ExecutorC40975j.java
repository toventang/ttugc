package com.p2082ss.android.ugc.aweme.p2730de;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.ugc.aweme.de.j */
public final class ExecutorC40975j implements Executor {

    /* renamed from: a */
    public static final ExecutorC40975j f95810a = new ExecutorC40975j();

    /* renamed from: b */
    public final Handler f95811b = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(48827);
    }

    private ExecutorC40975j() {
    }

    public final void execute(Runnable runnable) {
        this.f95811b.post(runnable);
    }
}
