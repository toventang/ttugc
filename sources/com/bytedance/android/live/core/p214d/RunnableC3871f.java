package com.bytedance.android.live.core.p214d;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.core.d.f */
public final /* synthetic */ class RunnableC3871f implements Runnable {

    /* renamed from: a */
    private final Throwable f10698a;

    /* renamed from: b */
    private final String f10699b;

    static {
        Covode.recordClassIndex(4400);
    }

    RunnableC3871f(Throwable th, String str) {
        this.f10698a = th;
        this.f10699b = str;
    }

    public final void run() {
        C3868c.m9484a().mo7736a(this.f10698a, this.f10699b);
    }
}
