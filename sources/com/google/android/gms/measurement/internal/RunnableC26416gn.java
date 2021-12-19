package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.gn */
public final class RunnableC26416gn implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f62110a;

    /* renamed from: b */
    private final /* synthetic */ String f62111b;

    /* renamed from: c */
    private final /* synthetic */ long f62112c;

    /* renamed from: d */
    private final /* synthetic */ Bundle f62113d;

    /* renamed from: e */
    private final /* synthetic */ boolean f62114e;

    /* renamed from: f */
    private final /* synthetic */ boolean f62115f;

    /* renamed from: g */
    private final /* synthetic */ boolean f62116g;

    /* renamed from: h */
    private final /* synthetic */ String f62117h = null;

    /* renamed from: i */
    private final /* synthetic */ C26413gk f62118i;

    static {
        Covode.recordClassIndex(31838);
    }

    public final void run() {
        this.f62118i.mo43304a(this.f62110a, this.f62111b, this.f62112c, this.f62113d, this.f62114e, this.f62115f, this.f62116g, this.f62117h);
    }

    RunnableC26416gn(C26413gk gkVar, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3) {
        this.f62118i = gkVar;
        this.f62110a = str;
        this.f62111b = str2;
        this.f62112c = j;
        this.f62113d = bundle;
        this.f62114e = z;
        this.f62115f = z2;
        this.f62116g = z3;
    }
}
