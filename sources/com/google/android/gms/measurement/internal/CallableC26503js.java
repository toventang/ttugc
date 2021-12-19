package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.js */
public final class CallableC26503js implements Callable<String> {

    /* renamed from: a */
    private final /* synthetic */ zzn f62387a;

    /* renamed from: b */
    private final /* synthetic */ C26498jo f62388b;

    static {
        Covode.recordClassIndex(31925);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() {
        C26351ec c = this.f62388b.mo43474c(this.f62387a);
        if (c != null) {
            return c.mo43129c();
        }
        this.f62388b.mo43016q().f61830f.mo43169a("App info was null when attempting to get app instance id");
        return null;
    }

    CallableC26503js(C26498jo joVar, zzn zzn) {
        this.f62388b = joVar;
        this.f62387a = zzn;
    }
}
