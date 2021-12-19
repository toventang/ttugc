package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicReference;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.gx */
public final class RunnableC26426gx implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f62143a;

    /* renamed from: b */
    private final /* synthetic */ String f62144b;

    /* renamed from: c */
    private final /* synthetic */ String f62145c;

    /* renamed from: d */
    private final /* synthetic */ String f62146d;

    /* renamed from: e */
    private final /* synthetic */ boolean f62147e;

    /* renamed from: f */
    private final /* synthetic */ C26413gk f62148f;

    static {
        Covode.recordClassIndex(31848);
    }

    public final void run() {
        this.f62148f.f62077z.mo43260i().mo43400a(this.f62143a, this.f62144b, this.f62145c, this.f62146d, this.f62147e);
    }

    RunnableC26426gx(C26413gk gkVar, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.f62148f = gkVar;
        this.f62143a = atomicReference;
        this.f62144b = str;
        this.f62145c = str2;
        this.f62146d = str3;
        this.f62147e = z;
    }
}
