package com.google.p1970ar.core;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.ar.core.d */
final class RunnableC27095d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AtomicBoolean f64112a;

    /* renamed from: b */
    final /* synthetic */ RunnableC27096e f64113b;

    static {
        Covode.recordClassIndex(32647);
    }

    RunnableC27095d(RunnableC27096e eVar, AtomicBoolean atomicBoolean) {
        this.f64113b = eVar;
        this.f64112a = atomicBoolean;
    }

    public final void run() {
        if (!this.f64112a.getAndSet(true)) {
            RunnableC27096e eVar = this.f64113b;
            C27088ak.m53851a(eVar.f64114a, eVar.f64115b);
        }
    }
}
