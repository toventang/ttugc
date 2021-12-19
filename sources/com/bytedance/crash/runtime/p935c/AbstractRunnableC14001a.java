package com.bytedance.crash.runtime.p935c;

import android.os.Handler;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.crash.runtime.c.a */
public abstract class AbstractRunnableC14001a implements Runnable {

    /* renamed from: a */
    public final long f34135a;

    /* renamed from: b */
    private final Handler f34136b;

    /* renamed from: c */
    private final long f34137c = 0;

    static {
        Covode.recordClassIndex(16066);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22515a(long j) {
        if (j > 0) {
            this.f34136b.postDelayed(this, j);
        } else {
            this.f34136b.post(this);
        }
    }

    AbstractRunnableC14001a(Handler handler, long j) {
        this.f34136b = handler;
        this.f34135a = j;
    }
}
