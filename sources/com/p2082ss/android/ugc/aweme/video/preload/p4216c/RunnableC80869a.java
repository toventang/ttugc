package com.p2082ss.android.ugc.aweme.video.preload.p4216c;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.ugc.aweme.video.preload.c.a */
public class RunnableC80869a implements Runnable {

    /* renamed from: f */
    private static final Executor f180810f = new ThreadPoolExecutor(3, 3, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(128), new ThreadPoolExecutor.DiscardOldestPolicy());

    /* renamed from: a */
    private final int f180811a;

    /* renamed from: b */
    private final Runnable f180812b;

    /* renamed from: c */
    private Handler f180813c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    private boolean f180814d;

    /* renamed from: e */
    private boolean f180815e;

    /* renamed from: a */
    public final void mo124233a() {
        if (!this.f180814d) {
            this.f180813c.post(this);
            this.f180814d = true;
            return;
        }
        this.f180815e = true;
    }

    static {
        Covode.recordClassIndex(94167);
    }

    public void run() {
        if (this.f180815e) {
            f180810f.execute(this.f180812b);
            this.f180815e = false;
        }
        this.f180813c.postDelayed(this, (long) this.f180811a);
    }

    public RunnableC80869a(Runnable runnable, int i) {
        this.f180812b = runnable;
        this.f180811a = i;
    }
}
