package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.hs */
public final class RunnableC26448hs implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C26443hn f62211a;

    /* renamed from: b */
    private final /* synthetic */ C26443hn f62212b;

    /* renamed from: c */
    private final /* synthetic */ long f62213c;

    /* renamed from: d */
    private final /* synthetic */ boolean f62214d;

    /* renamed from: e */
    private final /* synthetic */ C26446hq f62215e;

    static {
        Covode.recordClassIndex(31870);
    }

    public final void run() {
        this.f62215e.mo43375a((C26446hq) this.f62211a, this.f62212b, (C26443hn) this.f62213c, (long) this.f62214d, (boolean) ((Bundle) null));
    }

    RunnableC26448hs(C26446hq hqVar, C26443hn hnVar, C26443hn hnVar2, long j, boolean z) {
        this.f62215e = hqVar;
        this.f62211a = hnVar;
        this.f62212b = hnVar2;
        this.f62213c = j;
        this.f62214d = z;
    }
}
