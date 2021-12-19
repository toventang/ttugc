package com.google.android.gms.common.api.internal;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.common.api.internal.cq */
final class RunnableC25436cq implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C25433cn f60360a;

    static {
        Covode.recordClassIndex(30835);
    }

    public final void run() {
        this.f60360a.f60351g.lock();
        try {
            C25433cn.m49014a(this.f60360a);
        } finally {
            this.f60360a.f60351g.unlock();
        }
    }

    RunnableC25436cq(C25433cn cnVar) {
        this.f60360a = cnVar;
    }
}
