package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.measurement.internal.ht */
final class RunnableC26449ht implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C26443hn f62216a;

    /* renamed from: b */
    private final /* synthetic */ long f62217b;

    /* renamed from: c */
    private final /* synthetic */ C26446hq f62218c;

    static {
        Covode.recordClassIndex(31871);
    }

    public final void run() {
        this.f62218c.mo43376a(this.f62216a, false, this.f62217b);
        this.f62218c.f62200c = null;
        this.f62218c.mo43006g().mo43394a((C26443hn) null);
    }

    RunnableC26449ht(C26446hq hqVar, C26443hn hnVar, long j) {
        this.f62218c = hqVar;
        this.f62216a = hnVar;
        this.f62217b = j;
    }
}
