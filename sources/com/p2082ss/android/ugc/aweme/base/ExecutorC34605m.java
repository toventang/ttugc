package com.p2082ss.android.ugc.aweme.base;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.ugc.aweme.base.m */
public final class ExecutorC34605m implements Executor {

    /* renamed from: a */
    public static final ExecutorC34605m f81660a = new ExecutorC34605m();

    /* renamed from: b */
    private final Handler f81661b = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(41568);
    }

    private ExecutorC34605m() {
    }

    public final void execute(Runnable runnable) {
        this.f81661b.post(runnable);
    }

    /* renamed from: a */
    public final void mo61064a(Runnable runnable, long j) {
        this.f81661b.postDelayed(runnable, j);
    }
}
