package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicReference;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.gu */
public final class RunnableC26423gu implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f62134a;

    /* renamed from: b */
    private final /* synthetic */ String f62135b;

    /* renamed from: c */
    private final /* synthetic */ String f62136c;

    /* renamed from: d */
    private final /* synthetic */ String f62137d;

    /* renamed from: e */
    private final /* synthetic */ C26413gk f62138e;

    static {
        Covode.recordClassIndex(31845);
    }

    public final void run() {
        this.f62138e.f62077z.mo43260i().mo43399a(this.f62134a, this.f62135b, this.f62136c, this.f62137d);
    }

    RunnableC26423gu(C26413gk gkVar, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f62138e = gkVar;
        this.f62134a = atomicReference;
        this.f62135b = str;
        this.f62136c = str2;
        this.f62137d = str3;
    }
}
