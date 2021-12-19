package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.internal.C25565r;
import java.lang.Thread;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.ez */
public final class C26374ez implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private final String f61976a;

    /* renamed from: b */
    private final /* synthetic */ C26372ex f61977b;

    static {
        Covode.recordClassIndex(31796);
    }

    public C26374ez(C26372ex exVar, String str) {
        this.f61977b = exVar;
        C25565r.m49314a((Object) str);
        this.f61976a = str;
    }

    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        MethodCollector.m26663i(6195);
        this.f61977b.mo43016q().f61827c.mo43170a(this.f61976a, th);
        MethodCollector.m26664o(6195);
    }
}
